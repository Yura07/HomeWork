package threds;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyThread th1 = new MyThread();
        th1.start();

//        Thread th2 = new Thread(new RunnableTheard());
//        th2.start();
    }

    public void fibonachi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int num = sc.nextInt();
        int n0 = 1, n1 = 1, n2;
        System.out.print("Thread: " + n0 + " " + n1 + " ");
        for (int i = 3; i <= num; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
    }

//    public void reFibonachi(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n");
//        int num = sc.nextInt();
//        int n0 = 1, n1 = 1, n2;
//        for (int i = num; i <= 3; i--){
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            n2 = n0 + n1;
//            System.out.print("Runnable: " + n0 + " " + n1 + " ");
//            System.out.print(n2 + " ");
//            n0 = n1;
//            n1 = n2;
//        }
//    }

}
class MyThread extends Thread{
    @Override
    public void run() {
        new Main().fibonachi();
    }
}

//class RunnableTheard implements Runnable{
//    @Override
//    public void run() {
//        new Main().reFibonachi();
//    }
//
//}
