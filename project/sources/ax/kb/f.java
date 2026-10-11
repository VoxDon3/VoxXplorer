package ax.kb;

import ax.mb.C2547a;
import ax.pb.C2797c;
import ax.pb.r;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

/* loaded from: classes3.dex */
public abstract class f implements c {
    private static int f = 1;
    protected b b;
    protected int c = 4280;
    protected int d = 4280;
    protected int e = 0;

    public static f e(String str, r rVar) throws UnknownHostException, MalformedURLException, e {
        if (str.startsWith("ncacn_np:")) {
            return new h(str, rVar);
        }
        throw new e("DCERPC transport not supported: " + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected static ax.kb.b f(java.lang.String r13) throws ax.kb.e {
        /*
            char[] r0 = r13.toCharArray()
            r1 = 0
            r2 = 0
            r5 = r1
            r6 = r5
            r7 = r6
            r3 = 0
            r4 = 0
        Lb:
            char r8 = r0[r2]
            r9 = 1
            if (r3 == 0) goto L65
            r10 = 5
            r11 = 2
            if (r3 == r9) goto L42
            if (r3 == r11) goto L48
            if (r3 == r10) goto L1a
            int r2 = r0.length
            goto L71
        L1a:
            r10 = 61
            if (r8 != r10) goto L29
            java.lang.String r4 = r13.substring(r4, r2)
            java.lang.String r7 = r4.trim()
        L26:
            int r4 = r2 + 1
            goto L71
        L29:
            r10 = 44
            if (r8 == r10) goto L31
            r10 = 93
            if (r8 != r10) goto L71
        L31:
            java.lang.String r8 = r13.substring(r4, r2)
            java.lang.String r8 = r8.trim()
            if (r7 != 0) goto L3d
            java.lang.String r7 = "endpoint"
        L3d:
            r6.b(r7, r8)
            r7 = r1
            goto L71
        L42:
            r12 = 92
            if (r8 != r12) goto L47
            goto L26
        L47:
            r3 = 2
        L48:
            r11 = 91
            if (r8 != r11) goto L71
            java.lang.String r3 = r13.substring(r4, r2)
            java.lang.String r3 = r3.trim()
            r3.length()
            ax.kb.b r6 = new ax.kb.b
            java.lang.String r3 = r13.substring(r4, r2)
            r6.<init>(r5, r3)
            int r3 = r2 + 1
            r4 = r3
            r3 = 5
            goto L71
        L65:
            r10 = 58
            if (r8 != r10) goto L71
            java.lang.String r5 = r13.substring(r4, r2)
            int r3 = r2 + 1
            r4 = r3
            r3 = 1
        L71:
            int r2 = r2 + r9
            int r8 = r0.length
            if (r2 < r8) goto Lb
            if (r6 == 0) goto L7c
            java.lang.String r0 = r6.c
            if (r0 == 0) goto L7c
            return r6
        L7c:
            ax.kb.e r0 = new ax.kb.e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid binding URL: "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.kb.f.f(java.lang.String):ax.kb.b");
    }

    public void a() throws e, IOException {
        synchronized (this) {
            try {
                try {
                    this.e = 1;
                    g(new C2418a(this.b, this));
                } catch (IOException e) {
                    this.e = 0;
                    throw e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b() throws IOException;

    protected abstract void c(byte[] bArr, boolean z) throws IOException;

    protected abstract void d(byte[] bArr, int i, int i2, boolean z) throws IOException;

    public void g(g gVar) throws e, IOException {
        if (this.e == 0) {
            a();
        }
        byte[] a = C2797c.a();
        try {
            C2547a c2547a = new C2547a(a, 0);
            gVar.c = 3;
            int i = f;
            f = i + 1;
            gVar.e = i;
            gVar.b(c2547a);
            int o = c2547a.o() - 24;
            boolean z = true;
            int i2 = 0;
            while (i2 < o) {
                int i3 = o - i2;
                int i4 = i3 + 24;
                int i5 = this.c;
                if (i4 > i5) {
                    gVar.c &= -3;
                    i3 = i5 - 24;
                } else {
                    gVar.c |= 2;
                    gVar.f = i3;
                    z = false;
                }
                gVar.d = i3 + 24;
                if (i2 > 0) {
                    gVar.c &= -2;
                }
                if ((gVar.c & 3) != 3) {
                    c2547a.d = i2;
                    c2547a.p();
                    gVar.e(c2547a);
                    c2547a.h(gVar.f);
                    c2547a.j(0);
                    c2547a.j(gVar.g());
                }
                d(a, i2, gVar.d, z);
                i2 += i3;
            }
            c(a, z);
            c2547a.p();
            c2547a.q(8);
            c2547a.r(c2547a.d());
            c2547a.q(0);
            gVar.c(c2547a);
            int i6 = (gVar.b != 2 || gVar.i(2)) ? 24 : gVar.d;
            byte[] bArr = null;
            C2547a c2547a2 = null;
            while (!gVar.i(2)) {
                if (bArr == null) {
                    bArr = new byte[this.d];
                    c2547a2 = new C2547a(bArr, 0);
                }
                c(bArr, z);
                c2547a2.p();
                c2547a2.q(8);
                c2547a2.r(c2547a2.d());
                c2547a2.p();
                gVar.c(c2547a2);
                int i7 = gVar.d - 24;
                int i8 = i6 + i7;
                if (i8 > a.length) {
                    byte[] bArr2 = new byte[i8];
                    System.arraycopy(a, 0, bArr2, 0, i6);
                    a = bArr2;
                }
                System.arraycopy(bArr, 24, a, i6, i7);
                i6 = i8;
            }
            gVar.a(new C2547a(a, 0));
            C2797c.c(a);
            e h = gVar.h();
            if (h != null) {
                throw h;
            }
        } catch (Throwable th) {
            C2797c.c(a);
            throw th;
        }
    }

    public String toString() {
        return this.b.toString();
    }
}
