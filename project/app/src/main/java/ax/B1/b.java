/*
 * Decompiled with CFR 0.152.
 */
package ax.B1;

import ax.B1.a;
import ax.P0.C;
import ax.S0.G;
import ax.z1.c;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class b
extends c {
    @Override
    protected C b(ax.z1.b b8, ByteBuffer byteBuffer) {
        return new C(this.c(new G(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(G g8) {
        return new a(ax.S0.a.e(g8.G()), ax.S0.a.e(g8.G()), g8.F(), g8.F(), Arrays.copyOfRange(g8.f(), g8.g(), g8.j()));
    }
}

