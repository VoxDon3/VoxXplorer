package ax.J9;

import ax.I9.y;

/* loaded from: classes3.dex */
public abstract class g {
    private String a;
    private String[] b;

    public g(String str, String[] strArr) {
        this.a = str;
        this.b = strArr;
    }

    public abstract y a();

    public int b() {
        return this.b.length;
    }

    public String[] c() {
        return this.b;
    }

    public String toString() {
        return this.a + "[" + b() + "]";
    }
}
