package CoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AreaListJavaPac {

    public static void main(String[] args){
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("name");
        a1.add("age");
        a1.add("phone no");
        a1.add("address");
        String a2 = a1.get(3);


        System.out.println(a2);

        for(int i=0;i<a1.size();i++){

            String a3=a1.get(i);
            System.out.println(a3);
        }

        for(String a4: a1){

            System.out.println(a4);
        }


        System.out.println(a1.contains("selenium"));

        String[] arr7={"name1","age1","phone no1","address 1"};
        List<String> nameArrayList =  Arrays.asList(arr7);

        System.out.println(nameArrayList.contains("Selenium"));


    }

}
