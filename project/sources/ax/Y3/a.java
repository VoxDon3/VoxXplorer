package ax.Y3;

import ax.N3.c;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class a implements c<ByteBuffer> {
    private final ByteBuffer a;

    /* renamed from: ax.Y3.a$a, reason: collision with other inner class name */
    public static class C0224a implements c.a<ByteBuffer> {
        @Override // ax.N3.c.a
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // ax.N3.c.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // ax.N3.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteBuffer a() throws IOException {
        this.a.position(0);
        return this.a;
    }

    @Override // ax.N3.c
    public void b() {
    }
}
