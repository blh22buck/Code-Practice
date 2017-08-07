package Determine_Prime_Number;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by B on 8/7/2017.
 */
public class Tests_Is_Prime {

    @Test
    public void test_2_And_3() {
        assertEquals("Number 2 is prime", true, Is_Prime.isPrime(2));
        assertEquals("Number 3 is prime", true, Is_Prime.isPrime(3));
    }

    @Test
    public void test_not_prime() {
        assertEquals("Number 444 is not prime", false, Is_Prime.isPrime(444));
        assertEquals("Number 33 is not prime", false, Is_Prime.isPrime(33));
        assertEquals("Number 1 is not prime", false, Is_Prime.isPrime(1));
    }

}
