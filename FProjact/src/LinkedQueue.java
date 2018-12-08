import java.util.Collection;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Queue;

public class LinkedQueue<T> implements Queue<T> {
	
		   private int count;
		   private LinearNode<T> front, rear;

		   //-----------------------------------------------------------------
		   //  Creates an empty queue.
		   //-----------------------------------------------------------------
		   public LinkedQueue()
		   {
		      count = 0;
		      front = rear = null;
		   }

		   //-----------------------------------------------------------------
		   //  Adds the specified element to the rear of the queue.
		   //-----------------------------------------------------------------
		   public void enqueue (T element)
		   {
		      LinearNode<T> node = new LinearNode<T>(element);

		      if(count == 0)
		    	  front = node;
		      else 
		    	  rear.setNext(node);
		      rear = node;
		      count++;
		   }

		   //-----------------------------------------------------------------
		   //  Removes the element at the front of the queue and returns a
		   //  reference to it. Throws an EmptyCollectionException if the
		   //  queue is empty.
		   //-----------------------------------------------------------------
		   public T dequeue() throws EmptyStackException
		   {
		       //added try catch here
			   if (isEmpty())
				try {
					throw new Exception ("queue");
				} catch (Exception e) {
					
					e.printStackTrace();
				}
		      //end try catch...

		      T result = front.getElement();
		      front = front.getNext();
		      count--;

		      if (isEmpty())
		         rear = null;

		      return result;
		   }
		   
		   //-----------------------------------------------------------------
		   //  Returns a reference to the element at the front of the queue.
		   //  The element is not removed from the queue.  Throws an
		   //  EmptyCollectionException if the queue is empty.  
		   //-----------------------------------------------------------------
		   public T first() throws EmptyStackException
		   {
		      if (isEmpty())
		         throw new EmptyStackException (); 

		      return front.getElement();
		   }

		   //-----------------------------------------------------------------
		   //  Returns true if this queue is empty and false otherwise. 
		   //-----------------------------------------------------------------
		   public boolean isEmpty()
		   {
		      return (count == 0);
		   }
		 
		   //-----------------------------------------------------------------
		   //  Returns the number of elements currently in this queue.
		   //-----------------------------------------------------------------
		   public int size()
		   {
		      return count;
		   }

		   //-----------------------------------------------------------------
		   //  Returns a string representation of this queue. 
		   //-----------------------------------------------------------------
		   public String toString()
		   {
		      String result = "";
		      LinearNode<T> current = front;

		      while (current != null)
		      {
		         result = result + (current.getElement()).toString() + "\n";
		         current = current.getNext();
		      }

		      return result;
		   }
/////////////////// Unemployment methods for LinkQueeu<T> Please ignore from this point on! ///////////////////////////
		@Override
		public boolean addAll(Collection<? extends T> arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean contains(Object arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean containsAll(Collection<?> arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Iterator<T> iterator() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean remove(Object arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean removeAll(Collection<?> arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean retainAll(Collection<?> arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object[] toArray() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <T> T[] toArray(T[] arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean add(T arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public T element() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean offer(T arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public T peek() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public T poll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public T remove() {
			// TODO Auto-generated method stub
			return null;
		}
}



