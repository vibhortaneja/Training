
public class compare {
public static void main(String[] args){
	String str= new String("abc");
	String str1= new String("abc");
	String str2=str;
	//if(str==str1);
	{
		System.out.println(str==str1);//false
		System.out.println(str.equals(str1));//true
		System.out.println(str==str2);//true
		System.out.println(str.equals(str2));//true
	}
}

}
