package I_O;

/*1. 스트림 ( Stream )
스트림이란 프로그램과 I/O 객체를 연결하여 데이터를 송수신 하는 길을 말합니다.
InputStream은 데이터를 읽어 들이는 객체이고, OutputStream은 데이터를 써서 보내는 객체입니다.

데이터를 어떤 방식으로 전달하느냐에 따라 스트림은 두가지로 나뉩니다.

바이트 스트림( Byte Stream )
binary 데이터를 입출력하는 스트림입니다.
이미지, 동영상 등을 송수신할 때 주로 사용합니다.

문자 스트림( Character Stream )
말 그대로 text 데이터를 입출력하는데 사용하는 스트림입니다.
HTML 문서, 텍스트 파일을 송수신할 때 주로 사용합니다.


자바에서는 스트림과 관련하여 추상 클래스를 지원하고 있습니다.

바이트 스트림
InputStream / OutputStream
byte 기반 input / output stream의 최고 조상
ByteArrayInputStream / ByteArrayOutputStream
byte array( byte[] )에 대한 데이터를 입출력 하는 클래스
FileInputStream / FileOutputStream
파일( File )에 대한 데이터를 입출력 하는 클래스

문자 스트림
Reader / Writer
Character 기반 input / output stream의 최고 조상
FileReader / FileWriter
문자 기반의 파일을 입출력 하는 클래스


2. 보조 스트림
보조 스트림이란 "프로그램에서" 파일을 읽기/쓰기 할 수 있도록 해주며, 위에서 소개한 클래스들은 주 스트림으로써 "외부에서" 파일 읽기/쓰기를 수행합니다.

다음 클래스들은 보조 스트림의 종류들입니다.

FilterInputStream / FilterOutputStream
byte 기반 보조 스트림의 최고 조상
BufferedInputStream / BufferedOutputStream
입출력 효율을 높이기 위해 버퍼( byte[] )를 사용하는 보조스트림
BufferedReader / BufferedWriter
입출력 효율을 높이기 위해 버퍼( char[] )를 사용하는 보조스트림
라인 단위의 입출력에 용이
InputStreamReader / OutputStreamReader
byte 기반 스트림을 character 기반 스트림처럼 쓸 수 있도록 함
인코딩 변환 가능*/

public class Stream0 {
}
