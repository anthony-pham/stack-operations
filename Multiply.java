/**
 * @author Anthony Pham
 * @version 2/26/14
 *
 * This class represents the Multiply Operation
 */
public class Multiply implements Token,Operator {

	private int precedence;
	private String token;
	
	private final int PRECEDENCE_VALUE = 2;
	
	/**
	 * default constructor
	 */
	public Multiply()
	{
		precedence = PRECEDENCE_VALUE;
		token = "*";
		
	}
	
	
	/**
	 * Handles the token based on the rules in the algorithm
	 * @return nextStep to append to postFix String
	 */
	public String handle(Stack<Token> myStack)
	{
		String nextStep;
		nextStep = "";
		
		Token newToken;
		newToken = new Multiply();
		
		boolean checkCondition;
		checkCondition = true;
		
		while (checkCondition)
		{
			Token topToken;
			topToken = myStack.top();
			
			if (myStack.isEmpty())
			{
				checkCondition = false;
			}
			
			else if (topToken instanceof leftParenthesis)
			{
				checkCondition = false;
			}
			
			else if (topToken instanceof Operator)
			{
				Operator opToken;
				opToken = (Operator) topToken;
				if (opToken.getPrecedence() < this.getPrecedence())
				{
					checkCondition = false;
				}
				
				else
				{
					nextStep += myStack.pop();
				}
			}	
		}
		myStack.push(newToken);
		return nextStep;
	}
	
	/**
	 * @return The Token as a printable String
	 */
	public String toString()
	{
		return token;
	}
	
	/**
	 * @return The Precedence value of the Operator
	 */
	public int getPrecedence()
	{
		return precedence;
	}
}
