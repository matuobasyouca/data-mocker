package com.mock.mocker;

import com.mock.MockConfig;
import com.mock.Mocker;
import com.mock.util.RandomUtils;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 * LocalDateTime对象模拟器
 */
public class LocalDateTimeMocker implements Mocker<LocalDateTime> {

    @Override
    public LocalDateTime mock(MockConfig mockConfig) {
        String[] dr = mockConfig.getDateRange();

        LocalDateTime start = LocalDateTime.parse(dr[0], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        LocalDateTime end = LocalDateTime.parse(dr[1], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        return LocalDateTime.ofEpochSecond(
                RandomUtils.nextLong(
                        start.toEpochSecond(ZoneOffset.of("+8")),
                        end.toEpochSecond(ZoneOffset.of("+8"))
                ), 0, ZoneOffset.ofHours(8));
    }

    public LocalDateTime mock() {
        return LocalDateTime.of(RandomUtils.nextInt(1970, 2170),
                RandomUtils.nextInt(1, 12),
                RandomUtils.nextInt(1, 30),
                RandomUtils.nextInt(0, 23),
                RandomUtils.nextInt(0, 59),
                RandomUtils.nextInt(0, 59));
    }
}
