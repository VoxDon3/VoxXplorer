/*
 * Decompiled with CFR 0.152.
 */
package ax.n8;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import ax.G7.i;
import ax.Gb.l;
import ax.R5.m;
import ax.R5.n;
import ax.n8.v;
import ax.tb.o;
import java.util.ArrayList;
import java.util.List;

public final class w {
    public static final w a = new w();

    private w() {
    }

    private final v a(String string, int n8, int n9, boolean bl) {
        return new v(string, n8, n9, bl);
    }

    static /* synthetic */ v b(w w8, String string, int n8, int n9, boolean bl, int n10, Object object) {
        if ((n10 & 2) != 0) {
            n8 = 0;
        }
        if ((n10 & 4) != 0) {
            n9 = 0;
        }
        if ((n10 & 8) != 0) {
            bl = false;
        }
        return w8.a(string, n8, n9, bl);
    }

    /*
     * WARNING - void declaration
     */
    public final List<v> c(Context object) {
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
        ArrayList<v> arrayList = new ArrayList<v>(o.s(object, 10));
        int n9 = ((ArrayList)object).size();
        for (n8 = 0; n8 < n9; ++n8) {
            Object object3 = ((ArrayList)object).get(n8);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)object3;
            object3 = runningAppProcessInfo.processName;
            l.e(object3, "runningAppProcessInfo.processName");
            arrayList.add(new v((String)object3, runningAppProcessInfo.pid, runningAppProcessInfo.importance, l.a(runningAppProcessInfo.processName, string)));
        }
        return arrayList;
    }

    public final v d(Context object2) {
        int n8;
        block2: {
            l.f(object2, "context");
            n8 = Process.myPid();
            for (Object object2 : (Iterable)this.c((Context)object2)) {
                if (((v)object2).b() != n8) continue;
                break block2;
            }
            object2 = null;
        }
        object2 = (v)object2;
        if (object2 == null) {
            return w.b(this, this.e(), n8, 0, false, 12, null);
        }
        return object2;
    }

    public final String e() {
        String string;
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 33) {
            String string2 = i.a();
            l.e(string2, "myProcessName()");
            return string2;
        }
        if (n8 >= 28 && (string = m.a()) != null) {
            return string;
        }
        string = n.a();
        if (string != null) {
            return string;
        }
        return "";
    }
}

