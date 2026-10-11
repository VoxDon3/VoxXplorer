package ax.T;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import ax.b0.C1442c;

/* loaded from: classes.dex */
public final class c {
    private static final ThreadLocal<C1442c<Rect, Rect>> a = new ThreadLocal<>();

    static class a {
        static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    public static boolean a(Paint paint, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.a(paint, str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float measureText = paint.measureText("\udfffd");
        float measureText2 = paint.measureText("m");
        float measureText3 = paint.measureText(str);
        float f = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i = 0;
            while (i < length) {
                int charCount = Character.charCount(str.codePointAt(i)) + i;
                f += paint.measureText(str, i, charCount);
                i = charCount;
            }
            if (measureText3 >= f) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        C1442c<Rect, Rect> b = b();
        paint.getTextBounds("\udfffd", 0, 2, b.a);
        paint.getTextBounds(str, 0, length, b.b);
        return !b.a.equals(b.b);
    }

    private static C1442c<Rect, Rect> b() {
        ThreadLocal<C1442c<Rect, Rect>> threadLocal = a;
        C1442c<Rect, Rect> c1442c = threadLocal.get();
        if (c1442c == null) {
            C1442c<Rect, Rect> c1442c2 = new C1442c<>(new Rect(), new Rect());
            threadLocal.set(c1442c2);
            return c1442c2;
        }
        c1442c.a.setEmpty();
        c1442c.b.setEmpty();
        return c1442c;
    }
}
