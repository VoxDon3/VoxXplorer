/*
 * Decompiled with CFR 0.152.
 */
package ax.Ad;

import ax.Dd.l;
import ax.Nd.a;
import ax.vd.d;
import ax.vd.n;
import ax.vd.s;
import ax.vd.t;

public class f
extends s
implements t {
    private final ax.vd.a b;
    private final int c;
    private byte[] d;
    private byte[] e;
    private byte[] f;
    private int g;

    public f(ax.vd.a a8) {
        super(a8);
        int n8;
        this.b = a8;
        this.c = n8 = a8.d();
        this.d = new byte[n8];
        this.e = new byte[n8];
        this.f = new byte[n8];
        this.g = 0;
    }

    private void b() {
        byte[] byArray;
        int n8;
        int n9 = this.e.length;
        while ((n8 = n9 - 1) >= 0) {
            byte by;
            byArray = this.e;
            byArray[n8] = by = (byte)(byArray[n8] + 1);
            n9 = n8;
            if (by == 0) continue;
        }
        if (n8 < (byArray = this.d).length && byArray.length < this.c) {
            throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
        }
    }

    @Override
    public void a() {
        a.g(this.e, (byte)0);
        byte[] byArray = this.d;
        System.arraycopy(byArray, 0, this.e, 0, byArray.length);
        this.b.a();
        this.g = 0;
    }

    @Override
    public int d() {
        return this.b.d();
    }

    @Override
    public void e(boolean bl, d object) throws IllegalArgumentException {
        if (object instanceof l) {
            l l8 = (l)object;
            object = a.d(l8.a());
            this.d = (byte[])object;
            int n8 = this.c;
            if (n8 >= ((Object)object).length) {
                int n9 = n8 / 2;
                int n10 = 8;
                if (8 > n9) {
                    n10 = n8 / 2;
                }
                if (n8 - ((Object)object).length <= n10) {
                    if (l8.b() != null) {
                        this.b.e(true, l8.b());
                    }
                    this.a();
                    return;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("CTR/SIC mode requires IV of at least: ");
                ((StringBuilder)object).append(this.c - n10);
                ((StringBuilder)object).append(" bytes.");
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("CTR/SIC mode requires IV no greater than: ");
            ((StringBuilder)object).append(this.c);
            ((StringBuilder)object).append(" bytes.");
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        throw new IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
    }

    @Override
    public String f() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b.f());
        stringBuilder.append("/SIC");
        return stringBuilder.toString();
    }

    @Override
    public int g(byte[] byArray, int n8, int n9, byte[] byArray2, int n10) throws ax.vd.f {
        if (n8 + n9 <= byArray.length) {
            if (n10 + n9 <= byArray2.length) {
                for (int i8 = 0; i8 < n9; ++i8) {
                    byte by;
                    byte[] byArray3;
                    byte by2;
                    int n11 = this.g;
                    if (n11 == 0) {
                        this.b.h(this.e, 0, this.f, 0);
                        by2 = byArray[n8 + i8];
                        byArray3 = this.f;
                        n11 = this.g;
                        this.g = n11 + 1;
                        by = (byte)(by2 ^ byArray3[n11]);
                    } else {
                        byte by3;
                        int n12;
                        by2 = byArray[n8 + i8];
                        byArray3 = this.f;
                        this.g = n12 = n11 + 1;
                        by = by3 = (byte)(byArray3[n11] ^ by2);
                        if (n12 == this.e.length) {
                            this.g = 0;
                            this.b();
                            by = by3;
                        }
                    }
                    byArray2[n10 + i8] = by;
                }
                return n9;
            }
            throw new n("output buffer too short");
        }
        throw new ax.vd.f("input buffer too small");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int h(byte[] byArray, int n8, byte[] byArray2, int n9) throws ax.vd.f, IllegalStateException {
        if (this.g != 0) {
            this.g(byArray, n8, this.c, byArray2, n9);
            return this.c;
        }
        int n10 = this.c;
        if (n8 + n10 > byArray.length) throw new ax.vd.f("input buffer too small");
        if (n9 + n10 > byArray2.length) throw new n("output buffer too short");
        ax.vd.a a8 = this.b;
        byte[] byArray3 = this.e;
        byte[] byArray4 = this.f;
        a8.h(byArray3, 0, byArray4, 0);
        for (n10 = 0; n10 < this.c; ++n10) {
            byArray2[n9 + n10] = (byte)(byArray[n8 + n10] ^ this.f[n10]);
        }
        this.b();
        return this.c;
    }
}

