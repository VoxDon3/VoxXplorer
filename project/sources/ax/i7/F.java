package ax.i7;

import ax.m7.C2523B;
import ax.m7.C2524C;
import ax.m7.C2527b;
import ax.m7.C2531f;
import ax.m7.C2532g;
import ax.m7.C2535j;
import ax.n7.C2584a;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class F implements ax.m7.t {
    public static final String a = new o("application/x-www-form-urlencoded").l(StandardCharsets.UTF_8).a();

    public static void b(Reader reader, Object obj, boolean z) throws IOException {
        int read;
        Class<?> cls = obj.getClass();
        C2531f e = C2531f.e(cls);
        List asList = Arrays.asList(cls);
        ax.m7.k kVar = ax.m7.k.class.isAssignableFrom(cls) ? (ax.m7.k) obj : null;
        Map map = Map.class.isAssignableFrom(cls) ? (Map) obj : null;
        C2527b c2527b = new C2527b(obj);
        StringWriter stringWriter = new StringWriter();
        StringWriter stringWriter2 = new StringWriter();
        do {
            boolean z2 = true;
            while (true) {
                read = reader.read();
                if (read == -1 || read == 38) {
                    break;
                }
                if (read != 61) {
                    if (z2) {
                        stringWriter.write(read);
                    } else {
                        stringWriter2.write(read);
                    }
                } else if (z2) {
                    z2 = false;
                } else {
                    stringWriter2.write(read);
                }
            }
            String a2 = z ? C2584a.a(stringWriter.toString()) : stringWriter.toString();
            if (a2.length() != 0) {
                String a3 = z ? C2584a.a(stringWriter2.toString()) : stringWriter2.toString();
                C2535j b = e.b(a2);
                if (b != null) {
                    Type l = C2532g.l(asList, b.d());
                    if (C2524C.j(l)) {
                        Class<?> f = C2524C.f(asList, C2524C.b(l));
                        c2527b.a(b.b(), f, e(f, asList, a3));
                    } else if (C2524C.k(C2524C.f(asList, l), Iterable.class)) {
                        Collection<Object> collection = (Collection) b.g(obj);
                        if (collection == null) {
                            collection = C2532g.h(l);
                            b.m(obj, collection);
                        }
                        collection.add(e(l == Object.class ? null : C2524C.d(l), asList, a3));
                    } else {
                        b.m(obj, e(l, asList, a3));
                    }
                } else if (map != null) {
                    ArrayList arrayList = (ArrayList) map.get(a2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        if (kVar != null) {
                            kVar.f(a2, arrayList);
                        } else {
                            map.put(a2, arrayList);
                        }
                    }
                    arrayList.add(a3);
                }
            }
            stringWriter = new StringWriter();
            stringWriter2 = new StringWriter();
        } while (read != -1);
        c2527b.b();
    }

    public static void c(String str, Object obj) {
        d(str, obj, true);
    }

    public static void d(String str, Object obj, boolean z) {
        if (str == null) {
            return;
        }
        try {
            b(new StringReader(str), obj, z);
        } catch (IOException e) {
            throw C2523B.a(e);
        }
    }

    private static Object e(Type type, List<Type> list, String str) {
        return C2532g.k(C2532g.l(list, type), str);
    }
}
