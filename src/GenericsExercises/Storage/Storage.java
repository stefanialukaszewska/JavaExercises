package GenericsExercises.Storage;

import java.util.ArrayList;
import java.util.List;

public class Storage <T>{
    private List<T> items = new ArrayList<>();
    private int maxCapacity;
    private static int storageNumber = 0;
    private int storageId;

    Storage(int maxCapacity){
        this.maxCapacity = maxCapacity;
        storageNumber++;
        this.storageId = storageNumber;
    }

    public void addItem(T item) {
        if(items.size()<maxCapacity){
            items.add(item);
        } else{
            System.out.println("Storage [id: " + storageId + "] is full");
        }

    }
    public void deleteItem(T item) {
        items.remove(item);
    }
    public void showItems(){
        System.out.println(items);
    }

    public int checkCapacity(){
        return items.size();
    }

    public void showPercentageCapacity(){
        double percentage = ((double) items.size() / (double)  maxCapacity) *100;
        System.out.println("Storage [id: "+ storageId+ "] is " + percentage + "% full");
    }

    public static void howManyStorages(){
        System.out.println("There " + (storageNumber == 1 ? "is" : "are") + " " + storageNumber + " storage" + (storageNumber == 1 ? "" : "s"));
    }

}
