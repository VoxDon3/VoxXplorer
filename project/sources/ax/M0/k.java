package ax.M0;

import android.text.TextUtils;
import ax.b0.C1441b;

/* loaded from: classes.dex */
class k implements e {
    private String a;
    private int b;
    private int c;

    k(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return (this.b < 0 || kVar.b < 0) ? TextUtils.equals(this.a, kVar.a) && this.c == kVar.c : TextUtils.equals(this.a, kVar.a) && this.b == kVar.b && this.c == kVar.c;
    }

    public int hashCode() {
        return C1441b.b(this.a, Integer.valueOf(this.c));
    }
}
