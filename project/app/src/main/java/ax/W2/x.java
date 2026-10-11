/*
 * Decompiled with CFR 0.152.
 */
package ax.W2;

import android.content.Context;
import android.widget.Toast;
import ax.Q2.f;
import ax.W2.h;
import ax.W2.j;
import ax.W2.y;
import ax.b3.c;
import ax.d3.s;
import ax.u3.q;
import com.alphainventor.filemanager.file.J;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.o;
import java.util.ArrayList;
import java.util.List;

public class x
extends h {
    private o d;
    private List<n> e;

    public static x l() {
        return new x();
    }

    public static void m(s s8, o o8, List<String> list, h.a a8) {
        new a(s8, o8, list, a8).i(new Void[0]);
    }

    @Override
    protected j b() {
        return new y(this.f(), this.d, this.e);
    }

    public void k(o o8, List<n> list, h.a a8) {
        this.i(a8);
        this.d = o8;
        this.e = list;
        this.j(h.c.c0);
    }

    static class a
    extends q<Void, Void, List<n>> {
        o h;
        s i;
        h.a j;
        List<String> k;

        a(s s8, o o8, List<String> list, h.a a8) {
            super(q.e.e0);
            this.i = s8;
            this.h = o8;
            this.j = a8;
            this.k = list;
        }

        protected List<n> w(Void ... object) {
            J j8 = (J)ax.c3.x.d(f.o1, 0).u();
            object = new ArrayList();
            for (String string : this.k) {
                try {
                    ((ArrayList)object).add(j8.d2(string));
                }
                catch (ax.b3.j j9) {
                    ax.Ha.c.h().f().d("RESTORE TASK BUILD INFO").l(j9).h();
                }
            }
            return object;
        }

        protected void x(List<n> list) {
            if (list.size() > 0) {
                x x8 = x.l();
                x8.k(this.h, list, this.j);
                try {
                    this.i.l(x8, true);
                    return;
                }
                catch (c c8) {
                    Toast.makeText((Context)this.i.b(), (int)2131951927, (int)0).show();
                }
            }
        }
    }
}

