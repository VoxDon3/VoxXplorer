/*
 * Decompiled with CFR 0.152.
 */
package ax.w0;

import ax.w0.a;
import ax.w0.c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class b
extends c {
    public static b h(ByteBuffer byteBuffer) {
        return ax.w0.b.i(byteBuffer, new b());
    }

    public static b i(ByteBuffer byteBuffer, b b8) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return b8.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public b f(int n8, ByteBuffer byteBuffer) {
        this.g(n8, byteBuffer);
        return this;
    }

    public void g(int n8, ByteBuffer byteBuffer) {
        this.c(n8, byteBuffer);
    }

    public a j(a a8, int n8) {
        int n9 = this.b(6);
        if (n9 != 0) {
            return a8.f(this.a(this.d(n9) + n8 * 4), this.b);
        }
        return null;
    }

    public int k() {
        int n8 = this.b(6);
        if (n8 != 0) {
            return this.e(n8);
        }
        return 0;
    }

    public int l() {
        int n8 = this.b(4);
        if (n8 != 0) {
            return this.b.getInt(n8 + this.a);
        }
        return 0;
    }
}

