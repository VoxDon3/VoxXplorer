/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import ax.r8.d;
import ax.r8.e;
import ax.r8.i;
import ax.r8.k;
import ax.r8.r;
import ax.r8.s;
import ax.r8.t;
import ax.r8.u;
import ax.r8.v;
import ax.r8.w;
import ax.t8.c;
import ax.t8.f;
import ax.t8.j;
import ax.t8.l;
import com.google.gson.TypeAdapter;
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
import com.google.gson.internal.sql.a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class Gson {
    static final d A = ax.r8.c.q;
    static final v B = ax.r8.u.q;
    static final v C = ax.r8.u.c0;
    private static final ax.x8.a<?> D = ax.x8.a.a(Object.class);
    static final String z;
    private final ThreadLocal<Map<ax.x8.a<?>, FutureTypeAdapter<?>>> a;
    private final Map<ax.x8.a<?>, TypeAdapter<?>> b;
    private final c c;
    private final JsonAdapterAnnotationTypeAdapterFactory d;
    final List<w> e;
    final Excluder f;
    final d g;
    final Map<Type, e<?>> h;
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
    final s t;
    final List<w> u;
    final List<w> v;
    final v w;
    final v x;
    final List<t> y;

    public Gson() {
        Excluder excluder = Excluder.h0;
        d d8 = A;
        Map map = Collections.EMPTY_MAP;
        s s8 = ax.r8.s.q;
        String string = z;
        List list = Collections.EMPTY_LIST;
        this(excluder, d8, map, false, false, false, true, false, false, false, true, s8, string, 2, 2, list, list, list, B, C, list);
    }

    Gson(Excluder excluder, d d8, Map<Type, e<?>> object, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, boolean bl8, s object2, String object3, int n8, int n9, List<w> typeAdapter, List<w> list, List<w> list2, v v8, v v9, List<t> list3) {
        this.a = new ThreadLocal();
        this.b = new j.ConcurrentHashMap();
        this.f = excluder;
        this.g = d8;
        this.h = object;
        this.c = object = new c((Map<Type, e<?>>)object, bl8, list3);
        this.i = bl;
        this.j = bl2;
        this.k = bl3;
        this.l = bl4;
        this.m = bl5;
        this.n = bl6;
        this.o = bl7;
        this.p = bl8;
        this.t = object2;
        this.q = object3;
        this.r = n8;
        this.s = n9;
        this.u = typeAdapter;
        this.v = list;
        this.w = v8;
        this.x = v9;
        this.y = list3;
        object3 = new ArrayList();
        object3.add(TypeAdapters.W);
        object3.add(ObjectTypeAdapter.f(v8));
        object3.add(excluder);
        object3.addAll(list2);
        object3.add(TypeAdapters.C);
        object3.add(TypeAdapters.m);
        object3.add(TypeAdapters.g);
        object3.add(TypeAdapters.i);
        object3.add(TypeAdapters.k);
        object2 = Gson.p(object2);
        object3.add(TypeAdapters.c(Long.TYPE, Long.class, object2));
        typeAdapter = this.e(bl7);
        object3.add(TypeAdapters.c(Double.TYPE, Double.class, typeAdapter));
        typeAdapter = this.f(bl7);
        object3.add(TypeAdapters.c(Float.TYPE, Float.class, typeAdapter));
        object3.add(NumberTypeAdapter.f(v9));
        object3.add(TypeAdapters.o);
        object3.add(TypeAdapters.q);
        object3.add(TypeAdapters.b(AtomicLong.class, Gson.b((TypeAdapter<Number>)object2)));
        object3.add(TypeAdapters.b(AtomicLongArray.class, Gson.c((TypeAdapter<Number>)object2)));
        object3.add(TypeAdapters.s);
        object3.add(TypeAdapters.x);
        object3.add(TypeAdapters.E);
        object3.add(TypeAdapters.G);
        object3.add(TypeAdapters.b(BigDecimal.class, TypeAdapters.z));
        object3.add(TypeAdapters.b(BigInteger.class, TypeAdapters.A));
        object3.add(TypeAdapters.b(f.class, TypeAdapters.B));
        object3.add(TypeAdapters.I);
        object3.add(TypeAdapters.K);
        object3.add(TypeAdapters.O);
        object3.add(TypeAdapters.Q);
        object3.add(TypeAdapters.U);
        object3.add(TypeAdapters.M);
        object3.add(TypeAdapters.d);
        object3.add(DateTypeAdapter.b);
        object3.add(TypeAdapters.S);
        if (com.google.gson.internal.sql.a.a) {
            object3.add(com.google.gson.internal.sql.a.e);
            object3.add(com.google.gson.internal.sql.a.d);
            object3.add(com.google.gson.internal.sql.a.f);
        }
        object3.add(ArrayTypeAdapter.c);
        object3.add(TypeAdapters.b);
        object3.add(new CollectionTypeAdapterFactory((c)object));
        object3.add(new MapTypeAdapterFactory((c)object, bl2));
        object2 = new JsonAdapterAnnotationTypeAdapterFactory((c)object);
        this.d = object2;
        object3.add(object2);
        object3.add(TypeAdapters.X);
        object3.add(new ReflectiveTypeAdapterFactory((c)object, d8, excluder, (JsonAdapterAnnotationTypeAdapterFactory)object2, list3));
        this.e = java.util.DesugarCollections.unmodifiableList((List)object3);
    }

    private static void a(Object object, JsonReader jsonReader) {
        if (object != null) {
            try {
                if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                    object = new r("JSON document was not fully consumed.");
                    throw object;
                }
            }
            catch (IOException iOException) {
                throw new ax.r8.j(iOException);
            }
            catch (MalformedJsonException malformedJsonException) {
                throw new r(malformedJsonException);
            }
        }
    }

    private static TypeAdapter<AtomicLong> b(TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter<AtomicLong>(typeAdapter){
            final TypeAdapter a;
            {
                this.a = typeAdapter;
            }

            public AtomicLong f(JsonReader jsonReader) throws IOException {
                return new AtomicLong(((Number)this.a.c(jsonReader)).longValue());
            }

            public void g(JsonWriter jsonWriter, AtomicLong atomicLong) throws IOException {
                this.a.e(jsonWriter, atomicLong.get());
            }
        }.b();
    }

    private static TypeAdapter<AtomicLongArray> c(TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter<AtomicLongArray>(typeAdapter){
            final TypeAdapter a;
            {
                this.a = typeAdapter;
            }

            public AtomicLongArray f(JsonReader object) throws IOException {
                ArrayList<Long> arrayList = new ArrayList<Long>();
                ((JsonReader)object).beginArray();
                while (((JsonReader)object).hasNext()) {
                    arrayList.add(((Number)this.a.c((JsonReader)object)).longValue());
                }
                ((JsonReader)object).endArray();
                int n8 = arrayList.size();
                object = new AtomicLongArray(n8);
                for (int i8 = 0; i8 < n8; ++i8) {
                    ((AtomicLongArray)object).set(i8, (Long)arrayList.get(i8));
                }
                return object;
            }

            public void g(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
                jsonWriter.beginArray();
                int n8 = atomicLongArray.length();
                for (int i8 = 0; i8 < n8; ++i8) {
                    this.a.e(jsonWriter, atomicLongArray.get(i8));
                }
                jsonWriter.endArray();
            }
        }.b();
    }

    static void d(double d8) {
        if (!Double.isNaN(d8) && !Double.isInfinite(d8)) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d8);
        stringBuilder.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private TypeAdapter<Number> e(boolean bl) {
        if (bl) {
            return TypeAdapters.v;
        }
        return new TypeAdapter<Number>(this){
            final Gson a;
            {
                this.a = gson;
            }

            public Double f(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return jsonReader.nextDouble();
            }

            public void g(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                    return;
                }
                Gson.d(number.doubleValue());
                jsonWriter.value(number);
            }
        };
    }

    private TypeAdapter<Number> f(boolean bl) {
        if (bl) {
            return TypeAdapters.u;
        }
        return new TypeAdapter<Number>(this){
            final Gson a;
            {
                this.a = gson;
            }

            public Float f(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return Float.valueOf((float)jsonReader.nextDouble());
            }

            public void g(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                    return;
                }
                Gson.d(number.floatValue());
                jsonWriter.value(number);
            }
        };
    }

    private static TypeAdapter<Number> p(s s8) {
        if (s8 == ax.r8.s.q) {
            return TypeAdapters.t;
        }
        return new TypeAdapter<Number>(){

            public Number f(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return jsonReader.nextLong();
            }

            public void g(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.value(number.toString());
            }
        };
    }

    public i A(Object object, Type type) {
        ax.u8.a a8 = new ax.u8.a();
        this.x(object, type, a8);
        return a8.a();
    }

    public <T> T g(i i8, Type type) throws r {
        if (i8 == null) {
            return null;
        }
        return this.h(new com.google.gson.internal.bind.a(i8), type);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <T> T h(JsonReader var1_1, Type var2_2) throws ax.r8.j, r {
        block8: {
            block9: {
                var4_5 = var1_1.isLenient();
                var3_6 = true;
                var1_1.setLenient(true);
                try {
                    var1_1.peek();
                    var3_6 = false;
                    var2_2 = this.m(ax.x8.a.b((Type)var2_2)).c(var1_1);
                }
                catch (Throwable var2_3) {
                    break block8;
                }
                catch (AssertionError var5_7) {
                    ** GOTO lbl-1000
                }
                catch (IOException var5_8) {
                    ** GOTO lbl31
                }
                catch (IllegalStateException var5_9) {
                    ** GOTO lbl33
                }
                catch (EOFException var2_4) {
                    break block9;
                }
                var1_1.setLenient(var4_5);
                return (T)var2_2;
lbl-1000:
                // 1 sources

                {
                    var2_2 = new StringBuilder();
                    var2_2.append("AssertionError (GSON 2.9.1): ");
                    var2_2.append(var5_7.getMessage());
                    var6_11 = new AssertionError((Object)var2_2.toString());
                    var6_11.initCause((Throwable)var5_7);
                    throw var6_11;
lbl31:
                    // 1 sources

                    var2_2 = new r(var5_8);
                    throw var2_2;
lbl33:
                    // 1 sources

                    var2_2 = new r(var5_9);
                    throw var2_2;
                }
            }
            if (!var3_6) ** GOTO lbl-1000
            var1_1.setLenient(var4_5);
            return null;
lbl-1000:
            // 1 sources

            {
                var5_10 = new r(var2_4);
                throw var5_10;
            }
        }
        var1_1.setLenient(var4_5);
        throw var2_3;
    }

    public <T> T i(Reader reader, Class<T> clazz) throws r, ax.r8.j {
        JsonReader jsonReader = this.q(reader);
        reader = this.h(jsonReader, clazz);
        Gson.a(reader, jsonReader);
        return ax.t8.j.b(clazz).cast(reader);
    }

    public <T> T j(Reader closeable, Type type) throws ax.r8.j, r {
        closeable = this.q((Reader)closeable);
        type = this.h((JsonReader)closeable, type);
        Gson.a(type, (JsonReader)closeable);
        return (T)type;
    }

    public <T> T k(String string, Class<T> clazz) throws r {
        string = this.l(string, clazz);
        return ax.t8.j.b(clazz).cast(string);
    }

    public <T> T l(String string, Type type) throws r {
        if (string == null) {
            return null;
        }
        return this.j(new StringReader(string), type);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <T> TypeAdapter<T> m(ax.x8.a<T> a8) {
        TypeAdapter<T> typeAdapter;
        Object object;
        boolean bl;
        Object object2 = this.b;
        Map<ax.x8.a<?>, FutureTypeAdapter<?>> map = a8 == null ? D : a8;
        if ((map = object2.get(map)) != null) {
            return map;
        }
        map = this.a.get();
        if (map == null) {
            map = new HashMap();
            this.a.set(map);
            bl = true;
        } else {
            bl = false;
        }
        object2 = map.get(a8);
        if (object2 != null) {
            return object2;
        }
        try {
            object = new FutureTypeAdapter();
            map.put(a8, (FutureTypeAdapter<?>)object);
            object2 = this.e.iterator();
            while (object2.hasNext()) {
                typeAdapter = object2.next().b(this, a8);
                if (typeAdapter == null) continue;
                ((FutureTypeAdapter)object).f(typeAdapter);
                this.b.put(a8, typeAdapter);
                map.remove(a8);
            }
        }
        catch (Throwable throwable) {}
        {
            if (bl) {
                this.a.remove();
            }
            return typeAdapter;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("GSON (2.9.1) cannot handle ");
        ((StringBuilder)object2).append(a8);
        object = new IllegalArgumentException(((StringBuilder)object2).toString());
        throw object;
        map.remove(a8);
        if (bl) {
            this.a.remove();
        }
        throw throwable;
    }

    public <T> TypeAdapter<T> n(Class<T> clazz) {
        return this.m(ax.x8.a.a(clazz));
    }

    public <T> TypeAdapter<T> o(w object, ax.x8.a<T> a8) {
        w w8 = object;
        if (!this.e.contains(object)) {
            w8 = this.d;
        }
        object = this.e.iterator();
        boolean bl = false;
        while (object.hasNext()) {
            Object object2 = (w)object.next();
            if (!bl) {
                if (object2 != w8) continue;
                bl = true;
                continue;
            }
            if ((object2 = object2.b(this, a8)) == null) continue;
            return object2;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("GSON cannot serialize ");
        ((StringBuilder)object).append(a8);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public JsonReader q(Reader closeable) {
        closeable = new JsonReader((Reader)closeable);
        ((JsonReader)closeable).setLenient(this.n);
        return closeable;
    }

    public JsonWriter r(Writer closeable) throws IOException {
        if (this.k) {
            ((Writer)closeable).write(")]}'\n");
        }
        closeable = new JsonWriter((Writer)closeable);
        if (this.m) {
            ((JsonWriter)closeable).setIndent("  ");
        }
        ((JsonWriter)closeable).setHtmlSafe(this.l);
        ((JsonWriter)closeable).setLenient(this.n);
        ((JsonWriter)closeable).setSerializeNulls(this.i);
        return closeable;
    }

    public String s(i i8) {
        StringWriter stringWriter = new StringWriter();
        this.w(i8, stringWriter);
        return stringWriter.toString();
    }

    public String t(Object object) {
        if (object == null) {
            return this.s(ax.r8.k.q);
        }
        return this.u(object, object.getClass());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{serializeNulls:");
        stringBuilder.append(this.i);
        stringBuilder.append(",factories:");
        stringBuilder.append(this.e);
        stringBuilder.append(",instanceCreators:");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public String u(Object object, Type type) {
        StringWriter stringWriter = new StringWriter();
        this.y(object, type, stringWriter);
        return stringWriter.toString();
    }

    /*
     * Exception decompiling
     */
    public void v(i var1_1, JsonWriter var2_4) throws ax.r8.j {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [3 : 67->119)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public void w(i i8, Appendable appendable) throws ax.r8.j {
        try {
            this.v(i8, this.r(ax.t8.l.c(appendable)));
            return;
        }
        catch (IOException iOException) {
            throw new ax.r8.j(iOException);
        }
    }

    /*
     * Exception decompiling
     */
    public void x(Object var1_1, Type var2_3, JsonWriter var3_6) throws ax.r8.j {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [3 : 78->128)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public void y(Object object, Type type, Appendable appendable) throws ax.r8.j {
        try {
            this.x(object, type, this.r(ax.t8.l.c(appendable)));
            return;
        }
        catch (IOException iOException) {
            throw new ax.r8.j(iOException);
        }
    }

    public i z(Object object) {
        if (object == null) {
            return ax.r8.k.q;
        }
        return this.A(object, object.getClass());
    }

    static class FutureTypeAdapter<T>
    extends TypeAdapter<T> {
        private TypeAdapter<T> a;

        FutureTypeAdapter() {
        }

        @Override
        public T c(JsonReader jsonReader) throws IOException {
            TypeAdapter<T> typeAdapter = this.a;
            if (typeAdapter != null) {
                return typeAdapter.c(jsonReader);
            }
            throw new IllegalStateException();
        }

        @Override
        public void e(JsonWriter jsonWriter, T t8) throws IOException {
            TypeAdapter<T> typeAdapter = this.a;
            if (typeAdapter != null) {
                typeAdapter.e(jsonWriter, t8);
                return;
            }
            throw new IllegalStateException();
        }

        public void f(TypeAdapter<T> typeAdapter) {
            if (this.a == null) {
                this.a = typeAdapter;
                return;
            }
            throw new AssertionError();
        }
    }
}

