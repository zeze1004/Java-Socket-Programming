import java.net.*;
import java.io.*;
class MyServer{
	public static void main(String args[])throws Exception{
		ServerSocket serverSocket = new ServerSocket(1004);
		Socket socket = serverSocket.accept();
		DataInputStream din = new DataInputStream(socket.getInputStream());
		DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String client = "", server = "";
		while(!client.equals("stop")){
			client = din.readUTF();
			System.out.println("client says: "+ client);
			server=br.readLine();
			dout.writeUTF(server);
			dout.flush();
		}
		din.close();
		socket.close();
		serverSocket.close();
	}}