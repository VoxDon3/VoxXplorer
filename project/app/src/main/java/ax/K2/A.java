/*
 * Decompiled with CFR 0.152.
 */
package ax.K2;

import ax.Gb.l;
import ax.K2.z;
import java.util.List;
import java.util.Set;

public interface A {
    public void a(z var1);

    public List<String> b(String var1);

    public void c(String var1, Set<String> var2);

    public static final class a {
        public static void a(A a8, String string, Set<String> object) {
            l.f(string, "id");
            l.f(object, "tags");
            object = object.iterator();
            while (object.hasNext()) {
                a8.a(new z((String)object.next(), string));
            }
        }
    }
}

