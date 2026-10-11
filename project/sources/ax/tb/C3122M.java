package ax.tb;

import ax.ub.C3234h;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ax.tb.M, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3122M {
    public static <E> Set<E> a(Set<E> set) {
        ax.Gb.l.f(set, "builder");
        return ((C3234h) set).g();
    }

    public static <E> Set<E> b() {
        return new C3234h();
    }

    public static <T> Set<T> c(T t) {
        Set<T> singleton = Collections.singleton(t);
        ax.Gb.l.e(singleton, "singleton(...)");
        return singleton;
    }
}
