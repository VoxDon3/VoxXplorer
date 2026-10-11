/*
 * Decompiled with CFR 0.152.
 */
package ax.Sc;

import ax.Sc.i;
import ax.Sc.l;
import ax.Sc.s;
import java.util.function.Predicate;

public final class r
implements Predicate {
    public final l a;

    public /* synthetic */ r(l l8) {
        this.a = l8;
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
        return s.a(this.a, (i)object);
    }
}

