package assign5;

public class Customer {
	private String custNo;
	private String custName;
	private String category;
	public Customer(String custNo, String custName, String category) throws InvalidInputException {
		super();
		if (( custNo.startsWith("c")||custNo.startsWith("C") )&&custName.length()>=4 &&(category.equals("Platinum")||category.equals("Gold")||category.equals("Silver")))
		{
			this.custNo = custNo;
		
		this.custName = custName;
		this.category = category;
		}
		else
		{
			throw new InvalidInputException("Enter Valid Detais");
		}
	}
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}


}
