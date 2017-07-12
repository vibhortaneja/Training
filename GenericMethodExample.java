import java.util.HashMap;
import java.util.Map;

public class GenericMethodExample<T,U>{
	
	public<T,U> void assignCar(T t, U u){
		Map<T,U> map = new HashMap<T,U>();
		map.put(t, u);
		System.out.println(map);
	}
}
