package ax.p5;

import ax.n5.C2580b;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h {
    private final C2580b a;
    private final byte[] b;

    public h(C2580b c2580b, byte[] bArr) {
        if (c2580b == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.a = c2580b;
        this.b = bArr;
    }

    public byte[] a() {
        return this.b;
    }

    public C2580b b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.a.equals(hVar.a)) {
            return Arrays.equals(this.b, hVar.b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
