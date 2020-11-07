package com.softserve.edu.hw4;

import java.util.Arrays;

public class Product {
        /* 1) Створити клас Product з такими полями: назва продукту та ціна.
       Клас повинен містити конструктор, гетери та сетери, метод toString().
       В методі main створити чотири екземпляри типу Product.
       Вивести на екран назву продукта з найбільшою ціною.
    Для коду використати пакет com.softserve.homework4
    Запушати код на github у свою вітку.

    */
        private String name;
        private double price;

        // 1 default constructor - ініціалізує поля,  назва = класс; нічого не повертає
        public Product() {
            name = "";
            price = 0;
        }

        // 2 constructor - specified
        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        // getter for price
        public double getPrice() {
            return price;
        }

        // setter for price
        public void setPrice(double price) {
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
}


