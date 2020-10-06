package cse360assignment02;

/**
 * The AddingMachine program adds and subtracts from the total, keeping track of the
 * history of operations.
 * 
 * @author	Adriana Bustillos
 * @version	2.0
 * @since	2020-10-5
 */
public class AddingMachine {
  private int total;
  private String memory;
  
  /**
   * This is the constructor of a new AddingMachine
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    memory = ""; //Initializes the memory value
  }
  
  /**
   * This method returns the total
   * 
   * @return	the current total
   */
  public int getTotal () {
    return total;
  }
  
  /**
   * This method adds the value to the current total and updates memory
   * 
   * @param		the integer that is to be added to the total
   */
  public void add (int value) {
	  if(memory == "")
	  {
		  memory = total + " + " + value;
		  total = total + value;
	  }
	  else
	  {
		  total = total + value;
		  memory = memory + " + " + value;
	  }
  }
  
  /**
   * This method subtracts the value from the current total and updates memory
   * 
   * @param		the integer that is to be subtracted from the total
   */
  public void subtract (int value) {
	  if(memory == "")
	  {
		  memory = total + " - " + value;
		  total = total - value;
	  }
	  else
	  {
		  total = total - value;
		  memory = memory + " - " + value;
	  }
  }
  
  /**
   * This method retains the history of transactions
   * 
   * @return	the string of operations
   */
  public String toString () {
    return memory;
  }
  
  /**
   * This method clears the memory
   */
  public void clear() {
	  memory = "";
  }
}
