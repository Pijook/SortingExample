package com.company;

import java.util.*;

public class Main {

    private static List<Container> containers;

    public static void main(String[] args) {
        containers = new ArrayList<>();

        Random random = new Random();
        for(int i = 0; i < 10; i++){
            containers.add(new Container((double) random.nextInt(1000)));
        }

        for(Container container : containers){
            System.out.println(container);
        }

        System.out.println("=============");

        saveContainers();
    }

    public static void saveContainers(){
        List<Container> tempList = new ArrayList<>(containers);

        tempList.sort(new Comparator<Container>() {
            @Override
            public int compare(Container o1, Container o2) {
                if(o1.getMass().compareTo(o2.getMass()) == 0){
                    //Do another compare
                }
                return o1.getMass().compareTo(o2.getMass());
            }
        });

        for(Container container : tempList){
            System.out.println(container);
            //Save to file
        }
    }
}
