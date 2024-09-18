import java.util.Scanner; 
class HelloWorld {
   
   public static void a()
   {
       System.out.println("Enter a number to print table");
       Scanner sc= new Scanner(System.in);
       int a=sc.nextInt();
       for(int i=1;i<=10;i++)
       {
           System.out.println(a+"*"+i+"="+a*i);
       }
       System.out.println("a");
   }
   public static void b()
   {
       System.out.println("b");
   }
   public static void c()
   {
       System.out.println("c");
   }
   public static void main(String args[])
   {
       c();
       a();
       b();
     //  c();
       
   }
}