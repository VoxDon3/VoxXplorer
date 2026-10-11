/*
 * Decompiled with CFR 0.152.
 */
package ax.C2;

import android.content.Context;
import android.os.Build;
import ax.B2.i;
import ax.C2.B;
import ax.C2.a;
import ax.Gb.l;
import ax.Lb.f;
import ax.sb.m;
import ax.sb.q;
import ax.tb.F;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

public final class A {
    public static final A a = new A();

    private A() {
    }

    private final File c(Context context) {
        return new File(ax.C2.a.a.a(context), "androidx.work.workdb");
    }

    public static final void d(Context object) {
        l.f(object, "context");
        A object22 = a;
        File file = object22.b((Context)object);
        if (Build.VERSION.SDK_INT >= 23 && file.exists()) {
            i.e().a(B.b(), "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry entry : object22.e((Context)object).entrySet()) {
                CharSequence charSequence;
                object = (File)entry.getKey();
                File file2 = (File)entry.getValue();
                if (!((File)object).exists()) continue;
                if (file2.exists()) {
                    i i8 = i.e();
                    charSequence = B.b();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Over-writing contents of ");
                    stringBuilder.append(file2);
                    i8.k((String)charSequence, stringBuilder.toString());
                }
                if (((File)object).renameTo(file2)) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("Migrated ");
                    ((StringBuilder)charSequence).append(object);
                    ((StringBuilder)charSequence).append("to ");
                    ((StringBuilder)charSequence).append(file2);
                    object = ((StringBuilder)charSequence).toString();
                } else {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("Renaming ");
                    ((StringBuilder)charSequence).append(object);
                    ((StringBuilder)charSequence).append(" to ");
                    ((StringBuilder)charSequence).append(file2);
                    ((StringBuilder)charSequence).append(" failed");
                    object = ((StringBuilder)charSequence).toString();
                }
                i.e().a(B.b(), (String)object);
            }
        }
    }

    public final File a(Context context) {
        l.f(context, "context");
        if (Build.VERSION.SDK_INT < 23) {
            return this.b(context);
        }
        return this.c(context);
    }

    public final File b(Context object) {
        l.f(object, "context");
        object = object.getDatabasePath("androidx.work.workdb");
        l.e(object, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return object;
    }

    public final Map<File, File> e(Context object) {
        l.f(object, "context");
        if (Build.VERSION.SDK_INT >= 23) {
            File file = this.b((Context)object);
            object = this.a((Context)object);
            String[] stringArray = B.a();
            LinkedHashMap<File, File> linkedHashMap = new LinkedHashMap<File, File>(f.b(F.d(stringArray.length), 16));
            for (String string : stringArray) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(file.getPath());
                stringBuilder.append(string);
                File file2 = new File(stringBuilder.toString());
                stringBuilder = new StringBuilder();
                stringBuilder.append(((File)object).getPath());
                stringBuilder.append(string);
                m<File, File> object2 = q.a(file2, new File(stringBuilder.toString()));
                linkedHashMap.put(object2.c(), object2.d());
            }
            return F.k(linkedHashMap, q.a(file, object));
        }
        return F.g();
    }
}

