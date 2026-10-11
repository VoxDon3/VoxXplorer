package ax.y1;

import ax.q1.D;
import ax.q1.InterfaceC2859t;
import ax.q1.N;
import ax.q1.O;
import ax.q1.U;

/* renamed from: ax.y1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3501e implements InterfaceC2859t {
    private final InterfaceC2859t c0;
    private final long q;

    /* renamed from: ax.y1.e$a */
    class a extends D {
        final /* synthetic */ N b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(N n, N n2) {
            super(n);
            this.b = n2;
        }

        @Override // ax.q1.D, ax.q1.N
        public N.a l(long j) {
            N.a l = this.b.l(j);
            O o = l.a;
            O o2 = new O(o.a, o.b + C3501e.this.q);
            O o3 = l.b;
            return new N.a(o2, new O(o3.a, o3.b + C3501e.this.q));
        }
    }

    public C3501e(long j, InterfaceC2859t interfaceC2859t) {
        this.q = j;
        this.c0 = interfaceC2859t;
    }

    @Override // ax.q1.InterfaceC2859t
    public void h(N n) {
        this.c0.h(new a(n, n));
    }

    @Override // ax.q1.InterfaceC2859t
    public void o() {
        this.c0.o();
    }

    @Override // ax.q1.InterfaceC2859t
    public U u(int i, int i2) {
        return this.c0.u(i, i2);
    }
}
