package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Features {

    public static void main(String[] args) {

        List<Integer> list1= Arrays.asList(10,8,2,15);

//        List<Integer> list3= list1.stream().filter(n->n%2==0).collect(Collectors.toList());
        //List<Integer> list3= list1.stream().filter(n->String.copyValueOf(n).startsWith("1")).collect().


        // System.out.println(list3);
    }

}
