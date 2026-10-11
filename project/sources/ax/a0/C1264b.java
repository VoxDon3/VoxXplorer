package ax.a0;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: ax.a0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1264b {
    private static Method a;

    /* renamed from: ax.a0.b$a */
    static class a {
        static String a(Locale locale) {
            return locale.getScript();
        }
    }

    /* renamed from: ax.a0.b$b, reason: collision with other inner class name */
    static class C0241b {
        static ULocale a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        static ULocale b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        static String c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public static String a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0241b.c(C0241b.a(C0241b.b(locale)));
        }
        try {
            return a.a((Locale) a.invoke(null, locale));
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
            return a.a(locale);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
            return a.a(locale);
        }
    }
}
