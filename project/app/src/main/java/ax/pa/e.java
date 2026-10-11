/*
 * Decompiled with CFR 0.152.
 */
package ax.pa;

import ax.qa.a;
import ax.s7.c;
import java.io.DataInput;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

class e {
    private final c a;
    private final DataInput b;

    public e(InputStream inputStream) {
        if (inputStream != null) {
            inputStream = new c(inputStream);
            this.a = inputStream;
            this.b = new ax.s7.e(inputStream);
            return;
        }
        throw new IllegalArgumentException("Invalid InputStream: null");
    }

    public void a(a a8) throws IOException {
        if (a8 != ax.qa.a.c0) {
            for (long i8 = ((long)a8.h() + this.a.a() & (long)a8.h()) - this.a.a(); i8 > 0L; --i8) {
                this.c();
            }
        }
    }

    public void b(int n8) throws IOException {
        if (n8 == this.b.skipBytes(n8)) {
            return;
        }
        throw new EOFException();
    }

    public byte c() throws IOException {
        return this.b.readByte();
    }

    public char d() throws IOException {
        return this.b.readChar();
    }

    public void e(byte[] byArray) throws IOException {
        this.b.readFully(byArray);
    }

    public int f() throws IOException {
        return this.b.readInt();
    }

    public short g() throws IOException {
        return this.b.readShort();
    }

    public long h() throws IOException {
        return (long)this.f() & 0xFFFFFFFFL;
    }

    public int i() throws IOException {
        return this.b.readUnsignedShort();
    }
}

