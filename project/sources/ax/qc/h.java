package ax.qc;

import ax.oc.C2743a;
import ax.pc.C2826a;
import ax.rc.C3026a;
import ax.rc.C3028c;
import ax.rc.C3029d;
import ax.rc.C3030e;
import ax.sc.EnumC3085b;
import ax.sc.EnumC3086c;
import ax.sc.EnumC3087d;
import ax.tc.C3146e;
import ax.tc.InterfaceC3144c;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;

/* loaded from: classes3.dex */
public class h extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
    private c c0;
    private C2826a d0;
    private char[] e0;
    private ax.rc.f f0;
    private CRC32 g0;
    private byte[] h0;
    private boolean i0;
    private ax.rc.g j0;
    private boolean k0;
    private boolean l0;
    private PushbackInputStream q;

    public h(InputStream inputStream, char[] cArr) {
        this(inputStream, cArr, (Charset) null);
    }

    private void A() {
        this.f0 = null;
        this.g0.reset();
    }

    private void F() throws IOException {
        if ((this.f0.f() == EnumC3087d.AES && this.f0.b().c().equals(EnumC3085b.TWO)) || this.f0.e() == this.g0.getValue()) {
            return;
        }
        C2743a.EnumC0408a enumC0408a = C2743a.EnumC0408a.CHECKSUM_MISMATCH;
        if (p(this.f0)) {
            enumC0408a = C2743a.EnumC0408a.WRONG_PASSWORD;
        }
        throw new C2743a("Reached end of entry, but crc verification failed for " + this.f0.i(), enumC0408a);
    }

    private void H(ax.rc.f fVar) throws IOException {
        if (q(fVar.i()) || fVar.d() != EnumC3086c.STORE || fVar.l() >= 0) {
            return;
        }
        throw new IOException("Invalid local file header for: " + fVar.i() + ". Uncompressed size has to be set for entry of compression type store which is not a directory");
    }

    private void a() throws IOException {
        if (this.k0) {
            throw new IOException("Stream closed");
        }
    }

    private boolean b(List<C3029d> list) {
        if (list == null) {
            return false;
        }
        Iterator<C3029d> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().c() == ax.pc.b.ZIP64_EXTRA_FIELD_SIGNATURE.d()) {
                return true;
            }
        }
        return false;
    }

    private void c() throws IOException {
        this.c0.a(this.q, this.c0.c(this.q));
        u();
        F();
        A();
        this.l0 = true;
    }

    private int d(C3026a c3026a) throws C2743a {
        if (c3026a == null || c3026a.b() == null) {
            throw new C2743a("AesExtraDataRecord not found or invalid for Aes encrypted entry");
        }
        return c3026a.b().n() + 12;
    }

    private long e(ax.rc.f fVar) throws C2743a {
        if (C3146e.d(fVar).equals(EnumC3086c.STORE)) {
            return fVar.l();
        }
        if (!fVar.n() || this.i0) {
            return fVar.c() - f(fVar);
        }
        return -1L;
    }

    private int f(ax.rc.f fVar) throws C2743a {
        if (fVar.p()) {
            return fVar.f().equals(EnumC3087d.AES) ? d(fVar.b()) : fVar.f().equals(EnumC3087d.ZIP_STANDARD) ? 12 : 0;
        }
        return 0;
    }

    private AbstractC2901b<?> j(g gVar, ax.rc.f fVar) throws IOException {
        if (!fVar.p()) {
            return new e(gVar, fVar, this.e0, this.j0.a());
        }
        if (fVar.f() == EnumC3087d.AES) {
            return new C2900a(gVar, fVar, this.e0, this.j0.a(), this.j0.c());
        }
        if (fVar.f() == EnumC3087d.ZIP_STANDARD) {
            return new i(gVar, fVar, this.e0, this.j0.a(), this.j0.c());
        }
        throw new C2743a(String.format("Entry [%s] Strong Encryption not supported", fVar.i()), C2743a.EnumC0408a.UNSUPPORTED_ENCRYPTION);
    }

    private c m(AbstractC2901b<?> abstractC2901b, ax.rc.f fVar) throws C2743a {
        return C3146e.d(fVar) == EnumC3086c.DEFLATE ? new d(abstractC2901b, this.j0.a()) : new f(abstractC2901b);
    }

    private c o(ax.rc.f fVar) throws IOException {
        return m(j(new g(this.q, e(fVar)), fVar), fVar);
    }

    private boolean p(ax.rc.f fVar) {
        return fVar.p() && EnumC3087d.ZIP_STANDARD.equals(fVar.f());
    }

    private boolean q(String str) {
        return str.endsWith("/") || str.endsWith("\\");
    }

    private void u() throws IOException {
        if (!this.f0.n() || this.i0) {
            return;
        }
        C3028c d = this.d0.d(this.q, b(this.f0.g()));
        this.f0.s(d.b());
        this.f0.G(d.d());
        this.f0.u(d.c());
    }

    private void v() throws IOException {
        if (this.h0 == null) {
            this.h0 = new byte[512];
        }
        while (read(this.h0) != -1) {
        }
        this.l0 = true;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        a();
        return !this.l0 ? 1 : 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.k0) {
            return;
        }
        c cVar = this.c0;
        if (cVar != null) {
            cVar.close();
        }
        this.k0 = true;
    }

    public ax.rc.f g(C3030e c3030e, boolean z) throws IOException {
        if (this.f0 != null && z) {
            v();
        }
        ax.rc.f g = this.d0.g(this.q, this.j0.b());
        this.f0 = g;
        if (g == null) {
            return null;
        }
        g.p();
        H(this.f0);
        this.g0.reset();
        if (c3030e != null) {
            this.f0.u(c3030e.e());
            this.f0.s(c3030e.c());
            this.f0.G(c3030e.l());
            this.f0.w(c3030e.o());
            this.i0 = true;
        } else {
            this.i0 = false;
        }
        this.c0 = o(this.f0);
        this.l0 = false;
        return this.f0;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = new byte[1];
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public h(InputStream inputStream, char[] cArr, Charset charset) {
        this(inputStream, cArr, new ax.rc.g(charset, 4096, true));
    }

    public h(InputStream inputStream, char[] cArr, ax.rc.g gVar) {
        this(inputStream, cArr, null, gVar);
    }

    private h(InputStream inputStream, char[] cArr, InterfaceC3144c interfaceC3144c, ax.rc.g gVar) {
        this.d0 = new C2826a();
        this.g0 = new CRC32();
        this.i0 = false;
        this.k0 = false;
        this.l0 = false;
        if (gVar.a() >= 512) {
            this.q = new PushbackInputStream(inputStream, gVar.a());
            this.e0 = cArr;
            this.j0 = gVar;
            return;
        }
        throw new IllegalArgumentException("Buffer size cannot be less than 512 bytes");
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.k0) {
            throw new IOException("Stream closed");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Negative read length");
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f0 == null) {
            return -1;
        }
        try {
            int read = this.c0.read(bArr, i, i2);
            if (read == -1) {
                c();
                return read;
            }
            this.g0.update(bArr, i, read);
            return read;
        } catch (IOException e) {
            if (p(this.f0)) {
                throw new C2743a(e.getMessage(), e.getCause(), C2743a.EnumC0408a.WRONG_PASSWORD);
            }
            throw e;
        }
    }
}
