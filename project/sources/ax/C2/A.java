package ax.C2;

import android.content.Context;
import android.os.Build;
import ax.sb.C3081m;
import ax.tb.C3115F;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class A {
    public static final A a = new A();

    private A() {
    }

    private final File c(Context context) {
        return new File(C0652a.a.a(context), "androidx.work.workdb");
    }

    public static final void d(Context context) {
        String str;
        String str2;
        String str3;
        ax.Gb.l.f(context, "context");
        A a2 = a;
        File b = a2.b(context);
        if (Build.VERSION.SDK_INT < 23 || !b.exists()) {
            return;
        }
        ax.B2.i e = ax.B2.i.e();
        str = B.a;
        e.a(str, "Migrating WorkDatabase to the no-backup directory");
        for (Map.Entry<File, File> entry : a2.e(context).entrySet()) {
            File key = entry.getKey();
            File value = entry.getValue();
            if (key.exists()) {
                if (value.exists()) {
                    ax.B2.i e2 = ax.B2.i.e();
                    str3 = B.a;
                    e2.k(str3, "Over-writing contents of " + value);
                }
                String str4 = key.renameTo(value) ? "Migrated " + key + "to " + value : "Renaming " + key + " to " + value + " failed";
                ax.B2.i e3 = ax.B2.i.e();
                str2 = B.a;
                e3.a(str2, str4);
            }
        }
    }

    public final File a(Context context) {
        ax.Gb.l.f(context, "context");
        return Build.VERSION.SDK_INT < 23 ? b(context) : c(context);
    }

    public final File b(Context context) {
        ax.Gb.l.f(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        ax.Gb.l.e(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    public final Map<File, File> e(Context context) {
        String[] strArr;
        ax.Gb.l.f(context, "context");
        if (Build.VERSION.SDK_INT < 23) {
            return C3115F.g();
        }
        File b = b(context);
        File a2 = a(context);
        strArr = B.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(ax.Lb.f.b(C3115F.d(strArr.length), 16));
        for (String str : strArr) {
            C3081m a3 = ax.sb.q.a(new File(b.getPath() + str), new File(a2.getPath() + str));
            linkedHashMap.put(a3.c(), a3.d());
        }
        return C3115F.k(linkedHashMap, ax.sb.q.a(b, a2));
    }
}
