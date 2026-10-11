/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Dc.S;
import java.util.function.Function;

public final class Q
implements Function {
    public /* synthetic */ Function andThen(Function function) {
        return j.Function._CC.$default$andThen((Function)this, (Function)function);
    }

    public final Object apply(Object object) {
        return S.a((String)object);
    }

    public /* synthetic */ Function compose(Function function) {
        return j.Function._CC.$default$compose((Function)this, (Function)function);
    }
}

