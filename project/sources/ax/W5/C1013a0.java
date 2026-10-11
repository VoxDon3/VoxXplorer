package ax.W5;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: ax.W5.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1013a0 implements Serializable, W {
    final Object q;

    C1013a0(Object obj) {
        this.q = obj;
    }

    @Override // ax.W5.W
    public final Object a() {
        return this.q;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1013a0)) {
            return false;
        }
        Object obj2 = this.q;
        Object obj3 = ((C1013a0) obj).q;
        return obj2 == obj3 || obj2.equals(obj3);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.q});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.q.toString() + ")";
    }
}
