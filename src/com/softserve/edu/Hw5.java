package com.softserve.edu;

import com.softserve.edu.hw4.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Hw5 {

    private static Object ProductUpd;

    public static void main(String[] args) {
        ProductUpd milk = new ProductUpd("milk", 30);
        ProductUpd coffee = new ProductUpd("coffee", 130);
        ProductUpd rise = new ProductUpd("rise", 50);
        ProductUpd onion = new ProductUpd("onion", 10);
        ProductUpd butter = new ProductUpd("butter", 60);
        ProductUpd potato = new ProductUpd("potato", 20);
        ProductUpd cofe = new ProductUpd("coffee", 30);
        ProductUpd tea = new ProductUpd("tea", 80);
        ProductUpd sausage = new ProductUpd("sausage", 120);
        ProductUpd bread = new ProductUpd("bread", 20);


        // просто массив
        ProductUpd[] array = new ProductUpd[] {milk, coffee, onion, butter, potato, cofe, tea, sausage, bread};

        for (int i = 0; i < array.length -1; i++) {
            while (ProductUpd[i]) i++;
            System.out.println(array[i] + "is repeat in: " + i + " ");

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    ProductUpd[j] = true;

                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }


        // массив з можливістю розширення
//        ArrayList<ProductUpd> arrProd=new ArrayList<>();
//        arrProd.add(milk);
//        arrProd.add(coffee);
//        arrProd.add(rise);
//        arrProd.add(onion);
//        arrProd.add(butter);
//        arrProd.add(potato);
//        arrProd.add(cofe);
//        arrProd.add(tea);
//        arrProd.add(sausage);
//        arrProd.add(bread);
        // Arrays.sort(array);

        // System.out.println(array[array.length - 1]);

        // equals
        // System.out.println("Product 1 == Product 2: " + (ProductUpd1 == ProductUpd2));

        // System.out.println(array.length);
        // System.out.println(array[5]);
    }
    public static class ProductUpd {
        /* 1) Доповнити клас Product з Homework 4 методами equals() та hashCode().
   В методі main створити масив із десяти екземплярів типу Product (можна захардкодити).
   Знайти в масиві два одинакових продукти. Якщо такі знайдені, вивести їх на екран.
Для коду використати пакет com.softserve.homework5
Запушати код на github у свою вітку.
    */
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
