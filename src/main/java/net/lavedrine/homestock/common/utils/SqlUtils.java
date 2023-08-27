package net.lavedrine.homestock.common.utils;

import java.util.regex.Pattern;

public final class SqlUtils {

    private SqlUtils() {
    }

    private static final Pattern LIKE_SPECIAL_CHARS_PATTERN = Pattern.compile("([%_])");
    private static final String WILDCARD = "%";

    public static String escapeAndSurroundWithPercent(String matchString) {
        return matchString == null || matchString.isEmpty() ? null : WILDCARD + escapeForLike(matchString) + WILDCARD;
    }

    public static String escapeForLike(String s) {
        return LIKE_SPECIAL_CHARS_PATTERN.matcher(s).replaceAll("\\\\$1");
    }

}
