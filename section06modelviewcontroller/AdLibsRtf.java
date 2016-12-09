package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingextensions.logo.utils.MVCUtils.Parser;
import org.teachingextensions.logo.utils.MVCUtils.Viewer;

public class AdLibsRtf
{
  public static class Words
  {
    private String adverb;
    private String edVerb;
    private String bodyPart;
  }
  public static void main(String[] args)
  {
    //MVC - Model View Controller
    Words words = new Words(); //model
    words.adverb = MessageBox.askForTextInput("pls enter an adverb");
    words.edVerb = MessageBox.askForTextInput("pls enter a 'ed' verb");
    words.bodyPart = MessageBox.askForTextInput("pls enter a body part");
    String currentStory = Parser.parseRtfFile("view.rtf", words); // controller
    Viewer.displayRtfFile(currentStory); //view
  }
}