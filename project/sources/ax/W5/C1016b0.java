package ax.W5;

import java.io.Serializable;

/* renamed from: ax.W5.b0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1016b0 {
    public static W a(W w) {
        return !(w instanceof Z) ? w instanceof X ? w : w instanceof Serializable ? new X(w) : new Z(w) : w;
    }

    public static W b(Object obj) {
        return new C1013a0(obj);
    }
}
