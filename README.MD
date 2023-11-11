### Socket Programming Chatting Program

`ServerSocket` 클래스를 사용하여, 서버 소켓과 클라이언트간의 소켓 채팅  프로그램을 구현함.
 - `MyServer.java`
   - 서버 생성:     `ServerSocket serverSocket = new ServerSocket(1004);`
   - 클라이언트 요청을 받아들임: `Socket socket = serverSocket.accept();`
 - `MyClient.java`
   - 클라이언트의 소켓 서버 접근: `Socket socket = new Socket("localhost",1004);`
   - client가 `stop`을 입력하기 전까지 각 인스턴스는 문자를 입출력함