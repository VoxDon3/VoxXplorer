/*
 * Decompiled with CFR 0.152.
 */
package ax.K2;

import ax.Gb.l;
import ax.K2.i;
import ax.K2.m;
import java.util.List;

public interface j {
    public List<String> a();

    public void b(i var1);

    public i c(m var1);

    public void d(String var1, int var2);

    public void e(m var1);

    public void f(String var1);

    public i g(String var1, int var2);

    public static final class a {
        public static i a(j j8, m m8) {
            l.f(m8, "id");
            return j8.g(m8.b(), m8.a());
        }

        public static void b(j j8, m m8) {
            l.f(m8, "id");
            j8.d(m8.b(), m8.a());
        }
    }
}

