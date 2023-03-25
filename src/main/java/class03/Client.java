package class03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>(Arrays.asList(7,3,4,8,1,2,0));
        ExecutorService executorService = Executors.newCachedThreadPool();
        // create the object of my task
        MergeSorterTask task = new MergeSorterTask(list, executorService);

        Future<List<Integer>> resultFuture = executorService.submit(task); // making our code multi threaded....

        System.out.println(resultFuture.get());

    }
}
