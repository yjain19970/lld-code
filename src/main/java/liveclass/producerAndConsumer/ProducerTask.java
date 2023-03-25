package liveclass.producerAndConsumer;

import java.util.Queue;

public class ProducerTask implements Runnable {
    private Queue<Object> q;
    private int maxSize;
    private String name;

    public ProducerTask(Queue<Object> q, int maxSize, String name) {
     this.q = q;
     this.maxSize = maxSize;
     this.name = name;
    }

    @Override
    public void run() {

        while(true){
            synchronized (q){
                if(q.size() < maxSize){
                    System.out.println("Name of the task:" + name + " adding inside the queue, before size"+ q.size());
                    q.add(new Object());
                }
            }
        }
    }
}
