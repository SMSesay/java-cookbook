package name;

/**
 * An interface for a class of names
 * 
 * @author smartin
 *
 */
public interface NameInterface {
	
	/**
	 * Sets the first and last names
	 * @param firtname a string that is the desired first name
	 * @param lastName a string that is the desired last name
	 */
	public void setName(String firtname, String lastName);
	
	/**
	 * Gets the full name
	 * @return a string containing the first and last names
	 */
	public String getName();
	
	/**
	 * Sets the first name
	 * @param firstName a string that is the desired first name
	 */
	public void setFirst(String firstName);
	
	/**
	 * Gets the first name
	 * @return a string containing the first name
	 */
	public String getFirst();
	
	/**
	 * Sets the last name
	 * @param lastName
	 */
	public void setLast(String lastName);
	
	/**
	 * Gets the last name
	 * @return a string containing the last name
	 */
	public String getLast();
	
	/**
	 * Gives last Name to a NameInterface object
	 * @param aName a NameInterface object 
	 */
	public void giveLastNameTo(NameInterface aName);
	
	/**
	 * Displays the Name objects
	 * @return a string that displays the NameInterface object
	 */
	public String toString();

}
