/*
 * Decompiled with CFR 0.152.
 */
package ax.vd;

import ax.vd.a;
import ax.vd.d;
import ax.vd.f;
import ax.vd.k;
import ax.vd.n;
import ax.vd.t;

public class b {
    protected byte[] a;
    protected int b;
    protected boolean c;
    protected a d;
    protected boolean e;
    protected boolean f;

    public b(a a8) {
        this.d = a8;
        this.a = new byte[a8.d()];
        boolean bl = false;
        this.b = 0;
        String string = a8.f();
        int n8 = string.indexOf(47) + 1;
        boolean bl2 = n8 > 0 && string.startsWith("PGP", n8);
        this.f = bl2;
        if (!bl2 && !(a8 instanceof t)) {
            bl2 = bl;
            if (n8 > 0) {
                bl2 = bl;
                if (string.startsWith("OpenPGP", n8)) {
                    bl2 = true;
                }
            }
            this.e = bl2;
            return;
        }
        this.e = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int a(byte[] object, int n8) throws f, IllegalStateException, k {
        Throwable throwable2;
        block6: {
            block4: {
                int n9;
                block5: {
                    try {
                        int n10 = this.b;
                        if (n8 + n10 > ((byte[])object).length) break block4;
                        n9 = 0;
                        if (n10 == 0) break block5;
                        if (!this.e) {
                            object = new f;
                            object("data not block size aligned");
                            throw object;
                        }
                        a a8 = this.d;
                        byte[] byArray = this.a;
                        a8.h(byArray, 0, byArray, 0);
                        n9 = this.b;
                        this.b = 0;
                        System.arraycopy(this.a, 0, object, n8, n9);
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                this.f();
                return n9;
            }
            object = new n;
            object("output buffer too short for doFinal()");
            throw object;
        }
        this.f();
        throw throwable2;
    }

    public int b() {
        return this.d.d();
    }

    /*
     * Enabled aggressive block sorting
     */
    public int c(int n8) {
        int n9 = n8 + this.b;
        if (this.f) {
            if (this.c) {
                n8 = n9 % this.a.length - (this.d.d() + 2);
                return n9 - n8;
            }
            n8 = this.a.length;
        } else {
            n8 = this.a.length;
        }
        n8 = n9 % n8;
        return n9 - n8;
    }

    public void d(boolean bl, d d8) throws IllegalArgumentException {
        this.c = bl;
        this.f();
        this.d.e(bl, d8);
    }

    public int e(byte[] byArray, int n8, int n9, byte[] byArray2, int n10) throws f, IllegalStateException {
        if (n9 >= 0) {
            int n11;
            int n12;
            int n13 = this.b();
            int n14 = this.c(n9);
            if (n14 > 0 && n14 + n10 > byArray2.length) {
                throw new n("output buffer too short");
            }
            byte[] byArray3 = this.a;
            int n15 = byArray3.length;
            n14 = this.b;
            if (n9 > (n15 -= n14)) {
                System.arraycopy(byArray, n8, byArray3, n14, n15);
                n14 = this.d.h(this.a, 0, byArray2, n10);
                this.b = 0;
                n9 -= n15;
                n8 += n15;
                while (true) {
                    n15 = n14;
                    n12 = n8;
                    n11 = n9;
                    if (n9 > this.a.length) {
                        n14 += this.d.h(byArray, n8, byArray2, n10 + n14);
                        n9 -= n13;
                        n8 += n13;
                        continue;
                    }
                    break;
                }
            } else {
                n15 = 0;
                n11 = n9;
                n12 = n8;
            }
            System.arraycopy(byArray, n12, this.a, this.b, n11);
            this.b = n9 = this.b + n11;
            byArray = this.a;
            n8 = n15;
            if (n9 == byArray.length) {
                n8 = n15 + this.d.h(byArray, 0, byArray2, n10 + n15);
                this.b = 0;
            }
            return n8;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }

    public void f() {
        byte[] byArray;
        for (int i8 = 0; i8 < (byArray = this.a).length; ++i8) {
            byArray[i8] = 0;
        }
        this.b = 0;
        this.d.a();
    }
}

