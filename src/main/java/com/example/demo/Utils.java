package com.example.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class Utils {
    /**
    * Associate all items in a collection to values derived using a function for each item.
    *
    * @param  collection A collection of objects with will become the keySet for the return map
    * @param  valueProvider A function that takes in the object type of the collection in arg0 and returns the desired value to be associated in the return map.
    * @return A Map with all the values of the "collection" argument as keys and the return of the "valueProvider" function as values for each respective key.
    */
    public static <C extends Collection<T>, T, S> Map<T, S> associate(C collection, Function<T, S> valueProvider) {
        var map = new HashMap<T,S>();
        collection.forEach(item -> {
            Optional.ofNullable(valueProvider.apply(item))
                .ifPresent(value -> map.put(item, value));
        });
        return map;
    }
}
