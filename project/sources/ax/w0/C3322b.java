package ax.w0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: ax.w0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3322b extends c {
    public static C3322b h(ByteBuffer byteBuffer) {
        return i(byteBuffer, new C3322b());
    }

    public static C3322b i(ByteBuffer byteBuffer, C3322b c3322b) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c3322b.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public C3322b f(int i, ByteBuffer byteBuffer) {
        g(i, byteBuffer);
        return this;
    }

    public void g(int i, ByteBuffer byteBuffer) {
        c(i, byteBuffer);
    }

    public C3321a j(C3321a c3321a, int i) {
        int b = b(6);
        if (b != 0) {
            return c3321a.f(a(d(b) + (i * 4)), this.b);
        }
        return null;
    }

    public int k() {
        int b = b(6);
        if (b != 0) {
            return e(b);
        }
        return 0;
    }

    public int l() {
        int b = b(4);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
}
