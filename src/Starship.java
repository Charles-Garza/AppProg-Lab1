/*
 * Author: Charles Garza / ewn133
 */
public class Starship 
{
	/*
	 * Declares all variables
	 */
	String name;
	String registry;
	String shipClass;
	int index = 0;
	CrewMember memberList[] = new CrewMember[10]; 
	
	/*
	 * Creates the constructor to assign the values passed in from the other class
	 */
	public Starship(String name, String registry, String shipClass)
	{
		this.name = name;
		this.registry = registry;
		this.shipClass = shipClass;
	}
	
	/*
	 * Adds a new member to the CrewMember arraylist
	 */
	public void addCrewMember(CrewMember member)
	{
		memberList[index] = member;
		index = index + 1;
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
	public void setRegistry(String registry)
	{
		this.registry = registry;
	}
	public String getRegisty()
	{
		return registry;
	}
	public void setShipClass(String shipClass)
	{
		this.shipClass = shipClass;
	}
	public String getShipClass()
	{
		return shipClass;
	}
	
	/* 
	 * Returns the name of the Starship and the members on that Starship
	 */
	public String toString()
	{
		String str = "";
		//This for each loop walks through each crew member in the CrewMember list
		for(int i = 0; i < index; i++)
		{
			str = str + memberList[i] + "\n";
		}
		return "\n" + name + "(" + registry + ")" + "\n\n[Class: " + shipClass + "]\n" + str;
	}
}
