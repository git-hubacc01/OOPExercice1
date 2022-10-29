public class Bicycle
{
	private String ownerName;
	private String tagNo;
	private String id;
	
	public Bicycle(){
		ownerName = "Unknown";	
		tagNo = "Unknown";
	}
	
	public Bicycle(String name, String ids){
		this.id=ids;
		this.ownerName=name;
	}
    public String getOwnerName(){
		return ownerName;
	}
	public String getTagNo(){
		return tagNo;
	}

	public void setOwnerName(String name) {
		ownerName = name;
	}
	public void setTagNo(String number) {
		tagNo = number;
	}
}
