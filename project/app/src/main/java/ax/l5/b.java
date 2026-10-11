/*
 * Decompiled with CFR 0.152.
 */
package ax.l5;

import ax.j5.d;
import ax.l5.a;
import java.io.IOException;
import java.nio.ByteBuffer;

public class b
implements d.a {
    @Override
    public ax.j5.b a(ax.e5.a a8) throws IOException {
        ByteBuffer byteBuffer = ByteBuffer.allocate(512);
        a8.i(0L, byteBuffer);
        return a.b(byteBuffer);
    }
}

