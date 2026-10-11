package ax.pa;

import ax.qa.EnumC2891a;
import ax.s7.C3056c;
import ax.s7.C3058e;
import java.io.DataInput;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
class e {
    private final C3056c a;
    private final DataInput b;

    public e(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Invalid InputStream: null");
        }
        C3056c c3056c = new C3056c(inputStream);
        this.a = c3056c;
        this.b = new C3058e(c3056c);
    }

    public void a(EnumC2891a enumC2891a) throws IOException {
        if (enumC2891a == EnumC2891a.ONE) {
            return;
        }
        long h = ((enumC2891a.h() + this.a.a()) & (~enumC2891a.h())) - this.a.a();
        while (true) {
            long j = h - 1;
            if (h <= 0) {
                return;
            }
            c();
            h = j;
        }
    }

    public void b(int i) throws IOException {
        if (i != this.b.skipBytes(i)) {
            throw new EOFException();
        }
    }

    public byte c() throws IOException {
        return this.b.readByte();
    }

    public char d() throws IOException {
        return this.b.readChar();
    }

    public void e(byte[] bArr) throws IOException {
        this.b.readFully(bArr);
    }

    public int f() throws IOException {
        return this.b.readInt();
    }

    public short g() throws IOException {
        return this.b.readShort();
    }

    public long h() throws IOException {
        return f() & 4294967295L;
    }

    public int i() throws IOException {
        return this.b.readUnsignedShort();
    }
}
