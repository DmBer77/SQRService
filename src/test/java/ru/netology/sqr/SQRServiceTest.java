package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/BordersAndSquares.scv")
    public void Test(int borderA, int borderB, int expected) {

        SQRService service = new SQRService();

        int actual = service.numberOfSquares(borderA, borderB);

        Assertions.assertEquals(expected, actual);
    }

}
