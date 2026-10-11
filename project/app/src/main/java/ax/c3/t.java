/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import android.content.Context;
import android.text.format.DateUtils;
import ax.X2.Q;
import ax.c3.r;
import ax.c3.s;
import ax.u3.b;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class t {
    private static Format a;
    private static Locale b;
    private static Format c;
    private static Format d;
    private static Locale e;

    public static String a(Context object, long l8, boolean bl) {
        if (bl) {
            String string = t.d((Context)object, l8);
            String string2 = t.g((Context)object, l8);
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(' ');
            ((StringBuilder)object).append(string2);
            return ((StringBuilder)object).toString();
        }
        t.h();
        Object object2 = c;
        if (object2 != null) {
            return ((Format)object2).format(new Date(l8));
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("no init?");
        ((StringBuilder)object2).append(Locale.getDefault());
        ax.u3.b.e(((StringBuilder)object2).toString());
        object2 = t.c((Context)object, l8);
        object = t.g((Context)object, l8);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object2);
        stringBuilder.append(' ');
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }

    public static String b(Context context, long l8) {
        return t.a(context, l8, false);
    }

    public static String c(Context context, long l8) {
        t.i();
        Serializable serializable = a;
        if (serializable != null) {
            return ((Format)serializable).format(new Date(l8));
        }
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append("no init?");
        ((StringBuilder)serializable).append(Locale.getDefault());
        ax.u3.b.e(((StringBuilder)serializable).toString());
        return DateUtils.formatDateTime((Context)context, (long)l8, (int)524308);
    }

    public static String d(Context context, long l8) {
        return DateUtils.formatDateTime((Context)context, (long)l8, (int)131092);
    }

    public static String e(Context context, long l8) {
        if (d == null) {
            d = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        }
        return d.format(new Date(l8));
    }

    public static String f(Context context, long l8, int n8) {
        if (n8 == 0) {
            return t.c(context, l8);
        }
        if (n8 == 1) {
            return t.d(context, l8);
        }
        if (n8 == 2) {
            return t.e(context, l8);
        }
        return t.c(context, l8);
    }

    public static String g(Context context, long l8) {
        return DateUtils.formatDateTime((Context)context, (long)l8, (int)1);
    }

    private static void h() {
        Locale locale = e;
        if (locale != null && (locale == null || locale.equals(Locale.getDefault()))) {
            return;
        }
        c = Q.o0() ? r.a(2, 3, Locale.getDefault()) : DateFormat.getDateTimeInstance(2, 3, Locale.getDefault());
        e = Locale.getDefault();
    }

    private static void i() {
        Locale locale = b;
        if (locale != null && (locale == null || locale.equals(Locale.getDefault()))) {
            return;
        }
        a = Q.o0() ? s.a(2, Locale.getDefault()) : DateFormat.getDateInstance(2, Locale.getDefault());
        b = Locale.getDefault();
    }
}

