/*
 * CODE KATA
 * Small web shop would have a selection of cakes.
 *
 * Create a small dataset, for each cake have the following:
 * -> Name, Price, Vegan or not, A fun decorative emoji
 *
 * 1. The program should randomly show a cake on each run.
 * 2. The user can input an emoji and get a matching cake, if it exists.
 * 3. User enters a word, selects Vegan (yes or no), get a list of matches.
 *
 * Every time the result shows a total cost.
 */

 /* Example dataset:

Flavor, Vegan, Price, Emoji
---------------------------
Cinnamon, V, 2.00, 🦄
Berry, V, 3.50, ⛳
Chocolate, NV, 6.00, 🪢

    Example input --> output:

[empty] --> random cake
🪢 --> Chocolate = 6.00
berry --> Berry = 3.50
c --> Cinnamon, Chocolate = 8.00
NV --> Chocolate = 6.00
V --> Cinammon, Berry = 5.50

  */

public class main {

  public static void main(String[] args) {
    System.out.println("Hello World");
  }

}
