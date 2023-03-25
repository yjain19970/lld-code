package class03;

import class03.mergeSortNew.MergeSorter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorterTask implements Callable<List<Integer>> {

    private List<Integer> arrayToSort;
    private ExecutorService executorService;
    public MergeSorterTask(List<Integer> arrayToSort,
                           ExecutorService executorService) {
        this.arrayToSort = arrayToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
            if(arrayToSort.size() <=1){
                return arrayToSort;
            }

            // calculate mid
            int mid = arrayToSort.size()/2;
            List<Integer> leftArray = new ArrayList<>();
            for(int i=0;i<mid;i++){
                leftArray.add(arrayToSort.get(i));
            }
            List<Integer> rightArray = new ArrayList<>();
            for(int i=mid;i<arrayToSort.size();i++){
                 rightArray.add(arrayToSort.get(i));
            }

        MergeSorterTask leftSorter = new MergeSorterTask(leftArray, executorService);
        MergeSorterTask rightSorter = new MergeSorterTask(rightArray, executorService);



        // calling the same task again.
        Future<List<Integer>> leftSortedArrayFuture = executorService.submit(leftSorter);
        Future<List<Integer>> rightSortedArrayFuture = executorService.submit(rightSorter);

        // I have the sorted arrays with me,
        List<Integer> sortedArray = new ArrayList<>();
        // HOW DO WE MERGE ARRAYS IN MS?
        // using 2pointers.

        List<Integer>  leftSortedArray = leftSortedArrayFuture.get(); // blocking
        List<Integer>  rightSortedArray = rightSortedArrayFuture.get(); // blocking
        int i=0, j=0;
        while(i< leftSortedArray.size() && j < rightSortedArray.size()){
            if(leftSortedArray.get(i) < rightSortedArray.get(j)){
                    sortedArray.add(leftSortedArray.get(i));
                    i++;
            }else{
                sortedArray.add(rightSortedArray.get(j));
                j++;
            }
        }
        while(i<leftSortedArray.size()){
            sortedArray.add(leftSortedArray.get(i));
            i++;
        }
        while(j<rightSortedArray.size()){
            sortedArray.add(rightSortedArray.get(j));
            j++;
        }
        return sortedArray;
    }
}
