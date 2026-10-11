package ax.a1;

import ax.S0.C0968a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* loaded from: classes.dex */
public final class D0 {
    private static final byte[] d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    private static final byte[] e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    private ByteBuffer a = ax.Q0.o.a;
    private int c = 0;
    private int b = 2;

    private ByteBuffer b(ByteBuffer byteBuffer, byte[] bArr) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = (i2 + 255) / 255;
        int i4 = i3 + 27 + i2;
        if (this.b == 2) {
            int length = bArr != null ? bArr.length + 28 : d.length;
            i4 += e.length + length;
            i = length;
        } else {
            i = 0;
        }
        ByteBuffer c = c(i4);
        if (this.b == 2) {
            if (bArr != null) {
                e(c, bArr);
            } else {
                c.put(d);
            }
            c.put(e);
        }
        int j = this.c + ax.q1.L.j(byteBuffer);
        this.c = j;
        f(c, j, this.b, i3, false);
        for (int i5 = 0; i5 < i3; i5++) {
            if (i2 >= 255) {
                c.put((byte) -1);
                i2 -= 255;
            } else {
                c.put((byte) i2);
                i2 = 0;
            }
        }
        while (position < limit) {
            c.put(byteBuffer.get(position));
            position++;
        }
        byteBuffer.position(byteBuffer.limit());
        c.flip();
        if (this.b == 2) {
            byte[] array = c.array();
            int arrayOffset = c.arrayOffset() + i;
            byte[] bArr2 = e;
            c.putInt(i + bArr2.length + 22, ax.S0.d0.x(array, arrayOffset + bArr2.length, c.limit() - c.position(), 0));
        } else {
            c.putInt(22, ax.S0.d0.x(c.array(), c.arrayOffset(), c.limit() - c.position(), 0));
        }
        this.b++;
        return c;
    }

    private ByteBuffer c(int i) {
        if (this.a.capacity() < i) {
            this.a = ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.a.clear();
        }
        return this.a;
    }

    private void e(ByteBuffer byteBuffer, byte[] bArr) {
        f(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(ax.u7.i.a(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, ax.S0.d0.x(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    private void f(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(ax.u7.i.a(i2));
    }

    public void a(ax.V0.i iVar, List<byte[]> list) {
        C0968a.e(iVar.e0);
        if (iVar.e0.limit() - iVar.e0.position() == 0) {
            return;
        }
        this.a = b(iVar.e0, (this.b == 2 && (list.size() == 1 || list.size() == 3)) ? list.get(0) : null);
        iVar.p();
        iVar.C(this.a.remaining());
        iVar.e0.put(this.a);
        iVar.D();
    }

    public void d() {
        this.a = ax.Q0.o.a;
        this.c = 0;
        this.b = 2;
    }
}
