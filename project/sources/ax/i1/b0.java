package ax.i1;

import ax.P0.InterfaceC0902k;
import ax.S0.C0968a;
import ax.i1.d0;
import ax.m1.C2510a;
import ax.m1.b;
import ax.q1.U;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
class b0 {
    private final ax.m1.b a;
    private final int b;
    private final ax.S0.G c;
    private a d;
    private a e;
    private a f;
    private long g;

    private static final class a implements b.a {
        public long a;
        public long b;
        public C2510a c;
        public a d;

        public a(long j, int i) {
            d(j, i);
        }

        @Override // ax.m1.b.a
        public C2510a a() {
            return (C2510a) C0968a.e(this.c);
        }

        public a b() {
            this.c = null;
            a aVar = this.d;
            this.d = null;
            return aVar;
        }

        public void c(C2510a c2510a, a aVar) {
            this.c = c2510a;
            this.d = aVar;
        }

        public void d(long j, int i) {
            C0968a.g(this.c == null);
            this.a = j;
            this.b = j + i;
        }

        public int e(long j) {
            return ((int) (j - this.a)) + this.c.b;
        }

        @Override // ax.m1.b.a
        public b.a next() {
            a aVar = this.d;
            if (aVar == null || aVar.c == null) {
                return null;
            }
            return aVar;
        }
    }

    public b0(ax.m1.b bVar) {
        this.a = bVar;
        int e = bVar.e();
        this.b = e;
        this.c = new ax.S0.G(32);
        a aVar = new a(0L, e);
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
    }

    private void a(a aVar) {
        if (aVar.c == null) {
            return;
        }
        this.a.d(aVar);
        aVar.b();
    }

    private static a d(a aVar, long j) {
        while (j >= aVar.b) {
            aVar = aVar.d;
        }
        return aVar;
    }

    private void g(int i) {
        long j = this.g + i;
        this.g = j;
        a aVar = this.f;
        if (j == aVar.b) {
            this.f = aVar.d;
        }
    }

    private int h(int i) {
        a aVar = this.f;
        if (aVar.c == null) {
            aVar.c(this.a.b(), new a(this.f.b, this.b));
        }
        return Math.min(i, (int) (this.f.b - this.g));
    }

    private static a i(a aVar, long j, ByteBuffer byteBuffer, int i) {
        a d = d(aVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (d.b - j));
            byteBuffer.put(d.c.a, d.e(j), min);
            i -= min;
            j += min;
            if (j == d.b) {
                d = d.d;
            }
        }
        return d;
    }

    private static a j(a aVar, long j, byte[] bArr, int i) {
        a d = d(aVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (d.b - j));
            System.arraycopy(d.c.a, d.e(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == d.b) {
                d = d.d;
            }
        }
        return d;
    }

    private static a k(a aVar, ax.V0.i iVar, d0.b bVar, ax.S0.G g) {
        int i;
        long j = bVar.b;
        g.X(1);
        a j2 = j(aVar, j, g.f(), 1);
        long j3 = j + 1;
        byte b = g.f()[0];
        boolean z = (b & 128) != 0;
        int i2 = b & Byte.MAX_VALUE;
        ax.V0.c cVar = iVar.d0;
        byte[] bArr = cVar.a;
        if (bArr == null) {
            cVar.a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a j4 = j(j2, j3, cVar.a, i2);
        long j5 = j3 + i2;
        if (z) {
            g.X(2);
            j4 = j(j4, j5, g.f(), 2);
            j5 += 2;
            i = g.U();
        } else {
            i = 1;
        }
        int[] iArr = cVar.d;
        if (iArr == null || iArr.length < i) {
            iArr = new int[i];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.e;
        if (iArr3 == null || iArr3.length < i) {
            iArr3 = new int[i];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i3 = i * 6;
            g.X(i3);
            j4 = j(j4, j5, g.f(), i3);
            j5 += i3;
            g.b0(0);
            for (int i4 = 0; i4 < i; i4++) {
                iArr2[i4] = g.U();
                iArr4[i4] = g.Q();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.a - ((int) (j5 - bVar.b));
        }
        U.a aVar2 = (U.a) ax.S0.d0.i(bVar.c);
        cVar.c(i, iArr2, iArr4, aVar2.b, cVar.a, aVar2.a, aVar2.c, aVar2.d);
        long j6 = bVar.b;
        int i5 = (int) (j5 - j6);
        bVar.b = j6 + i5;
        bVar.a -= i5;
        return j4;
    }

    private static a l(a aVar, ax.V0.i iVar, d0.b bVar, ax.S0.G g) {
        if (iVar.E()) {
            aVar = k(aVar, iVar, bVar, g);
        }
        if (!iVar.r()) {
            iVar.C(bVar.a);
            return i(aVar, bVar.b, iVar.e0, bVar.a);
        }
        g.X(4);
        a j = j(aVar, bVar.b, g.f(), 4);
        int Q = g.Q();
        bVar.b += 4;
        bVar.a -= 4;
        iVar.C(Q);
        a i = i(j, bVar.b, iVar.e0, Q);
        bVar.b += Q;
        int i2 = bVar.a - Q;
        bVar.a = i2;
        iVar.G(i2);
        return i(i, bVar.b, iVar.h0, bVar.a);
    }

    public void b(long j) {
        a aVar;
        if (j == -1) {
            return;
        }
        while (true) {
            aVar = this.d;
            if (j < aVar.b) {
                break;
            }
            this.a.a(aVar.c);
            this.d = this.d.b();
        }
        if (this.e.a < aVar.a) {
            this.e = aVar;
        }
    }

    public void c(long j) {
        C0968a.a(j <= this.g);
        this.g = j;
        if (j != 0) {
            a aVar = this.d;
            if (j != aVar.a) {
                while (this.g > aVar.b) {
                    aVar = aVar.d;
                }
                a aVar2 = (a) C0968a.e(aVar.d);
                a(aVar2);
                a aVar3 = new a(aVar.b, this.b);
                aVar.d = aVar3;
                if (this.g == aVar.b) {
                    aVar = aVar3;
                }
                this.f = aVar;
                if (this.e == aVar2) {
                    this.e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.d);
        a aVar4 = new a(this.g, this.b);
        this.d = aVar4;
        this.e = aVar4;
        this.f = aVar4;
    }

    public long e() {
        return this.g;
    }

    public void f(ax.V0.i iVar, d0.b bVar) {
        l(this.e, iVar, bVar, this.c);
    }

    public void m(ax.V0.i iVar, d0.b bVar) {
        this.e = l(this.e, iVar, bVar, this.c);
    }

    public void n() {
        a(this.d);
        this.d.d(0L, this.b);
        a aVar = this.d;
        this.e = aVar;
        this.f = aVar;
        this.g = 0L;
        this.a.c();
    }

    public void o() {
        this.e = this.d;
    }

    public int p(InterfaceC0902k interfaceC0902k, int i, boolean z) throws IOException {
        int h = h(i);
        a aVar = this.f;
        int c = interfaceC0902k.c(aVar.c.a, aVar.e(this.g), h);
        if (c != -1) {
            g(c);
            return c;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public void q(ax.S0.G g, int i) {
        while (i > 0) {
            int h = h(i);
            a aVar = this.f;
            g.q(aVar.c.a, aVar.e(this.g), h);
            i -= h;
            g(h);
        }
    }
}
