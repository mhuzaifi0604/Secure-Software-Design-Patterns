import java.util.ArrayList;

public class Playlist implements Container{
    public ArrayList<String> Songs  = new ArrayList();

    public void add_song(String newSong){
        Songs.add(Songs.size(), newSong);
        System.out.println("New Song Added: " + newSong);
    }
    public void remove_song(String songtodelete){
        Songs.remove(songtodelete);
        System.out.println("Song '" + songtodelete + "' Deleted.");
    }
    public void PrintSongs(){
        int i = Songs.size();
        while(i > 0){
            System.out.println("Song [" + i+1 + "]: " + Songs.get(i));
        }

    }
    @Override
    public Iterator getiterator(){
        return new Playlist_iterator();
    }
    private class Playlist_iterator implements Iterator{
        private int i;
        @Override
        public boolean hasnext(){
            if (i < Songs.size()){
                return true;
            }else{
                return false;
            }
        }
        @Override
        public Object get_next_val(){
            if (this.hasnext()){
                return Songs.get(i++);
            }else{
                return null;
            }
        }

    }
}
