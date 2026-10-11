/*
 * Decompiled with CFR 0.152.
 */
package ax.be;

import ax.be.L;
import ax.be.P;
import ax.be.c;
import ax.be.i;
import ax.ge.e;
import ax.he.b;
import ax.ie.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class B
extends InputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    private c c0;
    private e d0;
    private d e0;
    private b f0;
    private boolean g0 = false;
    private boolean h0 = false;
    private final byte[] i0 = new byte[1];
    private long j0;
    private IOException k0 = null;
    private InputStream q;

    public B(InputStream inputStream, long l8, byte by, int n8) throws IOException {
        this.d(inputStream, l8, by, n8, null, c.b());
    }

    private static int a(int n8) {
        if (n8 >= 0 && n8 <= 0x7FFFFFF0) {
            int n9 = n8;
            if (n8 < 4096) {
                n9 = 4096;
            }
            return n9 + 15 & 0xFFFFFFF0;
        }
        throw new IllegalArgumentException("LZMA dictionary is too big for this implementation");
    }

    public static int b(int n8, byte by) throws L, i {
        if (n8 >= 0 && n8 <= 0x7FFFFFF0) {
            if ((by = (byte)(by & 0xFF)) <= 224) {
                by = (byte)(by % 45);
                int n9 = by / 9;
                return B.c(n8, by - n9 * 9, n9);
            }
            throw new i("Invalid LZMA properties byte");
        }
        throw new L("LZMA dictionary is too big for this implementation");
    }

    public static int c(int n8, int n9, int n10) {
        if (n9 >= 0 && n9 <= 8 && n10 >= 0 && n10 <= 4) {
            return B.a(n8) / 1024 + 10 + (1536 << n9 + n10) / 1024;
        }
        throw new IllegalArgumentException("Invalid lc or lp");
    }

    private void d(InputStream inputStream, long l8, byte by, int n8, byte[] byArray, c c8) throws IOException {
        if (l8 >= -1L) {
            int n9 = by & 0xFF;
            if (n9 <= 224) {
                by = (byte)(n9 / 45);
                int n10 = n9 - by * 45;
                n9 = n10 / 9;
                if (n8 >= 0 && n8 <= 0x7FFFFFF0) {
                    this.e(inputStream, l8, n10 - n9 * 9, n9, by, n8, byArray, c8);
                    return;
                }
                throw new L("LZMA dictionary is too big for this implementation");
            }
            throw new i("Invalid LZMA properties byte");
        }
        throw new L("Uncompressed size is too big");
    }

    private void e(InputStream object, long l8, int n8, int n9, int n10, int n11, byte[] byArray, c c8) throws IOException {
        if (l8 >= -1L && n8 >= 0 && n8 <= 8 && n9 >= 0 && n9 <= 4 && n10 >= 0 && n10 <= 4) {
            int n12;
            this.q = object;
            this.c0 = c8;
            n11 = n12 = B.a(n11);
            if (l8 >= 0L) {
                n11 = n12;
                if ((long)n12 > l8) {
                    n11 = B.a((int)l8);
                }
            }
            this.d0 = new e(B.a(n11), byArray, c8);
            this.e0 = object = new d((InputStream)object);
            this.f0 = new b(this.d0, (ax.ie.b)object, n8, n9, n10);
            this.j0 = l8;
            return;
        }
        throw new IllegalArgumentException();
    }

    private void f() {
        e e8 = this.d0;
        if (e8 != null) {
            e8.g(this.c0);
            this.d0 = null;
        }
    }

    @Override
    public void close() throws IOException {
        if (this.q != null) {
            this.f();
            try {
                this.q.close();
                return;
            }
            finally {
                this.q = null;
            }
        }
    }

    @Override
    public int read() throws IOException {
        if (this.read(this.i0, 0, 1) == -1) {
            return -1;
        }
        return this.i0[0] & 0xFF;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int read(byte[] object, int n8, int n9) throws IOException {
        IOException iOException3;
        block11: {
            int n10;
            if (n8 < 0) throw new IndexOutOfBoundsException();
            if (n9 < 0) throw new IndexOutOfBoundsException();
            int n11 = n8 + n9;
            if (n11 < 0) throw new IndexOutOfBoundsException();
            if (n11 > ((byte[])object).length) throw new IndexOutOfBoundsException();
            n11 = 0;
            if (n9 == 0) {
                return 0;
            }
            if (this.q == null) throw new P("Stream closed");
            IOException iOException2 = this.k0;
            if (iOException2 != null) throw iOException2;
            boolean bl = this.g0;
            int n12 = -1;
            if (bl) {
                return -1;
            }
            do {
                block10: {
                    if (n9 <= 0) return n11;
                    try {
                        long l8 = this.j0;
                        n10 = l8 >= 0L && l8 < (long)n9 ? (int)l8 : n9;
                        this.d0.l(n10);
                        try {
                            this.f0.e();
                        }
                        catch (i i8) {
                            if (this.j0 != -1L) throw i8;
                            if (!this.f0.h()) throw i8;
                            this.g0 = true;
                            this.e0.f();
                        }
                        int n13 = this.d0.b((byte[])object, n8);
                        n8 += n13;
                        n9 -= n13;
                        n10 = n11 + n13;
                        l8 = this.j0;
                        if (l8 < 0L) break block10;
                        this.j0 = l8 -= (long)n13;
                        if (l8 != 0L) break block10;
                        this.g0 = true;
                    }
                    catch (IOException iOException3) {
                        break block11;
                    }
                }
                n11 = n10;
            } while (!this.g0);
            if (!this.d0.e() && (this.h0 || this.e0.g())) {
                this.f();
                if (n10 != 0) return n10;
                return n12;
            }
            object = new i;
            object();
            throw object;
        }
        this.k0 = iOException3;
        throw iOException3;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

