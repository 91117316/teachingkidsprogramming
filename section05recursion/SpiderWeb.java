package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class SpiderWeb
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setPenWidth(1);
    Tortoise.setAnimal(Animals.Spider);
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.getBackgroundWindow().setColor(PenColors.Grays.Black);
    Double lengthOfLine = 10.5;
    Double zoom = 1.1;
    for (int i = 0; i < 10; i++)
    {
      lengthOfLine = weaveOneLayer(lengthOfLine, zoom);
      zoom = zoom * 1.3;
    }
  }
  private static Double weaveOneLayer(Double lengthOfLine, Double zoom)
  {
    for (int i = 0; i < 6; i++)
    {
      drawTriangle(lengthOfLine);
      Tortoise.turn(360 / 6);
      lengthOfLine = lengthOfLine + zoom;
    }
    return lengthOfLine;
  }
  private static void drawTriangle(Double lengthOfLine)
  {
    for (int i = 0; i < 3; i++)
    {
      Tortoise.move(lengthOfLine);
      Tortoise.turn(360 / 3);
    }
  }
}
