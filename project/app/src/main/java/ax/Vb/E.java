/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

import ax.sb.n;
import ax.sb.o;
import ax.yb.a;

public final class E {
    private static final StackTraceElement a;
    private static final String b;
    private static final String c;

    static {
        n.a a8;
        Object object;
        a = new ax.a.a().a();
        try {
            object = n.q;
            object = n.a(a.class.getCanonicalName());
        }
        catch (Throwable throwable) {
            a8 = n.q;
            object = n.a(o.a(throwable));
        }
        if (n.b(object) != null) {
            object = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        b = (String)object;
        try {
            object = n.a(E.class.getCanonicalName());
        }
        catch (Throwable throwable) {
            a8 = n.q;
            object = n.a(o.a(throwable));
        }
        if (n.b(object) != null) {
            object = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        c = (String)object;
    }

    public static final <E extends Throwable> E a(E e8) {
        return e8;
    }
}

