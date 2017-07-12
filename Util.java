import java.io.IOException;

public class Util {

	public boolean checkEven(int a) throws NullPointerException{
		if(a==0){
			throw new NullPointerException();
		}
		if(a%2==0){
			return true;
		}
		else
			return false;
	}
	
	public int sum(int a,int b){
		return a+b;
		
	}
	public String getMessage(){
		
		return System.out.toString();
	}
}
