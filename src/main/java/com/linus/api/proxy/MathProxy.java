package com.linus.api.proxy;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class MathProxy {
    public static Function<Integer, Integer> absInt = Math::abs;
    public static BiFunction<Integer, Integer, Integer> maxInt = Math::max;
    public static BiFunction<Integer, Integer, Integer> minInt = Math::min;
    public static Function<Double, Double> ceil = Math::ceil;
    public static Function<Double, Double> floor = Math::floor;
    public static Function<Double, Double> rint = Math::rint;
    public static Function<Float, Integer> round = Math::round;
    public static Supplier<Double> random = Math::random;
    public static BiFunction<Integer, Integer, Integer> addExact = Math::addExact;
    public static BiFunction<Integer, Integer, Integer> subtractExact = Math::subtractExact;
    public static BiFunction<Integer, Integer, Integer> multiplyExact = Math::multiplyExact;
    public static Function<Integer, Integer> incrementExact = Math::incrementExact;
    public static Function<Integer, Integer> decrementExact = Math::decrementExact;
    public static Function<Integer, Integer> negateExact = Math::negateExact;
    public static Function<Long, Integer> toIntExact = Math::toIntExact;
    public static BiFunction<Integer, Integer, Integer> floorDiv = Math::floorDiv;
    public static BiFunction<Integer, Integer, Integer> floorMod = Math::floorMod;
    public static Function<Double, Double> nextUp = Math::nextUp;
    public static Function<Double, Double> nextDown = Math::nextDown;
    public static Function<String, Integer> parseInt = Integer::parseInt;
    public static Function<Integer, String> toBinaryString = Integer::toBinaryString;
    public static Function<Integer, String> toOctalString = Integer::toOctalString;
    public static Function<Integer, String> toHexString = Integer::toHexString;
    public static Function<String, Integer> valueOf = Integer::valueOf;
    public static BiFunction<Integer, Integer, Integer> compare = Integer::compare;
    public static Function<Integer, Integer> reverse = Integer::reverse;
    public static Function<Integer, Integer> reverseBytes = Integer::reverseBytes;
    public static Function<Integer, Integer> signum = Integer::signum;
    public static Function<Integer, Integer> highestOneBit = Integer::highestOneBit;
    public static Function<Integer, Integer> lowestOneBit = Integer::lowestOneBit;
    public static Function<Integer, Integer> numberOfLeadingZeros = Integer::numberOfLeadingZeros;
    public static Function<Integer, Integer> numberOfTrailingZeros = Integer::numberOfTrailingZeros;
    public static BiFunction<Integer, Integer, Integer> rotateLeft = Integer::rotateLeft;
    public static BiFunction<Integer, Integer, Integer> rotateRight = Integer::rotateRight;
    public static BiFunction<Integer, Integer, Integer> divideByPowerOfTwo = Integer::divideUnsigned;
    public static BiFunction<Integer, Integer, Integer> remainderByPowerOfTwo = Integer::remainderUnsigned;
    public static BiFunction<Integer, Integer, Integer>  randomInt = (a, b) -> (int) (Math.random() * (b-a) + a);

}
