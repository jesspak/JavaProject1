/**
 * One object of class Video stores the information of one video.
 * One video consists of the information of the title,
 * star, format, location, and notes
 * @author JessicaPak
 *
 */
public class Video extends Media{
	private String videoTitle;
	private String videoStar;
	
	/**
	 * default constructor
	 */
	public Video(){
		super();
	}
	/**
	 * parameterized constructor
	 * @param newTitle
	 * @param newStar
	 * @param newFormat
	 * @param newLocation
	 * @param newNotes
	 */
	public Video(String newVideoTitle, String newVideoStar,
			String newVideoFormat, String newVideoLocation, String newVideoNotes){
		super();
	}
	/**
	 * returns the current value of videoTitle
	 */
	public String getVideoTitle(){
		return videoTitle;
	}
	/**
	 * returns the current value of videoStar
	 */
	public String getVideoStar(){
		return videoStar;
	}
	
	/**
	 * sets the value of videoTitle to newVideoTitle
	 * @param newVideoTitle
	 */
	public void setVideoTitle(String newVideoTitle){
		videoTitle = "Video Title";
	}
	/**
	 * sets the value of videoStar to newVideoStar
	 * @param newVideoStar
	 */
	public void setVideoStar(String newVideoStar){
		videoStar = "Video Star";
	}
	
	/**
	 * Returns a String containing all the data stored 
	 * in this object.
	 */
	public String toString(){
		return this.getVideoTitle() + "\n" + this.getVideoStar() + "\n" + super.toString();
	}	
}

