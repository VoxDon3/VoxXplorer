/*
 * Decompiled with CFR 0.152.
 */
package ax.j8;

import ax.j6.b;
import ax.j6.j;
import com.google.firebase.remoteconfig.internal.d;
import java.util.Map;

public final class e
implements b {
    public final d a;
    public final long b;
    public final Map c;

    public /* synthetic */ e(d d8, long l8, Map map) {
        this.a = d8;
        this.b = l8;
        this.c = map;
    }

    public final Object a(j j8) {
        return d.e(this.a, this.b, this.c, j8);
    }
}

