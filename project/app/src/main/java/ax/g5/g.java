/*
 * Decompiled with CFR 0.152.
 */
package ax.g5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class g {
    private int a;
    private int b;

    private g() {
    }

    public static g c(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        g g8 = new g();
        g8.a = byteBuffer.getInt();
        g8.b = byteBuffer.getInt();
        return g8;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }
}

