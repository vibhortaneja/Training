public class StringBuilderDemo {

   public static void main(String[] args) {
  
      StringBuilder str = new StringBuilder("salsa");
      //String s = new String("vibs");
      System.out.println("string = " + str);
   
      str.append("panner");
      str.toString();
      System.out.println("After append = " + str);
      
      //s.intern();
      
   }
} 
