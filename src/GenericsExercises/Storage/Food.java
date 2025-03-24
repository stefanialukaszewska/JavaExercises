package GenericsExercises.Storage;

public class Food extends Item {
    private final boolean isGlutenFree;
    Food(String name, String type, boolean isGlutenFree){
        super(name,type);
        this.isGlutenFree = isGlutenFree;
    }

    @Override
    public String toString() {
        return super.toString() + " - gluten free: " + isGlutenFree;
    }
}
