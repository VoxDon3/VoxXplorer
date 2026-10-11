/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Packet;
import java.io.IOException;
import java.io.OutputStream;

class Channel$1
extends OutputStream
implements AutoCloseable {
    private Buffer c0;
    private Packet d0;
    private boolean e0;
    byte[] f0;
    final Channel g0;
    final Channel h0;
    private int q;

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a() throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                Object object;
                block7: {
                    try {
                        object = new Buffer(this.h0.h);
                        this.c0 = object;
                        this.d0 = object = new Packet(this.c0);
                        object = this.c0.b;
                        int n8 = ((Object)object).length;
                        int n9 = this.h0.p().v();
                        if (n8 - 14 - n9 <= 0) break block7;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    return;
                }
                this.c0 = null;
                this.d0 = null;
                object = new IOException("failed to initialize the channel.");
                throw object;
                catch (JSchException jSchException) {
                    IOException iOException = new IOException("failed to initialize the channel.", jSchException);
                    throw iOException;
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() throws IOException {
        if (this.d0 == null) {
            try {
                this.a();
            }
            catch (IOException iOException) {
                return;
            }
        }
        if (this.e0) {
            return;
        }
        if (this.q > 0) {
            this.flush();
        }
        this.g0.h();
        this.e0 = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void flush() throws IOException {
        int n8;
        if (this.e0) throw new IOException("Already closed");
        if (this.q == 0) {
            return;
        }
        this.d0.c();
        this.c0.s((byte)94);
        this.c0.v(this.h0.b);
        this.c0.v(this.q);
        this.c0.E(this.q);
        try {
            n8 = this.q;
            this.q = 0;
            Channel channel = this.g0;
            // MONITORENTER : channel
        }
        catch (Exception exception) {
            this.close();
            throw new IOException(((Object)exception).toString(), exception);
        }
        try {
            if (this.g0.m) return;
            this.h0.p().n0(this.d0, this.g0, n8);
            return;
        }
        catch (Throwable throwable) {}
        {
        }
        // MONITOREXIT : channel
        throw throwable;
    }

    @Override
    public void write(int n8) throws IOException {
        byte[] byArray = this.f0;
        byArray[0] = (byte)n8;
        this.write(byArray, 0, 1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void write(byte[] byArray, int n8, int n9) throws IOException {
        if (this.d0 == null) {
            this.a();
        }
        if (this.e0) throw new IOException("Already closed");
        byte[] byArray2 = this.c0.b;
        int n10 = byArray2.length;
        while (n9 > 0) {
            int n11;
            int n12;
            block5: {
                try {
                    n12 = this.h0.p().v();
                    n11 = this.q;
                    n12 = n9 > n10 - (n11 + 14) - n12 ? n10 - (n11 + 14) - n12 : n9;
                    if (n12 > 0) break block5;
                }
                catch (JSchException jSchException) {
                    throw new IOException(((Object)jSchException).toString(), jSchException);
                }
                this.flush();
                continue;
            }
            System.arraycopy(byArray, n8, byArray2, n11 + 14, n12);
            this.q += n12;
            n8 += n12;
            n9 -= n12;
        }
    }
}

