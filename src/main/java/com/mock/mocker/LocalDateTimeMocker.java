package com.mock.mocker;

import com.mock.MockConfig;
import com.mock.Mocker;
import com.mock.util.RandomUtils;

import java.time.LocalDateTime;

/**
 * LocalDateTime对象模拟器
 */
public class LocalDateTimeMocker implements Mocker<LocalDateTime> {

  @Override
  public LocalDateTime mock(MockConfig mockConfig) {
    return LocalDateTime.of(RandomUtils.nextInt(2018, 2020),
            RandomUtils.nextInt(1, 12),
            RandomUtils.nextInt(1, 30),
            RandomUtils.nextInt(0, 23),
            RandomUtils.nextInt(0, 59),
            RandomUtils.nextInt(0, 59));
  }

  public LocalDateTime mock() {
    return LocalDateTime.of(RandomUtils.nextInt(2018, 2020),
            RandomUtils.nextInt(1, 12),
            RandomUtils.nextInt(1, 30),
            RandomUtils.nextInt(0, 23),
            RandomUtils.nextInt(0, 59),
            RandomUtils.nextInt(0, 59));
  }
}
