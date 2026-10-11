/*
 * Decompiled with CFR 0.152.
 */
package com.socialnmobile.dav.util;

import ax.r8.d;
import ax.r8.r;
import ax.r8.w;
import ax.t8.c;
import ax.t8.h;
import ax.t8.j;
import ax.x8.a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.Excluder;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;

public final class MyReflectiveTypeAdapterFactory
implements w {
    private final d c0;
    private final Excluder d0;
    private final Class e0;
    private final c q;

    public MyReflectiveTypeAdapterFactory(c c8, d d8, Excluder excluder, Class clazz) {
        this.q = c8;
        this.c0 = d8;
        this.d0 = excluder;
        this.e0 = clazz;
    }

    private b c(Gson gson, Field field, String string, a<?> a8, boolean bl, boolean bl2) {
        return new b(this, string, bl, bl2, gson, field, a8, j.a(a8.c())){
            final TypeAdapter<?> d;
            final Gson e;
            final Field f;
            final a g;
            final boolean h;
            final MyReflectiveTypeAdapterFactory i;
            {
                this.i = myReflectiveTypeAdapterFactory;
                this.e = gson;
                this.f = field;
                this.g = a8;
                this.h = bl3;
                super(string, bl, bl2);
                this.d = myReflectiveTypeAdapterFactory.g(gson, field, a8);
            }

            @Override
            void a(JsonReader jsonReader, Object object) throws IOException, IllegalAccessException {
                if (!((jsonReader = this.d.c(jsonReader)) == null && this.h || this.f.get(object) != null)) {
                    this.f.set(object, jsonReader);
                }
            }
        };
    }

    static boolean e(Field field, boolean bl, Excluder excluder) {
        return !excluder.d(field.getType(), bl) && !excluder.i(field, bl);
    }

    private Map<String, b> f(Gson object, a<?> a8, Class<?> clazz) {
        LinkedHashMap<String, b> linkedHashMap = new LinkedHashMap<String, b>();
        if (!clazz.isInterface()) {
            Type type = a8.d();
            while (clazz != Object.class) {
                for (Field field : clazz.getDeclaredFields()) {
                    boolean bl = this.d(field, true);
                    boolean bl2 = this.d(field, false);
                    if (!bl && !bl2) continue;
                    ((AccessibleObject)field).setAccessible(true);
                    Object object2 = ax.t8.b.o(a8.d(), clazz, field.getGenericType());
                    object2 = this.c((Gson)object, field, this.i(field), a.b((Type)object2), bl, bl2);
                    object2 = linkedHashMap.put(((b)object2).a, (b)object2);
                    if (object2 == null) {
                        continue;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append(type);
                    ((StringBuilder)object).append(" declares multiple JSON fields named ");
                    ((StringBuilder)object).append(((b)object2).a);
                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                }
                a8 = a.b(ax.t8.b.o(a8.d(), clazz, clazz.getGenericSuperclass()));
                clazz = a8.c();
            }
        }
        return linkedHashMap;
    }

    private TypeAdapter<?> g(Gson gson, Field field, a<?> a8) {
        return gson.m(a8);
    }

    static String h(d d8, Field field) {
        ax.s8.c c8 = field.getAnnotation(ax.s8.c.class);
        if (c8 == null) {
            return d8.d(field);
        }
        return c8.value();
    }

    private String i(Field field) {
        return MyReflectiveTypeAdapterFactory.h(this.c0, field);
    }

    @Override
    public <T> TypeAdapter<T> b(Gson gson, a<T> a8) {
        Class<T> clazz = a8.c();
        if (!Object.class.isAssignableFrom(clazz)) {
            return null;
        }
        if (!this.e0.isAssignableFrom(clazz)) {
            return null;
        }
        return new Adapter(this.q.a(a8), this.f(gson, a8, clazz));
    }

    public boolean d(Field field, boolean bl) {
        return MyReflectiveTypeAdapterFactory.e(field, bl, this.d0);
    }

    public static final class Adapter<T>
    extends TypeAdapter<T> {
        private final h<T> a;
        private final Map<String, b> b;

        private Adapter(h<T> h8, Map<String, b> map) {
            this.a = h8;
            this.b = map;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public T c(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            T t8 = this.a.a();
            try {
                jsonReader.beginObject();
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new AssertionError((Object)illegalAccessException);
            }
            catch (IllegalStateException illegalStateException) {
                throw new r(illegalStateException);
            }
            while (jsonReader.hasNext()) {
                Object object = jsonReader.nextName();
                if ((object = this.b.get(object)) != null && ((b)object).c) {
                    ((b)object).a(jsonReader, t8);
                    continue;
                }
                jsonReader.skipValue();
            }
            jsonReader.endObject();
            return t8;
        }

        @Override
        public void e(JsonWriter jsonWriter, T t8) throws IOException {
            ax.Qd.a.a("This class should not be used for write");
        }
    }

    static abstract class b {
        final String a;
        final boolean b;
        final boolean c;

        protected b(String string, boolean bl, boolean bl2) {
            this.a = string;
            this.b = bl;
            this.c = bl2;
        }

        abstract void a(JsonReader var1, Object var2) throws IOException, IllegalAccessException;
    }
}

