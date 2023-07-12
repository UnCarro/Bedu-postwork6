import java.util.ArrayList;

public class BubbleSort {

    //Algorithm
    // Collections API approach ==> Redundant but funnier :^)

    ArrayList<Integer> sort(ArrayList<Integer> input) {

        int firstIteration;
        int innerIteration;
        int temp;
        int collectionSize = input.size();

        boolean isSwapped;
        for (firstIteration = 0; firstIteration < collectionSize - 1; firstIteration++) {
            isSwapped = false;
            for (innerIteration = 0; innerIteration < collectionSize - firstIteration - 1; innerIteration++) {
                if (input.get(innerIteration) > input.get(innerIteration + 1)) {
                    temp = input.get(innerIteration);
                    input.set(innerIteration, input.get(innerIteration + 1));
                    input.set(innerIteration + 1, temp);
                    isSwapped = true;
                }
            }
            if (!isSwapped)
                break;
        }
        return input;
    }
}