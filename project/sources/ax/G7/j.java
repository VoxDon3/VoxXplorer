package ax.G7;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import ax.L7.F;
import ax.tb.C3139o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class j {
    public static final j a = new j();

    private j() {
    }

    public static /* synthetic */ F.e.d.a.c c(j jVar, String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            z = false;
        }
        return jVar.b(str, i, i2, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        r0 = android.app.Application.getProcessName();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String f() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L10
            java.lang.String r0 = ax.G7.i.a()
            java.lang.String r1 = "{\n      Process.myProcessName()\n    }"
            ax.Gb.l.e(r0, r1)
            return r0
        L10:
            r1 = 28
            java.lang.String r2 = ""
            if (r0 < r1) goto L1e
            java.lang.String r0 = ax.R5.m.a()
            if (r0 != 0) goto L1d
            return r2
        L1d:
            return r0
        L1e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.G7.j.f():java.lang.String");
    }

    public final F.e.d.a.c a(String str, int i, int i2) {
        ax.Gb.l.f(str, "processName");
        return c(this, str, i, i2, false, 8, null);
    }

    public final F.e.d.a.c b(String str, int i, int i2, boolean z) {
        ax.Gb.l.f(str, "processName");
        F.e.d.a.c a2 = F.e.d.a.c.a().e(str).d(i).c(i2).b(z).a();
        ax.Gb.l.e(a2, "builder()\n      .setProc…ltProcess)\n      .build()");
        return a2;
    }

    public final List<F.e.d.a.c> d(Context context) {
        ax.Gb.l.f(context, "context");
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = C3139o.j();
        }
        List B = C3139o.B(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        for (Object obj : B) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C3139o.s(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
            arrayList2.add(F.e.d.a.c.a().e(runningAppProcessInfo.processName).d(runningAppProcessInfo.pid).c(runningAppProcessInfo.importance).b(ax.Gb.l.a(runningAppProcessInfo.processName, str)).a());
        }
        return arrayList2;
    }

    public final F.e.d.a.c e(Context context) {
        Object obj;
        ax.Gb.l.f(context, "context");
        int myPid = Process.myPid();
        Iterator<T> it = d(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((F.e.d.a.c) obj).c() == myPid) {
                break;
            }
        }
        F.e.d.a.c cVar = (F.e.d.a.c) obj;
        return cVar == null ? c(this, f(), myPid, 0, false, 12, null) : cVar;
    }
}
