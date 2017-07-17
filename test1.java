class Outer
{
 int count;
 public void display()
 {
  Inner in=new Inner();
  in.show();
 }

 class Inner
 {
  public void show()
  {
   System.out.println("Inside inner ");
  } 
 }
}

class test1
{
 public static void main(String[] args)
 {
  Outer ot=new Outer();
  Outer.Inner in= ot.new Inner();
  in.show();
 }
}