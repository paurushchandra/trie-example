package com.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("starting main");
        Trie dictionary = new Trie();
        dictionary.add("Hell", "Hello","World","He","Hen");
        System.out.println("contains 'Hen': " + dictionary.contains("Hen"));
        System.out.println("contains 'She': " + dictionary.contains("She"));
        System.out.println("main end");
    }


}
