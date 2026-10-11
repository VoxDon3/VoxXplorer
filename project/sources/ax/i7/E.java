package ax.i7;

import ax.m7.C2524C;
import ax.m7.C2532g;
import ax.m7.C2535j;
import ax.n7.C2584a;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class E extends AbstractC2277a {
    private Object c;
    private boolean d;

    public E(Object obj) {
        super(F.a);
        i(obj);
        this.d = false;
    }

    private static boolean h(boolean z, Writer writer, String str, Object obj, boolean z2) throws IOException {
        if (obj != null && !C2532g.d(obj)) {
            if (z) {
                z = false;
            } else {
                writer.write("&");
            }
            writer.write(str);
            String e = obj instanceof Enum ? C2535j.j((Enum) obj).e() : obj.toString();
            String e2 = z2 ? C2584a.e(e) : C2584a.c(e);
            if (e2.length() != 0) {
                writer.write("=");
                writer.write(e2);
            }
        }
        return z;
    }

    @Override // ax.m7.y
    public void b(OutputStream outputStream) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, f()));
        boolean z = true;
        for (Map.Entry<String, Object> entry : C2532g.g(this.c).entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                String c = C2584a.c(entry.getKey());
                Class<?> cls = value.getClass();
                if ((value instanceof Iterable) || cls.isArray()) {
                    Iterator it = C2524C.l(value).iterator();
                    while (it.hasNext()) {
                        z = h(z, bufferedWriter, c, it.next(), this.d);
                    }
                } else {
                    z = h(z, bufferedWriter, c, value, this.d);
                }
            }
        }
        bufferedWriter.flush();
    }

    public E i(Object obj) {
        this.c = ax.m7.v.d(obj);
        return this;
    }
}
