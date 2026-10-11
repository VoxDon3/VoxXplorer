/*
 * Decompiled with CFR 0.152.
 */
package ax.be;

import ax.be.P;
import ax.be.c;
import ax.be.g;
import ax.be.i;
import ax.be.v;
import ax.de.a;
import ax.de.b;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class J
extends InputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    private final c c0;
    private final int d0;
    private final b e0;
    private final ax.ce.c f0;
    private final boolean g0;
    private g h0 = null;
    private final ax.fe.b i0 = new ax.fe.b();
    private boolean j0 = false;
    private IOException k0 = null;
    private final byte[] l0 = new byte[1];
    private InputStream q;

    public J(InputStream inputStream, int n8) throws IOException {
        this(inputStream, n8, true);
    }

    public J(InputStream inputStream, int n8, boolean bl) throws IOException {
        this(inputStream, n8, bl, c.b());
    }

    public J(InputStream inputStream, int n8, boolean bl, c c8) throws IOException {
        this(inputStream, n8, bl, J.b(inputStream), c8);
    }

    J(InputStream object, int n8, boolean bl, byte[] byArray, c c8) throws IOException {
        this.c0 = c8;
        this.q = object;
        this.d0 = n8;
        this.g0 = bl;
        this.e0 = object = a.e(byArray);
        this.f0 = ax.ce.c.b(((b)object).a);
    }

    private static byte[] b(InputStream inputStream) throws IOException {
        byte[] byArray = new byte[12];
        new DataInputStream(inputStream).readFully(byArray);
        return byArray;
    }

    private void c() throws IOException {
        Object object = new byte[12];
        new DataInputStream(this.q).readFully((byte[])object);
        object = a.d(object);
        if (a.b(this.e0, (b)object) && this.i0.c() == object.b) {
            return;
        }
        throw new i("XZ Stream Footer does not match Stream Header");
    }

    public void a(boolean bl) throws IOException {
        if (this.q != null) {
            g g8 = this.h0;
            if (g8 != null) {
                g8.close();
                this.h0 = null;
            }
            if (bl) {
                try {
                    this.q.close();
                }
                finally {
                    this.q = null;
                }
            }
        }
    }

    @Override
    public int available() throws IOException {
        if (this.q != null) {
            Object object = this.k0;
            if (object == null) {
                object = this.h0;
                if (object == null) {
                    return 0;
                }
                return ((g)object).available();
            }
            throw object;
        }
        throw new P("Stream closed");
    }

    @Override
    public void close() throws IOException {
        this.a(true);
    }

    @Override
    public int read() throws IOException {
        if (this.read(this.l0, 0, 1) == -1) {
            return -1;
        }
        return this.l0[0] & 0xFF;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        IOException iOException2;
        block10: {
            if (n8 < 0) throw new IndexOutOfBoundsException();
            if (n9 < 0) throw new IndexOutOfBoundsException();
            int n10 = n8 + n9;
            if (n10 < 0) throw new IndexOutOfBoundsException();
            if (n10 > byArray.length) throw new IndexOutOfBoundsException();
            if (n9 == 0) {
                return 0;
            }
            if (this.q == null) throw new P("Stream closed");
            Object object = this.k0;
            if (object != null) throw object;
            boolean bl = this.j0;
            int n11 = -1;
            if (bl) {
                return -1;
            }
            n10 = n8;
            n8 = 0;
            while (n9 > 0) {
                int n12;
                block9: {
                    try {
                        object = this.h0;
                        if (object != null) break block9;
                        this.h0 = object = new g(this.q, this.f0, this.g0, this.d0, -1L, -1L, this.c0);
                        break block9;
                    }
                    catch (IOException iOException2) {
                        break block10;
                    }
                    catch (v v8) {
                        this.i0.f(this.q);
                        this.c();
                        this.j0 = true;
                        n9 = n11;
                        if (n8 <= 0) return n9;
                        return n8;
                    }
                }
                if ((n12 = this.h0.read(byArray, n10, n9)) > 0) {
                    n8 += n12;
                    n10 += n12;
                    n9 -= n12;
                    continue;
                }
                if (n12 != -1) continue;
                this.i0.a(this.h0.b(), this.h0.a());
                this.h0 = null;
            }
            return n8;
        }
        this.k0 = iOException2;
        if (n8 == 0) throw iOException2;
        return n8;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

