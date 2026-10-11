package ax.xc;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes3.dex */
public final class m implements C, AutoCloseable {
    private final w c0;
    private final Inflater d0;
    private final n e0;
    private final CRC32 f0;
    private byte q;

    public m(C c) {
        ax.Gb.l.f(c, "source");
        w wVar = new w(c);
        this.c0 = wVar;
        Inflater inflater = new Inflater(true);
        this.d0 = inflater;
        this.e0 = new n((g) wVar, inflater);
        this.f0 = new CRC32();
    }

    private final void a(String str, int i, int i2) {
        if (i2 == i) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
        ax.Gb.l.e(format, "format(this, *args)");
        throw new IOException(format);
    }

    private final void b() throws IOException {
        this.c0.P0(10L);
        byte v = this.c0.c0.v(3L);
        boolean z = ((v >> 1) & 1) == 1;
        if (z) {
            d(this.c0.c0, 0L, 10L);
        }
        a("ID1ID2", 8075, this.c0.readShort());
        this.c0.skip(8L);
        if (((v >> 2) & 1) == 1) {
            this.c0.P0(2L);
            if (z) {
                d(this.c0.c0, 0L, 2L);
            }
            long T0 = this.c0.c0.T0() & 65535;
            this.c0.P0(T0);
            if (z) {
                d(this.c0.c0, 0L, T0);
            }
            this.c0.skip(T0);
        }
        if (((v >> 3) & 1) == 1) {
            long a = this.c0.a((byte) 0);
            if (a == -1) {
                throw new EOFException();
            }
            if (z) {
                d(this.c0.c0, 0L, a + 1);
            }
            this.c0.skip(a + 1);
        }
        if (((v >> 4) & 1) == 1) {
            long a2 = this.c0.a((byte) 0);
            if (a2 == -1) {
                throw new EOFException();
            }
            if (z) {
                d(this.c0.c0, 0L, a2 + 1);
            }
            this.c0.skip(a2 + 1);
        }
        if (z) {
            a("FHCRC", this.c0.e(), (short) this.f0.getValue());
            this.f0.reset();
        }
    }

    private final void c() throws IOException {
        a("CRC", this.c0.d(), (int) this.f0.getValue());
        a("ISIZE", this.c0.d(), (int) this.d0.getBytesWritten());
    }

    private final void d(C3487e c3487e, long j, long j2) {
        x xVar = c3487e.q;
        ax.Gb.l.c(xVar);
        while (true) {
            int i = xVar.c;
            int i2 = xVar.b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            xVar = xVar.f;
            ax.Gb.l.c(xVar);
        }
        while (j2 > 0) {
            int min = (int) Math.min(xVar.c - r7, j2);
            this.f0.update(xVar.a, (int) (xVar.b + j), min);
            j2 -= min;
            xVar = xVar.f;
            ax.Gb.l.c(xVar);
            j = 0;
        }
    }

    @Override // ax.xc.C, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.e0.close();
    }

    @Override // ax.xc.C
    public long read(C3487e c3487e, long j) throws IOException {
        m mVar;
        ax.Gb.l.f(c3487e, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (j == 0) {
            return 0L;
        }
        if (this.q == 0) {
            b();
            this.q = (byte) 1;
        }
        if (this.q == 1) {
            long size = c3487e.size();
            long read = this.e0.read(c3487e, j);
            if (read != -1) {
                d(c3487e, size, read);
                return read;
            }
            mVar = this;
            mVar.q = (byte) 2;
        } else {
            mVar = this;
        }
        if (mVar.q == 2) {
            c();
            mVar.q = (byte) 3;
            if (!mVar.c0.P()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // ax.xc.C
    public D timeout() {
        return this.c0.timeout();
    }
}
