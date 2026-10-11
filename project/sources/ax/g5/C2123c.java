package ax.g5;

import ax.g5.AbstractC2121a;
import java.nio.ByteBuffer;

/* renamed from: ax.g5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2123c extends AbstractC2121a {
    private byte g;

    public C2123c(byte b) {
        super(b, AbstractC2121a.EnumC0314a.IN, (byte) 0, (byte) 6);
        this.g = b;
    }

    @Override // ax.g5.AbstractC2121a
    public void d(ByteBuffer byteBuffer) {
        super.d(byteBuffer);
        byteBuffer.put((byte) 18);
        byteBuffer.put((byte) 0);
        byteBuffer.put((byte) 0);
        byteBuffer.put((byte) 0);
        byteBuffer.put(this.g);
    }
}
