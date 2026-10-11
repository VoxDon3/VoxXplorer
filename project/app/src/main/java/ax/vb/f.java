/*
 * Decompiled with CFR 0.152.
 */
package ax.vb;

import ax.Gb.l;
import ax.vb.e;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

final class f
implements Comparator<Comparable<? super Object>>,
j.Comparator {
    public static final f q = new f();

    private f() {
    }

    public int a(Comparable<Object> comparable, Comparable<Object> comparable2) {
        l.f(comparable, "a");
        l.f(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    @Override
    public final Comparator<Comparable<Object>> reversed() {
        return e.q;
    }

    @Override
    public /* synthetic */ Comparator thenComparing(Comparator comparator) {
        return j.Comparator._CC.$default$thenComparing((Comparator)this, (Comparator)comparator);
    }

    @Override
    public /* synthetic */ Comparator thenComparing(Function function) {
        return j.Comparator._CC.$default$thenComparing((Comparator)this, (Function)function);
    }

    @Override
    public /* synthetic */ Comparator thenComparing(Function function, Comparator comparator) {
        return j.Comparator._CC.$default$thenComparing((Comparator)this, (Function)function, (Comparator)comparator);
    }

    @Override
    public /* synthetic */ Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return j.Comparator._CC.$default$thenComparingDouble((Comparator)this, (ToDoubleFunction)toDoubleFunction);
    }

    @Override
    public /* synthetic */ Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return j.Comparator._CC.$default$thenComparingInt((Comparator)this, (ToIntFunction)toIntFunction);
    }

    @Override
    public /* synthetic */ Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return j.Comparator._CC.$default$thenComparingLong((Comparator)this, (ToLongFunction)toLongFunction);
    }
}

