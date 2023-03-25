package class03.mergeSortNew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

     public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<Integer>(
                Arrays.asList(7,3,4,1,9,2,6));
        ExecutorService executorService = Executors.newCachedThreadPool();
        // create MergeSorter
        MergeSorter mergeSorter = new MergeSorter(list);
        // returns the FUTURE TO client. WHEN you need it, YOU WILL GET IT.
        Future<List<Integer>> sortedListFuture = executorService.submit(mergeSorter);


        System.out.println(sortedListFuture.get());

        // WE NEED TO CHANGE IN MERGE SORTED CODE AS WELL.  (Line 58)

    }
}
