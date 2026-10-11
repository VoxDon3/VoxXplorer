/*
 * Decompiled with CFR 0.152.
 */
package ax.ke;

import ax.ke.B;
import ax.ke.E;
import ax.ke.I;
import ax.ke.o;
import ax.ke.s;
import ax.me.b;
import ax.me.c;
import ax.me.d;
import ax.me.e;
import ax.me.f;
import ax.me.g;
import ax.me.h;
import ax.me.i;
import ax.me.j;
import ax.me.k;
import ax.me.l;
import ax.me.m;
import ax.me.n;
import ax.me.p;
import ax.me.q;
import ax.me.r;
import ax.me.t;
import ax.me.u;
import ax.me.v;
import ax.me.x;
import ax.me.y;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;

final class C {
    private final Method a;
    private final HttpUrl b;
    final String c;
    private final String d;
    private final Headers e;
    private final MediaType f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final s<?>[] j;
    final boolean k;

    C(a a8) {
        this.a = a8.b;
        this.b = a8.a.c;
        this.c = a8.n;
        this.d = a8.r;
        this.e = a8.s;
        this.f = a8.t;
        this.g = a8.o;
        this.h = a8.p;
        this.i = a8.q;
        this.j = a8.v;
        this.k = a8.w;
    }

    static C b(E e8, Method method) {
        return new a(e8, method).b();
    }

