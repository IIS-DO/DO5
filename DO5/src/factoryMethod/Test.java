package factoryMethod;

public class Test {

	public static void main(String[] args) {
		BillFactory billFactory = new BillFactory();
		Bill electricityBill = billFactory.createBill("electricity");
		Bill gasBill = billFactory.createBill("gas");
		
		electricityBill.calculateTotal();

	}

}
