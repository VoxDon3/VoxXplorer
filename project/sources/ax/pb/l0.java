package ax.pb;

import ax.qb.C2897e;

/* loaded from: classes3.dex */
class l0 {
    private static int j;
    int a;
    int b;
    String c;
    String d;
    String e;
    i0 f;
    boolean g;
    boolean h;
    int i;

    l0(i0 i0Var, String str, String str2) {
        this.d = "?????";
        this.f = i0Var;
        this.c = str.toUpperCase();
        if (str2 != null && !str2.startsWith("??")) {
            this.d = str2;
        }
        this.e = this.d;
        this.a = 0;
    }

    boolean a(String str, String str2) {
        if (this.c.equalsIgnoreCase(str)) {
            return str2 == null || str2.startsWith("??") || this.d.equalsIgnoreCase(str2);
        }
        return false;
    }

    void b(AbstractC2818s abstractC2818s, AbstractC2818s abstractC2818s2) throws C2794a0 {
        String str;
        byte b;
        synchronized (this.f.h()) {
            if (abstractC2818s2 != null) {
                try {
                    abstractC2818s2.r0 = false;
                } finally {
                }
            }
            c(abstractC2818s, abstractC2818s2);
            if (abstractC2818s != null && (abstractC2818s2 == null || !abstractC2818s2.r0)) {
                if (!this.d.equals("A:") && (b = abstractC2818s.d0) != -94 && b != 4) {
                    if (b == 37 || b == 50) {
                        int i = ((P) abstractC2818s).Y0 & 255;
                        if (i != 0 && i != 16 && i != 35 && i != 38 && i != 104 && i != 215 && i != 83 && i != 84) {
                            throw new C2794a0("Invalid operation for " + this.d + " service");
                        }
                    } else if (b != 113) {
                        switch (b) {
                            case 45:
                            case 46:
                            case 47:
                                break;
                            default:
                                throw new C2794a0("Invalid operation for " + this.d + " service" + abstractC2818s);
                        }
                    }
                }
                abstractC2818s.k0 = this.b;
                if (this.g && !this.d.equals("IPC") && (str = abstractC2818s.x0) != null && str.length() > 0) {
                    abstractC2818s.j0 = 4096;
                    abstractC2818s.x0 = '\\' + this.f.h().E0 + '\\' + this.c + abstractC2818s.x0;
                }
                try {
                    this.f.f(abstractC2818s, abstractC2818s2);
                } catch (C2794a0 e) {
                    if (e.c() == -1073741623) {
                        d(true);
                    }
                    throw e;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002b, code lost:
    
        r7.a = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002d, code lost:
    
        r7.f.h.n();
        r2 = "\\\\" + r7.f.h.E0 + '\\' + r7.c;
        r7.d = r7.e;
        r4 = r7.f.h;
        r4 = ax.pb.k0.F0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if (ax.qb.C2897e.c0 < 4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        ax.pb.k0.H0.println("treeConnect: unc=" + r2 + ",service=" + r7.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        r4 = new ax.pb.T(r9);
        r7.f.f(new ax.pb.S(r7.f, r2, r7.d, r8), r4);
        r7.b = r4.k0;
        r7.d = r4.H0;
        r7.g = r4.G0;
        r8 = ax.pb.l0.j;
        ax.pb.l0.j = r8 + 1;
        r7.i = r8;
        r7.a = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
    
        d(true);
        r7.a = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
    
        throw r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void c(ax.pb.AbstractC2818s r8, ax.pb.AbstractC2818s r9) throws ax.pb.C2794a0 {
        /*
            r7 = this;
            r0 = 1
            ax.pb.i0 r1 = r7.f
            ax.pb.k0 r1 = r1.h()
            monitor-enter(r1)
        L8:
            int r2 = r7.a     // Catch: java.lang.Throwable -> L1b
            r3 = 2
            if (r2 == 0) goto L2b
            if (r2 == r3) goto L29
            r3 = 3
            if (r2 != r3) goto L13
            goto L29
        L13:
            ax.pb.i0 r2 = r7.f     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1e
            ax.pb.k0 r2 = r2.h     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1e
            r2.wait()     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1e
            goto L8
        L1b:
            r8 = move-exception
            goto Lb9
        L1e:
            r8 = move-exception
            ax.pb.a0 r9 = new ax.pb.a0     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r8.getMessage()     // Catch: java.lang.Throwable -> L1b
            r9.<init>(r0, r8)     // Catch: java.lang.Throwable -> L1b
            throw r9     // Catch: java.lang.Throwable -> L1b
        L29:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            return
        L2b:
            r7.a = r0     // Catch: java.lang.Throwable -> L1b
            ax.pb.i0 r2 = r7.f     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            ax.pb.k0 r2 = r2.h     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            r2.n()     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            r2.<init>()     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            java.lang.String r4 = "\\\\"
            r2.append(r4)     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            ax.pb.i0 r4 = r7.f     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            ax.pb.k0 r4 = r4.h     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            java.lang.String r4 = r4.E0     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            r2.append(r4)     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            r4 = 92
            r2.append(r4)     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            java.lang.String r4 = r7.c     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            r2.append(r4)     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            java.lang.String r4 = r7.e     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            r7.d = r4     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            ax.pb.i0 r4 = r7.f     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            ax.pb.k0 r4 = r4.h     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            byte[] r4 = ax.pb.k0.F0     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            int r4 = ax.qb.C2897e.c0     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            r5 = 4
            if (r4 < r5) goto L87
            ax.qb.e r4 = ax.pb.k0.H0     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            r5.<init>()     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            java.lang.String r6 = "treeConnect: unc="
            r5.append(r6)     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            r5.append(r2)     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            java.lang.String r6 = ",service="
            r5.append(r6)     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            java.lang.String r6 = r7.d     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            r5.append(r6)     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            r4.println(r5)     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            goto L87
        L85:
            r8 = move-exception
            goto Lb2
        L87:
            ax.pb.T r4 = new ax.pb.T     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            r4.<init>(r9)     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            ax.pb.S r9 = new ax.pb.S     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            ax.pb.i0 r5 = r7.f     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            java.lang.String r6 = r7.d     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            r9.<init>(r5, r2, r6, r8)     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            ax.pb.i0 r8 = r7.f     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            r8.f(r9, r4)     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            int r8 = r4.k0     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            r7.b = r8     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            java.lang.String r8 = r4.H0     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            r7.d = r8     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            boolean r8 = r4.G0     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            r7.g = r8     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            int r8 = ax.pb.l0.j     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            int r9 = r8 + 1
            ax.pb.l0.j = r9     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            r7.i = r8     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            r7.a = r3     // Catch: java.lang.Throwable -> L1b ax.pb.C2794a0 -> L85
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            return
        Lb2:
            r7.d(r0)     // Catch: java.lang.Throwable -> L1b
            r9 = 0
            r7.a = r9     // Catch: java.lang.Throwable -> L1b
            throw r8     // Catch: java.lang.Throwable -> L1b
        Lb9:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.pb.l0.c(ax.pb.s, ax.pb.s):void");
    }

    void d(boolean z) {
        synchronized (this.f.h()) {
            try {
                if (this.a != 2) {
                    return;
                }
                this.a = 3;
                if (!z && this.b != 0) {
                    try {
                        b(new U(), null);
                    } catch (C2794a0 e) {
                        k0 k0Var = this.f.h;
                        byte[] bArr = k0.F0;
                        if (C2897e.c0 > 1) {
                            e.printStackTrace(k0.H0);
                        }
                    }
                }
                this.g = false;
                this.h = false;
                this.a = 0;
                this.f.h.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return a(l0Var.c, l0Var.d);
    }

    public String toString() {
        return "SmbTree[share=" + this.c + ",service=" + this.d + ",tid=" + this.b + ",inDfs=" + this.g + ",inDomainDfs=" + this.h + ",connectionState=" + this.a + "]";
    }
}
