package ax.ce;

import ax.be.L;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes3.dex */
public abstract class c {
    int a;
    String b;

    public static c b(int i) throws L {
        if (i == 0) {
            return new d();
        }
        if (i == 1) {
            return new a();
        }
        if (i == 4) {
            return new b();
        }
        if (i == 10) {
            try {
                return new e();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        throw new L("Unsupported Check ID " + i);
    }

    public abstract byte[] a();

    public String c() {
        return this.b;
    }

    public int d() {
        return this.a;
    }

    public void e(byte[] bArr) {
        f(bArr, 0, bArr.length);
    }

    public abstract void f(byte[] bArr, int i, int i2);
}
