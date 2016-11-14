package org.teachingkidsprogramming.section04mastery.Katas_And_Varations;

import java.awt.Color;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class DigiFlower_Variations_01
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.Silver);
    Tortoise.setPenWidth(3);
    createColorPalette();
    for (int i = 0; i < 15; i++)
    {
      drawOctagon();
      Tortoise.turn(360 / 15);
    }
    drawOctagon();
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Samuel and Earvin");
  }
  private static void createColorPalette()
  {
    Color color1 = PenColors.Blues.Aquamarine;
    Color color2 = PenColors.Greens.OliveDrab;
    Color color3 = PenColors.Yellows.Gold;
    Color color4 = PenColors.Purples.Fuchsia;
    ColorWheel.addColor(color1);
    ColorWheel.addColor(color2);
    ColorWheel.addColor(color3);
    ColorWheel.addColor(color4);
    ColorWheel.addColor(color4);
    ColorWheel.addColor(color3);
    ColorWheel.addColor(color2);
    ColorWheel.addColor(color1);
  }
  private static void drawOctagon()
  {
    for (int i = 0; i < 8; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.move(100);
      Tortoise.turn(360 / 8);
    }
  }
}
