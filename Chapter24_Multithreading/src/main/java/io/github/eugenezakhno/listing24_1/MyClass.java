package io.github.eugenezakhno.listing24_1;
//Листинг 24.1. Создание потока
//create a thread
public class MyClass {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            new Thread(new MyThread(i)).start();
        }
    }
}
