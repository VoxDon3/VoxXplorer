/*
 * Decompiled with CFR 0.152.
 */
package ax.q0;

import ax.Fb.a;
import ax.Gb.l;
import ax.Qb.J;
import ax.n0.f;
import ax.n0.g;
import ax.q0.b;
import ax.q0.d;
import ax.q0.h;
import java.io.File;
import java.util.List;

public final class c {
    public static final c a = new c();

    private c() {
    }

    public final f<d> a(ax.o0.b<d> b8, List<? extends ax.n0.d<d>> list, J j8, a<? extends File> a8) {
        l.f(list, "migrations");
        l.f(j8, "scope");
        l.f(a8, "produceFile");
        return new b(g.a.a(h.a, b8, list, j8, (a<? extends File>)new a<File>(a8){
            final a<File> q;
            {
                this.q = a8;
                super(0);
            }

            public final File a() {
                h h8;
                File file = this.q.invoke();
                CharSequence charSequence = ax.Db.b.a(file);
                if (l.a(charSequence, (h8 = h.a).f())) {
                    return file;
                }
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("File extension for file: ");
                ((StringBuilder)charSequence).append(file);
                ((StringBuilder)charSequence).append(" does not match required extension for Preferences file: ");
                ((StringBuilder)charSequence).append(h8.f());
                throw new IllegalStateException(((StringBuilder)charSequence).toString().toString());
            }
        }));
    }
}

