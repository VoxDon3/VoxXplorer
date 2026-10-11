package ax.Bc;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.CRC32;

/* loaded from: classes3.dex */
public class r implements Closeable, AutoCloseable {
    private int d0;
    private long g0;
    private boolean h0;
    private ax.Kc.k i0;
    private ax.Kc.k[] j0;
    private final SeekableByteChannel q;
    private final List<l> c0 = new ArrayList();
    private final CRC32 e0 = new CRC32();
    private final CRC32 f0 = new CRC32();
    private Iterable<? extends q> k0 = Collections.singletonList(new q(p.LZMA2));
    private final Map<l, long[]> l0 = new HashMap();

    public r(SeekableByteChannel seekableByteChannel) throws IOException {
        this.q = seekableByteChannel;
        seekableByteChannel.position(32L);
    }

    private void A(DataOutput dataOutput) throws IOException {
        Iterator<l> it = this.c0.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().i()) {
                i++;
            }
        }
        if (i > 0) {
            dataOutput.write(19);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            if (i != this.c0.size()) {
                dataOutputStream.write(0);
                BitSet bitSet = new BitSet(this.c0.size());
                for (int i2 = 0; i2 < this.c0.size(); i2++) {
                    bitSet.set(i2, this.c0.get(i2).i());
                }
                v(dataOutputStream, bitSet, this.c0.size());
            } else {
                dataOutputStream.write(1);
            }
            dataOutputStream.write(0);
            for (l lVar : this.c0) {
                if (lVar.i()) {
                    dataOutputStream.writeLong(Long.reverseBytes(l.q(lVar.c())));
                }
            }
            dataOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            M0(dataOutput, byteArray.length);
            dataOutput.write(byteArray);
        }
    }

    private void A0(DataOutput dataOutput, l lVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Iterator<? extends q> it = m(lVar).iterator();
        int i = 0;
        while (it.hasNext()) {
            i++;
            F0(it.next(), byteArrayOutputStream);
        }
        M0(dataOutput, i);
        dataOutput.write(byteArrayOutputStream.toByteArray());
        long j = 0;
        while (j < i - 1) {
            long j2 = 1 + j;
            M0(dataOutput, j2);
            M0(dataOutput, j);
            j = j2;
        }
    }

    private void C0(DataOutput dataOutput) throws IOException {
        dataOutput.write(1);
        dataOutput.write(4);
        G0(dataOutput);
        u0(dataOutput);
        dataOutput.write(0);
    }

    private void D0(DataOutput dataOutput) throws IOException {
        dataOutput.write(6);
        M0(dataOutput, 0L);
        M0(dataOutput, this.d0 & 4294967295L);
        dataOutput.write(9);
        for (l lVar : this.c0) {
            if (lVar.o()) {
                M0(dataOutput, lVar.e());
            }
        }
        dataOutput.write(10);
        dataOutput.write(1);
        for (l lVar2 : this.c0) {
            if (lVar2.o()) {
                dataOutput.writeInt(Integer.reverseBytes((int) lVar2.d()));
            }
        }
        dataOutput.write(0);
    }

    private void F(DataOutput dataOutput) throws IOException {
        boolean z = false;
        BitSet bitSet = new BitSet(0);
        int i = 0;
        for (l lVar : this.c0) {
            if (!lVar.o()) {
                boolean p = lVar.p();
                bitSet.set(i, p);
                z |= p;
                i++;
            }
        }
        if (z) {
            dataOutput.write(16);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            v(dataOutputStream, bitSet, i);
            dataOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            M0(dataOutput, byteArray.length);
            dataOutput.write(byteArray);
        }
    }

    private void F0(q qVar, OutputStream outputStream) throws IOException {
        byte[] h = qVar.a().h();
        byte[] d = g.c(qVar.a()).d(qVar.b());
        int length = h.length;
        if (d.length > 0) {
            length |= 32;
        }
        outputStream.write(length);
        outputStream.write(h);
        if (d.length > 0) {
            outputStream.write(d.length);
            outputStream.write(d);
        }
    }

    private void G0(DataOutput dataOutput) throws IOException {
        if (this.d0 > 0) {
            D0(dataOutput);
            T0(dataOutput);
        }
        L0(dataOutput);
        dataOutput.write(0);
    }

    private void H(DataOutput dataOutput) throws IOException {
        Iterator<l> it = this.c0.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().k()) {
                i++;
            }
        }
        if (i > 0) {
            dataOutput.write(18);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            if (i != this.c0.size()) {
                dataOutputStream.write(0);
                BitSet bitSet = new BitSet(this.c0.size());
                for (int i2 = 0; i2 < this.c0.size(); i2++) {
                    bitSet.set(i2, this.c0.get(i2).k());
                }
                v(dataOutputStream, bitSet, this.c0.size());
            } else {
                dataOutputStream.write(1);
            }
            dataOutputStream.write(0);
            for (l lVar : this.c0) {
                if (lVar.k()) {
                    dataOutputStream.writeLong(Long.reverseBytes(l.q(lVar.h())));
                }
            }
            dataOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            M0(dataOutput, byteArray.length);
            dataOutput.write(byteArray);
        }
    }

    private void L(DataOutput dataOutput) throws IOException {
        boolean z = false;
        BitSet bitSet = new BitSet(0);
        int i = 0;
        for (l lVar : this.c0) {
            if (!lVar.o()) {
                boolean isDirectory = lVar.isDirectory();
                bitSet.set(i, !isDirectory);
                z |= !isDirectory;
                i++;
            }
        }
        if (z) {
            dataOutput.write(15);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            v(dataOutputStream, bitSet, i);
            dataOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            M0(dataOutput, byteArray.length);
            dataOutput.write(byteArray);
        }
    }

    private void L0(DataOutput dataOutput) throws IOException {
        dataOutput.write(8);
        dataOutput.write(0);
    }

    private void M0(DataOutput dataOutput, long j) throws IOException {
        int i = 0;
        int i2 = 0;
        int i3 = 128;
        while (true) {
            if (i >= 8) {
                break;
            }
            int i4 = i + 1;
            if (j < (1 << (i4 * 7))) {
                i2 = (int) (i2 | (j >>> (i * 8)));
                break;
            } else {
                i2 |= i3;
                i3 >>>= 1;
                i = i4;
            }
        }
        dataOutput.write(i2);
        while (i > 0) {
            dataOutput.write((int) (255 & j));
            j >>>= 8;
            i--;
        }
    }

    private void T0(DataOutput dataOutput) throws IOException {
        dataOutput.write(7);
        dataOutput.write(11);
        M0(dataOutput, this.d0);
        dataOutput.write(0);
        for (l lVar : this.c0) {
            if (lVar.o()) {
                A0(dataOutput, lVar);
            }
        }
        dataOutput.write(12);
        for (l lVar2 : this.c0) {
            if (lVar2.o()) {
                long[] jArr = this.l0.get(lVar2);
                if (jArr != null) {
                    for (long j : jArr) {
                        M0(dataOutput, j);
                    }
                }
                M0(dataOutput, lVar2.getSize());
            }
        }
        dataOutput.write(10);
        dataOutput.write(1);
        for (l lVar3 : this.c0) {
            if (lVar3.o()) {
                dataOutput.writeInt(Integer.reverseBytes((int) lVar3.g()));
            }
        }
        dataOutput.write(0);
    }

    private void W(DataOutput dataOutput) throws IOException {
        Iterator<l> it = this.c0.iterator();
        while (it.hasNext()) {
            if (!it.next().o()) {
                dataOutput.write(14);
                BitSet bitSet = new BitSet(this.c0.size());
                for (int i = 0; i < this.c0.size(); i++) {
                    bitSet.set(i, !this.c0.get(i).o());
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                v(dataOutputStream, bitSet, this.c0.size());
                dataOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                M0(dataOutput, byteArray.length);
                dataOutput.write(byteArray);
                return;
            }
        }
    }

    private void d0(DataOutput dataOutput) throws IOException {
        Iterator<l> it = this.c0.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().l()) {
                i++;
            }
        }
        if (i > 0) {
            dataOutput.write(20);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            if (i != this.c0.size()) {
                dataOutputStream.write(0);
                BitSet bitSet = new BitSet(this.c0.size());
                for (int i2 = 0; i2 < this.c0.size(); i2++) {
                    bitSet.set(i2, this.c0.get(i2).l());
                }
                v(dataOutputStream, bitSet, this.c0.size());
            } else {
                dataOutputStream.write(1);
            }
            dataOutputStream.write(0);
            for (l lVar : this.c0) {
                if (lVar.l()) {
                    dataOutputStream.writeLong(Long.reverseBytes(l.q(lVar.b())));
                }
            }
            dataOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            M0(dataOutput, byteArray.length);
            dataOutput.write(byteArray);
        }
    }

    static /* synthetic */ long f(r rVar) {
        long j = rVar.g0;
        rVar.g0 = 1 + j;
        return j;
    }

    private Iterable<? extends q> m(l lVar) {
        Iterable<? extends q> f = lVar.f();
        return f == null ? this.k0 : f;
    }

    private OutputStream o() throws IOException {
        if (this.i0 == null) {
            this.i0 = q();
        }
        return this.i0;
    }

    private void o0(DataOutput dataOutput) throws IOException {
        dataOutput.write(17);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.write(0);
        Iterator<l> it = this.c0.iterator();
        while (it.hasNext()) {
            dataOutputStream.write(it.next().getName().getBytes(StandardCharsets.UTF_16LE));
            dataOutputStream.writeShort(0);
        }
        dataOutputStream.flush();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        M0(dataOutput, byteArray.length);
        dataOutput.write(byteArray);
    }

    private ax.Kc.k q() throws IOException {
        if (this.c0.isEmpty()) {
            throw new IllegalStateException("No current 7z entry");
        }
        OutputStream bVar = new b(this, null);
        ArrayList arrayList = new ArrayList();
        List<l> list = this.c0;
        boolean z = true;
        for (q qVar : m(list.get(list.size() - 1))) {
            if (!z) {
                ax.Kc.k kVar = new ax.Kc.k(bVar);
                arrayList.add(kVar);
                bVar = kVar;
            }
            bVar = g.b(bVar, qVar.a(), qVar.b());
            z = false;
        }
        if (!arrayList.isEmpty()) {
            this.j0 = (ax.Kc.k[]) arrayList.toArray(new ax.Kc.k[0]);
        }
        return new a(bVar);
    }

    private void s0(DataOutput dataOutput) throws IOException {
        Iterator<l> it = this.c0.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().m()) {
                i++;
            }
        }
        if (i > 0) {
            dataOutput.write(21);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            if (i != this.c0.size()) {
                dataOutputStream.write(0);
                BitSet bitSet = new BitSet(this.c0.size());
                for (int i2 = 0; i2 < this.c0.size(); i2++) {
                    bitSet.set(i2, this.c0.get(i2).m());
                }
                v(dataOutputStream, bitSet, this.c0.size());
            } else {
                dataOutputStream.write(1);
            }
            dataOutputStream.write(0);
            for (l lVar : this.c0) {
                if (lVar.m()) {
                    dataOutputStream.writeInt(Integer.reverseBytes(lVar.n()));
                }
            }
            dataOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            M0(dataOutput, byteArray.length);
            dataOutput.write(byteArray);
        }
    }

    private void u0(DataOutput dataOutput) throws IOException {
        dataOutput.write(5);
        M0(dataOutput, this.c0.size());
        W(dataOutput);
        L(dataOutput);
        F(dataOutput);
        o0(dataOutput);
        H(dataOutput);
        A(dataOutput);
        d0(dataOutput);
        s0(dataOutput);
        dataOutput.write(0);
    }

    private void v(DataOutput dataOutput, BitSet bitSet, int i) throws IOException {
        int i2 = 7;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 |= (bitSet.get(i4) ? 1 : 0) << i2;
            i2--;
            if (i2 < 0) {
                dataOutput.write(i3);
                i2 = 7;
                i3 = 0;
            }
        }
        if (i2 != 7) {
            dataOutput.write(i3);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            if (!this.h0) {
                j();
            }
        } finally {
            this.q.close();
        }
    }

    public void g() throws IOException {
        ax.Kc.k kVar = this.i0;
        if (kVar != null) {
            kVar.flush();
            this.i0.close();
        }
        List<l> list = this.c0;
        l lVar = list.get(list.size() - 1);
        int i = 0;
        if (this.g0 > 0) {
            lVar.E(true);
            this.d0++;
            lVar.J(this.i0.b());
            lVar.v(this.g0);
            lVar.x(this.e0.getValue());
            lVar.u(this.f0.getValue());
            lVar.B(true);
            ax.Kc.k[] kVarArr = this.j0;
            if (kVarArr != null) {
                long[] jArr = new long[kVarArr.length];
                while (true) {
                    ax.Kc.k[] kVarArr2 = this.j0;
                    if (i >= kVarArr2.length) {
                        break;
                    }
                    jArr[i] = kVarArr2[i].b();
                    i++;
                }
                this.l0.put(lVar, jArr);
            }
        } else {
            lVar.E(false);
            lVar.J(0L);
            lVar.v(0L);
            lVar.B(false);
        }
        this.i0 = null;
        this.j0 = null;
        this.e0.reset();
        this.f0.reset();
        this.g0 = 0L;
    }

    public void j() throws IOException {
        if (this.h0) {
            throw new IOException("This archive has already been finished");
        }
        this.h0 = true;
        long position = this.q.position();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        C0(dataOutputStream);
        dataOutputStream.flush();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.q.write(ByteBuffer.wrap(byteArray));
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray);
        byte[] bArr = n.m0;
        ByteBuffer order = ByteBuffer.allocate(bArr.length + 26).order(ByteOrder.LITTLE_ENDIAN);
        this.q.position(0L);
        order.put(bArr);
        order.put((byte) 0).put((byte) 2);
        order.putInt(0);
        order.putLong(position - 32).putLong(byteArray.length & 4294967295L).putInt((int) crc32.getValue());
        crc32.reset();
        crc32.update(order.array(), bArr.length + 6, 20);
        order.putInt(bArr.length + 2, (int) crc32.getValue());
        order.flip();
        this.q.write(order);
    }

    public void p(ax.Ac.a aVar) throws IOException {
        this.c0.add((l) aVar);
    }

    public void u(byte[] bArr, int i, int i2) throws IOException {
        if (i2 > 0) {
            o().write(bArr, i, i2);
        }
    }

    class a extends ax.Kc.k {
        a(OutputStream outputStream) {
            super(outputStream);
        }

        @Override // ax.Kc.k, java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i) throws IOException {
            super.write(i);
            r.this.e0.update(i);
        }

        @Override // ax.Kc.k, java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            super.write(bArr);
            r.this.e0.update(bArr);
        }

        @Override // ax.Kc.k, java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            super.write(bArr, i, i2);
            r.this.e0.update(bArr, i, i2);
        }
    }

    private class b extends OutputStream implements AutoCloseable {
        private final ByteBuffer q;

        private b() {
            this.q = ByteBuffer.allocate(8192);
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            this.q.clear();
            this.q.put((byte) i).flip();
            r.this.q.write(this.q);
            r.this.f0.update(i);
            r.f(r.this);
        }

        /* synthetic */ b(r rVar, a aVar) {
            this();
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            write(bArr, 0, bArr.length);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            if (i2 > 8192) {
                r.this.q.write(ByteBuffer.wrap(bArr, i, i2));
            } else {
                this.q.clear();
                this.q.put(bArr, i, i2).flip();
                r.this.q.write(this.q);
            }
            r.this.f0.update(bArr, i, i2);
            r.this.g0 += i2;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
        }
    }
}
