package ax.s1;

import ax.S0.G;

/* loaded from: classes.dex */
final class c implements InterfaceC3043a {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    private c(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static c c(G g) {
        int z = g.z();
        g.c0(8);
        int z2 = g.z();
        int z3 = g.z();
        g.c0(4);
        int z4 = g.z();
        g.c0(12);
        return new c(z, z2, z3, z4);
    }

    @Override // ax.s1.InterfaceC3043a
    public int a() {
        return 1751742049;
    }

    public boolean b() {
        return (this.b & 16) == 16;
    }
}
