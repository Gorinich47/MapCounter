package com.mapcounter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class App
{
    public static void main( String[] args ){

        String[] arr = {"a", "b", "c", "a"}; // проверочный массив
        Map<String, Long> maps= counter(arr); // вызов метода.
        System.out.println( maps);
        Map<String, Long> maps2= Arrays.stream(arr)
                .collect(
                        Collectors.groupingBy(e->e,
                                Collectors.counting()));

        System.out.println( maps2);
    }

    /**
     * Счетчик объектов в массиве
     * @param array массив элементов типа Т
     * @return Map<T,Integer> где T - тип объекта
     * @param <T>
     */
    static <T> Map<T, Long> counter(T[] array){
       Map<T,Long> map = new HashMap<>();
       for(T elem: array){
           Long value = map.getOrDefault(elem, 0L);
            map.put(elem, value+1);
        }
        return map;
    }
}
