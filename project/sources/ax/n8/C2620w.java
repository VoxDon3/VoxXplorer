package ax.n8;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import ax.tb.C3139o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ax.n8.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2620w {
    public static final C2620w a = new C2620w();

    private C2620w() {
    }

    private final C2619v a(String str, int i, int i2, boolean z) {
        return new C2619v(str, i, i2, z);
    }

    static /* synthetic */ C2619v b(C2620w c2620w, String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            z = false;
        }
        return c2620w.a(str, i, i2, z);
    }

    public final List<C2619v> c(Context context) {
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
            String str2 = runningAppProcessInfo.processName;
            ax.Gb.l.e(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new C2619v(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, ax.Gb.l.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public final C2619v d(Context context) {
        Object obj;
        ax.Gb.l.f(context, "context");
        int myPid = Process.myPid();
        Iterator<T> it = c(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C2619v) obj).b() == myPid) {
                break;
            }
        }
        C2619v c2619v = (C2619v) obj;
        return c2619v == null ? b(this, e(), myPid, 0, false, 12, null) : c2619v;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        r0 = android.app.Application.getProcessName();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String e() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L10
            java.lang.String r0 = ax.G7.i.a()
            java.lang.String r1 = "myProcessName()"
            ax.Gb.l.e(r0, r1)
            return r0
        L10:
            r1 = 28
            if (r0 < r1) goto L1b
            java.lang.String r0 = ax.R5.m.a()
            if (r0 == 0) goto L1b
            return r0
        L1b:
            java.lang.String r0 = ax.R5.n.a()
            if (r0 == 0) goto L22
            return r0
        L22:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.n8.C2620w.e():java.lang.String");
    }
}
