package gcl.kzl.unittest.service;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class LambdaService {
    public static void main(String[] args) {
        Predicate<Integer> atLeast5 = x -> x > 5;
        System.out.println(atLeast5.test(3));
        System.out.println(atLeast5.test(6));

        BinaryOperator<Long> addLongs = (x, y) -> x + y;
        System.out.println(addLongs.apply(3L, 5L));
    }
}
