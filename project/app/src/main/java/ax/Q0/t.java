/*
 * Decompiled with CFR 0.152.
 */
package ax.Q0;

import ax.Q0.o;
import ax.Q0.q;
import ax.S0.d0;
import java.nio.ByteBuffer;

public final class t
extends q {
    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void d(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        block11: {
            int n8;
            int n9;
            block16: {
                int n10;
                block17: {
                    block18: {
                        block19: {
                            int n11;
                            block15: {
                                block13: {
                                    block12: {
                                        block14: {
                                            n10 = byteBuffer.position();
                                            n9 = byteBuffer.limit();
                                            n11 = n9 - n10;
                                            int n12 = this.b.c;
                                            n8 = n11;
                                            if (n12 == 3) break block12;
                                            if (n12 == 4) break block13;
                                            if (n12 == 21) break block14;
                                            if (n12 == 22) break block13;
                                            n8 = n11;
                                            if (n12 == 0x10000000) break block15;
                                            if (n12 == 0x50000000) break block14;
                                            if (n12 != 0x60000000) throw new IllegalStateException();
                                            break block13;
                                        }
                                        n8 = n11 / 3;
                                    }
                                    n8 *= 2;
                                    break block15;
                                }
                                n8 = n11 / 2;
                            }
                            byteBuffer2 = this.m(n8);
                            n11 = this.b.c;
                            if (n11 == 3) break block16;
                            if (n11 == 4) break block17;
                            if (n11 == 21) break block18;
                            if (n11 == 22) break block19;
                            if (n11 != 0x10000000) {
                                if (n11 != 0x50000000) {
                                    if (n11 != 0x60000000) throw new IllegalStateException();
                                    while (n10 < n9) {
                                        byteBuffer2.put(byteBuffer.get(n10 + 1));
                                        byteBuffer2.put(byteBuffer.get(n10));
                                        n10 += 4;
                                    }
                                    break block11;
                                } else {
                                    for (n8 = n10; n8 < n9; n8 += 3) {
                                        byteBuffer2.put(byteBuffer.get(n8 + 1));
                                        byteBuffer2.put(byteBuffer.get(n8));
                                    }
                                }
                                break block11;
                            } else {
                                for (n8 = n10; n8 < n9; n8 += 2) {
                                    byteBuffer2.put(byteBuffer.get(n8 + 1));
                                    byteBuffer2.put(byteBuffer.get(n8));
                                }
                            }
                            break block11;
                        }
                        for (n8 = n10; n8 < n9; n8 += 4) {
                            byteBuffer2.put(byteBuffer.get(n8 + 2));
                            byteBuffer2.put(byteBuffer.get(n8 + 3));
                        }
                        break block11;
                    }
                    for (n8 = n10; n8 < n9; n8 += 3) {
                        byteBuffer2.put(byteBuffer.get(n8 + 1));
                        byteBuffer2.put(byteBuffer.get(n8 + 2));
                    }
                    break block11;
                }
                for (n8 = n10; n8 < n9; n8 += 4) {
                    n10 = (short)(d0.o(byteBuffer.getFloat(n8), -1.0f, 1.0f) * 32767.0f);
                    byteBuffer2.put((byte)(n10 & 0xFF));
                    byteBuffer2.put((byte)(n10 >> 8 & 0xFF));
                }
                break block11;
            }
            for (n8 = n10; n8 < n9; ++n8) {
                byteBuffer2.put((byte)0);
                byteBuffer2.put((byte)((byteBuffer.get(n8) & 0xFF) - 128));
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    @Override
    public o.a i(o.a a8) throws o.b {
        int n8 = a8.c;
        if (n8 != 3 && n8 != 2 && n8 != 0x10000000 && n8 != 21 && n8 != 0x50000000 && n8 != 22 && n8 != 0x60000000 && n8 != 4) {
            throw new o.b(a8);
        }
        if (n8 != 2) {
            return new o.a(a8.a, a8.b, 2);
        }
        return o.a.e;
    }
}

