package ax.hb;

import ax.cb.C1853a;
import ax.db.k;
import ax.db.l;
import ax.db.q;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ax.hb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2179b {
    private static final Logger a = Logger.getLogger(C2179b.class.getName());
    private static final l b = c(l.class.getClassLoader());

    private C2179b() {
    }

    public static k a() {
        return b.c();
    }

    public static q b(k kVar) {
        return b.a(kVar);
    }

    private static l c(ClassLoader classLoader) {
        try {
            return (l) C1853a.a(Class.forName("io.opentelemetry.opencensusshim.OpenTelemetryContextManager", true, classLoader), l.class);
        } catch (ClassNotFoundException e) {
            a.log(Level.FINE, "Couldn't load full implementation for OpenTelemetry context manager, now loading original implementation.", (Throwable) e);
            return new C2180c();
        }
    }

    public static k d(k kVar, q qVar) {
        return b.b(kVar, qVar);
    }
}
