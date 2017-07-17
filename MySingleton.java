public class MySingleton{
public static MySingleton myInstance(){
	MySingleton instance = null;
	if (instance == null) {
		instance = new MySingleton();
	}
	return instance;
}
private MySingleton(){
}
public String teststring(){
	return "MySingleton instance used";
}
}