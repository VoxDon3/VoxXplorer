/*
 * Decompiled with CFR 0.152.
 */
package ax.g5;

import ax.g5.a;
import java.nio.ByteBuffer;

public class c
extends a {
    private byte g;

    public c(byte by) {
        super(by, a.a.q, (byte)0, (byte)6);
        this.g = by;
    }

    @Override
    public void d(ByteBuffer byteBuffer) {
        super.d(byteBuffer);
        byteBuffer.put((byte)18);
        byteBuffer.put((byte)0);
        byteBuffer.put((byte)0);
        byteBuffer.put((byte)0);
        byteBuffer.put(this.g);
    }
}

