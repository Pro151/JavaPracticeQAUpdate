package CoreJava;

public class MethodCreate {
    public static void main(String[] args) {
        MethodCreate md = new MethodCreate();
        String name = getData();
        System.out.println(name);


    }

    public static String getData(){
        System.out.println("Hellow!!");
        return "promit";

    }
}
