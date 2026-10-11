/*
 * Decompiled with CFR 0.152.
 */
package ax.qc;

import ax.oc.a;
import ax.qc.a;
import ax.qc.b;
import ax.qc.c;
import ax.qc.d;
import ax.qc.e;
import ax.qc.f;
import ax.qc.g;
import ax.qc.i;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.zip.CRC32;

public class h
extends InputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    private c c0;
    private ax.pc.a d0 = new ax.pc.a();
    private char[] e0;
    private ax.rc.f f0;
    private CRC32 g0 = new CRC32();
    private byte[] h0;
    private boolean i0 = false;
    private ax.rc.g j0;
    private boolean k0 = false;
    private boolean l0 = false;
    private PushbackInputStream q;

    public h(InputStream inputStream, char[] cArray) {
        this(inputStream, cArray, (Charset)null);
    }

    public h(InputStream inputStream, char[] cArray, ax.rc.g g8) {
        this(inputStream, cArray, null, g8);
    }

    private h(InputStream inputStream, char[] cArray, ax.tc.c c8, ax.rc.g g8) {
        if (g8.a() >= 512) {
            this.q = new PushbackInputStream(inputStream, g8.a());
            this.e0 = cArray;
            this.j0 = g8;
            return;
        }
        throw new IllegalArgumentException("Buffer size cannot be less than 512 bytes");
    }

    public h(InputStream inputStream, char[] cArray, Charset charset) {
        this(inputStream, cArray, new ax.rc.g(charset, 4096, true));
    }

    private void A() {
        this.f0 = null;
        this.g0.reset();
    }

    private void F() throws IOException {
        if (!(this.f0.f() == ax.sc.d.e0 && ((Object)((Object)this.f0.b().c())).equals((Object)ax.sc.b.d0) || this.f0.e() == this.g0.getValue())) {
            a.a a8 = a.a.d0;
            if (this.p(this.f0)) {
                a8 = a.a.q;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Reached end of entry, but crc verification failed for ");
            stringBuilder.append(this.f0.i());
            throw new ax.oc.a(stringBuilder.toString(), a8);
        }
    }

    private void H(ax.rc.f f8) throws IOException {
        if (!this.q(f8.i()) && f8.d() == ax.sc.c.c0 && f8.l() < 0L) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid local file header for: ");
            stringBuilder.append(f8.i());
            stringBuilder.append(". Uncompressed size has to be set for entry of compression type store which is not a directory");
            throw new IOException(stringBuilder.toString());
        }
    }

    private void a() throws IOException {
        if (!this.k0) {
            return;
        }
        throw new IOException("Stream closed");
    }

    private boolean b(List<ax.rc.d> object) {
        if (object == null) {
            return false;
        }
        object = object.iterator();
        while (object.hasNext()) {
            if (((ax.rc.d)object.next()).c() != ax.pc.b.m0.d()) continue;
            return true;
        }
        return false;
    }

    private void c() throws IOException {
        int n8 = this.c0.c(this.q);
        this.c0.a(this.q, n8);
        this.u();
        this.F();
        this.A();
        this.l0 = true;
    }

    private int d(ax.rc.a a8) throws ax.oc.a {
        if (a8 != null && a8.b() != null) {
            return a8.b().n() + 12;
        }
        throw new ax.oc.a("AesExtraDataRecord not found or invalid for Aes encrypted entry");
    }

    private long e(ax.rc.f f8) throws ax.oc.a {
        if (((Object)((Object)ax.tc.e.d(f8))).equals((Object)ax.sc.c.c0)) {
            return f8.l();
        }
        if (f8.n() && !this.i0) {
            return -1L;
        }
        return f8.c() - (long)this.f(f8);
    }

    private int f(ax.rc.f f8) throws ax.oc.a {
        if (!f8.p()) {
            return 0;
        }
        if (((Object)((Object)f8.f())).equals((Object)ax.sc.d.e0)) {
            return this.d(f8.b());
        }
        if (((Object)((Object)f8.f())).equals((Object)ax.sc.d.c0)) {
            return 12;
        }
        return 0;
    }

    private b<?> j(g g8, ax.rc.f f8) throws IOException {
        if (!f8.p()) {
            return new e(g8, f8, this.e0, this.j0.a());
        }
        if (f8.f() == ax.sc.d.e0) {
            return new a(g8, f8, this.e0, this.j0.a(), this.j0.c());
        }
        if (f8.f() == ax.sc.d.c0) {
            return new i(g8, f8, this.e0, this.j0.a(), this.j0.c());
        }
        throw new ax.oc.a(String.format("Entry [%s] Strong Encryption not supported", f8.i()), a.a.g0);
    }

    private c m(b<?> b8, ax.rc.f f8) throws ax.oc.a {
        if (ax.tc.e.d(f8) == ax.sc.c.d0) {
            return new d(b8, this.j0.a());
        }
        return new f(b8);
    }

    private c o(ax.rc.f f8) throws IOException {
        return this.m(this.j(new g(this.q, this.e(f8)), f8), f8);
    }

    private boolean p(ax.rc.f f8) {
        return f8.p() && ((Object)((Object)ax.sc.d.c0)).equals((Object)f8.f());
    }

    private boolean q(String string) {
        return string.endsWith("/") || string.endsWith("\\");
        {
        }
    }

    private void u() throws IOException {
        if (this.f0.n() && !this.i0) {
            ax.rc.c c8 = this.d0.d(this.q, this.b(this.f0.g()));
            this.f0.s(c8.b());
            this.f0.G(c8.d());
            this.f0.u(c8.c());
        }
    }

    private void v() throws IOException {
        if (this.h0 == null) {
            this.h0 = new byte[512];
        }
        while (this.read(this.h0) != -1) {
        }
        this.l0 = true;
    }

    @Override
    public int available() throws IOException {
        this.a();
        return this.l0 ^ 1;
    }

    @Override
    public void close() throws IOException {
        if (this.k0) {
            return;
        }
        c c8 = this.c0;
        if (c8 != null) {
            c8.close();
        }
        this.k0 = true;
    }

    public ax.rc.f g(ax.rc.e e8, boolean bl) throws IOException {
        ax.rc.f f8;
        if (this.f0 != null && bl) {
            this.v();
        }
        this.f0 = f8 = this.d0.g(this.q, this.j0.b());
        if (f8 == null) {
            return null;
        }
        f8.p();
        this.H(this.f0);
        this.g0.reset();
        if (e8 != null) {
            this.f0.u(e8.e());
            this.f0.s(e8.c());
            this.f0.G(e8.l());
            this.f0.w(e8.o());
            this.i0 = true;
        } else {
            this.i0 = false;
        }
        this.c0 = this.o(this.f0);
        this.l0 = false;
        return this.f0;
    }

    @Override
    public int read() throws IOException {
        byte[] byArray = new byte[1];
        if (this.read(byArray) == -1) {
            return -1;
        }
        return byArray[0] & 0xFF;
    }

    @Override
    public int read(byte[] byArray) throws IOException {
        return this.read(byArray, 0, byArray.length);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        IOException iOException2;
        block8: {
            if (this.k0) {
                throw new IOException("Stream closed");
            }
            if (n9 < 0) {
                throw new IllegalArgumentException("Negative read length");
            }
            if (n9 == 0) {
                return 0;
            }
            if (this.f0 == null) {
                return -1;
            }
            try {
                n9 = this.c0.read(byArray, n8, n9);
                if (n9 == -1) {
                    this.c();
                    return n9;
                }
            }
            catch (IOException iOException2) {
                break block8;
            }
            this.g0.update(byArray, n8, n9);
            return n9;
        }
        if (this.p(this.f0)) {
            throw new ax.oc.a(iOException2.getMessage(), iOException2.getCause(), a.a.q);
        }
        throw iOException2;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

