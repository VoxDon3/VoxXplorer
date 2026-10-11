/*
 * Decompiled with CFR 0.152.
 */
package ax.I0;

import androidx.lifecycle.p;
import androidx.lifecycle.q;
import ax.Gb.l;
import ax.I0.a;
import ax.I0.b;
import ax.I0.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class c {
    private final List<f<?>> a = new ArrayList();

    public final <T extends p> void a(ax.Mb.b<T> b8, ax.Fb.l<? super a, ? extends T> l8) {
        l.f(b8, "clazz");
        l.f(l8, "initializer");
        this.a.add(new f<T>(ax.Eb.a.a(b8), l8));
    }

    public final q.b b() {
        f[] fArray = ((Collection)this.a).toArray(new f[0]);
        return new b(Arrays.copyOf(fArray, fArray.length));
    }
}

