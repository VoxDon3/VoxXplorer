/*
 * Decompiled with CFR 0.152.
 */
package ax.Tc;

import ax.Sc.f;
import ax.Sc.i;
import ax.Tc.b;
import java.text.ParseException;

public class k
extends b {
    public k(f f8) {
        super("(d|-){1}\\s+\\[([-A-Z]+)\\]\\s+(\\S+)\\s+(\\d+)\\s+(\\S+\\s+\\S+\\s+((\\d+:\\d+)|(\\d{4})))\\s+(.*)");
        this.f(f8);
    }

    @Override
    public i c(String string) {
        i i8 = new i();
        if (this.g(string)) {
            String string2 = this.e(1);
            String string3 = this.e(2);
            String string4 = this.e(3);
            string = this.e(4);
            String string5 = this.e(5);
            String string6 = this.e(9);
            try {
                i8.p(super.j(string5));
            }
            catch (ParseException parseException) {
                // empty catch block
            }
            if (string2.trim().equals("d")) {
                i8.q(1);
            } else {
                i8.q(0);
            }
            i8.r(string4);
            i8.l(string6.trim());
            i8.o(Long.parseLong(string.trim()));
            if (string3.indexOf(82) != -1) {
                i8.m(0, 0, true);
            }
            if (string3.indexOf(87) != -1) {
                i8.m(0, 1, true);
            }
            return i8;
        }
        return null;
    }

    @Override
    protected f i() {
        return new f("NETWARE", "MMM dd yyyy", "MMM dd HH:mm");
    }
}

