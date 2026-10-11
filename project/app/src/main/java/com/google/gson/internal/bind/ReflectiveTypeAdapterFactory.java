/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import ax.r8.d;
import ax.r8.j;
import ax.r8.r;
import ax.r8.t;
import ax.r8.w;
import ax.t8.c;
import ax.t8.h;
import ax.t8.k;
import ax.w8.a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory
implements w {
    private final d c0;
    private final Excluder d0;
    private final JsonAdapterAnnotationTypeAdapterFactory e0;
    private final List<t> f0;
    private final c q;

    public ReflectiveTypeAdapterFactory(c c8, d d8, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List<t> list) {
        this.q = c8;
        this.c0 = d8;
        this.d0 = excluder;
        this.e0 = jsonAdapterAnnotationTypeAdapterFactory;
        this.f0 = list;
    }

    private static void c(Object object, Field field) {
        if (Modifier.isStatic(field.getModifiers())) {
            object = null;
        }
        if (k.a(field, object)) {
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Field '");
        ((StringBuilder)object).append(field.getDeclaringClass().getName());
        ((StringBuilder)object).append("#");
        ((StringBuilder)object).append(field.getName());
        ((StringBuilder)object).append("' is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type or adjust the access filter.");
        throw new j(((StringBuilder)object).toString());
    }

    private b d(Gson gson, Field field, String string, ax.x8.a<?> a8, boolean bl, boolean bl2, boolean bl3) {
        boolean bl4 = ax.t8.j.a(a8.c());
        Object object = field.getAnnotation(ax.s8.b.class);
        object = object != null ? this.e0.a(this.q, gson, a8, (ax.s8.b)object) : null;
        boolean bl5 = object != null;
        Object object2 = object;
        if (object == null) {
            object2 = gson.m(a8);
        }
        return new b(this, string, bl, bl2, bl3, field, bl5, (TypeAdapter)object2, gson, a8, bl4){
            final boolean d;
            final Field e;
            final boolean f;
            final TypeAdapter g;
            final Gson h;
            final ax.x8.a i;
            final boolean j;
            final ReflectiveTypeAdapterFactory k;
            {
                this.k = reflectiveTypeAdapterFactory;
                this.d = bl3;
                this.e = field;
                this.f = bl4;
                this.g = typeAdapter;
                this.h = gson;
                this.i = a8;
                this.j = bl5;
                super(string, bl, bl2);
            }

            @Override
            void a(JsonReader jsonReader, Object object) throws IOException, IllegalAccessException {
                if ((jsonReader = this.g.c(jsonReader)) == null && this.j) {
                    return;
                }
                if (this.d) {
                    ReflectiveTypeAdapterFactory.c(object, this.e);
                }
                this.e.set(object, jsonReader);
            }

            @Override
            void b(JsonWriter jsonWriter, Object typeAdapter) throws IOException, IllegalAccessException {
                Object object;
                block5: {
                    block4: {
                        if (!this.b) break block4;
                        if (this.d) {
                            ReflectiveTypeAdapterFactory.c(typeAdapter, this.e);
                        }
                        if ((object = this.e.get(typeAdapter)) != typeAdapter) break block5;
                    }
                    return;
                }
                jsonWriter.name(this.a);
                typeAdapter = this.f ? this.g : new TypeAdapterRuntimeTypeWrapper<Object>(this.h, this.g, this.i.d());
                ((TypeAdapter)typeAdapter).e(jsonWriter, object);
            }
        };
    }

    private Map<String, b> e(Gson object, ax.x8.a<?> a8, Class<?> clazz, boolean bl) {
        LinkedHashMap<String, b> linkedHashMap = new LinkedHashMap<String, b>();
        if (!clazz.isInterface()) {
            Type type = a8.d();
            Class<?> clazz2 = clazz;
            boolean bl2 = bl;
            while (clazz2 != Object.class) {
                Object object2;
                Field[] fieldArray = clazz2.getDeclaredFields();
                bl = bl2;
                if (clazz2 != clazz) {
                    bl = bl2;
                    if (fieldArray.length > 0) {
                        object2 = k.b(this.f0, clazz2);
                        if (object2 != t.a.e0) {
                            bl = object2 == t.a.d0;
                        } else {
                            object = new StringBuilder();
                            ((StringBuilder)object).append("ReflectionAccessFilter does not permit using reflection for ");
                            ((StringBuilder)object).append(clazz2);
                            ((StringBuilder)object).append(" (supertype of ");
                            ((StringBuilder)object).append(clazz);
                            ((StringBuilder)object).append("). Register a TypeAdapter for this type or adjust the access filter.");
                            throw new j(((StringBuilder)object).toString());
                        }
                    }
                }
                for (Field field : fieldArray) {
                    bl2 = this.g(field, true);
                    boolean bl3 = this.g(field, false);
                    if (!bl2 && !bl3) continue;
                    if (!bl) {
                        a.c(field);
                    }
                    Type type2 = ax.t8.b.o(a8.d(), clazz2, field.getGenericType());
                    List<String> list = this.f(field);
                    int n8 = list.size();
                    object2 = null;
                    for (int i8 = 0; i8 < n8; ++i8) {
                        Object object3 = list.get(i8);
                        if (i8 != 0) {
                            bl2 = false;
                        }
                        b b8 = linkedHashMap.put((String)object3, this.d((Gson)object, field, (String)object3, ax.x8.a.b(type2), bl2, bl3, bl));
                        object3 = object2;
                        if (object2 == null) {
                            object3 = b8;
                        }
                        object2 = object3;
                    }
                    if (object2 == null) {
                        continue;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append(type);
                    ((StringBuilder)object).append(" declares multiple JSON fields named ");
                    ((StringBuilder)object).append(((b)object2).a);
                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                }
                a8 = ax.x8.a.b(ax.t8.b.o(a8.d(), clazz2, clazz2.getGenericSuperclass()));
                clazz2 = a8.c();
                bl2 = bl;
            }
        }
        return linkedHashMap;
    }

    private List<String> f(Field object) {
        Object object2 = ((Field)object).getAnnotation(ax.s8.c.class);
        if (object2 == null) {
            return Collections.singletonList(this.c0.d((Field)object));
        }
        object = object2.value();
        String[] stringArray = object2.alternate();
        if (stringArray.length == 0) {
            return Collections.singletonList(object);
        }
        object2 = new ArrayList(stringArray.length + 1);
        object2.add(object);
        int n8 = stringArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            object2.add(stringArray[i8]);
        }
        return object2;
    }

    private boolean g(Field field, boolean bl) {
        return !this.d0.d(field.getType(), bl) && !this.d0.i(field, bl);
    }

    @Override
    public <T> TypeAdapter<T> b(Gson object, ax.x8.a<T> a8) {
        Class<T> clazz = a8.c();
        if (!Object.class.isAssignableFrom(clazz)) {
            return null;
        }
        t.a a9 = k.b(this.f0, clazz);
        if (a9 != t.a.e0) {
            boolean bl = a9 == t.a.d0;
            return new Adapter<T>(this.q.a(a8), this.e((Gson)object, a8, clazz, bl));
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("ReflectionAccessFilter does not permit using reflection for ");
        ((StringBuilder)object).append(clazz);
        ((StringBuilder)object).append(". Register a TypeAdapter for this type or adjust the access filter.");
        throw new j(((StringBuilder)object).toString());
    }

    public static final class Adapter<T>
    extends TypeAdapter<T> {
        private final h<T> a;
        private final Map<String, b> b;

        Adapter(h<T> h8, Map<String, b> map) {
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
                throw ax.w8.a.b(illegalAccessException);
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
            IllegalAccessException illegalAccessException2;
            block4: {
                if (t8 == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginObject();
                try {
                    Iterator<b> iterator = this.b.values().iterator();
                    while (iterator.hasNext()) {
                        iterator.next().b(jsonWriter, t8);
                    }
                }
                catch (IllegalAccessException illegalAccessException2) {
                    break block4;
                }
                jsonWriter.endObject();
                return;
            }
            throw ax.w8.a.b(illegalAccessException2);
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

        abstract void b(JsonWriter var1, Object var2) throws IOException, IllegalAccessException;
    }
}

