package ax.Q8;

import ax.Z8.a;
import ax.h9.C2171b;

/* loaded from: classes3.dex */
public class i {
    private byte[] a;
    private byte[] b;

    public i(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public static i a(C2171b c2171b) throws a.b {
        return new i(c2171b.G(8), c2171b.G(8));
    }

    public void b(C2171b c2171b) {
        c2171b.o(this.a);
        c2171b.o(this.b);
    }

    public String toString() {
        return "SMB2FileId{persistentHandle=" + ax.Y8.a.a(this.a) + '}';
    }
}
