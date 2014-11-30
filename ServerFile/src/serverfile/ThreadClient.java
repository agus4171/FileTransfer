/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverfile;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import objectfile.ObjectFile;

/**
 *
 * @author MAgus
 */
public class ThreadClient implements Runnable {
    private Socket socketClient;
    private ArrayList<ThreadClient> allThread;
    private SocketAddress sa = null;   
    private ObjectOutputStream ous = null;
    private ObjectInputStream ois = null;
    private String nama = null;
    private String fnama = null;
    private DataInputStream diStream = null;
    private DataOutputStream doStream = null;
    private File fileLoc = null;
    public int BUFFER_SIZE = 1024;
    private ArrayList<String> lUser;
    private ArrayList<String> lFile;
    private String path = ".";
    private String files;
    
    public ThreadClient(Socket socketClient, ArrayList<ThreadClient> allThread)
    {
        this.socketClient = socketClient;
        this.allThread = allThread;
        this.sa = socketClient.getRemoteSocketAddress();
        this.lUser = new ArrayList<>();
        this.lFile = new ArrayList<>();
    }
    
    @Override
    public void run()
    {
        try {
            ous  = new ObjectOutputStream(socketClient.getOutputStream());
            ois = new ObjectInputStream(socketClient.getInputStream());
            ObjectFile objf = new ObjectFile();
            try {
                while((objf = (ObjectFile) ois.readObject()) != null)
                {
                    if(objf.getCommand().equals("connect"))
                    {
                        this.nama = objf.getUser();
                        
                        new File("F:/cache/"+this.nama).mkdirs();
                        System.out.println("User masuk : "+this.nama);
                    }
                    
                    else if(objf.getCommand().equals("kirim"))
                    {
                        System.out.println("Menulis file");
                        this.fnama = objf.getNama();
                        File file = new File("F:/cache/" + this.nama +"/"+ objf.getNama());
                        doStream = new DataOutputStream(new FileOutputStream(file));
                        doStream.write(objf.getIsi());
                        System.out.println("File tertulis :"+this.fnama);
                    }
                    
                    else if(objf.getCommand().equals("listUser"))
                    {
                        lUser.clear();
                        for (int i = 0; i < this.allThread.size(); i++) {
                            lUser.add(allThread.get(i).nama);
                            System.out.println("user"+lUser.get(i));
                        }
                        send(lUser);
                    }
                    
                    else if(objf.getCommand().equals("listFile"))
                    {
                        lFile.clear();
                        File folder = new File("F:/cache/" + this.nama);
                        File[] listOFiles = folder.listFiles();
                        for (int i = 0; i < listOFiles.length; i++) {
                            if(listOFiles[i].isFile())
                                    {
                                        files = listOFiles[i].getName();
                                        System.out.println(files);
                                        lFile.add(files);
                                    }
                        }
                        send(lFile);
                    }
                    
                    else if(objf.getCommand().equals("download"))
                    {
                        this.fnama = objf.getNama();
                        File file = new File("F:/cache/" + this.nama +"/"+ fnama);
                        byte[] bytef = new byte[(int)file.length()];
                        DataInputStream diStream = new DataInputStream(new FileInputStream(file));
                        diStream.read(bytef);
                        objf.setIsi(bytef);
                        send(objf);
                    }
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ThreadClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            getSockClient().close();
            synchronized(this.allThread)
            {
                this.allThread.remove(this);
            }
        } catch (IOException ex) {
            Logger.getLogger(ThreadClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void send(Object file) throws IOException
    {
        this.ous.writeObject(file);
        this.ous.flush();
        this.ous.reset();
    }
    
    public synchronized void sendMessage(ObjectFile file) throws IOException
    {
        for(int i=0;i<this.allThread.size();i++)
        {
            ThreadClient tc = this.allThread.get(i);
            tc.send(file);
        }
    }

    /**
     * @return the sockClient
     */
    public Socket getSockClient() {
        return socketClient;
    }

    /**
     * @param sockClient the sockClient to set
     */
    public void setSocketClient(Socket sockClient) {
        this.socketClient = sockClient;
    }
    
}
