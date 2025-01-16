package org.example;

import org.example.menu.Coffee;
import org.example.menu.Menu;
import org.example.store.BasicRes;
import org.example.store.BusanRes;
import org.example.store.DaeguRes;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)throws Exception {

        Document doc = Jsoup.connect("https://composecoffee.com/menu?amp%3Bcategory=185").get();
        //System.out.println(doc);

        Element element = doc.selectFirst("#masonry-container");
        System.out.println(element);


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