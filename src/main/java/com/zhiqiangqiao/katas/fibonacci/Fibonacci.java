package com.zhiqiangqiao.katas.fibonacci;

public class Fibonacci {

  public long getNumber(int nth) {
    if (nth >= 3) {
      return getNumber(nth - 2) + getNumber(nth - 1);
    }
    return 1;
  }
}
