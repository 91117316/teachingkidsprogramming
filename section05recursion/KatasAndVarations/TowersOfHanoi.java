package org.teachingkidsprogramming.section05recursion.KatasAndVarations;

public class TowersOfHanoi
{
  //fields
  public static int index;
  public static void main(String[] args)
  {
    //create some variables(final means they didn't change after initialization)
    final int NUM_DISCS = 4;//NUM of discs
    final int FROM_PEG = 1; //initial 'from' peg
    final int TO_PEG = 3;//initial 'to' peg
    final int TEMP_PEG = 2;//initial 'temp' peg
    // Play game
    moveDiscs(NUM_DISCS, FROM_PEG, TO_PEG, TEMP_PEG);
    System.out.println("\n All the discs are moved!");
  }
  private static void moveDiscs(int num, int fromPeg, int toPeg, int tempPeg)
  {
    if (num > 0)
    {
      moveDiscs(num - 1, fromPeg, tempPeg, toPeg);
      index++;
      System.out.println(index + ". Move a disc from peg " + fromPeg + " to peg " + toPeg);
      moveDiscs(num - 1, tempPeg, toPeg, fromPeg);
    }
  }
}
