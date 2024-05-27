public class A extends Threads {
 public void run() {
	String n = Thread.currentThread().getName();
	for(int i =0 ;i <= 5; i++) {
		System.out.println(n);
		}
	}
}
public class B {
	public static void main(String[]args) {
		A t1 = new A("thread1");
		A t2 = new A("thread1");
		A t3 = new A("thread1");
		t1.start();
		t2.start();
		t3.start();
	}
}