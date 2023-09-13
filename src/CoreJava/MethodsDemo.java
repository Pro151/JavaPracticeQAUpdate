package CoreJava;


//************************************Methods Code *****************************************



public class MethodsDemo {


    public static void main(String[] args) {

// TODO Auto-generated method stub


        MethodsDemo d = new MethodsDemo();

        String name = d.getData();

        System.out.println(name);

        MethodsDemo d1 = new MethodsDemo();

       // d1.getUserData();

        getData2();


    }


    public String getData() {

        System.out.println("hello world");

        return "rahul shetty";

    }


    public static String getData2() {

        System.out.println("hello world");

        return "rahul shetty";

    }
}

