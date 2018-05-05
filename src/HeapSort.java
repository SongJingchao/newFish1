import java.util.Arrays;

public class HeapSort {
    /*
    堆排序:
        堆的定义如下: n个元素的序列(k1,k2,....kn) 当且仅当满足如下关系时,称之为堆
        ki <= k(2i) 或 ki>=k(2i)
        ki <= k(2i+1) 或 ki>=k(2i+1)
       如果把序列对应的二维数组看成一个完全二叉树, 那么堆的含义是:
            完全二叉树中任何一个非叶子节点的值均不大于(或不小于)其左右孩子节点的值.

        可以用大顶堆进行升序排序, 小顶堆进行降序排序.
        (用大顶堆得到未排序序列中最大的值后,把其最大值与未排序序列的最后一个元素进行交换,所以每次比较最大的都在后面排列,
            所以是升序排序)

        步骤:  1,建立堆,  2,交换
     */

    public static void heapSort(int [] arr){
        for(int i=arr.length;i>0;i--){
            max_heapify(arr,i);

            int temp = arr[0];
            arr[0] = arr[i-1];
            arr[i-1] = temp;
        }
    }

    public static void max_heapify(int [] arr,int limit){
        if(arr.length <=0 || arr.length < limit) return;
        int parentIdx = limit /2;
        for(;parentIdx >=0;parentIdx--){
            if(parentIdx *2 >= limit)
                continue;
            int left = parentIdx *2;
            int right = (left+1) >= limit ? left : (left+1) ; //右子节点位置,如果没有右节点,默认为左节点

            int maxChildId = arr[left] >= arr[right] ? left:right;
            if(arr[maxChildId] > arr[parentIdx]){
                int temp=arr[parentIdx];
                arr[parentIdx] = arr[maxChildId];
                arr[maxChildId] = temp;
            }
        }
        System.out.println("Sorting:"+ Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int [] arr={3,6,8,1,23,9,5,32,5};
        heapSort(arr);
    }
}
