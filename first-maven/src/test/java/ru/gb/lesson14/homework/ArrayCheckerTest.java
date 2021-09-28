package ru.gb.lesson14.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ArrayCheckerTest {

    // 1
    @ParameterizedTest
    @MethodSource("arraysWithFours")
    void getNumbersAfterLast4_shouldReturnArray(int[] newArray, int[] origArray){
        Assertions.assertArrayEquals(newArray,
                                    ArrayChecker.getNumbersAfterLast4(origArray));
    }

    static Stream<Arguments>arraysWithFours() {
        return Stream.of(
                Arguments.arguments(new int[] {1, 7}, new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}),
                Arguments.arguments(new int[0], new int[]{1, 2, 4, 4, 2, 3, 4, 1, 4}),
                Arguments.arguments(new int[] {1}, new int[]{4,1}),
                Arguments.arguments(new int[0] , new int[]{1,4})
        );
    }

    @ParameterizedTest
    @MethodSource("arraysWithNoFours")
    void getNumbersAfterLast4_shouldReturnRuntimeException(int[] array){
        Assertions.assertThrows(RuntimeException.class, () -> ArrayChecker.getNumbersAfterLast4(array));
    }

    static Stream<Arguments>arraysWithNoFours() {
        return Stream.of(
                Arguments.arguments(new int[]{1, 2, 2, 1, 2, 3, 5, 1, 7}),
                Arguments.arguments(new int[]{1, 1, 1}),
                Arguments.arguments(new int[0])
        );
    }

    // 2
    @ParameterizedTest
    @MethodSource("arraysWithTwoNumbers")
    void checkArrayFor1and4_shouldFindNumbers(int[] array){
        Assertions.assertTrue(ArrayChecker.checkArrayFor1and4(array));
    }

    static Stream<Arguments>arraysWithTwoNumbers() {
        return Stream.of(
                Arguments.arguments(new int[]{1, 1, 1, 4, 4, 1, 4, 4}),
                Arguments.arguments(new int[]{4, 4, 4, 1, 1, 1}),
                Arguments.arguments(new int[]{1, 4})
        );
    }


    @ParameterizedTest
    @MethodSource("arraysWithSameNumbers")
    void checkArrayFor1and4_shouldFindOnlyOneNumber(int[] array){
        Assertions.assertFalse(ArrayChecker.checkArrayFor1and4(array));
    }

    static Stream<Arguments>arraysWithSameNumbers() {
        return Stream.of(
                Arguments.arguments(new int[]{1, 1, 1, 1}),
                Arguments.arguments(new int[]{4, 4, 4}),
                Arguments.arguments(new int[]{1})
        );
    }

    @ParameterizedTest
    @MethodSource("arraysWithDifferentNumbers")
    void checkArrayFor1and4_shouldFindOtherValues(int[] array){
        Assertions.assertFalse(ArrayChecker.checkArrayFor1and4(array));
    }

static Stream<Arguments> arraysWithDifferentNumbers(){
    return Stream.of(
            Arguments.arguments(new int[] {1, 2, 3, 4, 5, 6, 7}),
            Arguments.arguments(new int[] {1, 3, 5, 7}),
            Arguments.arguments(new int[] {4, 4, 4, 1, 1, 2, 2})
    );

}


}
