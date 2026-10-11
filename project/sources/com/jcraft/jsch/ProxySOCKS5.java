package com.jcraft.jsch;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* loaded from: classes3.dex */
public class ProxySOCKS5 implements Proxy {
    private String a;
    private int b;
    private InputStream c;
    private OutputStream d;
    private Socket e;
    private String f;
    private String g;

    private void e(InputStream inputStream, byte[] bArr, int i) throws JSchException, IOException {
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read <= 0) {
                throw new JSchProxyException("ProxySOCKS5: stream is closed");
            }
            i2 += read;
        }
    }

    @Override // com.jcraft.jsch.Proxy
    public Socket a() {
        return this.e;
    }

    @Override // com.jcraft.jsch.Proxy
    public OutputStream b() {
        return this.d;
    }

    @Override // com.jcraft.jsch.Proxy
    public InputStream c() {
        return this.c;
    }

    @Override // com.jcraft.jsch.Proxy
    public void close() {
        try {
            InputStream inputStream = this.c;
            if (inputStream != null) {
                inputStream.close();
            }
            OutputStream outputStream = this.d;
            if (outputStream != null) {
                outputStream.close();
            }
            Socket socket = this.e;
            if (socket != null) {
                socket.close();
            }
        } catch (Exception unused) {
        }
        this.c = null;
        this.d = null;
        this.e = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00bd, code lost:
    
        if (r9[1] == 0) goto L24;
     */
    @Override // com.jcraft.jsch.Proxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(com.jcraft.jsch.SocketFactory r9, java.lang.String r10, int r11, int r12) throws com.jcraft.jsch.JSchException {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.ProxySOCKS5.d(com.jcraft.jsch.SocketFactory, java.lang.String, int, int):void");
    }
}
