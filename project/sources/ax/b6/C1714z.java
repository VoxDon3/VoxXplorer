package ax.b6;

import java.util.Iterator;
import java.util.List;

/* renamed from: ax.b6.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1714z implements InterfaceC1658s {
    @Override // ax.b6.InterfaceC1658s
    public final InterfaceC1658s c() {
        return InterfaceC1658s.f;
    }

    @Override // ax.b6.InterfaceC1658s
    public final Boolean e() {
        return Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C1714z;
    }

    @Override // ax.b6.InterfaceC1658s
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // ax.b6.InterfaceC1658s
    public final String g() {
        return "undefined";
    }

    @Override // ax.b6.InterfaceC1658s
    public final Iterator<InterfaceC1658s> i() {
        return null;
    }

    @Override // ax.b6.InterfaceC1658s
    public final InterfaceC1658s k(String str, Z2 z2, List<InterfaceC1658s> list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }
}
