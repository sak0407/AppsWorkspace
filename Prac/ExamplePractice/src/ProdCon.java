import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;



	
	class Producer implements Runnable{
		
		private BlockingQueue<String> queue;
		
		public Producer(BlockingQueue<String> queue) {
			
			this.queue=queue;
		}

		@Override
		public void run() {
			
			try {
			for(int i=0;i<10;i++) {
				queue.put(produce());
				
				Thread.sleep(500);
			}
			queue.add("-1");
			}catch(InterruptedException ex) {
				ex.printStackTrace();
			}
			
			
		}

		private String produce() {
			Integer number=new Integer((int) (Math.random()*2));
			if(number==1) {
				return "true";
			}else {
				return "false";
			}
			
		}
		
		
		
	}
	
	class Consumer implements Runnable{
		
		private BlockingQueue<String> queue;
		
		public Consumer(BlockingQueue<String> queue) {
			
			this.queue=queue;
		}

		@Override
		public void run() {
			
			try {
			while(true) {
				
				String str=queue.poll(2,TimeUnit.SECONDS);
				
				if(str.equals("-1") || str.equals(null)) {
					break;
				}
				
				consume(str);
				Thread.sleep(500);
				
			}
			
		
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

		private void consume(String str) {
			System.out.println("Consume ");
			
		}
		
	}
	
	
	
	public class ProdCon {	
	public static void main(String[] args) {
		BlockingQueue bq=new ArrayBlockingQueue<>(20);
		
		Thread th1=new Thread(new Producer(bq));
		th1.start();
		Consumer cm= new Consumer(bq);
		
		if(cm.equals("True")) {
			Thread th2=new Thread(cm);
			th2.start();
		}else if(cm.equals("False")) {
			Thread th3=new Thread(cm);
			th3.start();
		}
		
		
		
	}
	
}
