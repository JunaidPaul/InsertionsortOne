/**
 * Hacker rank programming challenge 5
 * @author JunaidePaul
 */
import java.util.Scanner;
public class InsertionSortOne {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        size=input.nextInt();
        if (size>=1 && size<=1000){
        int[] values=new int[size];
        for (int i=0;i<size;i++){
            values[i]= input.nextInt();
        }
        int key=values[size-1];
        for (int i=size-2;i>=0;i--){
            if (values[i]>key && i!=0){
                values[i+1]= values[i];
            }
            if (values[i]>key && i==0){
                values[i+1]=values[i];
                for (int j=0;j<size;j++){
                    System.out.print(values[j]+"\t");
                }
                System.out.println("");
                values[i]=key;
            }
            if (values[i]<key){
                values[i+1]=key;
                for (int j=0;j<size;j++){
                    System.out.print(values[j]+"\t");
                }
                break;
            }
            for (int j=0;j<size;j++){
                System.out.print(values[j]+"\t");
            }
            System.out.println("");
        }

      }
    }
   }
