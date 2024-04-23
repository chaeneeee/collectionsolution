public class ThreadExample {
    public static void main(String[] args) {

        Runnable task1 = new ThreadTask1();
        Runnable task2 = new ThreadTask2();


        task1.start();
    }
}

//
////class ThreedTask1 implements  Runnable {
////    public void run() {
//    }
//}