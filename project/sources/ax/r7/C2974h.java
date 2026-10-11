package ax.r7;

import ax.q7.C2883j;
import ax.q7.InterfaceC2879f;
import java.io.Serializable;

/* renamed from: ax.r7.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2974h<F, T> extends T<F> implements Serializable {
    final T<T> c0;
    final InterfaceC2879f<F, ? extends T> q;

    C2974h(InterfaceC2879f<F, ? extends T> interfaceC2879f, T<T> t) {
        this.q = (InterfaceC2879f) ax.q7.n.n(interfaceC2879f);
        this.c0 = (T) ax.q7.n.n(t);
    }

    @Override // ax.r7.T, java.util.Comparator
    public int compare(F f, F f2) {
        return this.c0.compare(this.q.apply(f), this.q.apply(f2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2974h) {
            C2974h c2974h = (C2974h) obj;
            if (this.q.equals(c2974h.q) && this.c0.equals(c2974h.c0)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C2883j.b(this.q, this.c0);
    }

    public String toString() {
        return this.c0 + ".onResultOf(" + this.q + ")";
    }
}
