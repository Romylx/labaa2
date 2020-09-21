package com.company;

public class TestAuthor {
    public static void main(String[] args) {
        Author Romylx = new Author("Ramal", "Romylx@yandex.ru", 'm');
        System.out.println(Romylx);  // toString()
        //Tan Ah Teck (m) at teck@nowhere.com

        // Test Setters and Getters
        Romylx.setEmail("par@yandex.ru");
        System.out.println(Romylx);  // toString()
        //Ramal (m) at Romylx@yandex.ru
        System.out.println("name is: " + Romylx.getName());
        //name is: Ramal
        System.out.println("gender is: " + Romylx.getGender());
        //gender is: m
        System.out.println("email is: " + Romylx.getEmail());
        //email is: Romylx@yandex.ru
    }
}