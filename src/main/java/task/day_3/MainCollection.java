package task.day_3;

import java.util.*;

public class MainCollection {
    public static void main(String[] args) {
        //1) Implement an application to work with a list. In the 1st half of the list replace
        // all elements E1 with E2
        Integer e1=1;
        Integer e2=9;
        List<Integer> collection1= new ArrayList<>(Arrays.asList(1, 6, 1, 3, 4, 1, 5, 1, 0));
        System.out.println("task_1");
        System.out.println(collection1);
        int halfIndex=collection1.size()/2;
        for(int i1=0;i1<halfIndex;i1++){
            if(collection1.get(i1).equals(e1))
            collection1.set(i1,e2);

        }
        System.out.println(collection1);

        //2) Input: matrix of integers.
        System.out.println("task_2");
        List<List<Integer>> collection2= new ArrayList<>(Arrays.asList(
                Arrays.asList(1, 6, 1, 3),
                Arrays.asList(1, 3, 4, 4),
                Arrays.asList(2, 6, 1, 3),
                Arrays.asList(2, 6, 1, 0)));
        print(collection2);
        //a) Print out matrix in reverse order.
        System.out.println();
            for(int i2=0;i2<collection2.size();i2++){
                System.out.println();
                for(int j2=0;j2<collection2.get(0).size();j2++){
                    System.out.print(collection2.get(j2).get(i2)+"\t");
                }
            }

        // b) Print out matrix with unique values (delete duplicates)
        System.out.println();
        Set<Integer> uniqueElementSet=new HashSet<>();
        for(int i2=0;i2<collection2.size();i2++){
            for(int j2=0;j2<collection2.get(0).size();j2++){
                if(uniqueElementSet.contains(collection2.get(i2).get(j2))){
                    collection2.get(i2).set(j2,0);
                }else {
                    uniqueElementSet.add(collection2.get(i2).get(j2));
                }
            }
        }
        print(collection2);


    }

    private static void print(List<List<Integer>> collection) {
        for(int i2=0;i2<collection.size();i2++){
            System.out.println();
            for(int j2=0;j2<collection.get(0).size();j2++){
                System.out.print(collection.get(i2).get(j2)+"\t");
            }
        }
    }
}
