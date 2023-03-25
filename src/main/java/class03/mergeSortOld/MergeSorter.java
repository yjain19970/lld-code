package class03.mergeSortOld;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

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


        List<Integer> leftSortedArray = leftSorter.call();
        List<Integer> rightSortedArray = rightSorter.call();

        // WE have gotten the sorted arrays. We need to merge them Now

        List<Integer> sortedArray = new ArrayList<>();
        // USING TWO POINTERS

        int i=0, j=0;

        while(i < leftSortedArray.size() && j < rightSortedArray.size()){
            if(leftSortedArray.get(i) < rightSortedArray.get(j)){
                sortedArray.add(leftSortedArray.get(i));
                ++i;
            }else{
                sortedArray.add(rightSortedArray.get(j));
                ++j;
            }
        }

        // WHAT ELSE? --> check for remaining half
        while(i < leftSortedArray.size()){
            sortedArray.add(leftSortedArray.get(i)); i++;
        }

        while(j < rightSortedArray.size()){
            sortedArray.add(rightSortedArray.get(j)); j++;
        }

        // now return --> LEts go to CLIENT
        return sortedArray;
    }
}
