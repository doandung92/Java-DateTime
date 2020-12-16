package com.evolyb;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class JavaLocalDateTime {
    // Get Current LocalDateTime with System ZoneId
    public LocalDateTime localDateTime = LocalDateTime.now();

    // Get Current LocalDateTime with Custom ZoneId
    public LocalDateTime localDateTime2 = LocalDateTime.now(ZoneId.of("GMT+7"));

    // Get LocalDateTime by passing Year + Month + Day
    public LocalDateTime localDateTime3 = LocalDateTime
            .of(1992,12,24,0,0,0);

    // Convert String format to LocalDateTime
    public static LocalDateTime getLocalDateTimeFromStringFormat(String date, String pattern){
        return LocalDateTime.parse(date,DateTimeFormatter.ofPattern(pattern));
    }

    // Convert LocalDate to LocalDateTime
    public static LocalDateTime getLocalDateTimeFromLocalDate(LocalDate localDate){
        // return localDate.atTime(LocalTime localTime);
        return localDate.atStartOfDay();
    }

    // Convert LocalDateTime to String format
    public static String localDateTimeToString(LocalDateTime localDateTime, String pattern){
        return localDateTime.format(DateTimeFormatter.ofPattern(pattern));
    }

    // Convert LocalDateTime to Day Month Year
    public static void getDayMonthYear(LocalDateTime localDateTime){
        int day = localDateTime.getDayOfMonth(); // 24
        int month = localDateTime.getMonthValue(); // 12
        int year = localDateTime.getYear(); // 1992
    }

    // Add Year + Month + Day to LocalDateTime
    public static LocalDateTime addDayMonthYearToLocalDateTime(LocalDateTime localDateTime, int num){
        localDateTime = localDateTime.plusDays(num);
        localDateTime = localDateTime.plusMonths(num);
        localDateTime = localDateTime.plusYears(num);
        return localDateTime;
    }

    // Convert LocalDateTime to Day of week
    public static String getDayOfWeek(LocalDateTime localDateTime){
        String dayOfWeek = localDateTime.getDayOfWeek().toString();
        return dayOfWeek;
    }

    // Convert LocalDateTime to Instant
    public static Instant getInstantFromLocalDateTime(LocalDateTime localDateTime){
        Instant instant = localDateTime.toInstant(ZoneOffset.of("+07:00"));
        return instant;
    }

    // Convert Instant to LocalDateTime
    public static LocalDateTime getLocalDateTimeFromInstant(Instant instant){
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.of("GMT+7"));
        return localDateTime;
    }
}
