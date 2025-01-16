package org.example;

import org.example.store.BasicRes;
import org.example.store.BusanRes;
import org.example.store.DaeguRes;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<BasicRes> resList = new ArrayList<>();

        resList.add(new BasicRes());
        resList.add(new BusanRes());
        resList.add(new DaeguRes());

        resList.forEach(r -> {
            r.makeZazang();
        });



    }
}