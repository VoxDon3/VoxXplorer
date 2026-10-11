/*
 * Decompiled with CFR 0.152.
 */
package ax.Bc;

import ax.Bc.c;
import ax.Bc.d;
import ax.Bc.e;
import ax.Bc.g;
import ax.Bc.i;
import ax.Bc.l;
import ax.Bc.m;
import ax.Bc.o;
import ax.Bc.p;
import ax.Bc.q;
import ax.Bc.s;
import ax.Bc.t;
import ax.Bc.u;
import ax.Kc.f;
import ax.zc.a;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.ToLongFunction;
import java.util.zip.CRC32;

public class n
implements Closeable,
AutoCloseable {
    static final byte[] m0 = new byte[]{55, 122, -68, -81, 39, 28};
    private static final CharsetEncoder n0 = StandardCharsets.UTF_16LE.newEncoder();
    private SeekableByteChannel c0;
    private final ax.Bc.b d0;
    private int e0;
    private int f0;
    private InputStream g0;
    private byte[] h0;
    private final o i0;
    private long j0;
    private long k0;
    private final ArrayList<InputStream> l0;
    private final String q;

    public n(File file) throws IOException {
        this(file, o.d);
    }

    public n(File file, o o8) throws IOException {
        this(file, null, o8);
    }

    public n(File file, char[] cArray) throws IOException {
        this(file, cArray, o.d);
    }

    public n(File file, char[] cArray, o o8) throws IOException {
        this(j.Files.newByteChannel((j.Path)j.FileRetargetClass.toPath((File)file), EnumSet.of(j.StandardOpenOption.READ), (j.FileAttribute[])new j.FileAttribute[0]), file.getAbsolutePath(), n.n1(cArray), true, o8);
    }

    public n(SeekableByteChannel seekableByteChannel) throws IOException {
        this(seekableByteChannel, o.d);
    }

    public n(SeekableByteChannel seekableByteChannel, o o8) throws IOException {
        this(seekableByteChannel, "unknown archive", null, o8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private n(SeekableByteChannel seekableByteChannel, String string, byte[] byArray, boolean bl, o o8) throws IOException {
        Throwable throwable2;
        block3: {
            this.e0 = -1;
            this.f0 = -1;
            this.l0 = new ArrayList();
            this.c0 = seekableByteChannel;
            this.q = string;
            this.i0 = o8;
            try {
                this.d0 = this.G0(byArray);
                if (byArray != null) {
                    this.h0 = Arrays.copyOf(byArray, byArray.length);
                    return;
                }
            }
            catch (Throwable throwable2) {
                break block3;
            }
            this.h0 = null;
            return;
        }
        if (!bl) throw throwable2;
        this.c0.close();
        throw throwable2;
    }

    public n(SeekableByteChannel seekableByteChannel, String string, char[] cArray, o o8) throws IOException {
        this(seekableByteChannel, string, n.n1(cArray), false, o8);
    }

    public n(SeekableByteChannel seekableByteChannel, char[] cArray) throws IOException {
        this(seekableByteChannel, cArray, o.d);
    }

    public n(SeekableByteChannel seekableByteChannel, char[] cArray, o o8) throws IOException {
        this(seekableByteChannel, "unknown archive", cArray, o8);
    }

    private static long A(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 8) {
            return byteBuffer.getLong();
        }
        throw new EOFException();
    }

    private void A0(ByteBuffer object, ax.Bc.b b8) throws IOException {
        int n8 = (int)n.Z0((ByteBuffer)object);
        HashMap<Integer, l> hashMap = new HashMap<Integer, l>();
        BitSet bitSet = null;
        Object object22 = null;
        Object object3 = null;
        while (true) {
            Object object4;
            Object object5;
            Object object6;
            block35: {
                int n9;
                int n10 = n.H((ByteBuffer)object);
                int n11 = 0;
                int n12 = 0;
                int n13 = 0;
                int n14 = 0;
                if (n10 == 0) {
                    n9 = 0;
                    n14 = 0;
                    for (n13 = 0; n13 < n8; ++n13) {
                        object = (l)hashMap.get(n13);
                        if (object == null) continue;
                        boolean bl = true;
                        boolean bl2 = bitSet == null || !bitSet.get(n13);
                        ((l)object).E(bl2);
                        if (((l)object).o()) {
                            if (b8.f != null) {
                                ((l)object).z(false);
                                ((l)object).t(false);
                                ((l)object).B(b8.f.b.get(n14));
                                ((l)object).x(b8.f.c[n14]);
                                ((l)object).J(b8.f.a[n14]);
                                if (((l)object).getSize() >= 0L) {
                                    ++n14;
                                    continue;
                                }
                                throw new IOException("broken archive, entry with negative size");
                            }
                            throw new IOException("Archive contains file with streams but no subStreamsInfo");
                        }
                        bl2 = object22 == null || !((BitSet)object22).get(n9);
                        ((l)object).z(bl2);
                        bl2 = object3 != null && ((BitSet)object3).get(n9) ? bl : false;
                        ((l)object).t(bl2);
                        ((l)object).B(false);
                        ((l)object).J(0L);
                        ++n9;
                    }
                    object = new ArrayList();
                    for (Object object22 : hashMap.values()) {
                        if (object22 == null) continue;
                        object.add(object22);
                    }
                    b8.g = object.toArray(l.t0);
                    this.f(b8);
                    return;
                }
                long l8 = n.Z0((ByteBuffer)object);
                if (n10 != 25) {
                    switch (n10) {
                        default: {
                            n.k1((ByteBuffer)object, l8);
                            object6 = bitSet;
                            object5 = object22;
                            object4 = object3;
                            break;
                        }
                        case 21: {
                            BitSet bitSet2 = this.d0((ByteBuffer)object, n8);
                            n.H((ByteBuffer)object);
                            while (true) {
                                object6 = bitSet;
                                object5 = object22;
                                object4 = object3;
                                if (n14 < n8) {
                                    this.g(hashMap, n14);
                                    object6 = (l)hashMap.get(n14);
                                    ((l)object6).F(bitSet2.get(n14));
                                    if (((l)object6).m()) {
                                        ((l)object6).K(n.v((ByteBuffer)object));
                                    }
                                    ++n14;
                                    continue;
                                }
                                break block35;
                                break;
                            }
                        }
                        case 20: {
                            BitSet bitSet2 = this.d0((ByteBuffer)object, n8);
                            n.H((ByteBuffer)object);
                            n14 = n11;
                            while (true) {
                                object6 = bitSet;
                                object5 = object22;
                                object4 = object3;
                                if (n14 < n8) {
                                    this.g(hashMap, n14);
                                    object6 = (l)hashMap.get(n14);
                                    ((l)object6).D(bitSet2.get(n14));
                                    if (((l)object6).l()) {
                                        ((l)object6).G(n.A((ByteBuffer)object));
                                    }
                                    ++n14;
                                    continue;
                                }
                                break block35;
                                break;
                            }
                        }
                        case 19: {
                            BitSet bitSet2 = this.d0((ByteBuffer)object, n8);
                            n.H((ByteBuffer)object);
                            n14 = n12;
                            while (true) {
                                object6 = bitSet;
                                object5 = object22;
                                object4 = object3;
                                if (n14 < n8) {
                                    this.g(hashMap, n14);
                                    object6 = (l)hashMap.get(n14);
                                    ((l)object6).A(bitSet2.get(n14));
                                    if (((l)object6).i()) {
                                        ((l)object6).s(n.A((ByteBuffer)object));
                                    }
                                    ++n14;
                                    continue;
                                }
                                break block35;
                                break;
                            }
                        }
                        case 18: {
                            BitSet bitSet2 = this.d0((ByteBuffer)object, n8);
                            n.H((ByteBuffer)object);
                            n14 = n13;
                            while (true) {
                                object6 = bitSet;
                                object5 = object22;
                                object4 = object3;
                                if (n14 < n8) {
                                    this.g(hashMap, n14);
                                    object6 = (l)hashMap.get(n14);
                                    ((l)object6).C(bitSet2.get(n14));
                                    if (((l)object6).k()) {
                                        ((l)object6).y(n.A((ByteBuffer)object));
                                    }
                                    ++n14;
                                    continue;
                                }
                                break block35;
                                break;
                            }
                        }
                        case 17: {
                            n.H((ByteBuffer)object);
                            n10 = (int)(l8 - 1L);
                            object6 = new byte[n10];
                            n.j((ByteBuffer)object, (byte[])object6);
                            n12 = 0;
                            n13 = 0;
                            for (n9 = 0; n9 < n10; n9 += 2) {
                                n11 = n12;
                                n14 = n13;
                                if (object6[n9] == false) {
                                    n11 = n12;
                                    n14 = n13;
                                    if (object6[n9 + 1] == false) {
                                        this.g(hashMap, n13);
                                        ((l)hashMap.get(n13)).I(new String((byte[])object6, n12, n9 - n12, StandardCharsets.UTF_16LE));
                                        n14 = n13 + 1;
                                        n11 = n9 + 2;
                                    }
                                }
                                n12 = n11;
                                n13 = n14;
                            }
                            if (n12 == n10 && n13 == n8) {
                                object6 = bitSet;
                                object5 = object22;
                                object4 = object3;
                                break;
                            }
                            throw new IOException("Error parsing file names");
                        }
                        case 16: {
                            object4 = this.s0((ByteBuffer)object, bitSet.cardinality());
                            object6 = bitSet;
                            object5 = object22;
                            break;
                        }
                        case 15: {
                            object5 = this.s0((ByteBuffer)object, bitSet.cardinality());
                            object6 = bitSet;
                            object4 = object3;
                            break;
                        }
                        case 14: {
                            object6 = this.s0((ByteBuffer)object, n8);
                            object5 = object22;
                            object4 = object3;
                            break;
                        }
                    }
                } else {
                    n.k1((ByteBuffer)object, l8);
                    object4 = object3;
                    object5 = object22;
                    object6 = bitSet;
                }
            }
            bitSet = object6;
            object22 = object5;
            object3 = object4;
        }
    }

    private i C0(ByteBuffer byteBuffer) throws IOException {
        Object object;
        int n8;
        int n9;
        i i8 = new i();
        int n10 = (int)n.Z0(byteBuffer);
        Object object2 = new e[n10];
        long l8 = 0L;
        int n11 = 0;
        long l9 = 0L;
        for (n9 = 0; n9 < n10; ++n9) {
            object2[n9] = new e();
            int n12 = n.H(byteBuffer);
            boolean bl = true;
            n8 = (n12 & 0x10) == 0 ? 1 : 0;
            boolean bl2 = (n12 & 0x20) != 0;
            if ((n12 & 0x80) == 0) {
                bl = false;
            }
            e e8 = object2[n9];
            object = new byte[n12 & 0xF];
            e8.a = (byte[])object;
            n.j(byteBuffer, (byte[])object);
            if (n8 != 0) {
                object = object2[n9];
                object.b = 1L;
                object.c = 1L;
            } else {
                object2[n9].b = n.Z0(byteBuffer);
                object2[n9].c = n.Z0(byteBuffer);
            }
            object = object2[n9];
            l8 += object.b;
            l9 += object.c;
            if (bl2) {
                long l10 = n.Z0(byteBuffer);
                e8 = object2[n9];
                object = new byte[(int)l10];
                e8.d = (byte[])object;
                n.j(byteBuffer, (byte[])object);
            }
            if (!bl) {
                continue;
            }
            throw new IOException("Alternative methods are unsupported, please report. The reference implementation doesn't support them either.");
        }
        i8.a = object2;
        i8.b = l8;
        i8.c = l9--;
        n8 = (int)l9;
        object = new c[n8];
        for (n9 = 0; n9 < n8; ++n9) {
            object[n9] = object2 = new c();
            object2.a = n.Z0(byteBuffer);
            object[n9].b = n.Z0(byteBuffer);
        }
        i8.d = object;
        l9 = l8 - l9;
        n8 = (int)l9;
        object2 = new long[n8];
        if (l9 == 1L) {
            for (n9 = 0; n9 < (int)l8 && i8.a(n9) >= 0; ++n9) {
            }
            object2[0] = (e)((long)n9);
        } else {
            for (n9 = n11; n9 < n8; ++n9) {
                object2[n9] = (e)n.Z0(byteBuffer);
            }
        }
        i8.e = (long[])object2;
        return i8;
    }

    private void D0(ByteBuffer byteBuffer) throws IOException {
        byteBuffer.rewind();
        ax.Kc.n.f(this.c0, byteBuffer);
        byteBuffer.flip();
    }

    private void F0(ByteBuffer byteBuffer, ax.Bc.b b8) throws IOException {
        int n8;
        int n9 = byteBuffer.position();
        this.c1(byteBuffer).r(this.i0.a());
        byteBuffer.position(n9);
        n9 = n8 = n.H(byteBuffer);
        if (n8 == 2) {
            this.o0(byteBuffer);
            n9 = n.H(byteBuffer);
        }
        if (n9 != 3) {
            n8 = n9;
            if (n9 == 4) {
                this.T0(byteBuffer, b8);
                n8 = n.H(byteBuffer);
            }
            if (n8 == 5) {
                this.A0(byteBuffer, b8);
                n.H(byteBuffer);
            }
            return;
        }
        throw new IOException("Additional streams unsupported");
    }

    private ax.Bc.b G0(byte[] byArray) throws IOException {
        ByteBuffer byteBuffer = ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN);
        this.D0(byteBuffer);
        byte[] byArray2 = new byte[6];
        byteBuffer.get(byArray2);
        if (Arrays.equals(byArray2, m0)) {
            byte by = byteBuffer.get();
            byte by2 = byteBuffer.get();
            if (by == 0) {
                long l8;
                block5: {
                    l8 = (long)byteBuffer.getInt() & 0xFFFFFFFFL;
                    if (l8 == 0L) {
                        long l9 = this.c0.position();
                        byteBuffer = ByteBuffer.allocate(20);
                        this.D0(byteBuffer);
                        this.c0.position(l9);
                        while (byteBuffer.hasRemaining()) {
                            if (byteBuffer.get() == 0) continue;
                            break block5;
                        }
                        if (this.i0.b()) {
                            return this.m1(byArray);
                        }
                        throw new IOException("archive seems to be invalid.\nYou may want to retry and enable the tryToRecoverBrokenArchives if the archive could be a multi volume archive that has been closed prematurely.");
                    }
                }
                return this.W(this.M0(l8), byArray, true);
            }
            throw new IOException(String.format("Unsupported 7z version (%d,%d)", by, by2));
        }
        throw new IOException("Bad 7z signature");
    }

    private static int H(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 0xFF;
        }
        throw new EOFException();
    }

    private boolean L() {
        if (!this.l0.isEmpty()) {
            Object object = this.l0;
            boolean bl = (object = ((ArrayList)object).get(((ArrayList)object).size() - 1)) instanceof ax.Kc.g && ((ax.Kc.g)object).a() != this.d0.g[this.e0].getSize();
            if (object instanceof ax.Kc.d) {
                return ((ax.Kc.d)object).a() != this.d0.g[this.e0].getSize();
            }
            return bl;
        }
        return false;
    }

    private void L0(ByteBuffer byteBuffer, ax.Bc.b b8) throws IOException {
        b8.a = n.Z0(byteBuffer);
        int n8 = (int)n.Z0(byteBuffer);
        int n9 = n.H(byteBuffer);
        int n10 = 0;
        int n11 = n9;
        if (n9 == 9) {
            long[] lArray;
            b8.b = new long[n8];
            for (n11 = 0; n11 < (lArray = b8.b).length; ++n11) {
                lArray[n11] = n.Z0(byteBuffer);
            }
            n11 = n.H(byteBuffer);
        }
        if (n11 == 10) {
            b8.c = this.d0(byteBuffer, n8);
            b8.d = new long[n8];
            for (n11 = n10; n11 < n8; ++n11) {
                if (!b8.c.get(n11)) continue;
                b8.d[n11] = (long)n.v(byteBuffer) & 0xFFFFFFFFL;
            }
            n.H(byteBuffer);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private s M0(long l8) throws IOException {
        Throwable throwable2;
        DataInputStream dataInputStream;
        block9: {
            Object object;
            block7: {
                block8: {
                    object = new s();
                    dataInputStream = new DataInputStream(new ax.Kc.g(new d(this.c0, 20L), 20L, l8));
                    try {
                        long l9;
                        ((s)object).a = l8 = Long.reverseBytes(dataInputStream.readLong());
                        if (l8 < 0L || l8 + 32L > this.c0.size()) break block7;
                        ((s)object).b = l9 = Long.reverseBytes(dataInputStream.readLong());
                        l8 = ((s)object).a;
                        if ((l9 += l8) < l8 || l9 + 32L > this.c0.size()) break block8;
                        ((s)object).c = (long)Integer.reverseBytes(dataInputStream.readInt()) & 0xFFFFFFFFL;
                    }
                    catch (Throwable throwable2) {}
                    ((InputStream)dataInputStream).close();
                    return object;
                }
                object = new IOException("nextHeaderSize is out of bounds");
                throw object;
                break block9;
            }
            object = new IOException("nextHeaderOffset is out of bounds");
            throw object;
        }
        try {
            throw throwable2;
        }
        catch (Throwable throwable3) {
            try {
                ((InputStream)dataInputStream).close();
                throw throwable3;
            }
            catch (Throwable throwable4) {
                throwable2.addSuppressed(throwable4);
            }
            throw throwable3;
        }
    }

    private void T0(ByteBuffer byteBuffer, ax.Bc.b b8) throws IOException {
        int n8;
        int n9 = n8 = n.H(byteBuffer);
        if (n8 == 6) {
            this.L0(byteBuffer, b8);
            n9 = n.H(byteBuffer);
        }
        if (n9 == 7) {
            this.a1(byteBuffer, b8);
            n9 = n.H(byteBuffer);
        } else {
            b8.e = i.j;
        }
        if (n9 == 8) {
            this.Y0(byteBuffer, b8);
            n.H(byteBuffer);
        }
    }

    private ax.Bc.b W(s object, byte[] byArray, boolean bl) throws IOException {
        Object object2;
        n.c("nextHeaderSize", ((s)object).b);
        int n8 = (int)((s)object).b;
        this.c0.position(((s)object).a + 32L);
        ByteBuffer byteBuffer = ByteBuffer.allocate(n8).order(ByteOrder.LITTLE_ENDIAN);
        this.D0(byteBuffer);
        if (bl) {
            object2 = new CRC32();
            object2.update(byteBuffer.array());
            if (((s)object).c != ((CRC32)object2).getValue()) {
                throw new IOException("NextHeader CRC mismatch");
            }
        }
        ax.Bc.b b8 = new ax.Bc.b();
        int n9 = n.H(byteBuffer);
        object2 = byteBuffer;
        object = b8;
        n8 = n9;
        if (n9 == 23) {
            object2 = this.u0(byteBuffer, b8, byArray);
            object = new ax.Bc.b();
            n8 = n.H((ByteBuffer)object2);
        }
        if (n8 == 1) {
            this.F0((ByteBuffer)object2, (ax.Bc.b)object);
            ((ax.Bc.b)object).f = null;
            return object;
        }
        throw new IOException("Broken or unsupported archive: no Header");
    }

    private void Y0(ByteBuffer byteBuffer, ax.Bc.b b8) throws IOException {
        int n8;
        int n9;
        i[] iArray;
        int n10;
        long l8;
        Object[] objectArray;
        int n11;
        Object object = b8.e;
        int n12 = ((i[])object).length;
        for (n11 = 0; n11 < n12; ++n11) {
            object[n11].i = 1;
        }
        long l9 = b8.e.length;
        n12 = n11 = n.H(byteBuffer);
        if (n11 == 13) {
            objectArray = b8.e;
            n12 = objectArray.length;
            l9 = 0L;
            for (n11 = 0; n11 < n12; ++n11) {
                object = objectArray[n11];
                l8 = n.Z0(byteBuffer);
                object.i = (int)l8;
                l9 += l8;
            }
            n12 = n.H(byteBuffer);
        }
        n11 = (int)l9;
        object = new u();
        object.a = new long[n11];
        object.b = new BitSet(n11);
        object.c = new long[n11];
        objectArray = b8.e;
        int n13 = objectArray.length;
        n11 = 0;
        for (n10 = 0; n10 < n13; ++n10) {
            iArray = objectArray[n10];
            if (iArray.i == 0) continue;
            l9 = 0L;
            n9 = n11;
            l8 = l9;
            if (n12 == 9) {
                n8 = 0;
                while (true) {
                    n9 = ++n11;
                    l8 = l9;
                    if (n8 >= iArray.i - 1) break;
                    object.a[n11] = l8 = n.Z0(byteBuffer);
                    l9 += l8;
                    ++n8;
                }
            }
            if (l8 <= iArray.d()) {
                object.a[n9] = iArray.d() - l8;
                n11 = n9 + 1;
                continue;
            }
            throw new IOException("sum of unpack sizes of folder exceeds total unpack size");
        }
        n11 = n12;
        if (n12 == 9) {
            n11 = n.H(byteBuffer);
        }
        objectArray = b8.e;
        n8 = objectArray.length;
        n12 = 0;
        for (n10 = 0; n10 < n8; ++n10) {
            block19: {
                block18: {
                    iArray = objectArray[n10];
                    n13 = iArray.i;
                    if (n13 != 1) break block18;
                    n9 = n12;
                    if (iArray.g) break block19;
                }
                n9 = n12 + n13;
            }
            n12 = n9;
        }
        if (n11 == 10) {
            BitSet bitSet = this.d0(byteBuffer, n12);
            objectArray = new long[n12];
            for (n11 = 0; n11 < n12; ++n11) {
                if (!bitSet.get(n11)) continue;
                objectArray[n11] = (i)((long)n.v(byteBuffer) & 0xFFFFFFFFL);
            }
            iArray = b8.e;
            int n14 = iArray.length;
            n12 = 0;
            n11 = 0;
            for (n9 = 0; n9 < n14; ++n9) {
                i i8 = iArray[n9];
                if (i8.i == 1 && i8.g) {
                    object.b.set(n12, true);
                    object.c[n12] = i8.h;
                    ++n12;
                    n13 = n11;
                } else {
                    n8 = 0;
                    n10 = n12;
                    while (true) {
                        n12 = ++n10;
                        n13 = ++n11;
                        if (n8 >= i8.i) break;
                        object.b.set(n10, bitSet.get(n11));
                        object.c[n10] = (long)objectArray[n11];
                        ++n8;
                    }
                }
                n11 = n13;
            }
            n.H(byteBuffer);
        }
        b8.f = object;
    }

    private static long Z0(ByteBuffer byteBuffer) throws IOException {
        long l8 = n.H(byteBuffer);
        int n8 = 128;
        long l9 = 0L;
        for (int i8 = 0; i8 < 8; ++i8) {
            if (((long)n8 & l8) == 0L) {
                return (l8 & (long)(n8 - 1)) << i8 * 8 | l9;
            }
            l9 |= (long)n.H(byteBuffer) << i8 * 8;
            n8 >>>= 1;
        }
        return l9;
    }

    private void a1(ByteBuffer byteBuffer, ax.Bc.b object) throws IOException {
        int n8;
        n.H(byteBuffer);
        int n9 = (int)n.Z0(byteBuffer);
        i[] iArray = new i[n9];
        ((ax.Bc.b)object).e = iArray;
        n.H(byteBuffer);
        for (n8 = 0; n8 < n9; ++n8) {
            iArray[n8] = this.C0(byteBuffer);
        }
        n.H(byteBuffer);
        for (n8 = 0; n8 < n9; ++n8) {
            object = iArray[n8];
            n.c("totalOutputStreams", ((i)object).c);
            ((i)object).f = new long[(int)((i)object).c];
            int n10 = 0;
            while ((long)n10 < ((i)object).c) {
                ((i)object).f[n10] = n.Z0(byteBuffer);
                ++n10;
            }
        }
        if (n.H(byteBuffer) == 10) {
            BitSet bitSet = this.d0(byteBuffer, n9);
            for (n8 = 0; n8 < n9; ++n8) {
                if (bitSet.get(n8)) {
                    object = iArray[n8];
                    ((i)object).g = true;
                    ((i)object).h = (long)n.v(byteBuffer) & 0xFFFFFFFFL;
                    continue;
                }
                iArray[n8].g = false;
            }
            n.H(byteBuffer);
        }
    }

    static /* synthetic */ long b(n n8, long l8) {
        n8.j0 = l8;
        return l8;
    }

    private void b1(int n8, l l8) throws IOException {
        this.l0.clear();
        Object object = this.g0;
        if (object != null) {
            ((InputStream)object).close();
            this.g0 = null;
        }
        ax.Bc.b b8 = this.d0;
        i i8 = b8.e[n8];
        object = b8.h;
        n8 = ((t)object).a[n8];
        this.g0 = this.d(i8, b8.a + 32L + ((t)object).b[n8], n8, l8);
    }

    private static int c(String string, long l8) throws IOException {
        if (l8 <= Integer.MAX_VALUE && l8 >= 0L) {
            return (int)l8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot handle ");
        stringBuilder.append(string);
        stringBuilder.append(" ");
        stringBuilder.append(l8);
        throw new IOException(stringBuilder.toString());
    }

    private b c1(ByteBuffer comparable) throws IOException {
        int n8;
        b b8 = new b();
        int n9 = n8 = n.H((ByteBuffer)comparable);
        if (n8 == 2) {
            this.d1((ByteBuffer)comparable);
            n9 = n.H((ByteBuffer)comparable);
        }
        if (n9 != 3) {
            n8 = n9;
            if (n9 == 4) {
                this.h1((ByteBuffer)comparable, b8);
                n8 = n.H((ByteBuffer)comparable);
            }
            n9 = n8;
            if (n8 == 5) {
                this.e1((ByteBuffer)comparable, b8);
                n9 = n.H((ByteBuffer)comparable);
            }
            if (n9 == 0) {
                return b8;
            }
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append("Badly terminated header, found ");
            ((StringBuilder)comparable).append(n9);
            throw new IOException(((StringBuilder)comparable).toString());
        }
        throw new IOException("Additional streams unsupported");
    }

    private InputStream d(i i8, long l8, int n8, l l9) throws IOException {
        this.c0.position(l8);
        Object object = new j.InputStreamRetargetInterface(this, new BufferedInputStream(new d(this.c0, this.d0.b[n8]))){
            final n q;
            {
                this.q = n8;
                super(inputStream);
            }

            private void a(int n8) {
                n n9 = this.q;
                n.b(n9, n9.j0 + (long)n8);
            }

            @Override
            public int read() throws IOException {
                int n8 = this.in.read();
                if (n8 >= 0) {
                    this.a(1);
                }
                return n8;
            }

            @Override
            public int read(byte[] byArray) throws IOException {
                return this.read(byArray, 0, byArray.length);
            }

            @Override
            public int read(byte[] byArray, int n8, int n9) throws IOException {
                if (n9 == 0) {
                    return 0;
                }
                if ((n8 = this.in.read(byArray, n8, n9)) >= 0) {
                    this.a(n8);
                }
                return n8;
            }

            @Override
            public /* synthetic */ long transferTo(OutputStream outputStream) {
                return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
            }
        };
        LinkedList<q> linkedList = new LinkedList<q>();
        for (e e8 : i8.c()) {
            if (e8.b == 1L && e8.c == 1L) {
                p p8 = p.d(e8.a);
                object = g.a(this.q, (InputStream)object, i8.e(e8), e8, this.h0, this.i0.a());
                linkedList.addFirst(new q(p8, g.c(p8).e(e8, (InputStream)object)));
                continue;
            }
            throw new IOException("Multi input/output stream coders are not yet supported");
        }
        l9.w(linkedList);
        if (i8.g) {
            return new ax.Kc.g((InputStream)object, i8.d(), i8.h);
        }
        return object;
    }

    private BitSet d0(ByteBuffer object, int n8) throws IOException {
        if (n.H((ByteBuffer)object) != 0) {
            object = new BitSet(n8);
            for (int i8 = 0; i8 < n8; ++i8) {
                ((BitSet)object).set(i8, true);
            }
            return object;
        }
        return this.s0((ByteBuffer)object, n8);
    }

    private void d1(ByteBuffer byteBuffer) throws IOException {
        int n8 = n.H(byteBuffer);
        while (n8 != 0) {
            long l8 = n.c("propertySize", n.Z0(byteBuffer));
            if (n.k1(byteBuffer, l8) >= l8) {
                n8 = n.H(byteBuffer);
                continue;
            }
            throw new IOException("invalid property size");
        }
    }

    private void e(int n8, boolean bl) throws IOException {
        Object object = this.d0;
        Object object2 = ((ax.Bc.b)object).h;
        if (object2 != null) {
            boolean bl2;
            int n9 = object2.d[n8];
            if (n9 < 0) {
                this.l0.clear();
                return;
            }
            object2 = ((ax.Bc.b)object).g;
            l l8 = object2[n8];
            int n10 = this.f0;
            boolean bl3 = false;
            if (n10 == n9) {
                if (n8 > 0) {
                    l8.w(object2[n8 - 1].f());
                }
                if (bl && l8.f() == null) {
                    object2 = this.d0;
                    n10 = object2.h.c[n9];
                    l8.w(object2.g[n10].f());
                }
                bl2 = true;
            } else {
                this.f0 = n9;
                this.b1(n9, l8);
                bl2 = false;
            }
            if (bl) {
                bl3 = this.l1(n8, bl2, n9);
            }
            if (bl && this.e0 == n8 && !bl3) {
                return;
            }
            object = new ax.Kc.d(this.g0, l8.getSize());
            object2 = object;
            if (l8.j()) {
                object2 = new ax.Kc.g((InputStream)object, l8.getSize(), l8.g());
            }
            this.l0.add((InputStream)object2);
            return;
        }
        throw new IOException("Archive doesn't contain stream information to read entries");
    }

    private void e1(ByteBuffer comparable, b b8) throws IOException {
        b.p(b8, n.c("numFiles", n.Z0((ByteBuffer)comparable)));
        int n8 = -1;
        block12: while (true) {
            int n9 = n.H((ByteBuffer)comparable);
            if (n9 == 0) {
                n9 = b8.h;
                if (n8 <= 0) {
                    n8 = 0;
                }
                b.q(b8, n9 - n8);
                return;
            }
            long l8 = n.Z0((ByteBuffer)comparable);
            switch (n9) {
                default: {
                    if (n.k1((ByteBuffer)comparable, l8) >= l8) continue block12;
                    comparable = new StringBuilder();
                    ((StringBuilder)comparable).append("Incomplete property of type ");
                    ((StringBuilder)comparable).append(n9);
                    throw new IOException(((StringBuilder)comparable).toString());
                }
                case 25: {
                    if (n.k1((ByteBuffer)comparable, l8) >= l8) continue block12;
                    throw new IOException("Incomplete kDummy property");
                }
                case 24: {
                    throw new IOException("kStartPos is unsupported, please report");
                }
                case 21: {
                    n9 = this.d0((ByteBuffer)comparable, b8.h).cardinality();
                    if (n.H((ByteBuffer)comparable) == 0) {
                        l8 = n9 * 4;
                        if (n.k1(comparable, l8) >= l8) continue block12;
                        throw new IOException("invalid windows attributes size");
                    }
                    throw new IOException("Not implemented");
                }
                case 20: {
                    n9 = this.d0((ByteBuffer)comparable, b8.h).cardinality();
                    if (n.H((ByteBuffer)comparable) == 0) {
                        l8 = n9 * 8;
                        if (n.k1(comparable, l8) >= l8) continue block12;
                        throw new IOException("invalid modification dates size");
                    }
                    throw new IOException("Not implemented");
                }
                case 19: {
                    n9 = this.d0((ByteBuffer)comparable, b8.h).cardinality();
                    if (n.H((ByteBuffer)comparable) == 0) {
                        l8 = n9 * 8;
                        if (n.k1(comparable, l8) >= l8) continue block12;
                        throw new IOException("invalid access dates size");
                    }
                    throw new IOException("Not implemented");
                }
                case 18: {
                    n9 = this.d0((ByteBuffer)comparable, b8.h).cardinality();
                    if (n.H((ByteBuffer)comparable) == 0) {
                        l8 = n9 * 8;
                        if (n.k1(comparable, l8) >= l8) continue block12;
                        throw new IOException("invalid creation dates size");
                    }
                    throw new IOException("Not implemented");
                }
                case 17: {
                    if (n.H((ByteBuffer)comparable) == 0) {
                        int n10 = n.c("file names length", l8 - 1L);
                        if ((n10 & 1) == 0) {
                            int n11 = 0;
                            for (int i8 = 0; i8 < n10; i8 += 2) {
                                n9 = n11;
                                if (n.m(comparable) == '\u0000') {
                                    n9 = n11 + 1;
                                }
                                n11 = n9;
                            }
                            if (n11 == b8.h) continue block12;
                            comparable = new StringBuilder();
                            ((StringBuilder)comparable).append("Invalid number of file names (");
                            ((StringBuilder)comparable).append(n11);
                            ((StringBuilder)comparable).append(" instead of ");
                            ((StringBuilder)comparable).append(b8.h);
                            ((StringBuilder)comparable).append(")");
                            throw new IOException(((StringBuilder)comparable).toString());
                        }
                        throw new IOException("File names length invalid");
                    }
                    throw new IOException("Not implemented");
                }
                case 16: {
                    if (n8 != -1) {
                        this.s0((ByteBuffer)comparable, n8);
                        continue block12;
                    }
                    throw new IOException("Header format error: kEmptyStream must appear before kAnti");
                }
                case 15: {
                    if (n8 != -1) {
                        this.s0((ByteBuffer)comparable, n8);
                        continue block12;
                    }
                    throw new IOException("Header format error: kEmptyStream must appear before kEmptyFile");
                }
                case 14: 
            }
            n8 = this.s0((ByteBuffer)comparable, b8.h).cardinality();
        }
    }

    private void f(ax.Bc.b b8) throws IOException {
        int n8;
        t t8 = new t();
        Object[] objectArray = b8.e;
        int n9 = objectArray != null ? objectArray.length : 0;
        t8.a = new int[n9];
        int n10 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            t8.a[n8] = n10;
            n10 += b8.e[n8].e.length;
        }
        n8 = b8.b.length;
        t8.b = new long[n8];
        long l8 = 0L;
        for (n10 = 0; n10 < n8; ++n10) {
            t8.b[n10] = l8;
            l8 += b8.b[n10];
        }
        t8.c = new int[n9];
        t8.d = new int[b8.g.length];
        n8 = 0;
        n9 = 0;
        for (int i8 = 0; i8 < (objectArray = b8.g).length; ++i8) {
            int n11;
            if (!((l)objectArray[i8]).o() && n8 == 0) {
                t8.d[i8] = -1;
                continue;
            }
            n10 = n9;
            if (n8 == 0) {
                while (n9 < (objectArray = b8.e).length) {
                    t8.c[n9] = i8;
                    if (((i)objectArray[n9]).i > 0) break;
                    ++n9;
                }
                if (n9 < objectArray.length) {
                    n10 = n9;
                } else {
                    throw new IOException("Too few folders in archive");
                }
            }
            t8.d[i8] = n10;
            if (!b8.g[i8].o()) {
                n9 = n10;
                continue;
            }
            n8 = n11 = n8 + 1;
            n9 = n10;
            if (n11 < b8.e[n10].i) continue;
            n9 = n10 + 1;
            n8 = 0;
        }
        b8.h = t8;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int f1(ByteBuffer byteBuffer, b object) throws IOException {
        int n8;
        int n9;
        long l8;
        int n10 = n.c("numCoders", n.Z0(byteBuffer));
        if (n10 == 0) throw new IOException("Folder without coders");
        b.n((b)object, ((b)object).b + (long)n10);
        int n11 = 0;
        long l9 = 0L;
        long l10 = 0L;
        int n12 = 0;
        while (true) {
            l8 = 1L;
            n9 = 1;
            if (n12 >= n10) break;
            int n13 = n.H(byteBuffer);
            n.j(byteBuffer, new byte[n13 & 0xF]);
            n8 = (n13 & 0x10) == 0 ? 1 : 0;
            if ((n13 & 0x20) == 0) {
                n9 = 0;
            }
            if ((n13 & 0x80) != 0) throw new IOException("Alternative methods are unsupported, please report. The reference implementation doesn't support them either.");
            if (n8 != 0) {
                ++l9;
            } else {
                l9 += (long)n.c("numInStreams", n.Z0(byteBuffer));
                l8 = n.c("numOutStreams", n.Z0(byteBuffer));
            }
            l10 += l8;
            if (n9 != 0) {
                l8 = n.c("propertiesSize", n.Z0(byteBuffer));
                if (n.k1(byteBuffer, l8) < l8) throw new IOException("invalid propertiesSize in folder");
            }
            ++n12;
        }
        n.c("totalInStreams", l9);
        n.c("totalOutStreams", l10);
        b.f((b)object, ((b)object).c + l10);
        b.h((b)object, ((b)object).d + l9);
        if (l10 == 0L) throw new IOException("Total output streams can't be 0");
        n8 = n.c("numBindPairs", l10 - 1L);
        l8 = n8;
        if (l9 < l8) throw new IOException("Total input streams can't be less than the number of bind pairs");
        object = new BitSet((int)l9);
        for (n12 = 0; n12 < n8; ++n12) {
            n9 = n.c("inIndex", n.Z0(byteBuffer));
            if (l9 <= (long)n9) throw new IOException("inIndex is bigger than number of inStreams");
            ((BitSet)object).set(n9);
            if (l10 <= (long)n.c("outIndex", n.Z0(byteBuffer))) throw new IOException("outIndex is bigger than number of outStreams");
        }
        n8 = n.c("numPackedStreams", l9 - l8);
        n12 = n11;
        if (n8 == 1) {
            if (((BitSet)object).nextClearBit(0) == -1) throw new IOException("Couldn't find stream's bind pair index");
            return (int)l10;
        }
        while (n12 < n8) {
            if ((long)n.c("packedStreamIndex", n.Z0(byteBuffer)) >= l9) throw new IOException("packedStreamIndex is bigger than number of totalInStreams");
            ++n12;
        }
        return (int)l10;
    }

    private void g(Map<Integer, l> map, int n8) {
        if (map.get(n8) == null) {
            map.put(n8, new l());
        }
    }

    private void g1(ByteBuffer comparable, b b8) throws IOException {
        long l8;
        long l9 = n.Z0((ByteBuffer)comparable);
        if (l9 >= 0L && (l8 = 32L + l9) <= this.c0.size() && l8 >= 0L) {
            long l10;
            int n8;
            b.b(b8, n.c("numPackStreams", n.Z0(comparable)));
            int n9 = n8 = n.H(comparable);
            if (n8 == 9) {
                l10 = 0L;
                for (n9 = 0; n9 < b8.a; ++n9) {
                    long l11 = n.Z0(comparable);
                    long l12 = l8 + (l10 += l11);
                    if (l11 >= 0L && l12 <= this.c0.size() && l12 >= l9) {
                        continue;
                    }
                    comparable = new StringBuilder();
                    ((StringBuilder)comparable).append("packSize (");
                    ((StringBuilder)comparable).append(l11);
                    ((StringBuilder)comparable).append(") is out of range");
                    throw new IOException(((StringBuilder)comparable).toString());
                }
                n9 = n.H(comparable);
            }
            n8 = n9;
            if (n9 == 10) {
                l10 = this.d0((ByteBuffer)comparable, b8.a).cardinality() * 4;
                if (n.k1(comparable, l10) >= l10) {
                    n8 = n.H(comparable);
                } else {
                    throw new IOException("invalid number of CRCs in PackInfo");
                }
            }
            if (n8 == 0) {
                return;
            }
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append("Badly terminated PackInfo (");
            ((StringBuilder)comparable).append(n8);
            ((StringBuilder)comparable).append(")");
            throw new IOException(((StringBuilder)comparable).toString());
        }
        comparable = new StringBuilder();
        ((StringBuilder)comparable).append("packPos (");
        ((StringBuilder)comparable).append(l9);
        ((StringBuilder)comparable).append(") is out of range");
        throw new IOException(((StringBuilder)comparable).toString());
    }

    private void h1(ByteBuffer byteBuffer, b b8) throws IOException {
        int n8;
        int n9 = n8 = n.H(byteBuffer);
        if (n8 == 6) {
            this.g1(byteBuffer, b8);
            n9 = n.H(byteBuffer);
        }
        n8 = n9;
        if (n9 == 7) {
            this.j1(byteBuffer, b8);
            n8 = n.H(byteBuffer);
        }
        n9 = n8;
        if (n8 == 8) {
            this.i1(byteBuffer, b8);
            n9 = n.H(byteBuffer);
        }
        if (n9 == 0) {
            return;
        }
        throw new IOException("Badly terminated StreamsInfo");
    }

    private void i1(ByteBuffer byteBuffer, b b8) throws IOException {
        Iterator iterator;
        int n8;
        int n9 = n.H(byteBuffer);
        Cloneable cloneable = new LinkedList<Integer>();
        int n10 = 0;
        if (n9 == 13) {
            for (n8 = 0; n8 < b8.f; ++n8) {
                cloneable.add(n.c("numStreams", n.Z0(byteBuffer)));
            }
            b.l(b8, (Long)j.Collection._EL.stream(cloneable).collect(j.Collectors.summingLong((ToLongFunction)new m())));
            n9 = n.H(byteBuffer);
        } else {
            b.l(b8, b8.f);
        }
        n.c("totalUnpackStreams", b8.e);
        n8 = n9;
        if (n9 == 9) {
            iterator = cloneable.iterator();
            while (iterator.hasNext()) {
                n9 = (Integer)iterator.next();
                if (n9 == 0) continue;
                for (n8 = 0; n8 < n9 - 1; ++n8) {
                    if (n.Z0(byteBuffer) >= 0L) {
                        continue;
                    }
                    throw new IOException("negative unpackSize");
                }
            }
            n8 = n.H(byteBuffer);
        }
        if (cloneable.isEmpty()) {
            n9 = b8.g == null ? b8.f : b8.f - b8.g.cardinality();
        } else {
            iterator = cloneable.iterator();
            int n11 = 0;
            n9 = n10;
            n10 = n11;
            while (iterator.hasNext()) {
                int n12 = (Integer)iterator.next();
                n11 = n10;
                if (n12 == 1) {
                    n11 = n10;
                    if (b8.g != null) {
                        cloneable = b8.g;
                        n11 = n10 + 1;
                        if (((BitSet)cloneable).get(n10)) {
                            n10 = n11;
                            continue;
                        }
                    }
                }
                n9 += n12;
                n10 = n11;
            }
        }
        n10 = n8;
        if (n8 == 10) {
            n.c("numDigests", n9);
            long l8 = this.d0(byteBuffer, n9).cardinality() * 4;
            if (n.k1(byteBuffer, l8) >= l8) {
                n10 = n.H(byteBuffer);
            } else {
                throw new IOException("invalid number of missing CRCs in SubStreamInfo");
            }
        }
        if (n10 == 0) {
            return;
        }
        throw new IOException("Badly terminated SubStreamsInfo");
    }

    private static void j(ByteBuffer byteBuffer, byte[] byArray) throws IOException {
        if (byteBuffer.remaining() >= byArray.length) {
            byteBuffer.get(byArray);
            return;
        }
        throw new EOFException();
    }

    private void j1(ByteBuffer comparable, b b8) throws IOException {
        int n8 = n.H((ByteBuffer)comparable);
        if (n8 == 11) {
            b.d(b8, n.c("numFolders", n.Z0((ByteBuffer)comparable)));
            if (n.H(comparable) == 0) {
                Object object = new LinkedList<Integer>();
                for (n8 = 0; n8 < b8.f; ++n8) {
                    object.add(this.f1((ByteBuffer)comparable, b8));
                }
                long l8 = b8.c;
                long l9 = b8.f;
                if (b8.d - (l8 - l9) >= (long)b8.a) {
                    n8 = n.H(comparable);
                    if (n8 == 12) {
                        int n9;
                        object = object.iterator();
                        while (object.hasNext()) {
                            n9 = (Integer)object.next();
                            for (n8 = 0; n8 < n9; ++n8) {
                                if (n.Z0(comparable) >= 0L) {
                                    continue;
                                }
                                throw new IllegalArgumentException("negative unpackSize");
                            }
                        }
                        n8 = n9 = n.H(comparable);
                        if (n9 == 10) {
                            b.j(b8, this.d0((ByteBuffer)comparable, b8.f));
                            l8 = b8.g.cardinality() * 4;
                            if (n.k1(comparable, l8) >= l8) {
                                n8 = n.H(comparable);
                            } else {
                                throw new IOException("invalid number of CRCs in UnpackInfo");
                            }
                        }
                        if (n8 == 0) {
                            return;
                        }
                        throw new IOException("Badly terminated UnpackInfo");
                    }
                    comparable = new StringBuilder();
                    ((StringBuilder)comparable).append("Expected kCodersUnpackSize, got ");
                    ((StringBuilder)comparable).append(n8);
                    throw new IOException(((StringBuilder)comparable).toString());
                }
                throw new IOException("archive doesn't contain enough packed streams");
            }
            throw new IOException("External unsupported");
        }
        comparable = new StringBuilder();
        ((StringBuilder)comparable).append("Expected kFolder, got ");
        ((StringBuilder)comparable).append(n8);
        throw new IOException(((StringBuilder)comparable).toString());
    }

    private static long k1(ByteBuffer byteBuffer, long l8) throws IOException {
        if (l8 < 1L) {
            return 0L;
        }
        int n8 = byteBuffer.position();
        long l9 = byteBuffer.remaining();
        long l10 = l8;
        if (l9 < l8) {
            l10 = l9;
        }
        byteBuffer.position(n8 + (int)l10);
        return l10;
    }

    private boolean l1(int n8, boolean bl, int n9) throws IOException {
        int n10;
        l l8 = this.d0.g[n8];
        if (this.e0 == n8 && !this.L()) {
            return false;
        }
        int n11 = n10 = this.d0.h.c[this.f0];
        if (bl) {
            n11 = this.e0;
            if (n11 < n8) {
                ++n11;
            } else {
                this.b1(n9, l8);
                n11 = n10;
            }
        }
        while (n11 < n8) {
            ax.Kc.d d8;
            l l9 = this.d0.g[n11];
            InputStream inputStream = d8 = new ax.Kc.d(this.g0, l9.getSize());
            if (l9.j()) {
                inputStream = new ax.Kc.g(d8, l9.getSize(), l9.g());
            }
            this.l0.add(inputStream);
            l9.w(l8.f());
            ++n11;
        }
        return true;
    }

    private static char m(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 2) {
            return byteBuffer.getChar();
        }
        throw new EOFException();
    }

    private ax.Bc.b m1(byte[] byArray) throws IOException {
        ByteBuffer byteBuffer = ByteBuffer.allocate(1);
        long l8 = this.c0.position();
        long l9 = this.c0.position() + 0x100000L > this.c0.size() ? this.c0.position() : this.c0.size() - 0x100000L;
        long l10 = this.c0.size() - 1L;
        while (l10 > l9) {
            long l11 = l10 - 1L;
            this.c0.position(l11);
            byteBuffer.rewind();
            if (this.c0.read(byteBuffer) >= 1) {
                Object object;
                int n8 = byteBuffer.array()[0];
                if (n8 != 23) {
                    l10 = l11;
                    if (n8 != 1) continue;
                }
                try {
                    object = new s();
                    ((s)object).a = l11 - (l8 + 20L);
                    ((s)object).b = this.c0.size() - l11;
                    object = this.W((s)object, byArray, false);
                    l10 = l11;
                }
                catch (Exception exception) {
                    l10 = l11;
                    continue;
                }
                if (((ax.Bc.b)object).b.length <= 0) continue;
                n8 = ((ax.Bc.b)object).g.length;
                l10 = l11;
                if (n8 <= 0) continue;
                return object;
            }
            throw new EOFException();
        }
        throw new IOException("Start header corrupt and unable to guess end header");
    }

    private static byte[] n1(char[] object) throws IOException {
        if (object == null) {
            return null;
        }
        if (((ByteBuffer)(object = (Object)n0.encode(CharBuffer.wrap((char[])object)))).hasArray()) {
            return ((ByteBuffer)object).array();
        }
        byte[] byArray = new byte[((Buffer)object).remaining()];
        ((ByteBuffer)object).get(byArray);
        return byArray;
    }

    private InputStream o() throws IOException {
        if (this.d0.g[this.e0].getSize() == 0L) {
            return new ByteArrayInputStream(f.a);
        }
        if (!this.l0.isEmpty()) {
            while (this.l0.size() > 1) {
                block10: {
                    InputStream inputStream = this.l0.remove(0);
                    try {
                        ax.Kc.n.i(inputStream, Long.MAX_VALUE);
                        if (inputStream == null) break block10;
                    }
                    catch (Throwable throwable) {
                        try {
                            throw throwable;
                        }
                        catch (Throwable throwable2) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                }
                                catch (Throwable throwable3) {
                                    throwable.addSuppressed(throwable3);
                                }
                            }
                            throw throwable2;
                        }
                    }
                    inputStream.close();
                }
                this.j0 = 0L;
            }
            return this.l0.get(0);
        }
        throw new IllegalStateException("No current 7z entry (call getNextEntry() first).");
    }

    private void o0(ByteBuffer byteBuffer) throws IOException {
        int n8 = n.H(byteBuffer);
        while (n8 != 0) {
            n.j(byteBuffer, new byte[(int)n.Z0(byteBuffer)]);
            n8 = n.H(byteBuffer);
        }
    }

    private BitSet s0(ByteBuffer byteBuffer, int n8) throws IOException {
        BitSet bitSet = new BitSet(n8);
        int n9 = 0;
        int n10 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            int n11 = n9;
            if (n9 == 0) {
                n10 = n.H(byteBuffer);
                n11 = 128;
            }
            boolean bl = (n10 & n11) != 0;
            bitSet.set(i8, bl);
            n9 = n11 >>> 1;
        }
        return bitSet;
    }

    private ByteBuffer u0(ByteBuffer object, ax.Bc.b object2, byte[] byArray) throws IOException {
        int n8 = ((Buffer)object).position();
        Object object3 = new b();
        this.h1((ByteBuffer)object, (b)object3);
        ((b)object3).r(this.i0.a());
        ((ByteBuffer)object).position(n8);
        this.T0((ByteBuffer)object, (ax.Bc.b)object2);
        object3 = ((ax.Bc.b)object2).e;
        if (object3 != null && ((i[])object3).length != 0) {
            object = ((ax.Bc.b)object2).b;
            if (object != null && ((Object)object).length != 0) {
                object3 = object3[0];
                long l8 = ((ax.Bc.b)object2).a;
                this.c0.position(l8 + 32L);
                object = new d(this.c0, ((ax.Bc.b)object2).b[0]);
                for (e e8 : ((i)object3).c()) {
                    if (e8.b == 1L && e8.c == 1L) {
                        object = g.a(this.q, (InputStream)object, ((i)object3).e(e8), e8, byArray, this.i0.a());
                        continue;
                    }
                    throw new IOException("Multi input/output stream coders are not yet supported");
                }
                object2 = object;
                if (((i)object3).g) {
                    object2 = new ax.Kc.g((InputStream)object, ((i)object3).d(), ((i)object3).h);
                }
                if (((Object)(object = (Object)ax.Kc.n.g((InputStream)object2, n8 = n.c("unpackSize", ((i)object3).d())))).length >= n8) {
                    ((InputStream)object2).close();
                    return ByteBuffer.wrap((byte[])object).order(ByteOrder.LITTLE_ENDIAN);
                }
                throw new IOException("premature end of stream");
            }
            throw new IOException("no packed streams, can't read encoded header");
        }
        throw new IOException("no folders, can't read encoded header");
    }

    private static int v(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            return byteBuffer.getInt();
        }
        throw new EOFException();
    }

    public l F() throws IOException {
        int n8 = this.e0;
        Object object = this.d0.g;
        if (n8 >= ((l[])object).length - 1) {
            return null;
        }
        this.e0 = ++n8;
        if (((l)(object = object[n8])).getName() == null && this.i0.c()) {
            ((l)object).I(this.p());
        }
        this.e(this.e0, false);
        this.j0 = 0L;
        this.k0 = 0L;
        return object;
    }

    @Override
    public void close() throws IOException {
        Object object = this.c0;
        if (object != null) {
            try {
                object.close();
                return;
            }
            finally {
                this.c0 = null;
                object = this.h0;
                if (object != null) {
                    Arrays.fill((byte[])object, (byte)0);
                }
                this.h0 = null;
            }
        }
    }

    public String p() {
        if (!"unknown archive".equals(this.q) && this.q != null) {
            String string = new File(this.q).getName();
            int n8 = string.lastIndexOf(".");
            if (n8 > 0) {
                return string.substring(0, n8);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("~");
            return stringBuilder.toString();
        }
        return null;
    }

    public Iterable<l> q() {
        return new ArrayList<l>(Arrays.asList(this.d0.g));
    }

    public String toString() {
        return this.d0.toString();
    }

    public InputStream u(l l8) throws IOException {
        Object object;
        int n8;
        block3: {
            for (n8 = 0; n8 < ((l[])(object = this.d0.g)).length; ++n8) {
                if (l8 != object[n8]) {
                    continue;
                }
                break block3;
            }
            n8 = -1;
        }
        if (n8 >= 0) {
            this.e(n8, true);
            this.e0 = n8;
            this.f0 = this.d0.h.d[n8];
            return this.o();
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Can not find ");
        ((StringBuilder)object).append(l8.getName());
        ((StringBuilder)object).append(" in ");
        ((StringBuilder)object).append(this.q);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    private static class b {
        private int a;
        private long b;
        private long c;
        private long d;
        private long e;
        private int f;
        private BitSet g;
        private int h;
        private int i;

        private b() {
        }

        static /* synthetic */ int b(b b8, int n8) {
            b8.a = n8;
            return n8;
        }

        static /* synthetic */ int d(b b8, int n8) {
            b8.f = n8;
            return n8;
        }

        static /* synthetic */ long f(b b8, long l8) {
            b8.c = l8;
            return l8;
        }

        static /* synthetic */ long h(b b8, long l8) {
            b8.d = l8;
            return l8;
        }

        static /* synthetic */ BitSet j(b b8, BitSet bitSet) {
            b8.g = bitSet;
            return bitSet;
        }

        static /* synthetic */ long l(b b8, long l8) {
            b8.e = l8;
            return l8;
        }

        static /* synthetic */ long n(b b8, long l8) {
            b8.b = l8;
            return l8;
        }

        static /* synthetic */ int p(b b8, int n8) {
            b8.h = n8;
            return n8;
        }

        static /* synthetic */ int q(b b8, int n8) {
            b8.i = n8;
            return n8;
        }

        private long s() {
            return 16L;
        }

        private long t() {
            return 22L;
        }

        private long u() {
            return 100L;
        }

        private long w() {
            return 30L;
        }

        private long x() {
            return this.f * 8 + this.a * 8 + this.h * 4;
        }

        void r(int n8) throws IOException {
            int n9 = this.i;
            if (n9 > 0 && this.f == 0) {
                throw new IOException("archive with entries but no folders");
            }
            if ((long)n9 <= this.e) {
                long l8 = this.v() / 1024L;
                if ((long)n8 >= l8) {
                    return;
                }
                throw new a(l8, n8);
            }
            throw new IOException("archive doesn't contain enough substreams for entries");
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Archive with ");
            stringBuilder.append(this.h);
            stringBuilder.append(" entries in ");
            stringBuilder.append(this.f);
            stringBuilder.append(" folders. Estimated size ");
            stringBuilder.append(this.v() / 1024L);
            stringBuilder.append(" kB.");
            return stringBuilder.toString();
        }

        long v() {
            int n8 = this.a;
            long l8 = n8;
            long l9 = n8 / 8;
            long l10 = this.f;
            long l11 = this.w();
            long l12 = this.b;
            long l13 = this.t();
            long l14 = this.c;
            long l15 = this.f;
            long l16 = this.s();
            long l17 = this.d;
            long l18 = this.c;
            return (l8 * 16L + l9 + l10 * l11 + l12 * l13 + (l14 - l15) * l16 + (l17 - l18 + (long)this.f) * 8L + l18 * 8L + (long)this.h * this.u() + this.x()) * 2L;
        }
    }
}

