/*
 * Decompiled with CFR 0.152.
 */
package ax.U0;

import android.text.TextUtils;
import ax.S0.a;
import ax.S0.u;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class w {
    private static final Pattern a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String a(long l8, long l9) {
        if (l8 == 0L && l9 == -1L) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("bytes=");
        stringBuilder.append(l8);
        stringBuilder.append("-");
        if (l9 != -1L) {
            stringBuilder.append(l8 + l9 - 1L);
        }
        return stringBuilder.toString();
    }

    public static long b(String string, String string2) {
        long l8;
        block10: {
            Object object;
            long l9;
            block9: {
                if (!TextUtils.isEmpty((CharSequence)string)) {
                    try {
                        l9 = Long.parseLong(string);
                        break block9;
                    }
                    catch (NumberFormatException numberFormatException) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Unexpected Content-Length [");
                        ((StringBuilder)object).append(string);
                        ((StringBuilder)object).append("]");
                        u.c("HttpUtil", ((StringBuilder)object).toString());
                    }
                }
                l9 = -1L;
            }
            l8 = l9;
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                object = a.matcher(string2);
                l8 = l9;
                if (((Matcher)object).matches()) {
                    long l10 = Long.parseLong(ax.S0.a.e(((Matcher)object).group(2))) - Long.parseLong(ax.S0.a.e(((Matcher)object).group(1))) + 1L;
                    if (l9 < 0L) {
                        l8 = l10;
                        break block10;
                    }
                    l8 = l9;
                    if (l9 == l10) break block10;
                    try {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Inconsistent headers [");
                        ((StringBuilder)object).append(string);
                        ((StringBuilder)object).append("] [");
                        ((StringBuilder)object).append(string2);
                        ((StringBuilder)object).append("]");
                        u.h("HttpUtil", ((StringBuilder)object).toString());
                        l8 = Math.max(l9, l10);
                    }
                    catch (NumberFormatException numberFormatException) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unexpected Content-Range [");
                        stringBuilder.append(string2);
                        stringBuilder.append("]");
                        u.c("HttpUtil", stringBuilder.toString());
                        l8 = l9;
                    }
                }
            }
        }
        return l8;
    }

    public static long c(String object) {
        if (TextUtils.isEmpty((CharSequence)object)) {
            return -1L;
        }
        if (((Matcher)(object = b.matcher((CharSequence)object))).matches()) {
            return Long.parseLong(ax.S0.a.e(((Matcher)object).group(1)));
        }
        return -1L;
    }
}

