public class Myclass implements MyInterface{
public void MyMethod(String val){
System.out.println("Value"+val);
}
public static void main(String[] args)
{
Myclass classIns = new MyClass();
MyInterface inte = new Myclass();
Myclass2 class2 = new Myclass2();
classIns.MyMethod("Class value");
inte.MyMethod("Interface Value");
inte = class2;
inte.MyMethod("Test");
}