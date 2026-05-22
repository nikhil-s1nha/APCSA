/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  private static final String IMG_DIR = "/Users/NikhilSinha/Downloads/csa/APCSA/Labs/pix/pixLab/classes/images/";

  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture(IMG_DIR + "beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture(IMG_DIR + "beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  
  public static void testNegate()
  {
    Picture beach = new Picture(IMG_DIR + "beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  
  public static void testGrayscale() {
	  Picture beach = new Picture(IMG_DIR + "beach.jpg");
	    beach.explore();
	    beach.grayscale();
	    beach.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture(IMG_DIR + "caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture(IMG_DIR + "caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  public static void testMirrorHorizontal() {
	    Picture caterpillar = new Picture(IMG_DIR + "caterpillar.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorHorizontal();
	    caterpillar.explore();

  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture(IMG_DIR + "temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  public static void testMirrorArms()
  {
    Picture temple = new Picture(IMG_DIR + "snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture(IMG_DIR + "640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  public static void testFixUnderwater()
  {
    Picture canvas = new Picture(IMG_DIR + "water.jpg");
    canvas.explore();
    canvas.fixUnderwater();
    canvas.explore();
  }
  public static void testMirrorDiagonal() {
	  Picture canvas = new Picture(IMG_DIR + "snowman.jpg");
	  canvas.explore();
	  canvas.mirrorDiagonal();
	  canvas.explore();  
  }
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture(IMG_DIR + "swan.jpg");
    swan.explore();
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test and comment out the ones you don't want to run
	  
	  // Uncomment the ones that say "already implemented" and see how they run.
	  // Examine the code for each of the ones that are already implemented.
	  // One at a time, create and implement the rest of the methods.
	  // Uncomment the call to each method that you implement, and run it.
	  
//    testZeroBlue(); // already implemented
//    testKeepOnlyBlue(); //m
//    testKeepOnlyRed();
//    testKeepOnlyGreen();
//    testNegate(); //m
//    testGrayscale();
//    testFixUnderwater(); //m
//    testMirrorVertical(); // already implemented
//    testMirrorVerticalRightToLeft(); //m
//    testMirrorHorizontal();
//    testMirrorHorizontalBotToTop();
//    testMirrorDiagonal();
//    testMirrorTemple(); // already implemented
//    testMirrorArms(); //m
//    testMirrorGull();
//    testCollage(); // already implemented
//    testCopy();
//    testEdgeDetection(); // already implemented
//    testEdgeDetection2();
//    testChromakey();
//    testEncodeAndDecode();
//    testGetCountRedOverValue(250);
//    testSetRedToHalfValueInTopHalf();
//    testClearBlueOverValue(200);
//    testGetAverageForColumn(0);
  }
}