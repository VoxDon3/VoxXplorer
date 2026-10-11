package ax.ke;

import ax.ke.s;
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

/* loaded from: classes3.dex */
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

        a(E e, Method method) {
            this.a = e;
            this.b = method;
            this.c = method.getAnnotations();
            this.e = method.getGenericParameterTypes();
            this.d = method.getParameterAnnotations();
        }

        private static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        private Headers c(String[] strArr) {
            Headers.Builder builder = new Headers.Builder();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw I.m(this.b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        this.t = MediaType.get(trim);
                    } catch (IllegalArgumentException e) {
                        throw I.n(this.b, e, "Malformed content type: %s", trim);
                    }
                } else {
                    builder.add(substring, trim);
                }
            }
            return builder.build();
        }

        private void d(String str, String str2, boolean z) {
            String str3 = this.n;
            if (str3 != null) {
                throw I.m(this.b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.n = str;
            this.o = z;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (x.matcher(substring).find()) {
                    throw I.m(this.b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.r = str2;
            this.u = h(str2);
        }

        private void e(Annotation annotation) {
            if (annotation instanceof ax.me.b) {
                d("DELETE", ((ax.me.b) annotation).value(), false);
                return;
            }
            if (annotation instanceof ax.me.f) {
                d("GET", ((ax.me.f) annotation).value(), false);
                return;
            }
            if (annotation instanceof ax.me.g) {
                d("HEAD", ((ax.me.g) annotation).value(), false);
                return;
            }
            if (annotation instanceof ax.me.n) {
                d("PATCH", ((ax.me.n) annotation).value(), true);
                return;
            }
            if (annotation instanceof ax.me.o) {
                d("POST", ((ax.me.o) annotation).value(), true);
                return;
            }
            if (annotation instanceof ax.me.p) {
                d("PUT", ((ax.me.p) annotation).value(), true);
                return;
            }
            if (annotation instanceof ax.me.m) {
                d("OPTIONS", ((ax.me.m) annotation).value(), false);
                return;
            }
            if (annotation instanceof ax.me.h) {
                ax.me.h hVar = (ax.me.h) annotation;
                d(hVar.method(), hVar.path(), hVar.hasBody());
                return;
            }
            if (annotation instanceof ax.me.k) {
                String[] value = ((ax.me.k) annotation).value();
                if (value.length == 0) {
                    throw I.m(this.b, "@Headers annotation is empty.", new Object[0]);
                }
                this.s = c(value);
                return;
            }
            if (annotation instanceof ax.me.l) {
                if (this.p) {
                    throw I.m(this.b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.q = true;
            } else if (annotation instanceof ax.me.e) {
                if (this.q) {
                    throw I.m(this.b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.p = true;
            }
        }

        private s<?> f(int i, Type type, Annotation[] annotationArr, boolean z) {
            s<?> sVar;
            if (annotationArr != null) {
                sVar = null;
                for (Annotation annotation : annotationArr) {
                    s<?> g = g(i, type, annotationArr, annotation);
                    if (g != null) {
                        if (sVar != null) {
                            throw I.o(this.b, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        sVar = g;
                    }
                }
            } else {
                sVar = null;
            }
            if (sVar != null) {
                return sVar;
            }
            if (z) {
                try {
                    if (I.h(type) == ax.wb.e.class) {
                        this.w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw I.o(this.b, i, "No Retrofit annotation found.", new Object[0]);
        }

        private s<?> g(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof ax.me.y) {
                j(i, type);
                if (this.m) {
                    throw I.o(this.b, i, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.i) {
                    throw I.o(this.b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.j) {
                    throw I.o(this.b, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.k) {
                    throw I.o(this.b, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.l) {
                    throw I.o(this.b, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.r != null) {
                    throw I.o(this.b, i, "@Url cannot be used with @%s URL", this.n);
                }
                this.m = true;
                if (type == HttpUrl.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new s.p(this.b, i);
                }
                throw I.o(this.b, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof ax.me.s) {
                j(i, type);
                if (this.j) {
                    throw I.o(this.b, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.k) {
                    throw I.o(this.b, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.l) {
                    throw I.o(this.b, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.m) {
                    throw I.o(this.b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.r == null) {
                    throw I.o(this.b, i, "@Path can only be used with relative url on @%s", this.n);
                }
                this.i = true;
                ax.me.s sVar = (ax.me.s) annotation;
                String value = sVar.value();
                i(i, value);
                return new s.k(this.b, i, value, this.a.i(type, annotationArr), sVar.encoded());
            }
            if (annotation instanceof ax.me.t) {
                j(i, type);
                ax.me.t tVar = (ax.me.t) annotation;
                String value2 = tVar.value();
                boolean encoded = tVar.encoded();
                Class<?> h = I.h(type);
                this.j = true;
                if (!Iterable.class.isAssignableFrom(h)) {
                    return h.isArray() ? new s.l(value2, this.a.i(a(h.getComponentType()), annotationArr), encoded).b() : new s.l(value2, this.a.i(type, annotationArr), encoded);
                }
                if (type instanceof ParameterizedType) {
                    return new s.l(value2, this.a.i(I.g(0, (ParameterizedType) type), annotationArr), encoded).c();
                }
                throw I.o(this.b, i, h.getSimpleName() + " must include generic type (e.g., " + h.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof ax.me.v) {
                j(i, type);
                boolean encoded2 = ((ax.me.v) annotation).encoded();
                Class<?> h2 = I.h(type);
                this.k = true;
                if (!Iterable.class.isAssignableFrom(h2)) {
                    return h2.isArray() ? new s.n(this.a.i(a(h2.getComponentType()), annotationArr), encoded2).b() : new s.n(this.a.i(type, annotationArr), encoded2);
                }
                if (type instanceof ParameterizedType) {
                    return new s.n(this.a.i(I.g(0, (ParameterizedType) type), annotationArr), encoded2).c();
                }
                throw I.o(this.b, i, h2.getSimpleName() + " must include generic type (e.g., " + h2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof ax.me.u) {
                j(i, type);
                Class<?> h3 = I.h(type);
                this.l = true;
                if (!Map.class.isAssignableFrom(h3)) {
                    throw I.o(this.b, i, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type i2 = I.i(type, h3, Map.class);
                if (!(i2 instanceof ParameterizedType)) {
                    throw I.o(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) i2;
                Type g = I.g(0, parameterizedType);
                if (String.class == g) {
                    return new s.m(this.b, i, this.a.i(I.g(1, parameterizedType), annotationArr), ((ax.me.u) annotation).encoded());
                }
                throw I.o(this.b, i, "@QueryMap keys must be of type String: " + g, new Object[0]);
            }
            if (annotation instanceof ax.me.i) {
                j(i, type);
                String value3 = ((ax.me.i) annotation).value();
                Class<?> h4 = I.h(type);
                if (!Iterable.class.isAssignableFrom(h4)) {
                    return h4.isArray() ? new s.f(value3, this.a.i(a(h4.getComponentType()), annotationArr)).b() : new s.f(value3, this.a.i(type, annotationArr));
                }
                if (type instanceof ParameterizedType) {
                    return new s.f(value3, this.a.i(I.g(0, (ParameterizedType) type), annotationArr)).c();
                }
                throw I.o(this.b, i, h4.getSimpleName() + " must include generic type (e.g., " + h4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof ax.me.j) {
                if (type == Headers.class) {
                    return new s.h(this.b, i);
                }
                j(i, type);
                Class<?> h5 = I.h(type);
                if (!Map.class.isAssignableFrom(h5)) {
                    throw I.o(this.b, i, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type i3 = I.i(type, h5, Map.class);
                if (!(i3 instanceof ParameterizedType)) {
                    throw I.o(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) i3;
                Type g2 = I.g(0, parameterizedType2);
                if (String.class == g2) {
                    return new s.g(this.b, i, this.a.i(I.g(1, parameterizedType2), annotationArr));
                }
                throw I.o(this.b, i, "@HeaderMap keys must be of type String: " + g2, new Object[0]);
            }
            if (annotation instanceof ax.me.c) {
                j(i, type);
                if (!this.p) {
                    throw I.o(this.b, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                ax.me.c cVar = (ax.me.c) annotation;
                String value4 = cVar.value();
                boolean encoded3 = cVar.encoded();
                this.f = true;
                Class<?> h6 = I.h(type);
                if (!Iterable.class.isAssignableFrom(h6)) {
                    return h6.isArray() ? new s.d(value4, this.a.i(a(h6.getComponentType()), annotationArr), encoded3).b() : new s.d(value4, this.a.i(type, annotationArr), encoded3);
                }
                if (type instanceof ParameterizedType) {
                    return new s.d(value4, this.a.i(I.g(0, (ParameterizedType) type), annotationArr), encoded3).c();
                }
                throw I.o(this.b, i, h6.getSimpleName() + " must include generic type (e.g., " + h6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof ax.me.d) {
                j(i, type);
                if (!this.p) {
                    throw I.o(this.b, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> h7 = I.h(type);
                if (!Map.class.isAssignableFrom(h7)) {
                    throw I.o(this.b, i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type i4 = I.i(type, h7, Map.class);
                if (!(i4 instanceof ParameterizedType)) {
                    throw I.o(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) i4;
                Type g3 = I.g(0, parameterizedType3);
                if (String.class == g3) {
                    InterfaceC2437i i5 = this.a.i(I.g(1, parameterizedType3), annotationArr);
                    this.f = true;
                    return new s.e(this.b, i, i5, ((ax.me.d) annotation).encoded());
                }
                throw I.o(this.b, i, "@FieldMap keys must be of type String: " + g3, new Object[0]);
            }
            if (annotation instanceof ax.me.q) {
                j(i, type);
                if (!this.q) {
                    throw I.o(this.b, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
                ax.me.q qVar = (ax.me.q) annotation;
                this.g = true;
                String value5 = qVar.value();
                Class<?> h8 = I.h(type);
                if (value5.isEmpty()) {
                    if (!Iterable.class.isAssignableFrom(h8)) {
                        if (h8.isArray()) {
                            if (MultipartBody.Part.class.isAssignableFrom(h8.getComponentType())) {
                                return s.o.a.b();
                            }
                            throw I.o(this.b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                        if (MultipartBody.Part.class.isAssignableFrom(h8)) {
                            return s.o.a;
                        }
                        throw I.o(this.b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (type instanceof ParameterizedType) {
                        if (MultipartBody.Part.class.isAssignableFrom(I.h(I.g(0, (ParameterizedType) type)))) {
                            return s.o.a.c();
                        }
                        throw I.o(this.b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    throw I.o(this.b, i, h8.getSimpleName() + " must include generic type (e.g., " + h8.getSimpleName() + "<String>)", new Object[0]);
                }
                Headers of = Headers.of("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", qVar.encoding());
                if (!Iterable.class.isAssignableFrom(h8)) {
                    if (!h8.isArray()) {
                        if (MultipartBody.Part.class.isAssignableFrom(h8)) {
                            throw I.o(this.b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                        return new s.i(this.b, i, of, this.a.g(type, annotationArr, this.c));
                    }
                    Class<?> a = a(h8.getComponentType());
                    if (MultipartBody.Part.class.isAssignableFrom(a)) {
                        throw I.o(this.b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new s.i(this.b, i, of, this.a.g(a, annotationArr, this.c)).b();
                }
                if (type instanceof ParameterizedType) {
                    Type g4 = I.g(0, (ParameterizedType) type);
                    if (MultipartBody.Part.class.isAssignableFrom(I.h(g4))) {
                        throw I.o(this.b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new s.i(this.b, i, of, this.a.g(g4, annotationArr, this.c)).c();
                }
                throw I.o(this.b, i, h8.getSimpleName() + " must include generic type (e.g., " + h8.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof ax.me.r) {
                j(i, type);
                if (!this.q) {
                    throw I.o(this.b, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                }
                this.g = true;
                Class<?> h9 = I.h(type);
                if (!Map.class.isAssignableFrom(h9)) {
                    throw I.o(this.b, i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                Type i6 = I.i(type, h9, Map.class);
                if (!(i6 instanceof ParameterizedType)) {
                    throw I.o(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType4 = (ParameterizedType) i6;
                Type g5 = I.g(0, parameterizedType4);
                if (String.class == g5) {
                    Type g6 = I.g(1, parameterizedType4);
                    if (MultipartBody.Part.class.isAssignableFrom(I.h(g6))) {
                        throw I.o(this.b, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                    }
                    return new s.j(this.b, i, this.a.g(g6, annotationArr, this.c), ((ax.me.r) annotation).encoding());
                }
                throw I.o(this.b, i, "@PartMap keys must be of type String: " + g5, new Object[0]);
            }
            if (annotation instanceof ax.me.a) {
                j(i, type);
                if (this.p || this.q) {
                    throw I.o(this.b, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                }
                if (this.h) {
                    throw I.o(this.b, i, "Multiple @Body method annotations found.", new Object[0]);
                }
                try {
                    InterfaceC2437i g7 = this.a.g(type, annotationArr, this.c);
                    this.h = true;
                    return new s.c(this.b, i, g7);
                } catch (RuntimeException e) {
                    throw I.p(this.b, e, i, "Unable to create @Body converter for %s", type);
                }
            }
            if (!(annotation instanceof ax.me.x)) {
                return null;
            }
            j(i, type);
            Class<?> h10 = I.h(type);
            for (int i7 = i - 1; i7 >= 0; i7--) {
                s<?> sVar2 = this.v[i7];
                if ((sVar2 instanceof s.q) && ((s.q) sVar2).a.equals(h10)) {
                    throw I.o(this.b, i, "@Tag type " + h10.getName() + " is duplicate of parameter #" + (i7 + 1) + " and would always overwrite its value.", new Object[0]);
                }
            }
            return new s.q(h10);
        }

        static Set<String> h(String str) {
            Matcher matcher = x.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private void i(int i, String str) {
            if (!y.matcher(str).matches()) {
                throw I.o(this.b, i, "@Path parameter name must match %s. Found: %s", x.pattern(), str);
            }
            if (!this.u.contains(str)) {
                throw I.o(this.b, i, "URL \"%s\" does not contain \"{%s}\".", this.r, str);
            }
        }

        private void j(int i, Type type) {
            if (I.j(type)) {
                throw I.o(this.b, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        C b() {
            for (Annotation annotation : this.c) {
                e(annotation);
            }
            if (this.n == null) {
                throw I.m(this.b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.o) {
                if (this.q) {
                    throw I.m(this.b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.p) {
                    throw I.m(this.b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.d.length;
            this.v = new s[length];
            int i = length - 1;
            int i2 = 0;
            while (i2 < length) {
                this.v[i2] = f(i2, this.e[i2], this.d[i2], i2 == i);
                i2++;
            }
            if (this.r == null && !this.m) {
                throw I.m(this.b, "Missing either @%s URL or @Url parameter.", this.n);
            }
            boolean z = this.p;
            if (!z && !this.q && !this.o && this.h) {
                throw I.m(this.b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z && !this.f) {
                throw I.m(this.b, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.q || this.g) {
                return new C(this);
            }
            throw I.m(this.b, "Multipart method must contain at least one @Part.", new Object[0]);
        }
    }

    C(a aVar) {
        this.a = aVar.b;
        this.b = aVar.a.c;
        this.c = aVar.n;
        this.d = aVar.r;
        this.e = aVar.s;
        this.f = aVar.t;
        this.g = aVar.o;
        this.h = aVar.p;
        this.i = aVar.q;
        this.j = aVar.v;
        this.k = aVar.w;
    }

    static C b(E e, Method method) {
        return new a(e, method).b();
    }

    Request a(Object[] objArr) throws IOException {
        s<?>[] sVarArr = this.j;
        int length = objArr.length;
        if (length != sVarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + sVarArr.length + ")");
        }
        B b = new B(this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i);
        if (this.k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            sVarArr[i].a(b, objArr[i]);
        }
        return b.k().tag(o.class, new o(this.a, arrayList)).build();
    }
}
