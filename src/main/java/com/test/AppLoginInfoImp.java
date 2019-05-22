package com.test;

import com.User;

import java.util.Random;

public class AppLoginInfoImp implements App_Login_Info {
    public void getNum(int numbers) {
        int num = 100;
        if (num > numbers) {
            System.out.print(numbers);
        }
    }

    public void getUserInfo(User user) {
        System.out.print(user.getUsername());
    }

    public Integer getRandInt() {
        return new Random().nextInt();
    }
}
