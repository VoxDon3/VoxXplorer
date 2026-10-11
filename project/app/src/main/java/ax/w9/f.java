/*
 * Decompiled with CFR 0.152.
 */
package ax.w9;

import ax.B8.b;
import ax.C8.c;
import ax.D8.a;
import ax.w9.d;
import ax.w9.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public abstract class f {
    private int a;
    private String b;

    public f(int n8, String string) {
        this.a = n8;
        this.b = string;
    }

    protected void a(ax.C8.b<?> b8) throws e {
        Object object;
        if (b8 instanceof ax.D8.c && ((ax.D8.c)(object = (ax.D8.c)b8)).r() == this.a) {
            b8 = ((ax.D8.c)object).p();
            if (b8 instanceof a) {
                object = ((a)b8).iterator();
                while (object.hasNext()) {
                    b8 = (ax.C8.b)object.next();
                    if (b8 instanceof ax.D8.c) {
                        this.b((ax.D8.c)b8);
                        continue;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Expected an ASN.1 TaggedObject as ");
                    ((StringBuilder)object).append(this.b);
                    ((StringBuilder)object).append(" contents, not: ");
                    ((StringBuilder)object).append(b8);
                    throw new e(((StringBuilder)object).toString());
                }
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Expected a ");
            ((StringBuilder)object).append(this.b);
            ((StringBuilder)object).append(" (SEQUENCE), not: ");
            ((StringBuilder)object).append(b8);
            throw new e(((StringBuilder)object).toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Expected to find the ");
        ((StringBuilder)object).append(this.b);
        ((StringBuilder)object).append(" (CHOICE [");
        ((StringBuilder)object).append(this.a);
        ((StringBuilder)object).append("]) header, not: ");
        ((StringBuilder)object).append(b8);
        throw new e(((StringBuilder)object).toString());
    }

    protected abstract void b(ax.D8.c var1) throws e;

    public abstract void c(ax.Z8.a<?> var1) throws e;

    protected void d(ax.Z8.a<?> a8, ax.C8.b<?> object) throws IOException {
        ax.D8.c c8 = new ax.D8.c(c.d(this.a).c(), (ax.C8.b)object);
        object = new ArrayList();
        object.add(d.a);
        object.add(c8);
        c8 = new ax.D8.c(c.a(0), new a((List<ax.C8.b>)object), false);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        object = new ax.y8.b(new b(), byteArrayOutputStream);
        ((ax.y8.b)object).c(c8);
        a8.o(byteArrayOutputStream.toByteArray());
        return;
        finally {
            ((OutputStream)object).close();
        }
    }
}

