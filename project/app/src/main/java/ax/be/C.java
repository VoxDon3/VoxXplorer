/*
 * Decompiled with CFR 0.152.
 */
package ax.be;

import ax.be.L;
import ax.be.P;
import ax.be.c;
import ax.be.s;
import ax.be.z;
import ax.ge.f;
import ax.ie.g;
import java.io.IOException;
import java.io.OutputStream;

public class C
extends s {
    private final c c0;
    private f d0;
    private final g e0;
    private ax.he.c f0;
    private final int g0;
    private final boolean h0;
    private final long i0;
    private long j0 = 0L;
    private boolean k0;
    private IOException l0;
    private final byte[] m0;
    private OutputStream q;

    public C(OutputStream outputStream, z z8, boolean bl) throws IOException {
        this(outputStream, z8, bl, c.b());
    }

    public C(OutputStream outputStream, z z8, boolean bl, c c8) throws IOException {
        this(outputStream, z8, false, bl, -1L, c8);
    }

    private C(OutputStream outputStream, z z8, boolean bl, boolean bl2, long l8, c object) throws IOException {
        int n8 = 0;
        this.k0 = false;
        this.l0 = null;
        this.m0 = new byte[1];
        outputStream.getClass();
        if (l8 >= -1L) {
            int n9;
            g g8;
            this.h0 = bl2;
            this.i0 = l8;
            this.c0 = object;
            this.q = outputStream;
            this.e0 = g8 = new g(outputStream);
            int n10 = z8.i();
            this.f0 = object = ax.he.c.n(g8, z8.j(), z8.k(), z8.o(), z8.m(), n10, 0, z8.n(), z8.l(), z8.h(), (c)object);
            this.d0 = ((ax.he.c)object).o();
            object = z8.r();
            if (object != null && ((Object)object).length > 0) {
                if (!bl) {
                    this.d0.u(n10, (byte[])object);
                } else {
                    throw new L("Preset dictionary cannot be used in .lzma files (try a raw LZMA stream instead)");
                }
            }
            this.g0 = n9 = (z8.o() * 5 + z8.k()) * 9 + z8.j();
            if (bl) {
                outputStream.write(n9);
                n9 = 0;
                while (true) {
                    if (n9 >= 4) break;
                    outputStream.write(n10 & 0xFF);
                    n10 >>>= 8;
                    ++n9;
                }
                for (int i8 = n8; i8 < 8; ++i8) {
                    outputStream.write((int)(l8 >>> i8 * 8) & 0xFF);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Invalid expected input size (less than -1)");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a() throws IOException {
        IOException iOException3;
        block6: {
            if (this.k0) {
                return;
            }
            IOException iOException2 = this.l0;
            if (iOException2 != null) {
                throw iOException2;
            }
            try {
                long l8 = this.i0;
                if (l8 != -1L && l8 != this.j0) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Expected uncompressed size (");
                    stringBuilder.append(this.i0);
                    stringBuilder.append(") doesn't equal the number of bytes written to the stream (");
                    stringBuilder.append(this.j0);
                    stringBuilder.append(")");
                    iOException2 = new P(stringBuilder.toString());
                    throw iOException2;
                }
            }
            catch (IOException iOException3) {
                break block6;
            }
            this.d0.s();
            this.f0.d();
            if (this.h0) {
                this.f0.g();
            }
            this.e0.f();
            this.k0 = true;
            this.f0.x(this.c0);
            this.f0 = null;
            this.d0 = null;
            return;
        }
        this.l0 = iOException3;
        throw iOException3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() throws IOException {
        IOException iOException;
        if (this.q != null) {
            block6: {
                try {
                    this.a();
                }
                catch (IOException iOException2) {}
                try {
                    this.q.close();
                }
                catch (IOException iOException3) {
                    if (this.l0 != null) break block6;
                    this.l0 = iOException3;
                }
            }
            this.q = null;
        }
        if ((iOException = this.l0) == null) {
            return;
        }
        throw iOException;
    }

    @Override
    public void flush() throws IOException {
        throw new P("LZMAOutputStream does not support flushing");
    }

    @Override
    public void write(int n8) throws IOException {
        byte[] byArray = this.m0;
        byArray[0] = (byte)n8;
        this.write(byArray, 0, 1);
    }

    @Override
    public void write(byte[] object, int n8, int n9) throws IOException {
        int n10;
        if (n8 >= 0 && n9 >= 0 && (n10 = n8 + n9) >= 0 && n10 <= ((byte[])object).length) {
            IOException iOException = this.l0;
            if (iOException == null) {
                if (!this.k0) {
                    long l8 = this.i0;
                    if (l8 != -1L && l8 - this.j0 < (long)n9) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Expected uncompressed input size (");
                        ((StringBuilder)object).append(this.i0);
                        ((StringBuilder)object).append(" bytes) was exceeded");
                        throw new P(((StringBuilder)object).toString());
                    }
                    this.j0 += (long)n9;
                    while (n9 > 0) {
                        try {
                            n10 = this.d0.b((byte[])object, n8, n9);
                            n8 += n10;
                            n9 -= n10;
                        }
                        catch (IOException iOException2) {
                            this.l0 = iOException2;
                            throw iOException2;
                        }
                        this.f0.d();
                    }
                    return;
                }
                throw new P("Stream finished or closed");
            }
            throw iOException;
        }
        throw new IndexOutOfBoundsException();
    }
}

