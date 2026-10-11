package ax.b6;

import java.util.Iterator;
import java.util.List;

/* renamed from: ax.b6.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1567h implements InterfaceC1658s {
    private final boolean q;

    public C1567h(Boolean bool) {
        if (bool == null) {
            this.q = false;
        } else {
            this.q = bool.booleanValue();
        }
    }

    @Override // ax.b6.InterfaceC1658s
    public final InterfaceC1658s c() {
        return new C1567h(Boolean.valueOf(this.q));
    }

    @Override // ax.b6.InterfaceC1658s
    public final Boolean e() {
        return Boolean.valueOf(this.q);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1567h) && this.q == ((C1567h) obj).q;
    }

    @Override // ax.b6.InterfaceC1658s
    public final Double f() {
        return Double.valueOf(this.q ? 1.0d : 0.0d);
    }

    @Override // ax.b6.InterfaceC1658s
    public final String g() {
        return Boolean.toString(this.q);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.q).hashCode();
    }

    @Override // ax.b6.InterfaceC1658s
    public final Iterator<InterfaceC1658s> i() {
        return null;
    }

    @Override // ax.b6.InterfaceC1658s
    public final InterfaceC1658s k(String str, Z2 z2, List<InterfaceC1658s> list) {
        if ("toString".equals(str)) {
            return new C1674u(Boolean.toString(this.q));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.q), str));
    }

    public final String toString() {
        return String.valueOf(this.q);
    }
}
