public class Main {
    public static void main(String[] args) {
        SayHelloTask sayHelloTask = new SayHelloTask();
        Thread tread = new Thread(sayHelloTask);
        tread.start();
        //tread.start();
        tread.run();
        tread.run();
        tread.run();
    }
}
