package ax.pb;

import ax.qb.C2896d;

/* renamed from: ax.pb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC2795b extends AbstractC2818s {
    private byte C0;
    private int D0;
    AbstractC2818s E0;

    AbstractC2795b() {
        this.C0 = (byte) -1;
        this.D0 = 0;
        this.E0 = null;
    }

    int E(byte b) {
        return 0;
    }

    int F(byte[] bArr, int i) {
        byte b;
        int i2 = i + 1;
        byte b2 = bArr[i];
        this.o0 = b2;
        if (b2 != 0) {
            this.C0 = bArr[i2];
            int i3 = AbstractC2818s.i(bArr, i + 3);
            this.D0 = i3;
            if (i3 == 0) {
                this.C0 = (byte) -1;
            }
            if (this.o0 > 2) {
                l(bArr, i + 5);
                if (this.d0 == -94 && ((C2791D) this).S0) {
                    this.o0 += 8;
                }
            }
            i2 += this.o0 * 2;
        }
        int i4 = AbstractC2818s.i(bArr, i2);
        this.p0 = i4;
        int i5 = i2 + 2;
        if (i4 != 0) {
            g(bArr, i5);
            i5 += this.p0;
        }
        int i6 = this.i0;
        if (i6 != 0 || (b = this.C0) == -1) {
            this.C0 = (byte) -1;
            this.E0 = null;
        } else {
            AbstractC2818s abstractC2818s = this.E0;
            if (abstractC2818s == null) {
                this.C0 = (byte) -1;
                throw new RuntimeException("no andx command supplied with response");
            }
            int i7 = this.f0;
            int i8 = this.D0 + i7;
            abstractC2818s.f0 = i7;
            abstractC2818s.d0 = b;
            abstractC2818s.i0 = i6;
            abstractC2818s.e0 = this.e0;
            abstractC2818s.j0 = this.j0;
            abstractC2818s.k0 = this.k0;
            abstractC2818s.l0 = this.l0;
            abstractC2818s.m0 = this.m0;
            abstractC2818s.n0 = this.n0;
            abstractC2818s.q0 = this.q0;
            if (abstractC2818s instanceof AbstractC2795b) {
                i5 = i8 + ((AbstractC2795b) abstractC2818s).F(bArr, i8);
            } else {
                int i9 = i8 + 1;
                int i10 = abstractC2818s.o0;
                bArr[i8] = (byte) (i10 & 255);
                if (i10 != 0 && i10 > 2) {
                    i9 += abstractC2818s.l(bArr, i9);
                }
                this.E0.p0 = AbstractC2818s.i(bArr, i9);
                int i11 = i9 + 2;
                AbstractC2818s abstractC2818s2 = this.E0;
                if (abstractC2818s2.p0 != 0) {
                    abstractC2818s2.g(bArr, i11);
                    i11 += this.E0.p0;
                }
                i5 = i11;
            }
            this.E0.r0 = true;
        }
        return i5 - i;
    }

    int G(byte[] bArr, int i) {
        int i2;
        int i3 = i + 3;
        int z = z(bArr, i + 5);
        int i4 = z + 4;
        int i5 = z + 5 + i;
        int i6 = i4 / 2;
        this.o0 = i6;
        bArr[i] = (byte) (i6 & 255);
        int u = u(bArr, i5 + 2);
        this.p0 = u;
        bArr[i5] = (byte) (u & 255);
        bArr[i5 + 1] = (byte) ((u >> 8) & 255);
        int i7 = i5 + 2 + u;
        AbstractC2818s abstractC2818s = this.E0;
        if (abstractC2818s == null || !Z.J || this.h0 >= E(abstractC2818s.d0)) {
            this.C0 = (byte) -1;
            this.E0 = null;
            bArr[i + 1] = -1;
            bArr[i + 2] = 0;
            bArr[i3] = -34;
            bArr[i + 4] = -34;
            return i7 - i;
        }
        this.E0.h0 = this.h0 + 1;
        bArr[i + 1] = this.C0;
        bArr[i + 2] = 0;
        int i8 = i7 - this.f0;
        this.D0 = i8;
        AbstractC2818s.w(i8, bArr, i3);
        AbstractC2818s abstractC2818s2 = this.E0;
        abstractC2818s2.q0 = this.q0;
        if (abstractC2818s2 instanceof AbstractC2795b) {
            abstractC2818s2.m0 = this.m0;
            i2 = i7 + ((AbstractC2795b) abstractC2818s2).G(bArr, i7);
        } else {
            abstractC2818s2.o0 = abstractC2818s2.z(bArr, i7);
            AbstractC2818s abstractC2818s3 = this.E0;
            int i9 = abstractC2818s3.o0;
            int i10 = i9 + 1 + i7;
            int i11 = i9 / 2;
            abstractC2818s3.o0 = i11;
            bArr[i7] = (byte) (i11 & 255);
            abstractC2818s3.p0 = abstractC2818s3.u(bArr, i10 + 2);
            int i12 = this.E0.p0;
            bArr[i10] = (byte) (i12 & 255);
            bArr[i10 + 1] = (byte) ((i12 >> 8) & 255);
            i2 = i12 + i10 + 2;
        }
        return i2 - i;
    }

    @Override // ax.pb.AbstractC2818s
    int d(byte[] bArr, int i) {
        this.f0 = i;
        int h = h(bArr, i) + i;
        int F = (h + F(bArr, h)) - i;
        this.g0 = F;
        return F;
    }

    @Override // ax.pb.AbstractC2818s
    int e(byte[] bArr, int i) {
        AbstractC2795b abstractC2795b;
        this.f0 = i;
        int v = v(bArr, i) + i;
        int G = (v + G(bArr, v)) - i;
        this.g0 = G;
        C2819t c2819t = this.y0;
        if (c2819t != null) {
            abstractC2795b = this;
            c2819t.b(bArr, this.f0, G, abstractC2795b, this.z0);
        } else {
            abstractC2795b = this;
        }
        return abstractC2795b.g0;
    }

    @Override // ax.pb.AbstractC2818s
    public String toString() {
        return new String(super.toString() + ",andxCommand=0x" + C2896d.c(this.C0, 2) + ",andxOffset=" + this.D0);
    }

    AbstractC2795b(AbstractC2818s abstractC2818s) {
        this.C0 = (byte) -1;
        this.D0 = 0;
        this.E0 = null;
        if (abstractC2818s != null) {
            this.E0 = abstractC2818s;
            this.C0 = abstractC2818s.d0;
        }
    }
}
