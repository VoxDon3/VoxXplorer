package ax.Dc;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.ZipException;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes3.dex */
public class J extends ax.Ac.c {
    private static final byte[] E0 = {0, 0};
    private static final byte[] F0 = {0, 0, 0, 0};
    private static final byte[] G0 = U.c(1);
    static final byte[] H0 = U.d0.b();
    static final byte[] I0 = U.e0.b();
    static final byte[] J0 = U.c0.b();
    static final byte[] K0 = U.c(101010256);
    static final byte[] L0 = U.c(101075792);
    static final byte[] M0 = U.c(117853008);
    private final boolean C0;
    protected boolean d0;
    private b e0;
    private boolean h0;
    private final AbstractC0681p k0;
    private long l0;
    private long m0;
    private long n0;
    private long o0;
    protected final Deflater s0;
    private final OutputStream u0;
    private boolean w0;
    private boolean y0;
    private String f0 = HttpUrl.FRAGMENT_ENCODE_SET;
    private int g0 = -1;
    private int i0 = 8;
    private final List<I> j0 = new LinkedList();
    private final Map<I, c> p0 = new HashMap();
    private String q0 = "UTF8";
    private L r0 = M.a("UTF8");
    private boolean v0 = true;
    private d x0 = d.c;
    private G z0 = G.AsNeeded;
    private final byte[] A0 = new byte[32768];
    private final Calendar B0 = Calendar.getInstance();
    private final Map<Integer, Integer> D0 = new HashMap();
    private final SeekableByteChannel t0 = null;

    private static final class b {
        private final I a;
        private long b;
        private long c;
        private long d;
        private boolean e;
        private boolean f;

        private b(I i) {
            this.a = i;
        }
    }

    private static final class c {
        private final long a;
        private final boolean b;

        private c(long j, boolean z) {
            this.a = j;
            this.b = z;
        }
    }

    public static final class d {
        public static final d b = new d("always");
        public static final d c = new d("never");
        public static final d d = new d("not encodeable");
        private final String a;

