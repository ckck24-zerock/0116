package org.example;

import org.example.ex.Ex1;
import org.example.ex2.CalcImpl;
import org.example.ex2.Calculator;
import org.example.menu.*;
import org.example.store.BasicRes;
import org.example.store.BusanRes;
import org.example.store.DaeguRes;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.lang.reflect.Field;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)throws Exception {

        List<LottoBall> ballList = new ArrayList<>();

        for (int i = 1; i <= 45 ; i++) {
            ballList.add( new LottoBall(i));
        }

        Collections.shuffle(ballList);

        List<LottoBall> result = ballList.subList(0,6);

        System.out.println(result);

        result.sort( (b1, b2) -> b1.getNum() - b2.getNum() );

        System.out.println(result);


//        Ex1 obj1 = new Ex1();
//
//
//        obj1.doA();
//
//        Class clz = obj1.getClass();
//
//        Field field = clz.getDeclaredField("name");
//
//        field.setAccessible(true);
//
//        field.set(obj1, "Hong Gil Dong");
//
//        obj1.doA();





//        HashMap<String, MenuService> map = new HashMap<>();
//
//        map.put("mega", new MegaMenuService());
//        map.put("compose", new ComposeMenuService());
//
//        //-------------------------
//
//        MenuService menuService = map.get("mega");
//
//        menuService.getMenuList();



//        String url = "https://www.mega-mgccoffee.com/menu/menu.php?menu_category1=1&menu_category2=1&category=&list_checkbox_all=all";
//        Document doc = Jsoup.connect(url).get();
//
//        Element element = doc.selectFirst("#menu_list");
//        //System.out.println(element);
//        Elements names = element.select(".text1 b");
//
//        List<String> nameList = names.eachText();
//        System.out.println(nameList);

        //System.out.println(names);

        //System.out.println(doc);

 //       Document doc = Jsoup.connect("https://composecoffee.com/menu?amp%3Bcategory=185").get();
//        //System.out.println(doc);
//
//        Element element = doc.selectFirst("#masonry-container");
//        //System.out.println(element);
//
//        Elements names = element.select("h4");
//
//        //System.out.println(names);
//
//        List<String> nameList = names.eachText();

//        System.out.println(nameList);

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