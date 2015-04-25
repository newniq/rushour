
package largestblock;
import java.util.Scanner;


//@author sleepeels

public class Largestblock {
    static int n;
    
    public static int[] findLargestBlock(int[][] m){
        
        int[] bk = new int[3];
        int[][] t = new int[n][n];
        bk[0]=0;
        bk[1]=0;
        bk[2]=1;//max
        int ii,jj;
        
        for(int i=0;i<n;i++){
            int k=1;
            for(int j=0;j<n;j++){
 
                if(m[i][j]==1)
                    t[i][j]=k++;
                else{
                    t[i][j]=0;
                    k=1;
                }
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(t[i][j]>bk[2]&&i+t[i][j]-1<n){
                    for(ii=i+1;ii<i+t[i][j];ii++){
                        int tt=0;
                        for(jj=j-t[i][j]+1;jj<j+1;jj++){
                            if(t[ii][jj]==t[i][j])
                                tt=1;
                        }
                        if(tt==0){
                            System.out.print("failed at"+i+" "+j);
                            System.out.println();
                            break;
                        }
                    }
                    if(ii==i+t[i][j]){
                        bk[2]=t[i][j];
                        bk[0]=i;
                        bk[1]=j-t[i][j]+1;
                    }
                }   
            }
        }
        System.out.print(bk[0]+" ");
        System.out.print(bk[1]+" ");
        System.out.print(bk[2]);
  return bk;
    }


    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[][] block = new int[n][n];
        
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++){
                block[i][j] = input.nextInt();
                System.out.print(" "+block[i][j]+i+j);
            }
        
        findLargestBlock(block);


                
                
    }
    
}