        private d(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    public J(OutputStream outputStream) {
        this.u0 = outputStream;
        Deflater deflater = new Deflater(this.g0, true);
        this.s0 = deflater;
        this.k0 = AbstractC0681p.a(outputStream, deflater);
        this.C0 = false;
    }

    private ByteBuffer A(I i) throws IOException {
        return u(i).b(i.getName());
    }

    private void A0(ax.Ac.a aVar, boolean z) throws IOException {
        K k;
        K k2;
        if (this.d0) {
            throw new IOException("Stream has already been finished");
        }
        if (this.e0 != null) {
            d();
        }
        I i = (I) aVar;
        b bVar = new b(i);
        this.e0 = bVar;
        this.j0.add(bVar.a);
        D0(this.e0.a);
        G q = q(this.e0.a);
        Z0(q);
        if (L0(this.e0.a, q)) {
            F F = F(this.e0.a);
            if (z) {
                k = new K(this.e0.a.getSize());
                k2 = new K(this.e0.a.getCompressedSize());
            } else {
                k = (this.e0.a.getMethod() != 0 || this.e0.a.getSize() == -1) ? K.c0 : new K(this.e0.a.getSize());
                k2 = k;
            }
            F.q(k);
            F.n(k2);
            this.e0.a.G();
        }
        if (this.e0.a.getMethod() == 8 && this.h0) {
            this.s0.setLevel(this.g0);
            this.h0 = false;
        }
        g1(i, z);
    }

    private void C0(boolean z) throws IOException {
        long position = this.t0.position();
        this.t0.position(this.e0.b);
        h1(U.c(this.e0.a.getCrc()));
        if (W(this.e0.a) && z) {
            U u = U.f0;
            h1(u.b());
            h1(u.b());
        } else {
            h1(U.c(this.e0.a.getCompressedSize()));
            h1(U.c(this.e0.a.getSize()));
        }
        if (W(this.e0.a)) {
            ByteBuffer A = A(this.e0.a);
            this.t0.position(this.e0.b + 16 + (A.limit() - A.position()) + 4);
            h1(K.b(this.e0.a.getSize()));
            h1(K.b(this.e0.a.getCompressedSize()));
            if (!z) {
                this.t0.position(this.e0.b - 10);
                h1(W.c(a1(this.e0.a.getMethod(), false, false)));
                this.e0.a.z(F.g0);
                this.e0.a.G();
                if (this.e0.e) {
                    this.y0 = false;
                }
            }
        }
        this.t0.position(position);
    }

    private void D0(I i) {
        if (i.getMethod() == -1) {
            i.setMethod(this.i0);
        }
        if (i.getTime() == -1) {
            i.setTime(System.currentTimeMillis());
        }
    }

    private F F(I i) {
        b bVar = this.e0;
        if (bVar != null) {
            bVar.e = !this.y0;
        }
        this.y0 = true;
        N n = i.n(F.g0);
        F f = n instanceof F ? (F) n : null;
        if (f == null) {
            f = new F();
        }
        i.c(f);
        return f;
    }

    private boolean H(long j, long j2, G g) throws ZipException {
        if (this.e0.a.getMethod() == 8) {
            this.e0.a.setSize(this.e0.d);
            this.e0.a.setCompressedSize(j);
            this.e0.a.setCrc(j2);
        } else if (this.t0 != null) {
            this.e0.a.setSize(j);
            this.e0.a.setCompressedSize(j);
            this.e0.a.setCrc(j2);
        } else {
            if (this.e0.a.getCrc() != j2) {
                throw new ZipException("Bad CRC checksum for entry " + this.e0.a.getName() + ": " + Long.toHexString(this.e0.a.getCrc()) + " instead of " + Long.toHexString(j2));
            }
            if (this.e0.a.getSize() != j) {
                throw new ZipException("Bad size for entry " + this.e0.a.getName() + ": " + this.e0.a.getSize() + " instead of " + j);
            }
        }
        return c(g);
    }

    private void L(I i, long j, boolean z) {
        G g;
        if (z) {
            F F = F(i);
            if (i.getCompressedSize() >= 4294967295L || i.getSize() >= 4294967295L || (g = this.z0) == G.Always || g == G.AlwaysWithCompatibility) {
                F.n(new K(i.getCompressedSize()));
                F.q(new K(i.getSize()));
            } else {
                F.n(null);
                F.q(null);
            }
            boolean z2 = true;
            boolean z3 = j >= 4294967295L || this.z0 == G.Always;
            if (i.l() < WebSocketProtocol.PAYLOAD_SHORT_MAX && this.z0 != G.Always) {
                z2 = false;
            }
            if (z3 || z2) {
                F.p(new K(j));
            }
            if (z2) {
                F.o(new U(i.l()));
            }
            i.G();
        }
    }

    private boolean L0(I i, G g) {
        if (g == G.Always || g == G.AlwaysWithCompatibility || i.getSize() >= 4294967295L || i.getCompressedSize() >= 4294967295L) {
            return true;
        }
        return (i.getSize() != -1 || this.t0 == null || g == G.Never) ? false : true;
    }

    private boolean M0() {
        int d2 = this.C0 ? ((X) this.u0).d() : 0;
        return d2 >= 65535 || this.n0 >= WebSocketProtocol.PAYLOAD_SHORT_MAX || (this.D0.get(Integer.valueOf(d2)) == null ? 0 : this.D0.get(Integer.valueOf(d2)).intValue()) >= 65535 || this.j0.size() >= 65535 || this.m0 >= 4294967295L || this.l0 >= 4294967295L;
    }

    private boolean T0(int i, boolean z) {
        return !z && i == 8 && this.t0 == null;
    }

    private boolean W(I i) {
        return i.n(F.g0) instanceof F;
    }

    private void Y0() throws H {
        if (this.z0 != G.Never) {
            return;
        }
        int d2 = this.C0 ? ((X) this.u0).d() : 0;
        if (d2 >= 65535) {
            throw new H("Number of the disk of End Of Central Directory exceeds the limit of 65535.");
        }
        if (this.n0 >= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            throw new H("Number of the disk with the start of Central Directory exceeds the limit of 65535.");
        }
        if ((this.D0.get(Integer.valueOf(d2)) != null ? this.D0.get(Integer.valueOf(d2)).intValue() : 0) >= 65535) {
            throw new H("Number of entries on this disk exceeds the limit of 65535.");
        }
        if (this.j0.size() >= 65535) {
            throw new H("Archive contains more than 65535 entries.");
        }
        if (this.m0 >= 4294967295L) {
            throw new H("The size of the entire central directory exceeds the limit of 4GByte.");
        }
        if (this.l0 >= 4294967295L) {
            throw new H("Archive's size exceeds the limit of 4GByte.");
        }
    }

    private void Z0(G g) throws ZipException {
        if (this.e0.a.getMethod() == 0 && this.t0 == null) {
            if (this.e0.a.getSize() == -1) {
                throw new ZipException("Uncompressed size is required for STORED method when not writing to a file");
            }
            if (this.e0.a.getCrc() == -1) {
                throw new ZipException("CRC checksum is required for STORED method when not writing to a file");
            }
            this.e0.a.setCompressedSize(this.e0.a.getSize());
        }
        if ((this.e0.a.getSize() >= 4294967295L || this.e0.a.getCompressedSize() >= 4294967295L) && g == G.Never) {
            throw new H(H.a(this.e0.a));
        }
    }

    private int a1(int i, boolean z, boolean z2) {
        if (z) {
            return 45;
        }
        if (z2) {
            return 20;
        }
        return b1(i);
    }

    private void b(I i, boolean z, ByteBuffer byteBuffer) throws IOException {
        d dVar = this.x0;
        d dVar2 = d.b;
        if (dVar == dVar2 || !z) {
            i.d(new r(i.getName(), byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position()));
        }
        String comment = i.getComment();
        if (comment == null || HttpUrl.FRAGMENT_ENCODE_SET.equals(comment)) {
            return;
        }
        boolean c2 = this.r0.c(comment);
        if (this.x0 == dVar2 || !c2) {
            ByteBuffer b2 = u(i).b(comment);
            i.d(new C0682q(comment, b2.array(), b2.arrayOffset(), b2.limit() - b2.position()));
        }
    }

    private int b1(int i) {
        return i == 8 ? 20 : 10;
    }

    private boolean c(G g) throws ZipException {
        boolean o0 = o0(this.e0.a, g);
        if (o0 && g == G.Never) {
            throw new H(H.a(this.e0.a));
        }
        return o0;
    }

    private boolean d0(I i) {
        return i.getSize() >= 4294967295L || i.getCompressedSize() >= 4294967295L;
    }

    private void d1() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(70000);
        Iterator<I> it = this.j0.iterator();
        while (true) {
            int i = 0;
            while (it.hasNext()) {
                byteArrayOutputStream.write(f(it.next()));
                i++;
                if (i > 1000) {
                    break;
                }
            }
            e1(byteArrayOutputStream.toByteArray());
            return;
            e1(byteArrayOutputStream.toByteArray());
            byteArrayOutputStream.reset();
        }
    }

