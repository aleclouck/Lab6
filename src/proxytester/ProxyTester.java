
package proxytester;

import javax.swing.*;

/**
   This program demonstrates the use of the image proxy.
   Images are only loaded when you press on a tab.
*/
public class ProxyTester
{
   public static void main(String[] args)
   {
      JTabbedPane tabbedPane = new JTabbedPane();
      for (String name : imageNames)
      {
         JLabel label = new JLabel(new ImageProxy(name));
         tabbedPane.add(name, label);
      }

      JFrame frame = new JFrame();
      frame.add(tabbedPane);

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }

   private static final String[] imageNames =
   {
      "one.gif",
      "two.gif",
      "three.gif",
      "four.gif",
      "five.gif",
      "six.gif",
      "seven.gif",
      "eight.gif"
   };

   private static final int FRAME_WIDTH = 500;
   private static final int FRAME_HEIGHT = 300;
}
