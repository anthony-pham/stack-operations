/**
 * @author Anthony Pham
 * @version 2/26/14
 *
 * Stack is can hold a wide variety of data. Can add, delete, or modify data from one end only.
 */
public class Stack<E> {

	private LinkedList<E> itemList;
	
	/**
	 * default-constructor Linked-List based
	 */
	public Stack()
	{
		itemList = new LinkedList<E>();
	}
	
	/**
	 * @return number of elements in stack
	 */
	public int size()
	{
		return itemList.getLength();
	}
	
	/**
	 * @return true if the stack is empty, false if not
	 */
	public boolean isEmpty()
	{
		return (size() == 0);
	}
	
	/**
	 * insert info to top of stack
	 */
	public void push(E newItem)
	{
		itemList.insertAtHead(newItem);
	}
	
	/**
	 * retrieve and remove info from top of stack
	 */
	public E pop()
	{
		return itemList.removeHead();
	}
	
	/**
	 * retrieve info from top of stack
	 */
	public E top()
	{
		return itemList.getData(0);
	}
}