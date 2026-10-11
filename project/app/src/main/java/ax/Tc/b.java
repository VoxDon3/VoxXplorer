/*
 * Decompiled with CFR 0.152.
 */
package ax.Tc;

import ax.Sc.a;
import ax.Tc.e;
import ax.Tc.f;
import ax.Tc.o;
import java.text.ParseException;
import java.util.Calendar;

public abstract class b
extends o
implements a {
    private final e d = new f();

    public b(String string) {
        super(string);
    }

    public b(String string, int n8) {
        super(string, n8);
    }

    @Override
    public void f(ax.Sc.f f8) {
        if (this.d instanceof a) {
            ax.Sc.f f9 = this.i();
            if (f8 != null) {
                if (f8.b() == null) {
                    f8.k(f9.b());
                }
                if (f8.c() == null) {
                    f8.l(f9.c());
                }
                ((a)((Object)this.d)).f(f8);
                return;
            }
            ((a)((Object)this.d)).f(f9);
        }
    }

    protected abstract ax.Sc.f i();

    public Calendar j(String string) throws ParseException {
        return this.d.a(string);
    }
}

