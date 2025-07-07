package tcpServer;


public class ThreadOrnekRunnable implements Runnable {

    public static void main(String[] args) {
       ThreadOrnekRunnable nesne1 = new ThreadOrnekRunnable();
       Thread t1 = new Thread(nesne1);
       t1.start();
       
       Thread t2 = new Thread(new ThreadOrnekRunnable()); //ayrı bir nesne tanımlamadan direk parametre olarak nesne türetilebilir
       t2.start();
    }

    @Override
    public void run() {
         for (int i = 0; i < 10; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + " calisiyor.i:" + i);
                int bekle = (int) (Math.random() * 1000);
                Thread.sleep(bekle); 
            } catch (InterruptedException ex) {
                System.out.println("Thread hatasi" + ex);
            }
        }
    }
}
