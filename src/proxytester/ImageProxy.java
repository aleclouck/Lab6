
package proxytester;
import java.awt.*;
import javax.swing.*;

/**
   A proxy for delayed loading of image icons.
*/
public class ImageProxy implements Icon
{
   /**
      Constructs a proxy for delayed loading of an image file.
      @param name the file name
   */
   public ImageProxy(String name)
   {
      this.name = name;
      image = null;
   }

   @Override
   public void paintIcon(Component c, Graphics g, int x, int y)
   {
      ensureImageLoaded();
      image.paintIcon(c, g, x, y);
   }

   @Override
   public int getIconWidth()
   {
      ensureImageLoaded();
      return image.getIconWidth();
   }

   @Override
   public int getIconHeight()
   {
      ensureImageLoaded();
      return image.getIconHeight();
   }

   /**
      Loads the image if it hasn't been loaded yet. Prints
      a message when the image is loaded.
   */
   private void ensureImageLoaded()
   {
      if (image == null)
      {
         System.out.println("Loading " + name);
         image = new ImageIcon(name, "description");
      }
   }

   private String name;
   private ImageIcon image;
}
