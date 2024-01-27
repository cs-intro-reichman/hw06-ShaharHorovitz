import java.awt.Color;

public class Editor4 
{
    public static void main (String[] args) {
		String source = args[0]; //gets the image name
		int n = Integer.parseInt(args[1]); //gets the number of steps
		Color[][] sourceImage = Runigram.read(source);
		Color[][] targetImage = Runigram.grayScaled(sourceImage); 
		Runigram.setCanvas(sourceImage);
		Runigram.morph(sourceImage, targetImage, n);
	}    
}
