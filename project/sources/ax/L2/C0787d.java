package ax.L2;

import android.os.Build;
import androidx.work.b;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: ax.L2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0787d {
    public static final ax.K2.v a(ax.K2.v vVar) {
        ax.Gb.l.f(vVar, "workSpec");
        ax.B2.b bVar = vVar.j;
        String str = vVar.c;
        if (ax.Gb.l.a(str, ConstraintTrackingWorker.class.getName()) || !(bVar.f() || bVar.i())) {
            return vVar;
        }
        androidx.work.b a = new b.a().c(vVar.e).e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str).a();
        ax.Gb.l.e(a, "Builder().putAll(workSpe…ame)\n            .build()");
        String name = ConstraintTrackingWorker.class.getName();
        ax.Gb.l.e(name, "name");
        return ax.K2.v.c(vVar, null, null, name, null, a, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 1048555, null);
    }

    private static final boolean b(List<? extends ax.C2.t> list, String str) {
        Class<?> cls;
        List<? extends ax.C2.t> list2;
        try {
            cls = Class.forName(str);
            list2 = list;
        } catch (ClassNotFoundException unused) {
        }
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((ax.C2.t) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public static final ax.K2.v c(List<? extends ax.C2.t> list, ax.K2.v vVar) {
        ax.Gb.l.f(list, "schedulers");
        ax.Gb.l.f(vVar, "workSpec");
        int i = Build.VERSION.SDK_INT;
        return (23 > i || i >= 26) ? (i > 22 || !b(list, "androidx.work.impl.background.gcm.GcmScheduler")) ? vVar : a(vVar) : a(vVar);
    }
}
