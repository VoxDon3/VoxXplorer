package ax.K2;

import java.util.List;

/* loaded from: classes.dex */
public interface j {

    public static final class a {
        public static i a(j jVar, m mVar) {
            ax.Gb.l.f(mVar, "id");
            return jVar.g(mVar.b(), mVar.a());
        }

        public static void b(j jVar, m mVar) {
            ax.Gb.l.f(mVar, "id");
            jVar.d(mVar.b(), mVar.a());
        }
    }

    List<String> a();

    void b(i iVar);

    i c(m mVar);

    void d(String str, int i);

    void e(m mVar);

    void f(String str);

    i g(String str, int i);
}
