package ax.Dc;

import ax.Dc.I;
import j$.io.FileRetargetClass;
import j$.nio.file.Files;
import j$.nio.file.StandardOpenOption;
import j$.nio.file.attribute.FileAttribute;
import j$.util.Comparator;
import j$.util.Map;
import j$.util.function.Function$CC;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ToLongFunction;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes3.dex */
public class S implements Closeable, AutoCloseable {
    private static final byte[] w0 = new byte[1];
    private static final long x0 = U.h(J.J0);
    private final Map<String, LinkedList<I>> c0;
    private final String d0;
    private final L e0;
    private final String f0;
    private final SeekableByteChannel g0;
    private final boolean h0;
    private volatile boolean i0;
    private final boolean j0;
    private final byte[] k0;
    private final byte[] l0;
    private final byte[] m0;
    private final byte[] n0;
    private final ByteBuffer o0;
    private final ByteBuffer p0;
    private final List<I> q;
    private final ByteBuffer q0;
    private final ByteBuffer r0;
    private long s0;
    private long t0;
    private long u0;
    private final Comparator<I> v0;

    class a extends C0676k {
        final /* synthetic */ Inflater d0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InputStream inputStream, Inflater inflater, Inflater inflater2) {
            super(inputStream, inflater);
            this.d0 = inflater2;
        }

