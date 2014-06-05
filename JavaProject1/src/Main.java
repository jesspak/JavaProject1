/**
 * 
 * @author JessicaPak
 *
 */
public class Main {
	public static void main (String [] args){
		
		Media newMedia = new Media();
		newMedia.setFormat(" ");
		newMedia.setLocation(" ");
		newMedia.setNotes(" ");
		
		Book newBook = new Book();
		newBook.setBookAuthor(" ");
		newBook.setBookTitle(" ");
		System.out.println(newBook);
		
		Song newSong = new Song();
		newSong.setSongArtist(" ");
		newSong.setSongTitle(" ");
		newSong.setSongGenre(" ");
		System.out.println(newSong);
		
		Video newVideo = new Video();
		newVideo.setVideoTitle(" ");
		newVideo.setVideoStar(" ");
		System.out.println(newVideo);
		
		VideoGame newVideoGame = new VideoGame();
		newVideoGame.setVideoGameTitle(" ");
		System.out.println(newVideoGame);
		
	}
}
