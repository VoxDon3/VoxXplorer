package ax.W4;

import ax.T4.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public class l implements p, Serializable {
    private static final g d0 = g.e();
    protected byte[] c0;
    protected final String q;

    public l(String str) {
        if (str == null) {
            throw new IllegalStateException("Null String illegal for SerializedString");
        }
        this.q = str;
    }

    @Override // ax.T4.p
    public int a(char[] cArr, int i) {
        String str = this.q;
        int length = str.length();
        if (i + length > cArr.length) {
            return -1;
        }
        str.getChars(0, length, cArr, i);
        return length;
    }

    @Override // ax.T4.p
    public int b(byte[] bArr, int i) {
        byte[] bArr2 = this.c0;
        if (bArr2 == null) {
            bArr2 = d0.d(this.q);
            this.c0 = bArr2;
        }
        int length = bArr2.length;
        if (i + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArr2, 0, bArr, i, length);
        return length;
    }

    @Override // ax.T4.p
    public final byte[] c() {
        byte[] bArr = this.c0;
        if (bArr != null) {
            return bArr;
        }
        byte[] d = d0.d(this.q);
        this.c0 = d;
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.q.equals(((l) obj).q);
    }

    @Override // ax.T4.p
    public final String getValue() {
        return this.q;
    }

    public final int hashCode() {
        return this.q.hashCode();
    }

    public final String toString() {
        return this.q;
    }
}
