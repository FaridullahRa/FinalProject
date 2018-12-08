import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JList;
public class TicketCounter {
	final static int PROCESS = 120;
	   final static int MAX_WORKER = 10;
	   final static int NUM_WorkItem = 100;

	   public static void main ( String[] args) 
	   {
           WorkItem workItem;
	      LinkedQueue<WorkItem> customerQueue = new LinkedQueue<WorkItem>();
	      int[] workerTime = new int[MAX_WORKER];	
	      int totalTime, averageTime = 0, departs;//intilaized averageTime because of Jlist.

	      // process the simulation for various number of worker
	      for (int worker=0; worker < MAX_WORKER; worker++)
	      { 
	         // set each worker time to zero initially
	         for (int count=0; count < worker; count++)
	            workerTime[count] = 0;

	         // load workItem queue
	         for (int count=1; count <= NUM_WorkItem; count++)
	            customerQueue.enqueue(new WorkItem(count*15));

	         totalTime = 0;

	         // process all customers in the queue
	         while (!(customerQueue.isEmpty())) 
	         {
	            for (int count=0; count <= worker; count++)
	            {
	               if (!(customerQueue.isEmpty()))
	               {
	                  workItem = customerQueue.dequeue();
	                  if (workItem.getArrivalTime() > workerTime[count])
	                     departs = workItem.getArrivalTime() + PROCESS;
	                  else
	                     departs = workerTime[count] + PROCESS; 
	                  workItem.setDepartureTime (departs);
	                  workerTime[count] = departs;
	                  totalTime += workItem.totalTime();
	               }
	               }
	            }
	         

	         // output results for this simulation
	         averageTime = totalTime / NUM_WorkItem;
	         System.out.println();
	         System.out.println ("Worker Number:................{" + (worker+1)+"}");
	         System.out.println ("Average time for per workItem[" + averageTime + "]");
	      }
	  ////JFrame..
	         JFrame f = new JFrame("Summary of Queue !");
	         String[] data = {""," Number of worker: " + MAX_WORKER, "", " Average process time for per work Item in 'sec' : "
	         + averageTime," Average time for per item is depend on the number of workers. \n", " Every 15 sec one work item coming in to queue.", " " };
	         f.add(new JList(data));
	         f.pack();
	         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         f.setLocationRelativeTo(null);
	         f.setVisible(true);
	         ///end of JFram/JList
	        }
}
