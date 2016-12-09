package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    String currentAdverb = MessageBox.askForTextInput("Please enter a 'adverb'.");
    String currentEdVerb = MessageBox.askForTextInput("Please enter a verb ending in 'ed'.");
    String currentBodyPart = MessageBox.askForTextInput("Please enter a body part.");
    String currentStory = "Today"; //model
    currentStory = currentStory + " I woke " + currentAdverb + "."; //controller
    currentStory = currentStory + " Then I " + currentEdVerb + ".";
    currentStory = currentStory + " My " + currentBodyPart + ".";
    MessageBox.showMessage(currentStory); //view
  }
}