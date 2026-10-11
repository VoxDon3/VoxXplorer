/*
 * Decompiled with CFR 0.152.
 */
package ax.db;

import ax.cb.a;
import ax.db.v;
import ax.db.y;
import ax.eb.b;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class A {
    private static final Logger a = Logger.getLogger(A.class.getName());
    private static final v b = A.c(v.class.getClassLoader());

    private A() {
    }

    public static b a() {
        return b.a();
    }

    public static y b() {
        return b.b();
    }

    static v c(ClassLoader object) {
        try {
            v v8 = ax.cb.a.a(Class.forName("io.opentelemetry.opencensusshim.OpenTelemetryTraceComponentImpl", true, (ClassLoader)object), v.class);
            return v8;
        }
        catch (ClassNotFoundException classNotFoundException) {
            a.log(Level.FINE, "Couldn't load full implementation for OpenTelemetry TraceComponent, now trying to load original implementation.", classNotFoundException);
            try {
                v v9 = ax.cb.a.a(Class.forName("io.opencensus.impl.trace.TraceComponentImpl", true, (ClassLoader)object), v.class);
                return v9;
            }
            catch (ClassNotFoundException classNotFoundException2) {
                a.log(Level.FINE, "Couldn't load full implementation for TraceComponent, now trying to load lite implementation.", classNotFoundException2);
                try {
                    object = ax.cb.a.a(Class.forName("io.opencensus.impllite.trace.TraceComponentImplLite", true, (ClassLoader)object), v.class);
                    return object;
                }
                catch (ClassNotFoundException classNotFoundException3) {
                    a.log(Level.FINE, "Couldn't load lite implementation for TraceComponent, now using default implementation for TraceComponent.", classNotFoundException3);
                    return v.c();
                }
            }
        }
    }
}

