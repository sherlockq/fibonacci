package com.zhiqiangqiao.katas.fibonacci;

import java.util.HashMap;

public class Fibonacci {

  private final HashMap<Integer, Long> nthToFibonacciMapping = new HashMap<>();

  public long getNumber(int nth) {
    if (hasCachedValue(nth)) {
      return getCachedValue(nth);
    }
    if (nth >= 3) {
      long fibonacci = getNumber(nth - 2) + getNumber(nth - 1);
      updateCachedValue(nth, fibonacci);
      return fibonacci;
    }
    return 1;
  }

  private void updateCachedValue(int nth, long fibonacci) {
    nthToFibonacciMapping.put(nth, fibonacci);
  }

  private long getCachedValue(int nth) {
    return nthToFibonacciMapping.get(nth);
  }

  private boolean hasCachedValue(int nth) {
    return nthToFibonacciMapping.containsKey(nth);
  }
}
