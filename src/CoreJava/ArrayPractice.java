package CoreJava;

public class ArrayPractice {

    public static void main (String[] args){

        int[] arr4 ={2,3,4,5,6,8,10,13,14,16,18};

        for(int i=0;i<arr4.length;i++){

            if(arr4[i] % 2==0){

                     System.out.println(arr4[i]);
                     break;
            }else{

                System.out.println(arr4[i]+" is not multiple of 2");
            }
        }

    }
}
