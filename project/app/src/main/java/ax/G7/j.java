/*
 * Decompiled with CFR 0.152.
 */
package ax.G7;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import ax.G7.i;
import ax.Gb.l;
import ax.L7.F;
import ax.R5.m;
import ax.tb.o;
import java.util.ArrayList;
import java.util.List;

public final class j {
    public static final j a = new j();

    private j() {
    }

    public static /* synthetic */ F.e.d.a.c c(j j8, String string, int n8, int n9, boolean bl, int n10, Object object) {
        if ((n10 & 2) != 0) {
            n8 = 0;
        }
        if ((n10 & 4) != 0) {
            n9 = 0;
        }
        if ((n10 & 8) != 0) {
            bl = false;
        }
        return j8.b(string, n8, n9, bl);
    }

    private final String f() {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 33) {
            String string = i.a();
            l.e(string, "{\n      Process.myProcessName()\n    }");
            return string;
        }
        if (n8 >= 28) {
            String string = m.a();
            if (string == null) {
                return "";
            }
            return string;
        }
        return "";
    }

    public final F.e.d.a.c a(String string, int n8, int n9) {
        l.f(string, "processName");
        return j.c(this, string, n8, n9, false, 8, null);
    }

    public final F.e.d.a.c b(String object, int n8, int n9, boolean bl) {
        l.f(object, "processName");
        object = F.e.d.a.c.a().e((String)object).d(n8).c(n9).b(bl).a();
        l.e(object, "builder()\n      .setProc\u2026ltProcess)\n      .build()");
        return object;
    }

    /*
     * WARNING - void declaration
     */
    public final List<F.e.d.a.c> d(Context object) {
        Iterable var5_10;
        Object var5_7;
        l.f(object, "context");
        int n8 = object.getApplicationInfo().uid;
        String string = object.getApplicationInfo().processName;
        Object arrayList2 = object.getSystemService("activity");
        boolean bl = arrayList2 instanceof ActivityManager;
        object = null;
        if (bl) {
            ActivityManager activityManager = (ActivityManager)arrayList2;
        } else {
            Object var5_6 = null;
        }
        if (var5_7 != null) {
            object = var5_7.getRunningAppProcesses();
        }
        Object object2 = object;
        if (object == null) {
            List list = o.j();
        }
        Iterable iterable = o.B((Iterable)var5_10);
        object = new ArrayList();
        for (Object t8 : iterable) {
            if (((ActivityManager.RunningAppProcessInfo)t8).uid != n8) continue;
            object.add(t8);
        }
        ArrayList<F.e.d.a.c> arrayList = new ArrayList<F.e.d.a.c>(o.s(object, 10));
        int n9 = ((ArrayList)object).size();
        for (n8 = 0; n8 < n9; ++n8) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = ((ArrayList)object).get(n8);
            runningAppProcessInfo = runningAppProcessInfo;
            arrayList.add(F.e.d.a.c.a().e(runningAppProcessInfo.processName).d(runningAppProcessInfo.pid).c(runningAppProcessInfo.importance).b(l.a(runningAppProcessInfo.processName, string)).a());
        }
        return arrayList;
    }

    public final F.e.d.a.c e(Context object2) {
        int n8;
        block2: {
            l.f(object2, "context");
            n8 = Process.myPid();
            for (Object object2 : (Iterable)this.d((Context)object2)) {
                if (((F.e.d.a.c)object2).c() != n8) continue;
                break block2;
            }
            object2 = null;
        }
        object2 = (F.e.d.a.c)object2;
        if (object2 == null) {
            return j.c(this, this.f(), n8, 0, false, 12, null);
        }
        return object2;
    }
}

