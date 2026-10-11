package ax.l5;

import ax.e5.InterfaceC1979a;
import ax.j5.C2316d;
import ax.j5.InterfaceC2314b;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: ax.l5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2471b implements C2316d.a {
    @Override // ax.j5.C2316d.a
    public InterfaceC2314b a(InterfaceC1979a interfaceC1979a) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(512);
        interfaceC1979a.i(0L, allocate);
        return C2470a.b(allocate);
    }
}
