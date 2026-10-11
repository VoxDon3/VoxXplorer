/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.L;
import ax.pb.Z;
import ax.pb.a0;
import ax.pb.s;
import ax.qb.d;
import ax.qb.e;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class t
implements Z {
    static e g0 = e.a();
    private byte[] c0;
    private boolean d0;
    private int e0;
    private int f0;
    private MessageDigest q;

    public t(byte[] byArray, boolean bl) throws a0 {
        block3: {
            this.d0 = false;
            try {
                this.q = MessageDigest.getInstance("MD5");
                this.c0 = byArray;
                this.d0 = bl;
                this.e0 = 0;
                this.f0 = 0;
                if (e.c0 < 5) break block3;
                g0.println("macSigningKey:");
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                if (e.c0 > 0) {
                    noSuchAlgorithmException.printStackTrace(g0);
                }
                throw new a0("MD5", (Throwable)noSuchAlgorithmException);
            }
            d.a(g0, byArray, 0, byArray.length);
        }
    }

    public byte[] a() {
        byte[] byArray = this.q.digest();
        if (e.c0 >= 5) {
            g0.println("digest: ");
            d.a(g0, byArray, 0, byArray.length);
            ((OutputStream)g0).flush();
        }
        this.e0 = 0;
        return byArray;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void b(byte[] byArray, int n8, int n9, s object, s s8) {
        Throwable throwable2;
        block9: {
            int n10;
            ((s)object).u0 = n10 = this.f0;
            if (s8 != null) {
                s8.u0 = n10 + 1;
                s8.v0 = false;
            }
            object = this.c0;
            this.c((byte[])object, 0, ((Object)object).length);
            int n11 = n8 + 14;
            for (n10 = 0; n10 < 8; ++n10) {
                byArray[n11 + n10] = 0;
            }
            try {
                s.x(this.f0, byArray, n11);
                this.c(byArray, n8, n9);
                System.arraycopy(this.a(), 0, byArray, n11, 8);
                if (this.d0) {
                    this.d0 = false;
                    System.arraycopy("BSRSPYL ".getBytes(), 0, byArray, n11, 8);
                }
                this.f0 += 2;
                return;
            }
            catch (Throwable throwable2) {
                break block9;
            }
            catch (Exception exception) {}
            {
                if (e.c0 > 0) {
                    exception.printStackTrace(g0);
                }
                this.f0 += 2;
                return;
            }
        }
        this.f0 += 2;
        throw throwable2;
    }

    public void c(byte[] byArray, int n8, int n9) {
        if (e.c0 >= 5) {
            e e8 = g0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("update: ");
            stringBuilder.append(this.e0);
            stringBuilder.append(" ");
            stringBuilder.append(n8);
            stringBuilder.append(":");
            stringBuilder.append(n9);
            e8.println(stringBuilder.toString());
            d.a(g0, byArray, n8, Math.min(n9, 256));
            ((OutputStream)g0).flush();
        }
        if (n9 == 0) {
            return;
        }
        this.q.update(byArray, n8, n9);
        ++this.e0;
    }

    boolean d(byte[] byArray, int n8, s s8) {
        Object object = this.c0;
        this.c((byte[])object, 0, ((byte[])object).length);
        this.c(byArray, n8, 14);
        int n9 = n8 + 14;
        object = new byte[8];
        s.x(s8.u0, object, 0);
        this.c((byte[])object, 0, 8);
        n8 += 22;
        if (s8.d0 == 46) {
            object = (L)s8;
            this.c(byArray, n8, s8.g0 - object.I0 - 22);
            this.c(object.F0, object.G0, object.I0);
        } else {
            this.c(byArray, n8, s8.g0 - 22);
        }
        object = this.a();
        for (n8 = 0; n8 < 8; ++n8) {
            if (object[n8] == byArray[n9 + n8]) continue;
            if (e.c0 >= 2) {
                g0.println("signature verification failure");
                d.a(g0, object, 0, 8);
                d.a(g0, byArray, n9, 8);
            }
            s8.v0 = true;
            return true;
        }
        s8.v0 = false;
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LM_COMPATIBILITY=");
        stringBuilder.append(Z.G);
        stringBuilder.append(" MacSigningKey=");
        byte[] byArray = this.c0;
        stringBuilder.append(d.d(byArray, 0, byArray.length));
        return stringBuilder.toString();
    }
}

