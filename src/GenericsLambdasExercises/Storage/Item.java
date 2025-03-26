package GenericsLambdasExercises.Storage;

public abstract class Item {
    protected String name;
    protected final String type;
    protected Item(String name,String type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return
                "'" + name + '\'' +
                " - '" + type + '\'';
    }
}
