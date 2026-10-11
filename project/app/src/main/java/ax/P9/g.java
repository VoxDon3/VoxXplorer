/*
 * Decompiled with CFR 0.152.
 */
package ax.P9;

import ax.M9.e;
import ax.P9.i;
import ax.s8.c;

public class g {
    @c(value="message")
    public String a;
    @c(value="code")
    public String b;
    @c(value="innererror")
    public i c;

    public boolean a(e e8) {
        if (this.b.equalsIgnoreCase(((Object)((Object)e8)).toString())) {
            return true;
        }
        i i8 = this.c;
        while (i8 != null) {
            if (i8.a.equalsIgnoreCase(((Object)((Object)e8)).toString())) {
                return true;
            }
            i8 = i8.f;
        }
        return false;
    }
}

