/*
 * Decompiled with CFR 0.152.
 */
package ax.hb;

import ax.cb.a;
import ax.db.k;
import ax.db.l;
import ax.db.q;
import ax.hb.c;
import java.util.logging.Level;
import java.util.logging.Logger;

public class b {
    private static final Logger a = Logger.getLogger(b.class.getName());
    private static final l b = ax.hb.b.c(l.class.getClassLoader());

    private b() {
    }

    public static k a() {
        return b.c();
    }

    public static q b(k k8) {
        return b.a(k8);
    }

    private static l c(ClassLoader object) {
        try {
            object = ax.cb.a.a(Class.forName("io.opentelemetry.opencensusshim.OpenTelemetryContextManager", true, (ClassLoader)object), l.class);
            return object;
        }
        catch (ClassNotFoundException classNotFoundException) {
            a.log(Level.FINE, "Couldn't load full implementation for OpenTelemetry context manager, now loading original implementation.", classNotFoundException);
            return new c();
        }
    }

    public static k d(k k8, q q8) {
        return b.b(k8, q8);
    }
}

