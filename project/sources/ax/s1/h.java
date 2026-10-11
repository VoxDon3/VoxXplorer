package ax.s1;

import ax.S0.G;

/* loaded from: classes.dex */
final class h implements InterfaceC3043a {
    public final String a;

    private h(String str) {
        this.a = str;
    }

    public static h b(G g) {
        return new h(g.J(g.a()));
    }

    @Override // ax.s1.InterfaceC3043a
    public int a() {
        return 1852994675;
    }
}
