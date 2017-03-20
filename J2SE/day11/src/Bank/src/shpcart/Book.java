package shpcart;

public class Book {
	
	private String name;
	private String author;
	private String desc;
	private double price;
	private double quantity;
	
	
	public Book(String name, String author, String desc, double price,
			double quantity) {
		super();
		this.name = name;
		this.author = author;
		this.desc = desc;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString()
	{
		return " book[NAME= "+name+" AUTHOR= "+author+" DESCRIPTION= "+desc+" PRICE= "+price+" QUANTITY AVAILABLE= "+quantity+" ] ";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
}
