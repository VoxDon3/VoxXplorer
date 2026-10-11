/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jzlib;

import com.jcraft.jsch.jzlib.Deflater;
import java.io.FilterOutputStream;
import java.io.IOException;

final class DeflaterOutputStream
extends FilterOutputStream
implements AutoCloseable {
    protected byte[] c0;
    private boolean d0;
    private boolean e0;
    private final byte[] f0;
    protected boolean g0;
    private boolean h0;
    protected final Deflater q;

    protected int a(int n8) throws IOException {
        Deflater deflater = this.q;
        Object object = this.c0;
        deflater.e((byte[])object, 0, ((byte[])object).length);
        int n9 = this.q.f(n8);
        if (n9 != -5 ? n9 == 0 || n9 == 1 : this.q.c <= 0 && n8 != 4) {
            n8 = this.q.f;
            if (n8 > 0) {
                this.out.write(this.c0, 0, n8);
            }
            return n9;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("failed to deflate: error=");
        ((StringBuilder)object).append(n9);
        ((StringBuilder)object).append(" avail_out=");
        ((StringBuilder)object).append(this.q.g);
        throw new IOException(((StringBuilder)object).toString());
    }

    void b() throws IOException {
        while (!this.q.h()) {
            this.a(4);
        }
    }

    @Override
    public void close() throws IOException {
        if (!this.d0) {
            this.b();
            if (this.g0) {
                this.q.g();
            }
            if (this.h0) {
                this.out.close();
            }
            this.d0 = true;
        }
    }

    @Override
    public void flush() throws IOException {
        if (this.e0 && !this.q.h()) {
            int n8;
            do {
                n8 = this.a(2);
            } while (this.q.f >= this.c0.length && n8 != 1);
        }
        this.out.flush();
    }

    @Override
    public void write(int n8) throws IOException {
        byte[] byArray = this.f0;
        byArray[0] = (byte)(n8 & 0xFF);
        this.write(byArray, 0, 1);
    }

    @Override
    public void write(byte[] byArray, int n8, int n9) throws IOException {
        if (!this.q.h()) {
            if (n8 >= 0 && n9 >= 0 && n8 + n9 <= byArray.length) {
                if (n9 != 0) {
                    int n10 = this.e0 ? 2 : 0;
                    this.q.d(byArray, n8, n9, true);
                    while (this.q.c > 0 && this.a(n10) != 1) {
                    }
                }
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IOException("finished");
    }
}

