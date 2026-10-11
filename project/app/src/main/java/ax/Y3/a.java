/*
 * Decompiled with CFR 0.152.
 */
package ax.Y3;

import ax.N3.c;
import java.io.IOException;
import java.nio.ByteBuffer;

public class a
implements c<ByteBuffer> {
    private final ByteBuffer a;

    public a(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override
    public void b() {
    }

    public ByteBuffer c() throws IOException {
        this.a.position(0);
        return this.a;
    }

    public static class a
    implements c.a<ByteBuffer> {
        @Override
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        public c<ByteBuffer> c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }
}

