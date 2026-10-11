/*
 * Decompiled with CFR 0.152.
 */
package ax.Sd;

import ax.Sd.a;
import ax.Sd.b;
import ax.Sd.c;
import ax.Sd.d;
import ax.Sd.e;
import ax.Sd.g;
import ax.Sd.h;
import ax.Sd.j;
import ax.Sd.l;
import ax.Sd.m;
import ax.Sd.o;
import java.util.Locale;

public class k {
    public static boolean a(Locale locale, b b8) {
        if (b8 == null) {
            return false;
        }
        String string = b8.c();
        if (b8 instanceof o) {
            return true;
        }
        if (b8 instanceof d) {
            return "ko".equals(locale.getLanguage());
        }
        if (b8 instanceof c) {
            return "ja".equals(locale.getLanguage());
        }
        if (b8 instanceof m) {
            return "ja".equals(locale.getLanguage());
        }
        if (b8 instanceof a) {
            return "TW".equals(locale.getCountry());
        }
        if (b8 instanceof e) {
            return "TW".equals(locale.getCountry());
        }
        if (b8 instanceof g) {
            return "CN".equals(locale.getCountry());
        }
        if (b8 instanceof h) {
            return "he".equals(locale.getLanguage()) || "iw".equals(locale.getLanguage());
            {
            }
        }
        if (!(ax.Rd.b.q.equals(string) || ax.Rd.b.p.equals(string) || ax.Rd.b.o.equals(string) || ax.Rd.b.n.equals(string))) {
            if (ax.Rd.b.s.equals(string)) {
                return "el".equals(locale.getLanguage());
            }
            if (ax.Rd.b.z.equals(string)) {
                return "th".equals(locale.getLanguage());
            }
            return false;
        }
        return "ru".equals(locale.getLanguage());
    }

    public static float b(Locale locale, b b8) {
        boolean bl = b8 instanceof j ? k.a(locale, ((j)b8).l()) : (b8 instanceof l ? k.a(locale, ((l)b8).l()) : false);
        if (bl) {
            return 1.25f;
        }
        return 1.0f;
    }
}

