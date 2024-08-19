public class Misaligned {
 static void printColorCodePairToConsole(int colorCode, String majorColor, String minorColor){
 
   System.out.printf("%d | %s |%s\n",colorCode, majorColor,minorColor);
 }

    static int printColorMap(Function<int,String,String,void>printerFnRef) {
        String majorColors[] = {"White", "Red", "Black", "Yellow", "Violet"};
        String minorColors[] = {"Blue", "Orange", "Green", "Brown", "Slate"};
        int i = 0, j = 0;
        for(i = 0; i < 5; i++) {
            for(j = 0; j < 5; j++) {
                printerFunction.apply("%d | %s | %s\n", i * 5 + j, majorColors[i], minorColors[i]);
            }
        }
        return i * j;
    }
	
	static ArrayList<String> captruredColorCodePairs=new ArrayList<String>();
	
	
	static void captureColorCodePair(int colorCode,String majorColor,String minorColor){
	String colorCodePair=colorCode+" | "+majorColor +"  \ " + minorColor;
	capturedColorCodePairs.add(colorCodePair);
	}
	
	static void testColorMapping(){
	static ArrayList<String> expectedColorCodePairs=new ArrayList<String>();
	 expectedColorCodePairs.add("1 | White | Blue");
        expectedColorCodePairs.add("2 | White | Orange");
        expectedColorCodePairs.add("3 | White | Green");
        expectedColorCodePairs.add("4 | White | Brown");
        expectedColorCodePairs.add("5 | White | Slate");
        expectedColorCodePairs.add("6 | Red | Blue");
        expectedColorCodePairs.add("7 | Red | Orange");
        expectedColorCodePairs.add("8 | Red | Green");
        expectedColorCodePairs.add("9 | Red | Brown");
        expectedColorCodePairs.add("10 | Red | Slate");
        expectedColorCodePairs.add("11 | Black | Blue");
        expectedColorCodePairs.add("12 | Black | Orange");
        expectedColorCodePairs.add("13 | Black | Green");
        expectedColorCodePairs.add("14 | Black | Brown");
        expectedColorCodePairs.add("15 | Black | Slate");
        expectedColorCodePairs.add("16 | Yellow | Blue");
        expectedColorCodePairs.add("17 | Yellow | Orange");
        expectedColorCodePairs.add("18 | Yellow | Green");
        expectedColorCodePairs.add("19 | Yellow | Brown");
        expectedColorCodePairs.add("20 | Yellow | Slate");
        expectedColorCodePairs.add("21 | Violet | Blue");
        expectedColorCodePairs.add("22 | Violet | Orange");
        expectedColorCodePairs.add("23 | Violet | Green");
        expectedColorCodePairs.add("24 | Violet | Brown");
        expectedColorCodePairs.add("25 | Violet | Slate");
	
	int result=printColorMap(Misaligned::captureColorCodePair);
	  assert(!capturedColorCodePairs.equals(expectedColorCodePairs)) : "Test should fail due to misalignment!";
	System.out.println("All is well(maybe!)");
	}
	
    public static void main(String[] args) { 
		testColorMapping();
      
    }
}
