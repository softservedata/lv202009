package com.softserve.edu.hw6;

import java.util.Objects;


    /* 1) Доповнити клас Product з Homework 4 методами equals() та hashCode().
       В методі main створити масив із десяти екземплярів типу Product (можна захардкодити).
       Знайти в масиві два одинакових продукти. Якщо такі знайдені, вивести їх на екран.
        Для коду використати пакет com.softserve.homework5
        Запушати код на github у свою вітку.
    */

        // массив з можливістю розширення
//        ArrayList<ProductUpd> arrProd=new ArrayList<>();
//        arrProd.add(milk);
//        arrProd.add(coffee);
//        ...

        // equals
        // System.out.println("Product 1 == Product 2: " + (ProductUpd1 == ProductUpd2));

        // System.out.println(array.length);
        // System.out.println(array[5]);


public class Product {
        private String name;
        private double price;

        // 1 constructor - ініціалізує поля,  назва = класс; нічого не повертає
        public Product(String coffee, double coffeePrice, int coffeeAroma) {
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
            return "ProductUpdate{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }

        // equals - порівнює обєкти
        @Override
        public boolean equals (Object o) {
            // System.out.println("\ncurrent = " + this);
            // System.out.println("o = " + o);

            if (this == o) {
                return true;
            }

            if ((o == null) || (getClass() !=o.getClass())) {
                return false;
            }
            Product other = null;
            if (o instanceof Product) {
                other = (Product) o;
            }

            if ( (other == null) || (price != other.price)
            || ((name == null) && (other.name !=null))
            || ((name != null) && other.name == null)) {
            return false;
}
            if ((name == null) && (other.name == null)) {
                return true;
            }
            return name.equals(other.name);   // запуск реальної перевірки (тут уже стрінг)
            }

        // hash code - метод, який гарантує обчислення контр суми обєкта
        @Override
        public int hashCode() {
            return Objects.hash(getName(), getPrice());
        }
    }
