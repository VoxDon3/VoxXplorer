package ax.l9;

import ax.Q8.q;
import ax.a9.AbstractFutureC1431a;
import ax.a9.C1432b;
import ax.h9.AbstractC2173d;
import java.util.Date;
import java.util.UUID;

/* loaded from: classes3.dex */
public class h {
    private final ax.a9.e<q, ax.k9.d> a;
    private AbstractC2173d<?, ?> b;
    private final long c;
    private final UUID d;
    private final Date e = new Date();
    private long f;

    public h(AbstractC2173d<?, ?> abstractC2173d, long j, UUID uuid) {
        this.b = abstractC2173d;
        this.c = j;
        this.d = uuid;
        this.a = new ax.a9.e<>(String.valueOf(j), ax.k9.d.q);
    }

    public long a() {
        return this.f;
    }

    UUID b() {
        return this.d;
    }

    <T extends q> AbstractFutureC1431a<T> c(C1432b.a aVar) {
        return new C1432b(this.a.c(), aVar);
    }

    long d() {
        return this.c;
    }

    public AbstractC2173d<?, ?> e() {
        return this.b;
    }

    public ax.a9.e<q, ax.k9.d> f() {
        return this.a;
    }

    public Date g() {
        return this.e;
    }

    public void h(long j) {
        this.f = j;
    }
}
