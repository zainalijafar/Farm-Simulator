import java.util.*;
public class Farm implements Alive {

	private String owner; 
	private Barn farmersBarn; 
	private List<Cow> cows;
	
	public Farm(String owner,Barn farmersBulk) {
		
		this.owner = owner;
		this.farmersBarn = farmersBulk;
		this.cows = new ArrayList<>();
	}
	
	public void addCow(Cow cow) {
		
		this.cows.add(cow);
	}
	
	public String getOwner() {
		
		return this.owner;
	}
	
	public void installMilkingRobot(MilkingRobot milkingRobot) {
		
		this.farmersBarn.installMilkingRobot(milkingRobot);
	}
	
	public void liveHour() {
		
		for (Cow cow : this.cows) {
			
			cow.liveHour();
		}
	}
	
	public void manageCows() {
		
		this.farmersBarn.takeCareOf(this.cows);
	}

	public String toString() {
		
		String output = "Farm Owner " + ":" + this.owner + "\n" + "Barn bulk tank: " + 
		
				this.farmersBarn.toString() + "\n" + "Animals :" + "\n" ;
		
		for (Cow cow : this.cows) {
			
			output = output + cow.toString();
			output = output + "\n";
		}
		return output;
	}
}