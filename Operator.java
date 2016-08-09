/** Describes the methods that must be defined in order for an
 * object to be considered an Operator.  Every Operator must be able
 * to be get its Precedence.
 * 
 * @author Anthony Pham
 * @version 2/26/14
 *
 */
public interface Operator extends Token
{
	/**
	 * @return the Precedence value of the Operator
	 */
	public int getPrecedence();
}
