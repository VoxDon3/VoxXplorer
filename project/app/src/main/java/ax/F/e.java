/*
 * Decompiled with CFR 0.152.
 */
package ax.F;

import ax.F.a;
import java.text.DecimalFormat;

public abstract class e {
    protected a a;
    protected int[] b = new int[10];
    protected float[] c = new float[10];
    private int d;
    private String e;

    public float a(float f8) {
        return (float)this.a.a(f8, 0);
    }

    public String toString() {
        String string = this.e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i8 = 0; i8 < this.d; ++i8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("[");
            stringBuilder.append(this.b[i8]);
            stringBuilder.append(" , ");
            stringBuilder.append(decimalFormat.format(this.c[i8]));
            stringBuilder.append("] ");
            string = stringBuilder.toString();
        }
        return string;
    }
}

