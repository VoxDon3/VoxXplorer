package ax.j5;

import ax.e5.InterfaceC1979a;
import ax.k5.C2399b;
import ax.l5.C2471b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ax.j5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2316d {
    private static List<a> a = new ArrayList();

    /* renamed from: ax.j5.d$a */
    public interface a {
        InterfaceC2314b a(InterfaceC1979a interfaceC1979a) throws IOException;
    }

    /* renamed from: ax.j5.d$b */
    public static class b extends IOException {
    }

    static {
        b(new C2399b());
        b(new C2471b());
    }

    public static InterfaceC2314b a(InterfaceC1979a interfaceC1979a) throws IOException {
        Iterator<a> it = a.iterator();
        while (it.hasNext()) {
            InterfaceC2314b a2 = it.next().a(interfaceC1979a);
            if (a2 != null) {
                return a2;
            }
        }
        throw new b();
    }

    public static synchronized void b(a aVar) {
        synchronized (C2316d.class) {
            a.add(aVar);
        }
    }
}
