package ax.K1;

import ax.F1.c;
import ax.P0.C;
import ax.P0.E;
import ax.S0.G;
import ax.q1.InterfaceC2858s;
import ax.q1.M;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class q {
    private static final ax.q7.r d = ax.q7.r.d(':');
    private static final ax.q7.r e = ax.q7.r.d('*');
    private final List<a> a = new ArrayList();
    private int b = 0;
    private int c;

    private static final class a {
        public final int a;
        public final long b;
        public final int c;

        public a(int i, long j, int i2) {
            this.a = i;
            this.b = j;
            this.c = i2;
        }
    }

    private void a(InterfaceC2858s interfaceC2858s, M m) throws IOException {
        G g = new G(8);
        interfaceC2858s.readFully(g.f(), 0, 8);
        this.c = g.z() + 8;
        if (g.v() != 1397048916) {
            m.a = 0L;
        } else {
            m.a = interfaceC2858s.getPosition() - (this.c - 12);
            this.b = 2;
        }
    }

    private static int b(String str) throws E {
        str.getClass();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw E.a("Invalid SEF name", null);
        }
    }

    private void d(InterfaceC2858s interfaceC2858s, M m) throws IOException {
        long length = interfaceC2858s.getLength();
        int i = this.c - 20;
        G g = new G(i);
        interfaceC2858s.readFully(g.f(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            g.c0(2);
            short B = g.B();
            if (B == 2192 || B == 2816 || B == 2817 || B == 2819 || B == 2820) {
                this.a.add(new a(B, (length - this.c) - g.z(), g.z()));
            } else {
                g.c0(8);
            }
        }
        if (this.a.isEmpty()) {
            m.a = 0L;
        } else {
            this.b = 3;
            m.a = this.a.get(0).b;
        }
    }

    private void e(InterfaceC2858s interfaceC2858s, List<C.a> list) throws IOException {
        long position = interfaceC2858s.getPosition();
        int length = (int) ((interfaceC2858s.getLength() - interfaceC2858s.getPosition()) - this.c);
        G g = new G(length);
        interfaceC2858s.readFully(g.f(), 0, length);
        for (int i = 0; i < this.a.size(); i++) {
            a aVar = this.a.get(i);
            g.b0((int) (aVar.b - position));
            g.c0(4);
            int z = g.z();
            int b = b(g.J(z));
            int i2 = aVar.c - (z + 8);
            if (b == 2192) {
                list.add(f(g, i2));
            } else if (b != 2816 && b != 2817 && b != 2819 && b != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static ax.F1.c f(G g, int i) throws E {
        ArrayList arrayList = new ArrayList();
        List<String> f = e.f(g.J(i));
        for (int i2 = 0; i2 < f.size(); i2++) {
            List<String> f2 = d.f(f.get(i2));
            if (f2.size() != 3) {
                throw E.a(null, null);
            }
            try {
                arrayList.add(new c.a(Long.parseLong(f2.get(0)), Long.parseLong(f2.get(1)), 1 << (Integer.parseInt(f2.get(2)) - 1)));
            } catch (NumberFormatException e2) {
                throw E.a(null, e2);
            }
        }
        return new ax.F1.c(arrayList);
    }

    public int c(InterfaceC2858s interfaceC2858s, M m, List<C.a> list) throws IOException {
        int i = this.b;
        long j = 0;
        if (i == 0) {
            long length = interfaceC2858s.getLength();
            if (length != -1 && length >= 8) {
                j = length - 8;
            }
            m.a = j;
            this.b = 1;
        } else if (i == 1) {
            a(interfaceC2858s, m);
        } else if (i == 2) {
            d(interfaceC2858s, m);
        } else {
            if (i != 3) {
                throw new IllegalStateException();
            }
            e(interfaceC2858s, list);
            m.a = 0L;
        }
        return 1;
    }

    public void g() {
        this.a.clear();
        this.b = 0;
    }
}
