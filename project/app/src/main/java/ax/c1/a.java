/*
 * Decompiled with CFR 0.152.
 */
package ax.c1;

import ax.N1.t;
import ax.P0.v;
import ax.S0.M;
import ax.X1.K;
import ax.X1.b;
import ax.X1.e;
import ax.X1.h;
import ax.c1.f;
import ax.c1.k;
import ax.q1.r;
import ax.q1.s;
import ax.q1.t;
import java.io.IOException;

public final class a
implements f {
    private static final ax.q1.M f = new ax.q1.M();
    final r a;
    private final v b;
    private final M c;
    private final t.a d;
    private final boolean e;

    a(r r8, v v8, M m8, t.a a8, boolean bl) {
        this.a = r8;
        this.b = v8;
        this.c = m8;
        this.d = a8;
        this.e = bl;
    }

    @Override
    public void a(t t8) {
        this.a.a(t8);
    }

    @Override
    public boolean b(s s8) throws IOException {
        return this.a.f(s8, f) == 0;
    }

    @Override
    public void c() {
        this.a.b(0L, 0L);
    }

    @Override
    public boolean d() {
        r r8 = this.a.e();
        return r8 instanceof h || r8 instanceof b || r8 instanceof e || r8 instanceof ax.J1.f;
        {
        }
    }

    @Override
    public boolean e() {
        r r8 = this.a.e();
        return r8 instanceof K || r8 instanceof ax.K1.h;
        {
        }
    }

    @Override
    public f f() {
        Object object;
        block9: {
            block5: {
                block8: {
                    block7: {
                        block6: {
                            block4: {
                                boolean bl = this.e();
                                boolean bl2 = true;
                                ax.S0.a.g(bl ^ true);
                                if (this.a.e() != this.a) {
                                    bl2 = false;
                                }
                                object = new StringBuilder();
                                ((StringBuilder)object).append("Can't recreate wrapped extractors. Outer type: ");
                                ((StringBuilder)object).append(this.a.getClass());
                                ax.S0.a.h(bl2, ((StringBuilder)object).toString());
                                object = this.a;
                                if (!(object instanceof k)) break block4;
                                object = new k(this.b.d, this.c, this.d, this.e);
                                break block5;
                            }
                            if (!(object instanceof h)) break block6;
                            object = new h();
                            break block5;
                        }
                        if (!(object instanceof b)) break block7;
                        object = new b();
                        break block5;
                    }
                    if (!(object instanceof e)) break block8;
                    object = new e();
                    break block5;
                }
                if (!(object instanceof ax.J1.f)) break block9;
                object = new ax.J1.f();
            }
            return new a((r)object, this.b, this.c, this.d, this.e);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Unexpected extractor type for recreation: ");
        ((StringBuilder)object).append(this.a.getClass().getSimpleName());
        throw new IllegalStateException(((StringBuilder)object).toString());
    }
}

