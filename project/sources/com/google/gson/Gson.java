package com.google.gson;

import ax.r8.AbstractC3000i;
import ax.r8.C3001j;
import ax.r8.C3002k;
import ax.r8.C3009r;
import ax.r8.EnumC2994c;
import ax.r8.EnumC3010s;
import ax.r8.EnumC3012u;
import ax.r8.InterfaceC2995d;
import ax.r8.InterfaceC2996e;
import ax.r8.InterfaceC3011t;
import ax.r8.InterfaceC3013v;
import ax.r8.InterfaceC3014w;
import ax.t8.c;
import ax.t8.f;
import ax.t8.j;
import ax.t8.l;
import ax.u8.C3220a;
import ax.x8.C3475a;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes3.dex */
public final class Gson {
    static final InterfaceC2995d A = EnumC2994c.q;
    static final InterfaceC3013v B = EnumC3012u.q;
    static final InterfaceC3013v C = EnumC3012u.c0;
    private static final C3475a<?> D = C3475a.a(Object.class);
    static final String z = null;
    private final ThreadLocal<Map<C3475a<?>, FutureTypeAdapter<?>>> a;
    private final Map<C3475a<?>, TypeAdapter<?>> b;
    private final c c;
    private final JsonAdapterAnnotationTypeAdapterFactory d;
    final List<InterfaceC3014w> e;
    final Excluder f;
    final InterfaceC2995d g;
    final Map<Type, InterfaceC2996e<?>> h;
    final boolean i;
    final boolean j;
    final boolean k;
    final boolean l;
    final boolean m;
    final boolean n;
    final boolean o;
    final boolean p;
    final String q;
    final int r;
    final int s;
    final EnumC3010s t;
    final List<InterfaceC3014w> u;
    final List<InterfaceC3014w> v;
    final InterfaceC3013v w;
    final InterfaceC3013v x;
    final List<InterfaceC3011t> y;

    static class FutureTypeAdapter<T> extends TypeAdapter<T> {
        private TypeAdapter<T> a;

        FutureTypeAdapter() {
        }

        @Override // com.google.gson.TypeAdapter
        public T c(JsonReader jsonReader) throws IOException {
            TypeAdapter<T> typeAdapter = this.a;
            if (typeAdapter != null) {
                return typeAdapter.c(jsonReader);
            }
            throw new IllegalStateException();
        }

        @Override // com.google.gson.TypeAdapter
        public void e(JsonWriter jsonWriter, T t) throws IOException {
            TypeAdapter<T> typeAdapter = this.a;
            if (typeAdapter == null) {
                throw new IllegalStateException();
            }
            typeAdapter.e(jsonWriter, t);
        }

