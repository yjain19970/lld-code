package class03.mergeSortNew;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    //1.  showcase using List<String> that call() method signature changes --> THis happens using something called as Templates in JAVA (Assignment)


    private List<Integer> arrayToSort;

    public MergeSorter(List<Integer> arrayToSort){
        this.arrayToSort = arrayToSort;
    }

    /**
     *
     * we need to to SORT in call method, BUT where is the GIVEN ARRAY ?
     * we need to pass --> USING constructor.
     *
     *
     * Now Sort using MS (RECURSIVE)
     *
     *
     * BASE CASE OF merge sort -->  return
     * in case not sorted, what we need to do... DIVIDE the array
     * find MID element
     *
     *
     */
    @Override
    public List<Integer> call() throws Exception {
        if(arrayToSort.size() <= 1){
            return arrayToSort;
        }

        int mid = arrayToSort.size()/2;

        // NOW CALL RECURSIVE METHODS LEFT AND RIGHT

        List<Integer> leftArray = new ArrayList<>();
        for(int i=0; i<mid;++i){
            leftArray.add(arrayToSort.get(i));
        }

        List<Integer> rightArray = new ArrayList<>();
        for(int i=mid; i<arrayToSort.size();++i){
            rightArray.add(arrayToSort.get(i));
        }

        // HOW DO WE CALL the MERGE SORT?

        MergeSorter leftSorter = new MergeSorter(leftArray);
        MergeSorter rightSorter = new MergeSorter(rightArray);

        ExecutorService executorService = Executors.newCachedThreadPool();

        // CONVERTED TO MULTI THREADING...
//        List<Integer> leftSortedArray = leftSorter.call();
//        List<Integer> rightSortedArray = rightSorter.call();

        Future<List<Integer>> leftSortedArrayFuture = executorService.submit(leftSorter); // FUTURES added here.
        Future<List<Integer>> rightSortedArrayFuture = executorService.submit(rightSorter);

        List<Integer> sortedArray = new ArrayList<>();

        int i=0, j=0;
        List<Integer> leftSortedArray = leftSortedArrayFuture.get();
        List<Integer> rightSortedArray = rightSortedArrayFuture.get();
        /**
         * above is the blocking part, here both of these things were happening in PARALLEL, but now not
         *  in PARALLEL.
         *
         *  CODE WILL NOT GO TO NEXT LINE UNTIL: I HAVE SORTED ARRAY.
         */

        while(i < leftSortedArray.size() && j < rightSortedArray.size()){
            if(leftSortedArray.get(i) < rightSortedArray.get(j)){
                sortedArray.add(leftSortedArray.get(i));
                ++i;
            }else{
                sortedArray.add(rightSortedArray.get(j));
                ++j;
            }
        }

        while(i < leftSortedArray.size()){
            sortedArray.add(leftSortedArray.get(i)); i++;
        }
        while(j < rightSortedArray.size()){
            sortedArray.add(rightSortedArray.get(j)); j++;
        }
        return sortedArray;
    }
}
