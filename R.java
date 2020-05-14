public class R extends Thread {
  Semaforo sem1;
  Semaforo sem2;
  Semaforo sem3;
  Semaforo sem4;

  public R(Semaforo s1, Semaforo s2, Semaforo s3, Semaforo s4) {
    sem1 = s1;
    sem2 = s2;
    sem3 = s3;
    sem4 = s4;
  }

  @Override
  public void run() {
    sem1.P();
    System.out.println("O");
    sem2.V();
    sem4.P();
    System.out.println("E");
    sem4.V();
  }
}
