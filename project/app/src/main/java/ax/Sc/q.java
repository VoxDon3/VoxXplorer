/*
 * Decompiled with CFR 0.152.
 */
package ax.Sc;

import ax.Sc.s;
import java.util.function.Function;

public final class q
implements Function {
    public final s a;

    public /* synthetic */ q(s s8) {
        this.a = s8;
    }

    public /* synthetic */ Function andThen(Function function) {
        return j.Function._CC.$default$andThen((Function)this, (Function)function);
    }

    public final Object apply(Object object) {
        return s.b(this.a, (String)object);
    }

    public /* synthetic */ Function compose(Function function) {
        return j.Function._CC.$default$compose((Function)this, (Function)function);
    }
}

