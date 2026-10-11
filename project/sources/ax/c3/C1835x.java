package ax.c3;

import android.content.Context;
import android.net.Uri;
import ax.u3.C3184b;
import com.voxdon.xplorer.file.C3583b;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.C3605y;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ax.c3.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1835x {
    private static Map<K, C3596o> a = new HashMap();
    private static Context b;

    public static C3596o a(K k, Uri uri, C3605y c3605y, int i) {
        C3596o e = e(k);
        ((C3583b) e.u()).l1(uri, c3605y, i);
        return e;
    }

    public static C3596o b(K k, Uri uri, String str, int i, int i2) {
        C3596o e = e(k);
        ((C3583b) e.u()).m1(uri, str, i, i2);
        return e;
    }

    public static Context c() {
        if (b == null) {
            b = ax.Q2.b.h().g();
        }
        return b;
    }

    public static C3596o d(ax.Q2.f fVar, int i) {
        return e(K.a(fVar, i));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040 A[Catch: all -> 0x002b, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0011, B:15:0x0018, B:17:0x0022, B:25:0x0037, B:22:0x003b, B:10:0x0040, B:11:0x004f, B:12:0x006e), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f A[Catch: all -> 0x002b, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0011, B:15:0x0018, B:17:0x0022, B:25:0x0037, B:22:0x003b, B:10:0x0040, B:11:0x004f, B:12:0x006e), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized com.voxdon.xplorer.file.C3596o e(ax.c3.K r4) {
        /*
            java.lang.Class<ax.c3.x> r0 = ax.c3.C1835x.class
            monitor-enter(r0)
            java.util.Map<ax.c3.K, com.voxdon.xplorer.file.o> r1 = ax.c3.C1835x.a     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L2b
            com.voxdon.xplorer.file.o r1 = (com.voxdon.xplorer.file.C3596o) r1     // Catch: java.lang.Throwable -> L2b
            ax.Q2.f r2 = r4.d()     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L6f
            java.lang.Class r1 = r2.x()     // Catch: java.lang.Throwable -> L2b
            r3 = 0
            if (r1 == 0) goto L3e
            java.lang.Class r1 = r2.x()     // Catch: java.lang.Throwable -> L2b java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Throwable -> L2b java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35
            com.voxdon.xplorer.file.m r1 = (com.voxdon.xplorer.file.AbstractC3594m) r1     // Catch: java.lang.Throwable -> L2b java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35
            android.content.Context r2 = c()     // Catch: java.lang.Throwable -> L2b java.lang.InstantiationException -> L2d java.lang.IllegalAccessException -> L30
            r1.W(r2, r4)     // Catch: java.lang.Throwable -> L2b java.lang.InstantiationException -> L2d java.lang.IllegalAccessException -> L30
            r3 = r1
            goto L3e
        L2b:
            r4 = move-exception
            goto L71
        L2d:
            r2 = move-exception
            r3 = r1
            goto L37
        L30:
            r2 = move-exception
            r3 = r1
            goto L3b
        L33:
            r2 = move-exception
            goto L37
        L35:
            r2 = move-exception
            goto L3b
        L37:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L2b
            goto L3e
        L3b:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L2b
        L3e:
            if (r3 == 0) goto L4f
            com.voxdon.xplorer.file.o r1 = new com.voxdon.xplorer.file.o     // Catch: java.lang.Throwable -> L2b
            android.content.Context r2 = c()     // Catch: java.lang.Throwable -> L2b
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L2b
            java.util.Map<ax.c3.K, com.voxdon.xplorer.file.o> r2 = ax.c3.C1835x.a     // Catch: java.lang.Throwable -> L2b
            r2.put(r4, r1)     // Catch: java.lang.Throwable -> L2b
            goto L6f
        L4f:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L2b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r2.<init>()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = "Not reachable : Not supported location ("
            r2.append(r3)     // Catch: java.lang.Throwable -> L2b
            ax.Q2.f r4 = r4.d()     // Catch: java.lang.Throwable -> L2b
            r2.append(r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = ")"
            r2.append(r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L2b
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L2b
            throw r1     // Catch: java.lang.Throwable -> L2b
        L6f:
            monitor-exit(r0)
            return r1
        L71:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.c3.C1835x.e(ax.c3.K):com.voxdon.xplorer.file.o");
    }

    public static C3596o f(File file) {
        return g(file.getAbsolutePath());
    }

    public static C3596o g(String str) {
        if (d0.B(str)) {
            return e(ax.Z2.j.F().J(str, null));
        }
        ax.Ha.c.h().d("GLFONNP").j().g(str).h();
        return e(K.e);
    }

    public static void h(ax.Q2.f fVar, int i) {
        C3184b.c(fVar == ax.Q2.f.X0);
        a.remove(K.a(fVar, i));
    }
}
