package ax.I9;

/* loaded from: classes3.dex */
public class n extends v {
    public static double A(double d) {
        if (d > 0.5d) {
            d = 1.0d - d;
        } else if (d < -0.5d) {
            d = (-1.0d) - d;
        }
        double d2 = d * 3.141592653589793d;
        double d3 = d2 * d2;
        return d2 * ((d3 * (((((((((-2.505210838544172E-8d) * d3) + 2.7557319223985893E-6d) * d3) - 1.984126984126984E-4d) * d3) + 0.008333333333333333d) * d3) - 0.16666666666666666d)) + 1.0d);
    }

    @Override // ax.I9.u
    public void k(int i, int i2) {
        double[] l = this.h.l();
        double[] l2 = this.i.l();
        double[] l3 = this.k.l();
        double i3 = this.j.i();
        while (i < i2) {
            i3 = s(i3, z(l[i]));
            l3[i] = A(i3) * l2[i];
            i++;
        }
        this.j.j(i3);
    }
}
