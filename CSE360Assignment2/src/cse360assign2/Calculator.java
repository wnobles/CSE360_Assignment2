/**
 * This class performs simple mathematical calculations.
 * 
 * @author - Will G. Nobles
 * Class ID - 511
 */

package cse360assign2;

public class Calculator {
	private int total;
	String history;

	/**
	 * Creates a calculator with an initial total of 0
	 */
	public Calculator() {
		total = 0; // not needed - included for clarity
		history = "";
	}

	/**
	 * Returns the total calculated
	 * @return total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * Adds a value to the total
	 * @param value
	 */
	public void add(int value) {
		history += " + " + value;
		total += value;
	}

	/**
	 * Subtracts a value from the total
	 * @param value
	 */
	public void subtract(int value) {
		history += " - " + value;
		total -= value;
	}

	/**
	 * Multiplies the total by a value
	 * @param value
	 */
	public void multiply(int value) {
		history += " * " + value;
		total *= value;
	}

	/**
	 * Divides the total by a value
	 * @param value
	 */
	public void divide(int value) {
		history += " / " + value;
		
		if (value == 0) {
			total = 0;
		}
		else {
			total /= value;
		}
	}

	/**
	 * Returns all calculations completed
	 * @return
	 */
	public String getHistory() {
		return total + history;
	}
}
