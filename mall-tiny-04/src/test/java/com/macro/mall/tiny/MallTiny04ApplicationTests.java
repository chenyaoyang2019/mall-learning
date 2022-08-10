package com.macro.mall.tiny;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.function.Consumer;

@SpringBootTest
class MallTiny04ApplicationTests {

    @Test
    void contextLoads() {
        makeMoney(100, t -> {
            System.out.println("今天赚了" + t);
        });
    }

    public void makeMoney(Integer money, Consumer<Integer> consumer) {
        consumer.accept(money);
    }



}
