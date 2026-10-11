package ax.db;

import ax.cb.C1853a;
import ax.eb.AbstractC1995b;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ax.db.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1954A {
    private static final Logger a = Logger.getLogger(C1954A.class.getName());
    private static final v b = c(v.class.getClassLoader());

    private C1954A() {
    }

    public static AbstractC1995b a() {
        return b.a();
    }

    public static y b() {
        return b.b();
    }

    static v c(ClassLoader classLoader) {
        try {
            return (v) C1853a.a(Class.forName("io.opentelemetry.opencensusshim.OpenTelemetryTraceComponentImpl", true, classLoader), v.class);
        } catch (ClassNotFoundException e) {
            a.log(Level.FINE, "Couldn't load full implementation for OpenTelemetry TraceComponent, now trying to load original implementation.", (Throwable) e);
            try {
                return (v) C1853a.a(Class.forName("io.opencensus.impl.trace.TraceComponentImpl", true, classLoader), v.class);
            } catch (ClassNotFoundException e2) {
                a.log(Level.FINE, "Couldn't load full implementation for TraceComponent, now trying to load lite implementation.", (Throwable) e2);
                try {
                    return (v) C1853a.a(Class.forName("io.opencensus.impllite.trace.TraceComponentImplLite", true, classLoader), v.class);
                } catch (ClassNotFoundException e3) {
                    a.log(Level.FINE, "Couldn't load lite implementation for TraceComponent, now using default implementation for TraceComponent.", (Throwable) e3);
                    return v.c();
                }
            }
        }
    }
}
