package ax.c3;

import android.content.Context;
import android.icu.text.DateFormat;
import android.text.format.DateUtils;
import ax.u3.C3184b;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: ax.c3.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1831t {
    private static Format a;
    private static Locale b;
    private static Format c;
    private static Format d;
    private static Locale e;

    public static String a(Context context, long j, boolean z) {
        if (z) {
            return d(context, j) + ' ' + g(context, j);
        }
        h();
        Format format = c;
        if (format != null) {
            return format.format(new Date(j));
        }
        C3184b.e("no init?" + Locale.getDefault());
        return c(context, j) + ' ' + g(context, j);
    }

    public static String b(Context context, long j) {
        return a(context, j, false);
    }

    public static String c(Context context, long j) {
        i();
        Format format = a;
        if (format != null) {
            return format.format(new Date(j));
        }
        C3184b.e("no init?" + Locale.getDefault());
        return DateUtils.formatDateTime(context, j, 524308);
    }

    public static String d(Context context, long j) {
        return DateUtils.formatDateTime(context, j, 131092);
    }

    public static String e(Context context, long j) {
        if (d == null) {
            d = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        }
        return d.format(new Date(j));
    }

    public static String f(Context context, long j, int i) {
        return i == 0 ? c(context, j) : i == 1 ? d(context, j) : i == 2 ? e(context, j) : c(context, j);
    }

    public static String g(Context context, long j) {
        return DateUtils.formatDateTime(context, j, 1);
    }

    private static void h() {
        DateFormat dateTimeInstance;
        Locale locale = e;
        if (locale == null || !(locale == null || locale.equals(Locale.getDefault()))) {
            if (ax.X2.Q.o0()) {
                dateTimeInstance = DateFormat.getDateTimeInstance(2, 3, Locale.getDefault());
                c = dateTimeInstance;
            } else {
                c = java.text.DateFormat.getDateTimeInstance(2, 3, Locale.getDefault());
            }
            e = Locale.getDefault();
        }
    }

    private static void i() {
        DateFormat dateInstance;
        Locale locale = b;
        if (locale == null || !(locale == null || locale.equals(Locale.getDefault()))) {
            if (ax.X2.Q.o0()) {
                dateInstance = DateFormat.getDateInstance(2, Locale.getDefault());
                a = dateInstance;
            } else {
                a = java.text.DateFormat.getDateInstance(2, Locale.getDefault());
            }
            b = Locale.getDefault();
        }
    }
}
