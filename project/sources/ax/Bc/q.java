package ax.Bc;

import j$.util.Objects;

/* loaded from: classes3.dex */
public class q {
    private final p a;
    private final Object b;

    public q(p pVar) {
        this(pVar, null);
    }

    public p a() {
        return this.a;
    }

    public Object b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            q qVar = (q) obj;
            if (Objects.equals(this.a, qVar.a) && Objects.equals(this.b, qVar.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        p pVar = this.a;
        if (pVar == null) {
            return 0;
        }
        return pVar.hashCode();
    }

    public q(p pVar, Object obj) {
        this.a = pVar;
        this.b = obj;
        if (obj == null || g.c(pVar).a(obj)) {
            return;
        }
        throw new IllegalArgumentException("The " + pVar + " method doesn't support options of type " + obj.getClass());
    }
}
