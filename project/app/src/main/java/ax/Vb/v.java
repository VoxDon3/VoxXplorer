/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

import ax.Qb.D0;
import ax.Vb.t;
import ax.Vb.w;
import ax.sb.d;
import java.util.List;

public final class v {
    private static final w a(Throwable throwable, String string) {
        if (throwable != null) {
            throw throwable;
        }
        v.d();
        throw new d();
    }

    static /* synthetic */ w b(Throwable throwable, String string, int n8, Object object) {
        if ((n8 & 1) != 0) {
            throwable = null;
        }
        if ((n8 & 2) != 0) {
            string = null;
        }
        return v.a(throwable, string);
    }

    public static final boolean c(D0 d02) {
        return d02.Z0() instanceof w;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final D0 e(t t8, List<? extends t> object) {
        try {
            object = t8.b((List<? extends t>)object);
            return object;
        }
        catch (Throwable throwable) {
            return v.a(throwable, t8.a());
        }
    }
}

