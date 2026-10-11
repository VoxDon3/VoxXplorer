/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.SftpException;
import com.jcraft.jsch.SftpProgressMonitor;
import java.io.IOException;
import java.io.OutputStream;

class ChannelSftp$1
extends OutputStream
implements AutoCloseable {
    private boolean c0;
    private int[] d0;
    private int e0;
    private int f0;
    private int g0;
    private int h0;
    private ChannelSftp.Header i0;
    byte[] j0;
    final byte[] k0;
    final long[] l0;
    final SftpProgressMonitor m0;
    final ChannelSftp n0;
    private boolean q;

    @Override
    public void close() throws IOException {
        IOException iOException2;
        block5: {
            if (this.c0) {
                return;
            }
            this.flush();
            SftpProgressMonitor sftpProgressMonitor = this.m0;
            if (sftpProgressMonitor != null) {
                sftpProgressMonitor.a();
            }
            try {
                ChannelSftp.a0(this.n0, this.k0, this.i0);
                this.c0 = true;
                return;
            }
            catch (Exception exception) {
            }
            catch (IOException iOException2) {
                break block5;
            }
            throw new IOException(((Object)exception).toString(), exception);
        }
        throw iOException2;
    }

    @Override
    public void flush() throws IOException {
        if (!this.c0) {
            if (!this.q) {
                try {
                    while (this.h0 > this.g0 && ChannelSftp.Z(this.n0, null, this.i0)) {
                        ++this.g0;
                    }
                }
                catch (SftpException sftpException) {
                    throw new IOException(sftpException.toString(), sftpException);
                }
            }
            return;
        }
        throw new IOException("stream already closed");
    }

    @Override
    public void write(int n8) throws IOException {
        byte[] byArray = this.j0;
        byArray[0] = (byte)n8;
        this.write(byArray, 0, 1);
    }

    @Override
    public void write(byte[] byArray) throws IOException {
        this.write(byArray, 0, byArray.length);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void write(byte[] object, int n8, int n9) throws IOException {
        if (this.q) {
            this.e0 = ChannelSftp.R(this.n0);
            this.f0 = ChannelSftp.R(this.n0);
            this.q = false;
        }
        if (this.c0) throw new IOException("stream already closed");
        int n10 = n8;
        n8 = n9;
        while (n8 > 0) {
            block10: {
                if (ChannelSftp.S(this.n0) && this.n0.g < (long)(this.k0.length + 21 + n8 + 4)) {
                    this.flush();
                }
                int n11 = ChannelSftp.X(this.n0, this.k0, this.l0[0], (byte[])object, n10, n8);
                ++this.h0;
                long[] lArray = this.l0;
                lArray[0] = lArray[0] + (long)n11;
                n10 += n11;
                n8 -= n11;
                try {
                    if (ChannelSftp.R(this.n0) - 1 != this.e0 && ChannelSftp.Y(this.n0).available() < 1024) continue;
                    while (ChannelSftp.Y(this.n0).available() > 0 && ChannelSftp.Z(this.n0, this.d0, this.i0)) {
                        this.f0 = n11 = this.d0[0];
                        if (this.e0 <= n11 && n11 <= ChannelSftp.R(this.n0) - 1) {
                            ++this.g0;
                            continue;
                        }
                        break block10;
                    }
                    continue;
                }
                catch (Exception exception) {
                    throw new IOException(((Object)exception).toString(), exception);
                }
                catch (IOException iOException) {
                    throw iOException;
                }
            }
            object = new SftpException(4, "");
            throw object;
        }
        object = this.m0;
        if (object == null) return;
        if (object.b(n9)) {
            return;
        }
        this.close();
        object = new IOException("canceled");
        throw object;
    }
}

