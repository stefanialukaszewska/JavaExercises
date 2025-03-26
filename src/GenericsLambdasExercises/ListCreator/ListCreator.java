package GenericsLambdasExercises.ListCreator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ListCreator <T>{

    List<T> list;

    public ListCreator(List<T> list){
        this.list =list; // Object of class ListCreator contains provided list
    }

    // This static method allows for the creation of ListCreator object, which contains provided list
    // The first <T> indicates the generic type used by the method
    public static <T> ListCreator<T> getFrom(List<T> list){
        return new ListCreator<>(list);
    }

    // Method 'when' is used for ListCreator object to filter provided list. We don't want to get List object yet, as it is transitional stage
    public ListCreator<T> when(Predicate<T> predicate){
        List<T> temp = new ArrayList<>();
        for(T t:list){
            if(predicate.test(t)){
                temp.add(t);
            }
        }

        return new ListCreator<>(temp);
    }

    // Method 'mapEvery' gives us List object, as it is 'final' stage of creating the desirable list
    // It transforms every element using provided function
    // The first <R> indicates that this method uses its own generic type R and is only relevant within the method
    public <R> List<R> mapEvery(Function<T,R> function){
        List<R> temp = new ArrayList<>();
        for(T t: list){
            temp.add(function.apply(t));
        }
        return temp;
    }

}
