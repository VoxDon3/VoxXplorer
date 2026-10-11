/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.Gb.l;
import ax.xc.A;
import ax.xc.C;
import ax.xc.D;
import ax.xc.b;
import ax.xc.e;
import ax.xc.g;
import ax.xc.h;
import ax.xc.p;
import ax.xc.s;
import ax.xc.u;
import ax.yc.a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class w
implements g,
AutoCloseable {
    public final e c0;
    public boolean d0;
    public final C q;

    public w(C c8) {
        l.f(c8, "source");
        this.q = c8;
        this.c0 = new e();
    }

    @Override
    public h B(long l8) {
        this.P0(l8);
        return this.c0.B(l8);
    }

    @Override
    public long J0(A a8) {
        long l8;
        l.f(a8, "sink");
        long l9 = 0L;
        while (this.q.read(this.c0, 8192L) != -1L) {
            l8 = this.c0.d();
            if (l8 <= 0L) continue;
            l9 += l8;
            a8.write(this.c0, l8);
        }
        l8 = l9;
        if (this.c0.size() > 0L) {
            l8 = l9 + this.c0.size();
            e e8 = this.c0;
            a8.write(e8, e8.size());
        }
        return l8;
    }

    @Override
    public byte[] O() {
        this.c0.M(this.q);
        return this.c0.O();
    }

    @Override
    public int O0(s s8) {
        l.f(s8, "options");
        if (!this.d0) {
            do {
                int n8;
                if ((n8 = a.e(this.c0, s8, true)) == -2) continue;
                if (n8 != -1) {
                    int n9 = s8.n()[n8].G();
                    this.c0.skip(n9);
                    return n8;
                }
                return -1;
            } while (this.q.read(this.c0, 8192L) != -1L);
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public boolean P() {
        if (!this.d0) {
            return this.c0.P() && this.q.read(this.c0, 8192L) == -1L;
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public void P0(long l8) {
        if (this.r0(l8)) {
            return;
        }
        throw new EOFException();
    }

    @Override
    public long S() {
        long l8;
        this.P0(1L);
        long l9 = 0L;
        while (this.r0(l8 = l9 + 1L)) {
            long l10;
            long l11;
            byte by = this.c0.v(l9);
            if (by >= 48 && by <= 57 || (l11 = (l10 = l9 - 0L) == 0L ? 0 : (l10 < 0L ? -1 : 1)) == false && by == 45) {
                l9 = l8;
                continue;
            }
            if (l11 != false) break;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected a digit or '-' but was 0x");
            String string = Integer.toString(by, ax.Ob.a.a(ax.Ob.a.a(16)));
            l.e(string, "toString(this, checkRadix(radix))");
            stringBuilder.append(string);
            throw new NumberFormatException(stringBuilder.toString());
        }
        return this.c0.S();
    }

    @Override
    public void T(e e8, long l8) {
        l.f(e8, "sink");
        try {
            this.P0(l8);
        }
        catch (EOFException eOFException) {
            e8.M(this.c0);
            throw eOFException;
        }
        this.c0.T(e8, l8);
    }

    @Override
    public String U(long l8) {
        if (l8 >= 0L) {
            long l9 = l8 == Long.MAX_VALUE ? Long.MAX_VALUE : l8 + 1L;
            long l10 = this.b((byte)10, 0L, l9);
            if (l10 != -1L) {
                return a.d(this.c0, l10);
            }
            if (l9 < Long.MAX_VALUE && this.r0(l9) && this.c0.v(l9 - 1L) == 13 && this.r0(1L + l9) && this.c0.v(l9) == 10) {
                return a.d(this.c0, l9);
            }
            e e8 = new e();
            Object object = this.c0;
            l9 = ((e)object).size();
            ((e)object).j(e8, 0L, Math.min((long)32, l9));
            object = new StringBuilder();
            ((StringBuilder)object).append("\\n not found: limit=");
            ((StringBuilder)object).append(Math.min(this.c0.size(), l8));
            ((StringBuilder)object).append(" content=");
            ((StringBuilder)object).append(e8.m0().t());
            ((StringBuilder)object).append('\u2026');
            throw new EOFException(((StringBuilder)object).toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("limit < 0: ");
        stringBuilder.append(l8);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    @Override
    public long U0() {
        int n8;
        this.P0(1L);
        int n9 = 0;
        while (this.r0(n8 = n9 + 1)) {
            byte by = this.c0.v(n9);
            if (by >= 48 && by <= 57 || by >= 97 && by <= 102 || by >= 65 && by <= 70) {
                n9 = n8;
                continue;
            }
            if (n9 != 0) break;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(by, ax.Ob.a.a(ax.Ob.a.a(16)));
            l.e(string, "toString(this, checkRadix(radix))");
            stringBuilder.append(string);
            throw new NumberFormatException(stringBuilder.toString());
        }
        return this.c0.U0();
    }

    @Override
    public InputStream V0() {
        return new j.InputStreamRetargetInterface(this){
            final w q;
            {
                this.q = w8;
            }

            @Override
            public int available() {
                w w8 = this.q;
                if (!w8.d0) {
                    return (int)Math.min(w8.c0.size(), (long)Integer.MAX_VALUE);
                }
                throw new IOException("closed");
            }

            @Override
            public void close() {
                this.q.close();
            }

            @Override
            public int read() {
                w w8 = this.q;
                if (!w8.d0) {
                    if (w8.c0.size() == 0L) {
                        w8 = this.q;
                        if (w8.q.read(w8.c0, 8192L) == -1L) {
                            return -1;
                        }
                    }
                    return this.q.c0.readByte() & 0xFF;
                }
                throw new IOException("closed");
            }

            @Override
            public int read(byte[] byArray, int n8, int n9) {
                l.f(byArray, "data");
                if (!this.q.d0) {
                    b.b(byArray.length, n8, n9);
                    if (this.q.c0.size() == 0L) {
                        w w8 = this.q;
                        if (w8.q.read(w8.c0, 8192L) == -1L) {
                            return -1;
                        }
                    }
                    return this.q.c0.D0(byArray, n8, n9);
                }
                throw new IOException("closed");
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.q);
                stringBuilder.append(".inputStream()");
                return stringBuilder.toString();
            }

            @Override
            public /* synthetic */ long transferTo(OutputStream outputStream) {
                return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
            }
        };
    }

    public long a(byte by) {
        return this.b(by, 0L, Long.MAX_VALUE);
    }

    public long b(byte by, long l8, long l9) {
        if (!this.d0) {
            if (0L <= l8 && l8 <= l9) {
                while (l8 < l9) {
                    long l10 = this.c0.F(by, l8, l9);
                    if (l10 != -1L) {
                        return l10;
                    }
                    l10 = this.c0.size();
                    if (l10 >= l9 || this.q.read(this.c0, 8192L) == -1L) break;
                    l8 = Math.max(l8, l10);
                }
                return -1L;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fromIndex=");
            stringBuilder.append(l8);
            stringBuilder.append(" toIndex=");
            stringBuilder.append(l9);
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
        throw new IllegalStateException("closed");
    }

    public boolean c(long l8, h h8, int n8, int n9) {
        l.f(h8, "bytes");
        if (!this.d0) {
            if (l8 >= 0L && n8 >= 0 && n9 >= 0 && h8.G() - n8 >= n9) {
                for (int i8 = 0; i8 < n9; ++i8) {
                    long l9 = (long)i8 + l8;
                    if (!this.r0(1L + l9)) {
                        return false;
                    }
                    if (this.c0.v(l9) == h8.n(n8 + i8)) continue;
                    return false;
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public void close() {
        if (!this.d0) {
            this.d0 = true;
            this.q.close();
            this.c0.b();
        }
    }

    public int d() {
        this.P0(4L);
        return this.c0.M0();
    }

    public short e() {
        this.P0(2L);
        return this.c0.T0();
    }

    @Override
    public String i0(Charset charset) {
        l.f(charset, "charset");
        this.c0.M(this.q);
        return this.c0.i0(charset);
    }

    @Override
    public boolean isOpen() {
        return this.d0 ^ true;
    }

    @Override
    public e k() {
        return this.c0;
    }

    @Override
    public h m0() {
        this.c0.M(this.q);
        return this.c0.m0();
    }

    @Override
    public g peek() {
        return p.d(new u(this));
    }

    @Override
    public boolean r0(long l8) {
        if (l8 >= 0L) {
            if (!this.d0) {
                while (this.c0.size() < l8) {
                    if (this.q.read(this.c0, 8192L) != -1L) continue;
                    return false;
                }
                return true;
            }
            throw new IllegalStateException("closed");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("byteCount < 0: ");
        stringBuilder.append(l8);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    @Override
    public int read(ByteBuffer byteBuffer) {
        l.f(byteBuffer, "sink");
        if (this.c0.size() == 0L && this.q.read(this.c0, 8192L) == -1L) {
            return -1;
        }
        return this.c0.read(byteBuffer);
    }

    @Override
    public long read(e object, long l8) {
        l.f(object, "sink");
        if (l8 >= 0L) {
            if (!this.d0) {
                if (this.c0.size() == 0L && this.q.read(this.c0, 8192L) == -1L) {
                    return -1L;
                }
                l8 = Math.min(l8, this.c0.size());
                return this.c0.read((e)object, l8);
            }
            throw new IllegalStateException("closed");
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("byteCount < 0: ");
        ((StringBuilder)object).append(l8);
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    @Override
    public byte readByte() {
        this.P0(1L);
        return this.c0.readByte();
    }

    @Override
    public void readFully(byte[] byArray) {
        l.f(byArray, "sink");
        try {
            this.P0(byArray.length);
        }
        catch (EOFException eOFException) {
            int n8 = 0;
            while (this.c0.size() > 0L) {
                e e8 = this.c0;
                int n9 = e8.D0(byArray, n8, (int)e8.size());
                if (n9 != -1) {
                    n8 += n9;
                    continue;
                }
                throw new AssertionError();
            }
            throw eOFException;
        }
        this.c0.readFully(byArray);
    }

    @Override
    public int readInt() {
        this.P0(4L);
        return this.c0.readInt();
    }

    @Override
    public long readLong() {
        this.P0(8L);
        return this.c0.readLong();
    }

    @Override
    public short readShort() {
        this.P0(2L);
        return this.c0.readShort();
    }

    @Override
    public void skip(long l8) {
        if (!this.d0) {
            while (l8 > 0L) {
                if (this.c0.size() == 0L && this.q.read(this.c0, 8192L) == -1L) {
                    throw new EOFException();
                }
                long l9 = Math.min(l8, this.c0.size());
                this.c0.skip(l9);
                l8 -= l9;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public D timeout() {
        return this.q.timeout();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("buffer(");
        stringBuilder.append(this.q);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    @Override
    public String v0() {
        return this.U(Long.MAX_VALUE);
    }

    @Override
    public boolean x0(long l8, h h8) {
        l.f(h8, "bytes");
        return this.c(l8, h8, 0, h8.G());
    }

    @Override
    public byte[] y0(long l8) {
        this.P0(l8);
        return this.c0.y0(l8);
    }
}

