/*
 * Decompiled with CFR 0.152.
 */
package ax.Tc;

import ax.Tc.q;
import java.util.function.Predicate;

public final class p
implements Predicate {
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
        return q.k((String)object);
    }
}