    private void e(boolean z, boolean z2) throws IOException {
        if (!z2 && this.t0 != null) {
            C0(z);
        }
        if (!z2) {
            f1(this.e0.a);
        }
        this.e0 = null;
    }

    private void e1(byte[] bArr) throws IOException {
        this.k0.o(bArr);
    }

    private byte[] f(I i) throws IOException {
        G g;
        c cVar = this.p0.get(i);
        boolean z = W(i) || i.getCompressedSize() >= 4294967295L || i.getSize() >= 4294967295L || cVar.a >= 4294967295L || i.l() >= WebSocketProtocol.PAYLOAD_SHORT_MAX || (g = this.z0) == G.Always || g == G.AlwaysWithCompatibility;
        if (z && this.z0 == G.Never) {
            throw new H("Archive's size exceeds the limit of 4GByte.");
        }
        L(i, cVar.a, z);
        return g(i, A(i), cVar, z);
    }

    private byte[] g(I i, ByteBuffer byteBuffer, c cVar, boolean z) throws IOException {
        G g;
        if (this.C0) {
            int d2 = ((X) this.u0).d();
            if (this.D0.get(Integer.valueOf(d2)) == null) {
                this.D0.put(Integer.valueOf(d2), 1);
            } else {
                this.D0.put(Integer.valueOf(d2), Integer.valueOf(this.D0.get(Integer.valueOf(d2)).intValue() + 1));
            }
        }
        byte[] j = i.j();
        int length = j.length;
        String comment = i.getComment();
        if (comment == null) {
            comment = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        ByteBuffer b2 = u(i).b(comment);
        int limit = byteBuffer.limit() - byteBuffer.position();
        int limit2 = b2.limit() - b2.position();
        int i2 = limit + 46;
        int i3 = i2 + length;
        byte[] bArr = new byte[i3 + limit2];
        System.arraycopy(J0, 0, bArr, 0, 4);
        W.i((i.w() << 8) | (!this.y0 ? 20 : 45), bArr, 4);
        int method = i.getMethod();
        boolean c2 = this.r0.c(i.getName());
        W.i(a1(method, z, cVar.b), bArr, 6);
        v(!c2 && this.w0, cVar.b).b(bArr, 8);
        W.i(method, bArr, 10);
        Z.k(this.B0, i.getTime(), bArr, 12);
        U.j(i.getCrc(), bArr, 16);
        if (i.getCompressedSize() >= 4294967295L || i.getSize() >= 4294967295L || (g = this.z0) == G.Always || g == G.AlwaysWithCompatibility) {
            U u = U.f0;
            u.k(bArr, 20);
            u.k(bArr, 24);
        } else {
            U.j(i.getCompressedSize(), bArr, 20);
            U.j(i.getSize(), bArr, 24);
        }
        W.i(limit, bArr, 28);
        W.i(length, bArr, 30);
        W.i(limit2, bArr, 32);
        if (!this.C0) {
            System.arraycopy(E0, 0, bArr, 34, 2);
        } else if (i.l() >= WebSocketProtocol.PAYLOAD_SHORT_MAX || this.z0 == G.Always) {
            W.i(Settings.DEFAULT_INITIAL_WINDOW_SIZE, bArr, 34);
        } else {
            W.i((int) i.l(), bArr, 34);
        }
        W.i(i.r(), bArr, 36);
        U.j(i.m(), bArr, 38);
        if (cVar.a >= 4294967295L || this.z0 == G.Always) {
            U.j(4294967295L, bArr, 42);
        } else {
            U.j(Math.min(cVar.a, 4294967295L), bArr, 42);
        }
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset(), bArr, 46, limit);
        System.arraycopy(j, 0, bArr, i2, length);
        System.arraycopy(b2.array(), b2.arrayOffset(), bArr, i3, limit2);
        return bArr;
    }

