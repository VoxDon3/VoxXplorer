/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.Gb.l;
import ax.xc.C;
import ax.xc.D;
import ax.xc.e;
import ax.xc.n;
import ax.xc.w;
import ax.xc.x;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class m
implements C,
AutoCloseable {
    private final w c0;
    private final Inflater d0;
    private final n e0;
    private final CRC32 f0;
    private byte q;

    public m(C object) {
        w w8;
        l.f(object, "source");
        this.c0 = w8 = new w((C)object);
        this.d0 = object = new Inflater(true);
        this.e0 = new n(w8, (Inflater)object);
        this.f0 = new CRC32();
    }

    private final void a(String string, int n8, int n9) {
        if (n9 == n8) {
            return;
        }
        string = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{string, n9, n8}, 3));
        l.e(string, "format(this, *args)");
        throw new IOException(string);
    }

    private final void b() throws IOException {
        long l8;
        this.c0.P0(10L);
        byte by = this.c0.c0.v(3L);
        boolean bl = (by >> 1 & 1) == 1;
        if (bl) {
            this.d(this.c0.c0, 0L, 10L);
        }
        this.a("ID1ID2", 8075, this.c0.readShort());
        this.c0.skip(8L);
        if ((by >> 2 & 1) == 1) {
            this.c0.P0(2L);
            if (bl) {
                this.d(this.c0.c0, 0L, 2L);
            }
            l8 = this.c0.c0.T0() & 0xFFFF;
            this.c0.P0(l8);
            if (bl) {
                this.d(this.c0.c0, 0L, l8);
            }
            this.c0.skip(l8);
        }
        if ((by >> 3 & 1) == 1) {
            l8 = this.c0.a((byte)0);
            if (l8 != -1L) {
                if (bl) {
                    this.d(this.c0.c0, 0L, l8 + 1L);
                }
                this.c0.skip(l8 + 1L);
            } else {
                throw new EOFException();
            }
        }
        if ((by >> 4 & 1) == 1) {
            l8 = this.c0.a((byte)0);
            if (l8 != -1L) {
                if (bl) {
                    this.d(this.c0.c0, 0L, l8 + 1L);
                }
                this.c0.skip(l8 + 1L);
            } else {
                throw new EOFException();
            }
        }
        if (bl) {
            this.a("FHCRC", this.c0.e(), (short)this.f0.getValue());
            this.f0.reset();
        }
    }

    private final void c() throws IOException {
        this.a("CRC", this.c0.d(), (int)this.f0.getValue());
        this.a("ISIZE", this.c0.d(), (int)this.d0.getBytesWritten());
    }

    private final void d(e object, long l8, long l9) {
        long l10;
        Object object2;
        int n8;
        int n9;
        object = ((e)object).q;
        l.c(object);
        while (true) {
            n9 = ((x)object).c;
            n8 = ((x)object).b;
            object2 = object;
            l10 = l8;
            if (l8 < (long)(n9 - n8)) break;
            l8 -= (long)(n9 - n8);
            object = ((x)object).f;
            l.c(object);
        }
        for (long i8 = l9; i8 > 0L; i8 -= (long)n8) {
            n9 = (int)((long)((x)object2).b + l10);
            n8 = (int)Math.min((long)(((x)object2).c - n9), i8);
            this.f0.update(((x)object2).a, n9, n8);
            object2 = ((x)object2).f;
            l.c(object2);
            l10 = 0L;
        }
    }

    @Override
    public void close() throws IOException {
        this.e0.close();
    }

    @Override
    public long read(e object, long l8) throws IOException {
        l.f(object, "sink");
        long l9 = l8 - 0L;
        long l10 = l9 == 0L ? 0 : (l9 < 0L ? -1 : 1);
        if (l10 >= 0) {
            if (l10 == false) {
                return 0L;
            }
            if (this.q == 0) {
                this.b();
                this.q = 1;
            }
            if (this.q == 1) {
                long l11 = ((e)object).size();
                if ((l8 = this.e0.read((e)object, l8)) != -1L) {
                    this.d((e)object, l11, l8);
                    return l8;
                }
                this.q = (byte)2;
            }
            if (this.q == 2) {
                this.c();
                this.q = (byte)3;
                if (!this.c0.P()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("byteCount < 0: ");
        ((StringBuilder)object).append(l8);
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    @Override
    public D timeout() {
        return this.c0.timeout();
    }
}

