package Playlist;

import org.w3c.dom.Node;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class Playlist {
    private Song head;
    private Song tail;
    private HashMap<String, LinkedList<Song>> playlist;
    private Integer capacity;
    private Integer currentSize;
    public Playlist(int capacity){
        this.capacity=capacity;
        this.currentSize=0;
        this.playlist = new HashMap<>();
        this.head=null;
        this.tail=null;

    }
    public void playSong(String song, String user){

        if(playlist.containsKey(user)){
            removeSong(song,user);
        }
        Song newNode=new Song(song,user);
        if(currentSize>=capacity){
            removeLeastRecentlyPlayedSong();
        }
        if(head==null){
            head=newNode;
            tail=newNode;


        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        playlist.computeIfAbsent(user, initializeWith -> new LinkedList<>()).add(newNode);
        currentSize++;

    }

    private void removeSong(String song,String user) {
        if (playlist.containsKey(user)) {
            LinkedList<Song> nodes = playlist.get(user);
            for (Song node : nodes) {
                if (node.songName.equals(song)) {
                    if (node.prev != null) {
                        node.prev.next = node.next;
                    } else {
                        head = node.next;
                    }
                    if (node.next != null) {
                        node.next.prev = node.prev;
                    } else {
                        tail = node.prev;
                    }

                    nodes.remove(node);
                    currentSize--;
                    return;
                }
            }
        }
    }

    private void removeLeastRecentlyPlayedSong() {

        if (tail != null) {
            String user = tail.user;
            LinkedList<Song> nodes = playlist.get(user);
            nodes.remove(tail);
            currentSize--;

            if (tail.prev != null) {
                tail.prev.next = null;
                tail = tail.prev;
            } else {
                head = null;
                tail = null;
            }
        }

    }
    public LinkedList<String> getRecentlyPlayedSongs(String user) {
        if (playlist.containsKey(user)) {
            LinkedList<Song> nodes = playlist.get(user);
            LinkedList<String> songs = new LinkedList<>();
            for (int i=nodes.size()-1;i>=0;i--) {
                songs.add(nodes.get(i).songName);
            }
            return songs;

        } else {
            return new LinkedList<>();
        }
    }
}


