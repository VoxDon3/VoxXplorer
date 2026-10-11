/*
 * Decompiled with CFR 0.152.
 */
package ax.g5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class d {
    private byte a;
    private byte b;
    boolean c;
    byte d;
    byte e;

    private d() {
    }

    public static d c(ByteBuffer byteBuffer) {
        d d8 = new d();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        byte by = byteBuffer.get();
        d8.a = (byte)(by & 0xFFFFFFE0);
        d8.b = (byte)(by & 0x1F);
        boolean bl = byteBuffer.get() == 128;
        d8.c = bl;
        d8.d = byteBuffer.get();
        d8.e = (byte)(byteBuffer.get() & 7);
        return d8;
    }

    public byte a() {
        return this.b;
    }

    public byte b() {
        return this.a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ScsiInquiryResponse [peripheralQualifier=");
        stringBuilder.append(this.a);
        stringBuilder.append(", peripheralDeviceType=");
        stringBuilder.append(this.b);
        stringBuilder.append(", removableMedia=");
        stringBuilder.append(this.c);
        stringBuilder.append(", spcVersion=");
        stringBuilder.append(this.d);
        stringBuilder.append(", responseDataFormat=");
        stringBuilder.append(this.e);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

