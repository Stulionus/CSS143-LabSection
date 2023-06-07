package Labs.Lab10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;;
/*
 * MorseTree.java
 * CSSSKL 143 Binary Search Tree Lab
 * Author: Rob Nash
 *
 * This class reads in data from a text file ("data.txt") and populates a binary tree with an
 * ordering constraint.  See the lab instructions for more information, but in general, dots go right
 * and dashes go left when constructing or traversing a Morse code tree.  Search for //TODO
 * in the code to see what code you have to implement.
 *
 * Start with the constructor. In your constructor read each line in from the textfile first,
 * calling add() for each {letter, morseCodeStr} pair.
 *
 */

public class MorseTree {
    //data member called "root" goes here
    private TreeNode root;

    //Complete constructor
    public MorseTree() {
        Scanner fin = null;
        try {
            File file = new File("data.txt");
            fin = new Scanner(file);
            while (fin.hasNextLine()) {
                String line = fin.nextLine();
                if (line.length() > 0) {
                    char letter = line.charAt(0);
                    String morseCode = line.substring(1).trim();
                    add(morseCode, letter);
                    System.out.println("Letter: " + letter + ", Morse: " + morseCode);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fin != null) {
                fin.close();
            }
        }
    }



    public void add(String morseStr, char letter) {
        root = insertInSubtree(morseStr, letter, root);
    }

    private TreeNode<Character> insertInSubtree(String morseStr, char letter, TreeNode subtree) {
        if (subtree == null) {
            subtree = new TreeNode(letter);
        } else if (morseStr.charAt(0) == '-') {
            subtree.left = insertInSubtree(morseStr.substring(1), letter, subtree.left);
        } else if (morseStr.charAt(0) == '.') {
            subtree.right = insertInSubtree(morseStr.substring(1), letter, subtree.right);
        }
        return subtree;
    }

    public Character translate(String morseStr) {
        return findInSubtree(morseStr, root);
    }

    //recursively complete this function.  Very similar to insertInSubtree()
    private Character findInSubtree(String morseStr, TreeNode subtree) {
        //base case 1 : subtree is null
        if (subtree == null) {
            return null;
        }
        //base case 2 : morseStr is of length 0
        if (morseStr.length() == 0) {
            return (char) subtree.data;
        }
        //recursive case 1: the first char in morseStr is a '.', so recursively traverse tree
        if (morseStr.charAt(0) == '-') {
            return findInSubtree(morseStr.substring(1), subtree.left);
        }
        //recursive case 2: the first char in the morseStr is a '-', so re-curse accordingly
        if (morseStr.charAt(0) == '.') {
            return findInSubtree(morseStr.substring(1), subtree.right);
        }
        return null;  //remove this
    }

    //Non-recursive function that calls other (recursive) functions
    public String translateString(String tokens) {
        String retVal = "";
        //build a scanner here using tokens as input
        Scanner scanner = new Scanner(tokens);
        //iterate over the tokens calling translate on each token (substring separated by a space)
        //concat these characters and return them
        while (scanner.hasNext()) {
            String token = scanner.next();
            Character translatedChar = translate(token);
            if (translatedChar != null) {
                retVal.concat(String.valueOf(translatedChar));
            }
        }

        return retVal;
    }

    public String toMorseCode(Character c) {
        StringBuilder newString = new StringBuilder();
        _toMorseCode(root, c, newString);
        return newString.toString();
    }

    private boolean _toMorseCode(TreeNode root, char target, StringBuilder newString) {
        if (root == null) {
            return false;
        }

        boolean found = _toMorseCode(root.left, target, newString); // Traverse the left subtree

        if ((char)root.data == target) {
            newString.append("found "); // Append "found" when target character is found
            return true; // Return true to indicate target character is found
        } else {
            if (root.left != null) {
                newString.append("-"); // Append "-" when moving left
            }
            if (root.right != null) {
                newString.append("."); // Append "." when moving right
            }
        }

        if (!found) {
            found = _toMorseCode(root.right, target, newString); // Traverse the right subtree
        }

        return found;
    }


    public static void main(String[] args) {
        MorseTree mt = new MorseTree();  //builds our tree using data from a file

        System.out.println(mt.translate("..."));  //prints out S
        //System.out.println(mt.translate("---"));  //prints out O
        //System.out.println(mt.translate(".......-"));  //prints out null

        //System.out.println(mt.translateString("... --- ..."));  //SOS
        //System.out.println(mt.toMorseCode('S'));  //find where we are in the tree, remember path to root
    }

    // Inner class to create the linked structure
    private class TreeNode<Character> {

        Object data;     // holds a given node’s data
        TreeNode right;
        TreeNode left;

        public TreeNode() {
            this.data = null;
            this.right = null;
            this.left = null;
        }

        public TreeNode(char letter) {
            this.data = letter;
            this.right = null;
            this.left = null;
        }

        public void setRight(TreeNode rightNode) {
            this.right = rightNode;
        }

        public void setLeft(TreeNode leftNode) {
            this.left = leftNode;
        }

    }
}
