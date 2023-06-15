package lesson5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Practic {
    public static void main(String[] args) {

        ArrayList<Integer> values = new ArrayList<>();

        Iterator<Integer> arrayIt = values.iterator();

        long startMills = System.currentTimeMillis();

        Random random = new Random();


        LinkedList<Integer> test = new LinkedList<>();

        int size = 10000;

        long starAddLastArr = System.currentTimeMillis();

        for(int i = 0; i<size;i++){
            int value = random.nextInt();
            values.add(value);
        }
        long endAddLastArr = System.currentTimeMillis();
        System.out.println("Добавление ArrayList в конце работало: " + (endAddLastArr - starAddLastArr));

        long startAddMiddleArr = System.currentTimeMillis();

        for(int i = 0; i<size;i++){
            int value = random.nextInt();
           values.add(test.size()/2,value);
        }

        long endAddMiddleArr = System.currentTimeMillis();
        System.out.println("Добавление Array с середины работало: " + (endAddMiddleArr - startAddMiddleArr));

        long startGetArr = System.currentTimeMillis();

        for(int i = 0; i<size;i++){
            int getValue = random.nextInt(test.size());
            values.get(getValue);
        }

        long endGetArr = System.currentTimeMillis();
        System.out.println("Рандомное получение значений Array работало: " + (endGetArr - startGetArr));

        long startRemoveLastArr = System.currentTimeMillis();

        for(int i = 0; i<size;i++){
            values.remove(values.size()-1);

        }

        long endRemoveLastArr = System.currentTimeMillis();
        System.out.println("Удаление Array с конца работало: " + (endRemoveLastArr - startRemoveLastArr));

        long startRemoveMiddleArr = System.currentTimeMillis();

        for (int i = 0; i<size; i++){
            values.remove(test.size()/2);
        }

        long endRemoveMiddleArr = System.currentTimeMillis();
        System.out.println("Удаление Array с середины работало: " + (endRemoveMiddleArr - startRemoveMiddleArr));
//====================================
        long starAddLast = System.currentTimeMillis();

        for(int i = 0; i<size;i++){
            int value = random.nextInt();
        test.addLast(value);
        }

        long endAddLast = System.currentTimeMillis();
        System.out.println("Добавление в конце работало: " + (endAddLast - starAddLast));




        long startAddMiddle = System.currentTimeMillis();

        for(int i = 0; i<size;i++){
            int value = random.nextInt();
            test.add(test.size()/2,value);
        }

        long endAddMiddle = System.currentTimeMillis();
        System.out.println("Добавление с середины работало: " + (endAddMiddle - startAddMiddle));

        long startGet = System.currentTimeMillis();

        for(int i = 0; i<size;i++){
            int getValue = random.nextInt(test.size());
            test.get(getValue);
        }

        long endGet = System.currentTimeMillis();
        System.out.println("Рандомное получение значений работало: " + (endGet - startGet));

        long startRemoveLast = System.currentTimeMillis();

        for(int i = 0; i<size;i++){
            test.removeLast();
        }

        long endRemoveLast = System.currentTimeMillis();
        System.out.println("Удаление с конца работало: " + (endRemoveLast - startRemoveLast));

        long startRemoveMiddle = System.currentTimeMillis();

        for (int i = 0; i<size; i++){
            test.remove(test.size()/2);
        }

        long endRemoveMiddle = System.currentTimeMillis();
        System.out.println("Удаление с середины работало: " + (endRemoveMiddle - startRemoveMiddle));

            long endMills = System.currentTimeMillis();
        System.out.println("Программа работала: " + (endMills - startMills));



    }
}
