package ru.gb.lesson14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MathOperationsTest {

    @Test
    void shouldSumTwoValidValues() {
       Assertions.assertEquals(15, MathOperations.sum(10, 5));
    }

    @Test
    void shouldDivideTwoValidValues() {
        Assertions.assertEquals(2, MathOperations.divide(10, 5));
    }

    @Test
    void shouldThrowDivisionByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> MathOperations.divide(10, 0));
    }

    @ParameterizedTest
    @MethodSource("powMethodValuesProvider")
    void shouldPowValueByPower2(int expected, int value){
        Assertions.assertEquals(expected, MathOperations.pow2(value));
    }

    static Stream<Arguments> powMethodValuesProvider() {
        return Stream.of(
                Arguments.arguments(4, 2),
                Arguments.arguments(16, 4),
                Arguments.arguments(64, 8)
                );
    }

}
