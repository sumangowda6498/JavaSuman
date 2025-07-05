package Lab_Programs;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class socClient {
    public static void main(String[] args)throws Exception
    {
        String ip="localhost";
        int port=8561;
        Socket s=new Socket(ip,port);

        String str="Suman";

        OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());
        PrintWriter out=new PrintWriter(os);
        os.write(str);
        os.flush();

    }
}
