/*
 * Your Manpreet Samra
 * Student ID:991 511 177
 * SYST10199 - web programming
 */
package tempaverage;
import java.util.Scanner;


public class TempAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
        //declaring temp array of length 14
        double temp[]=new double[14];
        Scanner input=new Scanner(System.in);
        
        //declaring object of class TempAverage
        TempAverage tem=new TempAverage();
        
        System.out.println("Enter the tempratures of last 14 days");
        for(int i=0;i<temp.length;i++){
            System.out.print("Enter the value of temp["+i+"] = ");
            temp[i]=input.nextDouble();
            System.out.println();
        }
        System.out.printf("The average of tempratures is %.2f F",tem.calcAvg(temp));
        System.out.println();
        tem.gitHub();
        System.out.println("Now I am in NetBeans");
        System.out.printf("Max temprature is %.2f F",tem.calcMax(temp));
        System.out.println();
    }
        catch(Exception e){
            System.out.println("Please enter onle intger or double values only");
        }

    }
       
    //function to calculate average of temprature which are not greter than and not less than -50
    public double calcAvg(double[] temp){
        
        double sum=0; 
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
        //System.out.println(sum);
        return  sum/(double)count;
    }
    
    //This function is updated from remote repository
    public void gitHub(){
        System.out.println("Hello! I am in GitHub now ");   
    }
    
    //calculate max temprature 
    public double calcMax(double [] temp){
       double clone=0;
       for(int i=0;i<temp.length-1;i++){
           for(int j=0;j<temp.length-1;j++){
                if(temp[j]>temp[j+1]){
                    clone=temp[j];
                    temp[j]=temp[j+1];
                    temp[j+1]=clone;
                }
           }
       }
       //System.out.println("The Max temprature is = "+temp[temp.length-1]);
       return temp[temp.length-1];
   }
}
