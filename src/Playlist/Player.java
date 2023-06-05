package Playlist;

public class Player {
    public static void main(String[] args) {
//        Playlist store1 = new Playlist(3);
//        Playlist store2 = new Playlist(3);
//
//        store1.playSong("S1","user 1");
//        store1.playSong("S2","user 1");
//        store1.playSong("S3","user 1");
//        store1.playSong("S4","user 1");

//        store2.playSong("S4","user 1");

         /*
          Test case1 :
          User plays song S2 from the list, playlist will display song sequence
          Expected o/p -  [S1, S3, S2]
          */
        Playlist store1 = new Playlist(3);

        store1.playSong("S1","user 1");
        store1.playSong("S2","user 1");
        store1.playSong("S3","user 1");
        store1.playSong("S2","user 1");



          /*
          Test case2 :
          User plays song S1 from the list, playlist will display song sequence
          Expected o/p - [S2, S3, S1]
          */
        //        Playlist store1 = new Playlist(3);
//
//        store1.playSong("S1","user 1");
//        store1.playSong("S2","user 1");
//        store1.playSong("S3","user 1");
//        store1.playSong("S1","user 1");



          /*
          Test case3 :
          User plays song S3 from the list, playlist will display song sequence
          Expected o/p - [S1, S2, S3]
        */
        //        Playlist store1 = new Playlist(3);
//
//        store1.playSong("S1","user 1");
//        store1.playSong("S2","user 1");
//        store1.playSong("S3","user 1");
//        store1.playSong("S3","user 1");



          /*
          Test case4 :
          User plays song S4 from the list, playlist will display song sequence
          Expected o/p - [S2, S3, S4]
          */
        //        Playlist store1 = new Playlist(3);
//
//        store1.playSong("S1","user 1");
//        store1.playSong("S2","user 1");
//        store1.playSong("S3","user 1");
//        store1.playSong("S4","user 1");







//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Song Name you want to play from the list - Song A, Song B, Song C ");
//        String a = sc.next();


        System.out.println(store1.getRecentlyPlayedSongs("user 1"));
//        System.out.println(store2.getRecentlyPlayedSongs("user 2"));





    }
}
