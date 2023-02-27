import java.util.*;
public class SnailPatter{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[][]={{1,2,3},
                {4,5,6},
                {7,8,9}};
        int rs=0;
        int re=arr.length-1;
        int cs=0;
        int ce=arr.length-1;
while(rs<=re&&cs<=ce){
        for(int i=cs;i<=ce;i++){
            System.out.print(arr[rs][i]+" ");
        }
        rs++;
        for(int i=rs;i<=re;i++){
            System.out.print(arr[i][ce]+" ");
        }
        ce--;
        for(int i=ce;i>=cs;i--){
            System.out.print(arr[re][i]+" ");
        }
        re--;
        for(int i=re;i>=rs;i--){
            System.out.print(arr[i][cs]+" ");
        }
        cs++;
    }



    }
}