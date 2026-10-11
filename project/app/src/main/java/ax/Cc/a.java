/*
 * Decompiled with CFR 0.152.
 */
package ax.Cc;

import ax.Cc.c;
import ax.Cc.g;
import java.util.function.Predicate;

public final class a
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
        return c.a((g)object);
    }
}

