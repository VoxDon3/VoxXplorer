/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import ax.E1.e;
import ax.E1.k;
import ax.P0.C;
import ax.S0.d0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class F {
    private static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean b(String object) {
        if (!((Matcher)(object = c.matcher((CharSequence)object))).find()) return false;
        try {
            int n8 = Integer.parseInt(d0.i(((Matcher)object).group(1)), 16);
            int n9 = Integer.parseInt(d0.i(((Matcher)object).group(2)), 16);
            if (n8 <= 0) {
                if (n9 <= 0) return false;
            }
            this.a = n8;
            this.b = n9;
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
    }

    public boolean a() {
        return this.a != -1 && this.b != -1;
    }

    public boolean c(C c8) {
        for (int i8 = 0; i8 < c8.e(); ++i8) {
            C.a a8 = c8.d(i8);
            if (a8 instanceof e) {
                a8 = (e)a8;
                if (!"iTunSMPB".equals(((e)a8).c) || !this.b(((e)a8).d)) continue;
                return true;
            }
            if (!(a8 instanceof k)) continue;
            a8 = (k)a8;
            if (!"com.apple.iTunes".equals(((k)a8).b) || !"iTunSMPB".equals(((k)a8).c) || !this.b(((k)a8).d)) continue;
            return true;
        }
        return false;
    }
}

