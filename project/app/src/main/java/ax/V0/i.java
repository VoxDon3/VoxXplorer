/*
 * Decompiled with CFR 0.152.
 */
package ax.V0;

import ax.P0.v;
import ax.P0.z;
import ax.V0.c;
import java.nio.ByteBuffer;

public class i
extends ax.V0.a {
    public v c0;
    public final c d0 = new c();
    public ByteBuffer e0;
    public boolean f0;
    public long g0;
    public ByteBuffer h0;
    private final int i0;
    private final int j0;

    static {
        z.a("media3.decoder");
    }

    public i(int n8) {
        this(n8, 0);
    }

    public i(int n8, int n9) {
        this.i0 = n8;
        this.j0 = n9;
    }

    private ByteBuffer B(int n8) {
        int n9 = this.i0;
        if (n9 == 1) {
            return ByteBuffer.allocate(n8);
        }
        if (n9 == 2) {
            return ByteBuffer.allocateDirect(n8);
        }
        ByteBuffer byteBuffer = this.e0;
        n9 = byteBuffer == null ? 0 : byteBuffer.capacity();
        throw new a(n9, n8);
    }

    public static i F() {
        return new i(0);
    }

    public void C(int n8) {
        int n9 = n8 + this.j0;
        ByteBuffer byteBuffer = this.e0;
        if (byteBuffer == null) {
            this.e0 = this.B(n9);
            return;
        }
        int n10 = byteBuffer.capacity();
        if (n10 >= (n9 += (n8 = byteBuffer.position()))) {
            this.e0 = byteBuffer;
            return;
        }
        ByteBuffer byteBuffer2 = this.B(n9);
        byteBuffer2.order(byteBuffer.order());
        if (n8 > 0) {
            byteBuffer.flip();
            byteBuffer2.put(byteBuffer);
        }
        this.e0 = byteBuffer2;
    }

    public final void D() {
        ByteBuffer byteBuffer = this.e0;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        if ((byteBuffer = this.h0) != null) {
            byteBuffer.flip();
        }
    }

    public final boolean E() {
        return this.q(0x40000000);
    }

    public void G(int n8) {
        ByteBuffer byteBuffer = this.h0;
        if (byteBuffer != null && byteBuffer.capacity() >= n8) {
            this.h0.clear();
            return;
        }
        this.h0 = ByteBuffer.allocate(n8);
    }

    @Override
    public void p() {
        super.p();
        ByteBuffer byteBuffer = this.e0;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        if ((byteBuffer = this.h0) != null) {
            byteBuffer.clear();
        }
        this.f0 = false;
    }

    public static final class a
    extends IllegalStateException {
        public final int c0;
        public final int q;

        public a(int n8, int n9) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Buffer too small (");
            stringBuilder.append(n8);
            stringBuilder.append(" < ");
            stringBuilder.append(n9);
            stringBuilder.append(")");
            super(stringBuilder.toString());
            this.q = n8;
            this.c0 = n9;
        }
    }
}

