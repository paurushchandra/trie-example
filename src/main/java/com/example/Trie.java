package com.example;

/**
 * Created by user on 3/5/16.
 */
public class Trie {

    private TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    public void add(String string) {
        TrieNode node = root;
        for (char ch : string.toCharArray()) {
            TrieNode leaf = new TrieNode(ch);
            TrieNode existingNode = node.getLeafs().putIfAbsent(ch, leaf);
            node = existingNode != null ? existingNode : leaf;
        }
    }

    public void add(String... strings) {
        for (String string : strings) {
            add(string);
        }
    }

    public boolean contains(String string) {
        TrieNode node = root;
        for (char ch : string.toCharArray()) {
            node = node.getLeafs().get(ch);
            if (node == null) {
                return false;
            }
        }
        return true;
    }

}
