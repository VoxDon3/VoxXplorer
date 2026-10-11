/*
 * Decompiled with CFR 0.152.
 */
package ax.Nc;

import ax.Nc.e;
import java.util.function.Predicate;

public final class d
implements Predicate {
    public final e a;
    public final String b;

    public /* synthetic */ d(e e8, String string) {
        this.a = e8;
        this.b = string;
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
        return e.h(this.a, this.b, (String)object);
    }
}

