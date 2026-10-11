package ax.z1;

import ax.P0.C;
import ax.S0.C0968a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class c implements InterfaceC3538a {
    @Override // ax.z1.InterfaceC3538a
    public final C a(b bVar) {
        ByteBuffer byteBuffer = (ByteBuffer) C0968a.e(bVar.e0);
        C0968a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(bVar, byteBuffer);
    }

    protected abstract C b(b bVar, ByteBuffer byteBuffer);
}
