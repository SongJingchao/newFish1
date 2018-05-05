import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MinNum {
    public static String PrintMinNumber(int [] numbers){
        int n=numbers.length;
        String s ="";
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            list.add(numbers[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer str1, Integer str2) {
                String s1 = str1+""+str2;
                String s2 = str2+""+str1;
                return s1.compareTo(s2);
            }
        });

        for(int j:list){
            s+=j;
        }
        return s;

    }

    public static void main(String[] args) {
        int [] numbers = {4,24,8};
        String a =PrintMinNumber(numbers);
        System.out.println(a);
    }
}
