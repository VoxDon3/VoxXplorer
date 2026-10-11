/*
 * Decompiled with CFR 0.152.
 */
package ax.i7;

import ax.i7.i;
import ax.i7.j;
import ax.i7.k;
import ax.i7.m;
import ax.i7.o;
import ax.m7.v;
import ax.m7.y;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.UUID;

public class B
extends ax.i7.a {
    private ArrayList<a> c;

    public B() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("__END_OF_PART__");
        stringBuilder.append(UUID.randomUUID().toString());
        stringBuilder.append("__");
        this(stringBuilder.toString());
    }

    public B(String string) {
        super(new o("multipart/related").m("boundary", string));
        this.c = new ArrayList();
    }

    @Override
    public void b(OutputStream outputStream) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, this.f());
        String string = this.i();
        ArrayList<a> arrayList = this.c;
        int n8 = arrayList.size();
        int n9 = 0;
        while (n9 < n8) {
            Object object = arrayList.get(n9);
            ++n9;
            Object object2 = object;
            m m8 = new m().C(null);
            object = ((a)object2).b;
            if (object != null) {
                m8.k((m)object);
            }
            m8.F(null).P(null).I(null).G(null).B("Content-Transfer-Encoding", null);
            object = ((a)object2).a;
            if (object != null) {
                long l8;
                m8.B("Content-Transfer-Encoding", Arrays.asList("binary"));
                m8.I(object.a());
                object2 = ((a)object2).c;
                if (object2 == null) {
                    l8 = object.getLength();
                } else {
                    m8.F(object2.getName());
                    object2 = new k((y)object, (j)object2);
                    l8 = ax.i7.a.e((i)object);
                    object = object2;
                }
                object2 = object;
                if (l8 != -1L) {
                    m8.G(l8);
                    object2 = object;
                }
            } else {
                object2 = null;
            }
            outputStreamWriter.write("--");
            outputStreamWriter.write(string);
            outputStreamWriter.write("\r\n");
            m.z(m8, null, null, outputStreamWriter);
            if (object2 != null) {
                outputStreamWriter.write("\r\n");
                ((Writer)outputStreamWriter).flush();
                object2.b(outputStream);
            }
            outputStreamWriter.write("\r\n");
        }
        outputStreamWriter.write("--");
        outputStreamWriter.write(string);
        outputStreamWriter.write("--");
        outputStreamWriter.write("\r\n");
        ((Writer)outputStreamWriter).flush();
    }

    @Override
    public boolean c() {
        ArrayList<a> arrayList = this.c;
        int n8 = arrayList.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            a a8 = arrayList.get(i8);
            if (a8.a.c()) continue;
            return false;
        }
        return true;
    }

    public B h(a a8) {
        this.c.add(v.d(a8));
        return this;
    }

    public final String i() {
        return this.g().f("boundary");
    }

    public B j(Collection<? extends i> object) {
        this.c = new ArrayList(object.size());
        object = object.iterator();
        while (object.hasNext()) {
            this.h(new a((i)object.next()));
        }
        return this;
    }

    public static final class a {
        i a;
        m b;
        j c;

        public a() {
            this(null);
        }

        public a(i i8) {
            this(null, i8);
        }

        public a(m m8, i i8) {
            this.b(m8);
            this.a(i8);
        }

        public a a(i i8) {
            this.a = i8;
            return this;
        }

        public a b(m m8) {
            this.b = m8;
            return this;
        }
    }
}

