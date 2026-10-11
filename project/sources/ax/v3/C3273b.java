package ax.v3;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import ax.Q2.g;
import ax.i8.l;
import ax.j6.AbstractC2327j;
import ax.j6.InterfaceC2322e;
import ax.u3.C3180B;
import java.util.HashMap;
import java.util.logging.Logger;

/* renamed from: ax.v3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3273b {
    private static final Logger d = g.a(C3273b.class);
    private com.google.firebase.remoteconfig.a a;
    HashMap<String, Object> b;
    private boolean c;

    /* renamed from: ax.v3.b$a */
    class a implements InterfaceC2322e<Boolean> {

        /* renamed from: ax.v3.b$a$a, reason: collision with other inner class name */
        class RunnableC0479a implements Runnable {
            RunnableC0479a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C3180B.D("GoogleApiHandler")) {
                    C3273b.d.fine("ThreadGuard : GoogleApiHandler Delay");
                }
            }
        }

        a() {
        }

        @Override // ax.j6.InterfaceC2322e
        public void a(AbstractC2327j<Boolean> abstractC2327j) {
            if (abstractC2327j.m()) {
                C3273b.d.fine("Dynamic config fetch succeeded");
            } else {
                C3273b.d.fine("Dynamic config fetch failed");
            }
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0479a(), 2000L);
        }
    }

    public boolean b(String str) {
        com.google.firebase.remoteconfig.a aVar;
        if (!this.c || (aVar = this.a) == null) {
            return ((Boolean) this.b.get(str)).booleanValue();
        }
        l k = aVar.k(str);
        if (k.a() == 0 || k.a() == 1) {
            return ((Boolean) this.b.get(str)).booleanValue();
        }
        try {
            return k.c();
        } catch (IllegalArgumentException unused) {
            return ((Boolean) this.b.get(str)).booleanValue();
        }
    }

    public int c(String str) {
        com.google.firebase.remoteconfig.a aVar;
        if (!this.c || (aVar = this.a) == null) {
            return ((Long) this.b.get(str)).intValue();
        }
        l k = aVar.k(str);
        if (k.a() == 0 || k.a() == 1) {
            return ((Long) this.b.get(str)).intValue();
        }
        try {
            return (int) k.b();
        } catch (IllegalArgumentException unused) {
            return ((Long) this.b.get(str)).intValue();
        }
    }

    public long d(String str) {
        com.google.firebase.remoteconfig.a aVar;
        if (!this.c || (aVar = this.a) == null) {
            return ((Long) this.b.get(str)).longValue();
        }
        l k = aVar.k(str);
        if (k.a() == 0 || k.a() == 1) {
            return ((Long) this.b.get(str)).longValue();
        }
        try {
            return k.b();
        } catch (IllegalArgumentException unused) {
            return ((Long) this.b.get(str)).longValue();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063 A[Catch: Exception -> 0x007e, LOOP:0: B:22:0x005d->B:24:0x0063, LOOP_END, TRY_LEAVE, TryCatch #1 {Exception -> 0x007e, blocks: (B:21:0x0043, B:22:0x005d, B:24:0x0063), top: B:20:0x0043 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(android.content.Context r3, java.util.HashMap<java.lang.String, java.lang.Object> r4, boolean r5) {
        /*
            r2 = this;
            r2.b = r4
            com.google.firebase.remoteconfig.a r4 = r2.a     // Catch: java.lang.VerifyError -> L33 java.lang.RuntimeException -> L35
            if (r4 != 0) goto L97
            if (r5 == 0) goto L3b
            boolean r4 = r2.f()     // Catch: java.lang.VerifyError -> L33 java.lang.RuntimeException -> L35
            if (r4 == 0) goto L3b
            ax.x7.C3471f.q(r3)     // Catch: java.lang.VerifyError -> L33 java.lang.RuntimeException -> L35
            com.google.firebase.remoteconfig.a r4 = com.google.firebase.remoteconfig.a.h()     // Catch: java.lang.VerifyError -> L33 java.lang.RuntimeException -> L35
            r2.a = r4     // Catch: java.lang.VerifyError -> L33 java.lang.RuntimeException -> L35
            ax.j6.j r4 = r4.g()     // Catch: java.lang.VerifyError -> L33 java.lang.RuntimeException -> L35
            ax.v3.b$a r5 = new ax.v3.b$a     // Catch: java.lang.VerifyError -> L33 java.lang.RuntimeException -> L35
            r5.<init>()     // Catch: java.lang.VerifyError -> L33 java.lang.RuntimeException -> L35
            r4.b(r5)     // Catch: java.lang.VerifyError -> L33 java.lang.RuntimeException -> L35
            java.lang.String r4 = "GoogleApiHandler"
            boolean r4 = ax.u3.C3180B.D(r4)     // Catch: java.lang.VerifyError -> L33 java.lang.RuntimeException -> L35
            if (r4 == 0) goto L37
            java.util.logging.Logger r4 = ax.v3.C3273b.d     // Catch: java.lang.VerifyError -> L33 java.lang.RuntimeException -> L35
            java.lang.String r5 = "ThreadGuard : GoogleApiHandler"
            r4.fine(r5)     // Catch: java.lang.VerifyError -> L33 java.lang.RuntimeException -> L35
            goto L37
        L33:
            r4 = move-exception
            goto L3f
        L35:
            r4 = move-exception
            goto L3f
        L37:
            r4 = 1
            r2.c = r4     // Catch: java.lang.VerifyError -> L33 java.lang.RuntimeException -> L35
            return
        L3b:
            r4 = 0
            r2.c = r4     // Catch: java.lang.VerifyError -> L33 java.lang.RuntimeException -> L35
            return
        L3f:
            r4.printStackTrace()
            r5 = 0
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch: java.lang.Exception -> L7e
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Exception -> L7e
            r1 = 64
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r3, r1)     // Catch: java.lang.Exception -> L7e
            android.content.pm.Signature[] r3 = r3.signatures     // Catch: java.lang.Exception -> L7e
            java.util.Set r3 = ax.u3.C3180B.p(r3)     // Catch: java.lang.Exception -> L7e
            java.lang.String r5 = "sign:"
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L7e
        L5d:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Exception -> L7e
            if (r0 == 0) goto L7e
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Exception -> L7e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L7e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7e
            r1.<init>()     // Catch: java.lang.Exception -> L7e
            r1.append(r5)     // Catch: java.lang.Exception -> L7e
            r1.append(r0)     // Catch: java.lang.Exception -> L7e
            java.lang.String r0 = ":::"
            r1.append(r0)     // Catch: java.lang.Exception -> L7e
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Exception -> L7e
            goto L5d
        L7e:
            ax.Ha.b r3 = ax.Ha.c.h()
            ax.Ha.b r3 = r3.f()
            java.lang.String r0 = "FIREBASE INIT ERROR"
            ax.Ha.b r3 = r3.d(r0)
            ax.Ha.b r3 = r3.l(r4)
            ax.Ha.b r3 = r3.g(r5)
            r3.h()
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.v3.C3273b.e(android.content.Context, java.util.HashMap, boolean):void");
    }

    public boolean f() {
        return !"LG-E615f".equals(Build.MODEL);
    }
}
