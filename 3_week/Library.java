
import java.util.Scanner;

class Book {
	private String name;
	private String author;
	private double price;
	private int pages;

	public Book(String name, String author, double price, int pages) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.pages = pages;
	}

	public String getName() {
		return this.name;
	}

	public String getAuthor() {
		return this.author;
	}

	public double getPrice() {
		return this.price;
	}

	public double getPages() {
		return this.pages;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Name =" + this.name +
				"\nAuthor =" + this.author +
				"\nprice =" + this.price +
				"\npages =" + this.pages;
	}

}

public class Library {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter no of Books ");
		int noBooks = input.nextInt();
		input.nextLine();
		for (int i = 0; i < noBooks; i++) {

			System.out.println("Book :" + (i + 1));
			String name;
			String author;
			double price;
			int pages;

			System.out.print("Book Name :");
			name = input.nextLine();
			System.out.print("Author Name :");
			author = input.nextLine();
			System.out.print("Book Price :");
			price = input.nextDouble();
			System.out.print("Book Pages :");
			pages = input.nextInt();

			Book book = new Book(name, author, price, pages);
			System.out.println();
			System.out.println(book);
			System.out.println();
			input.nextLine();

		}
		System.out.println("B.RAJA SIMHA REDDY");
		System.out.println("1BM23CS070");

	}
}