import java.util.*;

public class Cow implements Milkable,Alive {

	private String name; 
	private double capacity; 
	private double milkAmount; 
	
	private static final String [] NAMES = new String[] {
		
			"Anu", "Arpa", "Essi", "Heluna", "Hely",
	        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
	        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
	        "Mainikki", "Mella", "Mimmi", "Naatti",
	        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
	        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
	
	public Cow() {
		
		this(NAMES[new Random().nextInt(NAMES.length-1)]);
	}
	
	public Cow(String name) {
		
		this.name = name;
		Random rand = new Random();
		int rando = rand.nextInt(40) + 15;
		this.capacity = rando;
		this.milkAmount = 0;
	}
	
	String getName() {
		
		return this.name;
	}
	
	double getCapacity() {
		
		return this.capacity;
	}
	
	double getAmount() {
		
		return this.milkAmount;
	}
	
	public double milk() {
		
		double milked = this.milkAmount;
		
		this.milkAmount = 0;
		
		return milked;
	}
	
	public void liveHour() {
	
		Random rand = new Random();
		double milkAmount = rand.nextDouble()*1.3 + 0.7;
		
		if (milkAmount + this.milkAmount > capacity) {
			
			milkAmount = this.capacity;
		}else {
			
			this.milkAmount = this.milkAmount + milkAmount;
		}
	}
	
	public String toString() {
		
		return this.name + " " + this.milkAmount + "/" + this.capacity;
	}
}