        @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                super.close();
            } finally {
                this.d0.end();
            }
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[V.values().length];
            a = iArr;
            try {
                iArr[V.STORED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[V.UNSHRINKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[V.IMPLODING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[V.DEFLATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[V.BZIP2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[V.ENHANCED_DEFLATED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[V.AES_ENCRYPTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[V.EXPANDING_LEVEL_1.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[V.EXPANDING_LEVEL_2.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[V.EXPANDING_LEVEL_3.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[V.EXPANDING_LEVEL_4.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[V.JPEG.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[V.LZMA.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[V.PKWARE_IMPLODING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[V.PPMD.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[V.TOKENIZATION.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[V.UNKNOWN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[V.WAVPACK.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[V.XZ.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    private class c extends ax.Kc.c {
        private final FileChannel e0;

        c(long j, long j2) {
            super(j, j2);
            this.e0 = (FileChannel) S.this.g0;
        }

        @Override // ax.Kc.c
        protected int a(long j, ByteBuffer byteBuffer) throws IOException {
            int read = this.e0.read(byteBuffer, j);
            byteBuffer.flip();
            return read;
        }
    }

    private static class d extends I {
        d() {
        }

        @Override // ax.Dc.I
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                d dVar = (d) obj;
                if (t() == dVar.t() && super.k() == dVar.k() && super.l() == dVar.l()) {
                    return true;
                }
            }
            return false;
        }

        @Override // ax.Dc.I, java.util.zip.ZipEntry
        public int hashCode() {
            return (super.hashCode() * 3) + ((int) t()) + ((int) (t() >> 32));
        }
    }

    private static final class e {
        private final byte[] a;
        private final byte[] b;

        /* synthetic */ e(byte[] bArr, byte[] bArr2, a aVar) {
            this(bArr, bArr2);
        }

        private e(byte[] bArr, byte[] bArr2) {
            this.a = bArr;
            this.b = bArr2;
        }
    }

    private static class f extends ax.Kc.j implements ax.Kc.o {
        f(InputStream inputStream) {
            super(inputStream);
        }

        @Override // ax.Kc.o
        public long a() {
            return super.c();
        }
    }

    public S(String str) throws IOException {
        this(new File(str), "UTF8");
    }

    private void A(Map<I, e> map) throws IOException {
        Iterator<I> it = this.q.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int[] H = H(dVar);
            int i = H[0];
            int i2 = H[1];
            W(i);
            byte[] h = ax.Kc.n.h(this.g0, i2);
            if (h.length < i2) {
                throw new EOFException();
            }
            try {
                dVar.setExtra(h);
                if (map.containsKey(dVar)) {
                    e eVar = map.get(dVar);
                    Z.g(dVar, eVar.a, eVar.b);
                }
            } catch (RuntimeException e2) {
                ZipException zipException = new ZipException("Invalid extra data in entry " + dVar.getName());
                zipException.initCause(e2);
                throw zipException;
            }
        }
    }

    private void F(I i) throws IOException {
        if (i.l() < 0) {
            throw new IOException("broken archive, entry with negative disk number");
        }
        if (i.t() < 0) {
            throw new IOException("broken archive, entry with negative local file header offset");
        }
        if (!this.j0) {
            if (i.t() <= this.u0) {
                return;
            }
            throw new IOException("local file header for " + i.getName() + " starts after central directory");
        }
        if (i.l() > this.s0) {
            throw new IOException("local file header for " + i.getName() + " starts on a later disk than central directory");
        }
        if (i.l() != this.s0 || i.t() <= this.t0) {
            return;
        }
        throw new IOException("local file header for " + i.getName() + " starts after central directory");
    }

    private int[] H(I i) throws IOException {
        long t = i.t();
        if (this.j0) {
            ((Y) this.g0).a(i.l(), t + 26);
            t = this.g0.position() - 26;
        } else {
            this.g0.position(26 + t);
        }
        this.p0.rewind();
        ax.Kc.n.f(this.g0, this.p0);
        this.p0.flip();
        this.p0.get(this.n0);
        int f2 = W.f(this.n0);
        this.p0.get(this.n0);
        int f3 = W.f(this.n0);
        i.D(t + 30 + f2 + f3);
        if (i.k() + i.getCompressedSize() <= this.u0) {
            return new int[]{f2, f3};
        }
        throw new IOException("data for " + i.getName() + " overlaps with central directory.");
    }

    private void L(I i) throws IOException {
        N n = i.n(F.g0);
        if (n != null && !(n instanceof F)) {
            throw new ZipException("archive contains unparseable zip64 extra field");
        }
        F f2 = (F) n;
        if (f2 != null) {
            boolean z = i.getSize() == 4294967295L;
            boolean z2 = i.getCompressedSize() == 4294967295L;
            boolean z3 = i.t() == 4294967295L;
            boolean z4 = i.l() == WebSocketProtocol.PAYLOAD_SHORT_MAX;
            f2.m(z, z2, z3, z4);
            if (z) {
                long d2 = f2.l().d();
                if (d2 < 0) {
                    throw new IOException("broken archive, entry with negative size");
                }
                i.setSize(d2);
            } else if (z2) {
                f2.q(new K(i.getSize()));
            }
            if (z2) {
                long d3 = f2.e().d();
                if (d3 < 0) {
                    throw new IOException("broken archive, entry with negative compressed size");
                }
                i.setCompressedSize(d3);
            } else if (z) {
                f2.n(new K(i.getCompressedSize()));
            }
            if (z3) {
                i.K(f2.k().d());
            }
            if (z4) {
                i.E(f2.g().f());
            }
        }
    }

    private void W(int i) throws IOException {
        long position = this.g0.position() + i;
        if (position > this.g0.size()) {
            throw new EOFException();
        }
        this.g0.position(position);
    }

    public static /* synthetic */ LinkedList a(String str) {
        return new LinkedList();
    }

    private ax.Kc.c c(long j, long j2) {
        if (j < 0 || j2 < 0 || j + j2 < j) {
            throw new IllegalArgumentException("Corrupted archive, stream boundaries are out of range");
        }
        return this.g0 instanceof FileChannel ? new c(j, j2) : new ax.Kc.e(j, j2, this.g0);
    }

    private void d() {
        for (I i : this.q) {
            ((LinkedList) Map.EL.computeIfAbsent(this.c0, i.getName(), new Function() { // from class: ax.Dc.Q
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return S.a((String) obj);
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            })).addLast(i);
        }
    }

    private boolean d0() throws IOException {
        this.g0.position(0L);
        this.p0.rewind();
        ax.Kc.n.f(this.g0, this.p0);
        return Arrays.equals(this.l0, J.H0);
    }

    private long e(I i) throws IOException {
        long k = i.k();
        if (k != -1) {
            return k;
        }
        H(i);
        return i.k();
    }

    private java.util.Map<I, e> m() throws IOException {
        HashMap hashMap = new HashMap();
        o();
        this.u0 = this.g0.position();
        this.p0.rewind();
        ax.Kc.n.f(this.g0, this.p0);
        long h = U.h(this.l0);
        if (h != x0 && d0()) {
            throw new IOException("Central directory is empty, can't expand corrupt archive.");
        }
        while (h == x0) {
            v(hashMap);
            this.p0.rewind();
            ax.Kc.n.f(this.g0, this.p0);
            h = U.h(this.l0);
        }
        return hashMap;
    }

    private void o() throws IOException {
        u();
        boolean z = false;
        boolean z2 = this.g0.position() > 20;
        if (z2) {
            SeekableByteChannel seekableByteChannel = this.g0;
            seekableByteChannel.position(seekableByteChannel.position() - 20);
            this.p0.rewind();
            ax.Kc.n.f(this.g0, this.p0);
            z = Arrays.equals(J.M0, this.l0);
        }
        if (z) {
            q();
            return;
        }
        if (z2) {
            W(16);
        }
        p();
    }

    private boolean o0(long j, long j2, byte[] bArr) throws IOException {
        long size = this.g0.size() - j;
        long max = Math.max(0L, this.g0.size() - j2);
        boolean z = false;
        if (size >= 0) {
            while (true) {
                if (size < max) {
                    break;
                }
                this.g0.position(size);
                try {
                    this.p0.rewind();
                    ax.Kc.n.f(this.g0, this.p0);
                    this.p0.flip();
                    if (this.p0.get() == bArr[0] && this.p0.get() == bArr[1] && this.p0.get() == bArr[2] && this.p0.get() == bArr[3]) {
                        z = true;
                        break;
                    }
                    size--;
                } catch (EOFException unused) {
                }
            }
        }
        if (z) {
            this.g0.position(size);
        }
        return z;
    }

    private void p() throws IOException {
        if (!this.j0) {
            W(16);
            this.p0.rewind();
            ax.Kc.n.f(this.g0, this.p0);
            this.s0 = 0L;
            long h = U.h(this.l0);
            this.t0 = h;
            this.g0.position(h);
            return;
        }
        W(6);
        this.r0.rewind();
        ax.Kc.n.f(this.g0, this.r0);
        this.s0 = W.f(this.n0);
        W(8);
        this.p0.rewind();
        ax.Kc.n.f(this.g0, this.p0);
        long h2 = U.h(this.l0);
        this.t0 = h2;
        ((Y) this.g0).a(this.s0, h2);
    }

    private void q() throws IOException {
        if (this.j0) {
            this.p0.rewind();
            ax.Kc.n.f(this.g0, this.p0);
            long h = U.h(this.l0);
            this.o0.rewind();
            ax.Kc.n.f(this.g0, this.o0);
            ((Y) this.g0).a(h, K.e(this.k0));
        } else {
            W(4);
            this.o0.rewind();
            ax.Kc.n.f(this.g0, this.o0);
            this.g0.position(K.e(this.k0));
        }
        this.p0.rewind();
        ax.Kc.n.f(this.g0, this.p0);
        if (!Arrays.equals(this.l0, J.L0)) {
            throw new ZipException("Archive's ZIP64 end of central directory locator is corrupt.");
        }
        if (!this.j0) {
            W(44);
            this.o0.rewind();
            ax.Kc.n.f(this.g0, this.o0);
            this.s0 = 0L;
            long e2 = K.e(this.k0);
            this.t0 = e2;
            this.g0.position(e2);
            return;
        }
        W(16);
        this.p0.rewind();
        ax.Kc.n.f(this.g0, this.p0);
        this.s0 = U.h(this.l0);
        W(24);
        this.o0.rewind();
        ax.Kc.n.f(this.g0, this.o0);
        long e3 = K.e(this.k0);
        this.t0 = e3;
        ((Y) this.g0).a(this.s0, e3);
    }

    private void u() throws IOException {
        if (!o0(22L, 65557L, J.K0)) {
            throw new ZipException("Archive is not a ZIP archive");
        }
    }

    private void v(java.util.Map<I, e> map) throws IOException {
        this.q0.rewind();
        ax.Kc.n.f(this.g0, this.q0);
        d dVar = new d();
        int h = W.h(this.m0, 0);
        dVar.R(h);
        dVar.O((h >> 8) & 15);
        dVar.S(W.h(this.m0, 2));
        C0675j f2 = C0675j.f(this.m0, 4);
        boolean m = f2.m();
        L l = m ? M.a : this.e0;
        if (m) {
            dVar.N(I.d.NAME_WITH_EFS_FLAG);
        }
        dVar.I(f2);
        dVar.P(W.h(this.m0, 4));
        dVar.setMethod(W.h(this.m0, 6));
        dVar.setTime(Z.d(U.i(this.m0, 8)));
        dVar.setCrc(U.i(this.m0, 12));
        long i = U.i(this.m0, 16);
        if (i < 0) {
            throw new IOException("broken archive, entry with negative compressed size");
        }
        dVar.setCompressedSize(i);
        long i2 = U.i(this.m0, 20);
        if (i2 < 0) {
            throw new IOException("broken archive, entry with negative size");
        }
        dVar.setSize(i2);
        int h2 = W.h(this.m0, 24);
        if (h2 < 0) {
            throw new IOException("broken archive, entry with negative fileNameLen");
        }
        int h3 = W.h(this.m0, 26);
        if (h3 < 0) {
            throw new IOException("broken archive, entry with negative extraLen");
        }
        int h4 = W.h(this.m0, 28);
        if (h4 < 0) {
            throw new IOException("broken archive, entry with negative commentLen");
        }
        dVar.E(W.h(this.m0, 30));
        dVar.J(W.h(this.m0, 32));
        dVar.F(U.i(this.m0, 34));
        byte[] h5 = ax.Kc.n.h(this.g0, h2);
        if (h5.length < h2) {
            throw new EOFException();
        }
        dVar.M(l.a(h5), h5);
        dVar.K(U.i(this.m0, 38));
        this.q.add(dVar);
        byte[] h6 = ax.Kc.n.h(this.g0, h3);
        if (h6.length < h3) {
            throw new EOFException();
        }
        try {
            dVar.B(h6);
            L(dVar);
            F(dVar);
            byte[] h7 = ax.Kc.n.h(this.g0, h4);
            if (h7.length < h4) {
                throw new EOFException();
            }
            dVar.setComment(l.a(h7));
            if (!m && this.h0) {
                map.put(dVar, new e(h5, h7, null));
            }
            dVar.Q(true);
        } catch (RuntimeException e2) {
            ZipException zipException = new ZipException("Invalid extra data in entry " + dVar.getName());
            zipException.initCause(e2);
            throw zipException;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.i0 = true;
        this.g0.close();
    }

    public Enumeration<I> f() {
        return Collections.enumeration(this.q);
    }

    protected void finalize() throws Throwable {
        try {
            if (!this.i0) {
                System.err.println("Cleaning up unclosed ZipFile for archive " + this.f0);
                close();
            }
        } finally {
            super.finalize();
        }
    }

    public I g(String str) {
        LinkedList<I> linkedList = this.c0.get(str);
        if (linkedList != null) {
            return linkedList.getFirst();
        }
        return null;
    }

    public InputStream j(I i) throws IOException {
        if (!(i instanceof d)) {
            return null;
        }
        Z.a(i);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(c(e(i), i.getCompressedSize()));
        switch (b.a[V.h(i.getMethod()).ordinal()]) {
            case 1:
                return new f(bufferedInputStream);
            case 2:
                return new C0686v(bufferedInputStream);
            case 3:
                try {
                    return new C0672g(i.o().d(), i.o().c(), bufferedInputStream);
                } catch (IllegalArgumentException e2) {
                    throw new IOException("bad IMPLODE data", e2);
                }
            case 4:
                Inflater inflater = new Inflater(true);
                return new a(new SequenceInputStream(bufferedInputStream, new ByteArrayInputStream(w0)), inflater, inflater);
            case 5:
                return new ax.Fc.a(bufferedInputStream);
            case 6:
                return new ax.Gc.a(bufferedInputStream);
            default:
                throw new C0687w(V.h(i.getMethod()), i);
        }
    }

    public S(File file, String str) throws IOException {
        this(file, str, true);
    }

    public S(File file, String str, boolean z) throws IOException {
        this(file, str, z, false);
    }

    public S(File file, String str, boolean z, boolean z2) throws IOException {
        this(Files.newByteChannel(FileRetargetClass.toPath(file), EnumSet.of(StandardOpenOption.READ), new FileAttribute[0]), file.getAbsolutePath(), str, z, true, z2);
    }

    public S(SeekableByteChannel seekableByteChannel) throws IOException {
        this(seekableByteChannel, "unknown archive", "UTF8", true);
    }

    public S(SeekableByteChannel seekableByteChannel, String str) throws IOException {
        this(seekableByteChannel, "unknown archive", str, true);
    }

    public S(SeekableByteChannel seekableByteChannel, String str, String str2, boolean z) throws IOException {
        this(seekableByteChannel, str, str2, z, false, false);
    }

    private S(SeekableByteChannel seekableByteChannel, String str, String str2, boolean z, boolean z2, boolean z3) throws IOException {
        this.q = new LinkedList();
        this.c0 = new HashMap(509);
        this.i0 = true;
        byte[] bArr = new byte[8];
        this.k0 = bArr;
        byte[] bArr2 = new byte[4];
        this.l0 = bArr2;
        byte[] bArr3 = new byte[42];
        this.m0 = bArr3;
        byte[] bArr4 = new byte[2];
        this.n0 = bArr4;
        this.o0 = ByteBuffer.wrap(bArr);
        this.p0 = ByteBuffer.wrap(bArr2);
        this.q0 = ByteBuffer.wrap(bArr3);
        this.r0 = ByteBuffer.wrap(bArr4);
        this.v0 = Comparator.EL.thenComparingLong(Comparator.CC.comparingLong(new ToLongFunction() { // from class: ax.Dc.O
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return ((I) obj).l();
            }
        }), new ToLongFunction() { // from class: ax.Dc.P
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return ((I) obj).t();
            }
        });
        this.j0 = seekableByteChannel instanceof Y;
        this.f0 = str;
        this.d0 = str2;
        this.e0 = M.a(str2);
        this.h0 = z;
        this.g0 = seekableByteChannel;
        try {
            try {
                java.util.Map<I, e> m = m();
                if (!z3) {
                    A(m);
                }
                d();
                this.i0 = false;
            } catch (IOException e2) {
                throw new IOException("Error on ZipFile " + str, e2);
            }
        } catch (Throwable th) {
            this.i0 = true;
            if (z2) {
                ax.Kc.n.a(this.g0);
            }
            throw th;
        }
    }
}
