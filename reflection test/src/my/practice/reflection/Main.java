package my.practice.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Created by Ismayil Hamzatli on Jun, 2020
 */
public class Main  {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException {

        Class<Service> classObject = Service.class;

        Method[] methods = classObject.getDeclaredMethods();

        Scanner input = new Scanner(System.in);
        String s = "Fist";
        int a = input.nextInt();
        MethodTypes methodTypes = null;
        if (a==1){
            methodTypes = MethodTypes.FIRST;
        }else{
            methodTypes = MethodTypes.SECOND;
            s = "Second";
        }


        for (Method method : methods) {
            //            if (method.getName().equals("readResolve") &&
//                    method.getParameterTypes().length == 0);
            if (method.getAnnotation(CustomType.class).type().equals(methodTypes)){
                method.setAccessible(true);
                method.invoke(classObject.getDeclaredConstructor().newInstance(), s);
            }

        }


    }





}

