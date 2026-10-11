package ax.Qb;

/* loaded from: classes3.dex */
public final class A {
    public final Object a;
    public final ax.Fb.l<Throwable, ax.sb.t> b;

    /* JADX WARN: Multi-variable type inference failed */
    public A(Object obj, ax.Fb.l<? super Throwable, ax.sb.t> lVar) {
        this.a = obj;
        this.b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a = (A) obj;
        return ax.Gb.l.a(this.a, a.a) && ax.Gb.l.a(this.b, a.b);
    }

    public int hashCode() {
        Object obj = this.a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.a + ", onCancellation=" + this.b + ')';
    }
}
