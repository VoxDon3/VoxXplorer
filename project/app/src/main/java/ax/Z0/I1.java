/*
 * Decompiled with CFR 0.152.
 */
package ax.Z0;

import android.media.metrics.LogSessionId;
import android.os.Build;
import ax.Z0.G1;
import ax.Z0.H1;

public final class I1 {
    public static final I1 d = new I1("");
    public final String a;
    private final a b;
    private final Object c;

    public I1(String object) {
        this.a = object;
        object = Build.VERSION.SDK_INT >= 31 ? new a() : null;
        this.b = object;
        this.c = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public LogSessionId a() {
        synchronized (this) {
            return ax.S0.a.e(this.b).a;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(LogSessionId logSessionId) {
        synchronized (this) {
            ax.S0.a.e(this.b).a(logSessionId);
            return;
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof I1)) {
            return false;
        }
        object = (I1)object;
        return j.Objects.equals((Object)this.a, (Object)((I1)object).a) && j.Objects.equals((Object)this.b, (Object)((I1)object).b) && j.Objects.equals((Object)this.c, (Object)((I1)object).c);
    }

    public int hashCode() {
        return j.Objects.hash((Object[])new Object[]{this.a, this.b, this.c});
    }

    private static final class a {
        public LogSessionId a = G1.a();

        public void a(LogSessionId logSessionId) {
            ax.S0.a.g(H1.a(this.a, G1.a()));
            this.a = logSessionId;
        }
    }
}

