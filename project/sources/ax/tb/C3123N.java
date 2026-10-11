package ax.tb;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ax.tb.N, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3123N extends C3122M {
    public static <T> Set<T> d() {
        return C3112C.q;
    }

    public static <T> Set<T> e(T... tArr) {
        ax.Gb.l.f(tArr, "elements");
        return (Set) C3137m.D(tArr, new LinkedHashSet(C3117H.d(tArr.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> f(Set<? extends T> set) {
        ax.Gb.l.f(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : C3122M.c(set.iterator().next()) : d();
    }
}
