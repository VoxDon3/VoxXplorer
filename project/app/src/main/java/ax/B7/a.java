/*
 * Decompiled with CFR 0.152.
 */
package ax.B7;

import ax.A7.a;
import ax.B7.d;
import ax.e6.a;
import java.util.HashSet;
import java.util.Set;

public final class a {
    Set<String> a;
    private a.b b;
    private ax.e6.a c;
    private d d;

    public a(ax.e6.a object, a.b b8) {
        this.b = b8;
        this.c = object;
        this.d = object = new d(this);
        this.c.f((a.a)object);
        this.a = new HashSet<String>();
    }

    static /* bridge */ /* synthetic */ a.b a(a a8) {
        return a8.b;
    }
}

