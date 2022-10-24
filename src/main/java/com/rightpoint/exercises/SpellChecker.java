package com.rightpoint.exercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This challenge is to implement a basic spell checker. Some of the
 * code has already been written. Implement the printCorrections
 * function below to complete the challenge.
 */
public class SpellChecker {

  private static final String writingSample = "The race to " +
    "dominaet the electric-vehicle industry may be getting tighter as " +
    "Volkswagen, the German automobile giant and looming Tesla rival, " +
    "reveeled plans on Monday to reduce the cost of batterees and operate " +
    "a wide-ranging charging network. In its first-ever “Power Day,” " +
    "remeniscent of electric-car maker Tesla much-hyped “Battery Day,” " +
    "the German group that owns the Volkswagen, Audi and Porshe brands " +
    "said it would rely on six gigafactories in Europe to secure " +
    "supllies as the industry faces a looming shortage.";

  private static final String wordList = "a and as Audi " +
    "automobile batteries Battery be brands car charging cost Day " +
    "dominate electric Europe ever faces first German getting giant " +
    "gigafactories group hyped in industry it its looming maker may " +
    "Monday much network of on operate owns plans Porsche Power race " +
    "ranging reduce rely reminiscent revealed rival said secure " +
    "shortage six supplies Tesla that the tighter to vehicle Volkswagen " +
    "wide would";

  public static void main(String[] args) {
    SpellChecker spellChecker = new SpellChecker();
    spellChecker.printCorrections(writingSample, wordList);
  }

  /**
   * Needs to be implemented
   * @param writingSample is text that contains spelling errors
   * @param wordList contains the words in writingSample, but spelled correctly
   */
  private void printCorrections(String writingSample, String wordList) {

    /*
     * TODO:
     * Use wordList to determine which words in writingSample
     * are misspelled. Use parseWords() and fuzzyCompare()
     * to solve the problem. Output the pairs of misspelled words
     * and correct spellings to the console as shown below.
     * The console output should be as follows:
     *
     * misspelled: "dominaet", suggestion: "dominate"
     * misspelled: "reveeled", suggestion: "revealed"
     * misspelled: "batterees", suggestion: "batteries"
     * misspelled: "remeniscent", suggestion: "reminiscent"
     * misspelled: "Porshe", suggestion: "Porsche"
     * misspelled: "supllies", suggestion: "supplies"
     */

  }

  /**
   * @param text is a writing sample
   * @return a list of the words found in the text.
   * The words are forced to lower case.
   * Example:
   * parseWords("The boy ran fast.") -> ["the", "boy", "ran", "fast"]
   */
  private List<String> parseWords(String text) {
    Pattern pattern = Pattern.compile("\\w+");
    Matcher matcher = pattern.matcher(text);
    List<String> words = new ArrayList<>();
    while (matcher.find()) {
      words.add(matcher.group().toLowerCase());
    }
    return words;
  }

  /**
   * @param word1 is any word
   * @param word2 is any other word to compare with word1
   * @return a number between 0 and 1 where 1 is a perfect match
   * and 0 is not a match at all.
   * Examples:
   * fuzzyCompare("The", "and") -> 0.0
   * fuzzyCompare("School", "Sckool") -> 0.8
   * fuzzyCompare("Fast", "Fast") -> 1.0
   */
  private float fuzzyCompare(String word1, String word2) {
    word1 = word1.toLowerCase();
    word2 = word2.toLowerCase();
    int matchingChars = 0;
    int totalChars = Math.max(word1.length(), word2.length());
    int minChars = Math.min(word1.length(), word2.length());
    for(int i = 0; i< minChars; i++) {
      if(word1.charAt(i) == word2.charAt(i)) {
        matchingChars++;
      }
    }
    return (float) matchingChars/ (float) totalChars;
  }
}
