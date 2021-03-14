package com.zhiqiangqiao.katas.fibonacci;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FibonacciShould {

  @ParameterizedTest
  @CsvSource({
      "1,1"
  })
  void calculate_fibonacci_numbers(int nth, int expected) {
    assertThat(new Fibonacci().getNumber(nth)).isEqualTo(expected);
  }
}
