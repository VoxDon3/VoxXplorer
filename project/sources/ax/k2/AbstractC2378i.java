package ax.k2;

/* renamed from: ax.k2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2378i<T> extends AbstractC2367A {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2378i(AbstractC2390u abstractC2390u) {
        super(abstractC2390u);
        ax.Gb.l.f(abstractC2390u, "database");
    }

    protected abstract void i(ax.o2.k kVar, T t);

    public final void j(T t) {
        ax.o2.k b = b();
        try {
            i(b, t);
            b.S0();
        } finally {
            h(b);
        }
    }
}
