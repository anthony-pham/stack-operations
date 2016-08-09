/**
 * @author Anthony Pham
 * @version 2/26/14
 *
 * This class represents the Exponent Operation
 */
public class Exponent implements Token,Operator {

	private int precedence;
	private String token;
	
	private final int PRECEDENCE_VALUE = 3;
	
	/**
	 * default constructor
	 */
	public Exponent()
	{
		precedence = PRECEDENCE_VALUE;
		token = "^";
		
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
		newToken = new Exponent();
		
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
	 * @return the Token as a printable String
	 */
	public String toString()
	{
		return token;
	}
	
	/**
	 * @return the Precedence value of the Operator
	 */
	public int getPrecedence()
	{
		return precedence;
	}
}
