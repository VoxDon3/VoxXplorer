/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import ax.Q0.o;
import ax.Q0.q;
import ax.S0.d0;
import java.nio.ByteBuffer;

public final class G0
extends q {
    private static final int i = Float.floatToIntBits(Float.NaN);

    private static void n(int n8, ByteBuffer byteBuffer) {
        int n9;
        n8 = n9 = Float.floatToIntBits((float)((double)n8 * 4.656612875245797E-10));
        if (n9 == i) {
            n8 = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(n8);
    }

    @Override
    public void d(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        block11: {
            int n8 = byteBuffer.position();
            int n9 = byteBuffer.limit();
            int n10 = n9 - n8;
            int n11 = this.b.c;
            if (n11 != 21) {
                if (n11 != 22) {
                    if (n11 != 0x50000000) {
                        if (n11 == 0x60000000) {
                            ByteBuffer byteBuffer3 = this.m(n10);
                            while (true) {
                                byteBuffer2 = byteBuffer3;
                                if (n8 < n9) {
                                    G0.n(byteBuffer.get(n8 + 3) & 0xFF | (byteBuffer.get(n8 + 2) & 0xFF) << 8 | (byteBuffer.get(n8 + 1) & 0xFF) << 16 | (byteBuffer.get(n8) & 0xFF) << 24, byteBuffer3);
                                    n8 += 4;
                                    continue;
                                }
                                break block11;
                                break;
                            }
                        }
                        throw new IllegalStateException();
                    }
                    ByteBuffer byteBuffer4 = this.m(n10 / 3 * 4);
                    while (true) {
                        byteBuffer2 = byteBuffer4;
                        if (n8 < n9) {
                            G0.n((byteBuffer.get(n8 + 2) & 0xFF) << 8 | (byteBuffer.get(n8 + 1) & 0xFF) << 16 | (byteBuffer.get(n8) & 0xFF) << 24, byteBuffer4);
                            n8 += 3;
                            continue;
                        }
                        break block11;
                        break;
                    }
                }
                ByteBuffer byteBuffer5 = this.m(n10);
                while (true) {
                    byteBuffer2 = byteBuffer5;
                    if (n8 < n9) {
                        G0.n(byteBuffer.get(n8) & 0xFF | (byteBuffer.get(n8 + 1) & 0xFF) << 8 | (byteBuffer.get(n8 + 2) & 0xFF) << 16 | (byteBuffer.get(n8 + 3) & 0xFF) << 24, byteBuffer5);
                        n8 += 4;
                        continue;
                    }
                    break block11;
                    break;
                }
            }
            ByteBuffer byteBuffer6 = this.m(n10 / 3 * 4);
            while (true) {
                byteBuffer2 = byteBuffer6;
                if (n8 >= n9) break;
                G0.n((byteBuffer.get(n8) & 0xFF) << 8 | (byteBuffer.get(n8 + 1) & 0xFF) << 16 | (byteBuffer.get(n8 + 2) & 0xFF) << 24, byteBuffer6);
                n8 += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    @Override
    public o.a i(o.a a8) throws o.b {
        int n8 = a8.c;
        if (d0.K0(n8)) {
            if (n8 != 4) {
                return new o.a(a8.a, a8.b, 4);
            }
            return o.a.e;
        }
        throw new o.b(a8);
    }
}

