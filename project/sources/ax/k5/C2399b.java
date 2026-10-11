package ax.k5;

import ax.e5.C1981c;
import ax.e5.InterfaceC1979a;
import ax.h5.C2154d;
import ax.j5.C2316d;
import ax.j5.InterfaceC2314b;
import java.io.IOException;

/* renamed from: ax.k5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2399b implements C2316d.a {
    @Override // ax.j5.C2316d.a
    public InterfaceC2314b a(InterfaceC1979a interfaceC1979a) throws IOException {
        try {
            return new C2398a(interfaceC1979a, C2154d.a(null, new C1981c(interfaceC1979a)));
        } catch (C2154d.a unused) {
            return null;
        }
    }
}
