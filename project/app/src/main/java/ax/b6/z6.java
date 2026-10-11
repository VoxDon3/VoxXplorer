/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.B6;
import ax.b6.D6;
import ax.q7.u;
import ax.q7.v;

public final class z6
implements u<D6> {
    private static z6 c0 = new z6();
    private final u<D6> q = v.b(new B6());

    public static boolean a() {
        return ((D6)c0.get()).a();
    }

    public static boolean b() {
        return ((D6)c0.get()).b();
    }

    public static boolean c() {
        return ((D6)c0.get()).c();
    }

    @Override
    public final /* synthetic */ Object get() {
        return this.q.get();
    }
}

