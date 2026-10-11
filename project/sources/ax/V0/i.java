package ax.V0;

import ax.P0.C0912v;
import ax.P0.C0916z;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class i extends ax.V0.a {
    public C0912v c0;
    public final c d0;
    public ByteBuffer e0;
    public boolean f0;
    public long g0;
    public ByteBuffer h0;
    private final int i0;
    private final int j0;

    public static final class a extends IllegalStateException {
        public final int c0;
        public final int q;

        public a(int i, int i2) {
            super("Buffer too small (" + i + " < " + i2 + ")");
            this.q = i;
            this.c0 = i2;
        }
    }

    static {
        C0916z.a("media3.decoder");
    }

    public i(int i) {
        this(i, 0);
    }

    private ByteBuffer B(int i) {
        int i2 = this.i0;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.e0;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    public static i F() {
        return new i(0);
    }

    public void C(int i) {
        int i2 = i + this.j0;
        ByteBuffer byteBuffer = this.e0;
        if (byteBuffer == null) {
            this.e0 = B(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.e0 = byteBuffer;
            return;
        }
        ByteBuffer B = B(i3);
        B.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            B.put(byteBuffer);
        }
        this.e0 = B;
    }

    public final void D() {
        ByteBuffer byteBuffer = this.e0;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.h0;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean E() {
        return q(1073741824);
    }

    public void G(int i) {
        ByteBuffer byteBuffer = this.h0;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.h0 = ByteBuffer.allocate(i);
        } else {
            this.h0.clear();
        }
    }

    @Override // ax.V0.a
    public void p() {
        super.p();
        ByteBuffer byteBuffer = this.e0;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.h0;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f0 = false;
    }

    public i(int i, int i2) {
        this.d0 = new c();
        this.i0 = i;
        this.j0 = i2;
    }
}
