/******************************************************************************

This program demonstrates various regex symbols and patterns, including:

Task:
1.  \w: Word character (alphanumeric + underscore)
2.  \d: Digit
3.  \s: Whitespace character
4.  \b: Word boundary
5.  ^: Beginning of a line
6.  $: End of a line
7.  .: Any character except a newline
8.  *: Zero or more repetitions
9.  +: One or more repetitions
10. ?: Zero or one repetition
11. {n}: Exactly n repetitions
12. {n,m}: Between n and m repetitions
13. (...): Grouping and capturing
14. |: Alternation (OR)
15. [abc]: Character class
16. [^abc]: Negation in character classes

*******************************************************************************/

import java.util.*;
import java.util.regex.*;

class SingleHandOn {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        String text = x.nextLine();

        // Task - 1
        System.out.println("Matching a single character: ");
        matchAndPrint("\\w", text); // (alphanumeric + underscore)

        // Task - 2 
        System.out.println("\nMatching a digit: ");
        matchAndPrint("\\d", text); //  (0-9)

        // Task - 3
        System.out.println("\nMatching a whitespace character: ");
        matchAndPrint("\\s", text); // (spaces, tabs, line breaks)

        // Task - 4
        System.out.println("\nMatching a word boundary: ");
        matchAndPrint("\\bword\\b", text); //  "word" with word boundaries

        // Task - 5
        System.out.println("\nMatching the beginning of a line: ");
        matchAndPrint("^The", text); // Begin with "the"

        // Task - 6
        System.out.println("\nMatching the end of a line: ");
        matchAndPrint("man\\.$", text); // "man." at the end of the line

        // Task - 7
        System.out.println("\nMatching any character: ");
        matchAndPrint("N.in", text);// matchs N(*x characters)in

        // Task - 8
        System.out.println("\nMatching zero or more repetitions: ");
        matchAndPrint("go*", text); // start with g and o with more times (0 - x times)

        // Task - 9
        System.out.println("\nMatching one or more repetitions: ");
        matchAndPrint("o+", text); // one or more "o"s

        // Task - 10
        System.out.println("\nMatching zero or one repetition: ");
        matchAndPrint("Nit?", text); // Ni is must and t is optional

        // Task - 11
        System.out.println("\nMatching a specific number of repetitions: ");
        matchAndPrint("\\d{3}", text); // Exactly 3 digits

        // Task - 12
        System.out.println("\nMatching a range of repetitions: ");
        matchAndPrint("\\d{2,4}", text); // Between 2 and 4

        // Task - 13
        System.out.println("\nGrouping and capturing: ");
        matchAndPrint("(\\w+)\\s(Nithin)", text); // Word with space and "Nithin"

        // Task - 14
        System.out.println("\nAlternation: ");
        matchAndPrint("Men|Man", text); // Word with Men or Man

        // Task - 15
        System.out.println("\nCharacter classes: ");
        matchAndPrint("[aeiou]", text); // Any 1 vowel

        // Task - 16
        System.out.println("\nNegation in character classes: ");
        matchAndPrint("[^aeiou]", text); // no vowel
    }

    private static void matchAndPrint(String regex, String text) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("Found: " + matcher.group() + " at position " + matcher.start());
        }
    }
}
