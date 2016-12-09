package org.teachingkidsprogramming.section06modelviewcontroller.KatasAndVariations;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ExceptionalAdLibs
{
  public static void main(String[] args)
  {
    String adverb = askAdverb();
    MessageBox.showMessage("The abverb is: " + adverb);
    String edVerb = askEdVerb();
    MessageBox.showMessage("The 'ed' verb is: " + edVerb);
    String bodyPart = askBodyPart();
    MessageBox.showMessage("The body part is: " + bodyPart);
    String currentStory = " I woke " + adverb + "." + " Then I " + edVerb + " my " + bodyPart + ".";
    MessageBox.showMessage(currentStory);
  }
  public static String askBodyPart()
  {
    String bodyPart = MessageBox.askForTextInput("What is the body part?");
    if (bodyPart.isEmpty())
    {
      MessageBox.showMessage("please enter a body part");
      bodyPart = askEdVerb();
    }
    if (bodyPart.matches("[\\d]*"))
    {
      MessageBox.showMessage("No body, no story, pay attention");
      bodyPart = askBodyPart();
    }
    return bodyPart;
  }
  public static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("What is the abverb?");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("please enter a adverb");
      adverb = askAdverb();
    }
    if (adverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("pls enter a abverb");
      adverb = askAdverb();
    }
    return adverb;
  }
  public static String askEdVerb()
  {
    String edVerb = MessageBox.askForTextInput("What is the 'ed' verb?");
    if (edVerb.isEmpty())
    {
      MessageBox.showMessage("please enter a 'ed' verb");
      edVerb = askEdVerb();
    }
    if (edVerb.matches("[\\d]*"))
    {
      MessageBox.showMessage("pls enter a 'ed' verb");
      edVerb = askEdVerb();
    }
    return edVerb;
  }
}