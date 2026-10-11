/*
 * Decompiled with CFR 0.152.
 */
package ax.ce;

import ax.be.L;
import ax.ce.a;
import ax.ce.b;
import ax.ce.d;
import ax.ce.e;
import java.security.NoSuchAlgorithmException;

public abstract class c {
    int a;
    String b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static c b(int n8) throws L {
        if (n8 == 0) {
            return new d();
        }
        if (n8 == 1) {
            return new a();
        }
        if (n8 == 4) {
            return new b();
        }
        if (n8 == 10) {
            try {
                return new e();
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {}
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported Check ID ");
        stringBuilder.append(n8);
        throw new L(stringBuilder.toString());
    }

    public abstract byte[] a();

    public String c() {
        return this.b;
    }

    public int d() {
        return this.a;
    }

    public void e(byte[] byArray) {
        this.f(byArray, 0, byArray.length);
    }

    public abstract void f(byte[] var1, int var2, int var3);
}

