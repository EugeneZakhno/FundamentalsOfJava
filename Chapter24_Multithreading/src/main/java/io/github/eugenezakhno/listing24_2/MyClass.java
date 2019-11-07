package io.github.eugenezakhno.listing24_2;

public class MyClass {
    public static void main(String[] args) {
        MyThread[] arr = new MyThread[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = new MyThread();
            arr[i].start();
        }
        for (int i = 0; i < 4; i++) {
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {}
            arr[i].interrupt();  // Посылаем сигнал
        }
    }
}
