package com.zhiqiangqiao.katas.fibonacci;

import java.util.HashMap;

public class Fibonacci {

  private final HashMap<Integer, Long> nthToFibonacciMapping = new HashMap<>();

  public long getNumber(int nth) {
    if (hasMapping(nth)) {
      return getMapping(nth);
    }
    if (nth >= 3) {
      long fibonacci = getNumber(nth - 2) + getNumber(nth - 1);
      updateMapping(nth, fibonacci);
      return fibonacci;
    }
    return 1;
  }

  private void updateMapping(int nth, long fibonacci) {
    nthToFibonacciMapping.put(nth, fibonacci);
  }

  private long getMapping(int nth) {
    return nthToFibonacciMapping.get(nth);
  }

  private boolean hasMapping(int nth) {
    return nthToFibonacciMapping.containsKey(nth);
  }
}
