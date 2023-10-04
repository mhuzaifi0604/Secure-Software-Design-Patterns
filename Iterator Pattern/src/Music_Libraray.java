import java.util.ArrayList;

public class Music_Libraray implements Container{
    private ArrayList<Playlist> Library  = new ArrayList();

    public void add_list(Playlist newList){
        Library.add(Library.size(), newList);
        System.out.println("New Song Added: " + newList);
    }
    public void remove_list(){
        Library.remove(Library.size()-1);
        System.out.println("List Deleted.");
    }
    @Override
    public Iterator getiterator(){
        return new Library_Iterator();
    }
    private class Library_Iterator implements Iterator{
        private int i;
        @Override
        public boolean hasnext(){
            if (i < Library.size()){
                return true;
            }else{
                return false;
            }
        }
        public Object get_next_val(){
            if (this.hasnext()){
                return Library.get(i++);
            }else{
                return null;
            }
        }

    }
}
