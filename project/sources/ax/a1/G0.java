package ax.a1;

import ax.Q0.o;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class G0 extends ax.Q0.q {
    private static final int i = Float.floatToIntBits(Float.NaN);

    private static void n(int i2, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i2 * 4.656612875245797E-10d));
        if (floatToIntBits == i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // ax.Q0.o
    public void d(ByteBuffer byteBuffer) {
        ByteBuffer m;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        if (i3 == 21) {
            m = m((i2 / 3) * 4);
            while (position < limit) {
                n(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), m);
                position += 3;
            }
        } else if (i3 == 22) {
            m = m(i2);
            while (position < limit) {
                n((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), m);
                position += 4;
            }
        } else if (i3 == 1342177280) {
            m = m((i2 / 3) * 4);
            while (position < limit) {
                n(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), m);
                position += 3;
            }
        } else {
            if (i3 != 1610612736) {
                throw new IllegalStateException();
            }
            m = m(i2);
            while (position < limit) {
                n((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), m);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        m.flip();
    }

    @Override // ax.Q0.q
    public o.a i(o.a aVar) throws o.b {
        int i2 = aVar.c;
        if (ax.S0.d0.K0(i2)) {
            return i2 != 4 ? new o.a(aVar.a, aVar.b, 4) : o.a.e;
        }
        throw new o.b(aVar);
    }
}
