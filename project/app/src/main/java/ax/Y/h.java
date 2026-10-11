/*
 * Decompiled with CFR 0.152.
 */
package ax.Y;

import android.os.Build;
import android.os.LocaleList;
import ax.Y.i;
import ax.Y.j;
import ax.Y.q;
import java.util.Locale;

public final class h {
    private static final h b = h.a(new Locale[0]);
    private final j a;

    private h(j j8) {
        this.a = j8;
    }

    public static h a(Locale ... localeArray) {
        if (Build.VERSION.SDK_INT >= 24) {
            return h.j(ax.Y.h$b.a(localeArray));
        }
        return new h(new i(localeArray));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static Locale b(String string) {
        Object object;
        if (string.contains("-")) {
            object = string.split("-", -1);
            if (((String[])object).length > 2) {
                return new Locale(object[0], object[1], object[2]);
            }
            if (((String[])object).length > 1) {
                return new Locale(object[0], object[1]);
            }
            if (((String[])object).length == 1) {
                return new Locale(object[0]);
            }
        } else {
            if (!string.contains("_")) return new Locale(string);
            object = string.split("_", -1);
            if (((String[])object).length > 2) {
                return new Locale(object[0], object[1], (String)object[2]);
            }
            if (((String[])object).length > 1) {
                return new Locale(object[0], (String)object[1]);
            }
            if (((String[])object).length == 1) {
                return new Locale((String)object[0]);
            }
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Can not parse language tag: [");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append("]");
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public static h c(String stringArray) {
        if (stringArray != null && !stringArray.isEmpty()) {
            stringArray = stringArray.split(",", -1);
            int n8 = stringArray.length;
            Locale[] localeArray = new Locale[n8];
            for (int i8 = 0; i8 < n8; ++i8) {
                localeArray[i8] = ax.Y.h$a.a(stringArray[i8]);
            }
            return h.a(localeArray);
        }
        return h.e();
    }

    public static h e() {
        return b;
    }

    public static h j(LocaleList localeList) {
        return new h(new q(localeList));
    }

    public Locale d(int n8) {
        return this.a.get(n8);
    }

    public boolean equals(Object object) {
        return object instanceof h && this.a.equals(((h)object).a);
    }

    public boolean f() {
        return this.a.isEmpty();
    }

    public int g() {
        return this.a.size();
    }

    public String h() {
        return this.a.a();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public Object i() {
        return this.a.b();
    }

    public String toString() {
        return this.a.toString();
    }

    static class a {
        private static final Locale[] a = new Locale[]{new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale a(String string) {
            return Locale.forLanguageTag(string);
        }

        private static boolean b(Locale locale) {
            Locale[] localeArray = a;
            int n8 = localeArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                if (!localeArray[i8].equals(locale)) continue;
                return true;
            }
            return false;
        }

        static boolean c(Locale object, Locale locale) {
            if (((Locale)object).equals(locale)) {
                return true;
            }
            if (!((Locale)object).getLanguage().equals(locale.getLanguage())) {
                return false;
            }
            if (!ax.Y.h$a.b((Locale)object) && !ax.Y.h$a.b(locale)) {
                String string = ax.a0.b.a((Locale)object);
                if (string.isEmpty()) {
                    return ((String)(object = ((Locale)object).getCountry())).isEmpty() || ((String)object).equals(locale.getCountry());
                    {
                    }
                }
                return string.equals(ax.a0.b.a(locale));
            }
            return false;
        }
    }

    static class b {
        static LocaleList a(Locale ... localeArray) {
            return new LocaleList(localeArray);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }
}

