/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import ax.Q0.o;
import ax.S0.a;
import ax.S0.d0;
import ax.q1.L;
import ax.u7.i;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

public final class D0 {
    private static final byte[] d = new byte[]{79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};
    private static final byte[] e = new byte[]{79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    private ByteBuffer a = o.a;
    private int b = 2;
    private int c = 0;

    private ByteBuffer b(ByteBuffer object, byte[] byArray) {
        int n8;
        int n9;
        int n10 = ((Buffer)object).position();
        int n11 = ((Buffer)object).limit();
        int n12 = n11 - n10;
        int n13 = (n12 + 255) / 255;
        int n14 = n13 + 27 + n12;
        if (this.b == 2) {
            n9 = byArray != null ? byArray.length + 28 : d.length;
            n14 += e.length + n9;
            n8 = n9;
        } else {
            n8 = 0;
        }
        ByteBuffer byteBuffer = this.c(n14);
        if (this.b == 2) {
            if (byArray != null) {
                this.e(byteBuffer, byArray);
            } else {
                byteBuffer.put(d);
            }
            byteBuffer.put(e);
        }
        n9 = L.j((ByteBuffer)object);
        this.c = n9 = this.c + n9;
        this.f(byteBuffer, n9, this.b, n13, false);
        n14 = 0;
        n9 = n12;
        while (true) {
            if (n14 >= n13) break;
            if (n9 >= 255) {
                byteBuffer.put((byte)-1);
                n9 -= 255;
            } else {
                byteBuffer.put((byte)n9);
                n9 = 0;
            }
            ++n14;
        }
        for (n12 = n10; n12 < n11; ++n12) {
            byteBuffer.put(((ByteBuffer)object).get(n12));
        }
        ((ByteBuffer)object).position(((Buffer)object).limit());
        byteBuffer.flip();
        if (this.b == 2) {
            byArray = byteBuffer.array();
            n9 = byteBuffer.arrayOffset();
            object = e;
            n9 = d0.x(byArray, n9 + n8 + ((Object)object).length, byteBuffer.limit() - byteBuffer.position(), 0);
            byteBuffer.putInt(n8 + ((Object)object).length + 22, n9);
        } else {
            byteBuffer.putInt(22, d0.x(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position(), 0));
        }
        ++this.b;
        return byteBuffer;
    }

    private ByteBuffer c(int n8) {
        if (this.a.capacity() < n8) {
            this.a = ByteBuffer.allocate(n8).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.a.clear();
        }
        return this.a;
    }

    private void e(ByteBuffer byteBuffer, byte[] byArray) {
        this.f(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(i.a(byArray.length));
        byteBuffer.put(byArray);
        byteBuffer.putInt(22, d0.x(byteBuffer.array(), byteBuffer.arrayOffset(), byArray.length + 28, 0));
        byteBuffer.position(byArray.length + 28);
    }

    private void f(ByteBuffer byteBuffer, long l8, int n8, int n9, boolean bl) {
        byteBuffer.put((byte)79);
        byteBuffer.put((byte)103);
        byteBuffer.put((byte)103);
        byteBuffer.put((byte)83);
        byteBuffer.put((byte)0);
        byte by = bl ? (byte)2 : 0;
        byteBuffer.put(by);
        byteBuffer.putLong(l8);
        byteBuffer.putInt(0);
        byteBuffer.putInt(n8);
        byteBuffer.putInt(0);
        byteBuffer.put(i.a(n9));
    }

    public void a(ax.V0.i i8, List<byte[]> object) {
        ax.S0.a.e(i8.e0);
        if (i8.e0.limit() - i8.e0.position() == 0) {
            return;
        }
        object = this.b == 2 && (object.size() == 1 || object.size() == 3) ? (Object)object.get(0) : null;
        this.a = this.b(i8.e0, (byte[])object);
        i8.p();
        i8.C(this.a.remaining());
        i8.e0.put(this.a);
        i8.D();
    }

    public void d() {
        this.a = o.a;
        this.c = 0;
        this.b = 2;
    }
}

