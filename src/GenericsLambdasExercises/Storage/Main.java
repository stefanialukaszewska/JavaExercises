package GenericsLambdasExercises.Storage;

public class Main {
    public static void main(String[] args) {

        Food milk = new Food("Lactose-Free Milk","diary",true);
        Food yogurt = new Food("Greek yogurt","diary", true);

        Storage<Food> foodStorage = new Storage<>(10);
        foodStorage.addItem(milk);
        foodStorage.addItem(yogurt);

        foodStorage.showItems();

        milk.setName("Lactose-Free Low Fat Milk");
        foodStorage.showItems();

        foodStorage.showPercentageCapacity();

        Clothing tshirt = new Clothing("Black plain t-shirt", "top", "kids");
        Clothing cap = new Clothing("Blue NY cap", "Head accessories", "adult");

        Storage<Clothing> clothingStorage = new Storage<>(2);
        clothingStorage.addItem(tshirt);
        clothingStorage.addItem(cap);

        clothingStorage.showPercentageCapacity();

        clothingStorage.addItem(cap);
        clothingStorage.showItems();

        Storage.howManyStorages();
    }
}
