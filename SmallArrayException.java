import java.io.IOException;

public class SmallArrayException extends RuntimeException {
public String getMessage(){
		
		return System.out.toString();
	}

public void getException()throws IOException{
	throw new IOException();
}
}