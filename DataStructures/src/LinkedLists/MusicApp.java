package LinkedLists;

class Song { 
    String title; 
    Song next; 
 
    Song(String title) { 
        this.title = title; 
        this.next = null; 
    } 
} 
 
class Playlist { 
    private Song head; 
 
    public void addSong(String title) { 
        Song newSong = new Song(title); 
        if (head == null) { 
            head = newSong; 
        } else { 
            Song current = head; 
            while (current.next != null) 
                current = current.next; 
            current.next = newSong; 
        } 
    } 
 
    public void removeSong(String title) { 
        if (head == null) return; 
 
        if (head.title.equals(title)) { 
            head = head.next; 
            return; 
        } 
 
        Song current = head; 
        while (current.next != null && !current.next.title.equals(title)) { 
            current = current.next; 
        } 
 
        if (current.next != null) { 
            current.next = current.next.next; 
        } 
    } 
 
    public void printPlaylist() { 
        Song current = head; 
        System.out.println("Playlist:"); 
        while (current != null) { 
            System.out.println("- " + current.title); 
            current = current.next; 
        } 
    } 
}

public class MusicApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Playlist playlist = new Playlist(); 
	        playlist.addSong("Believer"); 
	        playlist.addSong("Counting Stars"); 
	        playlist.addSong("Thunder"); 
	        playlist.printPlaylist(); 
	 
	        playlist.removeSong("Counting Stars"); 
	        System.out.println("\nAfter removing a song:"); 
	        playlist.printPlaylist();
		

	}

}
