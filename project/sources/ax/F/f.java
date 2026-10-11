package ax.F;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* loaded from: classes.dex */
public abstract class f {
    protected a a;
    protected int e;
    protected String f;
    protected long i;
    protected int b = 0;
    protected int[] c = new int[10];
    protected float[][] d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);
    protected float[] g = new float[3];
    protected boolean h = false;
    protected float j = Float.NaN;

    public String toString() {
        String str = this.f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.e; i++) {
            str = str + "[" + this.c[i] + " , " + decimalFormat.format(this.d[i]) + "] ";
        }
        return str;
    }
}
