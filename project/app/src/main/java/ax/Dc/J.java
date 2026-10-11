/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Ac.a;
import ax.Dc.F;
import ax.Dc.G;
import ax.Dc.H;
import ax.Dc.I;
import ax.Dc.K;
import ax.Dc.L;
import ax.Dc.M;
import ax.Dc.N;
import ax.Dc.U;
import ax.Dc.W;
import ax.Dc.X;
import ax.Dc.Z;
import ax.Dc.j;
import ax.Dc.o;
import ax.Dc.p;
import ax.Dc.q;
import ax.Dc.r;
import ax.Kc.f;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;

public class J
extends ax.Ac.c {
    private static final byte[] E0 = new byte[]{0, 0};
    private static final byte[] F0 = new byte[]{0, 0, 0, 0};
    private static final byte[] G0 = U.c(1L);
    static final byte[] H0 = U.d0.b();
    static final byte[] I0 = U.e0.b();
    static final byte[] J0 = U.c0.b();
    static final byte[] K0 = U.c(101010256L);
    static final byte[] L0 = U.c(101075792L);
    static final byte[] M0 = U.c(117853008L);
    private final byte[] A0;
    private final Calendar B0;
    private final boolean C0;
    private final Map<Integer, Integer> D0;
    protected boolean d0;
    private b e0;
    private String f0 = "";
    private int g0 = -1;
    private boolean h0;
    private int i0 = 8;
    private final List<I> j0 = new LinkedList<I>();
    private final p k0;
    private long l0;
    private long m0;
    private long n0;
    private long o0;
    private final Map<I, c> p0 = new HashMap<I, c>();
    private String q0 = "UTF8";
    private L r0 = M.a("UTF8");
    protected final Deflater s0;
    private final SeekableByteChannel t0;
    private final OutputStream u0;
    private boolean v0 = true;
    private boolean w0;
    private d x0 = d.c;
    private boolean y0;
    private G z0 = G.d0;

    public J(OutputStream outputStream) {
        Deflater deflater;
        this.A0 = new byte[32768];
        this.B0 = Calendar.getInstance();
        this.D0 = new HashMap<Integer, Integer>();
        this.u0 = outputStream;
        this.t0 = null;
        this.s0 = deflater = new Deflater(this.g0, true);
        this.k0 = p.a(outputStream, deflater);
        this.C0 = false;
    }

    private ByteBuffer A(I i8) throws IOException {
        return this.u(i8).b(i8.getName());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void A0(a object, boolean bl) throws IOException {
        boolean var2_9;
        b b8;
        if (this.d0) {
            throw new IOException("Stream has already been finished");
        }
        if (this.e0 != null) {
            this.d();
        }
        I i8 = (I)object;
        this.e0 = b8 = new b(i8);
        this.j0.add(b8.a);
        this.D0(this.e0.a);
        G g8 = this.q(this.e0.a);
        this.Z0(g8);
        if (this.L0(this.e0.a, g8)) {
            K var3_14;
            K var1_8;
            F f8 = this.F(this.e0.a);
            if (var2_9 != false) {
                K k8 = new K(this.e0.a.getSize());
                K k9 = new K(this.e0.a.getCompressedSize());
            } else {
                Object var1_6;
                if (this.e0.a.getMethod() == 0 && this.e0.a.getSize() != -1L) {
                    K k10 = new K(this.e0.a.getSize());
                } else {
                    K k11 = K.c0;
                }
                void var3_13 = var1_6;
            }
            f8.q((K)var1_8);
            f8.n((K)var3_14);
            this.e0.a.G();
        }
        if (this.e0.a.getMethod() == 8 && this.h0) {
            this.s0.setLevel(this.g0);
            this.h0 = false;
        }
        this.g1(i8, (boolean)var2_9);
    }

    private void C0(boolean bl) throws IOException {
        Object object;
        long l8 = this.t0.position();
        this.t0.position(this.e0.b);
        this.h1(U.c(this.e0.a.getCrc()));
        if (this.W(this.e0.a) && bl) {
            object = U.f0;
            this.h1(((U)object).b());
            this.h1(((U)object).b());
        } else {
            this.h1(U.c(this.e0.a.getCompressedSize()));
            this.h1(U.c(this.e0.a.getSize()));
        }
        if (this.W(this.e0.a)) {
            object = this.A(this.e0.a);
            int n8 = ((Buffer)object).limit();
            int n9 = ((Buffer)object).position();
            this.t0.position(this.e0.b + 16L + (long)(n8 - n9) + 4L);
            this.h1(K.b(this.e0.a.getSize()));
            this.h1(K.b(this.e0.a.getCompressedSize()));
            if (!bl) {
                this.t0.position(this.e0.b - 10L);
                this.h1(W.c(this.a1(this.e0.a.getMethod(), false, false)));
                this.e0.a.z(F.g0);
                this.e0.a.G();
                if (this.e0.e) {
                    this.y0 = false;
                }
            }
        }
        this.t0.position(l8);
    }

    private void D0(I i8) {
        if (i8.getMethod() == -1) {
            i8.setMethod(this.i0);
        }
        if (i8.getTime() == -1L) {
            i8.setTime(System.currentTimeMillis());
        }
    }

    private F F(I i8) {
        Object object = this.e0;
        if (object != null) {
            b.j((b)object, this.y0 ^ true);
        }
        this.y0 = true;
        object = i8.n(F.g0);
        object = object instanceof F ? (F)object : null;
        Object object2 = object;
        if (object == null) {
            object2 = new F();
        }
        i8.c((N)object2);
        return object2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean H(long l8, long l9, G object) throws ZipException {
        if (this.e0.a.getMethod() == 8) {
            this.e0.a.setSize(this.e0.d);
            this.e0.a.setCompressedSize(l8);
            this.e0.a.setCrc(l9);
            return this.c((G)((Object)object));
        } else {
            if (this.t0 == null) {
                if (this.e0.a.getCrc() == l9) {
                    if (this.e0.a.getSize() == l8) return this.c((G)((Object)((Object)object)));
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Bad size for entry ");
                    ((StringBuilder)object).append(this.e0.a.getName());
                    ((StringBuilder)object).append(": ");
                    ((StringBuilder)object).append(this.e0.a.getSize());
                    ((StringBuilder)object).append(" instead of ");
                    ((StringBuilder)object).append(l8);
                    throw new ZipException(((StringBuilder)object).toString());
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Bad CRC checksum for entry ");
                ((StringBuilder)object).append(this.e0.a.getName());
                ((StringBuilder)object).append(": ");
                ((StringBuilder)object).append(Long.toHexString(this.e0.a.getCrc()));
                ((StringBuilder)object).append(" instead of ");
                ((StringBuilder)object).append(Long.toHexString(l9));
                throw new ZipException(((StringBuilder)object).toString());
            }
            this.e0.a.setSize(l8);
            this.e0.a.setCompressedSize(l8);
            this.e0.a.setCrc(l9);
        }
        return this.c((G)((Object)((Object)object)));
    }

    private void L(I i8, long l8, boolean bl) {
        if (bl) {
            G g8;
            F f8 = this.F(i8);
            if (i8.getCompressedSize() < 0xFFFFFFFFL && i8.getSize() < 0xFFFFFFFFL && (g8 = this.z0) != G.q && g8 != G.e0) {
                f8.n(null);
                f8.q(null);
            } else {
                f8.n(new K(i8.getCompressedSize()));
                f8.q(new K(i8.getSize()));
            }
            boolean bl2 = true;
            boolean bl3 = l8 >= 0xFFFFFFFFL || this.z0 == G.q;
            boolean bl4 = bl2;
            if (i8.l() < 65535L) {
                bl4 = this.z0 == G.q ? bl2 : false;
            }
            if (bl3 || bl4) {
                f8.p(new K(l8));
            }
            if (bl4) {
                f8.o(new U(i8.l()));
            }
            i8.G();
        }
    }

    private boolean L0(I i8, G g8) {
        return g8 == G.q || g8 == G.e0 || i8.getSize() >= 0xFFFFFFFFL || i8.getCompressedSize() >= 0xFFFFFFFFL || i8.getSize() == -1L && this.t0 != null && g8 != G.c0;
        {
        }
    }

    private boolean M0() {
        int n8 = this.C0 ? ((X)this.u0).d() : 0;
        int n9 = this.D0.get(n8) == null ? 0 : this.D0.get(n8);
        return n8 >= 65535 || this.n0 >= 65535L || n9 >= 65535 || this.j0.size() >= 65535 || this.m0 >= 0xFFFFFFFFL || this.l0 >= 0xFFFFFFFFL;
        {
        }
    }

    private boolean T0(int n8, boolean bl) {
        return !bl && n8 == 8 && this.t0 == null;
    }

    private boolean W(I i8) {
        return i8.n(F.g0) instanceof F;
    }

    private void Y0() throws H {
        block3: {
            block4: {
                block5: {
                    block6: {
                        block7: {
                            block8: {
                                block2: {
                                    if (this.z0 != G.c0) break block2;
                                    boolean bl = this.C0;
                                    int n8 = 0;
                                    int n9 = bl ? ((X)this.u0).d() : 0;
                                    if (n9 >= 65535) break block3;
                                    if (this.n0 >= 65535L) break block4;
                                    if ((n9 = this.D0.get(n9) == null ? n8 : this.D0.get(n9)) >= 65535) break block5;
                                    if (this.j0.size() >= 65535) break block6;
                                    if (this.m0 >= 0xFFFFFFFFL) break block7;
                                    if (this.l0 >= 0xFFFFFFFFL) break block8;
                                }
                                return;
                            }
                            throw new H("Archive's size exceeds the limit of 4GByte.");
                        }
                        throw new H("The size of the entire central directory exceeds the limit of 4GByte.");
                    }
                    throw new H("Archive contains more than 65535 entries.");
                }
                throw new H("Number of entries on this disk exceeds the limit of 65535.");
            }
            throw new H("Number of the disk with the start of Central Directory exceeds the limit of 65535.");
        }
        throw new H("Number of the disk of End Of Central Directory exceeds the limit of 65535.");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void Z0(G g8) throws ZipException {
        if (this.e0.a.getMethod() == 0 && this.t0 == null) {
            if (this.e0.a.getSize() == -1L) throw new ZipException("Uncompressed size is required for STORED method when not writing to a file");
            if (this.e0.a.getCrc() == -1L) throw new ZipException("CRC checksum is required for STORED method when not writing to a file");
            this.e0.a.setCompressedSize(this.e0.a.getSize());
        }
        if ((this.e0.a.getSize() >= 0xFFFFFFFFL || this.e0.a.getCompressedSize() >= 0xFFFFFFFFL) && g8 == G.c0) throw new H(H.a(this.e0.a));
    }

    private int a1(int n8, boolean bl, boolean bl2) {
        if (bl) {
            return 45;
        }
        if (bl2) {
            return 20;
        }
        return this.b1(n8);
    }

    private void b(I i8, boolean bl, ByteBuffer object) throws IOException {
        d d8 = this.x0;
        Object object2 = d.b;
        if (d8 == object2 || !bl) {
            i8.d(new r(i8.getName(), ((ByteBuffer)object).array(), ((ByteBuffer)object).arrayOffset(), ((Buffer)object).limit() - ((Buffer)object).position()));
        }
        if ((object = i8.getComment()) != null && !"".equals(object)) {
            bl = this.r0.c((String)object);
            if (this.x0 == object2 || !bl) {
                object2 = this.u(i8).b((String)object);
                i8.d(new q((String)object, ((ByteBuffer)object2).array(), ((ByteBuffer)object2).arrayOffset(), ((Buffer)object2).limit() - ((Buffer)object2).position()));
            }
        }
    }

    private int b1(int n8) {
        if (n8 == 8) {
            return 20;
        }
        return 10;
    }

    private boolean c(G g8) throws ZipException {
        boolean bl = this.o0(this.e0.a, g8);
        if (bl && g8 == G.c0) {
            throw new H(H.a(this.e0.a));
        }
        return bl;
    }

    private boolean d0(I i8) {
        return i8.getSize() >= 0xFFFFFFFFL || i8.getCompressedSize() >= 0xFFFFFFFFL;
        {
        }
    }

    private void d1() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(70000);
        Iterator<I> iterator = this.j0.iterator();
        block0: while (true) {
            int n8 = 0;
            while (iterator.hasNext()) {
                int n9;
                byteArrayOutputStream.write(this.f(iterator.next()));
                n8 = n9 = n8 + 1;
                if (n9 <= 1000) continue;
                this.e1(byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.reset();
                continue block0;
            }
            break;
        }
        this.e1(byteArrayOutputStream.toByteArray());
    }

    private void e(boolean bl, boolean bl2) throws IOException {
        if (!bl2 && this.t0 != null) {
            this.C0(bl);
        }
        if (!bl2) {
            this.f1(this.e0.a);
        }
        this.e0 = null;
    }

    private void e1(byte[] byArray) throws IOException {
        this.k0.o(byArray);
    }

    private byte[] f(I i8) throws IOException {
        G g8;
        c c8 = this.p0.get(i8);
        boolean bl = this.W(i8) || i8.getCompressedSize() >= 0xFFFFFFFFL || i8.getSize() >= 0xFFFFFFFFL || c8.a >= 0xFFFFFFFFL || i8.l() >= 65535L || (g8 = this.z0) == G.q || g8 == G.e0;
        if (bl && this.z0 == G.c0) {
            throw new H("Archive's size exceeds the limit of 4GByte.");
        }
        this.L(i8, c8.a, bl);
        return this.g(i8, this.A(i8), c8, bl);
    }

    private byte[] g(I i8, ByteBuffer byteBuffer, c c8, boolean bl) throws IOException {
        Object object;
        Object object2;
        int n8;
        int n9;
        if (this.C0) {
            n9 = ((X)this.u0).d();
            if (this.D0.get(n9) == null) {
                this.D0.put(n9, 1);
            } else {
                n8 = this.D0.get(n9);
                this.D0.put(n9, n8 + 1);
            }
        }
        byte[] byArray = i8.j();
        n9 = byArray.length;
        Object object3 = object2 = i8.getComment();
        if (object2 == null) {
            object3 = "";
        }
        object3 = this.u(i8).b((String)object3);
        int n10 = byteBuffer.limit() - byteBuffer.position();
        int n11 = ((Buffer)object3).limit() - ((Buffer)object3).position();
        int n12 = n10 + 46;
        int n13 = n12 + n9;
        object2 = new byte[n13 + n11];
        System.arraycopy(J0, 0, object2, 0, 4);
        int n14 = i8.w();
        n8 = !this.y0 ? 20 : 45;
        W.i(n14 << 8 | n8, (byte[])object2, 4);
        n8 = i8.getMethod();
        boolean bl2 = this.r0.c(i8.getName());
        W.i(this.a1(n8, bl, c8.b), (byte[])object2, 6);
        bl = !bl2 && this.w0;
        this.v(bl, c8.b).b((byte[])object2, 8);
        W.i(n8, (byte[])object2, 10);
        Z.k(this.B0, i8.getTime(), (byte[])object2, 12);
        U.j(i8.getCrc(), (byte[])object2, 16);
        if (i8.getCompressedSize() < 0xFFFFFFFFL && i8.getSize() < 0xFFFFFFFFL && (object = this.z0) != G.q && object != G.e0) {
            U.j(i8.getCompressedSize(), (byte[])object2, 20);
            U.j(i8.getSize(), (byte[])object2, 24);
        } else {
            object = U.f0;
            object.k((byte[])object2, 20);
            object.k((byte[])object2, 24);
        }
        W.i(n10, (byte[])object2, 28);
        W.i(n9, (byte[])object2, 30);
        W.i(n11, (byte[])object2, 32);
        if (this.C0) {
            if (i8.l() < 65535L && this.z0 != G.q) {
                W.i((int)i8.l(), (byte[])object2, 34);
            } else {
                W.i(65535, (byte[])object2, 34);
            }
        } else {
            System.arraycopy(E0, 0, object2, 34, 2);
        }
        W.i(i8.r(), (byte[])object2, 36);
        U.j(i8.m(), (byte[])object2, 38);
        if (c8.a < 0xFFFFFFFFL && this.z0 != G.q) {
            U.j(Math.min(c8.a, 0xFFFFFFFFL), (byte[])object2, 42);
        } else {
            U.j(0xFFFFFFFFL, (byte[])object2, 42);
        }
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset(), object2, 46, n10);
        System.arraycopy(byArray, 0, object2, n12, n9);
        System.arraycopy(((ByteBuffer)object3).array(), ((ByteBuffer)object3).arrayOffset(), object2, n13, n11);
        return object2;
    }

    private void g1(I i8, boolean bl) throws IOException {
        Object object;
        boolean bl2 = this.r0.c(i8.getName());
        ByteBuffer byteBuffer = this.A(i8);
        if (this.x0 != d.c) {
            this.b(i8, bl2, byteBuffer);
        }
        long l8 = this.k0.g();
        if (this.C0) {
            object = (X)this.u0;
            i8.E(((X)object).d());
            l8 = ((X)object).c();
        }
        object = this.j(i8, byteBuffer, bl2, bl, l8);
        this.p0.put(i8, new c(l8, this.T0(i8.getMethod(), bl)));
        b.h(this.e0, l8 + 14L);
        this.e1((byte[])object);
        b.b(this.e0, this.k0.g());
    }

    private byte[] j(I object, ByteBuffer byteBuffer, boolean bl, boolean bl2, long l8) {
        boolean bl3;
        int n8;
        int n9;
        Object object2 = o.e0;
        Object object3 = ((I)object).n((W)object2);
        if (object3 != null) {
            ((I)object).z((W)object2);
        }
        object3 = object3 instanceof o ? (o)object3 : null;
        int n10 = n9 = ((I)object).h();
        if (n9 <= 0) {
            n10 = n9;
            if (object3 != null) {
                n10 = ((o)object3).e();
            }
        }
        boolean bl4 = true;
        if (n10 > 1 || object3 != null && !((o)object3).a()) {
            n9 = byteBuffer.limit();
            int n11 = byteBuffer.position();
            n8 = ((I)object).s().length;
            n9 = (int)(-l8 - (long)(n9 + 30 - n11 + n8) - 6L & (long)(n10 - 1));
            bl3 = object3 != null && ((o)object3).a();
            ((I)object).d(new o(n10, bl3, n9));
        }
        object2 = ((I)object).s();
        n8 = byteBuffer.limit() - byteBuffer.position();
        n10 = n8 + 30;
        object3 = new byte[((Object)object2).length + n10];
        System.arraycopy(H0, 0, object3, 0, 4);
        n9 = ((I)object).getMethod();
        bl3 = this.T0(n9, bl2);
        W.i(this.a1(n9, this.W((I)object), bl3), (byte[])object3, 4);
        bl = !bl && this.w0 ? bl4 : false;
        this.v(bl, bl3).b((byte[])object3, 6);
        W.i(n9, (byte[])object3, 8);
        Z.k(this.B0, ((ZipEntry)object).getTime(), (byte[])object3, 10);
        if (!(bl2 || n9 != 8 && this.t0 == null)) {
            System.arraycopy(F0, 0, object3, 14, 4);
        } else {
            U.j(((ZipEntry)object).getCrc(), (byte[])object3, 14);
        }
        if (this.W(this.e0.a)) {
            object = U.f0;
            ((U)object).k((byte[])object3, 18);
            ((U)object).k((byte[])object3, 22);
        } else if (bl2) {
            U.j(((ZipEntry)object).getCompressedSize(), (byte[])object3, 18);
            U.j(((I)object).getSize(), (byte[])object3, 22);
        } else if (n9 != 8 && this.t0 == null) {
            U.j(((I)object).getSize(), (byte[])object3, 18);
            U.j(((I)object).getSize(), (byte[])object3, 22);
        } else {
            object = F0;
            System.arraycopy(object, 0, object3, 18, 4);
            System.arraycopy(object, 0, object3, 22, 4);
        }
        W.i(n8, (byte[])object3, 26);
        W.i(((Object)object2).length, (byte[])object3, 28);
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset(), object3, 30, n8);
        System.arraycopy(object2, 0, object3, n10, ((Object)object2).length);
        return object3;
    }

    private boolean o0(I i8, G g8) {
        return g8 == G.q || g8 == G.e0 || this.d0(i8);
        {
        }
    }

    private void p() throws IOException {
        if (this.e0.a.getMethod() == 8) {
            this.k0.d();
        }
    }

    private G q(I i8) {
        if (this.z0 == G.d0 && this.t0 == null && i8.getMethod() == 8 && i8.getSize() == -1L) {
            return G.c0;
        }
        return this.z0;
    }

    private void s0() throws IOException {
        if (!this.d0) {
            b b8 = this.e0;
            if (b8 != null) {
                if (!b8.f) {
                    this.write(f.a, 0, 0);
                }
                return;
            }
            throw new IOException("No current entry to close");
        }
        throw new IOException("Stream has already been finished");
    }

    private L u(I i8) {
        if (!this.r0.c(i8.getName()) && this.w0) {
            return M.a;
        }
        return this.r0;
    }

    private j v(boolean bl, boolean bl2) {
        j j8 = new j();
        bl = this.v0 || bl;
        j8.k(bl);
        if (bl2) {
            j8.h(true);
        }
        return j8;
    }

    public void F0(String string) {
        this.q0 = string;
        this.r0 = M.a(string);
        if (this.v0 && !M.c(string)) {
            this.v0 = false;
        }
    }

    public void G0(int n8) {
        if (n8 >= -1 && n8 <= 9) {
            if (this.g0 == n8) {
                return;
            }
            this.h0 = true;
            this.g0 = n8;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid compression level: ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    protected void c1() throws IOException {
        if (!this.y0 && this.C0) {
            ((X)this.u0).f(this.o0);
        }
        this.Y0();
        this.e1(K0);
        boolean bl = this.C0;
        int n8 = 0;
        int n9 = bl ? ((X)this.u0).d() : 0;
        this.e1(W.c(n9));
        this.e1(W.c((int)this.n0));
        int n10 = this.j0.size();
        n9 = this.C0 ? (this.D0.get(n9) == null ? n8 : this.D0.get(n9)) : n10;
        this.e1(W.c(Math.min(n9, 65535)));
        this.e1(W.c(Math.min(n10, 65535)));
        this.e1(U.c(Math.min(this.m0, 0xFFFFFFFFL)));
        this.e1(U.c(Math.min(this.l0, 0xFFFFFFFFL)));
        ByteBuffer byteBuffer = this.r0.b(this.f0);
        n9 = byteBuffer.limit() - byteBuffer.position();
        this.e1(W.c(n9));
        this.k0.p(byteBuffer.array(), byteBuffer.arrayOffset(), n9);
    }

    @Override
    public void close() throws IOException {
        Throwable throwable2;
        block3: {
            block2: {
                try {
                    if (this.d0) break block2;
                    this.o();
                }
                catch (Throwable throwable2) {
                    break block3;
                }
            }
            this.m();
            return;
        }
        this.m();
        throw throwable2;
    }

    public void d() throws IOException {
        this.s0();
        this.p();
        long l8 = this.k0.g();
        long l9 = this.e0.c;
        long l10 = this.k0.f();
        b.d(this.e0, this.k0.e());
        this.e(this.H(l8 - l9, l10, this.q(this.e0.a)), false);
        this.k0.j();
    }

    protected void f1(I i8) throws IOException {
        if (!this.T0(i8.getMethod(), false)) {
            return;
        }
        this.e1(I0);
        this.e1(U.c(i8.getCrc()));
        if (!this.W(i8)) {
            this.e1(U.c(i8.getCompressedSize()));
            this.e1(U.c(i8.getSize()));
            return;
        }
        this.e1(K.b(i8.getCompressedSize()));
        this.e1(K.b(i8.getSize()));
    }

    @Override
    public void flush() throws IOException {
        OutputStream outputStream = this.u0;
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    protected final void h1(byte[] byArray) throws IOException {
        this.k0.u(byArray, 0, byArray.length);
    }

    protected void i1() throws IOException {
        long l8;
        block9: {
            block8: {
                if (this.z0 == G.c0) break block8;
                if (!this.y0 && this.M0()) {
                    this.y0 = true;
                }
                if (this.y0) break block9;
            }
            return;
        }
        long l9 = this.k0.g();
        if (this.C0) {
            X x8 = (X)this.u0;
            l9 = x8.c();
            l8 = x8.d();
        } else {
            l8 = 0L;
        }
        this.h1(L0);
        this.h1(K.b(44L));
        this.h1(W.c(45));
        this.h1(W.c(45));
        boolean bl = this.C0;
        int n8 = 0;
        int n9 = bl ? ((X)this.u0).d() : 0;
        this.h1(U.c(n9));
        this.h1(U.c(this.n0));
        n9 = this.C0 ? (this.D0.get(n9) == null ? n8 : this.D0.get(n9)) : this.j0.size();
        this.h1(K.b(n9));
        this.h1(K.b(this.j0.size()));
        this.h1(K.b(this.m0));
        this.h1(K.b(this.l0));
        if (this.C0) {
            long l10 = this.o0;
            ((X)this.u0).f(l10 + 20L);
        }
        this.h1(M0);
        this.h1(U.c(l8));
        this.h1(K.b(l9));
        if (this.C0) {
            this.h1(U.c(((X)this.u0).d() + 1));
            return;
        }
        this.h1(G0);
    }

    void m() throws IOException {
        Throwable throwable2;
        Closeable closeable;
        block6: {
            block5: {
                try {
                    closeable = this.t0;
                    if (closeable == null) break block5;
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                closeable.close();
            }
            if ((closeable = this.u0) != null) {
                ((OutputStream)closeable).close();
            }
            return;
        }
        closeable = this.u0;
        if (closeable != null) {
            ((OutputStream)closeable).close();
        }
        throw throwable2;
    }

    public void o() throws IOException {
        if (!this.d0) {
            if (this.e0 == null) {
                Object object;
                long l8;
                this.l0 = l8 = this.k0.g();
                if (this.C0) {
                    object = (X)this.u0;
                    this.l0 = ((X)object).c();
                    this.n0 = ((X)object).d();
                }
                this.d1();
                this.m0 = this.k0.g() - l8;
                object = this.r0.b(this.f0);
                this.o0 = (long)((Buffer)object).limit() - (long)((Buffer)object).position() + 22L;
                this.i1();
                this.c1();
                this.p0.clear();
                this.j0.clear();
                this.k0.close();
                if (this.C0) {
                    this.u0.close();
                }
                this.d0 = true;
                return;
            }
            throw new IOException("This archive contains unclosed entries.");
        }
        throw new IOException("This archive has already been finished");
    }

    public void u0(a a8) throws IOException {
        this.A0(a8, false);
    }

    @Override
    public void write(byte[] byArray, int n8, int n9) throws IOException {
        b b8 = this.e0;
        if (b8 != null) {
            Z.a(b8.a);
            this.a(this.k0.m(byArray, n8, n9, this.e0.a.getMethod()));
            return;
        }
        throw new IllegalStateException("No current entry");
    }

    private static final class b {
        private final I a;
        private long b;
        private long c;
        private long d;
        private boolean e;
        private boolean f;

        private b(I i8) {
            this.a = i8;
        }

        static /* synthetic */ long b(b b8, long l8) {
            b8.c = l8;
            return l8;
        }

        static /* synthetic */ long d(b b8, long l8) {
            b8.d = l8;
            return l8;
        }

        static /* synthetic */ long h(b b8, long l8) {
            b8.b = l8;
            return l8;
        }

        static /* synthetic */ boolean j(b b8, boolean bl) {
            b8.e = bl;
            return bl;
        }
    }

    private static final class c {
        private final long a;
        private final boolean b;

        private c(long l8, boolean bl) {
            this.a = l8;
            this.b = bl;
        }
    }

    public static final class d {
        public static final d b = new d("always");
        public static final d c = new d("never");
        public static final d d = new d("not encodeable");
        private final String a;

        private d(String string) {
            this.a = string;
        }

        public String toString() {
            return this.a;
        }
    }
}

