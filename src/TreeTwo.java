import java.util.Scanner;

public class TreeTwo {

    int val;
    TreeTwo left;
    TreeTwo right;
    TreeTwo(int x){val=x;}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(s);


    }

    public TreeTwo reConstructBinaryTree(int [] pre, int [] in){
        TreeTwo root = reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    private TreeTwo reConstructBinaryTree(int []pre,int startPre,int endPre,int [] in,int startIn, int endIn){
        if(startPre > endPre || startIn>endIn)
            return null;
        TreeTwo root = new TreeTwo(pre[startPre]);
        for (int i=startIn;i<=endIn;i++){
            if(in[i]==pre[startPre]){
                root.left=reConstructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                root.right=reConstructBinaryTree(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
                break;

            }
        }
        return root;

    }
}
