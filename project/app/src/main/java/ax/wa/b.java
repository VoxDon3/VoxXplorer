/*
 * Decompiled with CFR 0.152.
 */
package ax.wa;

import ax.pa.c;
import ax.wa.f;
import java.io.IOException;

public abstract class b<T extends f>
implements ax.qa.b {
    private T a;

    @Override
    public void a(c c8) throws IOException {
        if (this.f() != null) {
            c8.k(this.f());
        }
    }

    @Override
    public void b(c c8) throws IOException {
    }

    @Override
    public void c(c c8) throws IOException {
        c8.a(ax.qa.a.e0);
        int n8 = c8.f();
        if (n8 == this.e().h()) {
            int n9 = c8.f();
            if (n9 == n8) {
                if (c8.j() != 0) {
                    this.a = this.d();
                    return;
                }
                this.a = null;
                return;
            }
            throw new ax.c.a(String.format("Expected info level %d to match enum level, got: %d", n8, n9));
        }
        throw new ax.c.a(String.format("Expected info level %d, got: %d", this.e().h(), n8));
    }

    abstract T d();

    public abstract ax.wa.a e();

    public T f() {
        return this.a;
    }

    public static class a
    extends b<f.a> {
        @Override
        public ax.wa.a e() {
            return ax.wa.a.d0;
        }

        f.a g() {
            return new f.a();
        }
    }
}

