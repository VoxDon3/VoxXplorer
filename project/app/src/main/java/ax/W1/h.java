/*
 * Decompiled with CFR 0.152.
 */
package ax.W1;

import ax.P0.E;
import ax.S0.G;
import ax.S0.d0;
import ax.W1.e;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class h {
    private static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(G g8) {
        Object object;
        while ((object = g8.x()) != null) {
            if (a.matcher((CharSequence)object).matches()) {
                while ((object = g8.x()) != null && !((String)object).isEmpty()) {
                }
                continue;
            }
            if (!((Matcher)(object = e.a.matcher((CharSequence)object))).matches()) continue;
            return object;
        }
        return null;
    }

    public static boolean b(G object) {
        return (object = ((G)object).x()) != null && ((String)object).startsWith("WEBVTT");
    }

    public static float c(String string) throws NumberFormatException {
        if (string.endsWith("%")) {
            return Float.parseFloat(string.substring(0, string.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String object) {
        long l8;
        object = d0.y1((String)object, "\\.");
        Object object2 = d0.x1(object[0], ":");
        int n8 = ((String[])object2).length;
        long l9 = 0L;
        for (int i8 = 0; i8 < n8; ++i8) {
            l9 = l9 * 60L + Long.parseLong(object2[i8]);
        }
        l9 = l8 = l9 * 1000L;
        if (((String[])object).length == 2) {
            object2 = object[1].trim();
            if (((String)object2).length() == 3) {
                l9 = l8 + Long.parseLong((String)object2);
            } else {
                object = new StringBuilder();
                ((StringBuilder)object).append("Expected 3 decimal places, got: ");
                ((StringBuilder)object).append((String)object2);
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
        }
        return l9 * 1000L;
    }

    public static void e(G g8) throws E {
        int n8 = g8.g();
        if (h.b(g8)) {
            return;
        }
        g8.b0(n8);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected WEBVTT. Got ");
        stringBuilder.append(g8.x());
        throw E.a(stringBuilder.toString(), null);
    }
}

