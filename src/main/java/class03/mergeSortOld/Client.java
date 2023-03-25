package class03.mergeSortOld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<Integer>(
                Arrays.asList(7,3,4,1,9,2,6,0));

        ExecutorService executorService = Executors.newCachedThreadPool();

        // create MergeSorter
        MergeSorter mergeSorter = new MergeSorter(list);

        // call the fund
        List<Integer> sortedList = mergeSorter.call(); // THIS IS THE REASON IT IS NOT MULTI THREADED...
        //Future<List<Integer>> sortedList = executorService.submit(mergeSorter);
        System.out.println("sorted array is: "+ sortedList);
        /**
         * Will this work??
         *
         */
        // This is NOT MULTI-THREADED --> WHY?
        // Calling call() doesn't create code as multi threaded, for that we need to use executor GO TO LINE 12

        /**
         * CALLING call method by default doesnt mean it is multi threaded, instead try creating
         * an executor service. (Line 15)
         *
         * NOW FOLLOW BELOW, after line 19.
         */

        Future<List<Integer>> sortedListt = executorService.submit(mergeSorter);
        /**
         * Now in execute a particular task, it should HAPPEN INDEPENDENT OF MAIN CLIENT...
         *  THEN, how will executor give you a list of integer? If this has not even sorted yet.
         *      because it has not sorted.
         *
         *     BREAK 5mins
         *  How to run this code in multi threaded way.
         */



    }
}
