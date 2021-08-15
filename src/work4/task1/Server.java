package work4.task1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端开始监听.....");
        ServerSocket serverSocket = new ServerSocket(6666);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte [] buf = new byte[1024];
        int len = 0;
        while ((len = inputStream.read(buf))!=-1){
            System.out.println(new String(buf,0,len));
        }
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("服务端发给客户端的响应".getBytes());
        socket.shutdownOutput();
        inputStream.close();
        socket.close();
        serverSocket.close();
        outputStream.close();

    }


}
