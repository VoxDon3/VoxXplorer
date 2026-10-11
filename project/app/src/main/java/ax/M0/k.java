/*
 * Decompiled with CFR 0.152.
 */
package ax.M0;

import android.text.TextUtils;
import ax.M0.e;
import ax.b0.b;

class k
implements e {
    private String a;
    private int b;
    private int c;

    k(String string, int n8, int n9) {
        this.a = string;
        this.b = n8;
        this.c = n9;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof k)) {
            return false;
        }
        object = (k)object;
        if (this.b >= 0 && ((k)object).b >= 0) {
            return TextUtils.equals((CharSequence)this.a, (CharSequence)((k)object).a) && this.b == ((k)object).b && this.c == ((k)object).c;
        }
        return TextUtils.equals((CharSequence)this.a, (CharSequence)((k)object).a) && this.c == ((k)object).c;
    }

    public int hashCode() {
        return ax.b0.b.b(this.a, this.c);
    }
}

