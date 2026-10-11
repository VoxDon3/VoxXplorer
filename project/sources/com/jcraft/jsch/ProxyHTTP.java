package com.jcraft.jsch;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* loaded from: classes3.dex */
public class ProxyHTTP implements Proxy {
    private String a;
    private int b;
    private InputStream c;
    private OutputStream d;
    private Socket e;
    private String f;
    private String g;

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
        int i3;
        try {
            if (socketFactory == null) {
                Socket i4 = Util.i(this.a, this.b, i2);
                this.e = i4;
                this.c = i4.getInputStream();
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
            this.d.write(Util.v("CONNECT " + str + ":" + i + " HTTP/1.0\r\n"));
            if (this.f != null && this.g != null) {
                byte[] v = Util.v(this.f + ":" + this.g);
                byte[] x = Util.x(v, 0, v.length, true);
                this.d.write(Util.v("Proxy-Authorization: Basic "));
                this.d.write(x);
                this.d.write(Util.v("\r\n"));
            }
            this.d.write(Util.v("\r\n"));
            this.d.flush();
            StringBuilder sb = new StringBuilder();
            int i5 = 0;
            while (i5 >= 0) {
                i5 = this.c.read();
                if (i5 == 13) {
                    i5 = this.c.read();
                    if (i5 == 10) {
                        break;
                    }
                } else {
                    sb.append((char) i5);
                }
            }
            if (i5 < 0) {
                throw new IOException();
            }
            String sb2 = sb.toString();
            String str2 = "Unknow reason";
            int i6 = -1;
            try {
                i5 = sb2.indexOf(32);
                int i7 = i5 + 1;
                int indexOf = sb2.indexOf(32, i7);
                i6 = Integer.parseInt(sb2.substring(i7, indexOf));
                str2 = sb2.substring(indexOf + 1);
            } catch (Exception unused) {
            }
            if (i6 != 200) {
                throw new IOException("proxy error: " + str2);
            }
            do {
                i3 = 0;
                while (i5 >= 0) {
                    i5 = this.c.read();
                    if (i5 == 13) {
                        i5 = this.c.read();
                        if (i5 == 10) {
                            break;
                        }
                    } else {
                        i3++;
                    }
                }
                if (i5 < 0) {
                    throw new IOException();
                }
            } while (i3 != 0);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            try {
                Socket socket = this.e;
                if (socket != null) {
                    socket.close();
                }
            } catch (Exception unused2) {
            }
            throw new JSchProxyException("ProxyHTTP: " + e2.toString(), e2);
        }
    }
}
