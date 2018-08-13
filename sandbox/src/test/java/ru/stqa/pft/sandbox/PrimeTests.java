package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTests {
  @Test
  public void testPrimes(){
    System.out.println(Integer.MAX_VALUE);
    Assert.assertTrue(Primes.isPrime(7));
  }

  @Test
  public void testNonPrimes(){
    System.out.println(Integer.MAX_VALUE);
    Assert.assertTrue(Primes.isPrime(-2));
  }
}
