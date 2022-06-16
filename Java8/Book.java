package mypack166;

public class Book {

	private Integer id;
	private String name;
	private String author;
	private double cost;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Book(Integer id, String name, String author, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", cost=" + cost + "]";
	}
	 
	
	
}
