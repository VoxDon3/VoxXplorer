/*
 * Decompiled with CFR 0.152.
 */
package ax.l9;

import ax.Q8.q;
import ax.a9.a;
import ax.a9.b;
import ax.a9.e;
import ax.k9.d;
import java.util.Date;
import java.util.UUID;

public class h {
    private final e<q, d> a;
    private ax.h9.d<?, ?> b;
    private final long c;
    private final UUID d;
    private final Date e;
    private long f;

    public h(ax.h9.d<?, ?> d8, long l8, UUID uUID) {
        this.b = d8;
        this.c = l8;
        this.d = uUID;
        this.e = new Date();
        this.a = new e(String.valueOf(l8), ax.k9.d.q);
    }

    public long a() {
        return this.f;
    }

    UUID b() {
        return this.d;
    }

    <T extends q> a<T> c(b.a a8) {
        return new b<q>(this.a.c(), a8);
    }

    long d() {
        return this.c;
    }

    public ax.h9.d<?, ?> e() {
        return this.b;
    }

    public e<q, d> f() {
        return this.a;
    }

    public Date g() {
        return this.e;
    }

    public void h(long l8) {
        this.f = l8;
    }
}

