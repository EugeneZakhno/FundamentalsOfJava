package io.github.eugenezakhno.listing24_3;

//Листинг 24.3. Метод join() - cмысл его в следующем: Одна нить ждет, пока полностью завершится работа второй нити.
public class MyClass {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());
        t.start();
        try {
            t.join();
        }
        catch (InterruptedException e) { }
        System.out.println("Выход. Поток " +
                Thread.currentThread().getName());
    }
}

