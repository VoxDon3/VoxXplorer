/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.JSchProxyException;
import com.jcraft.jsch.Proxy;
import com.jcraft.jsch.SocketFactory;
import com.jcraft.jsch.Util;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ProxySOCKS5
implements Proxy {
    private String a;
    private int b;
    private InputStream c;
    private OutputStream d;
    private Socket e;
    private String f;
    private String g;

    private void e(InputStream inputStream, byte[] byArray, int n8) throws JSchException, IOException {
        int n9;
        for (int i8 = 0; i8 < n8; i8 += n9) {
            n9 = inputStream.read(byArray, i8, n8 - i8);
            if (n9 > 0) {
                continue;
            }
            throw new JSchProxyException("ProxySOCKS5: stream is closed");
        }
    }

    @Override
    public Socket a() {
        return this.e;
    }

    @Override
    public OutputStream b() {
        return this.d;
    }

    @Override
    public InputStream c() {
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() {
        try {
            Closeable closeable = this.c;
            if (closeable != null) {
                ((InputStream)closeable).close();
            }
            if ((closeable = this.d) != null) {
                ((OutputStream)closeable).close();
            }
            if ((closeable = this.e) != null) {
                ((Socket)closeable).close();
            }
        }
        catch (Exception exception) {}
        this.c = null;
        this.d = null;
        this.e = null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void d(SocketFactory var1_1, String var2_5, int var3_8, int var4_9) throws JSchException {
        block24: {
            block23: {
                block28: {
                    block27: {
                        block22: {
                            block26: {
                                if (var1_1 != null) ** GOTO lbl7
                                this.e = var1_1 = Util.i(this.a, this.b, var4_9 /* !! */ );
                                this.c = var1_1.getInputStream();
                                this.d = this.e.getOutputStream();
                                break block26;
lbl7:
                                // 1 sources

                                var6_10 = var1_1.c(this.a, this.b);
                                this.e = var6_10;
                                this.c = var1_1.a((Socket)var6_10);
                                this.d = var1_1.b(this.e);
                            }
                            if (var4_9 /* !! */  > 0) {
                                this.e.setSoTimeout(var4_9 /* !! */ );
                            }
                            this.e.setTcpNoDelay(true);
                            var1_1 = new byte[1024];
                            var1_1[0] = 5;
                            var1_1[1] = 2;
                            var1_1[2] = false;
                            var1_1[3] = 2;
                            this.d.write((byte[])var1_1, 0, 4);
                            this.e(this.c, (byte[])var1_1, 2);
                            var4_9 /* !! */  = var1_1[1] & 255;
                            if (var4_9 /* !! */  == 0) break block27;
                            if (var4_9 /* !! */  != 2) break block22;
                            var6_10 = this.f;
                            if (var6_10 == null || this.g == null) break block22;
                            var1_1[0] = true;
                            var1_1[1] = (byte)var6_10.length();
                            System.arraycopy(Util.v(this.f), 0, var1_1, 2, this.f.length());
                            var5_11 = this.f.length();
                            var4_9 /* !! */  = var5_11 + 3;
                            var1_1[2 + var5_11] = (byte)this.g.length();
                            System.arraycopy(Util.v(this.g), 0, var1_1, var4_9 /* !! */ , this.g.length());
                            var5_11 = this.g.length();
                            this.d.write((byte[])var1_1, 0, var4_9 /* !! */  + var5_11);
                            this.e(this.c, (byte[])var1_1, 2);
                            var4_9 /* !! */  = (int)var1_1[1];
                            if (var4_9 /* !! */  == 0) break block27;
                        }
                        try {
                            this.e.close();
                            break block23;
                        }
                        catch (Exception var1_4) {}
                    }
                    var1_1[0] = 5;
                    var1_1[1] = true;
                    var1_1[2] = false;
                    var2_5 = Util.v((String)var2_5);
                    var4_9 /* !! */  = ((Object)var2_5).length;
                    var1_1[3] = 3;
                    var1_1[4] = (byte)var4_9 /* !! */ ;
                    System.arraycopy(var2_5, 0, var1_1, 5, var4_9 /* !! */ );
                    var1_1[5 + var4_9 /* !! */ ] = (byte)(var3_8 >>> 8);
                    var1_1[var4_9 /* !! */  + 6] = (byte)(var3_8 & 255);
                    this.d.write((byte[])var1_1, 0, var4_9 /* !! */  + 7);
                    this.e(this.c, (byte[])var1_1, 4);
                    if (var1_1[1] != false) break block28;
                    var3_8 = var1_1[3] & 255;
                    if (var3_8 == 1) ** GOTO lbl75
                    if (var3_8 == 3) ** GOTO lbl72
                    if (var3_8 != 4) {
                        return;
                    }
                    this.e(this.c, (byte[])var1_1, 18);
                    return;
lbl72:
                    // 1 sources

                    this.e(this.c, (byte[])var1_1, 1);
                    this.e(this.c, (byte[])var1_1, (var1_1[0] & 255) + 2);
                    return;
lbl75:
                    // 1 sources

                    this.e(this.c, (byte[])var1_1, 6);
                    return;
                }
                try {
                    this.e.close();
                    break block24;
                }
                catch (Exception var2_6) {}
            }
            var1_1 = new JSchProxyException("fail in SOCKS5 proxy");
            throw var1_1;
        }
        try {
            var6_10 = new StringBuilder();
            var6_10.append("ProxySOCKS5: server returns ");
            var6_10.append((int)var1_1[1]);
            var2_5 = new JSchProxyException(var6_10.toString());
            throw var2_5;
        }
        catch (Exception var1_2) {
        }
        catch (RuntimeException var1_3) {
            throw var1_3;
        }
        try {
            var2_5 = this.e;
            if (var2_5 != null) {
                var2_5.close();
            }
        }
        catch (Exception var2_7) {}
        var2_5 = new StringBuilder();
        var2_5.append("ProxySOCKS5: ");
        var2_5.append(var1_2.toString());
        throw new JSchProxyException(var2_5.toString(), var1_2);
    }
}

