package hilos;

public class HiloR implements Runnable{
  public void run() {
    for(int i=0;i<10;i++){
      System.out.println("Iteración "+i+" del "+Thread.currentThread().getName());
    }
    System.out.println("Termina el hilo "+Thread.currentThread().getName());
  }
}