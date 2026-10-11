/*
 * Decompiled with CFR 0.152.
 */
package ax.l9;

import ax.Q8.o;
import ax.Q8.q;
import ax.Q8.r;
import ax.Q8.t;
import ax.Xd.d;
import ax.Xd.f;
import ax.h9.b;
import ax.l9.n;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class g
implements n {
    private static final d b = f.k(g.class);
    private ax.d9.g a;

    g(ax.d9.g g8) {
        this.a = g8;
    }

    private static ax.d9.d e(SecretKey secretKey, ax.d9.g object) throws ax.d9.f {
        object = object.c(secretKey.getAlgorithm());
        object.a(secretKey.getEncoded());
        return object;
    }

    @Override
    public boolean a(r r8, SecretKey object) {
        ax.d9.f f82;
        block4: {
            Object object2 = r8.a();
            object = g.e((SecretKey)object, this.a);
            object.b(((ax.Z8.a)object2).a(), ((t)r8.b()).a(), 48);
            object.f(t.p);
            object.b(((ax.Z8.a)object2).a(), 64, ((t)r8.b()).c() - 64);
            object2 = object.g();
            byte[] byArray = ((t)r8.b()).l();
            for (int i8 = 0; i8 < 16; ++i8) {
                if (object2[i8] == byArray[i8]) continue;
                try {
                    object = b;
                    object.q("Signatures for packet {} do not match (received: {}, calculated: {})", r8, Arrays.toString(byArray), Arrays.toString((byte[])object2));
                    object.p("Packet {} has header: {}", r8, r8.b());
                    return false;
                }
                catch (ax.d9.f f82) {}
                break block4;
            }
            return true;
        }
        throw new IllegalStateException(f82);
    }

    @Override
    public q b(q q8, SecretKey secretKey) {
        if (secretKey != null) {
            return new a(this, q8, secretKey);
        }
        b.s("Not wrapping {} as signed, as no key is set.", (Object)((t)q8.c()).h());
        return q8;
    }

    public class ax.l9.g$a
    extends q {
        private final q e;
        private SecretKey f;
        final g g;

        ax.l9.g$a(g g8, q q8, SecretKey secretKey) {
            this.g = g8;
            this.e = q8;
            this.f = secretKey;
        }

        @Override
        public int f() {
            return this.e.f();
        }

        @Override
        public q g() {
            return this.e.g();
        }

        @Override
        public void l(b b8) {
            try {
                ((t)this.e.c()).u(o.f0);
                int n8 = b8.V();
                a a8 = new a(this, b8);
                this.e.l(a8);
                System.arraycopy(a8.i.g(), 0, b8.a(), n8 + 48, 16);
                return;
            }
            catch (ax.d9.f f8) {
                throw new IllegalStateException(f8);
            }
        }

        public t o() {
            return (t)this.e.c();
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Signed(");
            stringBuilder.append(this.e.toString());
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        private class a
        extends b {
            private b h;
            private final ax.d9.d i;
            final ax.l9.g$a j;

            a(ax.l9.g$a a8, b b8) throws ax.d9.f {
                this.j = a8;
                this.h = b8;
                this.i = ax.l9.g.e(a8.f, a8.g.a);
            }

            @Override
            public ax.Z8.a<b> i(ax.Z8.a<? extends ax.Z8.a<?>> a8) {
                this.i.b(a8.a(), a8.S(), a8.c());
                this.h.i(a8);
                return this;
            }

            @Override
            public ax.Z8.a<b> j(byte by) {
                this.i.d(by);
                this.h.j(by);
                return this;
            }

            @Override
            public ax.Z8.a<b> p(byte[] byArray, int n8, int n9) {
                this.i.b(byArray, n8, n9);
                this.h.p(byArray, n8, n9);
                return this;
            }
        }
    }
}

