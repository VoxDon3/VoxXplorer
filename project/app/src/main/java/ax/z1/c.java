/*
 * Decompiled with CFR 0.152.
 */
package ax.z1;

import ax.P0.C;
import ax.z1.a;
import ax.z1.b;
import java.nio.ByteBuffer;

public abstract class c
implements a {
    @Override
    public final C a(b b8) {
        ByteBuffer byteBuffer = ax.S0.a.e(b8.e0);
        boolean bl = byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0;
        ax.S0.a.a(bl);
        return this.b(b8, byteBuffer);
    }

    protected abstract C b(b var1, ByteBuffer var2);
}

