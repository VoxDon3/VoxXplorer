package ax.g5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: ax.g5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2124d {
    private byte a;
    private byte b;
    boolean c;
    byte d;
    byte e;

    private C2124d() {
    }

    public static C2124d c(ByteBuffer byteBuffer) {
        C2124d c2124d = new C2124d();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        byte b = byteBuffer.get();
        c2124d.a = (byte) (b & (-32));
        c2124d.b = (byte) (b & 31);
        c2124d.c = byteBuffer.get() == 128;
        c2124d.d = byteBuffer.get();
        c2124d.e = (byte) (byteBuffer.get() & 7);
        return c2124d;
    }

    public byte a() {
        return this.b;
    }

    public byte b() {
        return this.a;
    }

    public String toString() {
        return "ScsiInquiryResponse [peripheralQualifier=" + ((int) this.a) + ", peripheralDeviceType=" + ((int) this.b) + ", removableMedia=" + this.c + ", spcVersion=" + ((int) this.d) + ", responseDataFormat=" + ((int) this.e) + "]";
    }
}
