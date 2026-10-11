/*
 * Decompiled with CFR 0.152.
 */
package ax.g5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class a {
    private int a;
    protected int b;
    private byte c;
    private byte d;
    private byte e;
    private a f;

    protected a(int n8, a a8, byte by, byte by2) {
        this.b = n8;
        this.f = a8;
        if (a8 == ax.g5.a$a.q) {
            this.c = (byte)-128;
        }
        this.d = by;
        this.e = by2;
    }

    public a a() {
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

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        private static final a[] e0;
        public static final /* enum */ a q;

        static {
            q = new a();
            c0 = new a();
            d0 = new a();
            e0 = ax.g5.a$a.d();
        }

        private static /* synthetic */ a[] d() {
            return new a[]{q, c0, d0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])e0.clone();
        }
    }
}

