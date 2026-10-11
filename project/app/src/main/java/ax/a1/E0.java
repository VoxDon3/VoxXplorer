/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import ax.S0.d0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class E0 {
    public static ByteBuffer a(ByteBuffer byteBuffer, int n8, int n9, int n10, int n11) {
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
        int n12 = byteBuffer.position();
        while (byteBuffer.hasRemaining() && n10 < n11) {
            E0.c(byteBuffer2, (int)((long)E0.b(byteBuffer, n8) * (long)n10 / (long)n11), n8);
            if (byteBuffer.position() != n12 + n9) continue;
            ++n10;
            n12 = byteBuffer.position();
        }
        byteBuffer2.put(byteBuffer);
        byteBuffer2.flip();
        return byteBuffer2;
    }

    public static int b(ByteBuffer byteBuffer, int n8) {
        if (n8 != 2) {
            if (n8 != 3) {
                if (n8 != 4) {
                    if (n8 != 21) {
                        if (n8 != 22) {
                            if (n8 != 0x10000000) {
                                if (n8 != 0x50000000) {
                                    if (n8 == 0x60000000) {
                                        byte by = byteBuffer.get();
                                        byte by2 = byteBuffer.get();
                                        n8 = byteBuffer.get();
                                        return byteBuffer.get() & 0xFF | ((by & 0xFF) << 24 | (by2 & 0xFF) << 16 | (n8 & 0xFF) << 8);
                                    }
                                    throw new IllegalStateException();
                                }
                                byte by = byteBuffer.get();
                                n8 = byteBuffer.get();
                                return (byteBuffer.get() & 0xFF) << 8 | ((by & 0xFF) << 24 | (n8 & 0xFF) << 16);
                            }
                            n8 = byteBuffer.get();
                            return (byteBuffer.get() & 0xFF) << 16 | (n8 & 0xFF) << 24;
                        }
                        n8 = byteBuffer.get();
                        byte by = byteBuffer.get();
                        byte by3 = byteBuffer.get();
                        return (byteBuffer.get() & 0xFF) << 24 | (n8 & 0xFF | (by & 0xFF) << 8 | (by3 & 0xFF) << 16);
                    }
                    byte by = byteBuffer.get();
                    n8 = byteBuffer.get();
                    return (byteBuffer.get() & 0xFF) << 24 | ((by & 0xFF) << 8 | (n8 & 0xFF) << 16);
                }
                float f8 = d0.o(byteBuffer.getFloat(), -1.0f, 1.0f);
                if (f8 < 0.0f) {
                    return (int)(-f8 * -2.14748365E9f);
                }
                return (int)(f8 * 2.14748365E9f);
            }
            return (byteBuffer.get() & 0xFF) << 24;
        }
        n8 = byteBuffer.get();
        return (byteBuffer.get() & 0xFF) << 24 | (n8 & 0xFF) << 16;
    }

    public static void c(ByteBuffer byteBuffer, int n8, int n9) {
        if (n9 != 2) {
            if (n9 != 3) {
                if (n9 != 4) {
                    if (n9 != 21) {
                        if (n9 != 22) {
                            if (n9 != 0x10000000) {
                                if (n9 != 0x50000000) {
                                    if (n9 == 0x60000000) {
                                        byteBuffer.put((byte)(n8 >> 24));
                                        byteBuffer.put((byte)(n8 >> 16));
                                        byteBuffer.put((byte)(n8 >> 8));
                                        byteBuffer.put((byte)n8);
                                        return;
                                    }
                                    throw new IllegalStateException();
                                }
                                byteBuffer.put((byte)(n8 >> 24));
                                byteBuffer.put((byte)(n8 >> 16));
                                byteBuffer.put((byte)(n8 >> 8));
                                return;
                            }
                            byteBuffer.put((byte)(n8 >> 24));
                            byteBuffer.put((byte)(n8 >> 16));
                            return;
                        }
                        byteBuffer.put((byte)n8);
                        byteBuffer.put((byte)(n8 >> 8));
                        byteBuffer.put((byte)(n8 >> 16));
                        byteBuffer.put((byte)(n8 >> 24));
                        return;
                    }
                    byteBuffer.put((byte)(n8 >> 8));
                    byteBuffer.put((byte)(n8 >> 16));
                    byteBuffer.put((byte)(n8 >> 24));
                    return;
                }
                if (n8 < 0) {
                    byteBuffer.putFloat(-((float)n8) / -2.14748365E9f);
                    return;
                }
                byteBuffer.putFloat((float)n8 / 2.14748365E9f);
                return;
            }
            byteBuffer.put((byte)(n8 >> 24));
            return;
        }
        byteBuffer.put((byte)(n8 >> 16));
        byteBuffer.put((byte)(n8 >> 24));
    }
}

