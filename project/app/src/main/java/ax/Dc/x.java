/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Dc.K;
import ax.Dc.N;
import ax.Dc.W;
import java.util.Date;
import java.util.zip.ZipException;

public class x
implements N {
    private static final W e0 = new W(10);
    private static final W f0 = new W(1);
    private static final W g0 = new W(24);
    private K c0;
    private K d0;
    private K q;

    public x() {
        K k8;
        this.q = k8 = K.c0;
        this.c0 = k8;
        this.d0 = k8;
    }

    private void k(byte[] byArray, int n8, int n9) {
        W w8;
        if (n9 >= 26 && g0.equals(w8 = new W(byArray, n8))) {
            this.q = new K(byArray, n8 + 2);
            this.c0 = new K(byArray, n8 + 10);
            this.d0 = new K(byArray, n8 + 18);
        }
    }

    private void l() {
        K k8;
        this.q = k8 = K.c0;
        this.c0 = k8;
        this.d0 = k8;
    }

    private static Date m(K k8) {
        if (k8 != null && !K.c0.equals(k8)) {
            return new Date((k8.d() - 116444736000000000L) / 10000L);
        }
        return null;
    }

    public Date a() {
        return x.m(this.c0);
    }

    @Override
    public W b() {
        return e0;
    }

    @Override
    public W c() {
        return new W(32);
    }

    @Override
    public void d(byte[] byArray, int n8, int n9) throws ZipException {
        n9 += n8;
        n8 += 4;
        while (n8 + 4 <= n9) {
            W w8 = new W(byArray, n8);
            n8 += 2;
            if (w8.equals(f0)) {
                this.k(byArray, n8, n9 - n8);
                return;
            }
            n8 += new W(byArray, n8).d() + 2;
        }
    }

    public Date e() {
        return x.m(this.d0);
    }

    public boolean equals(Object object) {
        if (object instanceof x) {
            object = (x)object;
            K k8 = this.q;
            K k9 = ((x)object).q;
            return (k8 == k9 || k8 != null && k8.equals(k9)) && ((k8 = this.c0) == (k9 = ((x)object).c0) || k8 != null && k8.equals(k9)) && ((k8 = this.d0) == (object = ((x)object).d0) || k8 != null && k8.equals(object));
            {
            }
        }
        return false;
    }

    @Override
    public byte[] f() {
        byte[] byArray = new byte[this.c().d()];
        System.arraycopy(f0.b(), 0, byArray, 4, 2);
        System.arraycopy(g0.b(), 0, byArray, 6, 2);
        System.arraycopy(this.q.a(), 0, byArray, 8, 8);
        System.arraycopy(this.c0.a(), 0, byArray, 16, 8);
        System.arraycopy(this.d0.a(), 0, byArray, 24, 8);
        return byArray;
    }

    public Date g() {
        return x.m(this.q);
    }

    @Override
    public byte[] h() {
        return this.f();
    }

    public int hashCode() {
        K k8 = this.q;
        int n8 = -123;
        if (k8 != null) {
            n8 = 0xFFFFFF85 ^ k8.hashCode();
        }
        k8 = this.c0;
        int n9 = n8;
        if (k8 != null) {
            n9 = n8 ^ Integer.rotateLeft(k8.hashCode(), 11);
        }
        if ((k8 = this.d0) != null) {
            return Integer.rotateLeft(k8.hashCode(), 22) ^ n9;
        }
        return n9;
    }

    @Override
    public W i() {
        return this.c();
    }

    @Override
    public void j(byte[] byArray, int n8, int n9) throws ZipException {
        this.l();
        this.d(byArray, n8, n9);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("0x000A Zip Extra Field:");
        stringBuilder.append(" Modify:[");
        stringBuilder.append(this.g());
        stringBuilder.append("] ");
        stringBuilder.append(" Access:[");
        stringBuilder.append(this.a());
        stringBuilder.append("] ");
        stringBuilder.append(" Create:[");
        stringBuilder.append(this.e());
        stringBuilder.append("] ");
        return stringBuilder.toString();
    }
}

