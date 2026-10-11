/*
 * Decompiled with CFR 0.152.
 */
package ax.b1;

import ax.V0.b;
import ax.b1.u;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

public interface n {
    public void a(u.a var1);

    public UUID b();

    public void c(u.a var1);

    public boolean d();

    public Map<String, String> e();

    public boolean f(String var1);

    public a g();

    public int getState();

    public b h();

    public static class a
    extends IOException {
        public final int q;

        public a(Throwable throwable, int n8) {
            super(throwable);
            this.q = n8;
        }
    }
}

