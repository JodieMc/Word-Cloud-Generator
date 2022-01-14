package ie.gmit.dip;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.imageio.ImageIO;

/**
 * @author Josephine Mc Crann
 * @version 1.0
 * @since 1.8
 * 
 *        WordCloudGenerator generates a simple word cloud
 */

public class WordCloudGenerator {

	public void generator(Map<String, Integer> frequency, List<Integer> values) throws Exception{//running time: O(n^2)
		
		String word = null;
		int X;
		int Y;
		
		BufferedImage image = new BufferedImage(600, 500, BufferedImage.TYPE_4BYTE_ABGR);/* Create an 'easel' for the image, a buffered image can be written to
																							in memory and saved as a PNG
																							*/
		Graphics graphics = image.getGraphics();//Create a canvas for the image
		FrequencyTableBuilder ftb = new FrequencyTableBuilder();//Use the frequency table
		Random r = new Random();
		word = ftb.getKey(frequency, values.get(i)); /* Retrieve the word from the HashMap in FrequencyTableBuilder 
													 * using the key value pairs
													 */		
		
		Font font = new Font(Font.BOLD, 62);
			
		
		Fonts  myFont = Fonts.Arial //Use enums for fonts
		
		Colors myColor = Colors.BLUE;//Use enum for colors
		Colors myColor = Colors.BLUE;
		
		word = f.getKey(frequency, values.get(i));//Getting the word using the current value, the word is retrieved from the HashMap in frequencyTable class.
		X = 0; //Set starting point for image
		Y = 100;
	
		graphics.setColor();
		graphics.drawString(word, x, y);
	
		x += incrementX;
		i++;
	
		{
			int i = 0;
			if(i >= UserMenu.maxWords) {
		break;
		
	
			}
	
			graphics.dispose();
			ImageIO.write(image, "png", new File(UserMenu.imageName)); //Create the image
		}
	}
}
