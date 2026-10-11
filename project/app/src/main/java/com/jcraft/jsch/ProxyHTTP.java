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

public class ProxyHTTP
implements Proxy {
    private String a;
    private int b;
    private InputStream c;
    private OutputStream d;
    private Socket e;
    private String f;
    private String g;

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
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void d(SocketFactory var1_1, String var2_4, int var3_7, int var4_8) throws JSchException {
        if (var1_1 != null) ** GOTO lbl7
        try {
            block18: {
                this.e = var1_1 = Util.i(this.a, this.b, var4_8);
                this.c = var1_1.getInputStream();
                this.d = this.e.getOutputStream();
                break block18;
lbl7:
                // 1 sources

                var9_9 = var1_1.c(this.a, this.b);
                this.e = var9_9;
                this.c = var1_1.a((Socket)var9_9);
                this.d = var1_1.b(this.e);
            }
            if (var4_8 > 0) {
                this.e.setSoTimeout(var4_8);
            }
            this.e.setTcpNoDelay(true);
            var1_1 = this.d;
            var9_9 = new StringBuilder();
            var9_9.append("CONNECT ");
            var9_9.append((String)var2_4);
            var9_9.append(":");
            var9_9.append(var3_7);
            var9_9.append(" HTTP/1.0\r\n");
            var1_1.write(Util.v(var9_9.toString()));
            var1_1 = this.f;
            if (var1_1 != null && this.g != null) {
                var1_1 = new StringBuilder();
                var1_1.append(this.f);
                var1_1.append(":");
                var1_1.append(this.g);
                var1_1 = Util.v(var1_1.toString());
                var1_1 = Util.x((byte[])var1_1, 0, ((Object)var1_1).length, true);
                this.d.write(Util.v("Proxy-Authorization: Basic "));
                this.d.write((byte[])var1_1);
                this.d.write(Util.v("\r\n"));
            }
            this.d.write(Util.v("\r\n"));
            this.d.flush();
            var1_1 = new StringBuilder();
            var3_7 = 0;
        }
        catch (Exception var1_2) {}
        try {
            var2_4 = this.e;
            if (var2_4 != null) {
                var2_4.close();
            }
        }
        catch (Exception var2_6) {}
        var2_4 = new StringBuilder();
        var2_4.append("ProxyHTTP: ");
        var2_4.append(var1_2.toString());
        throw new JSchProxyException(var2_4.toString(), var1_2);
        catch (RuntimeException var1_3) {
            throw var1_3;
        }
        while (true) {
            var4_8 = var3_7;
            if (var3_7 < 0) break;
            var3_7 = this.c.read();
            if (var3_7 != 13) {
                var1_1.append((char)var3_7);
                continue;
            }
            var4_8 = var3_7 = this.c.read();
            if (var3_7 == 10) break;
        }
        if (var4_8 < 0) ** GOTO lbl103
        var2_4 = var1_1.toString();
        var1_1 = "Unknow reason";
        var3_7 = var6_10 = -1;
        try {
            var5_11 = var2_4.indexOf(32);
            var8_12 = var5_11 + 1;
            var3_7 = var6_10;
            var4_8 = var5_11;
            var7_13 = var2_4.indexOf(32, var8_12);
            var3_7 = var6_10;
            var4_8 = var5_11;
            var3_7 = var6_10 = Integer.parseInt(var2_4.substring(var8_12, var7_13));
            var4_8 = var5_11;
            var1_1 = var2_4 = var2_4.substring(var7_13 + 1);
            var3_7 = var6_10;
            var4_8 = var5_11;
        }
        catch (Exception var2_5) {
            // empty catch block
        }
        if (var3_7 != 200) ** GOTO lbl-1000
        var3_7 = var4_8;
        ** GOTO lbl105
lbl-1000:
        // 1 sources

        {
            var2_4 = new StringBuilder();
            var2_4.append("proxy error: ");
            var2_4.append((String)var1_1);
            var9_9 = new IOException(var2_4.toString());
            throw var9_9;
lbl103:
            // 1 sources

            var1_1 = new IOException();
            throw var1_1;
lbl105:
            // 1 sources

            do {
                var5_11 = 0;
                while (true) {
                    block17: {
                        var4_8 = var3_7;
                        if (var3_7 < 0) break;
                        {
                            var3_7 = this.c.read();
                            if (var3_7 == 13) break block17;
                            ++var5_11;
                            continue;
                        }
                    }
                    var4_8 = var3_7 = this.c.read();
                    if (var3_7 == 10) break;
                }
                if (var4_8 < 0) {
                    var1_1 = new IOException();
                    throw var1_1;
                }
                var3_7 = var4_8;
            } while (var5_11 != 0);
            return;
        }
    }
}

