class NewThread implements Runnable {
    String name;
    Thread t;

    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread ; " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name +"interupted ");
        }
		System.out.println(name +"exiting");
    }
}

public class p4{
	public static void main(String [] args){
		NewThread ob1 = new NewThread("One");
		NewThread ob2 = new NewThread("Two");
		NewThread ob3 = new NewThread("Three");
        System.out.println("Thread one is Alive; "+ob1.t.isAlive());
        System.out.println("Thread two is Alive; "+ob2.t.isAlive());
        System.out.println("Thread three is Alive; "+ob3.t.isAlive());
        try{
            System.out.println("Waiting for threads to finish.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }
        catch(InterruptedException e ){
            System.out.println("main thread interupted");
        }
        System.out.println("Thread one is Alive; "+ob1.t.isAlive());
        System.out.println("Thread two is Alive; "+ob2.t.isAlive());
        System.out.println("Thread three is Alive; "+ob3.t.isAlive());		
        System.out.println("Main thread is exiting");
	}

}