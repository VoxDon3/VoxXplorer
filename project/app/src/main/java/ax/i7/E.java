/*
 * Decompiled with CFR 0.152.
 */
package ax.i7;

import ax.i7.F;
import ax.i7.a;
import ax.m7.C;
import ax.m7.g;
import ax.m7.j;
import ax.m7.v;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.Map;

public class E
extends a {
    private Object c;
    private boolean d;

    public E(Object object) {
        super(F.a);
        this.i(object);
        this.d = false;
    }

    private static boolean h(boolean bl, Writer writer, String string, Object object, boolean bl2) throws IOException {
        boolean bl3 = bl;
        if (object != null) {
            if (g.d(object)) {
                bl3 = bl;
            } else {
                if (bl) {
                    bl = false;
                } else {
                    writer.write("&");
                }
                writer.write(string);
                string = object instanceof Enum ? j.j((Enum)object).e() : object.toString();
                string = bl2 ? ax.n7.a.e(string) : ax.n7.a.c(string);
                bl3 = bl;
                if (string.length() != 0) {
                    writer.write("=");
                    writer.write(string);
                    bl3 = bl;
                }
            }
        }
        return bl3;
    }

    @Override
    public void b(OutputStream closeable) throws IOException {
        closeable = new BufferedWriter(new OutputStreamWriter((OutputStream)closeable, this.f()));
        Iterator<Map.Entry<String, Object>> iterator = g.g(this.c).entrySet().iterator();
        boolean bl = true;
        block0: while (iterator.hasNext()) {
            Map.Entry<String, Object> entry = iterator.next();
            Iterator iterator2 = entry.getValue();
            if (iterator2 == null) continue;
            entry = ax.n7.a.c(entry.getKey());
            Class<?> clazz = iterator2.getClass();
            if (!(iterator2 instanceof Iterable) && !clazz.isArray()) {
                bl = E.h(bl, (Writer)closeable, (String)((Object)entry), iterator2, this.d);
                continue;
            }
            iterator2 = C.l(iterator2).iterator();
            boolean bl2 = bl;
            while (true) {
                bl = bl2;
                if (!iterator2.hasNext()) continue block0;
                bl2 = E.h(bl2, (Writer)closeable, (String)((Object)entry), iterator2.next(), this.d);
            }
        }
        ((Writer)closeable).flush();
    }

    public E i(Object object) {
        this.c = v.d(object);
        return this;
    }
}

