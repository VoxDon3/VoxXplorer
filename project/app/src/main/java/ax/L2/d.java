/*
 * Decompiled with CFR 0.152.
 */
package ax.L2;

import android.os.Build;
import androidx.work.b;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import ax.C2.t;
import ax.Gb.l;
import ax.K2.v;
import java.util.Collection;
import java.util.List;

public final class d {
    public static final v a(v v8) {
        l.f(v8, "workSpec");
        Object object = v8.j;
        Object object2 = v8.c;
        if (!l.a(object2, ConstraintTrackingWorker.class.getName()) && (((ax.B2.b)object).f() || ((ax.B2.b)object).i())) {
            object2 = new b.a().c(v8.e).e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", (String)object2).a();
            l.e(object2, "Builder().putAll(workSpe\u2026ame)\n            .build()");
            object = ConstraintTrackingWorker.class.getName();
            l.e(object, "name");
            return v.c(v8, null, null, (String)object, null, (b)object2, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 1048555, null);
        }
        return v8;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final boolean b(List<? extends t> iterator, String clazz) {
        block5: {
            clazz = Class.forName(clazz);
            iterator = (Iterable)((Object)iterator);
            if (!(iterator instanceof Collection) || !((Collection)((Object)iterator)).isEmpty()) break block5;
            return false;
        }
        try {
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                boolean bl = clazz.isAssignableFrom(((t)iterator.next()).getClass());
                if (!bl) continue;
                return true;
            }
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
        return false;
    }

    public static final v c(List<? extends t> list, v v8) {
        l.f(list, "schedulers");
        l.f(v8, "workSpec");
        int n8 = Build.VERSION.SDK_INT;
        if (23 <= n8 && n8 < 26) {
            return d.a(v8);
        }
        if (n8 <= 22 && d.b(list, "androidx.work.impl.background.gcm.GcmScheduler")) {
            return d.a(v8);
        }
        return v8;
    }
}

