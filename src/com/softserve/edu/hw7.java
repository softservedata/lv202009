package com.softserve.edu;

public class hw7 {


    // Task 7
//        1) Задати два списки (ArrayList), які містять цілі значення.
//        Кількість елементів у списках може бути різною, а самі елементи можуть дублюватися.
//        Вияснити, чи контент елементів у списках співпадає.
//        Наприклад, вміст наступних списків є однаковий [1, 2, 1, 2, 3] та [3, 3, 2, 2, 1, 1]
//        Для коду використати пакет com.softserve.homework6


    ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(3);
        list1.add(1);
        list1.add(10);
        list1.add(1);
        list1.add(90);

        list2.add(22);
        list2.add(3);
        list2.add(3);
        list2.add(9);
        list2.add(9);
        list2.add(3);

        System.out.println("Array1: "+Arrays.asList(list1));
        System.out.println("Array2: "+Arrays.asList(list2));

        Collections.sort(list1);
        Collections.sort(list2);


}

