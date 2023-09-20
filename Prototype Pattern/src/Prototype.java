public class Prototype implements Cloneable {
    private String description, name;

    public void prepare() {
    }

    ;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String newname) {
        name = newname;
    }

    public void setDescription(String desc) {
        description = desc;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}