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



/*
OUTPUT


C:\Users\hp\Desktop\javas>javac Multithreading.java

C:\Users\hp\Desktop\javas>java Multithreading
2
4
22
24
6
8
26
28
10
12
30
32
14
34
16
36
18
38
20
40


*/
