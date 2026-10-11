/*
 * Decompiled with CFR 0.152.
 */
package ax.a0;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public final class b {
    private static Method a;

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            }
            catch (Exception exception) {
                throw new IllegalStateException(exception);
            }
        }
    }

    public static String a(Locale locale) {
        block5: {
            InvocationTargetException invocationTargetException2;
            block4: {
                if (Build.VERSION.SDK_INT >= 24) {
                    return b.c(b.a(b.b(locale)));
                }
                try {
                    String string = ax.a0.b$a.a((Locale)a.invoke(null, locale));
                    return string;
                }
                catch (IllegalAccessException illegalAccessException) {
                }
                catch (InvocationTargetException invocationTargetException2) {
                    break block4;
                }
                Log.w((String)"ICUCompat", (Throwable)illegalAccessException);
                break block5;
            }
            Log.w((String)"ICUCompat", (Throwable)invocationTargetException2);
        }
        return ax.a0.b$a.a(locale);
    }

    static class a {
        static String a(Locale locale) {
            return locale.getScript();
        }
    }

    static class b {
        static ULocale a(Object object) {
            return ULocale.addLikelySubtags((ULocale)((ULocale)object));
        }

        static ULocale b(Locale locale) {
            return ULocale.forLocale((Locale)locale);
        }

        static String c(Object object) {
            return ((ULocale)object).getScript();
        }
    }
}

