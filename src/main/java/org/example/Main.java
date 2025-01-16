package org.example;

import org.example.menu.Coffee;
import org.example.menu.Menu;
import org.example.store.BasicRes;
import org.example.store.BusanRes;
import org.example.store.DaeguRes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //추상 클래스는 객체 생성 불가
        //물려주거나 타입으로는 유용
        Menu m = new Coffee();



//        ArrayList<BasicRes> resList = new ArrayList<>();
//
//        resList.add(new BasicRes());
//        resList.add(new BusanRes());
//        resList.add(new DaeguRes());
//
//        resList.forEach(r -> {
//            r.makeZazang();
//        });



    }
}