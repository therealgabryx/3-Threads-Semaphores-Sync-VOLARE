class Main {
  public static void main(String[] args) {
    Semaforo sem1 = new Semaforo(0);
    Semaforo sem2 = new Semaforo(0);
    Semaforo sem3 = new Semaforo(0);
    Semaforo sem4 = new Semaforo(0);

    Thread P = new P(sem1, sem2, sem3, sem4);
    Thread Q = new Q(sem1, sem2, sem3, sem4);
    Thread R = new R(sem1, sem2, sem3, sem4);

    P.start();
    Q.start();
    R.start();
  }
}
