package ax.b6;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class I0 extends L0 {
    private final AtomicReference<Bundle> e = new AtomicReference<>();
    private boolean f;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0003, code lost:
    
        r4 = r4.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T B(android.os.Bundle r4, java.lang.Class<T> r5) {
        /*
            r0 = 0
            if (r4 == 0) goto L43
            java.lang.String r1 = "r"
            java.lang.Object r4 = r4.get(r1)
            if (r4 == 0) goto L43
            java.lang.Object r4 = r5.cast(r4)     // Catch: java.lang.ClassCastException -> L10
            return r4
        L10:
            r0 = move-exception
            java.lang.String r5 = r5.getCanonicalName()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected object type. Expected, Received"
            r1.append(r2)
            java.lang.String r2 = ": %s, %s"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r4
            java.lang.String r4 = java.lang.String.format(r1, r2)
            java.lang.String r5 = "AM"
            android.util.Log.w(r5, r4, r0)
            throw r0
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.b6.I0.B(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    public final Long a2(long j) {
        return (Long) B(w(j), Long.class);
    }

    public final String b2(long j) {
        return (String) B(w(j), String.class);
    }

    @Override // ax.b6.M0
    public final void n(Bundle bundle) {
        synchronized (this.e) {
            try {
                try {
                    this.e.set(bundle);
                    this.f = true;
                } finally {
                    this.e.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bundle w(long j) {
        Bundle bundle;
        synchronized (this.e) {
            if (!this.f) {
                try {
                    this.e.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.e.get();
        }
        return bundle;
    }
}
