package ax.Bc;

import ax.zc.C3566a;
import j$.io.DesugarInputStream;
import j$.io.FileRetargetClass;
import j$.io.InputStreamRetargetInterface;
import j$.nio.file.Files;
import j$.nio.file.StandardOpenOption;
import j$.nio.file.attribute.FileAttribute;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes3.dex */
public class n implements Closeable, AutoCloseable {
    static final byte[] m0 = {55, 122, -68, -81, 39, 28};
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
            return (this.f * 8) + (this.a * 8) + (this.h * 4);
        }

        void r(int i) throws IOException {
            int i2 = this.i;
            if (i2 > 0 && this.f == 0) {
                throw new IOException("archive with entries but no folders");
            }
            if (i2 > this.e) {
                throw new IOException("archive doesn't contain enough substreams for entries");
            }
            long v = v() / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
            if (i < v) {
                throw new C3566a(v, i);
            }
        }

        public String toString() {
            return "Archive with " + this.h + " entries in " + this.f + " folders. Estimated size " + (v() / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) + " kB.";
        }

        long v() {
            long w = (this.a * 16) + (r0 / 8) + (this.f * w()) + (this.b * t()) + ((this.c - this.f) * s());
            long j = this.d;
            long j2 = this.c;
            return (w + (((j - j2) + this.f) * 8) + (j2 * 8) + (this.h * u()) + x()) * 2;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public n(File file, char[] cArr) throws IOException {
        this(file, cArr, o.d);
    }

    private static long A(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 8) {
            return byteBuffer.getLong();
        }
        throw new EOFException();
    }

    private void A0(ByteBuffer byteBuffer, ax.Bc.b bVar) throws IOException {
        ax.Bc.b bVar2 = bVar;
        int Z0 = (int) Z0(byteBuffer);
        HashMap hashMap = new HashMap();
        BitSet bitSet = null;
        BitSet bitSet2 = null;
        BitSet bitSet3 = null;
        while (true) {
            int H = H(byteBuffer);
            int i = 0;
            if (H == 0) {
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < Z0; i4++) {
                    l lVar = hashMap.get(Integer.valueOf(i4));
                    if (lVar != null) {
                        lVar.E(bitSet == null || !bitSet.get(i4));
                        if (!lVar.o()) {
                            lVar.z(bitSet2 == null || !bitSet2.get(i2));
                            lVar.t(bitSet3 != null && bitSet3.get(i2));
                            lVar.B(false);
                            lVar.J(0L);
                            i2++;
                        } else {
                            if (bVar2.f == null) {
                                throw new IOException("Archive contains file with streams but no subStreamsInfo");
                            }
                            lVar.z(false);
                            lVar.t(false);
                            lVar.B(bVar2.f.b.get(i3));
                            lVar.x(bVar2.f.c[i3]);
                            lVar.J(bVar2.f.a[i3]);
                            if (lVar.getSize() < 0) {
                                throw new IOException("broken archive, entry with negative size");
                            }
                            i3++;
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (l lVar2 : hashMap.values()) {
                    if (lVar2 != null) {
                        arrayList.add(lVar2);
                    }
                }
                bVar2.g = (l[]) arrayList.toArray(l.t0);
                f(bVar2);
                return;
            }
            long Z02 = Z0(byteBuffer);
            if (H != 25) {
                switch (H) {
                    case 14:
                        bitSet = s0(byteBuffer, Z0);
                        break;
                    case 15:
                        bitSet2 = s0(byteBuffer, bitSet.cardinality());
                        break;
                    case 16:
                        bitSet3 = s0(byteBuffer, bitSet.cardinality());
                        break;
                    case 17:
                        H(byteBuffer);
                        int i5 = (int) (Z02 - 1);
                        byte[] bArr = new byte[i5];
                        j(byteBuffer, bArr);
                        int i6 = 0;
                        int i7 = 0;
                        while (i < i5) {
                            if (bArr[i] == 0 && bArr[i + 1] == 0) {
                                g(hashMap, i7);
                                hashMap.get(Integer.valueOf(i7)).I(new String(bArr, i6, i - i6, StandardCharsets.UTF_16LE));
                                i7++;
                                i6 = i + 2;
                            }
                            i += 2;
                        }
                        if (i6 == i5 && i7 == Z0) {
                            break;
                        }
                        break;
                    case 18:
                        BitSet d0 = d0(byteBuffer, Z0);
                        H(byteBuffer);
                        while (i < Z0) {
                            g(hashMap, i);
                            l lVar3 = hashMap.get(Integer.valueOf(i));
                            lVar3.C(d0.get(i));
                            if (lVar3.k()) {
                                lVar3.y(A(byteBuffer));
                            }
                            i++;
                        }
                        break;
                    case 19:
                        BitSet d02 = d0(byteBuffer, Z0);
                        H(byteBuffer);
                        while (i < Z0) {
                            g(hashMap, i);
                            l lVar4 = hashMap.get(Integer.valueOf(i));
                            lVar4.A(d02.get(i));
                            if (lVar4.i()) {
                                lVar4.s(A(byteBuffer));
                            }
                            i++;
                        }
                        break;
                    case 20:
                        BitSet d03 = d0(byteBuffer, Z0);
                        H(byteBuffer);
                        while (i < Z0) {
                            g(hashMap, i);
                            l lVar5 = hashMap.get(Integer.valueOf(i));
                            lVar5.D(d03.get(i));
                            if (lVar5.l()) {
                                lVar5.G(A(byteBuffer));
                            }
                            i++;
                        }
                        break;
                    case 21:
                        BitSet d04 = d0(byteBuffer, Z0);
                        H(byteBuffer);
                        while (i < Z0) {
                            g(hashMap, i);
                            l lVar6 = hashMap.get(Integer.valueOf(i));
                            lVar6.F(d04.get(i));
                            if (lVar6.m()) {
                                lVar6.K(v(byteBuffer));
                            }
                            i++;
                        }
                        break;
                    default:
                        k1(byteBuffer, Z02);
                        break;
                }
            } else {
                k1(byteBuffer, Z02);
            }
            bVar2 = bVar;
        }
        throw new IOException("Error parsing file names");
    }

    private i C0(ByteBuffer byteBuffer) throws IOException {
        i iVar = new i();
        int Z0 = (int) Z0(byteBuffer);
        e[] eVarArr = new e[Z0];
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < Z0; i++) {
            eVarArr[i] = new e();
            int H = H(byteBuffer);
            int i2 = H & 15;
            boolean z = (H & 16) == 0;
            boolean z2 = (H & 32) != 0;
            boolean z3 = (H & 128) != 0;
            byte[] bArr = new byte[i2];
            eVarArr[i].a = bArr;
            j(byteBuffer, bArr);
            if (z) {
                e eVar = eVarArr[i];
                eVar.b = 1L;
                eVar.c = 1L;
            } else {
                eVarArr[i].b = Z0(byteBuffer);
                eVarArr[i].c = Z0(byteBuffer);
            }
            e eVar2 = eVarArr[i];
            j += eVar2.b;
            j2 += eVar2.c;
            if (z2) {
                byte[] bArr2 = new byte[(int) Z0(byteBuffer)];
                eVarArr[i].d = bArr2;
                j(byteBuffer, bArr2);
            }
            if (z3) {
                throw new IOException("Alternative methods are unsupported, please report. The reference implementation doesn't support them either.");
            }
        }
        iVar.a = eVarArr;
        iVar.b = j;
        iVar.c = j2;
        long j3 = j2 - 1;
        int i3 = (int) j3;
        c[] cVarArr = new c[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            c cVar = new c();
            cVarArr[i4] = cVar;
            cVar.a = Z0(byteBuffer);
            cVarArr[i4].b = Z0(byteBuffer);
        }
        iVar.d = cVarArr;
        long j4 = j - j3;
        int i5 = (int) j4;
        long[] jArr = new long[i5];
        if (j4 == 1) {
            int i6 = 0;
            while (i6 < ((int) j) && iVar.a(i6) >= 0) {
                i6++;
            }
            jArr[0] = i6;
        } else {
            for (int i7 = 0; i7 < i5; i7++) {
                jArr[i7] = Z0(byteBuffer);
            }
        }
        iVar.e = jArr;
        return iVar;
    }

    private void D0(ByteBuffer byteBuffer) throws IOException {
        byteBuffer.rewind();
        ax.Kc.n.f(this.c0, byteBuffer);
        byteBuffer.flip();
    }

    private void F0(ByteBuffer byteBuffer, ax.Bc.b bVar) throws IOException {
        int position = byteBuffer.position();
        c1(byteBuffer).r(this.i0.a());
        byteBuffer.position(position);
        int H = H(byteBuffer);
        if (H == 2) {
            o0(byteBuffer);
            H = H(byteBuffer);
        }
        if (H == 3) {
            throw new IOException("Additional streams unsupported");
        }
        if (H == 4) {
            T0(byteBuffer, bVar);
            H = H(byteBuffer);
        }
        if (H == 5) {
            A0(byteBuffer, bVar);
            H(byteBuffer);
        }
    }

    private ax.Bc.b G0(byte[] bArr) throws IOException {
        ByteBuffer order = ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN);
        D0(order);
        byte[] bArr2 = new byte[6];
        order.get(bArr2);
        if (!Arrays.equals(bArr2, m0)) {
            throw new IOException("Bad 7z signature");
        }
        byte b2 = order.get();
        byte b3 = order.get();
        if (b2 != 0) {
            throw new IOException(String.format("Unsupported 7z version (%d,%d)", Byte.valueOf(b2), Byte.valueOf(b3)));
        }
        long j = order.getInt() & 4294967295L;
        if (j == 0) {
            long position = this.c0.position();
            ByteBuffer allocate = ByteBuffer.allocate(20);
            D0(allocate);
            this.c0.position(position);
            while (allocate.hasRemaining()) {
                if (allocate.get() != 0) {
                }
            }
            if (this.i0.b()) {
                return m1(bArr);
            }
            throw new IOException("archive seems to be invalid.\nYou may want to retry and enable the tryToRecoverBrokenArchives if the archive could be a multi volume archive that has been closed prematurely.");
        }
        return W(M0(j), bArr, true);
    }

    private static int H(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        throw new EOFException();
    }

    private boolean L() {
        if (this.l0.isEmpty()) {
            return false;
        }
        ArrayList<InputStream> arrayList = this.l0;
        InputStream inputStream = arrayList.get(arrayList.size() - 1);
        return inputStream instanceof ax.Kc.d ? ((ax.Kc.d) inputStream).a() != this.d0.g[this.e0].getSize() : (inputStream instanceof ax.Kc.g) && ((ax.Kc.g) inputStream).a() != this.d0.g[this.e0].getSize();
    }

    private void L0(ByteBuffer byteBuffer, ax.Bc.b bVar) throws IOException {
        bVar.a = Z0(byteBuffer);
        int Z0 = (int) Z0(byteBuffer);
        int H = H(byteBuffer);
        if (H == 9) {
            bVar.b = new long[Z0];
            int i = 0;
            while (true) {
                long[] jArr = bVar.b;
                if (i >= jArr.length) {
                    break;
                }
                jArr[i] = Z0(byteBuffer);
                i++;
            }
            H = H(byteBuffer);
        }
        if (H == 10) {
            bVar.c = d0(byteBuffer, Z0);
            bVar.d = new long[Z0];
            for (int i2 = 0; i2 < Z0; i2++) {
                if (bVar.c.get(i2)) {
                    bVar.d[i2] = v(byteBuffer) & 4294967295L;
                }
            }
            H(byteBuffer);
        }
    }

    private s M0(long j) throws IOException {
        s sVar = new s();
        DataInputStream dataInputStream = new DataInputStream(new ax.Kc.g(new d(this.c0, 20L), 20L, j));
        try {
            long reverseBytes = Long.reverseBytes(dataInputStream.readLong());
            sVar.a = reverseBytes;
            if (reverseBytes < 0 || reverseBytes + 32 > this.c0.size()) {
                throw new IOException("nextHeaderOffset is out of bounds");
            }
            long reverseBytes2 = Long.reverseBytes(dataInputStream.readLong());
            sVar.b = reverseBytes2;
            long j2 = sVar.a;
            long j3 = reverseBytes2 + j2;
            if (j3 < j2 || j3 + 32 > this.c0.size()) {
                throw new IOException("nextHeaderSize is out of bounds");
            }
            sVar.c = Integer.reverseBytes(dataInputStream.readInt()) & 4294967295L;
            dataInputStream.close();
            return sVar;
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
            }
        }
    }

    private void T0(ByteBuffer byteBuffer, ax.Bc.b bVar) throws IOException {
        int H = H(byteBuffer);
        if (H == 6) {
            L0(byteBuffer, bVar);
            H = H(byteBuffer);
        }
        if (H == 7) {
            a1(byteBuffer, bVar);
            H = H(byteBuffer);
        } else {
            bVar.e = i.j;
        }
        if (H == 8) {
            Y0(byteBuffer, bVar);
            H(byteBuffer);
        }
    }

    private ax.Bc.b W(s sVar, byte[] bArr, boolean z) throws IOException {
        c("nextHeaderSize", sVar.b);
        int i = (int) sVar.b;
        this.c0.position(sVar.a + 32);
        ByteBuffer order = ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        D0(order);
        if (z) {
            CRC32 crc32 = new CRC32();
            crc32.update(order.array());
            if (sVar.c != crc32.getValue()) {
                throw new IOException("NextHeader CRC mismatch");
            }
        }
        ax.Bc.b bVar = new ax.Bc.b();
        int H = H(order);
        if (H == 23) {
            order = u0(order, bVar, bArr);
            bVar = new ax.Bc.b();
            H = H(order);
        }
        if (H != 1) {
            throw new IOException("Broken or unsupported archive: no Header");
        }
        F0(order, bVar);
        bVar.f = null;
        return bVar;
    }

    private void Y0(ByteBuffer byteBuffer, ax.Bc.b bVar) throws IOException {
        for (i iVar : bVar.e) {
            iVar.i = 1;
        }
        long length = bVar.e.length;
        int H = H(byteBuffer);
        if (H == 13) {
            long j = 0;
            for (i iVar2 : bVar.e) {
                long Z0 = Z0(byteBuffer);
                iVar2.i = (int) Z0;
                j += Z0;
            }
            H = H(byteBuffer);
            length = j;
        }
        int i = (int) length;
        u uVar = new u();
        uVar.a = new long[i];
        uVar.b = new BitSet(i);
        uVar.c = new long[i];
        int i2 = 0;
        for (i iVar3 : bVar.e) {
            if (iVar3.i != 0) {
                long j2 = 0;
                if (H == 9) {
                    int i3 = 0;
                    while (i3 < iVar3.i - 1) {
                        long Z02 = Z0(byteBuffer);
                        uVar.a[i2] = Z02;
                        j2 += Z02;
                        i3++;
                        i2++;
                    }
                }
                if (j2 > iVar3.d()) {
                    throw new IOException("sum of unpack sizes of folder exceeds total unpack size");
                }
                uVar.a[i2] = iVar3.d() - j2;
                i2++;
            }
        }
        if (H == 9) {
            H = H(byteBuffer);
        }
        int i4 = 0;
        for (i iVar4 : bVar.e) {
            int i5 = iVar4.i;
            if (i5 != 1 || !iVar4.g) {
                i4 += i5;
            }
        }
        if (H == 10) {
            BitSet d0 = d0(byteBuffer, i4);
            long[] jArr = new long[i4];
            for (int i6 = 0; i6 < i4; i6++) {
                if (d0.get(i6)) {
                    jArr[i6] = v(byteBuffer) & 4294967295L;
                }
            }
            int i7 = 0;
            int i8 = 0;
            for (i iVar5 : bVar.e) {
                if (iVar5.i == 1 && iVar5.g) {
                    uVar.b.set(i7, true);
                    uVar.c[i7] = iVar5.h;
                    i7++;
                } else {
                    for (int i9 = 0; i9 < iVar5.i; i9++) {
                        uVar.b.set(i7, d0.get(i8));
                        uVar.c[i7] = jArr[i8];
                        i7++;
                        i8++;
                    }
                }
            }
            H(byteBuffer);
        }
        bVar.f = uVar;
    }

    private static long Z0(ByteBuffer byteBuffer) throws IOException {
        long H = H(byteBuffer);
        int i = 128;
        long j = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            if ((i & H) == 0) {
                return ((H & (i - 1)) << (i2 * 8)) | j;
            }
            j |= H(byteBuffer) << (i2 * 8);
            i >>>= 1;
        }
        return j;
    }

    private void a1(ByteBuffer byteBuffer, ax.Bc.b bVar) throws IOException {
        H(byteBuffer);
        int Z0 = (int) Z0(byteBuffer);
        i[] iVarArr = new i[Z0];
        bVar.e = iVarArr;
        H(byteBuffer);
        for (int i = 0; i < Z0; i++) {
            iVarArr[i] = C0(byteBuffer);
        }
        H(byteBuffer);
        for (int i2 = 0; i2 < Z0; i2++) {
            i iVar = iVarArr[i2];
            c("totalOutputStreams", iVar.c);
            iVar.f = new long[(int) iVar.c];
            for (int i3 = 0; i3 < iVar.c; i3++) {
                iVar.f[i3] = Z0(byteBuffer);
            }
        }
        if (H(byteBuffer) == 10) {
            BitSet d0 = d0(byteBuffer, Z0);
            for (int i4 = 0; i4 < Z0; i4++) {
                if (d0.get(i4)) {
                    i iVar2 = iVarArr[i4];
                    iVar2.g = true;
                    iVar2.h = v(byteBuffer) & 4294967295L;
                } else {
                    iVarArr[i4].g = false;
                }
            }
            H(byteBuffer);
        }
    }

    private void b1(int i, l lVar) throws IOException {
        this.l0.clear();
        InputStream inputStream = this.g0;
        if (inputStream != null) {
            inputStream.close();
            this.g0 = null;
        }
        ax.Bc.b bVar = this.d0;
        i iVar = bVar.e[i];
        t tVar = bVar.h;
        int i2 = tVar.a[i];
        this.g0 = d(iVar, bVar.a + 32 + tVar.b[i2], i2, lVar);
    }

    private static int c(String str, long j) throws IOException {
        if (j <= 2147483647L && j >= 0) {
            return (int) j;
        }
        throw new IOException("Cannot handle " + str + " " + j);
    }

    private b c1(ByteBuffer byteBuffer) throws IOException {
        b bVar = new b(null);
        int H = H(byteBuffer);
        if (H == 2) {
            d1(byteBuffer);
            H = H(byteBuffer);
        }
        if (H == 3) {
            throw new IOException("Additional streams unsupported");
        }
        if (H == 4) {
            h1(byteBuffer, bVar);
            H = H(byteBuffer);
        }
        if (H == 5) {
            e1(byteBuffer, bVar);
            H = H(byteBuffer);
        }
        if (H == 0) {
            return bVar;
        }
        throw new IOException("Badly terminated header, found " + H);
    }

    private InputStream d(i iVar, long j, int i, l lVar) throws IOException {
        this.c0.position(j);
        a aVar = new a(new BufferedInputStream(new d(this.c0, this.d0.b[i])));
        LinkedList linkedList = new LinkedList();
        InputStream inputStream = aVar;
        for (e eVar : iVar.c()) {
            if (eVar.b != 1 || eVar.c != 1) {
                throw new IOException("Multi input/output stream coders are not yet supported");
            }
            p d = p.d(eVar.a);
            inputStream = g.a(this.q, inputStream, iVar.e(eVar), eVar, this.h0, this.i0.a());
            linkedList.addFirst(new q(d, g.c(d).e(eVar, inputStream)));
        }
        lVar.w(linkedList);
        return iVar.g ? new ax.Kc.g(inputStream, iVar.d(), iVar.h) : inputStream;
    }

    private BitSet d0(ByteBuffer byteBuffer, int i) throws IOException {
        if (H(byteBuffer) == 0) {
            return s0(byteBuffer, i);
        }
        BitSet bitSet = new BitSet(i);
        for (int i2 = 0; i2 < i; i2++) {
            bitSet.set(i2, true);
        }
        return bitSet;
    }

    private void d1(ByteBuffer byteBuffer) throws IOException {
        int H = H(byteBuffer);
        while (H != 0) {
            long c = c("propertySize", Z0(byteBuffer));
            if (k1(byteBuffer, c) < c) {
                throw new IOException("invalid property size");
            }
            H = H(byteBuffer);
        }
    }

    private void e(int i, boolean z) throws IOException {
        boolean z2;
        ax.Bc.b bVar = this.d0;
        t tVar = bVar.h;
        if (tVar == null) {
            throw new IOException("Archive doesn't contain stream information to read entries");
        }
        int i2 = tVar.d[i];
        if (i2 < 0) {
            this.l0.clear();
            return;
        }
        l[] lVarArr = bVar.g;
        l lVar = lVarArr[i];
        if (this.f0 == i2) {
            if (i > 0) {
                lVar.w(lVarArr[i - 1].f());
            }
            if (z && lVar.f() == null) {
                ax.Bc.b bVar2 = this.d0;
                lVar.w(bVar2.g[bVar2.h.c[i2]].f());
            }
            z2 = true;
        } else {
            this.f0 = i2;
            b1(i2, lVar);
            z2 = false;
        }
        boolean l1 = z ? l1(i, z2, i2) : false;
        if (z && this.e0 == i && !l1) {
            return;
        }
        InputStream dVar = new ax.Kc.d(this.g0, lVar.getSize());
        if (lVar.j()) {
            dVar = new ax.Kc.g(dVar, lVar.getSize(), lVar.g());
        }
        this.l0.add(dVar);
    }

    private void e1(ByteBuffer byteBuffer, b bVar) throws IOException {
        bVar.h = c("numFiles", Z0(byteBuffer));
        int i = -1;
        while (true) {
            int H = H(byteBuffer);
            if (H == 0) {
                int i2 = bVar.h;
                if (i <= 0) {
                    i = 0;
                }
                bVar.i = i2 - i;
                return;
            }
            long Z0 = Z0(byteBuffer);
            switch (H) {
                case 14:
                    i = s0(byteBuffer, bVar.h).cardinality();
                    break;
                case 15:
                    if (i == -1) {
                        throw new IOException("Header format error: kEmptyStream must appear before kEmptyFile");
                    }
                    s0(byteBuffer, i);
                    break;
                case 16:
                    if (i == -1) {
                        throw new IOException("Header format error: kEmptyStream must appear before kAnti");
                    }
                    s0(byteBuffer, i);
                    break;
                case 17:
                    if (H(byteBuffer) != 0) {
                        throw new IOException("Not implemented");
                    }
                    int c = c("file names length", Z0 - 1);
                    if ((c & 1) != 0) {
                        throw new IOException("File names length invalid");
                    }
                    int i3 = 0;
                    for (int i4 = 0; i4 < c; i4 += 2) {
                        if (m(byteBuffer) == 0) {
                            i3++;
                        }
                    }
                    if (i3 != bVar.h) {
                        throw new IOException("Invalid number of file names (" + i3 + " instead of " + bVar.h + ")");
                    }
                    break;
                case 18:
                    int cardinality = d0(byteBuffer, bVar.h).cardinality();
                    if (H(byteBuffer) != 0) {
                        throw new IOException("Not implemented");
                    }
                    long j = cardinality * 8;
                    if (k1(byteBuffer, j) < j) {
                        throw new IOException("invalid creation dates size");
                    }
                    break;
                case 19:
                    int cardinality2 = d0(byteBuffer, bVar.h).cardinality();
                    if (H(byteBuffer) != 0) {
                        throw new IOException("Not implemented");
                    }
                    long j2 = cardinality2 * 8;
                    if (k1(byteBuffer, j2) < j2) {
                        throw new IOException("invalid access dates size");
                    }
                    break;
                case 20:
                    int cardinality3 = d0(byteBuffer, bVar.h).cardinality();
                    if (H(byteBuffer) != 0) {
                        throw new IOException("Not implemented");
                    }
                    long j3 = cardinality3 * 8;
                    if (k1(byteBuffer, j3) < j3) {
                        throw new IOException("invalid modification dates size");
                    }
                    break;
                case 21:
                    int cardinality4 = d0(byteBuffer, bVar.h).cardinality();
                    if (H(byteBuffer) != 0) {
                        throw new IOException("Not implemented");
                    }
                    long j4 = cardinality4 * 4;
                    if (k1(byteBuffer, j4) < j4) {
                        throw new IOException("invalid windows attributes size");
                    }
                    break;
                case 22:
                case 23:
                default:
                    if (k1(byteBuffer, Z0) < Z0) {
                        throw new IOException("Incomplete property of type " + H);
                    }
                    break;
                case 24:
                    throw new IOException("kStartPos is unsupported, please report");
                case 25:
                    if (k1(byteBuffer, Z0) < Z0) {
                        throw new IOException("Incomplete kDummy property");
                    }
                    break;
            }
        }
    }

    private void f(ax.Bc.b bVar) throws IOException {
        i[] iVarArr;
        t tVar = new t();
        i[] iVarArr2 = bVar.e;
        int length = iVarArr2 != null ? iVarArr2.length : 0;
        tVar.a = new int[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            tVar.a[i2] = i;
            i += bVar.e[i2].e.length;
        }
        int length2 = bVar.b.length;
        tVar.b = new long[length2];
        long j = 0;
        for (int i3 = 0; i3 < length2; i3++) {
            tVar.b[i3] = j;
            j += bVar.b[i3];
        }
        tVar.c = new int[length];
        tVar.d = new int[bVar.g.length];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            l[] lVarArr = bVar.g;
            if (i4 >= lVarArr.length) {
                bVar.h = tVar;
                return;
            }
            if (lVarArr[i4].o() || i5 != 0) {
                if (i5 == 0) {
                    while (true) {
                        iVarArr = bVar.e;
                        if (i6 >= iVarArr.length) {
                            break;
                        }
                        tVar.c[i6] = i4;
                        if (iVarArr[i6].i > 0) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    if (i6 >= iVarArr.length) {
                        throw new IOException("Too few folders in archive");
                    }
                }
                tVar.d[i4] = i6;
                if (bVar.g[i4].o() && (i5 = i5 + 1) >= bVar.e[i6].i) {
                    i6++;
                    i5 = 0;
                }
            } else {
                tVar.d[i4] = -1;
            }
            i4++;
        }
    }

    private int f1(ByteBuffer byteBuffer, b bVar) throws IOException {
        int c = c("numCoders", Z0(byteBuffer));
        if (c == 0) {
            throw new IOException("Folder without coders");
        }
        bVar.b += c;
        long j = 0;
        long j2 = 0;
        int i = 0;
        while (true) {
            long j3 = 1;
            if (i >= c) {
                c("totalInStreams", j);
                c("totalOutStreams", j2);
                bVar.c += j2;
                bVar.d += j;
                if (j2 == 0) {
                    throw new IOException("Total output streams can't be 0");
                }
                int c2 = c("numBindPairs", j2 - 1);
                long j4 = c2;
                if (j < j4) {
                    throw new IOException("Total input streams can't be less than the number of bind pairs");
                }
                BitSet bitSet = new BitSet((int) j);
                for (int i2 = 0; i2 < c2; i2++) {
                    int c3 = c("inIndex", Z0(byteBuffer));
                    if (j <= c3) {
                        throw new IOException("inIndex is bigger than number of inStreams");
                    }
                    bitSet.set(c3);
                    if (j2 <= c("outIndex", Z0(byteBuffer))) {
                        throw new IOException("outIndex is bigger than number of outStreams");
                    }
                }
                int c4 = c("numPackedStreams", j - j4);
                if (c4 != 1) {
                    for (int i3 = 0; i3 < c4; i3++) {
                        if (c("packedStreamIndex", Z0(byteBuffer)) >= j) {
                            throw new IOException("packedStreamIndex is bigger than number of totalInStreams");
                        }
                    }
                } else if (bitSet.nextClearBit(0) == -1) {
                    throw new IOException("Couldn't find stream's bind pair index");
                }
                return (int) j2;
            }
            int H = H(byteBuffer);
            j(byteBuffer, new byte[H & 15]);
            boolean z = (H & 16) == 0;
            boolean z2 = (H & 32) != 0;
            if ((H & 128) != 0) {
                throw new IOException("Alternative methods are unsupported, please report. The reference implementation doesn't support them either.");
            }
            if (z) {
                j++;
            } else {
                j += c("numInStreams", Z0(byteBuffer));
                j3 = c("numOutStreams", Z0(byteBuffer));
            }
            j2 += j3;
            if (z2) {
                long c5 = c("propertiesSize", Z0(byteBuffer));
                if (k1(byteBuffer, c5) < c5) {
                    throw new IOException("invalid propertiesSize in folder");
                }
            }
            i++;
        }
    }

    private void g(Map<Integer, l> map, int i) {
        if (map.get(Integer.valueOf(i)) == null) {
            map.put(Integer.valueOf(i), new l());
        }
    }

    private void g1(ByteBuffer byteBuffer, b bVar) throws IOException {
        long Z0 = Z0(byteBuffer);
        long j = 0;
        if (Z0 >= 0) {
            long j2 = 32 + Z0;
            if (j2 <= this.c0.size() && j2 >= 0) {
                bVar.a = c("numPackStreams", Z0(byteBuffer));
                int H = H(byteBuffer);
                if (H == 9) {
                    int i = 0;
                    long j3 = 0;
                    while (i < bVar.a) {
                        long Z02 = Z0(byteBuffer);
                        j3 += Z02;
                        long j4 = j2 + j3;
                        if (Z02 < j || j4 > this.c0.size() || j4 < Z0) {
                            throw new IOException("packSize (" + Z02 + ") is out of range");
                        }
                        i++;
                        j = 0;
                    }
                    H = H(byteBuffer);
                }
                if (H == 10) {
                    long cardinality = d0(byteBuffer, bVar.a).cardinality() * 4;
                    if (k1(byteBuffer, cardinality) < cardinality) {
                        throw new IOException("invalid number of CRCs in PackInfo");
                    }
                    H = H(byteBuffer);
                }
                if (H == 0) {
                    return;
                }
                throw new IOException("Badly terminated PackInfo (" + H + ")");
            }
        }
        throw new IOException("packPos (" + Z0 + ") is out of range");
    }

    private void h1(ByteBuffer byteBuffer, b bVar) throws IOException {
        int H = H(byteBuffer);
        if (H == 6) {
            g1(byteBuffer, bVar);
            H = H(byteBuffer);
        }
        if (H == 7) {
            j1(byteBuffer, bVar);
            H = H(byteBuffer);
        }
        if (H == 8) {
            i1(byteBuffer, bVar);
            H = H(byteBuffer);
        }
        if (H != 0) {
            throw new IOException("Badly terminated StreamsInfo");
        }
    }

    private void i1(ByteBuffer byteBuffer, b bVar) throws IOException {
        int i;
        int H = H(byteBuffer);
        LinkedList linkedList = new LinkedList();
        int i2 = 0;
        if (H == 13) {
            for (int i3 = 0; i3 < bVar.f; i3++) {
                linkedList.add(Integer.valueOf(c("numStreams", Z0(byteBuffer))));
            }
            bVar.e = ((Long) Collection.EL.stream(linkedList).collect(Collectors.summingLong(new ToLongFunction() { // from class: ax.Bc.m
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return ((Integer) obj).longValue();
                }
            }))).longValue();
            H = H(byteBuffer);
        } else {
            bVar.e = bVar.f;
        }
        c("totalUnpackStreams", bVar.e);
        if (H == 9) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (intValue != 0) {
                    for (int i4 = 0; i4 < intValue - 1; i4++) {
                        if (Z0(byteBuffer) < 0) {
                            throw new IOException("negative unpackSize");
                        }
                    }
                }
            }
            H = H(byteBuffer);
        }
        if (linkedList.isEmpty()) {
            i = bVar.g == null ? bVar.f : bVar.f - bVar.g.cardinality();
        } else {
            Iterator it2 = linkedList.iterator();
            int i5 = 0;
            while (it2.hasNext()) {
                int intValue2 = ((Integer) it2.next()).intValue();
                if (intValue2 == 1 && bVar.g != null) {
                    int i6 = i5 + 1;
                    if (bVar.g.get(i5)) {
                        i5 = i6;
                    } else {
                        i5 = i6;
                    }
                }
                i2 += intValue2;
            }
            i = i2;
        }
        if (H == 10) {
            c("numDigests", i);
            long cardinality = d0(byteBuffer, i).cardinality() * 4;
            if (k1(byteBuffer, cardinality) < cardinality) {
                throw new IOException("invalid number of missing CRCs in SubStreamInfo");
            }
            H = H(byteBuffer);
        }
        if (H != 0) {
            throw new IOException("Badly terminated SubStreamsInfo");
        }
    }

    private static void j(ByteBuffer byteBuffer, byte[] bArr) throws IOException {
        if (byteBuffer.remaining() < bArr.length) {
            throw new EOFException();
        }
        byteBuffer.get(bArr);
    }

    private void j1(ByteBuffer byteBuffer, b bVar) throws IOException {
        int H = H(byteBuffer);
        if (H != 11) {
            throw new IOException("Expected kFolder, got " + H);
        }
        bVar.f = c("numFolders", Z0(byteBuffer));
        if (H(byteBuffer) != 0) {
            throw new IOException("External unsupported");
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < bVar.f; i++) {
            linkedList.add(Integer.valueOf(f1(byteBuffer, bVar)));
        }
        if (bVar.d - (bVar.c - bVar.f) < bVar.a) {
            throw new IOException("archive doesn't contain enough packed streams");
        }
        int H2 = H(byteBuffer);
        if (H2 != 12) {
            throw new IOException("Expected kCodersUnpackSize, got " + H2);
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            for (int i2 = 0; i2 < intValue; i2++) {
                if (Z0(byteBuffer) < 0) {
                    throw new IllegalArgumentException("negative unpackSize");
                }
            }
        }
        int H3 = H(byteBuffer);
        if (H3 == 10) {
            bVar.g = d0(byteBuffer, bVar.f);
            long cardinality = bVar.g.cardinality() * 4;
            if (k1(byteBuffer, cardinality) < cardinality) {
                throw new IOException("invalid number of CRCs in UnpackInfo");
            }
            H3 = H(byteBuffer);
        }
        if (H3 != 0) {
            throw new IOException("Badly terminated UnpackInfo");
        }
    }

    private static long k1(ByteBuffer byteBuffer, long j) throws IOException {
        if (j < 1) {
            return 0L;
        }
        int position = byteBuffer.position();
        long remaining = byteBuffer.remaining();
        if (remaining < j) {
            j = remaining;
        }
        byteBuffer.position(position + ((int) j));
        return j;
    }

    private boolean l1(int i, boolean z, int i2) throws IOException {
        l lVar = this.d0.g[i];
        if (this.e0 == i && !L()) {
            return false;
        }
        int i3 = this.d0.h.c[this.f0];
        if (z) {
            int i4 = this.e0;
            if (i4 < i) {
                i3 = i4 + 1;
            } else {
                b1(i2, lVar);
            }
        }
        while (i3 < i) {
            l lVar2 = this.d0.g[i3];
            InputStream dVar = new ax.Kc.d(this.g0, lVar2.getSize());
            if (lVar2.j()) {
                dVar = new ax.Kc.g(dVar, lVar2.getSize(), lVar2.g());
            }
            this.l0.add(dVar);
            lVar2.w(lVar.f());
            i3++;
        }
        return true;
    }

    private static char m(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 2) {
            return byteBuffer.getChar();
        }
        throw new EOFException();
    }

    private ax.Bc.b m1(byte[] bArr) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        long position = this.c0.position() + 20;
        long position2 = this.c0.position() + 1048576 > this.c0.size() ? this.c0.position() : this.c0.size() - 1048576;
        long size = this.c0.size() - 1;
        while (size > position2) {
            size--;
            this.c0.position(size);
            allocate.rewind();
            if (this.c0.read(allocate) < 1) {
                throw new EOFException();
            }
            byte b2 = allocate.array()[0];
            if (b2 == 23 || b2 == 1) {
                try {
                    s sVar = new s();
                    sVar.a = size - position;
                    sVar.b = this.c0.size() - size;
                    ax.Bc.b W = W(sVar, bArr, false);
                    if (W.b.length > 0 && W.g.length > 0) {
                        return W;
                    }
                } catch (Exception unused) {
                }
            }
        }
        throw new IOException("Start header corrupt and unable to guess end header");
    }

    private static byte[] n1(char[] cArr) throws IOException {
        if (cArr == null) {
            return null;
        }
        ByteBuffer encode = n0.encode(CharBuffer.wrap(cArr));
        if (encode.hasArray()) {
            return encode.array();
        }
        byte[] bArr = new byte[encode.remaining()];
        encode.get(bArr);
        return bArr;
    }

    private InputStream o() throws IOException {
        if (this.d0.g[this.e0].getSize() == 0) {
            return new ByteArrayInputStream(ax.Kc.f.a);
        }
        if (this.l0.isEmpty()) {
            throw new IllegalStateException("No current 7z entry (call getNextEntry() first).");
        }
        while (this.l0.size() > 1) {
            InputStream remove = this.l0.remove(0);
            try {
                ax.Kc.n.i(remove, Long.MAX_VALUE);
                if (remove != null) {
                    remove.close();
                }
                this.j0 = 0L;
            } finally {
            }
        }
        return this.l0.get(0);
    }

    private void o0(ByteBuffer byteBuffer) throws IOException {
        int H = H(byteBuffer);
        while (H != 0) {
            j(byteBuffer, new byte[(int) Z0(byteBuffer)]);
            H = H(byteBuffer);
        }
    }

    private BitSet s0(ByteBuffer byteBuffer, int i) throws IOException {
        BitSet bitSet = new BitSet(i);
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 == 0) {
                i3 = H(byteBuffer);
                i2 = 128;
            }
            bitSet.set(i4, (i3 & i2) != 0);
            i2 >>>= 1;
        }
        return bitSet;
    }

    private ByteBuffer u0(ByteBuffer byteBuffer, ax.Bc.b bVar, byte[] bArr) throws IOException {
        int position = byteBuffer.position();
        b bVar2 = new b(null);
        h1(byteBuffer, bVar2);
        bVar2.r(this.i0.a());
        byteBuffer.position(position);
        T0(byteBuffer, bVar);
        i[] iVarArr = bVar.e;
        if (iVarArr == null || iVarArr.length == 0) {
            throw new IOException("no folders, can't read encoded header");
        }
        long[] jArr = bVar.b;
        if (jArr == null || jArr.length == 0) {
            throw new IOException("no packed streams, can't read encoded header");
        }
        i iVar = iVarArr[0];
        this.c0.position(bVar.a + 32);
        d dVar = new d(this.c0, bVar.b[0]);
        InputStream inputStream = dVar;
        for (e eVar : iVar.c()) {
            if (eVar.b != 1 || eVar.c != 1) {
                throw new IOException("Multi input/output stream coders are not yet supported");
            }
            inputStream = g.a(this.q, inputStream, iVar.e(eVar), eVar, bArr, this.i0.a());
        }
        if (iVar.g) {
            inputStream = new ax.Kc.g(inputStream, iVar.d(), iVar.h);
        }
        int c = c("unpackSize", iVar.d());
        byte[] g = ax.Kc.n.g(inputStream, c);
        if (g.length < c) {
            throw new IOException("premature end of stream");
        }
        inputStream.close();
        return ByteBuffer.wrap(g).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static int v(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            return byteBuffer.getInt();
        }
        throw new EOFException();
    }

    public l F() throws IOException {
        int i = this.e0;
        l[] lVarArr = this.d0.g;
        if (i >= lVarArr.length - 1) {
            return null;
        }
        int i2 = i + 1;
        this.e0 = i2;
        l lVar = lVarArr[i2];
        if (lVar.getName() == null && this.i0.c()) {
            lVar.I(p());
        }
        e(this.e0, false);
        this.j0 = 0L;
        this.k0 = 0L;
        return lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        SeekableByteChannel seekableByteChannel = this.c0;
        if (seekableByteChannel != null) {
            try {
                seekableByteChannel.close();
            } finally {
                this.c0 = null;
                byte[] bArr = this.h0;
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                this.h0 = null;
            }
        }
    }

    public String p() {
        if ("unknown archive".equals(this.q) || this.q == null) {
            return null;
        }
        String name = new File(this.q).getName();
        int lastIndexOf = name.lastIndexOf(".");
        if (lastIndexOf > 0) {
            return name.substring(0, lastIndexOf);
        }
        return name + "~";
    }

    public Iterable<l> q() {
        return new ArrayList(Arrays.asList(this.d0.g));
    }

    public String toString() {
        return this.d0.toString();
    }

    public InputStream u(l lVar) throws IOException {
        int i = 0;
        while (true) {
            l[] lVarArr = this.d0.g;
            if (i >= lVarArr.length) {
                i = -1;
                break;
            }
            if (lVar == lVarArr[i]) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            e(i, true);
            this.e0 = i;
            this.f0 = this.d0.h.d[i];
            return o();
        }
        throw new IllegalArgumentException("Can not find " + lVar.getName() + " in " + this.q);
    }

    class a extends FilterInputStream implements InputStreamRetargetInterface {
        a(InputStream inputStream) {
            super(inputStream);
        }

        private void a(int i) {
            n.this.j0 += i;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int read = ((FilterInputStream) this).in.read();
            if (read >= 0) {
                a(1);
            }
            return read;
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            return read(bArr, 0, bArr.length);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i, i2);
            if (read >= 0) {
                a(read);
            }
            return read;
        }
    }

    public n(File file, char[] cArr, o oVar) throws IOException {
        this(Files.newByteChannel(FileRetargetClass.toPath(file), EnumSet.of(StandardOpenOption.READ), new FileAttribute[0]), file.getAbsolutePath(), n1(cArr), true, oVar);
    }

    public n(SeekableByteChannel seekableByteChannel) throws IOException {
        this(seekableByteChannel, o.d);
    }

    public n(SeekableByteChannel seekableByteChannel, o oVar) throws IOException {
        this(seekableByteChannel, "unknown archive", null, oVar);
    }

    public n(SeekableByteChannel seekableByteChannel, char[] cArr) throws IOException {
        this(seekableByteChannel, cArr, o.d);
    }

    public n(SeekableByteChannel seekableByteChannel, char[] cArr, o oVar) throws IOException {
        this(seekableByteChannel, "unknown archive", cArr, oVar);
    }

    public n(SeekableByteChannel seekableByteChannel, String str, char[] cArr, o oVar) throws IOException {
        this(seekableByteChannel, str, n1(cArr), false, oVar);
    }

    private n(SeekableByteChannel seekableByteChannel, String str, byte[] bArr, boolean z, o oVar) throws IOException {
        this.e0 = -1;
        this.f0 = -1;
        this.l0 = new ArrayList<>();
        this.c0 = seekableByteChannel;
        this.q = str;
        this.i0 = oVar;
        try {
            this.d0 = G0(bArr);
            if (bArr != null) {
                this.h0 = Arrays.copyOf(bArr, bArr.length);
            } else {
                this.h0 = null;
            }
        } catch (Throwable th) {
            if (z) {
                this.c0.close();
            }
            throw th;
        }
    }

    public n(File file) throws IOException {
        this(file, o.d);
    }

    public n(File file, o oVar) throws IOException {
        this(file, (char[]) null, oVar);
    }
}
