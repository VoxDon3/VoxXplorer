/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

class S0 {
    private static Long a = S0.c(0L);
    private static final Map b = new HashMap();
    static Locale c = S0.b();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static Date a(Date date) throws ParseException {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return date;
        }
        Map map = b;
        synchronized (map) {
            Throwable throwable2;
            block6: {
                Serializable serializable;
                block5: {
                    try {
                        Comparable<Long> comparable = (Long)map.get(locale);
                        serializable = comparable;
                        if (comparable == null) {
                            serializable = new SimpleDateFormat("yyyyMMddHHmmssz");
                            long l8 = ((DateFormat)serializable).parse("19700101000000GMT+00:00").getTime();
                            serializable = l8 == 0L ? a : S0.c(l8);
                        }
                        break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    map.put(locale, serializable);
                }
                if (serializable == a) return date;
                return new Date(date.getTime() - (Long)serializable);
            }
            throw throwable2;
        }
    }

    private static Locale b() {
        if ("en".equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            return Locale.getDefault();
        }
        Locale[] localeArray = Locale.getAvailableLocales();
        for (int i8 = 0; i8 != localeArray.length; ++i8) {
            if (!"en".equalsIgnoreCase(localeArray[i8].getLanguage())) continue;
            return localeArray[i8];
        }
        return Locale.getDefault();
    }

    private static Long c(long l8) {
        return l8;
    }
}

