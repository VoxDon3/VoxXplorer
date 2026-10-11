/*
 * Decompiled with CFR 0.152.
 */
package ax.k2;

import androidx.lifecycle.LiveData;
import ax.Gb.l;
import ax.k2.u;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

public final class m {
    private final u a;
    private final Set<LiveData<?>> b;

    public m(u object) {
        l.f(object, "database");
        this.a = object;
        object = Collections.newSetFromMap(new IdentityHashMap());
        l.e(object, "newSetFromMap(IdentityHashMap())");
        this.b = object;
    }
}

