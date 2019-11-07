package io.github.eugenezakhno.listing24_3;

class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i=" + i +
                    " Поток " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

