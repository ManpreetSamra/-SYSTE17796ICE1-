/*
 * Your Manpreet Samra
 * Student ID:991 511 177
 * SYST10199 - web programming
 */
package tempaverage;
import java.util.Scanner;
/**
 *
 * @author gurus
 */
public class TempAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temp[]=new int[14];
        Scanner input=new Scanner(System.in);
        TempAverage tem=new TempAverage();
        
        System.out.println("Enter the tempratures of last 14 days");
        for(int i=0;i<temp.length;i++){
            System.out.print("Enter the value of tem["+i+"] = ");
            temp[i]=input.nextInt();
            System.out.println();
        }
        System.out.println(tem.calcAvg(temp));
        tem.gitHub();
        
    }
    public int calcAvg(int[] temp){
        
        int sum=0; 
        int count=0;
        for(int i=0;i<temp.length;i++){
            if(temp[i]<50 && temp[i]>-50){
                sum+=temp[i];
                count++;
            }
            else{
                continue;
            }
        }
        System.out.println(sum);
        return  sum/count;
    }
    public void gitHub(){
        System.out.println("Hello! I am in GitHub now ");   
    }
}
