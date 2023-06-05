package Playlist;

public class Player {
    public static void main(String[] args) {
        Playlist store1 = new Playlist(3);

        // Play initial songs to add in recently played playlist
        store1.playSong("S1","user 1");
        store1.playSong("S2","user 1");
        store1.playSong("S3","user 1");

        // Recently played playlist
        System.out.println("Recently played playlist --> " );
        System.out.println(store1.getRecentlyPlayedSongs("user 1"));


         /*
          Test case1 :
          User plays song S2 from the list, playlist will display song sequence
          Expected o/p -  [S1, S3, S2]
          */
        store1.playSong("S2","user 1");
        System.out.println("Recently Played Playlist After Playing S2: " );
        System.out.println(store1.getRecentlyPlayedSongs("user 1"));



          /*
          Test case2 :
          User plays song S1 from the list, playlist will display song sequence
          Expected o/p - [S3, S2, S1]
          */
        store1.playSong("S1","user 1");
        System.out.println("Recently Played Playlist After Playing S1: " );
        System.out.println(store1.getRecentlyPlayedSongs("user 1"));



          /*
          Test case3 :
          User plays song S3 from the list, playlist will display song sequence
          Expected o/p - [S2, S1, S3]
        */
        store1.playSong("S3","user 1");
        System.out.println("Recently Played Playlist After Playing S3: " );
        System.out.println(store1.getRecentlyPlayedSongs("user 1"));


          /*
          Test case4 :
          User plays song S4 from the list, playlist will display song sequence
          Expected o/p - [S1, S3, S4]
          */
        store1.playSong("S4","user 1");
        System.out.println("Recently Played Playlist After Playing S4: " );
        System.out.println(store1.getRecentlyPlayedSongs("user 1"));

    }
}
