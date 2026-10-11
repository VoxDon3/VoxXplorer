package ax.zb;

import ax.Gb.l;
import ax.tb.AbstractC3127c;
import ax.tb.C3133i;
import java.io.Serializable;
import java.lang.Enum;

/* renamed from: ax.zb.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3565c<T extends Enum<T>> extends AbstractC3127c<T> implements InterfaceC3563a<T>, Serializable {
    private final T[] c0;

    public C3565c(T[] tArr) {
        l.f(tArr, "entries");
        this.c0 = tArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.tb.AbstractC3126b, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return k((Enum) obj);
        }
        return false;
    }

    @Override // ax.tb.AbstractC3126b
    public int g() {
        return this.c0.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.tb.AbstractC3127c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return n((Enum) obj);
        }
        return -1;
    }

    public boolean k(T t) {
        l.f(t, "element");
        return ((Enum) C3133i.w(this.c0, t.ordinal())) == t;
    }

    @Override // ax.tb.AbstractC3127c, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public T get(int i) {
        AbstractC3127c.q.b(i, this.c0.length);
        return this.c0[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.tb.AbstractC3127c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return p((Enum) obj);
        }
        return -1;
    }

    public int n(T t) {
        l.f(t, "element");
        int ordinal = t.ordinal();
        if (((Enum) C3133i.w(this.c0, ordinal)) == t) {
            return ordinal;
        }
        return -1;
    }

    public int p(T t) {
        l.f(t, "element");
        return indexOf(t);
    }
}
