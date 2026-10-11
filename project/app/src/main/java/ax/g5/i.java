/*
 * Decompiled with CFR 0.152.
 */
package ax.g5;

import ax.g5.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class i
extends a {
    private int g;
    private int h;
    private int i;
    private short j;

    public i() {
        super(0, a.a.c0, (byte)0, (byte)10);
    }

    @Override
    public void d(ByteBuffer byteBuffer) {
        super.d(byteBuffer);
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        byteBuffer.put((byte)42);
        byteBuffer.put((byte)0);
        byteBuffer.putInt(this.g);
        byteBuffer.put((byte)0);
        byteBuffer.putShort(this.j);
    }

    public void e(int n8, int n9, int n10) {
        this.b = n9;
        this.g = n8;
        this.h = n9;
        this.i = n10;
        short s8 = (short)(n9 / n10);
        if (n9 % n10 == 0) {
            this.j = s8;
            return;
        }
        throw new IllegalArgumentException("transfer bytes is not a multiple of block size");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ScsiWrite10 [blockAddress=");
        stringBuilder.append(this.g);
        stringBuilder.append(", transferBytes=");
        stringBuilder.append(this.h);
        stringBuilder.append(", blockSize=");
        stringBuilder.append(this.i);
        stringBuilder.append(", transferBlocks=");
        stringBuilder.append(this.j);
        stringBuilder.append(", getdCbwDataTransferLength()=");
        stringBuilder.append(this.b());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

