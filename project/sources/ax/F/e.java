package ax.F;

import java.text.DecimalFormat;

/* loaded from: classes.dex */
public abstract class e {
    protected a a;
    protected int[] b = new int[10];
    protected float[] c = new float[10];
    private int d;
    private String e;

    public float a(float f) {
        return (float) this.a.a(f, 0);
    }

    public String toString() {
        String str = this.e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.d; i++) {
            str = str + "[" + this.b[i] + " , " + decimalFormat.format(this.c[i]) + "] ";
        }
        return str;
    }
}
