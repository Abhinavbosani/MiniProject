package wipro;


class Author {
	private String name, email;
	private char gender;
	
	Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
		
	}
	
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public char getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "[Name: " + name + ", Email: " + email + ", Gender: " + gender + "]";
	}

}

class Book{
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	Book(String name, Author author, double price, int qtyInStock){
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}

	public Author getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	@Override
	public String toString() {
		return "Book Name: " + name + "\nAuthor: " + author + "\nPrice: " + price + "\nQtyInStock: " + qtyInStock;
	}

}

public class Question3{

	public static void main(String[] args) {
		Author author = new Author("Abhinav", "abhi@gmail.com", 'M');
		Book book = new Book("Java Fundamentals", author, 200, 500);
		
		System.out.println(book);
	}

}
