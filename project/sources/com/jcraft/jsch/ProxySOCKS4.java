package com.jcraft.jsch;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/* loaded from: classes3.dex */
public class ProxySOCKS4 implements Proxy {
    private String a;
    private int b;
    private InputStream c;
    private OutputStream d;
    private Socket e;
    private String f;

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

    @Override // com.jcraft.jsch.Proxy
    public void d(SocketFactory socketFactory, String str, int i, int i2) throws JSchException {
        try {
            if (socketFactory == null) {
                Socket i3 = Util.i(this.a, this.b, i2);
                this.e = i3;
                this.c = i3.getInputStream();
                this.d = this.e.getOutputStream();
            } else {
                Socket c = socketFactory.c(this.a, this.b);
                this.e = c;
                this.c = socketFactory.a(c);
                this.d = socketFactory.b(this.e);
            }
            if (i2 > 0) {
                this.e.setSoTimeout(i2);
            }
            this.e.setTcpNoDelay(true);
            byte[] bArr = new byte[1024];
            int i4 = 4;
            bArr[0] = 4;
            bArr[1] = 1;
            bArr[2] = (byte) (i >>> 8);
            bArr[3] = (byte) (i & 255);
            try {
                byte[] address = InetAddress.getByName(str).getAddress();
                int i5 = 0;
                while (i5 < address.length) {
                    int i6 = i4 + 1;
                    bArr[i4] = address[i5];
                    i5++;
                    i4 = i6;
                }
                String str2 = this.f;
                if (str2 != null) {
                    System.arraycopy(Util.v(str2), 0, bArr, i4, this.f.length());
                    i4 += this.f.length();
                }
                bArr[i4] = 0;
                this.d.write(bArr, 0, i4 + 1);
                int i7 = 0;
                while (i7 < 8) {
                    int read = this.c.read(bArr, i7, 8 - i7);
                    if (read <= 0) {
                        throw new JSchProxyException("ProxySOCKS4: stream is closed");
                    }
                    i7 += read;
                }
                if (bArr[0] != 0) {
                    throw new JSchProxyException("ProxySOCKS4: server returns VN " + ((int) bArr[0]));
                }
                if (bArr[1] == 90) {
                    return;
                }
                try {
                    this.e.close();
                } catch (Exception unused) {
                }
                throw new JSchProxyException("ProxySOCKS4: server returns CD " + ((int) bArr[1]));
            } catch (UnknownHostException e) {
                throw new JSchProxyException("ProxySOCKS4: " + e.toString(), e);
            }
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception e3) {
            try {
                Socket socket = this.e;
                if (socket != null) {
                    socket.close();
                }
            } catch (Exception unused2) {
            }
            throw new JSchProxyException("ProxySOCKS4: " + e3.toString(), e3);
        }
    }
}
