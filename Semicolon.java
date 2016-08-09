/**
 * @author Anthony Pham
 * @version 2/26/14
 *
 * This class represents the Semicolon Token
 */
public class Semicolon implements Token {

	String token;
	
	/**
	 * default constructor
	 */
	public Semicolon()
	{
		token = ";";
	}
	
	/**
	 * Handles the token based on the rules in the algorithm
	 * @return nextStep to append to postFix String
	 */
	public String handle(Stack<Token> myStack)
	{
		String nextStep;
		nextStep = "";
		
		while (!myStack.isEmpty())
		{
			nextStep += myStack.pop().toString();
		}
		
		return nextStep + "\n";
	}
	
	/**
	 * @return the Token as a printable String
	 */
	public String toString()
	{
		return token;
	}
}
