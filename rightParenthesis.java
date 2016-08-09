/**
 * @author Anthony Pham
 * @version 2/26/14
 *
 * This class represents the Right Parenthesis Token
 */
public class rightParenthesis implements Token {

	String token;
	
	/**
	 * default constructor
	 */
	public rightParenthesis()
	{
		token = ")";
	}
	
	/**
	 * Handles the token based on the rules in the algorithm
	 * @return nextStep to append to postFix String
	 */
	public String handle(Stack<Token> myStack)
	{
		String nextStep;
		nextStep = "";
		
		while (!(myStack.top() instanceof leftParenthesis) && !myStack.isEmpty())
		{
			nextStep += myStack.pop().toString();
		}
		myStack.pop();
		
		return nextStep;
	}
	
	/**
	 * @return The Token as a Printable String
	 */
	public String toString()
	{
		return token;
	}
}
