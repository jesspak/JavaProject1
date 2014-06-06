/**
 * One object of class Song stores the information of one song.
 * One song consists of the information of the artist,
 * song title, genre, format, location, and notes
 * @author JessicaPak
 *
 */
public class Song extends Media{
	private String songArtist;
	private String songTitle;
	private String songGenre;
	
	/**
	 * default constructor
	 */
	public Song(){
		super();
	}
	/**
	 * parameterized constructor
	 */
	public Song(String newSongArtist, String newSongTitle, String newSongGenre,
			String newSongFormat, String newSongLocation, String newSongNotes){
		super();
	}
	/**
	 * returns the current value of songArtist
	 */
	public String getSongArtist(){
		return songArtist;
	}
	/**
	 * returns the current value of songTitle
	 */
	public String getSongTitle(){
		return songTitle;
	}
	/**
	 * returns the current value of sonGenre
	 */
	public String getSongGenre(){
		return songGenre;
	}
	
	/**
	 * sets the value of songArtist to newSongArtist
	 * @param newSongArtist
	 */
	public void setSongArtist(String newSongArtist){
		songArtist = "Song Artist";
	}
	/**
	 * sets the value of songTitle to newSongTitle
	 * @param newSongTitle
	 */
	public void setSongTitle(String newSongTitle){
		songTitle = "Song Title";
	}
	/**
	 * sets the value of songGenre to newSongGenre
	 * @param newSongGenre
	 */
	public void setSongGenre(String newSongGenre){
		songGenre = "Song Genre";
	}
	/**
	 * Returns a String containing all the data stored 
	 * in this object.
	 */
	public String toString(){
		return this.getSongArtist() + "\n" + this.getSongTitle() + "\n"
				+ this.getSongGenre() + "\n" + super.toString();
	}
}
