package com.jcraft.jsch;

import java.util.Enumeration;
import java.util.Hashtable;

/* loaded from: classes3.dex */
class ChannelSession extends Channel {
    private static byte[] G = Util.v("session");
    protected boolean w = false;
    protected boolean x = false;
    protected Hashtable<byte[], byte[]> y = null;
    protected boolean z = false;
    protected String A = "vt100";
    protected int B = 80;
    protected int C = 24;
    protected int D = 640;
    protected int E = 480;
    protected byte[] F = null;

    ChannelSession() {
        this.c = G;
        this.i = new IO();
    }

    private byte[] J(Object obj) {
        return obj instanceof String ? Util.v((String) obj) : (byte[]) obj;
    }

    protected void G() throws Exception {
        Session p = p();
        if (this.w) {
            new RequestAgentForwarding().a(p, this);
        }
        if (this.x) {
            new RequestX11().a(p, this);
        }
        if (this.z) {
            RequestPtyReq requestPtyReq = new RequestPtyReq();
            requestPtyReq.f(this.A);
            requestPtyReq.e(this.B, this.C, this.D, this.E);
            byte[] bArr = this.F;
            if (bArr != null) {
                requestPtyReq.g(bArr);
            }
            requestPtyReq.a(p, this);
        }
        Hashtable<byte[], byte[]> hashtable = this.y;
        if (hashtable != null) {
            Enumeration<byte[]> keys = hashtable.keys();
            while (keys.hasMoreElements()) {
                byte[] nextElement = keys.nextElement();
                byte[] bArr2 = this.y.get(nextElement);
                RequestEnv requestEnv = new RequestEnv();
                requestEnv.e(J(nextElement), J(bArr2));
                requestEnv.a(p, this);
            }
        }
    }

    public void H(boolean z) {
        this.w = z;
    }

    public void I(boolean z) {
        this.z = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0037, code lost:
    
        h();
     */
    @Override // com.jcraft.jsch.Channel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void t() {
        /*
            r8 = this;
            com.jcraft.jsch.Buffer r0 = new com.jcraft.jsch.Buffer
            int r1 = r8.h
            r0.<init>(r1)
            com.jcraft.jsch.Packet r1 = new com.jcraft.jsch.Packet
            r1.<init>(r0)
            com.jcraft.jsch.Session r2 = r8.p()     // Catch: java.lang.Exception -> L3b
        L10:
            boolean r3 = r8.s()     // Catch: java.lang.Exception -> L3b
            if (r3 == 0) goto L59
            java.lang.Thread r3 = r8.j     // Catch: java.lang.Exception -> L3b
            if (r3 == 0) goto L59
            com.jcraft.jsch.IO r3 = r8.i     // Catch: java.lang.Exception -> L3b
            if (r3 == 0) goto L59
            java.io.InputStream r3 = r3.a     // Catch: java.lang.Exception -> L3b
            if (r3 == 0) goto L59
            byte[] r4 = r0.b     // Catch: java.lang.Exception -> L3b
            int r5 = r4.length     // Catch: java.lang.Exception -> L3b
            r6 = 14
            int r5 = r5 - r6
            int r7 = r2.v()     // Catch: java.lang.Exception -> L3b
            int r5 = r5 - r7
            int r3 = r3.read(r4, r6, r5)     // Catch: java.lang.Exception -> L3b
            if (r3 != 0) goto L34
            goto L10
        L34:
            r4 = -1
            if (r3 != r4) goto L3d
            r8.h()     // Catch: java.lang.Exception -> L3b
            goto L59
        L3b:
            goto L59
        L3d:
            boolean r4 = r8.m     // Catch: java.lang.Exception -> L3b
            if (r4 == 0) goto L42
            goto L59
        L42:
            r1.c()     // Catch: java.lang.Exception -> L3b
            r4 = 94
            r0.s(r4)     // Catch: java.lang.Exception -> L3b
            int r4 = r8.b     // Catch: java.lang.Exception -> L3b
            r0.v(r4)     // Catch: java.lang.Exception -> L3b
            r0.v(r3)     // Catch: java.lang.Exception -> L3b
            r0.E(r3)     // Catch: java.lang.Exception -> L3b
            r2.n0(r1, r8, r3)     // Catch: java.lang.Exception -> L3b
            goto L10
        L59:
            java.lang.Thread r0 = r8.j
            if (r0 == 0) goto L66
            monitor-enter(r0)
            r0.notifyAll()     // Catch: java.lang.Throwable -> L63
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
            goto L66
        L63:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
            throw r1
        L66:
            r0 = 0
            r8.j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.ChannelSession.t():void");
    }
}
