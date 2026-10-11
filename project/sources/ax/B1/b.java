package ax.B1;

import ax.P0.C;
import ax.S0.C0968a;
import ax.S0.G;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends ax.z1.c {
    @Override // ax.z1.c
    protected C b(ax.z1.b bVar, ByteBuffer byteBuffer) {
        return new C(c(new G(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(G g) {
        return new a((String) C0968a.e(g.G()), (String) C0968a.e(g.G()), g.F(), g.F(), Arrays.copyOfRange(g.f(), g.g(), g.j()));
    }
}
