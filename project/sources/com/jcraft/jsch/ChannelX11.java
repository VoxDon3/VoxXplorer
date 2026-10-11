package com.jcraft.jsch;

import java.io.IOException;
import java.net.Socket;
import java.util.Hashtable;
import okhttp3.internal.http2.Http2;

/* loaded from: classes3.dex */
class ChannelX11 extends Channel {
    private static int A = 6000;
    static byte[] B = null;
    private static Hashtable<Session, byte[]> C = new Hashtable<>();
    private static Hashtable<Session, byte[]> D = new Hashtable<>();
    private static byte[] E = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    private static String z = "127.0.0.1";
    private boolean w = true;
    private Socket x = null;
    private byte[] y = new byte[0];

    ChannelX11() {
        this.d = 131072;
        this.e = 131072;
        this.f = Http2.INITIAL_MAX_FRAME_SIZE;
        this.c = Util.v("x11");
        this.n = true;
    }

    private byte[] G(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.y;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        byte[] bArr4 = this.y;
        if (bArr4.length > 0) {
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
        }
        this.y = bArr3;
        return bArr3;
    }

    private static boolean H(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    static byte[] I(Session session) {
        byte[] bArr;
        int i;
        synchronized (D) {
            try {
                bArr = D.get(session);
                if (bArr == null) {
                    Random random = Session.x0;
                    byte[] bArr2 = new byte[16];
                    synchronized (random) {
                        random.a(bArr2, 0, 16);
                    }
                    C.put(session, bArr2);
                    bArr = new byte[32];
                    for (i = 0; i < 16; i++) {
                        int i2 = i * 2;
                        byte[] bArr3 = E;
                        bArr[i2] = bArr3[(bArr2[i] >>> 4) & 15];
                        bArr[i2 + 1] = bArr3[bArr2[i] & 15];
                    }
                    D.put(session, bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }

    static void J(Session session) {
        synchronized (D) {
            D.remove(session);
            C.remove(session);
        }
    }

    @Override // com.jcraft.jsch.Channel
    void E(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2;
        if (!this.w) {
            this.i.f(bArr, i, i2);
            return;
        }
        try {
            Session p = p();
            byte[] G = G(bArr, i, i2);
            int length = G.length;
            if (length < 9) {
                return;
            }
            int i3 = ((G[6] & 255) * 256) + (G[7] & 255);
            int i4 = ((G[8] & 255) * 256) + (G[9] & 255);
            byte b = G[0];
            if ((b & 255) != 66 && (b & 255) == 108) {
                i3 = ((i3 << 8) & 65280) | ((i3 >>> 8) & 255);
                i4 = ((i4 << 8) & 65280) | ((i4 >>> 8) & 255);
            }
            int i5 = (-i3) & 3;
            if (length < i3 + 12 + i5 + i4) {
                return;
            }
            byte[] bArr3 = new byte[i4];
            int i6 = 12 + i3 + i5;
            System.arraycopy(G, i6, bArr3, 0, i4);
            synchronized (C) {
                bArr2 = C.get(p);
            }
            if (H(bArr3, bArr2)) {
                byte[] bArr4 = B;
                if (bArr4 != null) {
                    System.arraycopy(bArr4, 0, G, i6, i4);
                }
            } else {
                this.j = null;
                h();
                this.i.a();
                f();
            }
            this.w = false;
            this.i.f(G, 0, length);
            this.y = null;
        } catch (JSchException e) {
            throw new IOException(e.toString(), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
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
            r0 = 1
            java.lang.String r1 = com.jcraft.jsch.ChannelX11.z     // Catch: java.lang.Exception -> L85
            int r2 = com.jcraft.jsch.ChannelX11.A     // Catch: java.lang.Exception -> L85
            r3 = 10000(0x2710, float:1.4013E-41)
            java.net.Socket r1 = com.jcraft.jsch.Util.i(r1, r2, r3)     // Catch: java.lang.Exception -> L85
            r8.x = r1     // Catch: java.lang.Exception -> L85
            r1.setTcpNoDelay(r0)     // Catch: java.lang.Exception -> L85
            com.jcraft.jsch.IO r1 = new com.jcraft.jsch.IO     // Catch: java.lang.Exception -> L85
            r1.<init>()     // Catch: java.lang.Exception -> L85
            r8.i = r1     // Catch: java.lang.Exception -> L85
            java.net.Socket r2 = r8.x     // Catch: java.lang.Exception -> L85
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L85
            r1.h(r2)     // Catch: java.lang.Exception -> L85
            com.jcraft.jsch.IO r1 = r8.i     // Catch: java.lang.Exception -> L85
            java.net.Socket r2 = r8.x     // Catch: java.lang.Exception -> L85
            java.io.OutputStream r2 = r2.getOutputStream()     // Catch: java.lang.Exception -> L85
            r1.j(r2)     // Catch: java.lang.Exception -> L85
            r8.v()     // Catch: java.lang.Exception -> L85
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r8.j = r0
            com.jcraft.jsch.Buffer r0 = new com.jcraft.jsch.Buffer
            int r1 = r8.h
            r0.<init>(r1)
            com.jcraft.jsch.Packet r1 = new com.jcraft.jsch.Packet
            r1.<init>(r0)
            com.jcraft.jsch.Session r2 = r8.p()     // Catch: java.lang.Exception -> L81
        L44:
            java.lang.Thread r3 = r8.j     // Catch: java.lang.Exception -> L81
            if (r3 == 0) goto L81
            com.jcraft.jsch.IO r3 = r8.i     // Catch: java.lang.Exception -> L81
            if (r3 == 0) goto L81
            java.io.InputStream r3 = r3.a     // Catch: java.lang.Exception -> L81
            if (r3 == 0) goto L81
            byte[] r4 = r0.b     // Catch: java.lang.Exception -> L81
            int r5 = r4.length     // Catch: java.lang.Exception -> L81
            r6 = 14
            int r5 = r5 - r6
            int r7 = r2.v()     // Catch: java.lang.Exception -> L81
            int r5 = r5 - r7
            int r3 = r3.read(r4, r6, r5)     // Catch: java.lang.Exception -> L81
            if (r3 > 0) goto L65
            r8.h()     // Catch: java.lang.Exception -> L81
            goto L81
        L65:
            boolean r4 = r8.m     // Catch: java.lang.Exception -> L81
            if (r4 == 0) goto L6a
            goto L81
        L6a:
            r1.c()     // Catch: java.lang.Exception -> L81
            r4 = 94
            r0.s(r4)     // Catch: java.lang.Exception -> L81
            int r4 = r8.b     // Catch: java.lang.Exception -> L81
            r0.v(r4)     // Catch: java.lang.Exception -> L81
            r0.v(r3)     // Catch: java.lang.Exception -> L81
            r0.E(r3)     // Catch: java.lang.Exception -> L81
            r2.n0(r1, r8, r3)     // Catch: java.lang.Exception -> L81
            goto L44
        L81:
            r8.f()
            return
        L85:
            r8.w(r0)
            r8.m = r0
            r8.f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.ChannelX11.t():void");
    }
}
