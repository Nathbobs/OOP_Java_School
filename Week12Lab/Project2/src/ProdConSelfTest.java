public class ProdConSelfTest {
	private Buffer buffer;
	private Producer producer;
	private Consumer consumer;

	public ProdConSelfTest() {
		Buffer buff = new Buffer(15);
		producer = new Producer(buff);
		consumer = new Consumer(buff);
		/* your code */
		/* your code */
		/* your code */
	}

	private class Producer /* your code */ extends Thread {
		private final Buffer buffer;

		public Producer(Buffer buffer) {
			this.buffer = buffer;
			/* your code */
		}

		public void produce() throws InterruptedException {
			for (int i = 0 ; i < buffer.getSize(); i++){
				buffer.add(Math.random()*100);
			}
			/* your code */
		}

		public void run() {
			try {
				produce();
				/* your code */
			} catch (InterruptedException e) {
				e.printStackTrace();
				/* your code */
			}
		}
	}

	private class Consumer /* your code */extends Thread{
		private final Buffer buffer;

		public Consumer(Buffer buffer) {
			this.buffer = buffer;
			/* your code */
		}

		public void consume() throws InterruptedException {
			for (int i = buffer.getSize(); i>=0 ; i--){
				buffer.remove();
			}
			/* your code */
		}

		public void run() {
			try {
				consume();
				/* your code */
			} catch (InterruptedException e) {
				e.printStackTrace();
				/* your code */
			}
		}
	}

	public void startThread() {
		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);

		producerThread.start();
		consumerThread.start();

		/* my code */
		/* my code */
	}
}

