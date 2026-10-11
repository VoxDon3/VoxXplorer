/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Dc.c;
import ax.Dc.d;
import ax.Dc.f;
import ax.Kc.i;
import ax.Kc.j;
import ax.Kc.o;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class g
extends InputStream
implements o,
j.InputStreamRetargetInterface,
AutoCloseable {
    private d c0;
    private final int d0;
    private final int e0;
    private final int f0;
    private c g0;
    private c h0;
    private c i0;
    private final f j0 = new f(32768);
    private long k0;
    private long l0;
    private final InputStream q;

    public g(int n8, int n9, InputStream inputStream) {
        if (n8 != 4096 && n8 != 8192) {
            throw new IllegalArgumentException("The dictionary size must be 4096 or 8192");
        }
        if (n9 != 2 && n9 != 3) {
            throw new IllegalArgumentException("The number of trees must be 2 or 3");
        }
        this.d0 = n8;
        this.e0 = n9;
        this.f0 = n9;
        this.q = inputStream;
    }

    private void b() throws IOException {
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        block7: {
            long l8;
            block8: {
                block5: {
                    block6: {
                        this.c();
                        n12 = this.c0.o();
                        if (n12 == -1) break block5;
                        if (n12 != 1) break block6;
                        c c8 = this.g0;
                        n12 = c8 != null ? c8.c(this.c0) : this.c0.q();
                        if (n12 != -1) {
                            this.j0.d(n12);
                            return;
                        }
                        break block5;
                    }
                    n12 = this.d0 == 4096 ? 6 : 7;
                    n11 = (int)this.c0.p(n12);
                    n10 = this.i0.c(this.c0);
                    if (n10 == -1 && n11 <= 0) break block5;
                    n8 = n9 = this.h0.c(this.c0);
                    if (n9 != 63) break block7;
                    l8 = this.c0.p(8);
                    if (l8 != -1L) break block8;
                }
                return;
            }
            n8 = (int)((long)n9 + l8);
        }
        n9 = this.f0;
        this.j0.b((n10 << n12 | n11) + 1, n8 + n9);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void c() throws IOException {
        Throwable throwable2;
        j j8;
        block7: {
            block6: {
                if (this.c0 != null) return;
                j8 = new j(new i(this.q));
                try {
                    if (this.e0 != 3) break block6;
                    this.g0 = c.b(j8, 256);
                }
                catch (Throwable throwable2) {
                    break block7;
                }
            }
            this.h0 = c.b(j8, 64);
            this.i0 = c.b(j8, 64);
            this.l0 += j8.c();
            ((InputStream)j8).close();
            this.c0 = new d(this.q);
            return;
        }
        try {
            throw throwable2;
        }
        catch (Throwable throwable3) {
            try {
                ((InputStream)j8).close();
                throw throwable3;
            }
            catch (Throwable throwable4) {
                throwable2.addSuppressed(throwable4);
            }
            throw throwable3;
        }
    }

    @Override
    public long a() {
        return this.c0.f() + this.l0;
    }

    @Override
    public void close() throws IOException {
        this.q.close();
    }

    @Override
    public int read() throws IOException {
        int n8;
        if (!this.j0.a()) {
            try {
                this.b();
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw new IOException("bad IMPLODE stream", illegalArgumentException);
            }
        }
        if ((n8 = this.j0.c()) > -1) {
            ++this.k0;
        }
        return n8;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

