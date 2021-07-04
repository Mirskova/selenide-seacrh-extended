package guru.qa.tests;

import org.junit.jupiter.api.*;

public class FirstTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("This should be before all the method");
    }

    @BeforeEach
    void setUp() {
        System.out.println("This should be before each method");
    }

    @AfterEach
    void tearDown() {
        System.out.println("This should be after each method");
    }

    @Test
    void firstTest() {
        System.out.println("This is the first @test");
        Assertions.assertTrue(true);

    }

    @Test
    void secondTest() {
        System.out.println("This is the second @test");
        Assertions.assertTrue(true);

    }
}
