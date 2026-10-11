/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Dc.F;
import ax.Dc.I;
import ax.Dc.J;
import ax.Dc.K;
import ax.Dc.U;
import ax.Dc.W;
import ax.Dc.Z;
import ax.Dc.j;
import ax.Kc.n;
import ax.Q2.g;
import ax.T.l;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.zip.ZipException;

public class e
implements Closeable,
AutoCloseable {
    private static final Logger r0 = g.a(e.class);
    private static final byte[] s0 = new byte[1];
    private static final long t0 = U.h(J.J0);
    private final Map<String, LinkedList<I>> c0;
    private final ax.Rd.c d0;
    private Charset e0;
    private final String f0;
    private final FileChannel g0;
    private Closeable h0;
    private final boolean i0;
    private volatile boolean j0 = true;
    private final byte[] k0;
    private final byte[] l0;
    private final byte[] m0;
    private final byte[] n0;
    private final ByteBuffer o0;
    private final ByteBuffer p0;
    private final List<I> q = new LinkedList<I>();
    private final ByteBuffer q0;

    e(File file) throws IOException {
        this(file, "UTF8", true);
    }

    public e(File object, String object2, boolean bl) throws IOException {
        this.c0 = new HashMap<String, LinkedList<I>>(509);
        byte[] byArray = new byte[8];
        this.k0 = byArray;
        object2 = new byte[4];
        this.l0 = (byte[])object2;
        byte[] byArray2 = new byte[42];
        this.m0 = byArray2;
        this.n0 = new byte[2];
        this.o0 = ByteBuffer.wrap(byArray);
        this.p0 = ByteBuffer.wrap((byte[])object2);
        this.q0 = ByteBuffer.wrap(byArray2);
        this.d0 = new ax.Rd.c(null);
        object2 = ((File)object).getAbsolutePath();
        this.h0 = object = new FileInputStream((File)object);
        object = l.a((FileInputStream)object);
        this.f0 = object2;
        this.i0 = bl;
        this.g0 = object;
        try {
            this.d();
            this.j0 = false;
            return;
        }
        catch (Throwable throwable) {
            this.j0 = true;
            n.a(this.g0);
            throw throwable;
        }
    }

    public e(FileChannel fileChannel) throws IOException {
        this(fileChannel, "unknown archive", "UTF8", true, false);
    }

    private e(FileChannel fileChannel, String string, String object, boolean bl, boolean bl2) throws IOException {
        this.c0 = new HashMap<String, LinkedList<I>>(509);
        byte[] byArray = new byte[8];
        this.k0 = byArray;
        object = new byte[4];
        this.l0 = (byte[])object;
        byte[] byArray2 = new byte[42];
        this.m0 = byArray2;
        this.n0 = new byte[2];
        this.o0 = ByteBuffer.wrap(byArray);
        this.p0 = ByteBuffer.wrap((byte[])object);
        this.q0 = ByteBuffer.wrap(byArray2);
        this.d0 = new ax.Rd.c(null);
        this.f0 = string;
        this.i0 = bl;
        this.g0 = fileChannel;
        try {
            this.d();
            this.j0 = false;
            return;
        }
        catch (Throwable throwable) {
            this.j0 = true;
            if (bl2) {
                n.a(this.g0);
            }
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Charset a(File object) {
        Object object2;
        Object object3;
        block20: {
            RuntimeException var0_4;
            Object var4_9;
            block18: {
                block19: {
                    Object object4;
                    Object var3_8 = null;
                    var4_9 = null;
                    object3 = object4 = null;
                    object3 = object4;
                    object2 = new e((File)object);
                    object = ((e)object2).c();
                    try {
                        ((e)object2).close();
                        return object;
                    }
                    catch (IOException iOException) {
                        return object;
                    }
                    catch (Throwable throwable) {
                        object3 = object2;
                        break block18;
                    }
                    catch (IOException iOException) {
                        object = object2;
                        object2 = iOException;
                        break block19;
                    }
                    catch (RuntimeException runtimeException) {
                        object = object2;
                        break block20;
                    }
                    catch (Throwable throwable) {
                        break block18;
                    }
                    catch (IOException iOException) {
                        object = var3_8;
                    }
                }
                object3 = object;
                {
                    ((Throwable)object2).printStackTrace();
                    object3 = object;
                    object2 = Charset.defaultCharset();
                    if (object == null) return object2;
                }
                try {
                    ((e)object).close();
                    return object2;
                }
                catch (IOException iOException) {
                    return object2;
                }
            }
            if (object3 == null) throw var0_4;
            try {
                ((e)object3).close();
            }
            catch (IOException iOException) {
                throw var0_4;
            }
            throw var0_4;
            catch (RuntimeException runtimeException) {
                object = var4_9;
            }
        }
        object3 = object;
        {
            object2 = Charset.defaultCharset();
            if (object == null) return object2;
        }
        try {
            ((e)object).close();
            return object2;
        }
        catch (IOException iOException) {
            return object2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Charset b(FileDescriptor object) {
        RuntimeException var0_6;
        FileInputStream fileInputStream;
        block41: {
            Charset charset;
            block43: {
                Charset charset2;
                block40: {
                    FileChannel fileChannel;
                    block42: {
                        Object object2;
                        block38: {
                            block36: {
                                block39: {
                                    block37: {
                                        Object object3;
                                        fileInputStream = new FileInputStream((FileDescriptor)object);
                                        fileChannel = l.a(fileInputStream);
                                        charset = null;
                                        object2 = object3 = null;
                                        object2 = object3;
                                        object2 = object = new e(fileChannel);
                                        charset = ((e)object).c();
                                        try {
                                            ((e)object).close();
                                        }
                                        catch (IOException iOException) {
                                            // empty catch block
                                        }
                                        if (fileChannel != null) {
                                            try {
                                                fileChannel.close();
                                            }
                                            catch (IOException iOException) {}
                                        }
                                        try {
                                            fileInputStream.close();
                                            return charset;
                                        }
                                        catch (IOException iOException) {
                                            return charset;
                                        }
                                        catch (Throwable throwable) {
                                            break block36;
                                        }
                                        catch (IOException iOException) {
                                            break block37;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            break block38;
                                        }
                                        catch (Throwable throwable) {
                                            break block36;
                                        }
                                        catch (IOException iOException) {
                                            object = null;
                                        }
                                    }
                                    object2 = object;
                                    {
                                        ((Throwable)((Object)charset2)).printStackTrace();
                                        object2 = object;
                                        charset2 = Charset.defaultCharset();
                                        if (object == null) break block39;
                                    }
                                    try {
                                        ((e)object).close();
                                    }
                                    catch (IOException iOException) {
                                        // empty catch block
                                    }
                                }
                                if (fileChannel == null) break block40;
                                try {
                                    fileChannel.close();
                                    break block40;
                                }
                                catch (IOException iOException) {}
                            }
                            if (object2 != null) {
                                try {
                                    ((e)object2).close();
                                }
                                catch (IOException iOException) {
                                    // empty catch block
                                }
                            }
                            if (fileChannel == null) break block41;
                            try {
                                fileChannel.close();
                                break block41;
                            }
                            catch (IOException iOException) {}
                            catch (RuntimeException runtimeException) {
                                object = charset;
                            }
                        }
                        object2 = object;
                        {
                            charset = Charset.defaultCharset();
                            if (object == null) break block42;
                        }
                        try {
                            ((e)object).close();
                        }
                        catch (IOException iOException) {
                            // empty catch block
                        }
                    }
                    if (fileChannel == null) break block43;
                    try {
                        fileChannel.close();
                        break block43;
                    }
                    catch (IOException iOException) {}
                }
                try {
                    fileInputStream.close();
                    return charset2;
                }
                catch (IOException iOException) {
                    return charset2;
                }
            }
            try {
                fileInputStream.close();
                return charset;
            }
            catch (IOException iOException) {
                return charset;
            }
        }
        try {
            fileInputStream.close();
        }
        catch (IOException iOException) {
            throw var0_6;
        }
        throw var0_6;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Map<I, c> d() throws IOException {
        long l8;
        HashMap<I, c> hashMap = new HashMap<I, c>();
        this.e();
        this.p0.rewind();
        n.f(this.g0, this.p0);
        long l9 = l8 = U.h(this.l0);
        if (l8 != t0) {
            if (this.q()) throw new IOException("central directory is empty, can't expand corrupt archive.");
            l9 = l8;
        }
        while (l9 == t0) {
            this.m(hashMap);
            if (this.d0.c() != null) break;
            this.p0.rewind();
            n.f(this.g0, this.p0);
            l9 = U.h(this.l0);
        }
        this.d0.a();
        String string = this.d0.c();
        if (string == null) return hashMap;
        Logger logger = r0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("zip file encoding detected :");
        stringBuilder.append(string);
        logger.fine(stringBuilder.toString());
        try {
            this.e0 = Charset.forName(string);
            return hashMap;
        }
        catch (IllegalCharsetNameException | UnsupportedCharsetException illegalArgumentException) {
            return hashMap;
        }
    }

    private void e() throws IOException {
        this.j();
        long l8 = this.g0.position();
        boolean bl = false;
        boolean bl2 = l8 > 20L;
        if (bl2) {
            FileChannel fileChannel = this.g0;
            fileChannel.position(fileChannel.position() - 20L);
            this.p0.rewind();
            n.f(this.g0, this.p0);
            bl = Arrays.equals(J.M0, this.l0);
        }
        if (!bl) {
            if (bl2) {
                this.p(16);
            }
            this.f();
            return;
        }
        this.g();
    }

    private void f() throws IOException {
        this.p(16);
        this.p0.rewind();
        n.f(this.g0, this.p0);
        this.g0.position(U.h(this.l0));
    }

    private void g() throws IOException {
        this.p(4);
        this.o0.rewind();
        n.f(this.g0, this.o0);
        this.g0.position(K.e(this.k0));
        this.p0.rewind();
        n.f(this.g0, this.p0);
        if (Arrays.equals(this.l0, J.L0)) {
            this.p(44);
            this.o0.rewind();
            n.f(this.g0, this.o0);
            this.g0.position(K.e(this.k0));
            return;
        }
        throw new ZipException("archive's ZIP64 end of central directory locator is corrupt.");
    }

    private void j() throws IOException {
        if (this.u(22L, 65557L, J.K0)) {
            return;
        }
        throw new ZipException("archive is not a ZIP archive");
    }

    private void m(Map<I, c> map) throws IOException {
        this.q0.rewind();
        n.f(this.g0, this.q0);
        b b8 = new b();
        int n8 = W.h(this.m0, 0);
        b8.R(n8);
        b8.O(n8 >> 8 & 0xF);
        b8.S(W.h(this.m0, 2));
        Object object = j.f(this.m0, 4);
        boolean bl = ((j)object).m();
        if (bl) {
            b8.N(I.d.c0);
        }
        b8.I((j)object);
        b8.P(W.h(this.m0, 4));
        b8.setMethod(W.h(this.m0, 6));
        b8.setTime(Z.d(U.i(this.m0, 8)));
        b8.setCrc(U.i(this.m0, 12));
        b8.setCompressedSize(U.i(this.m0, 16));
        b8.setSize(U.i(this.m0, 20));
        int n9 = W.h(this.m0, 24);
        int n10 = W.h(this.m0, 26);
        int n11 = W.h(this.m0, 28);
        n8 = W.h(this.m0, 30);
        b8.J(W.h(this.m0, 32));
        b8.F(U.i(this.m0, 34));
        object = new byte[n9];
        n.f(this.g0, ByteBuffer.wrap((byte[])object));
        this.d0.d((byte[])object, 0, n9);
        b8.K(U.i(this.m0, 38));
        this.q.add(b8);
        byte[] byArray = new byte[n10];
        n.f(this.g0, ByteBuffer.wrap(byArray));
        b8.B(byArray);
        this.o(b8, n8);
        byArray = new byte[n11];
        n.f(this.g0, ByteBuffer.wrap(byArray));
        if (!bl && this.i0) {
            map.put(b8, new c((byte[])object, byArray));
        }
    }

    private void o(I i8, int n8) throws IOException {
        F f8 = (F)i8.n(F.g0);
        if (f8 != null) {
            long l8 = i8.getSize();
            boolean bl = false;
            boolean bl2 = l8 == 0xFFFFFFFFL;
            boolean bl3 = i8.getCompressedSize() == 0xFFFFFFFFL;
            boolean bl4 = i8.t() == 0xFFFFFFFFL;
            if (n8 == 65535) {
                bl = true;
            }
            f8.m(bl2, bl3, bl4, bl);
            if (bl2) {
                i8.setSize(f8.l().d());
            } else if (bl3) {
                f8.q(new K(i8.getSize()));
            }
            if (bl3) {
                i8.setCompressedSize(f8.e().d());
            } else if (bl2) {
                f8.n(new K(i8.getCompressedSize()));
            }
            if (bl4) {
                i8.K(f8.k().d());
            }
        }
    }

    private void p(int n8) throws IOException {
        long l8 = this.g0.position() + (long)n8;
        if (l8 <= this.g0.size()) {
            this.g0.position(l8);
            return;
        }
        throw new EOFException();
    }

    private boolean q() throws IOException {
        this.g0.position(0L);
        this.p0.rewind();
        n.f(this.g0, this.p0);
        return Arrays.equals(this.l0, J.H0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean u(long l8, long l9, byte[] byArray) throws IOException {
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

    public Charset c() {
        Charset charset = this.e0;
        if (charset != null) {
            return charset;
        }
        return Charset.defaultCharset();
    }

    @Override
    public void close() throws IOException {
        this.j0 = true;
        this.g0.close();
        Closeable closeable = this.h0;
        if (closeable != null) {
            closeable.close();
        }
    }

    protected void finalize() throws Throwable {
        Throwable throwable2;
        block3: {
            block2: {
                try {
                    if (this.j0) break block2;
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

    private static class b
    extends I {
        b() {
        }

        @Override
        public boolean equals(Object object) {
            if (super.equals(object)) {
                object = (b)object;
                if (this.t() == ((I)object).t() && this.k() == ((I)object).k()) {
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

    private static final class c {
        private final byte[] a;
        private final byte[] b;

        private c(byte[] byArray, byte[] byArray2) {
            this.a = byArray;
            this.b = byArray2;
        }
    }
}

