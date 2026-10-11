package ax.yd;

import ax.Nd.e;
import ax.Nd.h;
import ax.vd.InterfaceC3312i;
import ax.wd.C3384a;

/* renamed from: ax.yd.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3525a {
    private static final byte[] e = new byte[4];
    private ax.Dd.b a;
    private b[] b;
    private int c;
    private int d;

    /* renamed from: ax.yd.a$b */
    private static class b {
        private final long[] a;

        private b() {
            this.a = new long[128];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(b bVar) {
            System.arraycopy(bVar.a, 0, this.a, 0, 128);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(b bVar, b bVar2) {
            long[] jArr = this.a;
            long[] jArr2 = bVar.a;
            long[] jArr3 = bVar2.a;
            for (int i = 0; i < 128; i++) {
                jArr[i] = jArr2[i] ^ jArr3[i];
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(b bVar) {
            long[] jArr = this.a;
            long[] jArr2 = bVar.a;
            for (int i = 0; i < 128; i++) {
                jArr[i] = jArr[i] ^ jArr2[i];
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(b bVar, b bVar2) {
            long[] jArr = this.a;
            long[] jArr2 = bVar.a;
            long[] jArr3 = bVar2.a;
            for (int i = 0; i < 128; i++) {
                jArr[i] = jArr[i] ^ (jArr2[i] ^ jArr3[i]);
            }
        }

        public b f() {
            ax.Nd.a.j(this.a, 0L);
            return this;
        }

        void h(byte[] bArr) {
            if (bArr.length < 1024) {
                throw new IllegalArgumentException("input shorter than blocksize");
            }
            h.m(bArr, 0, this.a);
        }

        void i(byte[] bArr) {
            if (bArr.length < 1024) {
                throw new IllegalArgumentException("output shorter than blocksize");
            }
            h.r(this.a, bArr, 0);
        }
    }

    /* renamed from: ax.yd.a$c */
    private static class c {
        b a;
        b b;
        b c;
        b d;

        private c() {
            this.a = new b();
            this.b = new b();
            this.c = new b();
            this.d = new b();
        }

        private void d() {
            for (int i = 0; i < 8; i++) {
                int i2 = i * 16;
                C3525a.A(this.b, i2, i2 + 1, i2 + 2, i2 + 3, i2 + 4, i2 + 5, i2 + 6, i2 + 7, i2 + 8, i2 + 9, i2 + 10, i2 + 11, i2 + 12, i2 + 13, i2 + 14, i2 + 15);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = i3 * 2;
                C3525a.A(this.b, i4, i4 + 1, i4 + 16, i4 + 17, i4 + 32, i4 + 33, i4 + 48, i4 + 49, i4 + 64, i4 + 65, i4 + 80, i4 + 81, i4 + 96, i4 + 97, i4 + 112, i4 + 113);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(b bVar, b bVar2) {
            this.b.g(bVar);
            d();
            bVar2.j(bVar, this.b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(b bVar, b bVar2, b bVar3) {
            this.a.j(bVar, bVar2);
            this.b.g(this.a);
            d();
            bVar3.j(this.a, this.b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(b bVar, b bVar2, b bVar3) {
            this.a.j(bVar, bVar2);
            this.b.g(this.a);
            d();
            bVar3.l(this.a, this.b);
        }
    }

    /* renamed from: ax.yd.a$d */
    private static class d {
        int a;
        int b;
        int c;

        d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void A(b bVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        long[] jArr = bVar.a;
        a(jArr, i, i5, i9, i13);
        a(jArr, i2, i6, i10, i14);
        a(jArr, i3, i7, i11, i15);
        a(jArr, i4, i8, i12, i16);
        a(jArr, i, i6, i11, i16);
        a(jArr, i2, i7, i12, i13);
        a(jArr, i3, i8, i9, i14);
        a(jArr, i4, i5, i10, i15);
    }

    private static void a(long[] jArr, int i, int i2, int i3, int i4) {
        y(jArr, i, i2, i4, 32);
        y(jArr, i3, i4, i2, 24);
        y(jArr, i, i2, i4, 16);
        y(jArr, i3, i4, i2, 63);
    }

    private static void c(byte[] bArr, InterfaceC3312i interfaceC3312i, byte[] bArr2) {
        if (bArr2 == null) {
            interfaceC3312i.b(e, 0, 4);
            return;
        }
        h.f(bArr2.length, bArr, 0);
        interfaceC3312i.b(bArr, 0, 4);
        interfaceC3312i.b(bArr2, 0, bArr2.length);
    }

    private void d(byte[] bArr, byte[] bArr2, int i, int i2) {
        b bVar = this.b[this.d - 1];
        for (int i3 = 1; i3 < this.a.c(); i3++) {
            int i4 = this.d;
            bVar.k(this.b[(i3 * i4) + (i4 - 1)]);
        }
        bVar.i(bArr);
        p(bArr, bArr2, i, i2);
    }

    private void e(ax.Dd.b bVar) {
        int d2 = bVar.d();
        if (d2 < bVar.c() * 8) {
            d2 = bVar.c() * 8;
        }
        int c2 = d2 / (bVar.c() * 4);
        this.c = c2;
        this.d = c2 * 4;
        s(c2 * bVar.c() * 4);
    }

    private void f(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[72];
        System.arraycopy(bArr2, 0, bArr3, 0, 64);
        bArr3[64] = 1;
        for (int i = 0; i < this.a.c(); i++) {
            h.f(i, bArr2, 68);
            h.f(i, bArr3, 68);
            p(bArr2, bArr, 0, 1024);
            this.b[this.d * i].h(bArr);
            p(bArr3, bArr, 0, 1024);
            this.b[(this.d * i) + 1].h(bArr);
        }
    }

    private void g() {
        c cVar = new c();
        d dVar = new d();
        for (int i = 0; i < this.a.b(); i++) {
            dVar.a = i;
            for (int i2 = 0; i2 < 4; i2++) {
                dVar.c = i2;
                for (int i3 = 0; i3 < this.a.c(); i3++) {
                    dVar.b = i3;
                    h(cVar, dVar);
                }
            }
        }
    }

    private void h(c cVar, d dVar) {
        b bVar;
        b bVar2;
        c cVar2 = cVar;
        d dVar2 = dVar;
        boolean v = v(dVar2);
        int o = o(dVar2);
        int i = (dVar2.b * this.d) + (dVar2.c * this.c) + o;
        int k = k(i);
        if (v) {
            bVar = cVar2.c.f();
            bVar2 = cVar2.d.f();
            r(cVar2, dVar2, bVar2, bVar);
        } else {
            bVar = null;
            bVar2 = null;
        }
        boolean w = w(dVar2);
        while (true) {
            int i2 = i;
            if (o >= this.c) {
                return;
            }
            b bVar3 = bVar;
            int i3 = k;
            b bVar4 = bVar2;
            long l = l(cVar2, o, bVar3, bVar4, i3, v);
            boolean z = v;
            c cVar3 = cVar2;
            int n = n(dVar2, l);
            int m = m(dVar2, o, l, n == dVar2.b);
            b[] bVarArr = this.b;
            b bVar5 = bVarArr[i3];
            b bVar6 = bVarArr[(this.d * n) + m];
            b bVar7 = bVarArr[i2];
            if (w) {
                cVar3.g(bVar5, bVar6, bVar7);
            } else {
                cVar3.f(bVar5, bVar6, bVar7);
            }
            i = i2 + 1;
            o++;
            dVar2 = dVar;
            cVar2 = cVar3;
            v = z;
            k = i2;
            bVar = bVar3;
            bVar2 = bVar4;
        }
    }

    private int k(int i) {
        return i % this.d == 0 ? (i + r0) - 1 : i - 1;
    }

    private long l(c cVar, int i, b bVar, b bVar2, int i2, boolean z) {
        if (!z) {
            return this.b[i2].a[0];
        }
        int i3 = i % 128;
        if (i3 == 0) {
            x(cVar, bVar2, bVar);
        }
        return bVar.a[i3];
    }

    private int m(d dVar, int i, long j, boolean z) {
        int i2;
        int i3;
        int i4 = dVar.a;
        int i5 = 0;
        int i6 = dVar.c;
        if (i4 != 0) {
            int i7 = this.c;
            int i8 = this.d;
            int i9 = ((i6 + 1) * i7) % i8;
            int i10 = i8 - i7;
            if (z) {
                i2 = (i10 + i) - 1;
            } else {
                i2 = i10 + (i != 0 ? 0 : -1);
            }
            i5 = i9;
            i3 = i2;
        } else if (z) {
            i3 = ((i6 * this.c) + i) - 1;
        } else {
            i3 = (i6 * this.c) + (i != 0 ? 0 : -1);
        }
        long j2 = j & 4294967295L;
        return ((int) (i5 + ((i3 - 1) - ((i3 * ((j2 * j2) >>> 32)) >>> 32)))) % this.d;
    }

    private int n(d dVar, long j) {
        return (dVar.a == 0 && dVar.c == 0) ? dVar.b : (int) ((j >>> 32) % this.a.c());
    }

    private static int o(d dVar) {
        return (dVar.a == 0 && dVar.c == 0) ? 2 : 0;
    }

    private void p(byte[] bArr, byte[] bArr2, int i, int i2) {
        byte[] bArr3 = new byte[4];
        h.f(i2, bArr3, 0);
        if (i2 <= 64) {
            C3384a c3384a = new C3384a(i2 * 8);
            c3384a.b(bArr3, 0, 4);
            c3384a.b(bArr, 0, bArr.length);
            c3384a.c(bArr2, i);
            return;
        }
        C3384a c3384a2 = new C3384a(512);
        byte[] bArr4 = new byte[64];
        c3384a2.b(bArr3, 0, 4);
        c3384a2.b(bArr, 0, bArr.length);
        c3384a2.c(bArr4, 0);
        System.arraycopy(bArr4, 0, bArr2, i, 32);
        int i3 = i + 32;
        int i4 = 2;
        int i5 = ((i2 + 31) / 32) - 2;
        while (i4 <= i5) {
            c3384a2.b(bArr4, 0, 64);
            c3384a2.c(bArr4, 0);
            System.arraycopy(bArr4, 0, bArr2, i3, 32);
            i4++;
            i3 += 32;
        }
        C3384a c3384a3 = new C3384a((i2 - (i5 * 32)) * 8);
        c3384a3.b(bArr4, 0, 64);
        c3384a3.c(bArr2, i3);
    }

    private void r(c cVar, d dVar, b bVar, b bVar2) {
        bVar.a[0] = u(dVar.a);
        bVar.a[1] = u(dVar.b);
        bVar.a[2] = u(dVar.c);
        bVar.a[3] = u(this.b.length);
        bVar.a[4] = u(this.a.b());
        bVar.a[5] = u(this.a.g());
        if (dVar.a == 0 && dVar.c == 0) {
            x(cVar, bVar, bVar2);
        }
    }

    private void s(int i) {
        this.b = new b[i];
        int i2 = 0;
        while (true) {
            b[] bVarArr = this.b;
            if (i2 >= bVarArr.length) {
                return;
            }
            bVarArr[i2] = new b();
            i2++;
        }
    }

    private void t(byte[] bArr, byte[] bArr2, int i) {
        C3384a c3384a = new C3384a(512);
        h.g(new int[]{this.a.c(), i, this.a.d(), this.a.b(), this.a.h(), this.a.g()}, bArr, 0);
        c3384a.b(bArr, 0, 24);
        c(bArr, c3384a, bArr2);
        c(bArr, c3384a, this.a.e());
        c(bArr, c3384a, this.a.f());
        c(bArr, c3384a, this.a.a());
        byte[] bArr3 = new byte[72];
        c3384a.c(bArr3, 0);
        f(bArr, bArr3);
    }

    private long u(int i) {
        return i & 4294967295L;
    }

    private boolean v(d dVar) {
        return this.a.g() == 1 || (this.a.g() == 2 && dVar.a == 0 && dVar.c < 2);
    }

    private boolean w(d dVar) {
        return (dVar.a == 0 || this.a.h() == 16) ? false : true;
    }

    private void x(c cVar, b bVar, b bVar2) {
        long[] jArr = bVar.a;
        jArr[6] = jArr[6] + 1;
        cVar.e(bVar, bVar2);
        cVar.e(bVar2, bVar2);
    }

    private static void y(long[] jArr, int i, int i2, int i3, int i4) {
        long j = jArr[i];
        long j2 = jArr[i2];
        long j3 = j + j2 + ((j & 4294967295L) * 2 * (4294967295L & j2));
        long b2 = e.b(jArr[i3] ^ j3, i4);
        jArr[i] = j3;
        jArr[i3] = b2;
    }

    private void z() {
        if (this.b == null) {
            return;
        }
        int i = 0;
        while (true) {
            b[] bVarArr = this.b;
            if (i >= bVarArr.length) {
                return;
            }
            b bVar = bVarArr[i];
            if (bVar != null) {
                bVar.f();
            }
            i++;
        }
    }

    public int i(byte[] bArr, byte[] bArr2) {
        return j(bArr, bArr2, 0, bArr2.length);
    }

    public int j(byte[] bArr, byte[] bArr2, int i, int i2) {
        if (i2 < 4) {
            throw new IllegalStateException("output length less than 4");
        }
        byte[] bArr3 = new byte[1024];
        t(bArr3, bArr, i2);
        g();
        d(bArr3, bArr2, i, i2);
        z();
        return i2;
    }

    public void q(ax.Dd.b bVar) {
        this.a = bVar;
        if (bVar.c() < 1) {
            throw new IllegalStateException("lanes must be greater than 1");
        }
        if (bVar.c() > 16777216) {
            throw new IllegalStateException("lanes must be less than 16777216");
        }
        if (bVar.d() >= bVar.c() * 2) {
            if (bVar.b() < 1) {
                throw new IllegalStateException("iterations is less than: 1");
            }
            e(bVar);
        } else {
            throw new IllegalStateException("memory is less than: " + (bVar.c() * 2) + " expected " + (bVar.c() * 2));
        }
    }
}
