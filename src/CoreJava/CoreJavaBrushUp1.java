package CoreJava;

public class CoreJavaBrushUp1 {



    public static void main(String[] args) {

// TODO Auto-generated method stub





        int myNum = 5;

        String website = "Rahul Shetty Academy";

        char letter = 'r';

        double dec = 5.99;

        boolean myCard = true;



        System.out.println(myNum+"is the value stored in the myNum variable");

        System.out.println(website);

//Arrays -

        int[] arr = new int[5];// 5, 10

        int[] arr1 = new int[6];

        arr1[0]=0;
        arr1[1]=1;
        arr1[2]=2;
        arr1[3]=3;

        arr[0] = 1;

        arr[1] = 2;

        arr[2]= 4;

        arr[3]= 5;

        arr[4]= 6;





        int[] arr2 = {1,2,4,5,6};

        int[] arr3={3,6,8,9,12,34,5};




        System.out.println(arr2[0]);















//for loop arr.length - 5

        for(int i = 0; i< arr.length; i++) //4

        {



            System.out.println(arr[i]);

        }



        for (int i =0;i<arr3.length; i++)

        {

            System.out.println(arr3[i]);

        }



        String[] name = {"rahul", "shetty", "selenium"};



        for(int i =0; i<name.length;i++)

        {

            System.out.println(name[i]);

        }



        for( String s: name) //enhanced for loop

        {

            System.out.println(s);

        }


    }





}