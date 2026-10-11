/*
 * Decompiled with CFR 0.152.
 */
package ax.Bc;

import ax.Ac.a;
import ax.Bc.g;
import ax.Bc.l;
import ax.Bc.n;
import ax.Bc.p;
import ax.Bc.q;
import ax.Kc.k;
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

public class r
implements Closeable,
AutoCloseable {
    private final List<l> c0 = new ArrayList<l>();
    private int d0;
    private final CRC32 e0 = new CRC32();
    private final CRC32 f0 = new CRC32();
    private long g0;
    private boolean h0;
    private k i0;
    private k[] j0;
    private Iterable<? extends q> k0 = Collections.singletonList(new q(p.e0));
    private final Map<l, long[]> l0 = new HashMap<l, long[]>();
    private final SeekableByteChannel q;

    public r(SeekableByteChannel seekableByteChannel) throws IOException {
        this.q = seekableByteChannel;
        seekableByteChannel.position(32L);
    }

    private void A(DataOutput dataOutput) throws IOException {
        Object object = this.c0.iterator();
        int n8 = 0;
        while (object.hasNext()) {
            if (!object.next().i()) continue;
            ++n8;
        }
        if (n8 > 0) {
            dataOutput.write(19);
            object = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream((OutputStream)object);
            if (n8 != this.c0.size()) {
                dataOutputStream.write(0);
                BitSet object2 = new BitSet(this.c0.size());
                for (n8 = 0; n8 < this.c0.size(); ++n8) {
                    object2.set(n8, this.c0.get(n8).i());
                }
                this.v(dataOutputStream, object2, this.c0.size());
            } else {
                dataOutputStream.write(1);
            }
            dataOutputStream.write(0);
            for (l l8 : this.c0) {
                if (!l8.i()) continue;
                dataOutputStream.writeLong(Long.reverseBytes(l.q(l8.c())));
            }
            dataOutputStream.flush();
            object = ((ByteArrayOutputStream)object).toByteArray();
            this.M0(dataOutput, ((Object)object).length);
            dataOutput.write((byte[])object);
        }
    }

    private void A0(DataOutput dataOutput, l object) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Iterator<? extends q> iterator = this.m((l)object).iterator();
        int n8 = 0;
        while (iterator.hasNext()) {
            object = iterator.next();
            ++n8;
            this.F0((q)object, byteArrayOutputStream);
        }
        this.M0(dataOutput, n8);
        dataOutput.write(byteArrayOutputStream.toByteArray());
        long l8 = 0L;
        while (l8 < (long)(n8 - 1)) {
            long l9 = 1L + l8;
            this.M0(dataOutput, l9);
            this.M0(dataOutput, l8);
            l8 = l9;
        }
    }

    private void C0(DataOutput dataOutput) throws IOException {
        dataOutput.write(1);
        dataOutput.write(4);
        this.G0(dataOutput);
        this.u0(dataOutput);
        dataOutput.write(0);
    }

    private void D0(DataOutput dataOutput) throws IOException {
        dataOutput.write(6);
        this.M0(dataOutput, 0L);
        this.M0(dataOutput, (long)this.d0 & 0xFFFFFFFFL);
        dataOutput.write(9);
        for (l l8 : this.c0) {
            if (!l8.o()) continue;
            this.M0(dataOutput, l8.e());
        }
        dataOutput.write(10);
        dataOutput.write(1);
        for (l l8 : this.c0) {
            if (!l8.o()) continue;
            dataOutput.writeInt(Integer.reverseBytes((int)l8.d()));
        }
        dataOutput.write(0);
    }

    private void F(DataOutput dataOutput) throws IOException {
        Object object;
        boolean bl = false;
        Object object2 = new BitSet(0);
        Object object3 = this.c0.iterator();
        int n8 = 0;
        while (object3.hasNext()) {
            object = object3.next();
            if (((l)object).o()) continue;
            boolean bl2 = ((l)object).p();
            ((BitSet)object2).set(n8, bl2);
            bl |= bl2;
            ++n8;
        }
        if (bl) {
            dataOutput.write(16);
            object = new ByteArrayOutputStream();
            object3 = new DataOutputStream((OutputStream)object);
            this.v((DataOutput)object3, (BitSet)object2, n8);
            ((DataOutputStream)object3).flush();
            object2 = ((ByteArrayOutputStream)object).toByteArray();
            this.M0(dataOutput, ((Object)object2).length);
            dataOutput.write((byte[])object2);
        }
    }

    private void F0(q object, OutputStream outputStream) throws IOException {
        int n8;
        byte[] byArray = ((q)object).a().h();
        object = g.c(((q)object).a()).d(((q)object).b());
        int n9 = n8 = byArray.length;
        if (((Object)object).length > 0) {
            n9 = n8 | 0x20;
        }
        outputStream.write(n9);
        outputStream.write(byArray);
        if (((Object)object).length > 0) {
            outputStream.write(((Object)object).length);
            outputStream.write((byte[])object);
        }
    }

    private void G0(DataOutput dataOutput) throws IOException {
        if (this.d0 > 0) {
            this.D0(dataOutput);
            this.T0(dataOutput);
        }
        this.L0(dataOutput);
        dataOutput.write(0);
    }

    private void H(DataOutput dataOutput) throws IOException {
        Object object = this.c0.iterator();
        int n8 = 0;
        while (object.hasNext()) {
            if (!object.next().k()) continue;
            ++n8;
        }
        if (n8 > 0) {
            dataOutput.write(18);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            object = new DataOutputStream(byteArrayOutputStream);
            if (n8 != this.c0.size()) {
                ((DataOutputStream)object).write(0);
                BitSet object2 = new BitSet(this.c0.size());
                for (n8 = 0; n8 < this.c0.size(); ++n8) {
                    object2.set(n8, this.c0.get(n8).k());
                }
                this.v((DataOutput)object, object2, this.c0.size());
            } else {
                ((DataOutputStream)object).write(1);
            }
            ((DataOutputStream)object).write(0);
            for (l l8 : this.c0) {
                if (!l8.k()) continue;
                ((DataOutputStream)object).writeLong(Long.reverseBytes(l.q(l8.h())));
            }
            ((DataOutputStream)object).flush();
            object = byteArrayOutputStream.toByteArray();
            this.M0(dataOutput, ((Object)object).length);
            dataOutput.write((byte[])object);
        }
    }

    private void L(DataOutput dataOutput) throws IOException {
        Object object;
        boolean bl = false;
        Object object2 = new BitSet(0);
        Object object3 = this.c0.iterator();
        int n8 = 0;
        while (object3.hasNext()) {
            object = object3.next();
            if (((l)object).o()) continue;
            boolean bl2 = ((l)object).isDirectory();
            ((BitSet)object2).set(n8, bl2 ^ true);
            bl |= bl2 ^ true;
            ++n8;
        }
        if (bl) {
            dataOutput.write(15);
            object = new ByteArrayOutputStream();
            object3 = new DataOutputStream((OutputStream)object);
            this.v((DataOutput)object3, (BitSet)object2, n8);
            ((DataOutputStream)object3).flush();
            object2 = ((ByteArrayOutputStream)object).toByteArray();
            this.M0(dataOutput, ((Object)object2).length);
            dataOutput.write((byte[])object2);
        }
    }

    private void L0(DataOutput dataOutput) throws IOException {
        dataOutput.write(8);
        dataOutput.write(0);
    }

    private void M0(DataOutput dataOutput, long l8) throws IOException {
        int n8;
        int n9 = 0;
        int n10 = 0;
        int n11 = 128;
        while (true) {
            n8 = n10;
            if (n9 >= 8) break;
            n8 = n9 + 1;
            if (l8 < 1L << n8 * 7) {
                n8 = (int)((long)n10 | l8 >>> n9 * 8);
                break;
            }
            n10 |= n11;
            n11 >>>= 1;
            n9 = n8;
        }
        dataOutput.write(n8);
        while (n9 > 0) {
            dataOutput.write((int)(0xFFL & l8));
            l8 >>>= 8;
            --n9;
        }
    }

    private void T0(DataOutput dataOutput) throws IOException {
        dataOutput.write(7);
        dataOutput.write(11);
        this.M0(dataOutput, this.d0);
        dataOutput.write(0);
        for (l l8 : this.c0) {
            if (!l8.o()) continue;
            this.A0(dataOutput, l8);
        }
        dataOutput.write(12);
        for (l l9 : this.c0) {
            if (!l9.o()) continue;
            long[] lArray = this.l0.get(l9);
            if (lArray != null) {
                int n8 = lArray.length;
                for (int i8 = 0; i8 < n8; ++i8) {
                    this.M0(dataOutput, lArray[i8]);
                }
            }
            this.M0(dataOutput, l9.getSize());
        }
        dataOutput.write(10);
        dataOutput.write(1);
        for (l l10 : this.c0) {
            if (!l10.o()) continue;
            dataOutput.writeInt(Integer.reverseBytes((int)l10.g()));
        }
        dataOutput.write(0);
    }

    private void W(DataOutput dataOutput) throws IOException {
        Object object = this.c0.iterator();
        while (object.hasNext()) {
            if (object.next().o()) continue;
            dataOutput.write(14);
            object = new BitSet(this.c0.size());
            for (int i8 = 0; i8 < this.c0.size(); ++i8) {
                ((BitSet)object).set(i8, this.c0.get(i8).o() ^ true);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            this.v(dataOutputStream, (BitSet)object, this.c0.size());
            dataOutputStream.flush();
            object = byteArrayOutputStream.toByteArray();
            this.M0(dataOutput, ((Object)object).length);
            dataOutput.write((byte[])object);
            break;
        }
    }

    private void d0(DataOutput dataOutput) throws IOException {
        Object object = this.c0.iterator();
        int n8 = 0;
        while (object.hasNext()) {
            if (!object.next().l()) continue;
            ++n8;
        }
        if (n8 > 0) {
            dataOutput.write(20);
            object = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream((OutputStream)object);
            if (n8 != this.c0.size()) {
                dataOutputStream.write(0);
                BitSet object2 = new BitSet(this.c0.size());
                for (n8 = 0; n8 < this.c0.size(); ++n8) {
                    object2.set(n8, this.c0.get(n8).l());
                }
                this.v(dataOutputStream, object2, this.c0.size());
            } else {
                dataOutputStream.write(1);
            }
            dataOutputStream.write(0);
            for (l l8 : this.c0) {
                if (!l8.l()) continue;
                dataOutputStream.writeLong(Long.reverseBytes(l.q(l8.b())));
            }
            dataOutputStream.flush();
            object = ((ByteArrayOutputStream)object).toByteArray();
            this.M0(dataOutput, ((Object)object).length);
            dataOutput.write((byte[])object);
        }
    }

    static /* synthetic */ long e(r r8, long l8) {
        r8.g0 = l8;
        return l8;
    }

    static /* synthetic */ long f(r r8) {
        long l8 = r8.g0;
        r8.g0 = 1L + l8;
        return l8;
    }

    private Iterable<? extends q> m(l iterable) {
        Iterable<? extends q> iterable2 = ((l)((Object)iterable)).f();
        iterable = iterable2;
        if (iterable2 == null) {
            iterable = this.k0;
        }
        return iterable;
    }

    private OutputStream o() throws IOException {
        if (this.i0 == null) {
            this.i0 = this.q();
        }
        return this.i0;
    }

    private void o0(DataOutput dataOutput) throws IOException {
        dataOutput.write(17);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.write(0);
        Object object = this.c0.iterator();
        while (object.hasNext()) {
            ((OutputStream)dataOutputStream).write(object.next().getName().getBytes(StandardCharsets.UTF_16LE));
            dataOutputStream.writeShort(0);
        }
        dataOutputStream.flush();
        object = byteArrayOutputStream.toByteArray();
        this.M0(dataOutput, ((Object)object).length);
        dataOutput.write((byte[])object);
    }

    private k q() throws IOException {
        if (!this.c0.isEmpty()) {
            OutputStream outputStream = new b(this);
            ArrayList<Object> arrayList = new ArrayList<Object>();
            Object object = this.c0;
            int n8 = object.size();
            boolean bl = true;
            for (q q8 : this.m(object.get(n8 - 1))) {
                object = outputStream;
                if (!bl) {
                    object = new k(outputStream);
                    arrayList.add(object);
                }
                outputStream = g.b((OutputStream)object, q8.a(), q8.b());
                bl = false;
            }
            if (!arrayList.isEmpty()) {
                this.j0 = arrayList.toArray(new k[0]);
            }
            return new k(this, outputStream){
                final r c0;
                {
                    this.c0 = r8;
                    super(outputStream);
                }

                @Override
                public void write(int n8) throws IOException {
                    super.write(n8);
                    this.c0.e0.update(n8);
                }

                @Override
                public void write(byte[] byArray) throws IOException {
                    super.write(byArray);
                    this.c0.e0.update(byArray);
                }

                @Override
                public void write(byte[] byArray, int n8, int n9) throws IOException {
                    super.write(byArray, n8, n9);
                    this.c0.e0.update(byArray, n8, n9);
                }
            };
        }
        throw new IllegalStateException("No current 7z entry");
    }

    private void s0(DataOutput dataOutput) throws IOException {
        Object object = this.c0.iterator();
        int n8 = 0;
        while (object.hasNext()) {
            if (!object.next().m()) continue;
            ++n8;
        }
        if (n8 > 0) {
            dataOutput.write(21);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            object = new DataOutputStream(byteArrayOutputStream);
            if (n8 != this.c0.size()) {
                ((DataOutputStream)object).write(0);
                BitSet bitSet = new BitSet(this.c0.size());
                for (n8 = 0; n8 < this.c0.size(); ++n8) {
                    bitSet.set(n8, this.c0.get(n8).m());
                }
                this.v((DataOutput)object, bitSet, this.c0.size());
            } else {
                ((DataOutputStream)object).write(1);
            }
            ((DataOutputStream)object).write(0);
            for (l l8 : this.c0) {
                if (!l8.m()) continue;
                ((DataOutputStream)object).writeInt(Integer.reverseBytes(l8.n()));
            }
            ((DataOutputStream)object).flush();
            object = byteArrayOutputStream.toByteArray();
            this.M0(dataOutput, ((Object)object).length);
            dataOutput.write((byte[])object);
        }
    }

    private void u0(DataOutput dataOutput) throws IOException {
        dataOutput.write(5);
        this.M0(dataOutput, this.c0.size());
        this.W(dataOutput);
        this.L(dataOutput);
        this.F(dataOutput);
        this.o0(dataOutput);
        this.H(dataOutput);
        this.A(dataOutput);
        this.d0(dataOutput);
        this.s0(dataOutput);
        dataOutput.write(0);
    }

    private void v(DataOutput dataOutput, BitSet bitSet, int n8) throws IOException {
        int n9 = 7;
        int n10 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            int n11;
            int n12 = n10 | bitSet.get(i8) << n9;
            n9 = n11 = n9 - 1;
            n10 = n12;
            if (n11 >= 0) continue;
            dataOutput.write(n12);
            n9 = 7;
            n10 = 0;
        }
        if (n9 != 7) {
            dataOutput.write(n10);
        }
    }

    @Override
    public void close() throws IOException {
        Throwable throwable2;
        block3: {
            block2: {
                try {
                    if (this.h0) break block2;
                    this.j();
                }
                catch (Throwable throwable2) {
                    break block3;
                }
            }
            this.q.close();
            return;
        }
        this.q.close();
        throw throwable2;
    }

    public void g() throws IOException {
        Object object = this.i0;
        if (object != null) {
            ((OutputStream)object).flush();
            ((OutputStream)this.i0).close();
        }
        object = this.c0;
        object = (l)object.get(object.size() - 1);
        long l8 = this.g0;
        if (l8 > 0L) {
            ((l)object).E(true);
            ++this.d0;
            ((l)object).J(this.i0.b());
            ((l)object).v(this.g0);
            ((l)object).x(this.e0.getValue());
            ((l)object).u(this.f0.getValue());
            ((l)object).B(true);
            k[] kArray = this.j0;
            if (kArray != null) {
                long[] lArray = new long[kArray.length];
                for (int i8 = 0; i8 < (kArray = this.j0).length; ++i8) {
                    lArray[i8] = kArray[i8].b();
                }
                this.l0.put((l)object, lArray);
            }
        } else {
            ((l)object).E(false);
            ((l)object).J(0L);
            ((l)object).v(0L);
            ((l)object).B(false);
        }
        this.i0 = null;
        this.j0 = null;
        this.e0.reset();
        this.f0.reset();
        this.g0 = 0L;
    }

    public void j() throws IOException {
        if (!this.h0) {
            this.h0 = true;
            long l8 = this.q.position();
            Object object = new ByteArrayOutputStream();
            Object object2 = new DataOutputStream((OutputStream)object);
            this.C0((DataOutput)object2);
            ((DataOutputStream)object2).flush();
            byte[] byArray = ((ByteArrayOutputStream)object).toByteArray();
            this.q.write(ByteBuffer.wrap(byArray));
            object2 = new CRC32();
            object2.update(byArray);
            object = n.m0;
            ByteBuffer byteBuffer = ByteBuffer.allocate(((Object)object).length + 26).order(ByteOrder.LITTLE_ENDIAN);
            this.q.position(0L);
            byteBuffer.put((byte[])object);
            byteBuffer.put((byte)0).put((byte)2);
            byteBuffer.putInt(0);
            byteBuffer.putLong(l8 - 32L).putLong((long)byArray.length & 0xFFFFFFFFL).putInt((int)((CRC32)object2).getValue());
            ((CRC32)object2).reset();
            ((CRC32)object2).update(byteBuffer.array(), ((Object)object).length + 6, 20);
            byteBuffer.putInt(((Object)object).length + 2, (int)((CRC32)object2).getValue());
            byteBuffer.flip();
            this.q.write(byteBuffer);
            return;
        }
        throw new IOException("This archive has already been finished");
    }

    public void p(a a8) throws IOException {
        a8 = (l)a8;
        this.c0.add((l)a8);
    }

    public void u(byte[] byArray, int n8, int n9) throws IOException {
        if (n9 > 0) {
            this.o().write(byArray, n8, n9);
        }
    }

    private class b
    extends OutputStream
    implements AutoCloseable {
        final r c0;
        private final ByteBuffer q;

        private b(r r8) {
            this.c0 = r8;
            this.q = ByteBuffer.allocate(8192);
        }

        @Override
        public void close() throws IOException {
        }

        @Override
        public void flush() throws IOException {
        }

        @Override
        public void write(int n8) throws IOException {
            this.q.clear();
            this.q.put((byte)n8).flip();
            this.c0.q.write(this.q);
            this.c0.f0.update(n8);
            r.f(this.c0);
        }

        @Override
        public void write(byte[] byArray) throws IOException {
            this.write(byArray, 0, byArray.length);
        }

        @Override
        public void write(byte[] object, int n8, int n9) throws IOException {
            if (n9 > 8192) {
                this.c0.q.write(ByteBuffer.wrap(object, n8, n9));
            } else {
                this.q.clear();
                this.q.put((byte[])object, n8, n9).flip();
                this.c0.q.write(this.q);
            }
            this.c0.f0.update((byte[])object, n8, n9);
            object = this.c0;
            r.e((r)object, ((r)object).g0 + (long)n9);
        }
    }
}

