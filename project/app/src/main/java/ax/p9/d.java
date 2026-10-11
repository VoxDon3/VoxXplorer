/*
 * Decompiled with CFR 0.152.
 */
package ax.p9;

import ax.Q8.h;
import ax.Q8.j;
import ax.Q8.q;
import ax.Q8.t;
import ax.k9.e;
import ax.p9.b;
import ax.p9.c;
import ax.s9.n;
import ax.x9.a;
import java.util.List;

public class d
implements c {
    private c b;
    private n c;

    public d(c c8) {
        this.b = c8;
        this.c = new n(){
            final c b;
            final d c;
            {
                this.c = d8;
                this.b = c8;
            }

            @Override
            public boolean a(long l8) {
                return l8 == ax.K8.a.k0.getValue() || this.b.a().a(l8);
                {
                }
            }
        };
    }

    private static h.d d(h object) {
        if (object != null) {
            for (h.c c8 : ((h)object).a()) {
                if (!(c8 instanceof h.d)) continue;
                return (h.d)c8;
            }
        }
        return null;
    }

    private String e(String object, int n8) {
        object = j.a((String)object);
        return new String((byte[])object, 0, ((Object)object).length - n8, ax.Y8.b.c);
    }

    private String f(String object, int n8) {
        object = j.a((String)object);
        return new String((byte[])object, ((Object)object).length - n8, n8, ax.Y8.b.c);
    }

    private String g(String object) {
        object = a.d((String)object, '\\');
        int n8 = 0;
        while (n8 < object.size()) {
            String string = (String)object.get(n8);
            if (".".equals(string)) {
                object.remove(n8);
                continue;
            }
            if ("..".equals(string)) {
                int n9 = n8;
                if (n8 > 0) {
                    object.remove(n8);
                    n9 = n8 - 1;
                }
                object.remove(n9);
                n8 = n9;
                continue;
            }
            ++n8;
        }
        return a.b((List<String>)object, '\\');
    }

    private String h(String charSequence, h.d object) {
        int n8 = ((h.d)object).c();
        String string = this.f((String)charSequence, n8);
        String string2 = ((h.d)object).b();
        if (((h.d)object).d()) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append(string);
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = this.e((String)charSequence, n8);
            object = new StringBuilder();
            n8 = ((String)charSequence).lastIndexOf("\\");
            if (n8 != -1) {
                ((StringBuilder)object).append(charSequence, 0, n8);
                ((StringBuilder)object).append('\\');
            }
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append(string);
            charSequence = ((StringBuilder)object).toString();
        }
        return this.g((String)charSequence);
    }

    @Override
    public n a() {
        return this.c;
    }

    @Override
    public <T> T b(ax.r9.b b8, e e8, c.b<T> b9) throws b {
        return this.b.b(b8, e8, b9);
    }

    @Override
    public <T> T c(ax.r9.b object, q q8, e e8, c.b<T> b8) throws b {
        if (((t)q8.c()).m() == ax.K8.a.k0.getValue()) {
            object = d.d(q8.e());
            if (object != null) {
                object = this.h(e8.b(), (h.d)object);
                return b8.a(new e(e8.a(), e8.c(), (String)object));
            }
            long l8 = ((t)q8.c()).m();
            object = new StringBuilder();
            ((StringBuilder)object).append("Create failed for ");
            ((StringBuilder)object).append(e8);
            ((StringBuilder)object).append(": missing symlink data");
            throw new b(l8, ((StringBuilder)object).toString());
        }
        return this.b.c((ax.r9.b)object, q8, e8, b8);
    }
}

