/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.C0;
import ax.W5.G0;
import ax.W5.J0;
import ax.W5.O0;
import ax.W5.X0;
import ax.W5.Z0;
import ax.W5.a1;
import ax.W5.f1;
import ax.W5.g1;
import ax.W5.h1;
import ax.W5.n1;
import ax.W5.o1;
import ax.W5.q1;
import ax.W5.v1;
import ax.W5.w1;
import ax.W5.x1;

final class b1
implements w1 {
    private static final h1 b = new Z0();
    private final h1 a;

    public b1() {
        Object object;
        h1 h12 = G0.a();
        try {
            object = (h1)Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        }
        catch (Exception exception) {
            object = b;
        }
        h12 = new a1(new h1[]{h12, object});
        object = O0.d;
        this.a = h12;
    }

    private static boolean b(g1 g12) {
        return g12.c() - 1 != 1;
    }

    @Override
    public final v1 a(Class clazz) {
        x1.e(clazz);
        g1 g12 = this.a.b(clazz);
        if (g12.b()) {
            if (J0.class.isAssignableFrom(clazz)) {
                return o1.a(x1.b(), C0.b(), g12.a());
            }
            return o1.a(x1.a(), C0.a(), g12.a());
        }
        if (J0.class.isAssignableFrom(clazz)) {
            if (b1.b(g12)) {
                return n1.s(clazz, g12, q1.b(), X0.d(), x1.b(), C0.b(), f1.b());
            }
            return n1.s(clazz, g12, q1.b(), X0.d(), x1.b(), null, f1.b());
        }
        if (b1.b(g12)) {
            return n1.s(clazz, g12, q1.a(), X0.c(), x1.a(), C0.a(), f1.a());
        }
        return n1.s(clazz, g12, q1.a(), X0.c(), x1.a(), null, f1.a());
    }
}

