/*
 * Decompiled with CFR 0.152.
 */
package ax.T;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;

public final class c {
    private static final ThreadLocal<ax.b0.c<Rect, Rect>> a = new ThreadLocal();

    public static boolean a(Paint paint, String string) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ax.T.c$a.a(paint, string);
        }
        int n8 = string.length();
        if (n8 == 1 && Character.isWhitespace(string.charAt(0))) {
            return true;
        }
        float f8 = paint.measureText("\udb3f\udffd");
        float f9 = paint.measureText("m");
        float f10 = paint.measureText(string);
        float f11 = 0.0f;
        if (f10 == 0.0f) {
            return false;
        }
        if (string.codePointCount(0, string.length()) > 1) {
            if (f10 > f9 * 2.0f) {
                return false;
            }
            int n9 = 0;
            while (n9 < n8) {
                int n10 = Character.charCount(string.codePointAt(n9)) + n9;
                f11 += paint.measureText(string, n9, n10);
                n9 = n10;
            }
            if (f10 >= f11) {
                return false;
            }
        }
        if (f10 != f8) {
            return true;
        }
        ax.b0.c<Rect, Rect> c8 = c.b();
        paint.getTextBounds("\udb3f\udffd", 0, 2, (Rect)c8.a);
        paint.getTextBounds(string, 0, n8, (Rect)c8.b);
        return ((Rect)c8.a).equals(c8.b) ^ true;
    }

    private static ax.b0.c<Rect, Rect> b() {
        ThreadLocal<ax.b0.c<Rect, Rect>> threadLocal = a;
        ax.b0.c<Rect, Rect> c8 = threadLocal.get();
        if (c8 == null) {
            c8 = new ax.b0.c<Rect, Rect>(new Rect(), new Rect());
            threadLocal.set(c8);
            return c8;
        }
        ((Rect)c8.a).setEmpty();
        ((Rect)c8.b).setEmpty();
        return c8;
    }

    static class a {
        static boolean a(Paint paint, String string) {
            return paint.hasGlyph(string);
        }
    }
}

