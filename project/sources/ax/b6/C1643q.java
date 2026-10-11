package ax.b6;

import java.util.Iterator;
import java.util.List;

/* renamed from: ax.b6.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1643q implements InterfaceC1658s {
    @Override // ax.b6.InterfaceC1658s
    public final InterfaceC1658s c() {
        return InterfaceC1658s.g;
    }

    @Override // ax.b6.InterfaceC1658s
    public final Boolean e() {
        return Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C1643q;
    }

    @Override // ax.b6.InterfaceC1658s
    public final Double f() {
        return Double.valueOf(0.0d);
    }

    @Override // ax.b6.InterfaceC1658s
    public final String g() {
        return "null";
    }

    public final int hashCode() {
        return 1;
    }

    @Override // ax.b6.InterfaceC1658s
    public final Iterator<InterfaceC1658s> i() {
        return null;
    }

    @Override // ax.b6.InterfaceC1658s
    public final InterfaceC1658s k(String str, Z2 z2, List<InterfaceC1658s> list) {
        throw new IllegalStateException(String.format("null has no function %s", str));
    }
}
