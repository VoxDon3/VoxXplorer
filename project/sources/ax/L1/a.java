package ax.L1;

import ax.S0.C0968a;
import ax.S0.d0;
import ax.q1.C2860u;
import ax.q1.InterfaceC2858s;
import ax.q1.N;
import ax.q1.O;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;

/* loaded from: classes.dex */
final class a implements g {
    private final f a;
    private final long b;
    private final long c;
    private final i d;
    private int e;
    private long f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;

    private final class b implements N {
        private b() {
        }

        @Override // ax.q1.N
        public boolean i() {
            return true;
        }

        @Override // ax.q1.N
        public N.a l(long j) {
            return new N.a(new O(j, d0.q((a.this.b + BigInteger.valueOf(a.this.d.c(j)).multiply(BigInteger.valueOf(a.this.c - a.this.b)).divide(BigInteger.valueOf(a.this.f)).longValue()) - 30000, a.this.b, a.this.c - 1)));
        }

        @Override // ax.q1.N
        public long n() {
            return a.this.d.b(a.this.f);
        }
    }

    public a(i iVar, long j, long j2, long j3, long j4, boolean z) {
        C0968a.a(j >= 0 && j2 > j);
        this.d = iVar;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.f = j4;
            this.e = 4;
        } else {
            this.e = 0;
        }
        this.a = new f();
    }

    private long i(InterfaceC2858s interfaceC2858s) throws IOException {
        if (this.i == this.j) {
            return -1L;
        }
        long position = interfaceC2858s.getPosition();
        if (!this.a.d(interfaceC2858s, this.j)) {
            long j = this.i;
            if (j != position) {
                return j;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.a.a(interfaceC2858s, false);
        interfaceC2858s.m();
        long j2 = this.h;
        f fVar = this.a;
        long j3 = fVar.c;
        long j4 = j2 - j3;
        int i = fVar.h + fVar.i;
        if (0 <= j4 && j4 < 72000) {
            return -1L;
        }
        if (j4 < 0) {
            this.j = position;
            this.l = j3;
        } else {
            this.i = interfaceC2858s.getPosition() + i;
            this.k = this.a.c;
        }
        long j5 = this.j;
        long j6 = this.i;
        if (j5 - j6 < 100000) {
            this.j = j6;
            return j6;
        }
        long position2 = interfaceC2858s.getPosition() - (i * (j4 <= 0 ? 2L : 1L));
        long j7 = this.j;
        long j8 = this.i;
        return d0.q(position2 + ((j4 * (j7 - j8)) / (this.l - this.k)), j8, j7 - 1);
    }

    private void k(InterfaceC2858s interfaceC2858s) throws IOException {
        while (true) {
            this.a.c(interfaceC2858s);
            this.a.a(interfaceC2858s, false);
            f fVar = this.a;
            if (fVar.c > this.h) {
                interfaceC2858s.m();
                return;
            } else {
                interfaceC2858s.n(fVar.h + fVar.i);
                this.i = interfaceC2858s.getPosition();
                this.k = this.a.c;
            }
        }
    }

    @Override // ax.L1.g
    public long b(InterfaceC2858s interfaceC2858s) throws IOException {
        int i = this.e;
        if (i == 0) {
            long position = interfaceC2858s.getPosition();
            this.g = position;
            this.e = 1;
            long j = this.c - 65307;
            if (j > position) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long i2 = i(interfaceC2858s);
                if (i2 != -1) {
                    return i2;
                }
                this.e = 3;
            } else if (i != 3) {
                if (i == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(interfaceC2858s);
            this.e = 4;
            return -(this.k + 2);
        }
        this.f = j(interfaceC2858s);
        this.e = 4;
        return this.g;
    }

    @Override // ax.L1.g
    public void c(long j) {
        this.h = d0.q(j, 0L, this.f - 1);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }

    @Override // ax.L1.g
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public b a() {
        if (this.f != 0) {
            return new b();
        }
        return null;
    }

    long j(InterfaceC2858s interfaceC2858s) throws IOException {
        this.a.b();
        if (!this.a.c(interfaceC2858s)) {
            throw new EOFException();
        }
        this.a.a(interfaceC2858s, false);
        f fVar = this.a;
        interfaceC2858s.n(fVar.h + fVar.i);
        long j = this.a.c;
        while (true) {
            f fVar2 = this.a;
            if ((fVar2.b & 4) == 4 || !fVar2.c(interfaceC2858s) || interfaceC2858s.getPosition() >= this.c || !this.a.a(interfaceC2858s, true)) {
                break;
            }
            f fVar3 = this.a;
            if (!C2860u.f(interfaceC2858s, fVar3.h + fVar3.i)) {
                break;
            }
            j = this.a.c;
        }
        return j;
    }
}
