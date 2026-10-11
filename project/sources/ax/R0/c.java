package ax.R0;

import ax.S0.d0;
import ax.q7.InterfaceC2879f;
import ax.r7.AbstractC2991z;
import ax.r7.T;
import java.util.List;

/* loaded from: classes.dex */
public final class c {
    private static final T<a> c = T.d().f(new InterfaceC2879f() { // from class: ax.R0.b
        @Override // ax.q7.InterfaceC2879f
        public final Object apply(Object obj) {
            Integer valueOf;
            valueOf = Integer.valueOf(((a) obj).r);
            return valueOf;
        }
    });
    public static final c d = new c(AbstractC2991z.z(), 0);
    private static final String e = d0.G0(0);
    private static final String f = d0.G0(1);
    public final AbstractC2991z<a> a;
    public final long b;

    public c(List<a> list, long j) {
        this.a = AbstractC2991z.J(c, list);
        this.b = j;
    }
}
