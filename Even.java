public class Even
{
public static void main(String args[])
{
int n;
int i;
System.out.println("Enter the Number" +args[0]);
n= Integer.parseInt(args[0]);
for(i=1; i<=n; i++)
{
if(i%2==0)
System.out.println("Even Number"+i);
}
}
}
