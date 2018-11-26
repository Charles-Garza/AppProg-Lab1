/*
 * Author: Charles Garza / ewn133
 */
public class CrewMember
{
	/* 
	 * Declares all variables
	 */
	String name;
	String position;
	
	/*
	 * Sets the constructor to assign the variables values
	 */
	public CrewMember(String name, String position)
	{
		this.name = name;
		this.position = position;
	}
	/*
	 * Sets a default constructor to assign the default values to null
	 */
	public CrewMember()
	{
		name = null;
		position = null;
	}
	/*
	 * Creates getters and setters for each variable assigned within this class
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setPosition(String position)
	{
		this.position = position;
	}
	public String getPosition()
	{
		return position;
	}
	/*
	 * Returns the name of each crew member
	 */
	public String toString()
	{
		return " - " + position + ": " + name + ".\n";
	}
}
