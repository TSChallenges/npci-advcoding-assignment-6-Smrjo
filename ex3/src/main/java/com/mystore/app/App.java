// package com.mystore.app;

// public class App {
//     public static void main(String[] arg) {

//         // ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
//         Product p1 = context.getBean(Product.class);
//         p1.setId(1);
//         p1.setName("Tumbler");
//         p1.generateBarcode();
//         System.out.println(p1);

//         Product p2 = context.getBean(Product.class);
//         p2.setId(2);
//         p2.setName("Bucket");
//         p2.generateBarcode();        
//         System.out.println(p2);
//     }  
// }
package com.mystore.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);  // FIXED DECLARATION

        Product p1 = context.getBean(Product.class);
        p1.setId(1);
        p1.setName("Tumbler");
        p1.generateBarcode();  
        System.out.println(p1);

        Product p2 = context.getBean(Product.class);
        p2.setId(2);
        p2.setName("Bucket");
        p2.generateBarcode();  
        System.out.println(p2);
    }  
}
