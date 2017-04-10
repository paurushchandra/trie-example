package com.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 3/5/16.
 */
public class TrieNode {

    private Character value;
    private Map<Character, TrieNode> leafs;

    public TrieNode() {
        this.leafs = new HashMap<Character, TrieNode>();
    }

    public TrieNode(Character value) {
        this();
        this.value = value;
    }

    public Character getValue() {
        return value;
    }

    public Map<Character, TrieNode> getLeafs() {
        return leafs;
    }

}
