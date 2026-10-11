package ax.v1;

import ax.q1.AbstractC2845e;
import ax.q1.B;
import ax.q1.C2846f;
import ax.q1.C2864y;
import ax.q1.InterfaceC2858s;
import j$.util.Objects;
import java.io.IOException;

/* loaded from: classes.dex */
final class b extends AbstractC2845e {

    /* renamed from: ax.v1.b$b, reason: collision with other inner class name */
    private static final class C0475b implements AbstractC2845e.f {
        private final B a;
        private final int b;
        private final C2864y.a c;

        private long c(InterfaceC2858s interfaceC2858s) throws IOException {
            while (interfaceC2858s.i() < interfaceC2858s.getLength() - 6 && !C2864y.h(interfaceC2858s, this.a, this.b, this.c)) {
                interfaceC2858s.j(1);
            }
            if (interfaceC2858s.i() < interfaceC2858s.getLength() - 6) {
                return this.c.a;
            }
            interfaceC2858s.j((int) (interfaceC2858s.getLength() - interfaceC2858s.i()));
            return this.a.j;
        }

        @Override // ax.q1.AbstractC2845e.f
        public AbstractC2845e.C0426e a(InterfaceC2858s interfaceC2858s, long j) throws IOException {
            long position = interfaceC2858s.getPosition();
            long c = c(interfaceC2858s);
            long i = interfaceC2858s.i();
            interfaceC2858s.j(Math.max(6, this.a.c));
            long c2 = c(interfaceC2858s);
            return (c > j || c2 <= j) ? c2 <= j ? AbstractC2845e.C0426e.f(c2, interfaceC2858s.i()) : AbstractC2845e.C0426e.d(c, position) : AbstractC2845e.C0426e.e(i);
        }

        @Override // ax.q1.AbstractC2845e.f
        public /* synthetic */ void b() {
            C2846f.a(this);
        }

        private C0475b(B b, int i) {
            this.a = b;
            this.b = i;
            this.c = new C2864y.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final B b, int i, long j, long j2) {
        super(new AbstractC2845e.d() { // from class: ax.v1.a
            @Override // ax.q1.AbstractC2845e.d
            public final long a(long j3) {
                return B.this.i(j3);
            }
        }, new C0475b(b, i), b.f(), 0L, b.j, j, j2, b.d(), Math.max(6, b.c));
        Objects.requireNonNull(b);
    }
}
