/*
 * Decompiled with CFR 0.152.
 */
package ax.Tc;

import ax.Sc.f;
import ax.Sc.i;
import ax.Tc.b;
import java.text.ParseException;

public class l
extends b {
    public l(f f8) {
        super("\\s*([0-9]+)\\s*(\\s+|[A-Z]+)\\s*(DIR|\\s+)\\s*(\\S+)\\s+(\\S+)\\s+(\\S.*)");
        this.f(f8);
    }

    @Override
    public i c(String string) {
        i i8 = new i();
        if (this.g(string)) {
            String string2 = this.e(1);
            String string3 = this.e(2);
            string = this.e(3);
            CharSequence charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(this.e(4));
            ((StringBuilder)charSequence).append(" ");
            ((StringBuilder)charSequence).append(this.e(5));
            String string4 = ((StringBuilder)charSequence).toString();
            charSequence = this.e(6);
            try {
                i8.p(super.j(string4));
            }
            catch (ParseException parseException) {
                // empty catch block
            }
            if (!string.trim().equals("DIR") && !string3.trim().equals("DIR")) {
                i8.q(0);
            } else {
                i8.q(1);
            }
            i8.l(((String)charSequence).trim());
            i8.o(Long.parseLong(string2.trim()));
            return i8;
        }
        return null;
    }

    @Override
    protected f i() {
        return new f("OS/2", "MM-dd-yy HH:mm", null);
    }
}

