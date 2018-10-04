/*
 *Sean Luo 03/10/2018
 *Palindrome2.java
 *This is progrem calculates the Palindrome2.
 */

package palindrome2;

import javax.swing.JOptionPane;

/**
 *
 * @author clkon
 */
public class Palindrome2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sentence, word, backword, backsentence = "";
        int blank, world1, Palindrome = 0;
        //sentence represent people enter the sentence.
        //word represent every word in the sentence add a point
        //backword represent the inverted words
        //backsentence represent the inverted sentence
        //blank represent the blank between the words
        //world1 represent every word in the sentence
        //Palindrome reprensent the word equal its backword
        sentence = JOptionPane.showInputDialog(
                "Words that are the same forwards and backwards are called palindromes.\n"
                + "This program determines if the words are palindromes.\n\n"
                + "Enter a sentence(do not include a punctuation mark):");
        sentence += "·";
        while (sentence.length() > 0) {
            blank = sentence.indexOf(" ");
            word = sentence.substring(0, blank);
            sentence = sentence.substring(blank + 1, sentence.length());
            backword = "";
            for (world1 = word.length() - 1; world1 >= 0; world1--) {
                backword += word.charAt(world1);
            }
            if (word.equalsIgnoreCase(backword)) {
                Palindrome += 1;
                backsentence += word + ",";
            }
        }
        JOptionPane.showMessageDialog(null,"There are " + Palindrome + " palindromes in the sentence");
        if (Palindrome > 0) {
            JOptionPane.showMessageDialog(null,"The palindromes are:\n" + backsentence);    }
    
}
}
