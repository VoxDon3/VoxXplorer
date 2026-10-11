/*
 * Decompiled with CFR 0.152.
 */
package ax.F;

import ax.F.a;
import java.text.DecimalFormat;

public abstract class f {
    protected a a;
    protected int b = 0;
    protected int[] c = new int[10];
    protected float[][] d = new float[10][3];
    protected int e;
    protected String f;
    protected float[] g = new float[3];
    protected boolean h = false;
    protected long i;
    protected float j = Float.NaN;

    public String toString() {
        String string = this.f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i8 = 0; i8 < this.e; ++i8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("[");
            stringBuilder.append(this.c[i8]);
            stringBuilder.append(" , ");
            stringBuilder.append(decimalFormat.format(this.d[i8]));
            stringBuilder.append("] ");
            string = stringBuilder.toString();
        }
        return string;
    }
}

