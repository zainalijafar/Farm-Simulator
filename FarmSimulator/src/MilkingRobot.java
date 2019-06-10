public class MilkingRobot {

	private BulkTank bulkTank;
	
	public MilkingRobot() {
	}
	
	BulkTank getBulkTank() {
		
		return this.bulkTank;
	}
	
	void setBulkTank(BulkTank tank) {
		
		this.bulkTank = tank;
	}
	
	void milk(Milkable milkable) {
		
		if (this.bulkTank == null) {
			
			throw new IllegalStateException("The robot has not been installed");
		}else {
			
			this.bulkTank.addToTank(milkable.milk());
		}
	}
}