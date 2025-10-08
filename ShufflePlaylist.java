import java.util.Scanner;
import java.util.Random;

public class ShufflePlaylist {
    public static Scanner scanner = new Scanner(System.in);

    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
    public static void main(String[] args){
        String[] Playlist = {
                "Shake It Off – Taylor Swift",
                "I Love You – Barney",
                "Baby Shark – Pinkfong",
                "Never Gonna Give You Up – Rick Astley",
                "Axel F (Crazy Frog) – Crazy Frog",
                "Gangnam Style – PSY",
                "What Does the Fox Say? – Ylvis"
        };

        shuffle(Playlist);
        System.out.println("Shuffled Playlist: ");
        for (String song : Playlist){
            System.out.println(song);
        }
    }
    public static void shuffle(String[] Playlist){
        for (int i = 0; i<Playlist.length; i++){
            int k = (int)(Math.random()*(i+1));
            String temporary = Playlist[i];
            Playlist[i]=Playlist[k];
            Playlist[k]=temporary;

        }
    }
}