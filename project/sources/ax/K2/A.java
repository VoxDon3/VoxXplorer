package ax.K2;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public interface A {

    public static final class a {
        public static void a(A a, String str, Set<String> set) {
            ax.Gb.l.f(str, "id");
            ax.Gb.l.f(set, "tags");
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                a.a(new z((String) it.next(), str));
            }
        }
    }

    void a(z zVar);

    List<String> b(String str);

    void c(String str, Set<String> set);
}
