/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flyweight;

/**
 *
 * @author XPG
 */
import java.util.ArrayList;
import java.util.List;

public class Forest {
    private List<TreeInForest> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, String color, String texture) {
        TreeType type = TreeFactory.getTreeType(name, color, texture);
        TreeInForest tree = new TreeInForest(x, y, type);
        trees.add(tree);
    }

    public void showTrees() {
        for (TreeInForest tree : trees) {
            tree.plant();
        }
    }

    private class TreeInForest {
        private int x;
        private int y;
        private TreeType type;

        public TreeInForest(int x, int y, TreeType type) {
            this.x = x;
            this.y = y;
            this.type = type;
        }

        public void plant() {
            type.plant(x, y);
        }
    }
}

