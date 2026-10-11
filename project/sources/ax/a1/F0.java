package ax.a1;

import ax.Q0.o;
import ax.S0.C0968a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class F0 extends ax.Q0.q {
    private final float i;
    private final short j;
    private final int k;
    private final long l;
    private final long m;
    private int n;
    private boolean o;
    private int p;
    private long q;
    private int r;
    private byte[] s;
    private int t;
    private int u;
    private byte[] v;

    public F0() {
        this(100000L, 0.2f, 2000000L, 10, (short) 1024);
    }

    private void A(boolean z) {
        int length;
        int r;
        int i = this.u;
        byte[] bArr = this.s;
        if (i == bArr.length || z) {
            if (this.r == 0) {
                if (z) {
                    B(i, 3);
                    length = i;
                } else {
                    C0968a.g(i >= bArr.length / 2);
                    length = this.s.length / 2;
                    B(length, 0);
                }
                r = length;
            } else if (z) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int r2 = r(length2) + (this.s.length / 2);
                B(r2, 2);
                r = r2;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                r = r(length);
                B(r, 1);
            }
            C0968a.h(length % this.n == 0, "bytesConsumed is not aligned to frame size: %s" + length);
            C0968a.g(i >= r);
            this.u -= length;
            int i2 = this.t + length;
            this.t = i2;
            this.t = i2 % this.s.length;
            this.r = this.r + (r / this.n);
            this.q += (length - r) / r2;
        }
    }

    private void B(int i, int i2) {
        if (i == 0) {
            return;
        }
        C0968a.a(this.u >= i);
        if (i2 == 2) {
            int i3 = this.t;
            int i4 = this.u;
            int i5 = i3 + i4;
            byte[] bArr = this.s;
            if (i5 <= bArr.length) {
                System.arraycopy(bArr, (i3 + i4) - i, this.v, 0, i);
            } else {
                int length = i4 - (bArr.length - i3);
                if (length >= i) {
                    System.arraycopy(bArr, length - i, this.v, 0, i);
                } else {
                    int i6 = i - length;
                    System.arraycopy(bArr, bArr.length - i6, this.v, 0, i6);
                    System.arraycopy(this.s, 0, this.v, i6, length);
                }
            }
        } else {
            int i7 = this.t;
            int i8 = i7 + i;
            byte[] bArr2 = this.s;
            if (i8 <= bArr2.length) {
                System.arraycopy(bArr2, i7, this.v, 0, i);
            } else {
                int length2 = bArr2.length - i7;
                System.arraycopy(bArr2, i7, this.v, 0, length2);
                System.arraycopy(this.s, 0, this.v, length2, i - length2);
            }
        }
        C0968a.b(i % this.n == 0, "sizeToOutput is not aligned to frame size: " + i);
        C0968a.g(this.t < this.s.length);
        z(this.v, i, i2);
    }

    private void C(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.s.length));
        int t = t(byteBuffer);
        if (t == byteBuffer.position()) {
            this.p = 1;
        } else {
            byteBuffer.limit(Math.min(t, byteBuffer.capacity()));
            y(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    private static void D(byte[] bArr, int i, int i2) {
        if (i2 >= 32767) {
            bArr[i] = -1;
            bArr[i + 1] = Byte.MAX_VALUE;
        } else if (i2 <= -32768) {
            bArr[i] = 0;
            bArr[i + 1] = Byte.MIN_VALUE;
        } else {
            bArr[i] = (byte) (i2 & 255);
            bArr[i + 1] = (byte) (i2 >> 8);
        }
    }

    private void F(ByteBuffer byteBuffer) {
        int i;
        int i2;
        C0968a.g(this.t < this.s.length);
        int limit = byteBuffer.limit();
        int u = u(byteBuffer);
        int position = u - byteBuffer.position();
        int i3 = this.t;
        int i4 = this.u;
        int i5 = i3 + i4;
        byte[] bArr = this.s;
        if (i5 < bArr.length) {
            i = bArr.length - (i4 + i3);
            i2 = i3 + i4;
        } else {
            int length = i4 - (bArr.length - i3);
            i = i3 - length;
            i2 = length;
        }
        boolean z = u < limit;
        int min = Math.min(position, i);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.s, i2, min);
        int i6 = this.u + min;
        this.u = i6;
        C0968a.g(i6 <= this.s.length);
        boolean z2 = z && position < i;
        A(z2);
        if (z2) {
            this.p = 0;
            this.r = 0;
        }
        byteBuffer.limit(limit);
    }

    private static int G(byte b, byte b2) {
        return (b << 8) | (b2 & 255);
    }

    private int n(float f) {
        return o((int) f);
    }

    private int o(int i) {
        int i2 = this.n;
        return (i / i2) * i2;
    }

    private int p(int i, int i2) {
        int i3 = this.k;
        return i3 + ((((100 - i3) * (i * 1000)) / i2) / 1000);
    }

    private int q(int i, int i2) {
        return (((this.k - 100) * ((i * 1000) / i2)) / 1000) + 100;
    }

    private int r(int i) {
        int s = ((s(this.m) - this.r) * this.n) - (this.s.length / 2);
        C0968a.g(s >= 0);
        return n(Math.min((i * this.i) + 0.5f, s));
    }

    private int s(long j) {
        return (int) ((j * this.b.a) / 1000000);
    }

    private int t(ByteBuffer byteBuffer) {
        for (int limit = byteBuffer.limit() - 1; limit >= byteBuffer.position(); limit -= 2) {
            if (w(byteBuffer.get(limit), byteBuffer.get(limit - 1))) {
                int i = this.n;
                return ((limit / i) * i) + i;
            }
        }
        return byteBuffer.position();
    }

    private int u(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < byteBuffer.limit(); position += 2) {
            if (w(byteBuffer.get(position), byteBuffer.get(position - 1))) {
                int i = this.n;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    private boolean w(byte b, byte b2) {
        return Math.abs(G(b, b2)) > this.j;
    }

    private void x(byte[] bArr, int i, int i2) {
        if (i2 == 3) {
            return;
        }
        for (int i3 = 0; i3 < i; i3 += 2) {
            D(bArr, i3, (G(bArr[i3 + 1], bArr[i3]) * (i2 == 0 ? q(i3, i - 1) : i2 == 2 ? p(i3, i - 1) : this.k)) / 100);
        }
    }

    private void y(ByteBuffer byteBuffer) {
        m(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    private void z(byte[] bArr, int i, int i2) {
        C0968a.b(i % this.n == 0, "byteOutput size is not aligned to frame size " + i);
        x(bArr, i, i2);
        m(i).put(bArr, 0, i).flip();
    }

    public void E(boolean z) {
        this.o = z;
    }

    @Override // ax.Q0.o
    public void d(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !h()) {
            int i = this.p;
            if (i == 0) {
                C(byteBuffer);
            } else {
                if (i != 1) {
                    throw new IllegalStateException();
                }
                F(byteBuffer);
            }
        }
    }

    @Override // ax.Q0.q, ax.Q0.o
    public boolean e() {
        return super.e() && this.o;
    }

    @Override // ax.Q0.q
    protected o.a i(o.a aVar) throws o.b {
        if (aVar.c == 2) {
            return aVar.a == -1 ? o.a.e : aVar;
        }
        throw new o.b(aVar);
    }

    @Override // ax.Q0.q
    public void j() {
        if (e()) {
            this.n = this.b.b * 2;
            int o = o(s(this.l) / 2) * 2;
            if (this.s.length != o) {
                this.s = new byte[o];
                this.v = new byte[o];
            }
        }
        this.p = 0;
        this.q = 0L;
        this.r = 0;
        this.t = 0;
        this.u = 0;
    }

    @Override // ax.Q0.q
    public void k() {
        if (this.u > 0) {
            A(true);
            this.r = 0;
        }
    }

    @Override // ax.Q0.q
    public void l() {
        this.o = false;
        byte[] bArr = ax.S0.d0.f;
        this.s = bArr;
        this.v = bArr;
    }

    public long v() {
        return this.q;
    }

    public F0(long j, float f, long j2, int i, short s) {
        boolean z = false;
        this.r = 0;
        this.t = 0;
        this.u = 0;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        C0968a.a(z);
        this.l = j;
        this.i = f;
        this.m = j2;
        this.k = i;
        this.j = s;
        byte[] bArr = ax.S0.d0.f;
        this.s = bArr;
        this.v = bArr;
    }
}
