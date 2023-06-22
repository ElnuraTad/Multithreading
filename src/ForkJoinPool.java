//import java.util.concurrent.RecursiveTask;
//
//public class ForkJoinPool {
//    public static void main(String[] args) {
//        System.out.println(Runtime.getRuntime().availableProcessors());
//
//        int[] list = new int[10000];
//        for (int i = 0; i < 10000; i++)
//            list[i] = (int)(Math.random() * 10000);
//        System.out.println(findMax(list));
//    }
//
//    private static int findMax(int[] list) {
//        RecursiveTask<Integer> recursiveTask = new FindingMax(0, list.length, list);
//            }
//        }
//
//        class FindingMax extends RecursiveTask<Integer>{
//    int l;
//    int r;
//    int [] list;
//
//            public FindingMax(int l, int r, int[] list) {
//                this.l = l;
//                this.r = r;
//                this.list = list;
//            }
//
//            @Override
//            protected Integer compute() {
//               if(r - l < 1000){
//                   int curr_max = 0;
//                   for (int i = l; i < r; i++) {
//                       curr_max = Math.max(curr_max, list[i]);
//                       return curr_max;
//                   }else{
//                       RecursiveTask<Integer> left = n
//            }
//        }
//}
//}
