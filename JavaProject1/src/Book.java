/**
 * One object of class Book stores the information of one Book.
 * One book consists of the information of the author,
 * title, format, location, and notes
 * @author JessicaPak
 *
 */
public class Book extends Media {

	private String bookAuthor; 
	private String bookTitle;
	/**
	 * default constructor
	 */
	public Book(){
		super();
	}
	/**
	 * parameterized constructor
	 * @param author
	 * @param title
	 * @param format
	 * @param location
	 * @param notes
	 */
	public Book(String newBookAuthor, String newBookTitle, 
			String newBookFormat, String newBookLocation, String newBookNotes){
		super();
	}
	/**
	 * returns the current value of bookAuthor
	 */
	public String getBookAuthor(){
		return bookAuthor;
	}
	/**
	 * returns the current value of bookTitle
	 */
	public String getBookTitle(){
		return bookTitle;
	}	
	/**
	 * sets the value of bookAuthor to newBookAuthor
	 * @param newBookAuthor
	 */
	public void setBookAuthor(String newBookAuthor){
		bookAuthor = "Book Author";
	}
	/**
	 * sets the value of bookTitle to newBookTitle
	 * @param newBookTitle
	 */
	public void setBookTitle(String newBookTitle){
		bookTitle = "Book Title";
	}
	
	/**
	 * Returns a String containing all the data stored 
	 * in this object.
	 */
	public String toString(){
		return this.getBookAuthor() + "\n"
				+ this.getBookTitle() + "\n" + super.toString();
	}
	
}
