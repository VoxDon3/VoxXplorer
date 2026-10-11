/*
 * Decompiled with CFR 0.152.
 */
package ax.F;

import java.text.DecimalFormat;
import java.util.ArrayList;

public abstract class d {
    private a a;
    private String b;
    private int c = 0;
    private String d = null;
    public int e = 0;
    ArrayList<b> f = new ArrayList();

    public float a(float f8) {
        return (float)this.a.a(f8);
    }

    public String toString() {
        String string = this.b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        ArrayList<b> arrayList = this.f;
        int n8 = arrayList.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            Object object = arrayList.get(i8);
            b b8 = object;
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append("[");
            ((StringBuilder)object).append(b8.a);
            ((StringBuilder)object).append(" , ");
            ((StringBuilder)object).append(decimalFormat.format(b8.b));
            ((StringBuilder)object).append("] ");
            string = ((StringBuilder)object).toString();
        }
        return string;
    }

    static class a {
        public double a(float f8) {
            throw null;
        }
    }

    static class b {
        int a;
        float b;
    }
}