        public void f(TypeAdapter<T> typeAdapter) {
            if (this.a != null) {
                throw new AssertionError();
            }
            this.a = typeAdapter;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Gson() {
        /*
            r22 = this;
            com.google.gson.internal.Excluder r1 = com.google.gson.internal.Excluder.h0
            ax.r8.d r2 = com.google.gson.Gson.A
            java.util.Map r3 = java.util.Collections.EMPTY_MAP
            ax.r8.s r12 = ax.r8.EnumC3010s.q
            java.lang.String r13 = com.google.gson.Gson.z
            java.util.List r16 = java.util.Collections.EMPTY_LIST
            ax.r8.v r19 = com.google.gson.Gson.B
            ax.r8.v r20 = com.google.gson.Gson.C
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 1
            r14 = 2
            r15 = 2
            r17 = r16
            r18 = r16
            r21 = r16
            r0 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.Gson.<init>():void");
    }

    private static void a(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() == JsonToken.END_DOCUMENT) {
                } else {
                    throw new C3009r("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new C3009r(e);
            } catch (IOException e2) {
                throw new C3001j(e2);
            }
        }
    }

    private static TypeAdapter<AtomicLong> b(final TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter<AtomicLong>() { // from class: com.google.gson.Gson.4
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public AtomicLong c(JsonReader jsonReader) throws IOException {
                return new AtomicLong(((Number) TypeAdapter.this.c(jsonReader)).longValue());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, AtomicLong atomicLong) throws IOException {
                TypeAdapter.this.e(jsonWriter, Long.valueOf(atomicLong.get()));
            }
        }.b();
    }

    private static TypeAdapter<AtomicLongArray> c(final TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter<AtomicLongArray>() { // from class: com.google.gson.Gson.5
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public AtomicLongArray c(JsonReader jsonReader) throws IOException {
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) TypeAdapter.this.c(jsonReader)).longValue()));
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
                jsonWriter.beginArray();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    TypeAdapter.this.e(jsonWriter, Long.valueOf(atomicLongArray.get(i)));
                }
                jsonWriter.endArray();
            }
        }.b();
    }

    static void d(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private TypeAdapter<Number> e(boolean z2) {
        return z2 ? TypeAdapters.v : new TypeAdapter<Number>() { // from class: com.google.gson.Gson.1
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public Double c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Double.valueOf(jsonReader.nextDouble());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    Gson.d(number.doubleValue());
                    jsonWriter.value(number);
                }
            }
        };
    }

    private TypeAdapter<Number> f(boolean z2) {
        return z2 ? TypeAdapters.u : new TypeAdapter<Number>() { // from class: com.google.gson.Gson.2
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public Float c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Float.valueOf((float) jsonReader.nextDouble());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    Gson.d(number.floatValue());
                    jsonWriter.value(number);
                }
            }
        };
    }

    private static TypeAdapter<Number> p(EnumC3010s enumC3010s) {
        return enumC3010s == EnumC3010s.q ? TypeAdapters.t : new TypeAdapter<Number>() { // from class: com.google.gson.Gson.3
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public Number c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Long.valueOf(jsonReader.nextLong());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.toString());
                }
            }
        };
    }

    public AbstractC3000i A(Object obj, Type type) {
        C3220a c3220a = new C3220a();
        x(obj, type, c3220a);
        return c3220a.a();
    }

    public <T> T g(AbstractC3000i abstractC3000i, Type type) throws C3009r {
        if (abstractC3000i == null) {
            return null;
        }
        return (T) h(new com.google.gson.internal.bind.a(abstractC3000i), type);
    }

    public <T> T h(JsonReader jsonReader, Type type) throws C3001j, C3009r {
        boolean isLenient = jsonReader.isLenient();
        boolean z2 = true;
        jsonReader.setLenient(true);
        try {
            try {
                try {
                    jsonReader.peek();
                    z2 = false;
                    return m(C3475a.b(type)).c(jsonReader);
                } catch (EOFException e) {
                    if (!z2) {
                        throw new C3009r(e);
                    }
                    jsonReader.setLenient(isLenient);
                    return null;
                } catch (IllegalStateException e2) {
                    throw new C3009r(e2);
                }
            } catch (IOException e3) {
                throw new C3009r(e3);
            } catch (AssertionError e4) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.1): " + e4.getMessage());
                assertionError.initCause(e4);
                throw assertionError;
            }
        } finally {
            jsonReader.setLenient(isLenient);
        }
    }

    public <T> T i(Reader reader, Class<T> cls) throws C3009r, C3001j {
        JsonReader q = q(reader);
        Object h = h(q, cls);
        a(h, q);
        return (T) j.b(cls).cast(h);
    }

    public <T> T j(Reader reader, Type type) throws C3001j, C3009r {
        JsonReader q = q(reader);
        T t = (T) h(q, type);
        a(t, q);
        return t;
    }

    public <T> T k(String str, Class<T> cls) throws C3009r {
        return (T) j.b(cls).cast(l(str, cls));
    }

    public <T> T l(String str, Type type) throws C3009r {
        if (str == null) {
            return null;
        }
        return (T) j(new StringReader(str), type);
    }

    public <T> TypeAdapter<T> m(C3475a<T> c3475a) {
        boolean z2;
        TypeAdapter<T> typeAdapter = (TypeAdapter) this.b.get(c3475a == null ? D : c3475a);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        Map<C3475a<?>, FutureTypeAdapter<?>> map = this.a.get();
        if (map == null) {
            map = new HashMap<>();
            this.a.set(map);
            z2 = true;
        } else {
            z2 = false;
        }
        FutureTypeAdapter<?> futureTypeAdapter = map.get(c3475a);
        if (futureTypeAdapter != null) {
            return futureTypeAdapter;
        }
        try {
            FutureTypeAdapter<?> futureTypeAdapter2 = new FutureTypeAdapter<>();
            map.put(c3475a, futureTypeAdapter2);
            Iterator<InterfaceC3014w> it = this.e.iterator();
            while (it.hasNext()) {
                TypeAdapter<T> b = it.next().b(this, c3475a);
                if (b != null) {
                    futureTypeAdapter2.f(b);
                    this.b.put(c3475a, b);
                    return b;
                }
            }
            throw new IllegalArgumentException("GSON (2.9.1) cannot handle " + c3475a);
        } finally {
            map.remove(c3475a);
            if (z2) {
                this.a.remove();
            }
        }
    }

    public <T> TypeAdapter<T> n(Class<T> cls) {
        return m(C3475a.a(cls));
    }

    public <T> TypeAdapter<T> o(InterfaceC3014w interfaceC3014w, C3475a<T> c3475a) {
        if (!this.e.contains(interfaceC3014w)) {
            interfaceC3014w = this.d;
        }
        boolean z2 = false;
        for (InterfaceC3014w interfaceC3014w2 : this.e) {
            if (z2) {
                TypeAdapter<T> b = interfaceC3014w2.b(this, c3475a);
                if (b != null) {
                    return b;
                }
            } else if (interfaceC3014w2 == interfaceC3014w) {
                z2 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + c3475a);
    }

    public JsonReader q(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        jsonReader.setLenient(this.n);
        return jsonReader;
    }

    public JsonWriter r(Writer writer) throws IOException {
        if (this.k) {
            writer.write(")]}'\n");
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.m) {
            jsonWriter.setIndent("  ");
        }
        jsonWriter.setHtmlSafe(this.l);
        jsonWriter.setLenient(this.n);
        jsonWriter.setSerializeNulls(this.i);
        return jsonWriter;
    }

    public String s(AbstractC3000i abstractC3000i) {
        StringWriter stringWriter = new StringWriter();
        w(abstractC3000i, stringWriter);
        return stringWriter.toString();
    }

    public String t(Object obj) {
        return obj == null ? s(C3002k.q) : u(obj, obj.getClass());
    }

    public String toString() {
        return "{serializeNulls:" + this.i + ",factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }

    public String u(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        y(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void v(AbstractC3000i abstractC3000i, JsonWriter jsonWriter) throws C3001j {
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.l);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.i);
        try {
            try {
                l.b(abstractC3000i, jsonWriter);
            } catch (IOException e) {
                throw new C3001j(e);
            } catch (AssertionError e2) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.1): " + e2.getMessage());
                assertionError.initCause(e2);
                throw assertionError;
            }
        } finally {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public void w(AbstractC3000i abstractC3000i, Appendable appendable) throws C3001j {
        try {
            v(abstractC3000i, r(l.c(appendable)));
        } catch (IOException e) {
            throw new C3001j(e);
        }
    }

    public void x(Object obj, Type type, JsonWriter jsonWriter) throws C3001j {
        TypeAdapter m = m(C3475a.b(type));
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.l);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.i);
        try {
            try {
                m.e(jsonWriter, obj);
            } catch (IOException e) {
                throw new C3001j(e);
            } catch (AssertionError e2) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.1): " + e2.getMessage());
                assertionError.initCause(e2);
                throw assertionError;
            }
        } finally {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public void y(Object obj, Type type, Appendable appendable) throws C3001j {
        try {
            x(obj, type, r(l.c(appendable)));
        } catch (IOException e) {
            throw new C3001j(e);
        }
    }

    public AbstractC3000i z(Object obj) {
        return obj == null ? C3002k.q : A(obj, obj.getClass());
    }

    Gson(Excluder excluder, InterfaceC2995d interfaceC2995d, Map<Type, InterfaceC2996e<?>> map, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, EnumC3010s enumC3010s, String str, int i, int i2, List<InterfaceC3014w> list, List<InterfaceC3014w> list2, List<InterfaceC3014w> list3, InterfaceC3013v interfaceC3013v, InterfaceC3013v interfaceC3013v2, List<InterfaceC3011t> list4) {
        this.a = new ThreadLocal<>();
        this.b = new ConcurrentHashMap();
        this.f = excluder;
        this.g = interfaceC2995d;
        this.h = map;
        c cVar = new c(map, z9, list4);
        this.c = cVar;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
        this.o = z8;
        this.p = z9;
        this.t = enumC3010s;
        this.q = str;
        this.r = i;
        this.s = i2;
        this.u = list;
        this.v = list2;
        this.w = interfaceC3013v;
        this.x = interfaceC3013v2;
        this.y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.W);
        arrayList.add(ObjectTypeAdapter.f(interfaceC3013v));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.C);
        arrayList.add(TypeAdapters.m);
        arrayList.add(TypeAdapters.g);
        arrayList.add(TypeAdapters.i);
        arrayList.add(TypeAdapters.k);
        TypeAdapter<Number> p = p(enumC3010s);
        arrayList.add(TypeAdapters.c(Long.TYPE, Long.class, p));
        arrayList.add(TypeAdapters.c(Double.TYPE, Double.class, e(z8)));
        arrayList.add(TypeAdapters.c(Float.TYPE, Float.class, f(z8)));
        arrayList.add(NumberTypeAdapter.f(interfaceC3013v2));
        arrayList.add(TypeAdapters.o);
        arrayList.add(TypeAdapters.q);
        arrayList.add(TypeAdapters.b(AtomicLong.class, b(p)));
        arrayList.add(TypeAdapters.b(AtomicLongArray.class, c(p)));
        arrayList.add(TypeAdapters.s);
        arrayList.add(TypeAdapters.x);
        arrayList.add(TypeAdapters.E);
        arrayList.add(TypeAdapters.G);
        arrayList.add(TypeAdapters.b(BigDecimal.class, TypeAdapters.z));
        arrayList.add(TypeAdapters.b(BigInteger.class, TypeAdapters.A));
        arrayList.add(TypeAdapters.b(f.class, TypeAdapters.B));
        arrayList.add(TypeAdapters.I);
        arrayList.add(TypeAdapters.K);
        arrayList.add(TypeAdapters.O);
        arrayList.add(TypeAdapters.Q);
        arrayList.add(TypeAdapters.U);
        arrayList.add(TypeAdapters.M);
        arrayList.add(TypeAdapters.d);
        arrayList.add(DateTypeAdapter.b);
        arrayList.add(TypeAdapters.S);
        if (com.google.gson.internal.sql.a.a) {
            arrayList.add(com.google.gson.internal.sql.a.e);
            arrayList.add(com.google.gson.internal.sql.a.d);
            arrayList.add(com.google.gson.internal.sql.a.f);
        }
        arrayList.add(ArrayTypeAdapter.c);
        arrayList.add(TypeAdapters.b);
        arrayList.add(new CollectionTypeAdapterFactory(cVar));
        arrayList.add(new MapTypeAdapterFactory(cVar, z3));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(cVar);
        this.d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.X);
        arrayList.add(new ReflectiveTypeAdapterFactory(cVar, interfaceC2995d, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.e = DesugarCollections.unmodifiableList(arrayList);
    }
}
