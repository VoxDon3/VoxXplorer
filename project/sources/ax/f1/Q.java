package ax.f1;

import ax.f1.a0;
import java.util.List;

/* loaded from: classes.dex */
public interface Q {
    public static final Q a = new Q() { // from class: ax.f1.N
        @Override // ax.f1.Q
        public final List a(String str, boolean z, boolean z2) {
            return a0.l(str, z, z2);
        }
    };
    public static final Q b = new Q() { // from class: ax.f1.O
        @Override // ax.f1.Q
        public final List a(String str, boolean z, boolean z2) {
            List p;
            p = a0.p(Q.a.a(str, z, z2));
            return p;
        }
    };

    List<C2006D> a(String str, boolean z, boolean z2) throws a0.c;
}
