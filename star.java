public class star
{
public static void main(String [] args)
{
int i,j;
System.out.println("Enter the layer of triangle"+ args[0]);
int n = Integer.parseInt(args[0]);
for(i=0;i<=n;i++)
{
for(j=0;j<=n-i;j++)
{
System.out.print(" ");
}
for (int k = 0; k <= i; k++) {
System.out.print(" * ");
}
System.out.println();
}
}
}