    private void g1(I i, boolean z) throws IOException {
        boolean c2 = this.r0.c(i.getName());
        ByteBuffer A = A(i);
        if (this.x0 != d.c) {
            b(i, c2, A);
        }
        long g = this.k0.g();
        if (this.C0) {
            X x = (X) this.u0;
            i.E(x.d());
            g = x.c();
        }
        long j = g;
        byte[] j2 = j(i, A, c2, z, j);
        this.p0.put(i, new c(j, T0(i.getMethod(), z)));
        this.e0.b = j + 14;
        e1(j2);
        this.e0.c = this.k0.g();
    }

    private byte[] j(I i, ByteBuffer byteBuffer, boolean z, boolean z2, long j) {
        W w = C0680o.e0;
        N n = i.n(w);
        if (n != null) {
            i.z(w);
        }
        C0680o c0680o = n instanceof C0680o ? (C0680o) n : null;
        int h = i.h();
        if (h <= 0 && c0680o != null) {
            h = c0680o.e();
        }
        if (h > 1 || (c0680o != null && !c0680o.a())) {
            i.d(new C0680o(h, c0680o != null && c0680o.a(), (int) ((((-j) - (((byteBuffer.limit() + 30) - byteBuffer.position()) + i.s().length)) - 6) & (h - 1))));
        }
        byte[] s = i.s();
        int limit = byteBuffer.limit() - byteBuffer.position();
        int i2 = limit + 30;
        byte[] bArr = new byte[s.length + i2];
        System.arraycopy(H0, 0, bArr, 0, 4);
        int method = i.getMethod();
        boolean T0 = T0(method, z2);
        W.i(a1(method, W(i), T0), bArr, 4);
        v(!z && this.w0, T0).b(bArr, 6);
        W.i(method, bArr, 8);
        Z.k(this.B0, i.getTime(), bArr, 10);
        if (z2 || (method != 8 && this.t0 == null)) {
            U.j(i.getCrc(), bArr, 14);
        } else {
            System.arraycopy(F0, 0, bArr, 14, 4);
        }
        if (W(this.e0.a)) {
            U u = U.f0;
            u.k(bArr, 18);
            u.k(bArr, 22);
        } else if (z2) {
            U.j(i.getCompressedSize(), bArr, 18);
            U.j(i.getSize(), bArr, 22);
        } else if (method == 8 || this.t0 != null) {
            byte[] bArr2 = F0;
            System.arraycopy(bArr2, 0, bArr, 18, 4);
            System.arraycopy(bArr2, 0, bArr, 22, 4);
        } else {
            U.j(i.getSize(), bArr, 18);
            U.j(i.getSize(), bArr, 22);
        }
        W.i(limit, bArr, 26);
        W.i(s.length, bArr, 28);
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset(), bArr, 30, limit);
        System.arraycopy(s, 0, bArr, i2, s.length);
        return bArr;
    }

