package com.softserve.edu.hw4;

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.util.Arrays.sort;

public class Product {
        /* 1) Створити клас Product з такими полями: назва продукту та ціна.
       Клас повинен містити конструктор, гетери та сетери, метод toString().
       В методі main створити чотири екземпляри типу Product.
       Вивести на екран назву продукта з найбільшою ціною.
    Для коду використати пакет com.softserve.homework4
    Запушати код на github у свою вітку.

    */
        private String name;
        private int price;

        // 1 constructor - ініціалізує поля,  назва = класс; нічого не повертає
        public Product() {
            name = "";
            price = 0;
        }

        // 2 constructor - specified
        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        // getter for price
        public int getPrice() {
            return price;
        }

        // setter for price
        public void setPrice(int price) {
            this.price = price;
        }

        // getter for name
        public String getName() {
            return name;
        }

        // setter for name
        public void setName(String name) {
            // check
            this.name = name;
        }


        // toString
        @Override
        // override - сигнал компілятору подивитись, чи в батьк. методі існує такий
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }

        public static void main(String[] args) {
            // 1st ex
            Product milk = new Product("milk", 30);
            Product butter = new Product("butter", 50);
            Product coffee = new Product("coffee", 100);
            Product bread = new Product("bread", 10);

            int[] array = new int[] {milk.price, butter.price, coffee.price, bread.price};
            Arrays.sort(array);

            System.out.println(array[array.length - 1]);
        }
    }


