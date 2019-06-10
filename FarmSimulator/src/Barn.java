import java.util.*;
public class Barn {

	private BulkTank barnBulkTank;
	private MilkingRobot milkingRobot; 
	
	public Barn(BulkTank tank) {
	
		this.barnBulkTank = tank;
	}
	
	public BulkTank getBulkTank() {
		
		return this.barnBulkTank;
	}
	
	public void installMilkingRobot(MilkingRobot milkingRobot) {
		
		this.milkingRobot = milkingRobot; 
		
		this.milkingRobot.setBulkTank(this.barnBulkTank);
	}
	
	public void takeCareOf(Cow cow) {
		
		if(this.milkingRobot.equals(null)) {
			
			throw new IllegalStateException("Illegal State Exception");
		}
		
		this.milkingRobot.milk(cow);
	}
	
	public void takeCareOf(Collection <Cow> cows) {
		
		if (this.milkingRobot == null) {
			
			throw new IllegalStateException("Illegal State Exception");
		}
		
		for (Cow c : cows) {
			
			this.milkingRobot.milk(c);
		}
	}
	
	public String toString() {
		
		return this.barnBulkTank.toString();
	}
}