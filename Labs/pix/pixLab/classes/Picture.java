import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  public void keepOnlyBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setGreen(0);
        pixelObj.setRed(0);
      }
    }
  }
  public void negate() {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] rowArray : pixels) {
		  for(Pixel pixelObj : rowArray) {
			  pixelObj.setBlue(255 - pixelObj.getBlue());
			  pixelObj.setRed(255 - pixelObj.getRed());
			  pixelObj.setGreen(255 - pixelObj.getGreen());
		  }
	  }
  }
  public void grayscale() {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] rowArray : pixels) {
		  for(Pixel p : rowArray) {
			  int avg = p.getBlue() + p.getGreen() + p.getRed();
			  avg /= 3;
			  p.setBlue(avg);
			  p.setRed(avg);
			  p.setGreen(avg);
		  }
	  }
  }
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  public void mirrorVerticalRightToLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;

    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = width / 2; col < width; col++)
      {
        rightPixel = pixels[row][col];
        leftPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    }
  }
  public void mirrorHorizontal()
  {
      Pixel[][] pixels = this.getPixels2D();
      Pixel topPixel = null;
      Pixel bottomPixel = null;
      int height = pixels.length;
      int width = pixels[0].length;

      for (int row = 0; row < height / 2; row++)
      {
          for (int col = 0; col < width; col++)
          {
              topPixel = pixels[row][col];
              bottomPixel = pixels[height - 1 - row][col];
              bottomPixel.setColor(topPixel.getColor());
          }
      }
  }  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    for (int row = 27; row < 97; row++)
    {
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  public void mirrorArms() {
	    Pixel[][] pixels = this.getPixels2D();

	    int mirrorRow1 = 193;
	    for (int row = 155; row <= 193; row++) {
	        int reflectedRow = 2 * mirrorRow1 - row;
	        for (int col = 104; col <= 172; col++) {
	            pixels[reflectedRow][col].setColor(pixels[row][col].getColor());
	        }
	    }

	    int mirrorRow2 = 198;
	    for (int row = 173; row <= 198; row++) {
	        int reflectedRow = 2 * mirrorRow2 - row;
	        for (int col = 233; col <= 297; col++) {
	            pixels[reflectedRow][col].setColor(pixels[row][col].getColor());
	        }
	    }
	}
  
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  public void fixUnderwater()
  {
      Pixel[][] pixels = this.getPixels2D();
      Pixel pixel = null;
      
      for (int row = 0; row < pixels.length; row++) {
          for (int col = 0; col < pixels[0].length; col++) {
              pixel = pixels[row][col];
              int red = pixel.getRed();
              int green = pixel.getGreen();
              int blue = pixel.getBlue();
              
              pixel.setBlue(blue - 10);
              pixel.setGreen(green - 40);
              pixel.setRed(red * 3);
              
          }
      }
  }
  
  public void mirrorDiagonal() {
	    Pixel[][] pixels = this.getPixels2D();
	    Pixel sourcePixel = null;
	    Pixel targetPixel = null;
	    int height = pixels.length;
	    int width = pixels[0].length;
	    int size = Math.min(height, width);
	    for (int row = 0; row < size; row++) {
	        for (int col = 0; col < row; col++) {
	            sourcePixel = pixels[row][col];
	            targetPixel = pixels[col][row];
	            targetPixel.setColor(sourcePixel.getColor());
	        }
	    }
	}

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    String imgDir = "/Users/NikhilSinha/Downloads/csa/APCSA/Labs/pix/pixLab/classes/images/";
    Picture flower1 = new Picture(imgDir + "flower1.jpg");
    Picture flower2 = new Picture(imgDir + "flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write(imgDir + "collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  /*public static void main(String[] args) 
  {
    Picture beach = new Picture("/Users/NikhilSinha/Downloads/csa/APCSA/Labs/pix/pixLab/classes/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }*/
  
} // this } is the end of class Picture, put all new methods before this