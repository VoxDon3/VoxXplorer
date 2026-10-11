package ax.s1;

import ax.S0.G;
import ax.r7.AbstractC2991z;
import ax.r7.j0;

/* loaded from: classes.dex */
final class f implements InterfaceC3043a {
    public final AbstractC2991z<InterfaceC3043a> a;
    private final int b;

    private f(int i, AbstractC2991z<InterfaceC3043a> abstractC2991z) {
        this.b = i;
        this.a = abstractC2991z;
    }

    private static InterfaceC3043a b(int i, int i2, G g) {
        switch (i) {
            case 1718776947:
                return g.e(i2, g);
            case 1751742049:
                return c.c(g);
            case 1752331379:
                return d.d(g);
            case 1852994675:
                return h.b(g);
            default:
                return null;
        }
    }

    public static f d(int i, G g) {
        AbstractC2991z.a aVar = new AbstractC2991z.a();
        int j = g.j();
        int i2 = -2;
        while (g.a() > 8) {
            int z = g.z();
            int g2 = g.g() + g.z();
            g.a0(g2);
            InterfaceC3043a d = z == 1414744396 ? d(g.z(), g) : b(z, i2, g);
            if (d != null) {
                if (d.a() == 1752331379) {
                    i2 = ((d) d).c();
                }
                aVar.a(d);
            }
            g.b0(g2);
            g.a0(j);
        }
        return new f(i, aVar.k());
    }

    @Override // ax.s1.InterfaceC3043a
    public int a() {
        return this.b;
    }

    public <T extends InterfaceC3043a> T c(Class<T> cls) {
        j0<InterfaceC3043a> it = this.a.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }
}
