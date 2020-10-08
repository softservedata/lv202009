package com.softserve.edu.hw5;

import com.softserve.edu.hw4.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Hw5 {
    /* 1) Доповнити клас Product з Homework 4 методами equals() та hashCode().
       В методі main створити масив із десяти екземплярів типу Product (можна захардкодити).
       Знайти в масиві два одинакових продукти. Якщо такі знайдені, вивести їх на екран.
        Для коду використати пакет com.softserve.homework5
        Запушати код на github у свою вітку.
    */

    public static void main(String[] args) {
        ProductUpd[] array = {
                new ProductUpd("apples", 30),
                new ProductUpd("coffee", 130),
                new ProductUpd("rise", 50),
                new ProductUpd("onion", 10),
                new ProductUpd("milk", 30),
                new ProductUpd("potato", 20),
                new ProductUpd("coffee", 30),
                new ProductUpd("milk", 30),
                new ProductUpd("sausage", 120),
                new ProductUpd("carrot", 30)
                };

       // просто массив
        // ProductUpd[] array = new ProductUpd[] {milk, coffee, onion, rise, onion, butter, potato, coffee, tea, sausage, bread};

        //System.out.println("All products: " + Arrays.toString(array));  // якщо масив з різними типами даних, то виводити його тільки так

        for (int i=0; i<array.length -1; i++) {

            for (int j=0; j < i; j++) {
                if (array[j].equals(array[i])) {
                    System.out.println("Product " + array[j].getName() + " is repeat in: " +j+ " and " + i);
                }
            }
        }


        // массив з можливістю розширення
//        ArrayList<ProductUpd> arrProd=new ArrayList<>();
//        arrProd.add(milk);
//        arrProd.add(coffee);
//        ...

        // equals
        // System.out.println("Product 1 == Product 2: " + (ProductUpd1 == ProductUpd2));

        // System.out.println(array.length);
        // System.out.println(array[5]);
    }
    public static class ProductUpd {

        private String name;
        private int price;

        // 1 constructor - ініціалізує поля,  назва = класс; нічого не повертає
        public ProductUpd() {
            name = "";
            price = 0;
        }

        // 2 constructor - specified
        public ProductUpd(String name, int price) {
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
            return "ProductUpd{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }


        // hash code, equals - методи для порівняння обєктів

        // equals - порівнює обєкти
        @Override
        public boolean equals (Object o) {
            if (this == o) {
                return true;
            }

            if ((o == null) || (getClass() !=o.getClass())) {
                return false;
            }
            ProductUpd other = null;
            if (o instanceof ProductUpd) {
                other = (ProductUpd) o;
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
}
