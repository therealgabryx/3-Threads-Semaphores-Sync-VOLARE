public class Q extends Thread {
  Semaforo sem1;
  Semaforo sem2;
  Semaforo sem3;
  Semaforo sem4;

  public Q(Semaforo s1, Semaforo s2, Semaforo s3, Semaforo s4) {
    sem1 = s1;
    sem2 = s2;
    sem3 = s3;
    sem4 = s4;
  }

  @Override
  public void run() {
    sem3.P();
    System.out.println("A");
    System.out.println("R");
    sem4.V();
  }
}
