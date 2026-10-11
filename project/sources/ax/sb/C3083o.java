package ax.sb;

import ax.sb.C3082n;

/* renamed from: ax.sb.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3083o {
    public static final Object a(Throwable th) {
        ax.Gb.l.f(th, "exception");
        return new C3082n.b(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof C3082n.b) {
            throw ((C3082n.b) obj).q;
        }
    }
}
