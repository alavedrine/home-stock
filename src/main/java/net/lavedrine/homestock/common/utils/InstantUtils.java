package net.lavedrine.homestock.common.utils;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public class InstantUtils {

    public static Instant localDateToInstant(LocalDate date) {
        if (date == null) {
            return null;
        }
        return date.atStartOfDay(ZoneId.systemDefault()).toInstant();
    }
}
