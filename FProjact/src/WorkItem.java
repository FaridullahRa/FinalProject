
public class WorkItem {
	private int arrivalTime, departureTime;

	   //-----------------------------------------------------------------
	   //  Creates a new workItem with the specified arrival time.
	   //-----------------------------------------------------------------
	   public WorkItem (int arrives)
	   {
	      arrivalTime = arrives;
	      departureTime = 0;
	   }

	   //-----------------------------------------------------------------
	   //  Returns the arrival time of this workItem.
	   //-----------------------------------------------------------------
	   public int getArrivalTime()
	   {
	      return arrivalTime;
	   }

	   //-----------------------------------------------------------------
	   //  Sets the departure time for this workItem.
	   //-----------------------------------------------------------------
	   public void setDepartureTime (int departs)
	   {
	      departureTime = departs;
	   }
	   
	   //-----------------------------------------------------------------
	   //  Returns the departure time of this workItem.
	   //-----------------------------------------------------------------
	   public int getDepartureTime()
	   {
	      return departureTime;
	   }

	   //-----------------------------------------------------------------
	   //  Computes and returns the total time spent by this workItem.
	   //-----------------------------------------------------------------
	   public int totalTime()
	   {
	      return departureTime - arrivalTime;
	   }
}
