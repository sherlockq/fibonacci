package com.zhiqiangqiao.katas.fibonacci;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FibonacciShould {

  @ParameterizedTest
  @CsvSource({
      "1,1",
      "2,1",
      "3,2",
      "4,3",
      "5,5",
      "10,55",
      "50,12586269025"
  })
  void calculate_fibonacci_numbers(int nth, long expected) {
    assertThat(new Fibonacci().getNumber(nth)).isEqualTo(expected);
  }

  @Test
  @Timeout(1)
  void finish_calculation_in_accepted_time_span() {
    assertThat(new Fibonacci().getNumber(50)).isGreaterThan(0);
  }
}
