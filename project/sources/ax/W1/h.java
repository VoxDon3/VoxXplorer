package ax.W1;

import ax.P0.E;
import ax.S0.G;
import ax.S0.d0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class h {
    private static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(G g) {
        String x;
        while (true) {
            String x2 = g.x();
            if (x2 == null) {
                return null;
            }
            if (a.matcher(x2).matches()) {
                do {
                    x = g.x();
                    if (x != null) {
                    }
                } while (!x.isEmpty());
            } else {
                Matcher matcher = e.a.matcher(x2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(G g) {
        String x = g.x();
        return x != null && x.startsWith("WEBVTT");
    }

    public static float c(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) {
        String[] y1 = d0.y1(str, "\\.");
        long j = 0;
        for (String str2 : d0.x1(y1[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (y1.length == 2) {
            String trim = y1[1].trim();
            if (trim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: " + trim);
            }
            j2 += Long.parseLong(trim);
        }
        return j2 * 1000;
    }

    public static void e(G g) throws E {
        int g2 = g.g();
        if (b(g)) {
            return;
        }
        g.b0(g2);
        throw E.a("Expected WEBVTT. Got " + g.x(), null);
    }
}
