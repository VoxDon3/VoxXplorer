/*
 * Decompiled with CFR 0.152.
 */
package ax.Q2;

import android.content.Context;
import ax.Q2.c;
import ax.t3.j;
import com.google.firebase.crashlytics.a;
import java.util.HashSet;

public class d {
    private static boolean a;
    private static boolean b;
    private static HashSet<String> c;

    static {
        c = new HashSet();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Context context) {
        if (a) {
            return;
        }
        if (b) {
            return;
        }
        try {
            boolean bl = ax.Q2.c.a();
            if (bl) {
                com.google.firebase.crashlytics.a.a().e("build", "debug");
                com.google.firebase.crashlytics.a.a().d(false);
            } else {
                com.google.firebase.crashlytics.a.a().e("build", "release");
                bl = j.n(context);
                com.google.firebase.crashlytics.a.a().d(bl);
            }
            a = true;
            return;
        }
        catch (Exception exception) {
            b = true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(Throwable throwable) {
        if (b) {
            return;
        }
        try {
            com.google.firebase.crashlytics.a.a().c(throwable);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c(String string, Throwable throwable) {
        if (b) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(throwable.getClass().getSimpleName());
        string = stringBuilder.toString();
        if (c.contains(string)) {
            return;
        }
        try {
            c.add(string);
            com.google.firebase.crashlytics.a.a().c(throwable);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

