package com.softserve.homework10;


import java.util.ArrayList;
import java.util.Arrays;

public class Appl {
    public static void main(String[] args) {
        String brackets = "(\\()[{(\\))(\\})[]\\]}]";
        String bracketsBroken = "(\\(){[{(\\))(\\(})[]\\]}]";
        System.out.println("Result: " + verifyBrackets(brackets));
        System.out.println("Result: " + verifyBrackets(bracketsBroken));
    }

    public static boolean verifyBrackets(String text) {
        text = text.replaceAll("\\\\.", "");

        ArrayList<Character> characters = new ArrayList<>();
        for(int i =0; i < text.length(); i++){
            characters.add(text.charAt(i));
        }
        System.out.println(characters);


        int i = 1;
        while (characters.size() > i)
        {
            if(characters.get(i) == ')'){
                if(characters.get(i - 1) != '('){
                    return false;
                } else {
                    characters.remove(i);
                    characters.remove(i-1);
                    i--;
                }
            } else if(characters.get(i) == ']'){
                if(characters.get(i - 1) != '['){
                    return false;
                } else {
                    characters.remove(i);
                    characters.remove(i-1);
                    i--;
                }
            } else if(characters.get(i) == '}'){
                if(characters.get(i - 1) != '{'){
                    return false;
                } else {
                    characters.remove(i);
                    characters.remove(i-1);
                    i--;
                }
            } else{
                i++;
            }
            System.out.println(characters);
        }

        return true;
    }
}
