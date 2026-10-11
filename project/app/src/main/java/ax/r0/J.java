/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.A;
import ax.r0.H;
import ax.r0.O;
import ax.r0.P;
import ax.r0.Q;
import ax.r0.V;
import ax.r0.W;
import ax.r0.Z;
import ax.r0.c0;
import ax.r0.h0;
import ax.r0.i0;
import ax.r0.j0;
import ax.r0.s;
import ax.r0.x;
import ax.r0.y;

final class J
implements i0 {
    private static final Q b = new Q(){

        @Override
        public P a(Class<?> clazz) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override
        public boolean b(Class<?> clazz) {
            return false;
        }
    };
    private final Q a;

    public J() {
        this(J.b());
    }

    private J(Q q8) {
        this.a = A.b(q8, "messageInfoFactory");
    }

    private static Q b() {
        return new b(x.c(), J.c());
    }

    private static Q c() {
        try {
            Q q8 = (Q)Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
            return q8;
        }
        catch (Exception exception) {
            return b;
        }
    }

    private static boolean d(P p8) {
        return p8.c() == c0.q;
    }

    private static <T> h0<T> e(Class<T> clazz, P p8) {
        if (y.class.isAssignableFrom(clazz)) {
            if (J.d(p8)) {
                return V.N(clazz, p8, Z.b(), H.b(), j0.M(), s.b(), O.b());
            }
            return V.N(clazz, p8, Z.b(), H.b(), j0.M(), null, O.b());
        }
        if (J.d(p8)) {
            return V.N(clazz, p8, Z.a(), H.a(), j0.H(), s.a(), O.a());
        }
        return V.N(clazz, p8, Z.a(), H.a(), j0.I(), null, O.a());
    }

    @Override
    public <T> h0<T> a(Class<T> clazz) {
        j0.J(clazz);
        P p8 = this.a.a(clazz);
        if (p8.a()) {
            if (y.class.isAssignableFrom(clazz)) {
                return W.l(j0.M(), s.b(), p8.b());
            }
            return W.l(j0.H(), s.a(), p8.b());
        }
        return J.e(clazz, p8);
    }

    private static class b
    implements Q {
        private Q[] a;

        b(Q ... qArray) {
            this.a = qArray;
        }

        @Override
        public P a(Class<?> clazz) {
            for (Q q8 : this.a) {
                if (!q8.b(clazz)) continue;
                return q8.a(clazz);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No factory is available for message type: ");
            stringBuilder.append(clazz.getName());
            throw new UnsupportedOperationException(stringBuilder.toString());
        }

        @Override
        public boolean b(Class<?> clazz) {
            Q[] qArray = this.a;
            int n8 = qArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                if (!qArray[i8].b(clazz)) continue;
                return true;
            }
            return false;
        }
    }
}

