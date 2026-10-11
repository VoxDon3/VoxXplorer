/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import ax.Q0.o;
import ax.Q0.q;
import ax.S0.a;
import ax.S0.d0;
import java.nio.ByteBuffer;

public final class F0
extends q {
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
        this(100000L, 0.2f, 2000000L, 10, 1024);
    }

    public F0(long l8, float f8, long l9, int n8, short s8) {
        boolean bl = false;
        this.r = 0;
        this.t = 0;
        this.u = 0;
        boolean bl2 = bl;
        if (f8 >= 0.0f) {
            bl2 = bl;
            if (f8 <= 1.0f) {
                bl2 = true;
            }
        }
        a.a(bl2);
        this.l = l8;
        this.i = f8;
        this.m = l9;
        this.k = n8;
        this.j = s8;
        byte[] byArray = d0.f;
        this.s = byArray;
        this.v = byArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void A(boolean bl) {
        int n8;
        int n9;
        int n10 = this.u;
        byte[] byArray = this.s;
        if (n10 != byArray.length && !bl) {
            return;
        }
        int n11 = this.r;
        boolean bl2 = false;
        if (n11 == 0) {
            if (bl) {
                this.B(n10, 3);
                n11 = n10;
            } else {
                bl = n10 >= byArray.length / 2;
                a.g(bl);
                n11 = this.s.length / 2;
                this.B(n11, 0);
            }
            n9 = n11;
        } else if (bl) {
            n8 = n10 - byArray.length / 2;
            n11 = byArray.length / 2;
            n9 = this.r(n8) + this.s.length / 2;
            this.B(n9, 2);
            n11 += n8;
        } else {
            n11 = n10 - byArray.length / 2;
            n9 = this.r(n11);
            this.B(n9, 1);
        }
        bl = n11 % this.n == 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("bytesConsumed is not aligned to frame size: %s");
        stringBuilder.append(n11);
        a.h(bl, stringBuilder.toString());
        bl = bl2;
        if (n10 >= n9) {
            bl = true;
        }
        a.g(bl);
        this.u -= n11;
        this.t = n10 = this.t + n11;
        this.t = n10 % this.s.length;
        n8 = this.r;
        n10 = this.n;
        this.r = n8 + n9 / n10;
        this.q += (long)((n11 - n9) / n10);
    }

    private void B(int n8, int n9) {
        Object object;
        if (n8 == 0) {
            return;
        }
        int n10 = this.u;
        boolean bl = true;
        boolean bl2 = n10 >= n8;
        a.a(bl2);
        if (n9 == 2) {
            int n11 = this.t;
            n10 = this.u;
            object = this.s;
            if (n11 + n10 <= ((byte[])object).length) {
                System.arraycopy(object, n11 + n10 - n8, this.v, 0, n8);
            } else if ((n11 = n10 - (((byte[])object).length - n11)) >= n8) {
                System.arraycopy(object, n11 - n8, this.v, 0, n8);
            } else {
                n10 = n8 - n11;
                System.arraycopy(object, ((byte[])object).length - n10, this.v, 0, n10);
                System.arraycopy(this.s, 0, this.v, n10, n11);
            }
        } else {
            int n12 = this.t;
            object = this.s;
            if (n12 + n8 <= ((byte[])object).length) {
                System.arraycopy(object, n12, this.v, 0, n8);
            } else {
                n10 = ((byte[])object).length - n12;
                System.arraycopy(object, n12, this.v, 0, n10);
                System.arraycopy(this.s, 0, this.v, n10, n8 - n10);
            }
        }
        bl2 = n8 % this.n == 0;
        object = new StringBuilder();
        object.append("sizeToOutput is not aligned to frame size: ");
        object.append(n8);
        a.b(bl2, object.toString());
        bl2 = this.t < this.s.length ? bl : false;
        a.g(bl2);
        this.z(this.v, n8, n9);
    }

    private void C(ByteBuffer byteBuffer) {
        int n8 = byteBuffer.limit();
        byteBuffer.limit(Math.min(n8, byteBuffer.position() + this.s.length));
        int n9 = this.t(byteBuffer);
        if (n9 == byteBuffer.position()) {
            this.p = 1;
        } else {
            byteBuffer.limit(Math.min(n9, byteBuffer.capacity()));
            this.y(byteBuffer);
        }
        byteBuffer.limit(n8);
    }

    private static void D(byte[] byArray, int n8, int n9) {
        if (n9 >= Short.MAX_VALUE) {
            byArray[n8] = -1;
            byArray[n8 + 1] = 127;
            return;
        }
        if (n9 <= Short.MIN_VALUE) {
            byArray[n8] = 0;
            byArray[n8 + 1] = -128;
            return;
        }
        byArray[n8] = (byte)(n9 & 0xFF);
        byArray[n8 + 1] = (byte)(n9 >> 8);
    }

    private void F(ByteBuffer byteBuffer) {
        int n8 = this.t;
        int n9 = this.s.length;
        boolean bl = true;
        boolean bl2 = n8 < n9;
        a.g(bl2);
        int n10 = byteBuffer.limit();
        int n11 = this.u(byteBuffer);
        int n12 = n11 - byteBuffer.position();
        int n13 = this.t;
        n9 = this.u;
        byte[] byArray = this.s;
        if (n13 + n9 < byArray.length) {
            n8 = byArray.length - (n9 + n13);
            n9 = n13 + n9;
        } else {
            n8 = n13 - (n9 -= byArray.length - n13);
        }
        n11 = n11 < n10 ? 1 : 0;
        n13 = Math.min(n12, n8);
        byteBuffer.limit(byteBuffer.position() + n13);
        byteBuffer.get(this.s, n9, n13);
        this.u = n9 = this.u + n13;
        bl2 = n9 <= this.s.length;
        a.g(bl2);
        bl2 = n11 != 0 && n12 < n8 ? bl : false;
        this.A(bl2);
        if (bl2) {
            this.p = 0;
            this.r = 0;
        }
        byteBuffer.limit(n10);
    }

    private static int G(byte by, byte by2) {
        return by << 8 | by2 & 0xFF;
    }

    private int n(float f8) {
        return this.o((int)f8);
    }

    private int o(int n8) {
        int n9 = this.n;
        return n8 / n9 * n9;
    }

    private int p(int n8, int n9) {
        int n10 = this.k;
        return n10 + (100 - n10) * (n8 * 1000) / n9 / 1000;
    }

    private int q(int n8, int n9) {
        return (this.k - 100) * (n8 * 1000 / n9) / 1000 + 100;
    }

    private int r(int n8) {
        int n9 = (this.s(this.m) - this.r) * this.n - this.s.length / 2;
        boolean bl = n9 >= 0;
        a.g(bl);
        return this.n(Math.min((float)n8 * this.i + 0.5f, (float)n9));
    }

    private int s(long l8) {
        return (int)(l8 * (long)this.b.a / 1000000L);
    }

    private int t(ByteBuffer byteBuffer) {
        for (int i8 = byteBuffer.limit() - 1; i8 >= byteBuffer.position(); i8 -= 2) {
            if (!this.w(byteBuffer.get(i8), byteBuffer.get(i8 - 1))) continue;
            int n8 = this.n;
            return i8 / n8 * n8 + n8;
        }
        return byteBuffer.position();
    }

    private int u(ByteBuffer byteBuffer) {
        for (int i8 = byteBuffer.position() + 1; i8 < byteBuffer.limit(); i8 += 2) {
            if (!this.w(byteBuffer.get(i8), byteBuffer.get(i8 - 1))) continue;
            int n8 = this.n;
            return n8 * (i8 / n8);
        }
        return byteBuffer.limit();
    }

    private boolean w(byte by, byte by2) {
        return Math.abs(F0.G(by, by2)) > this.j;
    }

    private void x(byte[] byArray, int n8, int n9) {
        if (n9 != 3) {
            for (int i8 = 0; i8 < n8; i8 += 2) {
                int n10 = F0.G(byArray[i8 + 1], byArray[i8]);
                int n11 = n9 == 0 ? this.q(i8, n8 - 1) : (n9 == 2 ? this.p(i8, n8 - 1) : this.k);
                F0.D(byArray, i8, n10 * n11 / 100);
            }
        }
    }

    private void y(ByteBuffer byteBuffer) {
        this.m(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    private void z(byte[] byArray, int n8, int n9) {
        boolean bl = n8 % this.n == 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("byteOutput size is not aligned to frame size ");
        stringBuilder.append(n8);
        a.b(bl, stringBuilder.toString());
        this.x(byArray, n8, n9);
        this.m(n8).put(byArray, 0, n8).flip();
    }

    public void E(boolean bl) {
        this.o = bl;
    }

    @Override
    public void d(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !this.h()) {
            int n8 = this.p;
            if (n8 != 0) {
                if (n8 == 1) {
                    this.F(byteBuffer);
                    continue;
                }
                throw new IllegalStateException();
            }
            this.C(byteBuffer);
        }
    }

    @Override
    public boolean e() {
        return super.e() && this.o;
    }

    @Override
    protected o.a i(o.a a8) throws o.b {
        if (a8.c == 2) {
            o.a a9 = a8;
            if (a8.a == -1) {
                a9 = o.a.e;
            }
            return a9;
        }
        throw new o.b(a8);
    }

    @Override
    public void j() {
        if (this.e()) {
            this.n = this.b.b * 2;
            int n8 = this.o(this.s(this.l) / 2) * 2;
            if (this.s.length != n8) {
                this.s = new byte[n8];
                this.v = new byte[n8];
            }
        }
        this.p = 0;
        this.q = 0L;
        this.r = 0;
        this.t = 0;
        this.u = 0;
    }

    @Override
    public void k() {
        if (this.u > 0) {
            this.A(true);
            this.r = 0;
        }
    }

    @Override
    public void l() {
        this.o = false;
        byte[] byArray = d0.f;
        this.s = byArray;
        this.v = byArray;
    }

    public long v() {
        return this.q;
    }
}

