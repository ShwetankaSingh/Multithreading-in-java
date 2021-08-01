import java.io.*;
class Task1 extends Thread
{
   public void run()
   {
         for(int i=1;i<=10;i++)
         {	System.out.println(i*2);
            try{Thread.sleep(1000);} catch(Exception e){}
        }
   }	
}

class Task2 extends Thread
{
    public void run()
   {
         for(int i=11;i<=20;i++)
         	 {	System.out.println(i*2);
            try{Thread.sleep(1000);} catch(Exception e){}
        }
   }	
}
class Multithreading
{
	public static void main(String args[])
	{
        Task1 obj1=new Task1();
        Task2 obj2=new Task2();
        obj1.start();
        try{Thread.sleep(1000);} catch(Exception e){}
        obj2.start();
	}
}
