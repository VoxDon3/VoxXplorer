package ax.j5;

import android.util.Log;
import ax.e5.C1981c;
import ax.e5.InterfaceC1979a;
import ax.h5.C2154d;
import ax.h5.InterfaceC2152b;
import java.io.IOException;

/* renamed from: ax.j5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2313a extends C1981c {
    private static final String e = "a";
    private InterfaceC2152b d;

    private C2313a(InterfaceC1979a interfaceC1979a, C2315c c2315c) {
        super(interfaceC1979a, c2315c.a());
    }

    public static C2313a a(C2315c c2315c, InterfaceC1979a interfaceC1979a) throws IOException {
        try {
            C2313a c2313a = new C2313a(interfaceC1979a, c2315c);
            c2313a.d = C2154d.a(c2315c, c2313a);
            return c2313a;
        } catch (C2154d.a unused) {
            Log.w(e, "Unsupported fs on partition");
            return null;
        }
    }

    public InterfaceC2152b b() {
        return this.d;
    }
}