    Request a(Object[] object) throws IOException {
        int n8 = ((Object[])object).length;
        s<?>[] sArray = this.j;
        if (n8 == sArray.length) {
            B b8 = new B(this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i);
            int n9 = n8;
            if (this.k) {
                n9 = n8 - 1;
            }
            ArrayList<Object> arrayList = new ArrayList<Object>(n9);
            for (n8 = 0; n8 < n9; ++n8) {
                arrayList.add(object[n8]);
                sArray[n8].a(b8, object[n8]);
            }
            return b8.k().tag(o.class, new o(this.a, arrayList)).build();
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Argument count (");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append(") doesn't match expected count (");
        ((StringBuilder)object).append(sArray.length);
        ((StringBuilder)object).append(")");
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    static final class a {
        private static final Pattern x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        private static final Pattern y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
        final E a;
        final Method b;
        final Annotation[] c;
        final Annotation[][] d;
        final Type[] e;
        boolean f;
        boolean g;
        boolean h;
        boolean i;
        boolean j;
        boolean k;
        boolean l;
        boolean m;
        String n;
        boolean o;
        boolean p;
        boolean q;
        String r;
        Headers s;
        MediaType t;
        Set<String> u;
        s<?>[] v;
        boolean w;

        a(E e8, Method method) {
            this.a = e8;
            this.b = method;
            this.c = method.getAnnotations();
            this.e = method.getGenericParameterTypes();
            this.d = method.getParameterAnnotations();
        }

        private static Class<?> a(Class<?> clazz) {
            if (Boolean.TYPE == clazz) {
                return Boolean.class;
            }
            if (Byte.TYPE == clazz) {
                return Byte.class;
            }
            if (Character.TYPE == clazz) {
                return Character.class;
            }
            if (Double.TYPE == clazz) {
                return Double.class;
            }
            if (Float.TYPE == clazz) {
                return Float.class;
            }
            if (Integer.TYPE == clazz) {
                return Integer.class;
            }
            if (Long.TYPE == clazz) {
                return Long.class;
            }
            Class<Object> clazz2 = clazz;
            if (Short.TYPE == clazz) {
                clazz2 = Short.class;
            }
            return clazz2;
        }

        private Headers c(String[] stringArray) {
            Headers.Builder builder = new Headers.Builder();
            for (String string : stringArray) {
                int n8 = string.indexOf(58);
                if (n8 != -1 && n8 != 0 && n8 != string.length() - 1) {
                    String string2 = string.substring(0, n8);
                    string = string.substring(n8 + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(string2)) {
                        try {
                            this.t = MediaType.get(string);
                            continue;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw I.n(this.b, illegalArgumentException, "Malformed content type: %s", string);
                        }
                    }
                    builder.add(string2, string);
                    continue;
                }
                throw I.m(this.b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", string);
            }
            return builder.build();
        }

        private void d(String string, String string2, boolean bl) {
            String string3 = this.n;
            if (string3 == null) {
                this.n = string;
                this.o = bl;
                if (string2.isEmpty()) {
                    return;
                }
                int n8 = string2.indexOf(63);
                if (n8 != -1 && n8 < string2.length() - 1 && x.matcher(string = string2.substring(n8 + 1)).find()) {
                    throw I.m(this.b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", string);
                }
                this.r = string2;
                this.u = ax.ke.C$a.h(string2);
                return;
            }
            throw I.m(this.b, "Only one HTTP method is allowed. Found: %s and %s.", string3, string);
        }

        private void e(Annotation stringArray) {
            if (stringArray instanceof b) {
                this.d("DELETE", ((b)stringArray).value(), false);
                return;
            }
            if (stringArray instanceof f) {
                this.d("GET", ((f)stringArray).value(), false);
                return;
            }
            if (stringArray instanceof g) {
                this.d("HEAD", ((g)stringArray).value(), false);
                return;
            }
            if (stringArray instanceof n) {
                this.d("PATCH", ((n)stringArray).value(), true);
                return;
            }
            if (stringArray instanceof ax.me.o) {
                this.d("POST", ((ax.me.o)stringArray).value(), true);
                return;
            }
            if (stringArray instanceof p) {
                this.d("PUT", ((p)stringArray).value(), true);
                return;
            }
            if (stringArray instanceof m) {
                this.d("OPTIONS", ((m)stringArray).value(), false);
                return;
            }
            if (stringArray instanceof h) {
                stringArray = (h)stringArray;
                this.d(stringArray.method(), stringArray.path(), stringArray.hasBody());
                return;
            }
            if (stringArray instanceof k) {
                if ((stringArray = ((k)stringArray).value()).length != 0) {
                    this.s = this.c(stringArray);
                    return;
                }
                throw I.m(this.b, "@Headers annotation is empty.", new Object[0]);
            }
            if (stringArray instanceof l) {
                if (!this.p) {
                    this.q = true;
                    return;
                }
                throw I.m(this.b, "Only one encoding annotation is allowed.", new Object[0]);
            }
            if (stringArray instanceof e) {
                if (!this.q) {
                    this.p = true;
                    return;
                }
                throw I.m(this.b, "Only one encoding annotation is allowed.", new Object[0]);
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private s<?> f(int n8, Type type, Annotation[] annotationArray, boolean bl) {
            s<?> s8;
            if (annotationArray == null) {
                s8 = null;
            } else {
                int n9 = annotationArray.length;
                s<?> s9 = null;
                int n10 = 0;
                while (true) {
                    s8 = s9;
                    if (n10 >= n9) break;
                    s8 = this.g(n8, type, annotationArray, annotationArray[n10]);
                    if (s8 != null) {
                        if (s9 != null) throw I.o(this.b, n8, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        s9 = s8;
                    }
                    ++n10;
                }
            }
            if (s8 != null) return s8;
            if (!bl) throw I.o(this.b, n8, "No Retrofit annotation found.", new Object[0]);
            try {
                if (I.h(type) != ax.wb.e.class) throw I.o(this.b, n8, "No Retrofit annotation found.", new Object[0]);
                this.w = true;
                return null;
            }
            catch (NoClassDefFoundError noClassDefFoundError) {
                throw I.o(this.b, n8, "No Retrofit annotation found.", new Object[0]);
            }
        }

        private s<?> g(int n8, Type object, Annotation[] object2, Annotation object3) {
            if (object3 instanceof y) {
                this.j(n8, (Type)object);
                if (!this.m) {
                    if (!this.i) {
                        if (!this.j) {
                            if (!this.k) {
                                if (!this.l) {
                                    if (this.r == null) {
                                        this.m = true;
                                        if (!(object == HttpUrl.class || object == String.class || object == URI.class || object instanceof Class && "android.net.Uri".equals(((Class)object).getName()))) {
                                            throw I.o(this.b, n8, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                        }
                                        return new s.p(this.b, n8);
                                    }
                                    throw I.o(this.b, n8, "@Url cannot be used with @%s URL", this.n);
                                }
                                throw I.o(this.b, n8, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                            }
                            throw I.o(this.b, n8, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                        }
                        throw I.o(this.b, n8, "A @Url parameter must not come after a @Query.", new Object[0]);
                    }
                    throw I.o(this.b, n8, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                throw I.o(this.b, n8, "Multiple @Url method annotations found.", new Object[0]);
            }
            if (object3 instanceof ax.me.s) {
                this.j(n8, (Type)object);
                if (!this.j) {
                    if (!this.k) {
                        if (!this.l) {
                            if (!this.m) {
                                if (this.r != null) {
                                    this.i = true;
                                    object3 = (ax.me.s)object3;
                                    String string = object3.value();
                                    this.i(n8, string);
                                    object = this.a.i((Type)object, (Annotation[])object2);
                                    return new s.k(this.b, n8, string, object, object3.encoded());
                                }
                                throw I.o(this.b, n8, "@Path can only be used with relative url on @%s", this.n);
                            }
                            throw I.o(this.b, n8, "@Path parameters may not be used with @Url.", new Object[0]);
                        }
                        throw I.o(this.b, n8, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                    }
                    throw I.o(this.b, n8, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                throw I.o(this.b, n8, "A @Path parameter must not come after a @Query.", new Object[0]);
            }
            if (object3 instanceof t) {
                this.j(n8, (Type)object);
                Object object4 = (t)object3;
                object3 = object4.value();
                boolean bl = object4.encoded();
                object4 = I.h((Type)object);
                this.j = true;
                if (Iterable.class.isAssignableFrom((Class<?>)object4)) {
                    if (object instanceof ParameterizedType) {
                        object = I.g(0, (ParameterizedType)object);
                        return new s.l((String)object3, this.a.i((Type)object, (Annotation[])object2), bl).c();
                    }
                    object = this.b;
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append(((Class)object4).getSimpleName());
                    ((StringBuilder)object2).append(" must include generic type (e.g., ");
                    ((StringBuilder)object2).append(((Class)object4).getSimpleName());
                    ((StringBuilder)object2).append("<String>)");
                    throw I.o(object, n8, ((StringBuilder)object2).toString(), new Object[0]);
                }
                if (((Class)object4).isArray()) {
                    object = ax.ke.C$a.a(((Class)object4).getComponentType());
                    return new s.l((String)object3, this.a.i((Type)object, (Annotation[])object2), bl).b();
                }
                return new s.l((String)object3, this.a.i((Type)object, (Annotation[])object2), bl);
            }
            if (object3 instanceof v) {
                this.j(n8, (Type)object);
                boolean bl = ((v)object3).encoded();
                object3 = I.h((Type)object);
                this.k = true;
                if (Iterable.class.isAssignableFrom((Class<?>)object3)) {
                    if (object instanceof ParameterizedType) {
                        object = I.g(0, (ParameterizedType)object);
                        return new s.n(this.a.i((Type)object, (Annotation[])object2), bl).c();
                    }
                    object = this.b;
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append(((Class)object3).getSimpleName());
                    ((StringBuilder)object2).append(" must include generic type (e.g., ");
                    ((StringBuilder)object2).append(((Class)object3).getSimpleName());
                    ((StringBuilder)object2).append("<String>)");
                    throw I.o(object, n8, ((StringBuilder)object2).toString(), new Object[0]);
                }
                if (((Class)object3).isArray()) {
                    object = ax.ke.C$a.a(((Class)object3).getComponentType());
                    return new s.n(this.a.i((Type)object, (Annotation[])object2), bl).b();
                }
                return new s.n(this.a.i((Type)object, (Annotation[])object2), bl);
            }
            if (object3 instanceof u) {
                this.j(n8, (Type)object);
                Type type = I.h((Type)object);
                this.l = true;
                if (Map.class.isAssignableFrom((Class<?>)type)) {
                    if ((object = I.i((Type)object, type, Map.class)) instanceof ParameterizedType) {
                        type = (ParameterizedType)object;
                        if (String.class == (object = I.g(0, type))) {
                            object = I.g(1, type);
                            object = this.a.i((Type)object, (Annotation[])object2);
                            return new s.m(this.b, n8, object, ((u)object3).encoded());
                        }
                        object3 = this.b;
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("@QueryMap keys must be of type String: ");
                        ((StringBuilder)object2).append(object);
                        throw I.o((Method)object3, n8, ((StringBuilder)object2).toString(), new Object[0]);
                    }
                    throw I.o(this.b, n8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw I.o(this.b, n8, "@QueryMap parameter type must be Map.", new Object[0]);
            }
            if (object3 instanceof i) {
                this.j(n8, (Type)object);
                String string = ((i)object3).value();
                object3 = I.h((Type)object);
                if (Iterable.class.isAssignableFrom((Class<?>)object3)) {
                    if (object instanceof ParameterizedType) {
                        object = I.g(0, (ParameterizedType)object);
                        return new s.f(string, this.a.i((Type)object, (Annotation[])object2)).c();
                    }
                    object2 = this.b;
                    object = new StringBuilder();
                    ((StringBuilder)object).append(((Class)object3).getSimpleName());
                    ((StringBuilder)object).append(" must include generic type (e.g., ");
                    ((StringBuilder)object).append(((Class)object3).getSimpleName());
                    ((StringBuilder)object).append("<String>)");
                    throw I.o((Method)object2, n8, ((StringBuilder)object).toString(), new Object[0]);
                }
                if (((Class)object3).isArray()) {
                    object = ax.ke.C$a.a(((Class)object3).getComponentType());
                    return new s.f(string, this.a.i((Type)object, (Annotation[])object2)).b();
                }
                return new s.f(string, this.a.i((Type)object, (Annotation[])object2));
            }
            if (object3 instanceof j) {
                if (object == Headers.class) {
                    return new s.h(this.b, n8);
                }
                this.j(n8, (Type)object);
                object3 = I.h((Type)object);
                if (Map.class.isAssignableFrom((Class<?>)object3)) {
                    if ((object = I.i(object, object3, Map.class)) instanceof ParameterizedType) {
                        object3 = (ParameterizedType)object;
                        if (String.class == (object = I.g(0, (ParameterizedType)object3))) {
                            object = I.g(1, (ParameterizedType)object3);
                            object = this.a.i((Type)object, (Annotation[])object2);
                            return new s.g(this.b, n8, object);
                        }
                        object3 = this.b;
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("@HeaderMap keys must be of type String: ");
                        ((StringBuilder)object2).append(object);
                        throw I.o((Method)object3, n8, ((StringBuilder)object2).toString(), new Object[0]);
                    }
                    throw I.o(this.b, n8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw I.o(this.b, n8, "@HeaderMap parameter type must be Map.", new Object[0]);
            }
            if (object3 instanceof c) {
                this.j(n8, (Type)object);
                if (this.p) {
                    Class<?> clazz = (c)object3;
                    object3 = clazz.value();
                    boolean bl = clazz.encoded();
                    this.f = true;
                    clazz = I.h((Type)object);
                    if (Iterable.class.isAssignableFrom(clazz)) {
                        if (object instanceof ParameterizedType) {
                            object = I.g(0, (ParameterizedType)object);
                            return new s.d((String)object3, this.a.i((Type)object, (Annotation[])object2), bl).c();
                        }
                        object = this.b;
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append(clazz.getSimpleName());
                        ((StringBuilder)object2).append(" must include generic type (e.g., ");
                        ((StringBuilder)object2).append(clazz.getSimpleName());
                        ((StringBuilder)object2).append("<String>)");
                        throw I.o((Method)object, n8, ((StringBuilder)object2).toString(), new Object[0]);
                    }
                    if (clazz.isArray()) {
                        object = ax.ke.C$a.a(clazz.getComponentType());
                        return new s.d((String)object3, this.a.i((Type)object, (Annotation[])object2), bl).b();
                    }
                    return new s.d((String)object3, this.a.i((Type)object, (Annotation[])object2), bl);
                }
                throw I.o(this.b, n8, "@Field parameters can only be used with form encoding.", new Object[0]);
            }
            if (object3 instanceof d) {
                this.j(n8, (Type)object);
                if (this.p) {
                    Type type = I.h((Type)object);
                    if (Map.class.isAssignableFrom((Class<?>)type)) {
                        if ((object = I.i((Type)object, type, Map.class)) instanceof ParameterizedType) {
                            type = (ParameterizedType)object;
                            if (String.class == (object = I.g(0, type))) {
                                object = I.g(1, type);
                                object = this.a.i((Type)object, (Annotation[])object2);
                                this.f = true;
                                return new s.e(this.b, n8, object, ((d)object3).encoded());
                            }
                            object2 = this.b;
                            object3 = new StringBuilder();
                            ((StringBuilder)object3).append("@FieldMap keys must be of type String: ");
                            ((StringBuilder)object3).append(object);
                            throw I.o((Method)object2, n8, ((StringBuilder)object3).toString(), new Object[0]);
                        }
                        throw I.o(this.b, n8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw I.o(this.b, n8, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw I.o(this.b, n8, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            }
            if (object3 instanceof q) {
                this.j(n8, (Type)object);
                if (this.q) {
                    q q8 = (q)object3;
                    this.g = true;
                    Object object5 = q8.value();
                    object3 = I.h(object);
                    if (((String)object5).isEmpty()) {
                        if (Iterable.class.isAssignableFrom((Class<?>)object3)) {
                            if (object instanceof ParameterizedType) {
                                if (MultipartBody.Part.class.isAssignableFrom(I.h(I.g(0, (ParameterizedType)object)))) {
                                    return s.o.a.c();
                                }
                                throw I.o(this.b, n8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                            }
                            object2 = this.b;
                            object = new StringBuilder();
                            ((StringBuilder)object).append(((Class)object3).getSimpleName());
                            ((StringBuilder)object).append(" must include generic type (e.g., ");
                            ((StringBuilder)object).append(((Class)object3).getSimpleName());
                            ((StringBuilder)object).append("<String>)");
                            throw I.o((Method)object2, n8, ((StringBuilder)object).toString(), new Object[0]);
                        }
                        if (((Class)object3).isArray()) {
                            if (MultipartBody.Part.class.isAssignableFrom(((Class)object3).getComponentType())) {
                                return s.o.a.b();
                            }
                            throw I.o(this.b, n8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                        if (MultipartBody.Part.class.isAssignableFrom((Class<?>)object3)) {
                            return s.o.a;
                        }
                        throw I.o(this.b, n8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("form-data; name=\"");
                    stringBuilder.append((String)object5);
                    stringBuilder.append("\"");
                    object5 = Headers.of("Content-Disposition", stringBuilder.toString(), "Content-Transfer-Encoding", q8.encoding());
                    if (Iterable.class.isAssignableFrom((Class<?>)object3)) {
                        if (object instanceof ParameterizedType) {
                            if (!MultipartBody.Part.class.isAssignableFrom(I.h(object = I.g(0, (ParameterizedType)object)))) {
                                object = this.a.g((Type)object, (Annotation[])object2, this.c);
                                return new s.i(this.b, n8, (Headers)object5, object).c();
                            }
                            throw I.o(this.b, n8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                        object = this.b;
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append(((Class)object3).getSimpleName());
                        ((StringBuilder)object2).append(" must include generic type (e.g., ");
                        ((StringBuilder)object2).append(((Class)object3).getSimpleName());
                        ((StringBuilder)object2).append("<String>)");
                        throw I.o(object, n8, ((StringBuilder)object2).toString(), new Object[0]);
                    }
                    if (((Class)object3).isArray()) {
                        object = ax.ke.C$a.a(((Class)object3).getComponentType());
                        if (!MultipartBody.Part.class.isAssignableFrom((Class<?>)object)) {
                            object = this.a.g((Type)object, (Annotation[])object2, this.c);
                            return new s.i(this.b, n8, (Headers)object5, object).b();
                        }
                        throw I.o(this.b, n8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    if (!MultipartBody.Part.class.isAssignableFrom((Class<?>)object3)) {
                        object = this.a.g((Type)object, (Annotation[])object2, this.c);
                        return new s.i(this.b, n8, (Headers)object5, object);
                    }
                    throw I.o(this.b, n8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                throw I.o(this.b, n8, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            if (object3 instanceof r) {
                this.j(n8, (Type)object);
                if (this.q) {
                    this.g = true;
                    Type type = I.h((Type)object);
                    if (Map.class.isAssignableFrom((Class<?>)type)) {
                        if ((object = I.i(object, type, Map.class)) instanceof ParameterizedType) {
                            type = (ParameterizedType)object;
                            if (String.class == (object = I.g(0, type))) {
                                object = I.g(1, type);
                                if (!MultipartBody.Part.class.isAssignableFrom(I.h((Type)object))) {
                                    object = this.a.g((Type)object, (Annotation[])object2, this.c);
                                    object2 = (r)object3;
                                    return new s.j(this.b, n8, object, object2.encoding());
                                }
                                throw I.o(this.b, n8, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            object2 = this.b;
                            object3 = new StringBuilder();
                            ((StringBuilder)object3).append("@PartMap keys must be of type String: ");
                            ((StringBuilder)object3).append(object);
                            throw I.o((Method)object2, n8, ((StringBuilder)object3).toString(), new Object[0]);
                        }
                        throw I.o(this.b, n8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw I.o(this.b, n8, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw I.o(this.b, n8, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            }
            if (object3 instanceof ax.me.a) {
                this.j(n8, (Type)object);
                if (!this.p && !this.q) {
                    if (!this.h) {
                        try {
                            object2 = this.a.g((Type)object, (Annotation[])object2, this.c);
                            this.h = true;
                        }
                        catch (RuntimeException runtimeException) {
                            throw I.p(this.b, runtimeException, n8, "Unable to create @Body converter for %s", object);
                        }
                        return new s.c(this.b, n8, object2);
                    }
                    throw I.o(this.b, n8, "Multiple @Body method annotations found.", new Object[0]);
                }
                throw I.o(this.b, n8, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
            }
            if (object3 instanceof x) {
                this.j(n8, (Type)object);
                object = I.h((Type)object);
                for (int i8 = n8 - 1; i8 >= 0; --i8) {
                    object2 = this.v[i8];
                    if (!(object2 instanceof s.q) || !((s.q)object2).a.equals(object)) continue;
                    object2 = this.b;
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append("@Tag type ");
                    ((StringBuilder)object3).append(((Class)object).getName());
                    ((StringBuilder)object3).append(" is duplicate of parameter #");
                    ((StringBuilder)object3).append(i8 + 1);
                    ((StringBuilder)object3).append(" and would always overwrite its value.");
                    throw I.o((Method)object2, n8, ((StringBuilder)object3).toString(), new Object[0]);
                }
                return new s.q((Class<?>)object);
            }
            return null;
        }

        static Set<String> h(String object) {
            Matcher matcher = x.matcher((CharSequence)object);
            object = new LinkedHashSet();
            while (matcher.find()) {
                object.add(matcher.group(1));
            }
            return object;
        }

        private void i(int n8, String string) {
            if (y.matcher(string).matches()) {
                if (this.u.contains(string)) {
                    return;
                }
                throw I.o(this.b, n8, "URL \"%s\" does not contain \"{%s}\".", this.r, string);
            }
            throw I.o(this.b, n8, "@Path parameter name must match %s. Found: %s", x.pattern(), string);
        }

        private void j(int n8, Type type) {
            if (!I.j(type)) {
                return;
            }
            throw I.o(this.b, n8, "Parameter type must not include a type variable or wildcard: %s", type);
        }

        C b() {
            int n8;
            Object object = this.c;
            int n9 = ((Annotation[])object).length;
            for (n8 = 0; n8 < n9; ++n8) {
                this.e(object[n8]);
            }
            if (this.n != null) {
                boolean bl;
                if (!this.o) {
                    if (!this.q) {
                        if (this.p) {
                            throw I.m(this.b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                        }
                    } else {
                        throw I.m(this.b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                n9 = this.d.length;
                this.v = new s[n9];
                for (n8 = 0; n8 < n9; ++n8) {
                    s<?>[] sArray = this.v;
                    object = this.e[n8];
                    Annotation[] annotationArray = this.d[n8];
                    bl = n8 == n9 - 1;
                    sArray[n8] = this.f(n8, (Type)object, annotationArray, bl);
                }
                if (this.r == null && !this.m) {
                    throw I.m(this.b, "Missing either @%s URL or @Url parameter.", this.n);
                }
                bl = this.p;
                if (!bl && !this.q && !this.o && this.h) {
                    throw I.m(this.b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (bl && !this.f) {
                    throw I.m(this.b, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (this.q && !this.g) {
                    throw I.m(this.b, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                return new C(this);
            }
            throw I.m(this.b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
        }
    }
}

