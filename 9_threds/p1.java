class myThread extends Thread{
    public void run(){
        for (int i = 0 ; i <10 ; i++){
            System.out.println("Child Thread");
        }
    }
}


public class p1 {

     public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.start();
        for(int i = 0 ; i < 10 ; i++){
            System.out.println("Main thread ");
        }
     }
}