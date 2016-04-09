package com.tonyjs.sample.multiitemadapter.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tonyjs on 16. 4. 9..
 */
public class Item {
    public static final String ITEM_TYPE_B = "B";
    public static final String ITEM_TYPE_A = "A";

    private static final String sSample = "a b c d e f g h i j k l m n o p q r s t u v w x y z";

    private String name;
    private String type;

    public Item(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public static List<Item> getSampleItems() {
        List<Item> items = new ArrayList<>();
        for (String name : sSample.split(" ")) {
            int rand = (int) (Math.random() * 2);

            String type = rand == 0 ? ITEM_TYPE_B : ITEM_TYPE_A;
            Item item = new Item(name, type);

            items.add(item);
        }

        return items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
