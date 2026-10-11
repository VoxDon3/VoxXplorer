package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import ax.b0.C1442c;
import ax.k6.C2410k;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
class g {
    static C1442c<String, String> a(Long l, Long l2) {
        return b(l, l2, null);
    }

    static C1442c<String, String> b(Long l, Long l2, SimpleDateFormat simpleDateFormat) {
        if (l == null && l2 == null) {
            return C1442c.a(null, null);
        }
        if (l == null) {
            return C1442c.a(null, d(l2.longValue(), simpleDateFormat));
        }
        if (l2 == null) {
            return C1442c.a(d(l.longValue(), simpleDateFormat), null);
        }
        Calendar p = t.p();
        Calendar r = t.r();
        r.setTimeInMillis(l.longValue());
        Calendar r2 = t.r();
        r2.setTimeInMillis(l2.longValue());
        if (simpleDateFormat != null) {
            return C1442c.a(simpleDateFormat.format(new Date(l.longValue())), simpleDateFormat.format(new Date(l2.longValue())));
        }
        return r.get(1) == r2.get(1) ? r.get(1) == p.get(1) ? C1442c.a(g(l.longValue(), Locale.getDefault()), g(l2.longValue(), Locale.getDefault())) : C1442c.a(g(l.longValue(), Locale.getDefault()), n(l2.longValue(), Locale.getDefault())) : C1442c.a(n(l.longValue(), Locale.getDefault()), n(l2.longValue(), Locale.getDefault()));
    }

    static String c(long j) {
        return d(j, null);
    }

    static String d(long j, SimpleDateFormat simpleDateFormat) {
        return simpleDateFormat != null ? simpleDateFormat.format(new Date(j)) : q(j) ? f(j) : m(j);
    }

    static String e(Context context, long j, boolean z, boolean z2, boolean z3) {
        String j2 = j(j);
        if (z) {
            j2 = String.format(context.getString(C2410k.K), j2);
        }
        return z2 ? String.format(context.getString(C2410k.G), j2) : z3 ? String.format(context.getString(C2410k.t), j2) : j2;
    }

    static String f(long j) {
        return g(j, Locale.getDefault());
    }

    static String g(long j, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT < 24) {
            return t.l(locale).format(new Date(j));
        }
        format = t.c(locale).format(new Date(j));
        return format;
    }

    static String h(long j) {
        return i(j, Locale.getDefault());
    }

    static String i(long j, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT < 24) {
            return t.j(locale).format(new Date(j));
        }
        format = t.m(locale).format(new Date(j));
        return format;
    }

    static String j(long j) {
        return q(j) ? h(j) : o(j);
    }

    static String k(Context context, int i) {
        return t.p().get(1) == i ? String.format(context.getString(C2410k.y), Integer.valueOf(i)) : String.format(context.getString(C2410k.z), Integer.valueOf(i));
    }

    static String l(long j) {
        String format;
        if (Build.VERSION.SDK_INT < 24) {
            return DateUtils.formatDateTime(null, j, 8228);
        }
        format = t.u(Locale.getDefault()).format(new Date(j));
        return format;
    }

    static String m(long j) {
        return n(j, Locale.getDefault());
    }

    static String n(long j, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT < 24) {
            return t.k(locale).format(new Date(j));
        }
        format = t.t(locale).format(new Date(j));
        return format;
    }

    static String o(long j) {
        return p(j, Locale.getDefault());
    }

    static String p(long j, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT < 24) {
            return t.j(locale).format(new Date(j));
        }
        format = t.v(locale).format(new Date(j));
        return format;
    }

    private static boolean q(long j) {
        Calendar p = t.p();
        Calendar r = t.r();
        r.setTimeInMillis(j);
        return p.get(1) == r.get(1);
    }
}
