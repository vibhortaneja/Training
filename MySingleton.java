
public class MySingleton {
public static MySingleton ins;
public static MySingleton getInstance(){
if(ins == null){
	ins = new MySingleton();
	}
return ins;
}
private MySingleton(){
	
}
}
