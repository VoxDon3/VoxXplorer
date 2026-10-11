package ax.pb;

import ax.qb.C2896d;
import ax.qb.C2897e;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: ax.pb.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2819t implements Z {
    static C2897e g0 = C2897e.a();
    private byte[] c0;
    private boolean d0;
    private int e0;
    private int f0;
    private MessageDigest q;

    public C2819t(byte[] bArr, boolean z) throws C2794a0 {
        this.d0 = false;
        try {
            this.q = MessageDigest.getInstance("MD5");
            this.c0 = bArr;
            this.d0 = z;
            this.e0 = 0;
            this.f0 = 0;
            if (C2897e.c0 >= 5) {
                g0.println("macSigningKey:");
                C2896d.a(g0, bArr, 0, bArr.length);
            }
        } catch (NoSuchAlgorithmException e) {
            if (C2897e.c0 > 0) {
                e.printStackTrace(g0);
            }
            throw new C2794a0("MD5", e);
        }
    }

    public byte[] a() {
        byte[] digest = this.q.digest();
        if (C2897e.c0 >= 5) {
            g0.println("digest: ");
            C2896d.a(g0, digest, 0, digest.length);
            g0.flush();
        }
        this.e0 = 0;
        return digest;
    }

    void b(byte[] bArr, int i, int i2, AbstractC2818s abstractC2818s, AbstractC2818s abstractC2818s2) {
        int i3 = this.f0;
        abstractC2818s.u0 = i3;
        if (abstractC2818s2 != null) {
            abstractC2818s2.u0 = i3 + 1;
            abstractC2818s2.v0 = false;
        }
        try {
            try {
                byte[] bArr2 = this.c0;
                c(bArr2, 0, bArr2.length);
                int i4 = i + 14;
                for (int i5 = 0; i5 < 8; i5++) {
                    bArr[i4 + i5] = 0;
                }
                AbstractC2818s.x(this.f0, bArr, i4);
                c(bArr, i, i2);
                System.arraycopy(a(), 0, bArr, i4, 8);
                if (this.d0) {
                    this.d0 = false;
                    System.arraycopy("BSRSPYL ".getBytes(), 0, bArr, i4, 8);
                }
                this.f0 += 2;
            } catch (Exception e) {
                if (C2897e.c0 > 0) {
                    e.printStackTrace(g0);
                }
                this.f0 += 2;
            }
        } catch (Throwable th) {
            this.f0 += 2;
            throw th;
        }
    }

    public void c(byte[] bArr, int i, int i2) {
        if (C2897e.c0 >= 5) {
            g0.println("update: " + this.e0 + " " + i + ":" + i2);
            C2896d.a(g0, bArr, i, Math.min(i2, 256));
            g0.flush();
        }
        if (i2 == 0) {
            return;
        }
        this.q.update(bArr, i, i2);
        this.e0++;
    }

    boolean d(byte[] bArr, int i, AbstractC2818s abstractC2818s) {
        byte[] bArr2 = this.c0;
        c(bArr2, 0, bArr2.length);
        c(bArr, i, 14);
        int i2 = i + 14;
        byte[] bArr3 = new byte[8];
        AbstractC2818s.x(abstractC2818s.u0, bArr3, 0);
        c(bArr3, 0, 8);
        int i3 = i + 22;
        if (abstractC2818s.d0 == 46) {
            L l = (L) abstractC2818s;
            c(bArr, i3, (abstractC2818s.g0 - l.I0) - 22);
            c(l.F0, l.G0, l.I0);
        } else {
            c(bArr, i3, abstractC2818s.g0 - 22);
        }
        byte[] a = a();
        for (int i4 = 0; i4 < 8; i4++) {
            if (a[i4] != bArr[i2 + i4]) {
                if (C2897e.c0 >= 2) {
                    g0.println("signature verification failure");
                    C2896d.a(g0, a, 0, 8);
                    C2896d.a(g0, bArr, i2, 8);
                }
                abstractC2818s.v0 = true;
                return true;
            }
        }
        abstractC2818s.v0 = false;
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LM_COMPATIBILITY=");
        sb.append(Z.G);
        sb.append(" MacSigningKey=");
        byte[] bArr = this.c0;
        sb.append(C2896d.d(bArr, 0, bArr.length));
        return sb.toString();
    }
}
