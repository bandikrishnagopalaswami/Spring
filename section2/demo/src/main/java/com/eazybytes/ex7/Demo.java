package com.eazybytes.ex7;

import com.eazybytes.ex7.beans.Vehicle;
import com.eazybytes.ex7.beans.Vehicle1;
import com.eazybytes.ex7.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Vehicle v1= context.getBean(Vehicle.class);
//        Vehicle v2= context.getBean(Vehicle.class);
//        System.out.println(v1==v2); singleton beans once created used everytime
//        System.out.println(v1.hashCode()+" "+v2.hashCode());

        Vehicle1 v3= context.getBean(Vehicle1.class);
        Vehicle1 v4= context.getBean(Vehicle1.class);
        System.out.println(v3==v4);//new bean everytime when requested for that scope should
        //be mentioned on component classes
        System.out.println(v3.hashCode()+" "+v4.hashCode()); //prototype bean

    }
}
