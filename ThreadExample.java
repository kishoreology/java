public class ThreadExample extends Thread {
public void run() {

for (int i = 0; i < 3; i++) {
try {
sleep ((int) (Math.random() * 5000)); // 5 secs
}
catch (InterruptedException e) {
System.out.println (i);
}
}
}
public static void main(String[] args) {
new ThreadExample() .start();
new ThreadExample() .start();
System.out.println ("Done");
}
}
