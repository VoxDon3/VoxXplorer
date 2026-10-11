package ax.Y;

import android.os.Build;
import android.os.LocaleList;
import ax.a0.C1264b;
import java.util.Locale;

/* loaded from: classes.dex */
public final class h {
    private static final h b = a(new Locale[0]);
    private final j a;

    static class a {
        private static final Locale[] a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        private static boolean b(Locale locale) {
            for (Locale locale2 : a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        static boolean c(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || b(locale) || b(locale2)) {
                return false;
            }
            String a2 = C1264b.a(locale);
            if (!a2.isEmpty()) {
                return a2.equals(C1264b.a(locale2));
            }
            String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
    }

    static class b {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private h(j jVar) {
        this.a = jVar;
    }

    public static h a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? j(b.a(localeArr)) : new h(new i(localeArr));
    }

    static Locale b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else {
            if (!str.contains("_")) {
                return new Locale(str);
            }
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public static h c(String str) {
        if (str == null || str.isEmpty()) {
            return e();
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = a.a(split[i]);
        }
        return a(localeArr);
    }

    public static h e() {
        return b;
    }

    public static h j(LocaleList localeList) {
        return new h(new q(localeList));
    }

    public Locale d(int i) {
        return this.a.get(i);
    }

    public boolean equals(Object obj) {
        return (obj instanceof h) && this.a.equals(((h) obj).a);
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
}
