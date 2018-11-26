/*
 * Author: Charles Garza / ewn133
 */
public class Fleet 
{
	/* 
	 * Declares all variables
	 */
	String fleetInfo;
	int index = 0;
	Starship shipList[] = new Starship[3];
	
	public static void main( String[] args ) 
	{ 
		Fleet federation = new Fleet( "United Federation of Planets" ); 
		Starship enterpriseA = new Starship( "USS Enterprise", "NCC-1701-A", "Constitution" ); 
		Starship enterpriseB = new Starship( "USS Enterprise", "NCC-1701-B", "Voyager" ); 
		Starship enterpriseD = new Starship( "USS Enterprise", "NCC-1701-D", "Galaxy" );

		CrewMember jamesKirk = new CrewMember( "James T. Kirk", "Commanding Officer" ); 
		CrewMember spock = new CrewMember( "Spock", "First Officer" ); 
		CrewMember leonardMcCoy = new CrewMember( "Leonard McCoy", "Chief Medical Officer" ); 
		CrewMember montgomeryScott = new CrewMember( "Montgomery Scott", "Chief Engineering Officer" ); 
		CrewMember jeanLucPicard = new CrewMember( "Jean-Luc Picard", "Commanding Officer" ); 
		CrewMember williamRiker = new CrewMember( "William T. Riker", "First Officer" ); 
		CrewMember beverlyCrusher = new CrewMember( "Beverly Crusher", "Chief Medical Officer" ); 
		CrewMember geordiLaForge = new CrewMember( "Geordi La Forge", "Chief Engineering Officer" ); 

		enterpriseA.addCrewMember( jamesKirk ); 
		enterpriseA.addCrewMember( spock ); 
		enterpriseA.addCrewMember( leonardMcCoy ); 
		enterpriseA.addCrewMember( montgomeryScott ); 
		
		enterpriseD.addCrewMember( jeanLucPicard ); 
		enterpriseD.addCrewMember( williamRiker ); 
		enterpriseD.addCrewMember( beverlyCrusher ); 
		enterpriseD.addCrewMember( geordiLaForge );
		
		enterpriseB.addCrewMember( jamesKirk ); 
		enterpriseB.addCrewMember( spock ); 
		enterpriseB.addCrewMember( leonardMcCoy ); 
		enterpriseB.addCrewMember( montgomeryScott ); 

		federation.addStarship( enterpriseA ); 
		federation.addStarship( enterpriseB );
		federation.addStarship( enterpriseD );

		System.out.println( federation ); 
	}
	
	/*
	 * Creates the constructor to capture the name of the fleet
	 */
	public Fleet(String fleetName)
	{
		fleetInfo = fleetName;
	}
	/*
	 * Adds a new starship to the current list of ships
	 */
	public void addStarship(Starship s)
	{
		shipList[index] = s;
		index = index + 1;
	}
	/*
	 * Creates getters and setters for each variable assigned within this class
	 */
	public void setFleetName(String fleetName)
	{
		fleetInfo = fleetName;
	}
	public String getFleetName()
	{
		return fleetInfo;
	}
	/*
	 * Returns the name of the fleet and the Starship and the members on that Starship
	 */
	public String toString()
	{
		String str = "";
		//This for each loop walks through each ship in the starship list
		for(int i = 0; i < index; i++)
		{
			if(i != index - 1)
			{
				str = str + shipList[i] + "\n" + 
						"- - - - - - - - - - - - - - - - - - - - - - - -";
			}
			else
			{
				str = str + shipList[i] + "\n";
			}
		}
		return "----------------------------\n" + fleetInfo + "\n----------------------------\n" + str;
	}
}
