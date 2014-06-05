/**
 * One object of class VideoGame stores the information of 
 * one video game. One video game consists of the information 
 * of the video game title, format, location, and notes
 * @author JessicaPak
 *
 */
public class VideoGame extends Media{
	private String videoGameTitle;

	
	/**
	 * default constructor
	 */
	public VideoGame(){
		super();
	}
	/**
	 * parameterized constructor
	 */
	public VideoGame(String newVideoGameTitle, String newVideoGameFormat,
			String newVideoGameLocation, String newVideoGameNotes){
		super();
	}
	/**
	 * returns the current value of videoGameTitle
	 */
	public String getVideoGameTitle(){
		return videoGameTitle;
	}
	
	/**
	 * sets the value of videoGameTitle to newVideoGameTitle
	 * @param newVideoGameTitle
	 */
	public void setVideoGameTitle(String newVideoGameTitle){
		videoGameTitle = "Video Game Title";
	}

	/**
	 * Returns a String containing all the data stored 
	 * in this object.
	 */
	public String toString(){
		return super.toString() + "\n" + this.getVideoGameTitle();
	}
}
