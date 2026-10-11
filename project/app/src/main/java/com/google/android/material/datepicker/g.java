/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import ax.A6.e;
import ax.b0.c;
import ax.k6.k;
import com.google.android.material.datepicker.t;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

class g {
    static c<String, String> a(Long l8, Long l9) {
        return g.b(l8, l9, null);
    }

    static c<String, String> b(Long comparable, Long comparable2, SimpleDateFormat simpleDateFormat) {
        if (comparable == null && comparable2 == null) {
            return c.a(null, null);
        }
        if (comparable == null) {
            return c.a(null, g.d((Long)comparable2, simpleDateFormat));
        }
        if (comparable2 == null) {
            return c.a(g.d((Long)comparable, simpleDateFormat), null);
        }
        Calendar calendar = t.p();
        Calendar calendar2 = t.r();
        calendar2.setTimeInMillis((Long)comparable);
        Calendar calendar3 = t.r();
        calendar3.setTimeInMillis((Long)comparable2);
        if (simpleDateFormat != null) {
            comparable = new Date((Long)comparable);
            comparable2 = new Date((Long)comparable2);
            return c.a(simpleDateFormat.format((Date)comparable), simpleDateFormat.format((Date)comparable2));
        }
        if (calendar2.get(1) == calendar3.get(1)) {
            if (calendar2.get(1) == calendar.get(1)) {
                return c.a(g.g((Long)comparable, Locale.getDefault()), g.g((Long)comparable2, Locale.getDefault()));
            }
            return c.a(g.g((Long)comparable, Locale.getDefault()), g.n((Long)comparable2, Locale.getDefault()));
        }
        return c.a(g.n((Long)comparable, Locale.getDefault()), g.n((Long)comparable2, Locale.getDefault()));
    }

    static String c(long l8) {
        return g.d(l8, null);
    }

    static String d(long l8, SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(l8));
        }
        if (g.q(l8)) {
            return g.f(l8);
        }
        return g.m(l8);
    }

    static String e(Context context, long l8, boolean bl, boolean bl2, boolean bl3) {
        String string;
        String string2 = string = g.j(l8);
        if (bl) {
            string2 = String.format(context.getString(k.K), string);
        }
        if (bl2) {
            return String.format(context.getString(k.G), string2);
        }
        if (bl3) {
            return String.format(context.getString(k.t), string2);
        }
        return string2;
    }

    static String f(long l8) {
        return g.g(l8, Locale.getDefault());
    }

    static String g(long l8, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.a(t.c(locale), new Date(l8));
        }
        return t.l(locale).format(new Date(l8));
    }

    static String h(long l8) {
        return g.i(l8, Locale.getDefault());
    }

    static String i(long l8, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.a(t.m(locale), new Date(l8));
        }
        return t.j(locale).format(new Date(l8));
    }

    static String j(long l8) {
        if (g.q(l8)) {
            return g.h(l8);
        }
        return g.o(l8);
    }

    static String k(Context context, int n8) {
        if (t.p().get(1) == n8) {
            return String.format(context.getString(k.y), n8);
        }
        return String.format(context.getString(k.z), n8);
    }

    static String l(long l8) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.a(t.u(Locale.getDefault()), new Date(l8));
        }
        return DateUtils.formatDateTime(null, (long)l8, (int)8228);
    }

    static String m(long l8) {
        return g.n(l8, Locale.getDefault());
    }

    static String n(long l8, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.a(t.t(locale), new Date(l8));
        }
        return t.k(locale).format(new Date(l8));
    }

    static String o(long l8) {
        return g.p(l8, Locale.getDefault());
    }

    static String p(long l8, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.a(t.v(locale), new Date(l8));
        }
        return t.j(locale).format(new Date(l8));
    }

    private static boolean q(long l8) {
        Calendar calendar = t.p();
        Calendar calendar2 = t.r();
        calendar2.setTimeInMillis(l8);
        return calendar.get(1) == calendar2.get(1);
    }
}

