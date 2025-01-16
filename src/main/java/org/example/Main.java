package org.example;

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

        HashMap<String,BasicRes> resHashMap = new HashMap<>();

        resHashMap.put("서울", new BasicRes());
        resHashMap.put("부산", new BusanRes());
        resHashMap.put("대구", new DaeguRes());


        Scanner scanner = new Scanner(System.in);

        System.out.println("도시를 입력하세요");

        String city = scanner.nextLine();

        BasicRes target = resHashMap.get(city);

        target.makeZazang();


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