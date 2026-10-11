package ax.a1;

import ax.Q0.o;
import ax.S0.C0968a;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class G extends ax.Q0.q {
    private int[] i;
    private int[] j;

    @Override // ax.Q0.o
    public void d(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) C0968a.e(this.j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer m = m(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i : iArr) {
                int Q = (ax.S0.d0.Q(this.b.c) * i) + position;
                int i2 = this.b.c;
                if (i2 != 2) {
                    if (i2 == 3) {
                        m.put(byteBuffer.get(Q));
                    } else if (i2 != 4) {
                        if (i2 != 21) {
                            if (i2 != 22) {
                                if (i2 != 268435456) {
                                    if (i2 != 1342177280) {
                                        if (i2 != 1610612736) {
                                            throw new IllegalStateException("Unexpected encoding: " + this.b.c);
                                        }
                                    }
                                }
                            }
                            m.putInt(byteBuffer.getInt(Q));
                        }
                        ax.S0.d0.k1(m, ax.S0.d0.e0(byteBuffer, Q));
                    } else {
                        m.putFloat(byteBuffer.getFloat(Q));
                    }
                }
                m.putShort(byteBuffer.getShort(Q));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        m.flip();
    }

    @Override // ax.Q0.q
    public o.a i(o.a aVar) throws o.b {
        int[] iArr = this.i;
        if (iArr == null) {
            return o.a.e;
        }
        if (!ax.S0.d0.L0(aVar.c)) {
            throw new o.b(aVar);
        }
        boolean z = aVar.b != iArr.length;
        int i = 0;
        while (i < iArr.length) {
            int i2 = iArr[i];
            if (i2 >= aVar.b) {
                throw new o.b("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", aVar);
            }
            z |= i2 != i;
            i++;
        }
        return z ? new o.a(aVar.a, iArr.length, aVar.c) : o.a.e;
    }

    @Override // ax.Q0.q
    protected void j() {
        this.j = this.i;
    }

    @Override // ax.Q0.q
    protected void l() {
        this.j = null;
        this.i = null;
    }

    public void n(int[] iArr) {
        this.i = iArr;
    }
}
