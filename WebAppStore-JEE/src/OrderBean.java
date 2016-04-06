import javax.faces.bean.ManagedBean;

@ManagedBean(name = "order")
public class OrderBean {
	
	//Customer Information
	private String custFirstName;
	private String custLastName;
	private String custEmail;
	private String custPhone;
	
	//Shipping Information
	private String shippingAddress;
	private String shippingCity;
	private String shippingCountry;
	private String shippingProvince;
	private String shippingPostalCode;
	
	//Payment Information
	private String paymentType;
	private long creditNumber;
	
	//Product Information
	private String productName;
	private float productPrice;
	private int productQuantity;
	
	
	//Customer Information Get and Sets
	public String GetCustFirstName(){
		return custFirstName;
	}
	public void SetCustFirstName (String newCustFirstName){
		custFirstName = newCustFirstName;
	}
	
	public String GetCustLastName(){
		return custLastName;
	}
	public void SetCustLastName (String newCustLastName){
		custLastName = newCustLastName;
	}
	
	public String GetCustEmail(){
		return custEmail;
	}
	public void SetCustEmail (String newCustEmail){
		custEmail = newCustEmail;
	}
	
	public String GetCustPhone(){
		return custPhone;
	}
	public void SetCustPhone (String newCustPhone){
		custPhone = newCustPhone;
	}
	
	
	//Shipping Information Get and Sets
	public String GetShippingAddress (){
		return shippingAddress;
	}
	public void SetShippingAddress (String newShippingAddress){
		shippingAddress = newShippingAddress;
	}
	
	public String GetShippingCity (){
		return shippingCity;
	}
	public void SetShippingCity (String newShippingCity){
		shippingCity = newShippingCity;
	}
	
	public String GetShippingCountry (){
		return shippingCountry;
	}
	public void SetShippingCountry (String newShippingCountry){
		shippingCountry = newShippingCountry;
	}
	
	public String GetShippingProvince (){
		return shippingProvince;
	}
	public void SetShippingProvince (String newShippingProvince){
		shippingProvince = newShippingProvince;
	}
	
	public String GetShippingPostalCode (){
		return shippingPostalCode;
	}
	public void SetShippingPostalCode (String newShippingPostalCode){
		shippingPostalCode = newShippingPostalCode;
	}
	
	
	//Payment Information Get and Sets
	public String GetPaymentType (){
		return paymentType;
	}
	public void SetpaymentType (String newPaymentType){
		paymentType = newPaymentType;
	}
	
	public long GetCreditNumber (){
		return creditNumber;
	}
	public void SetCreditNumber (long newCreditNumber){
		creditNumber = newCreditNumber;
	}
	
	
	//Product Information Get and Sets
	public String GetProductName (){
		return productName;
	}
	public void SetProductName (String newProductName){
		productName = newProductName;
	}
	
	public float GetProductPrice (){
		return productPrice;
	}
	public void SetProductPrice (float newProductPrice){
		productPrice = newProductPrice;
	}
	
	public int GetProductQuantity (){
		return productQuantity;
	}
	public void SetProductQuantity (int newProductQuantity){
		productQuantity = newProductQuantity;
	}
}
