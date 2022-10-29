public class BicycleRegistration
{
	public static void main (String[] args){
		Bicycle bike, bike1, bike2, bike3;
		String owner1, owner2, owner3;
		String tag;
		
		bike = new Bicycle();
		bike.setTagNo("2004-134R");
		tag = bike.getTagNo();
		
		bike1 = new Bicycle();
		bike1.setOwnerName("Adam Smith");
		
		bike2 = new Bicycle();
		bike2.setOwnerName("Ben Jones");
		bike2.setTagNo("2231");
		String tagNo = bike2.getTagNo();
		
		bike3 = new Bicycle("Anthony Salloman", "Bipsu-0974");
		
		owner1 = bike1.getOwnerName();
		owner2 = bike2.getOwnerName();
		owner3 = bike3.getOwnerName();
		
		System.out.println(owner1 + " owns a bicycle.");
		System.out.println(owner2 + " also owns a bicycle with tag #: " + tagNo);
		System.out.println(owner3 + " owns a bicycle");
		System.out.println(tag + " is the Tag number of bike.");	
			
	}
}
