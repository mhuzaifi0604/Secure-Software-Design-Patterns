// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------- Playlists --------------------------------");
        Playlist song = new Playlist();
        song.add_song("Hello");
        song.add_song("Set Fire To the Rain");
        song.add_song("When we were young!");
        for(Iterator iter = song.getiterator(); iter.hasnext();){
            String name = (String)iter.get_next_val();
            System.out.println("Name : " + name);
        }
        song.remove_song("When we were young!");
        for(Iterator iter = song.getiterator(); iter.hasnext();){
            String name = (String)iter.get_next_val();
            System.out.println("Name : " + name);
        }
        System.out.println("-------------------------------------------------------------------------- ");
        System.out.println("------------------------------- Music Library --------------------------------");
        Playlist add_list = new Playlist();
        add_list.add_song("Senorita");
        add_list.add_song("Nothing Holding me back!");
        add_list.add_song("Stiches");
        Music_Libraray library = new Music_Libraray();
        library.add_list(song);
        library.add_list(add_list);
        for (Iterator iter = library.getiterator(); iter.hasnext();){
            Playlist list = (Playlist)iter.get_next_val();
            System.out.println("Songs in PlayList "+ iter +": "+ list.Songs);
        }
        library.remove_list();
        for (Iterator iter = library.getiterator(); iter.hasnext();){
            Playlist list = (Playlist)iter.get_next_val();
            System.out.println("Songs in PlayList "+ iter +": "+ list.Songs);
        }
        System.out.println("-------------------------------------------------------------------------- ");
    }
}