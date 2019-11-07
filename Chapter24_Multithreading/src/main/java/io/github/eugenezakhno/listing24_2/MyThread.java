package io.github.eugenezakhno.listing24_2;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Поток " + getId() + " i=" + i +
                    " " + getName());
            try {
                Thread.sleep(1000); // Имитация выполнения задачи
            }
            catch (InterruptedException e) {
                System.out.println("Выход. Поток " + getId());
                return;
            }
        }
    }
}
