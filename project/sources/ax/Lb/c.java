package ax.Lb;

import ax.tb.AbstractC3113D;

/* loaded from: classes3.dex */
public class c implements Iterable<Integer>, ax.Hb.a {
    public static final a e0 = new a(null);
    private final int c0;
    private final int d0;
    private final int q;

    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        public final c a(int i, int i2, int i3) {
            return new c(i, i2, i3);
        }

        private a() {
        }
    }

    public c(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.q = i;
        this.c0 = ax.Ab.c.b(i, i2, i3);
        this.d0 = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return this.q == cVar.q && this.c0 == cVar.c0 && this.d0 == cVar.d0;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.q * 31) + this.c0) * 31) + this.d0;
    }

    public boolean isEmpty() {
        return this.d0 > 0 ? this.q > this.c0 : this.q < this.c0;
    }

    public final int k() {
        return this.q;
    }

    public final int l() {
        return this.c0;
    }

    public final int n() {
        return this.d0;
    }

    @Override // java.lang.Iterable
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public AbstractC3113D iterator() {
        return new d(this.q, this.c0, this.d0);
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.d0 > 0) {
            sb = new StringBuilder();
            sb.append(this.q);
            sb.append("..");
            sb.append(this.c0);
            sb.append(" step ");
            i = this.d0;
        } else {
            sb = new StringBuilder();
            sb.append(this.q);
            sb.append(" downTo ");
            sb.append(this.c0);
            sb.append(" step ");
            i = -this.d0;
        }
        sb.append(i);
        return sb.toString();
    }
}
