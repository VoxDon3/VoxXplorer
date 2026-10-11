package ax.g5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: ax.g5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2121a {
    private int a;
    protected int b;
    private byte c;
    private byte d;
    private byte e;
    private EnumC0314a f;

    /* renamed from: ax.g5.a$a, reason: collision with other inner class name */
    public enum EnumC0314a {
        IN,
        OUT,
        NONE
    }

    protected AbstractC2121a(int i, EnumC0314a enumC0314a, byte b, byte b2) {
        this.b = i;
        this.f = enumC0314a;
        if (enumC0314a == EnumC0314a.IN) {
            this.c = Byte.MIN_VALUE;
        }
        this.d = b;
        this.e = b2;
    }

    public EnumC0314a a() {
        return this.f;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.a;
    }

    public void d(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putInt(1128420181);
        byteBuffer.putInt(this.a);
        byteBuffer.putInt(this.b);
        byteBuffer.put(this.c);
        byteBuffer.put(this.d);
        byteBuffer.put(this.e);
    }
}