    private boolean o0(I i, G g) {
        return g == G.Always || g == G.AlwaysWithCompatibility || d0(i);
    }

    private void p() throws IOException {
        if (this.e0.a.getMethod() == 8) {
            this.k0.d();
        }
    }

    private G q(I i) {
        return (this.z0 == G.AsNeeded && this.t0 == null && i.getMethod() == 8 && i.getSize() == -1) ? G.Never : this.z0;
    }

    private void s0() throws IOException {
        if (this.d0) {
            throw new IOException("Stream has already been finished");
        }
        b bVar = this.e0;
        if (bVar == null) {
            throw new IOException("No current entry to close");
        }
        if (bVar.f) {
            return;
        }
        write(ax.Kc.f.a, 0, 0);
    }

    private L u(I i) {
        return (this.r0.c(i.getName()) || !this.w0) ? this.r0 : M.a;
    }

    private C0675j v(boolean z, boolean z2) {
        C0675j c0675j = new C0675j();
        c0675j.k(this.v0 || z);
        if (z2) {
            c0675j.h(true);
        }
        return c0675j;
    }

    public void F0(String str) {
        this.q0 = str;
        this.r0 = M.a(str);
        if (!this.v0 || M.c(str)) {
            return;
        }
        this.v0 = false;
    }

    public void G0(int i) {
        if (i < -1 || i > 9) {
            throw new IllegalArgumentException("Invalid compression level: " + i);
        }
        if (this.g0 == i) {
            return;
        }
        this.h0 = true;
        this.g0 = i;
    }

