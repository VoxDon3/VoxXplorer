package ax.r8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ax.r8.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2997f extends AbstractC3000i implements Iterable<AbstractC3000i> {
    private final List<AbstractC3000i> q = new ArrayList();

    @Override // ax.r8.AbstractC3000i
    public boolean e() {
        if (this.q.size() == 1) {
            return this.q.get(0).e();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C2997f) && ((C2997f) obj).q.equals(this.q);
        }
        return true;
    }

    public int hashCode() {
        return this.q.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<AbstractC3000i> iterator() {
        return this.q.iterator();
    }

    @Override // ax.r8.AbstractC3000i
    public String k() {
        if (this.q.size() == 1) {
            return this.q.get(0).k();
        }
        throw new IllegalStateException();
    }

    public void r(AbstractC3000i abstractC3000i) {
        if (abstractC3000i == null) {
            abstractC3000i = C3002k.q;
        }
        this.q.add(abstractC3000i);
    }

    public AbstractC3000i s(int i) {
        return this.q.get(i);
    }

    public int size() {
        return this.q.size();
    }
}
