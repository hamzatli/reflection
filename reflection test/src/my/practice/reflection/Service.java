package my.practice.reflection;

/**
 * Created by Ismayil Hamzatli on Jun, 2020
 */
public class Service {


    @CustomType(type = MethodTypes.FIRST, value = "methodOne")
    public String methodOne(String a){
        System.out.println(a);
        return a;
    }

    @CustomType(type = MethodTypes.SECOND, value = "methodTwo")
    public String methodTwo(String a){
        return a;
    }
}
