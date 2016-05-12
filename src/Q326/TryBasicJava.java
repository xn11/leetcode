import java.util.HashSet;
import java.util.Set;

public class TryBasicJava {
	public static int i = 0;

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		boolean isDuplicate = set.add("sss");
		
		
		MyThread t = new MyThread(1);
		t.start();
		t = new MyThread(2);
		t.start();
		t = new MyThread(3);
		t.start();
	}

}

class MyThread extends Thread{
	int n = 0;
	public MyThread(int n){
		super();
		this.n = n;
	}
	public void run(){
		for(int i = 0; i < 100; i++){
			System.out.println(i + " | " + n + " is " + ++TryBasicJava.i);
		}
	}
}
