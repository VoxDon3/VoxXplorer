package ax.O1;

import androidx.media3.decoder.a;
import ax.N1.k;
import ax.N1.l;
import ax.N1.m;
import ax.N1.p;
import ax.N1.q;
import ax.O1.e;
import ax.S0.C0968a;
import ax.S0.d0;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
abstract class e implements l {
    private final ArrayDeque<b> a = new ArrayDeque<>();
    private final ArrayDeque<q> b;
    private final ArrayDeque<b> c;
    private b d;
    private long e;
    private long f;
    private long g;

    private static final class b extends p implements Comparable<b> {
        private long l0;

        private b() {
        }

        @Override // java.lang.Comparable
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (s() != bVar.s()) {
                return s() ? 1 : -1;
            }
            long j = this.g0 - bVar.g0;
            if (j == 0) {
                j = this.l0 - bVar.l0;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends q {
        private a.InterfaceC0027a<c> h0;

        public c(a.InterfaceC0027a<c> interfaceC0027a) {
            this.h0 = interfaceC0027a;
        }

        @Override // androidx.media3.decoder.a
        public final void B() {
            this.h0.a(this);
        }
    }

    public e() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new b());
        }
        this.b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.b.add(new c(new a.InterfaceC0027a() { // from class: ax.O1.d
                @Override // androidx.media3.decoder.a.InterfaceC0027a
                public final void a(androidx.media3.decoder.a aVar) {
                    e.this.q((e.c) aVar);
                }
            }));
        }
        this.c = new ArrayDeque<>();
        this.g = -9223372036854775807L;
    }

    private void p(b bVar) {
        bVar.p();
        this.a.add(bVar);
    }

    @Override // ax.V0.g
    public final void b(long j) {
        this.g = j;
    }

    @Override // ax.N1.l
    public void e(long j) {
        this.e = j;
    }

    @Override // ax.V0.g
    public void flush() {
        this.f = 0L;
        this.e = 0L;
        while (!this.c.isEmpty()) {
            p((b) d0.i(this.c.poll()));
        }
        b bVar = this.d;
        if (bVar != null) {
            p(bVar);
            this.d = null;
        }
    }

    protected abstract k h();

    protected abstract void i(p pVar);

    @Override // ax.V0.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public p f() throws m {
        C0968a.g(this.d == null);
        if (this.a.isEmpty()) {
            return null;
        }
        b pollFirst = this.a.pollFirst();
        this.d = pollFirst;
        return pollFirst;
    }

    @Override // ax.V0.g
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public q a() throws m {
        if (this.b.isEmpty()) {
            return null;
        }
        while (!this.c.isEmpty() && ((b) d0.i(this.c.peek())).g0 <= this.e) {
            b bVar = (b) d0.i(this.c.poll());
            if (bVar.s()) {
                q qVar = (q) d0.i(this.b.pollFirst());
                qVar.n(4);
                p(bVar);
                return qVar;
            }
            i(bVar);
            if (n()) {
                k h = h();
                q qVar2 = (q) d0.i(this.b.pollFirst());
                qVar2.C(bVar.g0, h, Long.MAX_VALUE);
                p(bVar);
                return qVar2;
            }
            p(bVar);
        }
        return null;
    }

    protected final q l() {
        return this.b.pollFirst();
    }

    protected final long m() {
        return this.e;
    }

    protected abstract boolean n();

    @Override // ax.V0.g
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void g(p pVar) throws m {
        C0968a.a(pVar == this.d);
        b bVar = (b) pVar;
        if (!bVar.s()) {
            long j = bVar.g0;
            if (j != Long.MIN_VALUE) {
                long j2 = this.g;
                if (j2 != -9223372036854775807L && j < j2) {
                    p(bVar);
                    this.d = null;
                }
            }
        }
        long j3 = this.f;
        this.f = 1 + j3;
        bVar.l0 = j3;
        this.c.add(bVar);
        this.d = null;
    }

    protected void q(q qVar) {
        qVar.p();
        this.b.add(qVar);
    }

    @Override // ax.V0.g
    public void d() {
    }
}
