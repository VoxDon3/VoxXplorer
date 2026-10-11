/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Dc.N;
import ax.Dc.W;
import ax.Dc.Z;
import ax.Kc.f;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.zip.ZipException;

public class E
implements N,
Cloneable,
Serializable {
    private static final W e0 = new W(30837);
    private static final W f0 = new W(0);
    private static final BigInteger g0 = BigInteger.valueOf(1000L);
    private BigInteger c0;
    private BigInteger d0;
    private int q = 1;

    public E() {
        this.k();
    }

    private void k() {
        BigInteger bigInteger;
        this.c0 = bigInteger = g0;
        this.d0 = bigInteger;
    }

    static byte[] l(byte[] byArray) {
        int n8;
        if (byArray == null) {
            return byArray;
        }
        int n9 = byArray.length;
        int n10 = 0;
        for (n8 = 0; n8 < n9 && byArray[n8] == 0; ++n8) {
            ++n10;
        }
        n9 = Math.max(1, byArray.length - n10);
        byte[] byArray2 = new byte[n9];
        n8 = n9 - (byArray.length - n10);
        System.arraycopy(byArray, n10, byArray2, n8, n9 - n8);
        return byArray2;
    }

    @Override
    public W b() {
        return e0;
    }

    @Override
    public W c() {
        byte[] byArray = E.l(this.c0.toByteArray());
        int n8 = 0;
        int n9 = byArray == null ? 0 : byArray.length;
        byArray = E.l(this.d0.toByteArray());
        if (byArray != null) {
            n8 = byArray.length;
        }
        return new W(n9 + 3 + n8);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void d(byte[] object, int n8, int n9) throws ZipException {
        this.k();
        if (n9 >= 3) {
            this.q = Z.h(object[n8]);
            int n10 = n8 + 2;
            int n11 = Z.h((byte)object[n8 + 1]);
            if ((n8 = n11 + 3) <= n9) {
                this.c0 = new BigInteger(1, Z.f(Arrays.copyOfRange((byte[])object, n10, n11 += n10)));
                n10 = n11 + 1;
                if (n8 + (n11 = Z.h((byte)object[n11])) <= n9) {
                    this.d0 = new BigInteger(1, Z.f(Arrays.copyOfRange((byte[])object, n10, n11 + n10)));
                    return;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("X7875_NewUnix invalid: gidSize ");
                ((StringBuilder)object).append(n11);
                ((StringBuilder)object).append(" doesn't fit into ");
                ((StringBuilder)object).append(n9);
                ((StringBuilder)object).append(" bytes");
                throw new ZipException(((StringBuilder)object).toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("X7875_NewUnix invalid: uidSize ");
            ((StringBuilder)object).append(n11);
            ((StringBuilder)object).append(" doesn't fit into ");
            ((StringBuilder)object).append(n9);
            ((StringBuilder)object).append(" bytes");
            throw new ZipException(((StringBuilder)object).toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("X7875_NewUnix length is too short, only ");
        ((StringBuilder)object).append(n9);
        ((StringBuilder)object).append(" bytes");
        throw new ZipException(((StringBuilder)object).toString());
    }

    public boolean equals(Object object) {
        if (object instanceof E) {
            object = (E)object;
            if (this.q == ((E)object).q && this.c0.equals(((E)object).c0) && this.d0.equals(((E)object).d0)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public byte[] f() {
        byte[] byArray = this.c0.toByteArray();
        byte[] byArray2 = this.d0.toByteArray();
        int n8 = (byArray = E.l(byArray)) != null ? byArray.length : 0;
        byArray2 = E.l(byArray2);
        int n9 = byArray2 != null ? byArray2.length : 0;
        byte[] byArray3 = new byte[n8 + 3 + n9];
        if (byArray != null) {
            Z.f(byArray);
        }
        if (byArray2 != null) {
            Z.f(byArray2);
        }
        byArray3[0] = Z.l(this.q);
        byArray3[1] = Z.l(n8);
        if (byArray != null) {
            System.arraycopy(byArray, 0, byArray3, 2, n8);
        }
        byArray3[2 + n8] = Z.l(n9);
        if (byArray2 != null) {
            System.arraycopy(byArray2, 0, byArray3, n8 + 3, n9);
        }
        return byArray3;
    }

    @Override
    public byte[] h() {
        return f.a;
    }

    public int hashCode() {
        int n8 = this.q;
        return Integer.rotateLeft(this.c0.hashCode(), 16) ^ n8 * -1234567 ^ this.d0.hashCode();
    }

    @Override
    public W i() {
        return f0;
    }

    @Override
    public void j(byte[] byArray, int n8, int n9) throws ZipException {
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("0x7875 Zip Extra Field: UID=");
        stringBuilder.append(this.c0);
        stringBuilder.append(" GID=");
        stringBuilder.append(this.d0);
        return stringBuilder.toString();
    }
}

