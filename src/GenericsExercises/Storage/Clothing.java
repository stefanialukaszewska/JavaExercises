package GenericsExercises.Storage;

public class Clothing extends Item{
    private String category;
    Clothing(String name,String type, String category) {
        super(name, type);
        this.category = category;
    }

    @Override
    public String toString() {
        return super.toString() + " - '" + category + '\'';
    }
}
