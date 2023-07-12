import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.Arrays;



public class BubbleSortTest {

    @Test
    @DisplayName("Empty Array")
    public void emptyArray(){
        BubbleSort bubbleSort = new BubbleSort();
        ArrayList<Integer> actualResult = bubbleSort.sort(new ArrayList<>());
        ArrayList<Integer> expectedResult = new ArrayList<>();
        Assertions.assertEquals(expectedResult, actualResult);
        System.out.println("Expected: " + expectedResult);
        System.out.println("Actual: " + actualResult);
    }

    @Test
    @DisplayName("Happy Path")
    public void happyPath(){
        BubbleSort bubbleSort = new BubbleSort();
        ArrayList<Integer> actualResult = bubbleSort.sort(new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7)));
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7));
        Assertions.assertEquals(expectedResult, actualResult);
        System.out.println("Expected: " + expectedResult);
        System.out.println("Actual: " + actualResult);
    }

    @Test
    @DisplayName("Scrambled path")
    public void scrambledPath(){
        BubbleSort bubbleSort = new BubbleSort();
        ArrayList<Integer> actualResult = bubbleSort.sort(new ArrayList<>(Arrays.asList(0,7,5,3,4,1,6,2)));
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7));
        Assertions.assertEquals(expectedResult, actualResult);
        System.out.println("Expected: " + expectedResult);
        System.out.println("Actual: " + actualResult);
    }

    @Test
    @DisplayName("Negative Values")
    public void negativeValues(){
        BubbleSort bubbleSort = new BubbleSort();
        ArrayList<Integer> actualResult = bubbleSort.sort(new ArrayList<>(Arrays.asList(-6, 23, 46, 45, 0)));
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(-6, 0, 23, 45,46));
        Assertions.assertEquals(expectedResult, actualResult);
        System.out.println("Expected: " + expectedResult);
        System.out.println("Actual: " + actualResult);
    }

    @Test
    @DisplayName("Not Equals Values")
    public void notEquals(){
        BubbleSort bubbleSort = new BubbleSort();
        ArrayList<Integer> actualResult = bubbleSort.sort(new ArrayList<>(Arrays.asList(-6, 23, 46, 45, 0)));
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(-6, 0, 45,46));
        Assertions.assertNotEquals(expectedResult, actualResult);
        System.out.println("Expected: " + expectedResult);
        System.out.println("Actual: " + actualResult);
    }


}
