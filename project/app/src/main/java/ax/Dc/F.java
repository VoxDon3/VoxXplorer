/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Dc.K;
import ax.Dc.N;
import ax.Dc.U;
import ax.Dc.W;
import ax.Kc.f;
import java.io.Serializable;
import java.util.zip.ZipException;

public class F
implements N {
    static final W g0 = new W(1);
    private K c0;
    private K d0;
    private U e0;
    private byte[] f0;
    private K q;

    private int a(byte[] byArray) {
        int n8;
        K k8 = this.q;
        if (k8 != null) {
            System.arraycopy(k8.a(), 0, byArray, 0, 8);
            n8 = 8;
        } else {
            n8 = 0;
        }
        k8 = this.c0;
        int n9 = n8;
        if (k8 != null) {
            System.arraycopy(k8.a(), 0, byArray, n8, 8);
            n9 = n8 + 8;
        }
        return n9;
    }

    @Override
    public W b() {
        return g0;
    }

    @Override
    public W c() {
        int n8 = this.q != null ? 16 : 0;
        return new W(n8);
    }

    @Override
    public void d(byte[] byArray, int n8, int n9) throws ZipException {
        block6: {
            block5: {
                if (n9 == 0) break block5;
                if (n9 < 16) break block6;
                this.q = new K(byArray, n8);
                this.c0 = new K(byArray, n8 + 8);
                int n10 = n8 + 16;
                int n11 = n9 - 16;
                int n12 = n10;
                int n13 = n11;
                if (n11 >= 8) {
                    this.d0 = new K(byArray, n10);
                    n12 = n8 + 24;
                    n13 = n9 - 24;
                }
                if (n13 >= 4) {
                    this.e0 = new U(byArray, n12);
                }
            }
            return;
        }
        throw new ZipException("Zip64 extended information must contain both size values in the local file header.");
    }

    public K e() {
        return this.c0;
    }

    @Override
    public byte[] f() {
        Object object = this.q;
        if (object == null && this.c0 == null) {
            return f.a;
        }
        if (object != null && this.c0 != null) {
            object = new byte[16];
            this.a((byte[])object);
            return object;
        }
        throw new IllegalArgumentException("Zip64 extended information must contain both size values in the local file header.");
    }

    public U g() {
        return this.e0;
    }

    @Override
    public byte[] h() {
        byte[] byArray = new byte[this.i().d()];
        int n8 = this.a(byArray);
        Serializable serializable = this.d0;
        int n9 = n8;
        if (serializable != null) {
            System.arraycopy(((K)serializable).a(), 0, byArray, n8, 8);
            n9 = n8 + 8;
        }
        if ((serializable = this.e0) != null) {
            System.arraycopy(((U)serializable).b(), 0, byArray, n9, 4);
        }
        return byArray;
    }

    @Override
    public W i() {
        K k8 = this.q;
        int n8 = 8;
        int n9 = 0;
        int n10 = k8 != null ? 8 : 0;
        int n11 = this.c0 != null ? 8 : 0;
        if (this.d0 == null) {
            n8 = 0;
        }
        if (this.e0 != null) {
            n9 = 4;
        }
        return new W(n10 + n11 + n8 + n9);
    }

    @Override
    public void j(byte[] byArray, int n8, int n9) throws ZipException {
        byte[] byArray2 = new byte[n9];
        this.f0 = byArray2;
        System.arraycopy(byArray, n8, byArray2, 0, n9);
        if (n9 >= 28) {
            this.d(byArray, n8, n9);
            return;
        }
        if (n9 == 24) {
            this.q = new K(byArray, n8);
            this.c0 = new K(byArray, n8 + 8);
            this.d0 = new K(byArray, n8 + 16);
            return;
        }
        if (n9 % 8 == 4) {
            this.e0 = new U(byArray, n8 + n9 - 4);
        }
    }

    public K k() {
        return this.d0;
    }

    public K l() {
        return this.q;
    }

    public void m(boolean bl, boolean bl2, boolean bl3, boolean bl4) throws ZipException {
        Object object = this.f0;
        if (object != null) {
            int n8;
            int n9;
            int n10 = 0;
            int n11 = bl ? 8 : 0;
            int n12 = bl2 ? 8 : 0;
            if (((byte[])object).length >= (n11 = n11 + n12 + (n9 = bl3 ? 8 : 0) + (n8 = bl4 ? 4 : 0))) {
                n12 = n10;
                if (bl) {
                    this.q = new K(this.f0, 0);
                    n12 = 8;
                }
                n11 = n12;
                if (bl2) {
                    this.c0 = new K(this.f0, n12);
                    n11 = n12 + 8;
                }
                n12 = n11;
                if (bl3) {
                    this.d0 = new K(this.f0, n11);
                    n12 = n11 + 8;
                }
                if (bl4) {
                    this.e0 = new U(this.f0, n12);
                    return;
                }
            } else {
                object = new StringBuilder();
                object.append("Central directory zip64 extended information extra field's length doesn't match central directory data.  Expected length ");
                object.append(n11);
                object.append(" but is ");
                object.append(this.f0.length);
                throw new ZipException(object.toString());
            }
        }
    }

    public void n(K k8) {
        this.c0 = k8;
    }

    public void o(U u8) {
        this.e0 = u8;
    }

    public void p(K k8) {
        this.d0 = k8;
    }

    public void q(K k8) {
        this.q = k8;
    }
}

