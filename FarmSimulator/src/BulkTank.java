public class BulkTank {

	private double capacity;
	private double volume; 
	
	public BulkTank() {	
		this(2000);
	}
	
	public BulkTank(double capacity) {
		
		this.capacity = capacity;
	}
	
	public double getCapacity() {
		
		return this.capacity;
	}
	
	public double howMuchFreeSpace() {
		
		return this.capacity - this.volume;
	}
	
	public void addToTank(double amount) {
		
		if (amount>capacity) {
			
			amount = this.capacity;
		}
		
		this.volume = this.volume + amount;
	}
	
	public double getFromTank(double amount) {
		
		if(amount>this.volume) {
			
			return 0;
		}else {
			
			this.volume = this.volume - amount;
			
			return this.volume;
		}
	}
	
	public String toString() {
		
		return this.volume + "/" + this.capacity;
	}
}