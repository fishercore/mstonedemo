package com.mstone.springdemo.db.service;

import com.alibaba.fastjson.JSONArray;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: fisher
 * @create: 2019-11-04 17:49
 */
public class MyTest {

    @Test
    public void test01() {
        System.out.println(MyTest.test(7));
    }

//    1, 1, 2, 3, 5, 8, 13,

    public static int test(int i) {
        if(i == 0 || i == 1)
            return i;

        return test(i - 1) + test(i - 2);
    }




    @Test
    public void test00() {
        List<Card> list = new ArrayList();
        list.add(new Card(1, "1", null));
        list.add(new Card(11, "11", null));
        list.add(new Card(111, "111", null));
        list.add(new Card(1111, "1111", null));

        List<Card> result = new ArrayList<>();
        result.add(list.get(0));

        test001(list, list.get(0));



        System.out.println(result);

    }

    public void test001(List<Card> dataList, Card rootCard) {
        List<Card> child = dataList.stream().filter(data -> data.getName().length() == rootCard.getName().length() + 1
                && StringUtils.startsWithIgnoreCase(data.getName(), rootCard.getName())).collect(Collectors.toList());

        if(rootCard.getName().length() < 5) {
            child.forEach(data -> {
                test001(dataList, data);
            });

            rootCard.setChild(child);
        }





    }
}


@Data
@AllArgsConstructor
@NoArgsConstructor
class Card {
    private int id;
    private String name;

    private List<Card> child;
}