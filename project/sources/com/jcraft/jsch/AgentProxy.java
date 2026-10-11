package com.jcraft.jsch;

import java.util.Vector;

/* loaded from: classes3.dex */
class AgentProxy {
    private final Buffer a;
    private AgentConnector b;

    synchronized boolean a(byte[] bArr) {
        int length = bArr.length;
        this.a.A();
        this.a.a(length + 5);
        this.a.v(length + 1);
        this.a.s((byte) 17);
        this.a.t(bArr);
        try {
            this.b.a(this.a);
        } catch (AgentProxyException unused) {
            this.a.B();
            this.a.s((byte) 5);
        }
        return this.a.c() == 6;
    }

    synchronized Vector<Identity> b() {
        Vector<Identity> vector = new Vector<>();
        this.a.A();
        this.a.a(5);
        this.a.v(1);
        this.a.s((byte) 11);
        try {
            this.b.a(this.a);
            if (this.a.c() != 12) {
                return vector;
            }
            int i = this.a.i();
            if (i > 0 && i <= 2048) {
                for (int i2 = 0; i2 < i; i2++) {
                    vector.add(new AgentIdentity(this, this.a.p(), Util.c(this.a.p())));
                }
                return vector;
            }
            return vector;
        } catch (AgentProxyException unused) {
            this.a.B();
            this.a.s((byte) 5);
            return vector;
        }
    }

    synchronized void c() {
        this.a.A();
        this.a.a(5);
        this.a.v(1);
        this.a.s((byte) 19);
        try {
            this.b.a(this.a);
        } catch (AgentProxyException unused) {
            this.a.B();
            this.a.s((byte) 5);
        }
    }

    synchronized boolean d(byte[] bArr) {
        int length = bArr.length;
        this.a.A();
        this.a.a(length + 9);
        this.a.v(length + 5);
        this.a.s((byte) 18);
        this.a.y(bArr);
        try {
            this.b.a(this.a);
        } catch (AgentProxyException unused) {
            this.a.B();
            this.a.s((byte) 5);
        }
        return this.a.c() == 6;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:2|(9:24|25|(1:27)(2:28|(1:30))|5|6|7|8|9|(2:11|12)(3:14|15|16))|4|5|6|7|8|9|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        r3.a.B();
        r3.a.s((byte) 5);
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0063 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066 A[Catch: all -> 0x0018, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0018, blocks: (B:25:0x0004, B:5:0x001b, B:7:0x0046, B:8:0x0059, B:14:0x0066, B:19:0x004e, B:28:0x000e), top: B:24:0x0004, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    synchronized byte[] e(byte[] r4, byte[] r5, java.lang.String r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 4
            if (r6 == 0) goto L1a
            java.lang.String r1 = "rsa-sha2-256"
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto Le
            r6 = 2
            goto L1b
        Le:
            java.lang.String r1 = "rsa-sha2-512"
            boolean r6 = r6.equals(r1)     // Catch: java.lang.Throwable -> L18
            if (r6 == 0) goto L1a
            r6 = 4
            goto L1b
        L18:
            r4 = move-exception
            goto L6e
        L1a:
            r6 = 0
        L1b:
            int r1 = r4.length     // Catch: java.lang.Throwable -> L18
            int r1 = r1 + 17
            int r2 = r5.length     // Catch: java.lang.Throwable -> L18
            int r1 = r1 + r2
            com.jcraft.jsch.Buffer r2 = r3.a     // Catch: java.lang.Throwable -> L18
            r2.A()     // Catch: java.lang.Throwable -> L18
            com.jcraft.jsch.Buffer r2 = r3.a     // Catch: java.lang.Throwable -> L18
            r2.a(r1)     // Catch: java.lang.Throwable -> L18
            com.jcraft.jsch.Buffer r2 = r3.a     // Catch: java.lang.Throwable -> L18
            int r1 = r1 - r0
            r2.v(r1)     // Catch: java.lang.Throwable -> L18
            com.jcraft.jsch.Buffer r0 = r3.a     // Catch: java.lang.Throwable -> L18
            r1 = 13
            r0.s(r1)     // Catch: java.lang.Throwable -> L18
            com.jcraft.jsch.Buffer r0 = r3.a     // Catch: java.lang.Throwable -> L18
            r0.y(r4)     // Catch: java.lang.Throwable -> L18
            com.jcraft.jsch.Buffer r4 = r3.a     // Catch: java.lang.Throwable -> L18
            r4.y(r5)     // Catch: java.lang.Throwable -> L18
            com.jcraft.jsch.Buffer r4 = r3.a     // Catch: java.lang.Throwable -> L18
            r4.v(r6)     // Catch: java.lang.Throwable -> L18
            com.jcraft.jsch.AgentConnector r4 = r3.b     // Catch: java.lang.Throwable -> L18 com.jcraft.jsch.AgentProxyException -> L4e
            com.jcraft.jsch.Buffer r5 = r3.a     // Catch: java.lang.Throwable -> L18 com.jcraft.jsch.AgentProxyException -> L4e
            r4.a(r5)     // Catch: java.lang.Throwable -> L18 com.jcraft.jsch.AgentProxyException -> L4e
            goto L59
        L4e:
            com.jcraft.jsch.Buffer r4 = r3.a     // Catch: java.lang.Throwable -> L18
            r4.B()     // Catch: java.lang.Throwable -> L18
            com.jcraft.jsch.Buffer r4 = r3.a     // Catch: java.lang.Throwable -> L18
            r5 = 5
            r4.s(r5)     // Catch: java.lang.Throwable -> L18
        L59:
            com.jcraft.jsch.Buffer r4 = r3.a     // Catch: java.lang.Throwable -> L18
            int r4 = r4.c()     // Catch: java.lang.Throwable -> L18
            r5 = 14
            if (r4 == r5) goto L66
            monitor-exit(r3)
            r4 = 0
            return r4
        L66:
            com.jcraft.jsch.Buffer r4 = r3.a     // Catch: java.lang.Throwable -> L18
            byte[] r4 = r4.p()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r3)
            return r4
        L6e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L18
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.AgentProxy.e(byte[], byte[], java.lang.String):byte[]");
    }
}
