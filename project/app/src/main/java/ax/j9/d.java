/*
 * Decompiled with CFR 0.152.
 */
package ax.j9;

import ax.W8.b;
import ax.j9.e;
import java.util.function.Predicate;

public final class d
implements Predicate {
    public final b a;

    public /* synthetic */ d(b b8) {
        this.a = b8;
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
        return e.d(this.a, (ax.W8.e)object);
    }
}

