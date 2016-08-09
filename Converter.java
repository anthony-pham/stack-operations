/**
 * @author Anthony Pham
 * @version 2/26/14
 * 
 * This class performs the Infix to Postfix Conversion
 */
public class Converter {

	private Stack<Token> myStack;
	private FileReader myReader;
	
	/**
	 * default constructor
	 */
	public Converter()
	{
		myStack = new Stack<Token>();
		myReader = new FileReader("/Volumes/PHAMA/csc150/workspace/Pham - Project 6/input.txt");
	}
	
	/**
	 * Performs the Infix to Postfix Algorithm
	 * @return postFix converted infix
	 */
	public String convert()
	{
		String postFix;
		postFix = "";
		
		String nextToken;
		nextToken = myReader.nextToken();
		
		while (!nextToken.equals("EOF"))
		{
			Token newToken;
			
			if (nextToken.equals("+"))
			{
				newToken = new Plus();
				postFix += newToken.handle(myStack);
			}
			
			else if (nextToken.equals("-"))
			{
				newToken = new Minus();
				postFix += newToken.handle(myStack);
			}
			
			else if (nextToken.equals("*"))
			{
				newToken = new Multiply();
				postFix += newToken.handle(myStack);
			}
			
			else if (nextToken.equals("/"))
			{
				newToken = new Divide();
				postFix += newToken.handle(myStack);
			}
			
			else if (nextToken.equals("^"))
			{
				newToken = new Exponent();
				postFix += newToken.handle(myStack);
			}
			
			else if (nextToken.equals("("))
			{
				newToken = new leftParenthesis();
				postFix += newToken.handle(myStack);
			}
			
			else if (nextToken.equals(")"))
			{
				newToken = new rightParenthesis();
				postFix += newToken.handle(myStack);
			}
			
			else if (nextToken.equals(";"))
			{
				newToken = new Semicolon();
				postFix += newToken.handle(myStack);
			}
			
			else
			{
				postFix += nextToken;
			}
			
			nextToken = myReader.nextToken();
		}
		return postFix;
	}
}
