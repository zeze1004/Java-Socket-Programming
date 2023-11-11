import java.net.*;
import java.io.*;
class MyClient{
	public static void main(String args[])throws Exception{
		Socket socket = new Socket("localhost",1004);
		DataInputStream din = new DataInputStream(socket.getInputStream());
		DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String client = "", server = "";
		while(!client.equals("stop")){
			client = br.readLine();
			dout.writeUTF(client);
			dout.flush();
			server = din.readUTF();
			System.out.println("Server says: "+ server);
		}

		dout.close();
		socket.close();
	}}