    protected void c1() throws IOException {
        if (!this.y0 && this.C0) {
            ((X) this.u0).f(this.o0);
        }
        Y0();
        e1(K0);
        int i = 0;
        int d2 = this.C0 ? ((X) this.u0).d() : 0;
        e1(W.c(d2));
        e1(W.c((int) this.n0));
        int size = this.j0.size();
        if (!this.C0) {
            i = size;
        } else if (this.D0.get(Integer.valueOf(d2)) != null) {
            i = this.D0.get(Integer.valueOf(d2)).intValue();
        }
        e1(W.c(Math.min(i, Settings.DEFAULT_INITIAL_WINDOW_SIZE)));
        e1(W.c(Math.min(size, Settings.DEFAULT_INITIAL_WINDOW_SIZE)));
        e1(U.c(Math.min(this.m0, 4294967295L)));
        e1(U.c(Math.min(this.l0, 4294967295L)));
        ByteBuffer b2 = this.r0.b(this.f0);
        int limit = b2.limit() - b2.position();
        e1(W.c(limit));
        this.k0.p(b2.array(), b2.arrayOffset(), limit);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            if (!this.d0) {
                o();
            }
        } finally {
            m();
        }
    }

    public void d() throws IOException {
        s0();
        p();
        long g = this.k0.g() - this.e0.c;
        long f = this.k0.f();
        this.e0.d = this.k0.e();
        e(H(g, f, q(this.e0.a)), false);
        this.k0.j();
    }

    protected void f1(I i) throws IOException {
        if (T0(i.getMethod(), false)) {
            e1(I0);
            e1(U.c(i.getCrc()));
            if (W(i)) {
                e1(K.b(i.getCompressedSize()));
                e1(K.b(i.getSize()));
            } else {
                e1(U.c(i.getCompressedSize()));
                e1(U.c(i.getSize()));
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this.u0;
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    protected final void h1(byte[] bArr) throws IOException {
        this.k0.u(bArr, 0, bArr.length);
    }

    protected void i1() throws IOException {
        long j;
        if (this.z0 == G.Never) {
            return;
        }
        if (!this.y0 && M0()) {
            this.y0 = true;
        }
        if (this.y0) {
            long g = this.k0.g();
            if (this.C0) {
                X x = (X) this.u0;
                g = x.c();
                j = x.d();
            } else {
                j = 0;
            }
            h1(L0);
            h1(K.b(44L));
            h1(W.c(45));
            h1(W.c(45));
            int i = 0;
            int d2 = this.C0 ? ((X) this.u0).d() : 0;
            h1(U.c(d2));
            h1(U.c(this.n0));
            if (!this.C0) {
                i = this.j0.size();
            } else if (this.D0.get(Integer.valueOf(d2)) != null) {
                i = this.D0.get(Integer.valueOf(d2)).intValue();
            }
            h1(K.b(i));
            h1(K.b(this.j0.size()));
            h1(K.b(this.m0));
            h1(K.b(this.l0));
            if (this.C0) {
                ((X) this.u0).f(this.o0 + 20);
            }
            h1(M0);
            h1(U.c(j));
            h1(K.b(g));
            if (this.C0) {
                h1(U.c(((X) this.u0).d() + 1));
            } else {
                h1(G0);
            }
        }
    }

    void m() throws IOException {
        try {
            SeekableByteChannel seekableByteChannel = this.t0;
            if (seekableByteChannel != null) {
                seekableByteChannel.close();
            }
        } finally {
            OutputStream outputStream = this.u0;
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    public void o() throws IOException {
        if (this.d0) {
            throw new IOException("This archive has already been finished");
        }
        if (this.e0 != null) {
            throw new IOException("This archive contains unclosed entries.");
        }
        long g = this.k0.g();
        this.l0 = g;
        if (this.C0) {
            this.l0 = ((X) this.u0).c();
            this.n0 = r2.d();
        }
        d1();
        this.m0 = this.k0.g() - g;
        ByteBuffer b2 = this.r0.b(this.f0);
        this.o0 = (b2.limit() - b2.position()) + 22;
        i1();
        c1();
        this.p0.clear();
        this.j0.clear();
        this.k0.close();
        if (this.C0) {
            this.u0.close();
        }
        this.d0 = true;
    }

    public void u0(ax.Ac.a aVar) throws IOException {
        A0(aVar, false);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        b bVar = this.e0;
        if (bVar == null) {
            throw new IllegalStateException("No current entry");
        }
        Z.a(bVar.a);
        a(this.k0.m(bArr, i, i2, this.e0.a.getMethod()));
    }
}
