package ax.Dc;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.zip.ZipException;

/* loaded from: classes3.dex */
public class E implements N, Cloneable, Serializable {
    private static final W e0 = new W(30837);
    private static final W f0 = new W(0);
    private static final BigInteger g0 = BigInteger.valueOf(1000);
    private BigInteger c0;
    private BigInteger d0;
    private int q = 1;

    public E() {
        k();
    }

    private void k() {
        BigInteger bigInteger = g0;
        this.c0 = bigInteger;
        this.d0 = bigInteger;
    }

    static byte[] l(byte[] bArr) {
        if (bArr == null) {
            return bArr;
        }
        int length = bArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length && bArr[i2] == 0; i2++) {
            i++;
        }
        int max = Math.max(1, bArr.length - i);
        byte[] bArr2 = new byte[max];
        int length2 = max - (bArr.length - i);
        System.arraycopy(bArr, i, bArr2, length2, max - length2);
        return bArr2;
    }

    @Override // ax.Dc.N
    public W b() {
        return e0;
    }

    @Override // ax.Dc.N
    public W c() {
        byte[] l = l(this.c0.toByteArray());
        int length = l == null ? 0 : l.length;
        byte[] l2 = l(this.d0.toByteArray());
        return new W(length + 3 + (l2 != null ? l2.length : 0));
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // ax.Dc.N
    public void d(byte[] bArr, int i, int i2) throws ZipException {
        k();
        if (i2 < 3) {
            throw new ZipException("X7875_NewUnix length is too short, only " + i2 + " bytes");
        }
        int i3 = i + 1;
        this.q = Z.h(bArr[i]);
        int i4 = i + 2;
        int h = Z.h(bArr[i3]);
        int i5 = h + 3;
        if (i5 > i2) {
            throw new ZipException("X7875_NewUnix invalid: uidSize " + h + " doesn't fit into " + i2 + " bytes");
        }
        int i6 = h + i4;
        this.c0 = new BigInteger(1, Z.f(Arrays.copyOfRange(bArr, i4, i6)));
        int i7 = i6 + 1;
        int h2 = Z.h(bArr[i6]);
        if (i5 + h2 <= i2) {
            this.d0 = new BigInteger(1, Z.f(Arrays.copyOfRange(bArr, i7, h2 + i7)));
            return;
        }
        throw new ZipException("X7875_NewUnix invalid: gidSize " + h2 + " doesn't fit into " + i2 + " bytes");
    }

    public boolean equals(Object obj) {
        if (obj instanceof E) {
            E e = (E) obj;
            if (this.q == e.q && this.c0.equals(e.c0) && this.d0.equals(e.d0)) {
                return true;
            }
        }
        return false;
    }

    @Override // ax.Dc.N
    public byte[] f() {
        byte[] byteArray = this.c0.toByteArray();
        byte[] byteArray2 = this.d0.toByteArray();
        byte[] l = l(byteArray);
        int length = l != null ? l.length : 0;
        byte[] l2 = l(byteArray2);
        int length2 = l2 != null ? l2.length : 0;
        byte[] bArr = new byte[length + 3 + length2];
        if (l != null) {
            Z.f(l);
        }
        if (l2 != null) {
            Z.f(l2);
        }
        bArr[0] = Z.l(this.q);
        bArr[1] = Z.l(length);
        if (l != null) {
            System.arraycopy(l, 0, bArr, 2, length);
        }
        int i = 2 + length;
        int i2 = length + 3;
        bArr[i] = Z.l(length2);
        if (l2 != null) {
            System.arraycopy(l2, 0, bArr, i2, length2);
        }
        return bArr;
    }

    @Override // ax.Dc.N
    public byte[] h() {
        return ax.Kc.f.a;
    }

    public int hashCode() {
        return (Integer.rotateLeft(this.c0.hashCode(), 16) ^ (this.q * (-1234567))) ^ this.d0.hashCode();
    }

    @Override // ax.Dc.N
    public W i() {
        return f0;
    }

    public String toString() {
        return "0x7875 Zip Extra Field: UID=" + this.c0 + " GID=" + this.d0;
    }

    @Override // ax.Dc.N
    public void j(byte[] bArr, int i, int i2) throws ZipException {
    }
}
