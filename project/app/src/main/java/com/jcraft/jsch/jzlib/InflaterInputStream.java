/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jzlib;

import com.jcraft.jsch.jzlib.Inflater;
import com.jcraft.jsch.jzlib.ZStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

final class InflaterInputStream
extends FilterInputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    protected byte[] c0;
    private boolean d0;
    protected boolean e0;
    private boolean f0;
    protected boolean g0;
    private byte[] h0;
    private byte[] i0;
    protected final Inflater q;

    protected void a() throws IOException {
        if (!this.d0) {
            int n8;
            InputStream inputStream = this.in;
            Object object = this.c0;
            int n9 = n8 = inputStream.read((byte[])object, 0, ((byte[])object).length);
            if (n8 == -1) {
                object = this.q;
                if (((ZStream)object).k.f == 0 && !((Inflater)object).g()) {
                    this.c0[0] = 0;
                    n9 = 1;
                } else {
                    if (this.q.k.c != -1L) {
                        throw new IOException("footer is not found");
                    }
                    throw new EOFException("Unexpected end of ZLIB input stream");
                }
            }
            this.q.d(this.c0, 0, n9, true);
            return;
        }
        throw new IOException("Stream closed");
    }

    @Override
    public int available() throws IOException {
        if (!this.d0) {
            if (this.e0) {
                return 0;
            }
            return 1;
        }
        throw new IOException("Stream closed");
    }

    @Override
    public void close() throws IOException {
        if (!this.d0) {
            if (this.g0) {
                this.q.f();
            }
            if (this.f0) {
                this.in.close();
            }
            this.d0 = true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void mark(int n8) {
        // MONITORENTER : this
        // MONITOREXIT : this
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    @Override
    public int read() throws IOException {
        if (!this.d0) {
            if (this.read(this.h0, 0, 1) == -1) {
                return -1;
            }
            return this.h0[0] & 0xFF;
        }
        throw new IOException("Stream closed");
    }

    @Override
    public int read(byte[] object, int n8, int n9) throws IOException {
        if (!this.d0) {
            object.getClass();
            if (n8 >= 0 && n9 >= 0 && n9 <= ((byte[])object).length - n8) {
                if (n9 == 0) {
                    return 0;
                }
                if (this.e0) {
                    return -1;
                }
                this.q.e((byte[])object, n8, n9);
                int n10 = 0;
                n9 = n8;
                n8 = n10;
                while (!this.e0) {
                    if (this.q.c == 0) {
                        this.a();
                    }
                    int n11 = this.q.h(0);
                    object = this.q;
                    n10 = object.f;
                    n8 += n10 - n9;
                    if (n11 != -3) {
                        if (n11 == 1 || n11 == 2) {
                            this.e0 = true;
                            if (n11 == 2) {
                                return -1;
                            }
                        }
                        if (object.g == 0) {
                            return n8;
                        }
                        n9 = n10;
                        continue;
                    }
                    throw new IOException(this.q.i);
                }
                return n8;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IOException("Stream closed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void reset() throws IOException {
        synchronized (this) {
            IOException iOException = new IOException("mark/reset not supported");
            throw iOException;
        }
    }

    @Override
    public long skip(long l8) throws IOException {
        if (l8 >= 0L) {
            if (!this.d0) {
                int n8;
                int n9;
                int n10 = (int)Math.min(l8, Integer.MAX_VALUE);
                for (n8 = 0; n8 < n10; n8 += n9) {
                    int n11 = n10 - n8;
                    byte[] byArray = this.i0;
                    n9 = n11;
                    if (n11 > byArray.length) {
                        n9 = byArray.length;
                    }
                    if ((n9 = this.read(byArray, 0, n9)) != -1) continue;
                    this.e0 = true;
                    break;
                }
                return n8;
            }
            throw new IOException("Stream closed");
        }
        throw new IllegalArgumentException("negative skip length");
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

