package com.mapcounter;

import java.util.HashMap;
import java.util.Map;

public class App
{
    public static void main( String[] args ){

        String[] arr = {"a", "b", "c", "a"}; // проверочный массив
        Map<String, Integer> maps= counter(arr); // вызов метода
        System.out.println( maps);
    }

    /**
     * Счетчик объектов в массиве
     * @param array массив элементов типа Т
     * @return Map<T,Integer> где T - тип объекта
     * @param <T>
     */
    static <T> Map<T, Integer> counter(T[] array){
       Map<T,Integer> map = new HashMap<>();
       for(T elem: array){
            Integer value = map.getOrDefault(elem, 0);
            map.put(elem, value+1);
        }
        return map;
    }
}
