package ax.T0;

import ax.S0.G;

/* loaded from: classes.dex */
public final class a {
    public final int a;
    public final int b;
    public final String c;

    private a(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public static a a(G g) {
        String str;
        g.c0(2);
        int M = g.M();
        int i = M >> 1;
        int M2 = ((g.M() >> 3) & 31) | ((M & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i < 10 ? ".0" : ".");
        sb.append(i);
        sb.append(M2 < 10 ? ".0" : ".");
        sb.append(M2);
        return new a(i, M2, sb.toString());
    }
}
