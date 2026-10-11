package ax.F;

import java.text.DecimalFormat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class d {
    private a a;
    private String b;
    private int c = 0;
    private String d = null;
    public int e = 0;
    ArrayList<b> f = new ArrayList<>();

    static class a {
        public double a(float f) {
            throw null;
        }
    }

    static class b {
        int a;
        float b;
    }

    public float a(float f) {
        return (float) this.a.a(f);
    }

    public String toString() {
        String str = this.b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        ArrayList<b> arrayList = this.f;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            b bVar = arrayList.get(i);
            i++;
            str = str + "[" + bVar.a + " , " + decimalFormat.format(r5.b) + "] ";
        }
        return str;
    }
}
