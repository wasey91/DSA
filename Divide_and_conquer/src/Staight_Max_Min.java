import java.util.Scanner;
public class Staight_Max_Min {

     static class Min_Max{
         int max;
        int min;
    }
    public Min_Max min_max(int []A){
         int max=A[0];
         int min=A[0];

                for(int i = 0; i<A.length; i++){


                    if(A[i]>max){
                        max = A[i];

                    }
                    if(A[i]<min){
                        min = A[i];
                    }
                }

                Min_Max re = new Min_Max();
                re.min=min;
                re.max=max;
                return re;
        }
}

