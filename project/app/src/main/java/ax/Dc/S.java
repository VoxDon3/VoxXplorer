/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Dc.F;
import ax.Dc.I;
import ax.Dc.J;
import ax.Dc.K;
import ax.Dc.L;
import ax.Dc.M;
import ax.Dc.N;
import ax.Dc.O;
import ax.Dc.P;
import ax.Dc.Q;
import ax.Dc.U;
import ax.Dc.V;
import ax.Dc.W;
import ax.Dc.Y;
import ax.Dc.Z;
import ax.Dc.g;
import ax.Dc.j;
import ax.Dc.k;
import ax.Dc.v;
import ax.Dc.w;
import ax.Fc.a;
import ax.Kc.n;
import ax.Kc.o;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
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
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ToLongFunction;
import java.util.zip.Inflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;

public class S
implements Closeable,
AutoCloseable {
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

    public S(File file, String string) throws IOException {
        this(file, string, true);
    }

    public S(File file, String string, boolean bl) throws IOException {
        this(file, string, bl, false);
    }

    public S(File file, String string, boolean bl, boolean bl2) throws IOException {
        this(j.Files.newByteChannel((j.Path)j.FileRetargetClass.toPath((File)file), EnumSet.of(j.StandardOpenOption.READ), (j.FileAttribute[])new j.FileAttribute[0]), file.getAbsolutePath(), string, bl, true, bl2);
    }

    public S(String string) throws IOException {
        this(new File(string), "UTF8");
    }

    public S(SeekableByteChannel seekableByteChannel) throws IOException {
        this(seekableByteChannel, "unknown archive", "UTF8", true);
    }

    public S(SeekableByteChannel seekableByteChannel, String string) throws IOException {
        this(seekableByteChannel, "unknown archive", string, true);
    }

    public S(SeekableByteChannel seekableByteChannel, String string, String string2, boolean bl) throws IOException {
        this(seekableByteChannel, string, string2, bl, false, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private S(SeekableByteChannel object, String string, String object2, boolean bl, boolean bl2, boolean bl3) throws IOException {
        Throwable throwable2;
        block6: {
            this.q = new LinkedList<I>();
            this.c0 = new HashMap<String, LinkedList<I>>(509);
            this.i0 = true;
            Object object3 = new byte[8];
            this.k0 = object3;
            byte[] byArray = new byte[4];
            this.l0 = byArray;
            byte[] byArray2 = new byte[42];
            this.m0 = byArray2;
            byte[] byArray3 = new byte[2];
            this.n0 = byArray3;
            this.o0 = ByteBuffer.wrap((byte[])object3);
            this.p0 = ByteBuffer.wrap(byArray);
            this.q0 = ByteBuffer.wrap(byArray2);
            this.r0 = ByteBuffer.wrap(byArray3);
            this.v0 = j.Comparator._EL.thenComparingLong((Comparator)j.Comparator._CC.comparingLong((ToLongFunction)new O()), (ToLongFunction)new P());
            this.j0 = object instanceof Y;
            this.f0 = string;
            this.d0 = object2;
            this.e0 = M.a((String)object2);
            this.h0 = bl;
            this.g0 = object;
            try {
                object = this.m();
                if (!bl3) {
                    this.A((Map<I, e>)object);
                }
                this.d();
                this.i0 = false;
                return;
            }
            catch (Throwable throwable2) {
                break block6;
            }
            catch (IOException iOException) {}
            object3 = new StringBuilder;
            ((StringBuilder)object3).append("Error on ZipFile ");
            ((StringBuilder)object3).append(string);
            object2 = new IOException(((StringBuilder)object3).toString(), iOException);
            throw object2;
        }
        this.i0 = true;
        if (bl2) {
            n.a(this.g0);
        }
        throw throwable2;
    }

    private void A(Map<I, e> map) throws IOException {
        Object object = this.q.iterator();
        while (object.hasNext()) {
            Object object2 = (d)object.next();
            Object object3 = this.H((I)object2);
            int n8 = object3[0];
            int n9 = object3[1];
            this.W(n8);
            object3 = n.h(this.g0, n9);
            if (((int[])object3).length >= n9) {
                try {
                    ((I)object2).setExtra((byte[])object3);
                }
                catch (RuntimeException runtimeException) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Invalid extra data in entry ");
                    ((StringBuilder)object).append(((I)object2).getName());
                    object2 = new ZipException(((StringBuilder)object).toString());
                    ((Throwable)object2).initCause(runtimeException);
                    throw object2;
                }
                if (!map.containsKey(object2)) continue;
                object3 = map.get(object2);
                Z.g((I)object2, ((e)object3).a, ((e)object3).b);
                continue;
            }
            throw new EOFException();
        }
    }

    private void F(I i8) throws IOException {
        block5: {
            block6: {
                block10: {
                    block9: {
                        block7: {
                            block8: {
                                if (i8.l() < 0L) break block5;
                                if (i8.t() < 0L) break block6;
                                if (!this.j0) break block7;
                                if (i8.l() > this.s0) break block8;
                                if (i8.l() == this.s0 && i8.t() > this.t0) {
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("local file header for ");
                                    stringBuilder.append(i8.getName());
                                    stringBuilder.append(" starts after central directory");
                                    throw new IOException(stringBuilder.toString());
                                }
                                break block9;
                            }
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("local file header for ");
                            stringBuilder.append(i8.getName());
                            stringBuilder.append(" starts on a later disk than central directory");
                            throw new IOException(stringBuilder.toString());
                        }
                        if (i8.t() > this.u0) break block10;
                    }
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("local file header for ");
                stringBuilder.append(i8.getName());
                stringBuilder.append(" starts after central directory");
                throw new IOException(stringBuilder.toString());
            }
            throw new IOException("broken archive, entry with negative local file header offset");
        }
        throw new IOException("broken archive, entry with negative disk number");
    }

    private int[] H(I i8) throws IOException {
        long l8 = i8.t();
        if (this.j0) {
            ((Y)this.g0).a(i8.l(), l8 + 26L);
            l8 = this.g0.position() - 26L;
        } else {
            this.g0.position(26L + l8);
        }
        this.p0.rewind();
        n.f(this.g0, this.p0);
        this.p0.flip();
        this.p0.get(this.n0);
        int n8 = W.f(this.n0);
        this.p0.get(this.n0);
        int n9 = W.f(this.n0);
        i8.D(l8 + 30L + (long)n8 + (long)n9);
        if (i8.k() + i8.getCompressedSize() <= this.u0) {
            return new int[]{n8, n9};
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("data for ");
        stringBuilder.append(i8.getName());
        stringBuilder.append(" overlaps with central directory.");
        throw new IOException(stringBuilder.toString());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void L(I i8) throws IOException {
        N n8 = i8.n(F.g0);
        if (n8 != null && !(n8 instanceof F)) {
            throw new ZipException("archive contains unparseable zip64 extra field");
        }
        if ((n8 = (F)n8) == null) return;
        long l8 = i8.getSize();
        boolean bl = false;
        boolean bl2 = l8 == 0xFFFFFFFFL;
        boolean bl3 = i8.getCompressedSize() == 0xFFFFFFFFL;
        boolean bl4 = i8.t() == 0xFFFFFFFFL;
        if (i8.l() == 65535L) {
            bl = true;
        }
        ((F)n8).m(bl2, bl3, bl4, bl);
        if (bl2) {
            l8 = ((F)n8).l().d();
            if (l8 < 0L) throw new IOException("broken archive, entry with negative size");
            i8.setSize(l8);
        } else if (bl3) {
            ((F)n8).q(new K(i8.getSize()));
        }
        if (bl3) {
            l8 = ((F)n8).e().d();
            if (l8 < 0L) throw new IOException("broken archive, entry with negative compressed size");
            i8.setCompressedSize(l8);
        } else if (bl2) {
            ((F)n8).n(new K(i8.getCompressedSize()));
        }
        if (bl4) {
            i8.K(((F)n8).k().d());
        }
        if (!bl) return;
        i8.E(((F)n8).g().f());
    }

    private void W(int n8) throws IOException {
        long l8 = this.g0.position() + (long)n8;
        if (l8 <= this.g0.size()) {
            this.g0.position(l8);
            return;
        }
        throw new EOFException();
    }

    public static /* synthetic */ LinkedList a(String string) {
        return new LinkedList();
    }

    private ax.Kc.c c(long l8, long l9) {
        if (l8 >= 0L && l9 >= 0L && l8 + l9 >= l8) {
            if (this.g0 instanceof FileChannel) {
                return new c(this, l8, l9);
            }
            return new ax.Kc.e(l8, l9, this.g0);
        }
        throw new IllegalArgumentException("Corrupted archive, stream boundaries are out of range");
    }

    private void d() {
        for (I i8 : this.q) {
            String string = i8.getName();
            ((LinkedList)j.Map._EL.computeIfAbsent(this.c0, (Object)string, (Function)new Q())).addLast(i8);
        }
    }

    private boolean d0() throws IOException {
        this.g0.position(0L);
        this.p0.rewind();
        n.f(this.g0, this.p0);
        return Arrays.equals(this.l0, J.H0);
    }

    private long e(I i8) throws IOException {
        long l8;
        long l9 = l8 = i8.k();
        if (l8 == -1L) {
            this.H(i8);
            l9 = i8.k();
        }
        return l9;
    }

    private Map<I, e> m() throws IOException {
        long l8;
        HashMap<I, e> hashMap = new HashMap<I, e>();
        this.o();
        this.u0 = this.g0.position();
        this.p0.rewind();
        n.f(this.g0, this.p0);
        long l9 = l8 = U.h(this.l0);
        if (l8 != x0) {
            if (!this.d0()) {
                l9 = l8;
            } else {
                throw new IOException("Central directory is empty, can't expand corrupt archive.");
            }
        }
        while (l9 == x0) {
            this.v(hashMap);
            this.p0.rewind();
            n.f(this.g0, this.p0);
            l9 = U.h(this.l0);
        }
        return hashMap;
    }

    private void o() throws IOException {
        this.u();
        long l8 = this.g0.position();
        boolean bl = false;
        boolean bl2 = l8 > 20L;
        if (bl2) {
            SeekableByteChannel seekableByteChannel = this.g0;
            seekableByteChannel.position(seekableByteChannel.position() - 20L);
            this.p0.rewind();
            n.f(this.g0, this.p0);
            bl = Arrays.equals(J.M0, this.l0);
        }
        if (!bl) {
            if (bl2) {
                this.W(16);
            }
            this.p();
            return;
        }
        this.q();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean o0(long l8, long l9, byte[] byArray) throws IOException {
        boolean bl;
        block5: {
            l8 = this.g0.size() - l8;
            long l10 = Math.max(0L, this.g0.size() - l9);
            boolean bl2 = false;
            l9 = l8;
            bl = bl2;
            if (l8 >= 0L) {
                do {
                    l9 = --l8;
                    bl = bl2;
                    if (l8 < l10) break block5;
                    this.g0.position(l8);
                    try {
                        this.p0.rewind();
                        n.f(this.g0, this.p0);
                        this.p0.flip();
                    }
                    catch (EOFException eOFException) {
                        bl = bl2;
                        l9 = l8;
                        break block5;
                    }
                } while (this.p0.get() != byArray[0] || this.p0.get() != byArray[1] || this.p0.get() != byArray[2] || this.p0.get() != byArray[3]);
                bl = true;
                l9 = l8;
            }
        }
        if (bl) {
            this.g0.position(l9);
        }
        return bl;
    }

    private void p() throws IOException {
        long l8;
        if (this.j0) {
            long l9;
            this.W(6);
            this.r0.rewind();
            n.f(this.g0, this.r0);
            this.s0 = W.f(this.n0);
            this.W(8);
            this.p0.rewind();
            n.f(this.g0, this.p0);
            this.t0 = l9 = U.h(this.l0);
            ((Y)this.g0).a(this.s0, l9);
            return;
        }
        this.W(16);
        this.p0.rewind();
        n.f(this.g0, this.p0);
        this.s0 = 0L;
        this.t0 = l8 = U.h(this.l0);
        this.g0.position(l8);
    }

    private void q() throws IOException {
        long l8;
        if (this.j0) {
            this.p0.rewind();
            n.f(this.g0, this.p0);
            l8 = U.h(this.l0);
            this.o0.rewind();
            n.f(this.g0, this.o0);
            long l9 = K.e(this.k0);
            ((Y)this.g0).a(l8, l9);
        } else {
            this.W(4);
            this.o0.rewind();
            n.f(this.g0, this.o0);
            this.g0.position(K.e(this.k0));
        }
        this.p0.rewind();
        n.f(this.g0, this.p0);
        if (Arrays.equals(this.l0, J.L0)) {
            if (this.j0) {
                this.W(16);
                this.p0.rewind();
                n.f(this.g0, this.p0);
                this.s0 = U.h(this.l0);
                this.W(24);
                this.o0.rewind();
                n.f(this.g0, this.o0);
                this.t0 = l8 = K.e(this.k0);
                ((Y)this.g0).a(this.s0, l8);
                return;
            }
            this.W(44);
            this.o0.rewind();
            n.f(this.g0, this.o0);
            this.s0 = 0L;
            this.t0 = l8 = K.e(this.k0);
            this.g0.position(l8);
            return;
        }
        throw new ZipException("Archive's ZIP64 end of central directory locator is corrupt.");
    }

    private void u() throws IOException {
        if (this.o0(22L, 65557L, J.K0)) {
            return;
        }
        throw new ZipException("Archive is not a ZIP archive");
    }

    private void v(Map<I, e> map) throws IOException {
        this.q0.rewind();
        n.f(this.g0, this.q0);
        d d8 = new d();
        int n8 = W.h(this.m0, 0);
        d8.R(n8);
        d8.O(n8 >> 8 & 0xF);
        d8.S(W.h(this.m0, 2));
        Object object = j.f(this.m0, 4);
        boolean bl = ((j)object).m();
        Object object2 = bl ? M.a : this.e0;
        if (bl) {
            d8.N(I.d.c0);
        }
        d8.I((j)object);
        d8.P(W.h(this.m0, 4));
        d8.setMethod(W.h(this.m0, 6));
        d8.setTime(Z.d(U.i(this.m0, 8)));
        d8.setCrc(U.i(this.m0, 12));
        long l8 = U.i(this.m0, 16);
        if (l8 >= 0L) {
            d8.setCompressedSize(l8);
            l8 = U.i(this.m0, 20);
            if (l8 >= 0L) {
                d8.setSize(l8);
                int n9 = W.h(this.m0, 24);
                if (n9 >= 0) {
                    int n10 = W.h(this.m0, 26);
                    if (n10 >= 0) {
                        n8 = W.h(this.m0, 28);
                        if (n8 >= 0) {
                            d8.E(W.h(this.m0, 30));
                            d8.J(W.h(this.m0, 32));
                            d8.F(U.i(this.m0, 34));
                            object = n.h(this.g0, n9);
                            if (((Object)object).length >= n9) {
                                d8.M(object2.a((byte[])object), (byte[])object);
                                d8.K(U.i(this.m0, 38));
                                this.q.add(d8);
                                byte[] byArray = n.h(this.g0, n10);
                                if (byArray.length >= n10) {
                                    try {
                                        d8.B(byArray);
                                    }
                                    catch (RuntimeException runtimeException) {
                                        object2 = new StringBuilder();
                                        ((StringBuilder)object2).append("Invalid extra data in entry ");
                                        ((StringBuilder)object2).append(d8.getName());
                                        object2 = new ZipException(((StringBuilder)object2).toString());
                                        ((Throwable)object2).initCause(runtimeException);
                                        throw object2;
                                    }
                                    this.L(d8);
                                    this.F(d8);
                                    byArray = n.h(this.g0, n8);
                                    if (byArray.length >= n8) {
                                        d8.setComment(object2.a(byArray));
                                        if (!bl && this.h0) {
                                            map.put(d8, new e((byte[])object, byArray));
                                        }
                                        d8.Q(true);
                                        return;
                                    }
                                    throw new EOFException();
                                }
                                throw new EOFException();
                            }
                            throw new EOFException();
                        }
                        throw new IOException("broken archive, entry with negative commentLen");
                    }
                    throw new IOException("broken archive, entry with negative extraLen");
                }
                throw new IOException("broken archive, entry with negative fileNameLen");
            }
            throw new IOException("broken archive, entry with negative size");
        }
        throw new IOException("broken archive, entry with negative compressed size");
    }

    @Override
    public void close() throws IOException {
        this.i0 = true;
        this.g0.close();
    }

    public Enumeration<I> f() {
        return Collections.enumeration(this.q);
    }

    protected void finalize() throws Throwable {
        Throwable throwable2;
        block3: {
            block2: {
                try {
                    if (this.i0) break block2;
                    PrintStream printStream = System.err;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Cleaning up unclosed ZipFile for archive ");
                    stringBuilder.append(this.f0);
                    printStream.println(stringBuilder.toString());
                    this.close();
                }
                catch (Throwable throwable2) {
                    break block3;
                }
            }
            super.finalize();
            return;
        }
        super.finalize();
        throw throwable2;
    }

    public I g(String object) {
        if ((object = this.c0.get(object)) != null) {
            return (I)((LinkedList)object).getFirst();
        }
        return null;
    }

    public InputStream j(I object) throws IOException {
        if (!(object instanceof d)) {
            return null;
        }
        Z.a((I)object);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(this.c(this.e((I)object), ((ZipEntry)object).getCompressedSize()));
        switch (b.a[V.h(((I)object).getMethod()).ordinal()]) {
            default: {
                throw new w(V.h(((I)object).getMethod()), (I)object);
            }
            case 6: {
                return new ax.Gc.a(bufferedInputStream);
            }
            case 5: {
                return new a(bufferedInputStream);
            }
            case 4: {
                object = new Inflater(true);
                return new k(this, new SequenceInputStream(bufferedInputStream, new ByteArrayInputStream(w0)), (Inflater)object, (Inflater)object){
                    final Inflater d0;
                    final S e0;
                    {
                        this.e0 = s8;
                        this.d0 = inflater2;
                        super(inputStream, inflater);
                    }

                    @Override
                    public void close() throws IOException {
                        try {
                            super.close();
                            return;
                        }
                        finally {
                            this.d0.end();
                        }
                    }
                };
            }
            case 3: {
                try {
                    object = new g(((I)object).o().d(), ((I)object).o().c(), bufferedInputStream);
                    return object;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw new IOException("bad IMPLODE data", illegalArgumentException);
                }
            }
            case 2: {
                return new v(bufferedInputStream);
            }
            case 1: 
        }
        return new f(bufferedInputStream);
    }

    private class c
    extends ax.Kc.c {
        private final FileChannel e0;
        final S f0;

        c(S s8, long l8, long l9) {
            this.f0 = s8;
            super(l8, l9);
            this.e0 = (FileChannel)s8.g0;
        }

        @Override
        protected int a(long l8, ByteBuffer byteBuffer) throws IOException {
            int n8 = this.e0.read(byteBuffer, l8);
            byteBuffer.flip();
            return n8;
        }
    }

    private static class d
    extends I {
        d() {
        }

        @Override
        public boolean equals(Object object) {
            if (super.equals(object)) {
                object = (d)object;
                if (this.t() == ((I)object).t() && super.k() == ((I)object).k() && super.l() == ((I)object).l()) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public int hashCode() {
            return super.hashCode() * 3 + (int)this.t() + (int)(this.t() >> 32);
        }
    }

    private static final class e {
        private final byte[] a;
        private final byte[] b;

        private e(byte[] byArray, byte[] byArray2) {
            this.a = byArray;
            this.b = byArray2;
        }
    }

    private static class f
    extends ax.Kc.j
    implements o {
        f(InputStream inputStream) {
            super(inputStream);
        }

        @Override
        public long a() {
            return super.c();
        }
    }
}

