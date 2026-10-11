package com.jcraft.jsch.jzlib;

import java.io.FilterOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
final class DeflaterOutputStream extends FilterOutputStream implements AutoCloseable {
    protected byte[] c0;
    private boolean d0;
    private boolean e0;
    private final byte[] f0;
    protected boolean g0;
    private boolean h0;
    protected final Deflater q;

    protected int a(int i) throws IOException {
        Deflater deflater = this.q;
        byte[] bArr = this.c0;
        deflater.e(bArr, 0, bArr.length);
        int f = this.q.f(i);
        if (f == -5 ? !(this.q.c > 0 || i == 4) : f == 0 || f == 1) {
            int i2 = this.q.f;
            if (i2 > 0) {
                ((FilterOutputStream) this).out.write(this.c0, 0, i2);
            }
            return f;
        }
        throw new IOException("failed to deflate: error=" + f + " avail_out=" + this.q.g);
    }

    void b() throws IOException {
        while (!this.q.h()) {
            a(4);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.d0) {
            return;
        }
        b();
        if (this.g0) {
            this.q.g();
        }
        if (this.h0) {
            ((FilterOutputStream) this).out.close();
        }
        this.d0 = true;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        int a;
        if (this.e0 && !this.q.h()) {
            do {
                a = a(2);
                if (this.q.f < this.c0.length) {
                    break;
                }
            } while (a != 1);
        }
        ((FilterOutputStream) this).out.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.f0;
        bArr[0] = (byte) (i & 255);
        write(bArr, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.q.h()) {
            if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
                throw new IndexOutOfBoundsException();
            }
            if (i2 == 0) {
                return;
            }
            int i3 = this.e0 ? 2 : 0;
            this.q.d(bArr, i, i2, true);
            while (this.q.c > 0 && a(i3) != 1) {
            }
            return;
        }
        throw new IOException("finished");
    }
}
