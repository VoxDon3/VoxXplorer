package ax.N1;

import ax.N1.t;
import ax.P0.C0912v;
import ax.P0.E;
import ax.S0.C0968a;
import ax.S0.G;
import ax.S0.InterfaceC0979l;
import ax.S0.d0;
import ax.q1.C2857q;
import ax.q1.I;
import ax.q1.InterfaceC2858s;
import ax.q1.InterfaceC2859t;
import ax.q1.M;
import ax.q1.U;
import ax.u7.C3218f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class o implements ax.q1.r {
    private final t a;
    private final C0912v c;
    private final List<b> d;
    private U g;
    private int h;
    private int i;
    private long[] j;
    private long k;
    private final d b = new d();
    private byte[] f = d0.f;
    private final G e = new G();

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements Comparable<b> {
        private final byte[] c0;
        private final long q;

        @Override // java.lang.Comparable
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Long.compare(this.q, bVar.q);
        }

        private b(long j, byte[] bArr) {
            this.q = j;
            this.c0 = bArr;
        }
    }

    public o(t tVar, C0912v c0912v) {
        this.a = tVar;
        this.c = c0912v != null ? c0912v.b().y0("application/x-media3-cues").U(c0912v.o).Y(tVar.d()).P() : null;
        this.d = new ArrayList();
        this.i = 0;
        this.j = d0.g;
        this.k = -9223372036854775807L;
    }

    public static /* synthetic */ void g(o oVar, e eVar) {
        oVar.getClass();
        b bVar = new b(eVar.b, oVar.b.a(eVar.a, eVar.c));
        oVar.d.add(bVar);
        long j = oVar.k;
        if (j == -9223372036854775807L || eVar.d >= j) {
            oVar.m(bVar);
        }
    }

    private void h() throws IOException {
        try {
            long j = this.k;
            this.a.c(this.f, 0, this.h, j != -9223372036854775807L ? t.b.c(j) : t.b.b(), new InterfaceC0979l() { // from class: ax.N1.n
                @Override // ax.S0.InterfaceC0979l
                public final void accept(Object obj) {
                    o.g(o.this, (e) obj);
                }
            });
            Collections.sort(this.d);
            this.j = new long[this.d.size()];
            for (int i = 0; i < this.d.size(); i++) {
                this.j[i] = this.d.get(i).q;
            }
            this.f = d0.f;
        } catch (RuntimeException e) {
            throw E.a("SubtitleParser failed.", e);
        }
    }

    private boolean i(InterfaceC2858s interfaceC2858s) throws IOException {
        byte[] bArr = this.f;
        if (bArr.length == this.h) {
            this.f = Arrays.copyOf(bArr, bArr.length + 1024);
        }
        byte[] bArr2 = this.f;
        int i = this.h;
        int c = interfaceC2858s.c(bArr2, i, bArr2.length - i);
        if (c != -1) {
            this.h += c;
        }
        long length = interfaceC2858s.getLength();
        return (length != -1 && ((long) this.h) == length) || c == -1;
    }

    private boolean j(InterfaceC2858s interfaceC2858s) throws IOException {
        return interfaceC2858s.a((interfaceC2858s.getLength() > (-1L) ? 1 : (interfaceC2858s.getLength() == (-1L) ? 0 : -1)) != 0 ? C3218f.e(interfaceC2858s.getLength()) : 1024) == -1;
    }

    private void l() {
        long j = this.k;
        for (int h = j == -9223372036854775807L ? 0 : d0.h(this.j, j, true, true); h < this.d.size(); h++) {
            m(this.d.get(h));
        }
    }

    private void m(b bVar) {
        C0968a.i(this.g);
        int length = bVar.c0.length;
        this.e.Y(bVar.c0);
        this.g.g(this.e, length);
        this.g.f(bVar.q, 1, length, 0, null);
    }

    @Override // ax.q1.r
    public void a(InterfaceC2859t interfaceC2859t) {
        C0968a.g(this.i == 0);
        U u = interfaceC2859t.u(0, 3);
        this.g = u;
        C0912v c0912v = this.c;
        if (c0912v != null) {
            u.e(c0912v);
            interfaceC2859t.o();
            interfaceC2859t.h(new I(new long[]{0}, new long[]{0}, -9223372036854775807L));
        }
        this.i = 1;
    }

    @Override // ax.q1.r
    public void b(long j, long j2) {
        int i = this.i;
        C0968a.g((i == 0 || i == 5) ? false : true);
        this.k = j2;
        if (this.i == 2) {
            this.i = 1;
        }
        if (this.i == 4) {
            this.i = 3;
        }
    }

    @Override // ax.q1.r
    public boolean c(InterfaceC2858s interfaceC2858s) throws IOException {
        return true;
    }

    @Override // ax.q1.r
    public void d() {
        if (this.i == 5) {
            return;
        }
        this.a.a();
        this.i = 5;
    }

    @Override // ax.q1.r
    public /* synthetic */ ax.q1.r e() {
        return C2857q.b(this);
    }

    @Override // ax.q1.r
    public int f(InterfaceC2858s interfaceC2858s, M m) throws IOException {
        int i = this.i;
        C0968a.g((i == 0 || i == 5) ? false : true);
        if (this.i == 1) {
            int e = interfaceC2858s.getLength() != -1 ? C3218f.e(interfaceC2858s.getLength()) : 1024;
            if (e > this.f.length) {
                this.f = new byte[e];
            }
            this.h = 0;
            this.i = 2;
        }
        if (this.i == 2 && i(interfaceC2858s)) {
            h();
            this.i = 4;
        }
        if (this.i == 3 && j(interfaceC2858s)) {
            l();
            this.i = 4;
        }
        return this.i == 4 ? -1 : 0;
    }

    @Override // ax.q1.r
    public /* synthetic */ List k() {
        return C2857q.a(this);
    }
}
