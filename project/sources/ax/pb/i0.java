package ax.pb;

import ax.jb.C2345a;
import ax.jb.C2346b;
import ax.nb.C2644g;
import java.net.InetAddress;
import java.util.Enumeration;
import java.util.Vector;

/* loaded from: classes3.dex */
public final class i0 {
    private static final String l = C2345a.h("jcifs.smb.client.logonShare", null);
    private static final int m = C2345a.d("jcifs.netbios.lookupRespLimit", 3);
    private static final String n = C2345a.h("jcifs.smb.client.domain", null);
    private static final String o = C2345a.h("jcifs.smb.client.username", null);
    private static final int p = C2345a.d("jcifs.netbios.cachePolicy", 600) * 60;
    static C2644g[] q = null;
    int b;
    private C2346b d;
    private int e;
    private int f;
    private InetAddress g;
    r i;
    long j;
    k0 h = null;
    String k = null;
    Vector c = new Vector();
    int a = 0;

    i0(C2346b c2346b, int i, InetAddress inetAddress, int i2, r rVar) {
        this.d = c2346b;
        this.e = i;
        this.g = inetAddress;
        this.f = i2;
        this.i = rVar;
    }

    public static void c(C2346b c2346b, int i, r rVar) throws C2794a0 {
        i0 r = k0.s(c2346b, i).r(rVar);
        String str = l;
        l0 a = r.a(str, null);
        if (str == null) {
            a.c(null, null);
        } else {
            a.b(new m0("\\", "*", 16), new n0());
        }
    }

    public static void d(C2346b c2346b, r rVar) throws C2794a0 {
        c(c2346b, 0, rVar);
    }

    synchronized l0 a(String str, String str2) {
        if (str == null) {
            str = "IPC$";
        }
        try {
            Enumeration elements = this.c.elements();
            while (elements.hasMoreElements()) {
                l0 l0Var = (l0) elements.nextElement();
                if (l0Var.a(str, str2)) {
                    return l0Var;
                }
            }
            l0 l0Var2 = new l0(this, str, str2);
            this.c.addElement(l0Var2);
            return l0Var2;
        } catch (Throwable th) {
            throw th;
        }
    }

