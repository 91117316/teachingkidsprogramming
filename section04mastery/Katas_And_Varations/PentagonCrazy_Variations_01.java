package org.teachingkidsprogramming.section04mastery.Katas_And_Varations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class PentagonCrazy_Variations_01
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    createColorPalette();
    drawPentagon();
  }
  private static void drawPentagon()
  {
    for (int i = 0; i < 1000; i++)
    {
      adjustPen();
      Tortoise.move(i);
      int sides = 4;
      Tortoise.turn(360 / sides);
      Tortoise.turn(1);
    }
  }
  private static void adjustPen()
  {
    Tortoise.setPenColor(ColorWheel.getNextColor());
    Tortoise.setPenWidth(Tortoise.getPenWidth() + 3.0);
    if (Tortoise.getPenWidth() > 4)
    {
      Tortoise.setPenWidth(1.0);
    }
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(PenColors.Reds.Crimson);
    ColorWheel.addColor(PenColors.Oranges.DarkOrange);
    ColorWheel.addColor(PenColors.Yellows.Gold);
    ColorWheel.addColor(PenColors.Greens.DarkGreen);
    ColorWheel.addColor(PenColors.Blues.Cyan);
    ColorWheel.addColor(PenColors.Purples.MediumVioletRed);
  }
}
