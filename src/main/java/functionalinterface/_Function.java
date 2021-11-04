package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        // Function takes 1 argument and produces 1 result

        int increment = incrementByOne(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multipleBy10.apply(increment2);
        System.out.println(multiply);

        System.out.println(addBy1AndThenMultiplyBy10.apply(4));

        // Bi Function takes 2 arguments and produces 1 result

        System.out.println(incrementByOneAndMultiply(4,100));
    }


    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static Function<Integer, Integer> multipleBy10 =
            number -> number * 10;

    static Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
            incrementByOneFunction.andThen(multipleBy10);

    static int incrementByOne(int number) {
        return number + 1;
    }

    BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }

}