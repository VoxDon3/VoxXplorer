package ax.g5;

import ax.g5.AbstractC2121a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class i extends AbstractC2121a {
    private int g;
    private int h;
    private int i;
    private short j;

    public i() {
        super(0, AbstractC2121a.EnumC0314a.OUT, (byte) 0, (byte) 10);
    }

    @Override // ax.g5.AbstractC2121a
    public void d(ByteBuffer byteBuffer) {
        super.d(byteBuffer);
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        byteBuffer.put((byte) 42);
        byteBuffer.put((byte) 0);
        byteBuffer.putInt(this.g);
        byteBuffer.put((byte) 0);
        byteBuffer.putShort(this.j);
    }

    public void e(int i, int i2, int i3) {
        this.b = i2;
        this.g = i;
        this.h = i2;
        this.i = i3;
        short s = (short) (i2 / i3);
        if (i2 % i3 != 0) {
            throw new IllegalArgumentException("transfer bytes is not a multiple of block size");
        }
        this.j = s;
    }

    public String toString() {
        return "ScsiWrite10 [blockAddress=" + this.g + ", transferBytes=" + this.h + ", blockSize=" + this.i + ", transferBlocks=" + ((int) this.j) + ", getdCbwDataTransferLength()=" + b() + "]";
    }
}
