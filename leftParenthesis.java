/**
 * @author Anthony Pham
 * @version 2/23/14
 *
 * This class represents the Left Parenthesis Token
 */
public class leftParenthesis implements Token {

	private String token;
	
	/**
	 * default constructor
	 */
	public leftParenthesis()
	{
		token = "(";
	}
	
	
	/**
	 * Handles the token based on the rules in the algorithm
	 * @return nextStep to append to postFix String
	 */
	public String handle(Stack<Token> myStack)
	{
		Token newToken;
		newToken = new leftParenthesis();
		myStack.push(newToken);
		return "";
	}
	
	/**
	 * @return The Token as a printable String
	 */
	public String toString()
	{
		return token;
	}
}
