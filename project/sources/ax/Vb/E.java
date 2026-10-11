package ax.Vb;

import ax.a.C1260a;
import ax.sb.C3082n;
import ax.sb.C3083o;
import ax.yb.AbstractC3520a;

/* loaded from: classes3.dex */
public final class E {
    private static final StackTraceElement a = new C1260a().a();
    private static final String b;
    private static final String c;

    static {
        Object a2;
        Object a3;
        try {
            C3082n.a aVar = C3082n.q;
            a2 = C3082n.a(AbstractC3520a.class.getCanonicalName());
        } catch (Throwable th) {
            C3082n.a aVar2 = C3082n.q;
            a2 = C3082n.a(C3083o.a(th));
        }
        if (C3082n.b(a2) != null) {
            a2 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        b = (String) a2;
        try {
            a3 = C3082n.a(E.class.getCanonicalName());
        } catch (Throwable th2) {
            C3082n.a aVar3 = C3082n.q;
            a3 = C3082n.a(C3083o.a(th2));
        }
        if (C3082n.b(a3) != null) {
            a3 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        c = (String) a3;
    }

    public static final <E extends Throwable> E a(E e) {
        return e;
    }
}
