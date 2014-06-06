/**
 * One object of class Media stores a list of the various
 * media types.
 * @author JessicaPak
 *
 */
public class Media {
	private String format;
	private String location;
	private String notes;
	/**
	 * default constructor
	 */
	public Media(){
		format = "Format";
		location = "Location";
		notes = "Notes";
	}
	/**
	 * parameterized constructor
	 * @param newFormat
	 * @param newLocation
	 * @param newNotes
	 */
	public Media(String newFormat, 
			String newLocation, String newNotes){
		
	}
	/**
	 * returns the current value of bookFormat
	 */
	public String getFormat(){
		return format;
	}
	/**
	 * returns the current value of bookLocation
	 */
	public String getLocation(){
		return location;
	}
	/**
	 * returns the current value of bookNotes
	 */
	public String getNotes(){
		return notes;
	}
	/**
	 * sets the value of bookFormat to newBookFormat
	 * @param newBookFormat
	 */
	public void setFormat(String newBookFormat){
		format = "Format";
	}
	/**
	 * sets the value of bookLocation to newBookLocation
	 * @param newBookLocation
	 */
	public void setLocation(String newBookLocation){
		location = "Location";
	}
	/**
	 * sets the value of bookNotes to newBookNotes
	 * @param newBookNotes
	 */
	public void setNotes(String newBookNotes){
		notes = "Notes";
	}
	/**
	 * Returns a String containing all the data stored 
	 * in this object.
	 */
	public String toString(){
		return this.getFormat() + "\n" + this.getLocation()
				+ "\n" + this.getNotes() + "\n";
	}
}
