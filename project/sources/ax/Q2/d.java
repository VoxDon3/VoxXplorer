package ax.Q2;

import android.content.Context;
import java.util.HashSet;

/* loaded from: classes.dex */
public class d {
    private static boolean a;
    private static boolean b;
    private static HashSet<String> c = new HashSet<>();

    public static void a(Context context) {
        if (a || b) {
            return;
        }
        try {
            if (c.a()) {
                com.google.firebase.crashlytics.a.a().e("build", "debug");
                com.google.firebase.crashlytics.a.a().d(false);
            } else {
                com.google.firebase.crashlytics.a.a().e("build", "release");
                com.google.firebase.crashlytics.a.a().d(ax.t3.j.n(context));
            }
            a = true;
        } catch (Exception unused) {
            b = true;
        }
    }

    public static void b(Throwable th) {
        if (b) {
            return;
        }
        try {
            com.google.firebase.crashlytics.a.a().c(th);
        } catch (Exception unused) {
        }
    }

    public static void c(String str, Throwable th) {
        if (b) {
            return;
        }
        String str2 = str + th.getClass().getSimpleName();
        if (c.contains(str2)) {
            return;
        }
        try {
            c.add(str2);
            com.google.firebase.crashlytics.a.a().c(th);
        } catch (Exception unused) {
        }
    }
}
