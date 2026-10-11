/*
 * Decompiled with CFR 0.152.
 */
package ax.i7;

import ax.i7.o;
import ax.m7.B;
import ax.m7.C;
import ax.m7.b;
import ax.m7.f;
import ax.m7.g;
import ax.m7.j;
import ax.m7.k;
import ax.m7.t;
import ax.n7.a;
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

public class F
implements t {
    public static final String a = new o("application/x-www-form-urlencoded").l(StandardCharsets.UTF_8).a();

    public static void b(Reader reader, Object object, boolean bl) throws IOException {
        int n8;
        Map map = object.getClass();
        f f8 = f.e(map);
        List<Type> list = Arrays.asList(map);
        k k8 = k.class.isAssignableFrom((Class<?>)((Object)map)) ? (k)object : null;
        map = Map.class.isAssignableFrom((Class<?>)((Object)map)) ? (Map)object : null;
        b b8 = new b(object);
        Object object2 = new StringWriter();
        Object object3 = new StringWriter();
        do {
            boolean bl2 = true;
            while ((n8 = reader.read()) != -1 && n8 != 38) {
                if (n8 != 61) {
                    if (bl2) {
                        ((StringWriter)object2).write(n8);
                        continue;
                    }
                    ((StringWriter)object3).write(n8);
                    continue;
                }
                if (bl2) {
                    bl2 = false;
                    continue;
                }
                ((StringWriter)object3).write(n8);
            }
            object2 = bl ? ax.n7.a.a(((StringWriter)object2).toString()) : ((StringWriter)object2).toString();
            if (((String)object2).length() != 0) {
                Object object4;
                object3 = bl ? ax.n7.a.a(((StringWriter)object3).toString()) : ((StringWriter)object3).toString();
                Object object5 = f8.b((String)object2);
                if (object5 != null) {
                    Type type = g.l(list, ((j)object5).d());
                    if (C.j(type)) {
                        object2 = C.f(list, C.b(type));
                        b8.a(((j)object5).b(), (Class<?>)object2, F.e(object2, list, (String)object3));
                    } else if (C.k(C.f(list, type), Iterable.class)) {
                        object4 = (Collection)((j)object5).g(object);
                        object2 = object4;
                        if (object4 == null) {
                            object2 = g.h(type);
                            ((j)object5).m(object, object2);
                        }
                        object4 = type == Object.class ? null : C.d(type);
                        object2.add((Object)F.e((Type)object4, list, (String)object3));
                    } else {
                        ((j)object5).m(object, F.e(type, list, (String)object3));
                    }
                } else if (map != null) {
                    object5 = (ArrayList)map.get(object2);
                    object4 = object5;
                    if (object5 == null) {
                        object4 = new ArrayList<Object>();
                        if (k8 != null) {
                            k8.f((String)object2, object4);
                        } else {
                            map.put(object2, object4);
                        }
                    }
                    ((ArrayList)object4).add(object3);
                }
            }
            object2 = new StringWriter();
            object3 = new StringWriter();
        } while (n8 != -1);
        b8.b();
    }

    public static void c(String string, Object object) {
        F.d(string, object, true);
    }

    public static void d(String string, Object object, boolean bl) {
        if (string == null) {
            return;
        }
        try {
            StringReader stringReader = new StringReader(string);
            F.b(stringReader, object, bl);
            return;
        }
        catch (IOException iOException) {
            throw B.a(iOException);
        }
    }

    private static Object e(Type type, List<Type> list, String string) {
        return g.k(g.l(list, type), string);
    }
}

