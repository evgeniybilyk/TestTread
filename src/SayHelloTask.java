class SayHelloTask  implements Runnable {
    @Override
    public void run() {
        System.out.println("THREAD: " + Thread.currentThread().getName());
    }
}
