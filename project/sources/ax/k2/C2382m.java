package ax.k2;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: ax.k2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2382m {
    private final AbstractC2390u a;
    private final Set<LiveData<?>> b;

    public C2382m(AbstractC2390u abstractC2390u) {
        ax.Gb.l.f(abstractC2390u, "database");
        this.a = abstractC2390u;
        Set<LiveData<?>> newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        ax.Gb.l.e(newSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.b = newSetFromMap;
    }
}
