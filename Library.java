package week2HomeAssignment;

public class Library {

	public String addBook (String bookTitle)
	{
		System.out.println(bookTitle + " Book added Successfully");
		return bookTitle;
	}
	public void issueBook()
	{
		System.out.println("Book Issued Successfully");
	}
	
	
	public static void main(String[] args) 
	{
		Library lib=new Library();
		lib.addBook("Sidney Sheldon");
		lib.issueBook();

	}

}
