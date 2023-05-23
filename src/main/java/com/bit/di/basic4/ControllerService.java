package com.bit.di.basic4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ControllerService {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/java/com/bit/di/basic4/service.xml");
        UserService userService = (UserService)applicationContext.getBean("adminUserServiceImp");
        userService.register();

        UserService userService1 = (UserService) applicationContext.getBean("clientUserServiceImp");
        userService1.register();
    }
}
