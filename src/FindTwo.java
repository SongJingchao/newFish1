
import java.util.ArrayList;
public class FindTwo {
    //两个数的和为S, 则这两个数一定一个比s/2大,一个比s/2小.
    public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        int i=0;
        int j=array.length-1;
        ArrayList<Integer> list = new ArrayList<>();
        while(array[i]<(sum/2) && array[j]>(sum/2)){
            if(array[i]+array[j]==sum){
                list.add(array[i]);
                list.add(array[j]);
                break;
            }else if(array[i]+array[j]>sum){
                j--;
            }else
                i++;
            System.out.println(i+"."+j);
        }
        return list;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,4,7,11,15};
        int num = 15;
        ArrayList<Integer> list = new ArrayList<>();
        list = FindNumbersWithSum(arr,num);
        System.out.println(list.toString());
        String s = "";

    }
}
