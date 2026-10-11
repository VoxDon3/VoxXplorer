/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import ax.A6.l;
import ax.A6.m;
import ax.A6.n;
import ax.A6.o;
import ax.A6.p;
import ax.k6.k;
import com.google.android.material.datepicker.s;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

class t {
    static AtomicReference<s> a = new AtomicReference();

    static long a(long l8) {
        Calendar calendar = t.r();
        calendar.setTimeInMillis(l8);
        return t.f(calendar).getTimeInMillis();
    }

    private static int b(String string, String string2, int n8, int n9) {
        while (n9 >= 0 && n9 < string.length() && string2.indexOf(string.charAt(n9)) == -1) {
            int n10 = n9;
            if (string.charAt(n9) == '\'') {
                do {
                    n10 = n9 += n8;
                    if (n9 < 0) break;
                    n10 = n9;
                    if (n9 >= string.length()) break;
                    n10 = n9;
                } while (string.charAt(n9) != '\'');
            }
            n9 = n10 + n8;
        }
        return n9;
    }

    @TargetApi(value=24)
    static DateFormat c(Locale locale) {
        return t.d("MMMd", locale);
    }

    @TargetApi(value=24)
    private static DateFormat d(String string, Locale locale) {
        string = l.a(string, locale);
        m.a((DateFormat)string, t.q());
        o.a((DateFormat)string, n.a());
        return string;
    }

    static String e(String string) {
        return string.replaceAll("[^dMy/\\-.]", "").replaceAll("d{1,2}", "dd").replaceAll("M{1,2}", "MM").replaceAll("y{1,4}", "yyyy").replaceAll("\\.$", "").replaceAll("My", "M/y");
    }

    static Calendar f(Calendar calendar) {
        calendar = t.s(calendar);
        Calendar calendar2 = t.r();
        calendar2.set(calendar.get(1), calendar.get(2), calendar.get(5));
        return calendar2;
    }

    static SimpleDateFormat g() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(t.e(((SimpleDateFormat)java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern()), Locale.getDefault());
        simpleDateFormat.setTimeZone(t.o());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    static String h(Resources object, SimpleDateFormat object2) {
        object2 = ((SimpleDateFormat)object2).toPattern();
        String string = object.getString(k.J);
        String string2 = object.getString(k.I);
        String string3 = object.getString(k.H);
        object = object2;
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage())) {
            object = ((String)object2).replaceAll("d+", "d").replaceAll("M+", "M").replaceAll("y+", "y");
        }
        return ((String)object).replace("d", string3).replace("M", string2).replace("y", string);
    }

    private static java.text.DateFormat i(int n8, Locale cloneable) {
        cloneable = java.text.DateFormat.getDateInstance(n8, (Locale)cloneable);
        ((java.text.DateFormat)cloneable).setTimeZone(t.o());
        return cloneable;
    }

    static java.text.DateFormat j(Locale locale) {
        return t.i(0, locale);
    }

    static java.text.DateFormat k(Locale locale) {
        return t.i(2, locale);
    }

    static java.text.DateFormat l(Locale cloneable) {
        cloneable = (SimpleDateFormat)t.k((Locale)cloneable);
        ((SimpleDateFormat)cloneable).applyPattern(t.w(((SimpleDateFormat)cloneable).toPattern()));
        return cloneable;
    }

    @TargetApi(value=24)
    static DateFormat m(Locale locale) {
        return t.d("MMMMEEEEd", locale);
    }

    static s n() {
        s s8;
        s s9 = s8 = a.get();
        if (s8 == null) {
            s9 = s.c();
        }
        return s9;
    }

    private static TimeZone o() {
        return java.util.DesugarTimeZone.getTimeZone((String)"UTC");
    }

    static Calendar p() {
        Calendar calendar = t.n().a();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(t.o());
        return calendar;
    }

    @TargetApi(value=24)
    private static android.icu.util.TimeZone q() {
        return p.a("UTC");
    }

    static Calendar r() {
        return t.s(null);
    }

    static Calendar s(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(t.o());
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    @TargetApi(value=24)
    static DateFormat t(Locale locale) {
        return t.d("yMMMd", locale);
    }

    @TargetApi(value=24)
    static DateFormat u(Locale locale) {
        return t.d("yMMMM", locale);
    }

    @TargetApi(value=24)
    static DateFormat v(Locale locale) {
        return t.d("yMMMMEEEEd", locale);
    }

    private static String w(String string) {
        int n8 = t.b(string, "yY", 1, 0);
        if (n8 >= string.length()) {
            return string;
        }
        CharSequence charSequence = "EMd";
        int n9 = t.b(string, "EMd", 1, n8);
        if (n9 < string.length()) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("EMd");
            ((StringBuilder)charSequence).append(",");
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return string.replace(string.substring(t.b(string, (String)charSequence, -1, n8) + 1, n9), " ").trim();
    }
}

