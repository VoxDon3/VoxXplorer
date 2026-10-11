/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Dc.U;
import ax.Dc.W;
import ax.Dc.n;
import java.util.Arrays;
import java.util.zip.ZipException;

public class B
extends n {
    private int e0;
    private n.a f0;
    private int g0;
    private int h0;
    private long i0;
    private n.b j0;
    private int k0;
    private byte[] l0;
    private byte[] m0;
    private byte[] n0;
    private byte[] o0;
    private byte[] p0;
    private byte[] q0;

    public B() {
        super(new W(23));
    }

    private void k(String string, int n8, int n9, int n10) throws ZipException {
        if (n9 + n8 <= n10) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid X0017_StrongEncryptionHeader: ");
        stringBuilder.append(string);
        stringBuilder.append(" ");
        stringBuilder.append(n8);
        stringBuilder.append(" doesn't fit into ");
        stringBuilder.append(n10);
        stringBuilder.append(" bytes of data at position ");
        stringBuilder.append(n9);
        throw new ZipException(stringBuilder.toString());
    }

    @Override
    public void d(byte[] byArray, int n8, int n9) throws ZipException {
        super.d(byArray, n8, n9);
        this.m(byArray, n8, n9);
    }

    @Override
    public void j(byte[] byArray, int n8, int n9) throws ZipException {
        super.j(byArray, n8, n9);
        this.l(byArray, n8, n9);
    }

    public void l(byte[] byArray, int n8, int n9) throws ZipException {
        long l8;
        this.a(12, n9);
        this.e0 = W.h(byArray, n8);
        this.f0 = n.a.d(W.h(byArray, n8 + 2));
        this.g0 = W.h(byArray, n8 + 4);
        this.h0 = W.h(byArray, n8 + 6);
        this.i0 = l8 = U.i(byArray, n8 + 8);
        if (l8 > 0L) {
            this.a(16, n9);
            this.j0 = n.b.d(W.h(byArray, n8 + 12));
            this.k0 = W.h(byArray, n8 + 14);
        }
    }

    public void m(byte[] object, int n8, int n9) throws ZipException {
        long l8;
        this.a(4, n9);
        int n10 = W.h((byte[])object, n8);
        this.k("ivSize", n10, 4, n9);
        int n11 = n8 + 4;
        this.a(n11, n10);
        this.l0 = Arrays.copyOfRange((byte[])object, n11, n10);
        int n12 = n10 + 16;
        this.a(n12, n9);
        n11 = n8 + n10;
        this.e0 = W.h((byte[])object, n11 + 6);
        this.f0 = n.a.d(W.h((byte[])object, n11 + 8));
        this.g0 = W.h((byte[])object, n11 + 10);
        this.h0 = W.h((byte[])object, n11 + 12);
        n8 = W.h((byte[])object, n11 + 14);
        this.k("erdSize", n8, n12, n9);
        int n13 = n11 + 16;
        this.a(n13, n8);
        this.m0 = Arrays.copyOfRange((byte[])object, n13, n8);
        n12 = n10 + 20 + n8;
        this.a(n12, n9);
        this.i0 = l8 = U.i((byte[])object, n13 + n8);
        if (l8 == 0L) {
            this.a(n12 + 2, n9);
            n12 = W.h((byte[])object, n11 + 20 + n8);
            this.k("vSize", n12, n10 + 22 + n8, n9);
            if (n12 >= 4) {
                n8 = n11 + 22 + n8;
                n9 = n12 - 4;
                this.a(n8, n9);
                this.p0 = Arrays.copyOfRange((byte[])object, n8, n9);
                n8 = n8 + n12 - 4;
                this.a(n8, 4);
                this.q0 = Arrays.copyOfRange((byte[])object, n8, 4);
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Invalid X0017_StrongEncryptionHeader: vSize ");
            ((StringBuilder)object).append(n12);
            ((StringBuilder)object).append(" is too small to hold CRC");
            throw new ZipException(((StringBuilder)object).toString());
        }
        this.a(n12 + 6, n9);
        this.j0 = n.b.d(W.h((byte[])object, n11 + 20 + n8));
        n12 = n11 + 22 + n8;
        this.k0 = W.h((byte[])object, n12);
        int n14 = n11 + 24 + n8;
        n13 = W.h((byte[])object, n14);
        int n15 = this.k0;
        if (n13 >= n15) {
            this.n0 = new byte[n15];
            this.o0 = new byte[n13 - n15];
            this.k("resize", n13, n10 + 24 + n8, n9);
            System.arraycopy(object, n14, this.n0, 0, this.k0);
            n15 = this.k0;
            System.arraycopy(object, n14 + n15, this.o0, 0, n13 - n15);
            this.a(n10 + 26 + n8 + n13 + 2, n9);
            n11 = W.h((byte[])object, n11 + 26 + n8 + n13);
            if (n11 >= 4) {
                this.k("vSize", n11, n10 + 22 + n8 + n13, n9);
                n8 = n11 - 4;
                byte[] byArray = new byte[n8];
                this.p0 = byArray;
                this.q0 = new byte[4];
                n9 = n12 + n13;
                System.arraycopy(object, n9, byArray, 0, n8);
                System.arraycopy(object, n9 + n11 - 4, this.q0, 0, 4);
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Invalid X0017_StrongEncryptionHeader: vSize ");
            ((StringBuilder)object).append(n11);
            ((StringBuilder)object).append(" is too small to hold CRC");
            throw new ZipException(((StringBuilder)object).toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Invalid X0017_StrongEncryptionHeader: resize ");
        ((StringBuilder)object).append(n13);
        ((StringBuilder)object).append(" is too small to hold hashSize");
        ((StringBuilder)object).append(this.k0);
        throw new ZipException(((StringBuilder)object).toString());
    }
}

