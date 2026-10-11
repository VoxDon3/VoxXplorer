package com.jcraft.jsch.jzlib;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
final class InflaterInputStream extends FilterInputStream implements InputStreamRetargetInterface, AutoCloseable {
    protected byte[] c0;
    private boolean d0;
    protected boolean e0;
    private boolean f0;
    protected boolean g0;
    private byte[] h0;
    private byte[] i0;
    protected final Inflater q;

    protected void a() throws IOException {
        if (this.d0) {
            throw new IOException("Stream closed");
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        byte[] bArr = this.c0;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            Inflater inflater = this.q;
            if (inflater.k.f != 0 || inflater.g()) {
                if (this.q.k.c == -1) {
                    throw new EOFException("Unexpected end of ZLIB input stream");
                }
                throw new IOException("footer is not found");
            }
            this.c0[0] = 0;
            read = 1;
        }
        this.q.d(this.c0, 0, read, true);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        if (this.d0) {
            throw new IOException("Stream closed");
        }
        return this.e0 ? 0 : 1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.d0) {
            return;
        }
        if (this.g0) {
            this.q.f();
        }
        if (this.f0) {
            ((FilterInputStream) this).in.close();
        }
        this.d0 = true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.d0) {
            throw new IOException("Stream closed");
        }
        if (read(this.h0, 0, 1) == -1) {
            return -1;
        }
        return this.h0[0] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        throw new IOException("mark/reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("negative skip length");
        }
        if (this.d0) {
            throw new IOException("Stream closed");
        }
        int min = (int) Math.min(j, 2147483647L);
        int i = 0;
        while (true) {
            if (i >= min) {
                break;
            }
            int i2 = min - i;
            byte[] bArr = this.i0;
            if (i2 > bArr.length) {
                i2 = bArr.length;
            }
            int read = read(bArr, 0, i2);
            if (read == -1) {
                this.e0 = true;
                break;
            }
            i += read;
        }
        return i;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.d0) {
            bArr.getClass();
            if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                throw new IndexOutOfBoundsException();
            }
            if (i2 == 0) {
                return 0;
            }
            if (this.e0) {
                return -1;
            }
            this.q.e(bArr, i, i2);
            int i3 = 0;
            while (!this.e0) {
                if (this.q.c == 0) {
                    a();
                }
                int h = this.q.h(0);
                Inflater inflater = this.q;
                int i4 = inflater.f;
                i3 += i4 - i;
                if (h != -3) {
                    if (h == 1 || h == 2) {
                        this.e0 = true;
                        if (h == 2) {
                            return -1;
                        }
                    }
                    if (inflater.g == 0) {
                        return i3;
                    }
                    i = i4;
                } else {
                    throw new IOException(this.q.i);
                }
            }
            return i3;
        }
        throw new IOException("Stream closed");
    }
}
