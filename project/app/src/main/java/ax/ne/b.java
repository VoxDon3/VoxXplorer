/*
 * Decompiled with CFR 0.152.
 */
package ax.ne;

import ax.ne.i;
import java.util.function.Predicate;

public final class b
implements Predicate {
    public final i.c a;

    public /* synthetic */ b(i.c c8) {
        this.a = c8;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return j.Predicate._CC.$default$and((Predicate)this, (Predicate)predicate);
    }

    public /* synthetic */ Predicate negate() {
        return j.Predicate._CC.$default$negate((Predicate)this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return j.Predicate._CC.$default$or((Predicate)this, (Predicate)predicate);
    }

    public final boolean test(Object object) {
        return i.f(this.a, (i.b)object);
    }
}

