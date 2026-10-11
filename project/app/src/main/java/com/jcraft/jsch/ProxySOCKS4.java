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
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ProxySOCKS4
implements Proxy {
    private String a;
    private int b;
    private InputStream c;
    private OutputStream d;
    private Socket e;
    private String f;

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
    public void d(SocketFactory var1_1, String var2_4, int var3_8, int var4_9) throws JSchException {
        block20: {
            if (var1_1 != null) ** GOTO lbl7
            this.e = var1_1 = Util.i(this.a, this.b, var4_9);
            this.c = var1_1.getInputStream();
            this.d = this.e.getOutputStream();
            break block20;
lbl7:
            // 1 sources

            var6_10 = var1_1.c(this.a, this.b);
            this.e = var6_10;
            this.c = var1_1.a((Socket)var6_10);
            this.d = var1_1.b(this.e);
        }
        if (var4_9 > 0) {
            this.e.setSoTimeout(var4_9);
        }
        this.e.setTcpNoDelay(true);
        var1_1 = new byte[1024];
        var5_11 = 4;
        var1_1[0] = 4;
        var1_1[1] = true;
        var1_1[2] = (byte)(var3_8 /* !! */  >>> 8);
        var1_1[3] = (byte)(var3_8 /* !! */  & 255);
        try {
            var2_4 = InetAddress.getByName((String)var2_4).getAddress();
            var3_8 /* !! */  = var5_11;
            ** GOTO lbl48
        }
        catch (Exception var1_2) {}
        try {
            var2_4 = this.e;
            if (var2_4 != null) {
                var2_4.close();
            }
        }
        catch (Exception var2_7) {}
        var2_4 = new StringBuilder();
        var2_4.append("ProxySOCKS4: ");
        var2_4.append(var1_2.toString());
        throw new JSchProxyException(var2_4.toString(), var1_2);
        catch (RuntimeException var1_3) {
            throw var1_3;
        }
        catch (UnknownHostException var2_5) {}
        {
            block19: {
                var6_10 = new StringBuilder();
                var6_10.append("ProxySOCKS4: ");
                var6_10.append(var2_5.toString());
                var1_1 = new JSchProxyException(var6_10.toString(), var2_5);
                throw var1_1;
lbl48:
                // 2 sources

                for (var4_9 = 0; var4_9 < ((Object)var2_4).length; ++var4_9, ++var3_8 /* !! */ ) {
                    var1_1[var3_8 /* !! */ ] = var2_4[var4_9];
                }
                {
                    var2_4 = this.f;
                    var4_9 = var3_8 /* !! */ ;
                    if (var2_4 == null) break block19;
                    System.arraycopy(Util.v((String)var2_4), 0, var1_1, var3_8 /* !! */ , this.f.length());
                    var4_9 = var3_8 /* !! */  + this.f.length();
                }
            }
            var1_1[var4_9] = false;
            {
                this.d.write((byte[])var1_1, 0, var4_9 + 1);
                for (var3_8 /* !! */  = 0; var3_8 /* !! */  < 8; var3_8 /* !! */  += var4_9) {
                    var4_9 = this.c.read((byte[])var1_1, var3_8 /* !! */ , 8 - var3_8 /* !! */ );
                    if (var4_9 > 0) continue;
                    var1_1 = new JSchProxyException("ProxySOCKS4: stream is closed");
                    throw var1_1;
                }
            }
            if (var1_1[0] == false) {
                var3_8 /* !! */  = (int)var1_1[1];
                if (var3_8 /* !! */  == 90) {
                    return;
                }
                this.e.close();
            } else {
                var2_4 = new StringBuilder();
                var2_4.append("ProxySOCKS4: server returns VN ");
                var2_4.append((int)var1_1[0]);
                var6_10 = new JSchProxyException(var2_4.toString());
                throw var6_10;
                catch (Exception var2_6) {}
            }
            var2_4 = new StringBuilder();
            var2_4.append("ProxySOCKS4: server returns CD ");
            var2_4.append((int)var1_1[1]);
            var2_4 = var2_4.toString();
            var1_1 = new JSchProxyException((String)var2_4);
            throw var1_1;
        }
    }
}

