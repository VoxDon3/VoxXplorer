/*
 * Decompiled with CFR 0.152.
 */
package ax.Ad;

import ax.Dd.l;
import ax.Nd.a;
import ax.vd.d;
import ax.vd.f;

public class c
implements ax.vd.a {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private int d;
    private ax.vd.a e;
    private boolean f;

    public c(ax.vd.a a8) {
        int n8;
        this.e = a8;
        this.d = n8 = a8.d();
        this.a = new byte[n8];
        this.b = new byte[n8];
        this.c = new byte[n8];
    }

    private int b(byte[] byArray, int n8, byte[] byArray2, int n9) throws f, IllegalStateException {
        int n10 = this.d;
        if (n8 + n10 <= byArray.length) {
            byte[] byArray3 = this.c;
            int n11 = 0;
            System.arraycopy(byArray, n8, byArray3, 0, n10);
            n10 = this.e.h(byArray, n8, byArray2, n9);
            for (n8 = n11; n8 < this.d; ++n8) {
                n11 = n9 + n8;
                byArray2[n11] = (byte)(byArray2[n11] ^ this.b[n8]);
            }
            byArray = this.b;
            this.b = this.c;
            this.c = byArray;
            return n10;
        }
        throw new f("input buffer too short");
    }

    private int c(byte[] byArray, int n8, byte[] byArray2, int n9) throws f, IllegalStateException {
        if (this.d + n8 <= byArray.length) {
            for (int i8 = 0; i8 < this.d; ++i8) {
                byte[] byArray3 = this.b;
                byArray3[i8] = (byte)(byArray3[i8] ^ byArray[n8 + i8]);
            }
            n8 = this.e.h(this.b, 0, byArray2, n9);
            byArray = this.b;
            System.arraycopy(byArray2, n9, byArray, 0, byArray.length);
            return n8;
        }
        throw new f("input buffer too short");
    }

    @Override
    public void a() {
        byte[] byArray = this.a;
        System.arraycopy(byArray, 0, this.b, 0, byArray.length);
        ax.Nd.a.g(this.c, (byte)0);
        this.e.a();
    }

    @Override
    public int d() {
        return this.e.d();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public void e(boolean bl, d d8) throws IllegalArgumentException {
        Object var4_6;
        boolean bl2 = this.f;
        this.f = bl;
        if (d8 instanceof l) {
            byte[] byArray = ((l)(d8 = (l)d8)).a();
            if (byArray.length != this.d) throw new IllegalArgumentException("initialisation vector must be the same length as block size");
            System.arraycopy(byArray, 0, this.a, 0, byArray.length);
            this.a();
            if (((l)d8).b() == null) {
                if (bl2 != bl) throw new IllegalArgumentException("cannot change encrypting state without providing key.");
                return;
            }
            ax.vd.a a8 = this.e;
            d8 = ((l)d8).b();
        } else {
            this.a();
            if (d8 == null) {
                if (bl2 != bl) throw new IllegalArgumentException("cannot change encrypting state without providing key.");
                return;
            }
            ax.vd.a a9 = this.e;
        }
        var4_6.e(bl, d8);
    }

    @Override
    public String f() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.e.f());
        stringBuilder.append("/CBC");
        return stringBuilder.toString();
    }

    @Override
    public int h(byte[] byArray, int n8, byte[] byArray2, int n9) throws f, IllegalStateException {
        if (this.f) {
            return this.c(byArray, n8, byArray2, n9);
        }
        return this.b(byArray, n8, byArray2, n9);
    }
}

