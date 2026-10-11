/*
 * Decompiled with CFR 0.152.
 */
package ax.A2;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import ax.A2.d;
import ax.A2.e;
import ax.A2.f;
import ax.A2.g;
import ax.A2.h;
import ax.Gb.l;

public interface c {
    public static final a a = ax.A2.c$a.a;

    public Rect a(Activity var1);

    public static final class a {
        static final a a = new a();
        private static final String b;

        static {
            String string = c.class.getSimpleName();
            l.e(string, "getSimpleName(...)");
            b = string;
        }

        private a() {
        }

        public final c a() {
            int n8 = Build.VERSION.SDK_INT;
            if (n8 >= 30) {
                return h.b;
            }
            if (n8 >= 29) {
                return g.b;
            }
            if (n8 >= 28) {
                return f.b;
            }
            if (n8 >= 24) {
                return e.b;
            }
            return d.b;
        }

        public final String b() {
            return b;
        }
    }
}

