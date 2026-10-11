/*
 * Decompiled with CFR 0.152.
 */
package ax.C2;

import android.content.Context;
import android.os.Build;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemalarm.f;
import androidx.work.impl.background.systemjob.SystemJobService;
import ax.B2.i;
import ax.C2.D;
import ax.C2.t;
import ax.F2.l;
import ax.K2.v;
import ax.L2.r;
import java.util.Iterator;
import java.util.List;

public class u {
    private static final String a = i.i("Schedulers");

    static t a(Context context, D object) {
        if (Build.VERSION.SDK_INT >= 23) {
            object = new l(context, (D)object);
            r.a(context, SystemJobService.class, true);
            i.e().a(a, "Created SystemJobScheduler and enabled SystemJobService");
            return object;
        }
        t t8 = u.c(context);
        object = t8;
        if (t8 == null) {
            object = new f(context);
            r.a(context, SystemAlarmService.class, true);
            i.e().a(a, "Created SystemAlarmScheduler");
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(a vArray, WorkDatabase object, List<t> object2) {
        Throwable throwable2;
        block8: {
            Object object3;
            v[] vArray2;
            block7: {
                if (object2 == null) return;
                if (object2.size() == 0) {
                    return;
                }
                vArray2 = ((WorkDatabase)object).I();
                ((ax.k2.u)object).e();
                try {
                    object3 = vArray2.e(vArray.h());
                    vArray = vArray2.t(200);
                    if (object3 == null || object3.size() <= 0) break block7;
                    long l8 = System.currentTimeMillis();
                    Iterator<v> iterator = object3.iterator();
                    while (iterator.hasNext()) {
                        vArray2.b(iterator.next().a, l8);
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
            }
            ((ax.k2.u)object).A();
            ((ax.k2.u)object).i();
            if (object3 != null && object3.size() > 0) {
                vArray2 = object3.toArray(new v[object3.size()]);
                object3 = object2.iterator();
                while (object3.hasNext()) {
                    object = (t)object3.next();
                    if (!object.c()) continue;
                    object.a(vArray2);
                }
            }
            if (vArray == null) return;
            if (vArray.size() <= 0) return;
            vArray = vArray.toArray(new v[vArray.size()]);
            object2 = object2.iterator();
            while (object2.hasNext()) {
                object = (t)object2.next();
                if (object.c()) continue;
                object.a(vArray);
            }
            return;
        }
        ((ax.k2.u)object).i();
        throw throwable2;
    }

    private static t c(Context object) {
        try {
            object = (t)Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(object);
            i.e().a(a, "Created androidx.work.impl.background.gcm.GcmScheduler");
            return object;
        }
        catch (Throwable throwable) {
            i.e().b(a, "Unable to create GCM Scheduler", throwable);
            return null;
        }
    }
}

