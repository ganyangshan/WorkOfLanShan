package work4.task1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //连接本机的6666端口，InetAddress.getLocalHost()获取本机的地址
        Socket socket = new Socket(InetAddress.getLocalHost(),6666);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("客户端发给服务端的请求".getBytes());
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        byte []buf = new byte[1024];
        int len = 0;
        while ((len=inputStream.read(buf))!=-1){
            System.out.println(new String(buf,0,len));
        }

        inputStream.close();
        socket.close();
        outputStream.close();
    }
}
