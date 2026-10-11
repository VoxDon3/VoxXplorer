/*
 * Decompiled with CFR 0.152.
 */
package ax.zd;

import ax.Ad.c;
import ax.Dd.k;
import ax.Nd.h;
import ax.vd.a;
import ax.vd.d;
import ax.vd.l;

public class b
implements l {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private byte[] d;
    private int e;
    private a f;
    private int g;
    private byte[] h;
    private byte[] i;

    public b(a a8) {
        this(a8, a8.d() * 8);
    }

    public b(a a8, int n8) {
        if (n8 % 8 == 0) {
            if (n8 <= a8.d() * 8) {
                this.f = new c(a8);
                this.g = n8 / 8;
                this.a = ax.zd.b.g(a8.d());
                this.c = new byte[a8.d()];
                this.d = new byte[a8.d()];
                this.b = new byte[a8.d()];
                this.e = 0;
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MAC size must be less or equal to ");
            stringBuilder.append(a8.d() * 8);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        throw new IllegalArgumentException("MAC size must be multiple of 8");
    }

    private byte[] f(byte[] byArray) {
        byte[] byArray2 = new byte[byArray.length];
        int n8 = -ax.zd.b.i(byArray, byArray2) & 0xFF;
        int n9 = byArray.length - 3;
        int n10 = byArray2[n9];
        byte[] byArray3 = this.a;
        byArray2[n9] = (byte)(n10 ^ byArray3[1] & n8);
        n10 = byArray.length - 2;
        n9 = byArray2[n10];
        byArray2[n10] = (byte)(byArray3[2] & n8 ^ n9);
        n9 = byArray.length - 1;
        n10 = byArray2[n9];
        byArray2[n9] = (byte)(n8 & byArray3[3] ^ n10);
        return byArray2;
    }

    private static byte[] g(int n8) {
        int n9 = n8 * 8;
        n8 = 135;
        switch (n9) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown block size for CMAC: ");
                stringBuilder.append(n9);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            case 2048: {
                n8 = 548865;
                break;
            }
            case 1024: {
                n8 = 524355;
                break;
            }
            case 768: {
                n8 = 655377;
                break;
            }
            case 512: {
                n8 = 293;
                break;
            }
            case 448: {
                n8 = 2129;
                break;
            }
            case 384: {
                n8 = 4109;
                break;
            }
            case 64: 
            case 320: {
                n8 = 27;
                break;
            }
            case 256: {
                n8 = 1061;
                break;
            }
            case 224: {
                n8 = 777;
                break;
            }
            case 160: {
                n8 = 45;
            }
            case 128: 
            case 192: 
        }
        return ax.Nd.h.e(n8);
    }

    private static int i(byte[] byArray, byte[] byArray2) {
        int n8 = byArray.length;
        int n9 = 0;
        while (--n8 >= 0) {
            int n10 = byArray[n8] & 0xFF;
            byArray2[n8] = (byte)(n9 | n10 << 1);
            n9 = n10 >>> 7 & 1;
        }
        return n9;
    }

    @Override
    public int a() {
        return this.g;
    }

    @Override
    public void b(byte[] byArray, int n8, int n9) {
        if (n9 >= 0) {
            int n10 = this.f.d();
            int n11 = this.e;
            int n12 = n10 - n11;
            int n13 = n8;
            int n14 = n9;
            if (n9 > n12) {
                System.arraycopy(byArray, n8, this.d, n11, n12);
                this.f.h(this.d, 0, this.c, 0);
                this.e = 0;
                n9 -= n12;
                n8 += n12;
                while (true) {
                    n13 = n8;
                    n14 = n9;
                    if (n9 <= n10) break;
                    this.f.h(byArray, n8, this.c, 0);
                    n9 -= n10;
                    n8 += n10;
                }
            }
            System.arraycopy(byArray, n13, this.d, this.e, n14);
            this.e += n14;
            return;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }

    @Override
    public int c(byte[] byArray, int n8) {
        byte[] byArray2;
        byte[] byArray3;
        int n9 = this.f.d();
        if (this.e == n9) {
            byArray3 = this.h;
        } else {
            new ax.Cd.b().a(this.d, this.e);
            byArray3 = this.i;
        }
        for (n9 = 0; n9 < (byArray2 = this.c).length; ++n9) {
            byArray2 = this.d;
            byArray2[n9] = (byte)(byArray2[n9] ^ byArray3[n9]);
        }
        this.f.h(this.d, 0, byArray2, 0);
        System.arraycopy(this.c, 0, byArray, n8, this.g);
        this.h();
        return this.g;
    }

    @Override
    public void d(byte by) {
        int n8 = this.e;
        byte[] byArray = this.d;
        if (n8 == byArray.length) {
            this.f.h(byArray, 0, this.c, 0);
            this.e = 0;
        }
        byArray = this.d;
        n8 = this.e;
        this.e = n8 + 1;
        byArray[n8] = by;
    }

    @Override
    public void e(d object) {
        this.j((d)object);
        this.f.e(true, (d)object);
        byte[] byArray = this.b;
        object = new byte[byArray.length];
        this.f.h(byArray, 0, (byte[])object, 0);
        object = this.f((byte[])object);
        this.h = (byte[])object;
        this.i = this.f((byte[])object);
        this.h();
    }

    public void h() {
        byte[] byArray;
        for (int i8 = 0; i8 < (byArray = this.d).length; ++i8) {
            byArray[i8] = 0;
        }
        this.e = 0;
        this.f.a();
    }

    void j(d d8) {
        if (d8 != null) {
            if (d8 instanceof k) {
                return;
            }
            throw new IllegalArgumentException("CMac mode only permits key to be set.");
        }
    }
}

