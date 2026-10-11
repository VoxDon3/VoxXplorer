package ax.h5;

import ax.e5.InterfaceC1979a;
import ax.j5.C2315c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

/* renamed from: ax.h5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2154d {
    private static List<InterfaceC2153c> a = new ArrayList();
    private static TimeZone b = TimeZone.getDefault();

    /* renamed from: ax.h5.d$a */
    public static class a extends IOException {
    }

    static {
        c(new ax.i5.e());
    }

    public static InterfaceC2152b a(C2315c c2315c, InterfaceC1979a interfaceC1979a) throws IOException, a {
        Iterator<InterfaceC2153c> it = a.iterator();
        while (it.hasNext()) {
            InterfaceC2152b a2 = it.next().a(c2315c, interfaceC1979a);
            if (a2 != null) {
                return a2;
            }
        }
        throw new a();
    }

    public static TimeZone b() {
        return b;
    }

    public static synchronized void c(InterfaceC2153c interfaceC2153c) {
        synchronized (C2154d.class) {
            a.add(interfaceC2153c);
        }
    }
}
