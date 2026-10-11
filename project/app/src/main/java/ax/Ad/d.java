/*
 * Decompiled with CFR 0.152.
 */
package ax.Ad;

import ax.Ad.f;
import ax.Dd.l;
import ax.vd.k;
import ax.vd.n;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public class d
implements ax.Ad.a {
    private ax.vd.a a;
    private int b;
    private boolean c;
    private byte[] d;
    private byte[] e;
    private int f;
    private ax.vd.d g;
    private byte[] h;
    private a i = new a(this);
    private a j = new a(this);

    public d(ax.vd.a a8) {
        int n8;
        this.a = a8;
        this.b = n8 = a8.d();
        this.h = new byte[n8];
        if (n8 == 16) {
            return;
        }
        throw new IllegalArgumentException("cipher required with a block size of 16.");
    }

    private int a(byte[] byArray, int n8, int n9, byte[] byArray2) {
        byte by;
        ax.zd.a a8 = new ax.zd.a(this.a, this.f * 8);
        a8.e(this.g);
        byte[] byArray3 = new byte[16];
        if (this.f()) {
            byArray3[0] = (byte)(byArray3[0] | 0x40);
        }
        int n10 = byArray3[0];
        int n11 = a8.a();
        int n12 = 2;
        byArray3[0] = by = (byte)(n10 | ((n11 - 2) / 2 & 7) << 3);
        byte[] byArray4 = this.d;
        byArray3[0] = (byte)(by | 14 - byArray4.length & 7);
        System.arraycopy(byArray4, 0, byArray3, 1, byArray4.length);
        n11 = n9;
        n10 = 1;
        while (n11 > 0) {
            byArray3[16 - n10] = (byte)(n11 & 0xFF);
            n11 >>>= 8;
            ++n10;
        }
        a8.b(byArray3, 0, 16);
        if (this.f()) {
            n11 = this.b();
            if (n11 < 65280) {
                a8.d((byte)(n11 >> 8));
                a8.d((byte)n11);
                n10 = n12;
            } else {
                a8.d((byte)-1);
                a8.d((byte)-2);
                a8.d((byte)(n11 >> 24));
                a8.d((byte)(n11 >> 16));
                a8.d((byte)(n11 >> 8));
                a8.d((byte)n11);
                n10 = 6;
            }
            byArray4 = this.e;
            if (byArray4 != null) {
                a8.b(byArray4, 0, byArray4.length);
            }
            if (this.i.size() > 0) {
                a8.b(this.i.a(), 0, this.i.size());
            }
            if ((n10 = (n10 + n11) % 16) != 0) {
                while (n10 != 16) {
                    a8.d((byte)0);
                    ++n10;
                }
            }
        }
        a8.b(byArray, n8, n9);
        return a8.c(byArray2, 0);
    }

    private int b() {
        int n8 = this.i.size();
        byte[] byArray = this.e;
        int n9 = byArray == null ? 0 : byArray.length;
        return n8 + n9;
    }

    private int d(boolean bl, int n8) {
        if (bl && (n8 < 32 || n8 > 128 || (n8 & 0xF) != 0)) {
            throw new IllegalArgumentException("tag length in octets must be one of {4,6,8,10,12,14,16}");
        }
        return n8 >>> 3;
    }

    private boolean f() {
        return this.b() > 0;
    }

    @Override
    public int c(byte[] byArray, int n8) throws IllegalStateException, k {
        n8 = this.k(this.j.a(), 0, this.j.size(), byArray, n8);
        this.l();
        return n8;
    }

    @Override
    public void e(boolean bl, ax.vd.d object) throws IllegalArgumentException {
        block7: {
            block6: {
                block5: {
                    this.c = bl;
                    if (!(object instanceof ax.Dd.a)) break block5;
                    object = (ax.Dd.a)object;
                    this.d = ((ax.Dd.a)object).d();
                    this.e = ((ax.Dd.a)object).a();
                    this.f = this.d(bl, ((ax.Dd.a)object).c());
                    object = ((ax.Dd.a)object).b();
                    break block6;
                }
                if (!(object instanceof l)) break block7;
                object = (l)object;
                this.d = ((l)object).a();
                this.e = null;
                this.f = this.d(bl, 64);
                object = ((l)object).b();
            }
            if (object != null) {
                this.g = object;
            }
            if ((object = (Object)this.d) != null && ((Object)object).length >= 7 && ((Object)object).length <= 13) {
                this.l();
                return;
            }
            throw new IllegalArgumentException("nonce must have length from 7 to 13 octets");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("invalid parameters passed to CCM: ");
        stringBuilder.append(object.getClass().getName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Override
    public int g(byte[] byArray, int n8, int n9, byte[] byArray2, int n10) throws ax.vd.f, IllegalStateException {
        if (byArray.length >= n8 + n9) {
            ((OutputStream)this.j).write(byArray, n8, n9);
            return 0;
        }
        throw new ax.vd.f("Input buffer too short");
    }

    @Override
    public int h(int n8) {
        return 0;
    }

    @Override
    public int i(int n8) {
        n8 += this.j.size();
        if (this.c) {
            return n8 + this.f;
        }
        int n9 = this.f;
        if (n8 < n9) {
            return 0;
        }
        return n8 - n9;
    }

    @Override
    public void j(byte[] byArray, int n8, int n9) {
        ((OutputStream)this.i).write(byArray, n8, n9);
    }

    public int k(byte[] byArray, int n8, int n9, byte[] byArray2, int n10) throws IllegalStateException, k, ax.vd.f {
        if (this.g != null) {
            Object object = this.d;
            int n11 = ((byte[])object).length;
            int n12 = 15 - n11;
            if (n12 < 4 && n9 >= 1 << n12 * 8) {
                throw new IllegalStateException("CCM packet too large for choice of q.");
            }
            byte[] byArray3 = new byte[this.b];
            byArray3[0] = (byte)(14 - n11 & 7);
            System.arraycopy(object, 0, byArray3, 1, ((byte[])object).length);
            object = new f(this.a);
            object.e(this.c, new l(this.g, byArray3));
            if (this.c) {
                int n13 = this.f + n9;
                if (byArray2.length >= n13 + n10) {
                    int n14;
                    int n15;
                    this.a(byArray, n8, n9, this.h);
                    byte[] byArray4 = new byte[this.b];
                    object.h(this.h, 0, byArray4, 0);
                    n12 = n10;
                    for (n11 = n8; n11 < (n15 = n8 + n9) - (n14 = this.b); n11 += n15) {
                        object.h(byArray, n11, byArray2, n12);
                        n15 = this.b;
                        n12 += n15;
                    }
                    byArray3 = new byte[n14];
                    n8 = n15 - n11;
                    System.arraycopy(byArray, n11, byArray3, 0, n8);
                    object.h(byArray3, 0, byArray3, 0);
                    System.arraycopy(byArray3, 0, byArray2, n12, n8);
                    System.arraycopy(byArray4, 0, byArray2, n10 + n9, this.f);
                    return n13;
                }
                throw new n("Output buffer too short.");
            }
            n11 = this.f;
            if (n9 >= n11) {
                n12 = n9 - n11;
                if (byArray2.length >= n12 + n10) {
                    int n16;
                    int n17 = n8 + n12;
                    System.arraycopy(byArray, n17, this.h, 0, n11);
                    byArray3 = this.h;
                    object.h(byArray3, 0, byArray3, 0);
                    for (n9 = this.f; n9 != (byArray3 = this.h).length; ++n9) {
                        byArray3[n9] = 0;
                    }
                    n11 = n10;
                    for (n9 = n8; n9 < n17 - (n16 = this.b); n9 += n16) {
                        object.h(byArray, n9, byArray2, n11);
                        n16 = this.b;
                        n11 += n16;
                    }
                    byArray3 = new byte[n16];
                    n8 = n12 - (n9 - n8);
                    System.arraycopy(byArray, n9, byArray3, 0, n8);
                    object.h(byArray3, 0, byArray3, 0);
                    System.arraycopy(byArray3, 0, byArray2, n11, n8);
                    byArray = new byte[this.b];
                    this.a(byArray2, n10, n12, byArray);
                    if (ax.Nd.a.e(this.h, byArray)) {
                        return n12;
                    }
                    throw new k("mac check in CCM failed");
                }
                throw new n("Output buffer too short.");
            }
            throw new k("data too short");
        }
        throw new IllegalStateException("CCM cipher unitialized.");
    }

    public void l() {
        this.a.a();
        this.i.reset();
        this.j.reset();
    }

    private class a
    extends ByteArrayOutputStream {
        final d q;

        public a(d d8) {
            this.q = d8;
        }

        public byte[] a() {
            return this.buf;
        }
    }
}

