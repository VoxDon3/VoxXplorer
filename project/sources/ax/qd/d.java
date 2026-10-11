package ax.qd;

/* loaded from: classes3.dex */
public class d {
    private String a;
    private int b;
    private char c;
    private StringBuffer d;

    public d(String str) {
        this(str, ',');
    }

    public boolean a() {
        return this.b != this.a.length();
    }

    public String b() {
        if (this.b == this.a.length()) {
            return null;
        }
        int i = this.b + 1;
        this.d.setLength(0);
        boolean z = false;
        boolean z2 = false;
        while (i != this.a.length()) {
            char charAt = this.a.charAt(i);
            if (charAt == '\"') {
                if (!z) {
                    z2 = !z2;
                }
            } else if (!z && !z2) {
                if (charAt == '\\') {
                    this.d.append(charAt);
                    z = true;
                } else {
                    if (charAt == this.c) {
                        break;
                    }
                    this.d.append(charAt);
                }
                i++;
            }
            this.d.append(charAt);
            z = false;
            i++;
        }
        this.b = i;
        return this.d.toString();
    }

    public d(String str, char c) {
        this.d = new StringBuffer();
        this.a = str;
        this.b = -1;
        this.c = c;
    }
}
