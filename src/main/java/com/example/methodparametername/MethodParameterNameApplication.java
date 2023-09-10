package com.example.methodparametername;


import org.springframework.core.LocalVariableTableParameterNameDiscoverer;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class MethodParameterNameApplication {
    public static void main(String[] args) throws NoSuchMethodException {
        test0();
    }

    public static void test0() throws NoSuchMethodException {
        Method method = Bean1.class.getMethod("foo", String.class, int.class);
        for (Parameter parameter : method.getParameters()) {
            System.out.println(parameter.getName());
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        LocalVariableTableParameterNameDiscoverer discoverer =
                new LocalVariableTableParameterNameDiscoverer();
        String[] parameterNames = discoverer.getParameterNames(method);
        System.out.println(Arrays.toString(parameterNames));
    }
}
