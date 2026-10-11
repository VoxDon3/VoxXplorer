/*
 * Decompiled with CFR 0.152.
 */
package ax.Tc;

import ax.Sc.a;
import ax.Sc.i;
import ax.Tc.b;
import ax.Tc.e;
import ax.Tc.f;
import java.text.ParseException;

public class j
extends b {
    private final e e;

    public j(ax.Sc.f object) {
        super("(\\S+)\\s+(\\S+)\\s+(?:(<DIR>)|([0-9]+))\\s+(\\S.*)", 32);
        this.f((ax.Sc.f)object);
        ax.Sc.f f8 = new ax.Sc.f("WINDOWS", "MM-dd-yy kk:mm", null);
        f8.k("MM-dd-yy kk:mm");
        this.e = object = new f();
        ((a)object).f(f8);
    }

    @Override
    public i c(String charSequence) {
        i i8 = new i();
        i8.n((String)charSequence);
        if (this.g((String)charSequence)) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(this.e(1));
            ((StringBuilder)charSequence).append(" ");
            ((StringBuilder)charSequence).append(this.e(2));
            String string = ((StringBuilder)charSequence).toString();
            String string2 = this.e(3);
            String string3 = this.e(4);
            charSequence = this.e(5);
            try {
                i8.p(super.j(string));
            }
            catch (ParseException parseException) {
                try {
                    i8.p(this.e.a(string));
                }
                catch (ParseException parseException2) {
                    // empty catch block
                }
            }
            if (charSequence != null && !((String)charSequence).equals(".") && !((String)charSequence).equals("..")) {
                i8.l((String)charSequence);
                if ("<DIR>".equals(string2)) {
                    i8.q(1);
                    i8.o(0L);
                } else {
                    i8.q(0);
                    if (string3 != null) {
                        i8.o(Long.parseLong(string3));
                    }
                }
                return i8;
            }
        }
        return null;
    }

    @Override
    public ax.Sc.f i() {
        return new ax.Sc.f("WINDOWS", "MM-dd-yy hh:mma", null);
    }
}

