/*
 * Decompiled with CFR 0.152.
 */
package ax.K5;

import android.os.Looper;
import ax.K5.a;
import ax.K5.l;
import ax.L5.c;
import ax.L5.i;
import ax.L5.k;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

@Deprecated
public abstract class g {
    private static final Set a = Collections.newSetFromMap(new WeakHashMap());

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static Set<g> b() {
        Set set = a;
        // MONITORENTER : set
        // MONITOREXIT : set
        return set;
    }

    @ResultIgnorabilityUnspecified
    public <A extends a.b, T extends com.google.android.gms.common.api.internal.b<? extends l, A>> T a(T t8) {
        throw new UnsupportedOperationException();
    }

    public Looper c() {
        throw new UnsupportedOperationException();
    }

    public boolean d(k k8) {
        throw new UnsupportedOperationException();
    }

    public void e() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static interface a
    extends c {
    }

    @Deprecated
    public static interface b
    extends i {
    }
}