    void b(boolean z) {
        synchronized (h()) {
            try {
                if (this.a != 2) {
                    return;
                }
                this.a = 3;
                this.k = null;
                Enumeration elements = this.c.elements();
                while (elements.hasMoreElements()) {
                    ((l0) elements.nextElement()).d(z);
                }
                if (!z && this.h.w0.g != 0) {
                    C2789B c2789b = new C2789B(null);
                    c2789b.m0 = this.b;
                    try {
                        this.h.y(c2789b, null);
                    } catch (C2794a0 unused) {
                    }
                    this.b = 0;
                }
                this.a = 0;
                this.h.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean e(r rVar) {
        r rVar2 = this.i;
        return rVar2 == rVar || rVar2.equals(rVar);
    }

    void f(AbstractC2818s abstractC2818s, AbstractC2818s abstractC2818s2) throws C2794a0 {
        synchronized (h()) {
            if (abstractC2818s2 != null) {
                try {
                    abstractC2818s2.r0 = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.j = System.currentTimeMillis() + Z.T;
            g(abstractC2818s, abstractC2818s2);
            if (abstractC2818s2 == null || !abstractC2818s2.r0) {
                if (abstractC2818s instanceof S) {
                    S s = (S) abstractC2818s;
                    if (this.k != null && s.K0.endsWith("\\IPC$")) {
                        s.K0 = "\\\\" + this.k + "\\IPC$";
                    }
                }
                abstractC2818s.m0 = this.b;
                abstractC2818s.w0 = this.i;
                try {
                    this.h.y(abstractC2818s, abstractC2818s2);
                } catch (C2794a0 e) {
                    if (abstractC2818s instanceof S) {
                        b(true);
                    }
                    abstractC2818s.y0 = null;
                    throw e;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0139, code lost:
    
        throw new ax.pb.C2794a0("Unexpected session setup state: " + r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x013e, code lost:
    
        if (r16.i == ax.pb.r.q0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0148, code lost:
    
        if (r16.h.u(Integer.MIN_VALUE) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x014a, code lost:
    
        r10 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0152, code lost:
    
        r10 = new ax.pb.N(r16, r17, r16.i);
        r13 = new ax.pb.O(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x016a, code lost:
    
        if (r16.h.v(r16.i) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x016c, code lost:
    
        r6 = r16.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0170, code lost:
    
        if (r6.g0 == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0176, code lost:
    
        if (ax.pb.r.p0 == okhttp3.HttpUrl.FRAGMENT_ENCODE_SET) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0178, code lost:
    
        r16.h.r(ax.pb.r.t0).a(ax.pb.i0.l, null).c(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x018d, code lost:
    
        r10.y0 = new ax.pb.C2819t(r6.k(r16.h.w0.p), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x019e, code lost:
    
        r10.w0 = r16.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01a2, code lost:
    
        r16.h.y(r10, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01d3, code lost:
    
        r16.b = r13.m0;
        r4 = r10.y0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01d9, code lost:
    
        if (r4 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01db, code lost:
    
        r16.h.u0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01df, code lost:
    
        r16.a = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01aa, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01f3, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01a8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x003a, code lost:
    
        ax.pb.k0.H0.println("sessionSetup: accountName=" + r16.i.c0 + ",primaryDomain=" + r16.i.q);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0064, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01f4, code lost:
    
        b(r4);
        r16.a = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01f9, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0061, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01fa, code lost:
    
        r16.h.notifyAll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01ff, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x018a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x018b, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002b, code lost:
    
        r4 = true;
        r16.a = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002e, code lost:
    
        r16.h.n();
        r6 = ax.pb.k0.F0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0037, code lost:
    
        r7 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0038, code lost:
    
        if (ax.qb.C2897e.c0 < 4) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        r16.b = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        r6 = 10;
        r9 = r0;
        r0 = null;
        r11 = null;
        r10 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (r10 == r6) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        if (r10 != 20) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        if (r11 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        if ((r16.h.x0 & r7) == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        r11 = new ax.pb.C2817q(r16.i, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
    
        r13 = ax.pb.k0.F0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0092, code lost:
    
        if (ax.qb.C2897e.c0 < r7) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0094, code lost:
    
        ax.pb.k0.H0.println(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009d, code lost:
    
        if (r11.d() == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009f, code lost:
    
        r16.k = r11.a();
        r16.a = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ab, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01e3, code lost:
    
        if (r10 != 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01ec, code lost:
    
        r4 = true;
        r6 = 10;
        r7 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01eb, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ae, code lost:
    
        r9 = r11.c(r9, 0, r9.length);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b3, code lost:
    
        if (r9 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b5, code lost:
    
        r13 = new ax.pb.N(r16, null, r9);
        r9 = new ax.pb.O(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c7, code lost:
    
        if (r16.h.v(r16.i) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c9, code lost:
    
        r14 = r11.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00cd, code lost:
    
        if (r14 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cf, code lost:
    
        r13.y0 = new ax.pb.C2819t(r14, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d6, code lost:
    
        r13.m0 = r16.b;
        r16.b = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00dc, code lost:
    
        r16.h.y(r13, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0104, code lost:
    
        r16.b = r9.m0;
        r12 = r13.y0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010a, code lost:
    
        if (r12 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010c, code lost:
    
        r16.h.u0 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0110, code lost:
    
        r9 = r9.J0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0119, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00e2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00e6, code lost:
    
        r16.h.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x011a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x011b, code lost:
    
        r16.h.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0120, code lost:
    
        r16.b = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0122, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void g(ax.pb.AbstractC2818s r17, ax.pb.AbstractC2818s r18) throws ax.pb.C2794a0 {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.pb.i0.g(ax.pb.s, ax.pb.s):void");
    }

    synchronized k0 h() {
        try {
            if (this.h == null) {
                this.h = k0.t(this.d, this.e, this.g, this.f, null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.h;
    }

    public String toString() {
        return "SmbSession[accountName=" + this.i.c0 + ",primaryDomain=" + this.i.q + ",uid=" + this.b + ",connectionState=" + this.a + "]";
    }
}
