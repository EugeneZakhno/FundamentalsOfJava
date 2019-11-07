package io.github.eugenezakhno.listing24_1;

class MyThread implements Runnable {
    private int id;
    MyThread(int id) {
        this.id = id;
    }
    private int getId() {
        return id;
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Поток " + getId() + " i = " + i +
                    " " + Thread.currentThread().getName() +
                    " " + Thread.currentThread().getId());
            try {
                Thread.sleep(1000); // Имитация выполнения задачи
            }
            catch (InterruptedException e) {}
        }
    }
}
