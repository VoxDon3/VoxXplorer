/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import ax.r8.i;
import ax.r8.o;
import ax.r8.r;
import ax.r8.w;
import ax.t8.b;
import ax.t8.c;
import ax.t8.e;
import ax.t8.h;
import ax.t8.l;
import ax.x8.a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class MapTypeAdapterFactory
implements w {
    final boolean c0;
    private final c q;

    public MapTypeAdapterFactory(c c8, boolean bl) {
        this.q = c8;
        this.c0 = bl;
    }

    private TypeAdapter<?> a(Gson gson, Type type) {
        if (type != Boolean.TYPE && type != Boolean.class) {
            return gson.m(a.b(type));
        }
        return TypeAdapters.f;
    }

    @Override
    public <T> TypeAdapter<T> b(Gson gson, a<T> object) {
        Object object2 = ((a)object).d();
        Class<T> clazz = ((a)object).c();
        if (!Map.class.isAssignableFrom(clazz)) {
            return null;
        }
        Type[] typeArray = b.j((Type)object2, clazz);
        clazz = this.a(gson, typeArray[0]);
        object2 = gson.m(a.b(typeArray[1]));
        object = this.q.a(object);
        return new Adapter(this, gson, typeArray[0], clazz, typeArray[1], object2, object);
    }

    private final class Adapter<K, V>
    extends TypeAdapter<Map<K, V>> {
        private final TypeAdapter<K> a;
        private final TypeAdapter<V> b;
        private final h<? extends Map<K, V>> c;
        final MapTypeAdapterFactory d;

        public Adapter(MapTypeAdapterFactory mapTypeAdapterFactory, Gson gson, Type type, TypeAdapter<K> typeAdapter, Type type2, TypeAdapter<V> typeAdapter2, h<? extends Map<K, V>> h8) {
            this.d = mapTypeAdapterFactory;
            this.a = new TypeAdapterRuntimeTypeWrapper<K>(gson, typeAdapter, type);
            this.b = new TypeAdapterRuntimeTypeWrapper<V>(gson, typeAdapter2, type2);
            this.c = h8;
        }

        private String f(i i8) {
            if (i8.q()) {
                if (((o)(i8 = i8.i())).y()) {
                    return String.valueOf(((o)i8).u());
                }
                if (((o)i8).w()) {
                    return Boolean.toString(((o)i8).e());
                }
                if (((o)i8).z()) {
                    return ((o)i8).k();
                }
                throw new AssertionError();
            }
            if (i8.n()) {
                return "null";
            }
            throw new AssertionError();
        }

        public Map<K, V> g(JsonReader object) throws IOException {
            JsonToken jsonToken = ((JsonReader)object).peek();
            if (jsonToken == JsonToken.NULL) {
                ((JsonReader)object).nextNull();
                return null;
            }
            Map<JsonToken, V> map = this.c.a();
            if (jsonToken == JsonToken.BEGIN_ARRAY) {
                ((JsonReader)object).beginArray();
                while (((JsonReader)object).hasNext()) {
                    ((JsonReader)object).beginArray();
                    jsonToken = this.a.c((JsonReader)object);
                    if (map.put(jsonToken, this.b.c((JsonReader)object)) == null) {
                        ((JsonReader)object).endArray();
                        continue;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("duplicate key: ");
                    ((StringBuilder)object).append((Object)jsonToken);
                    throw new r(((StringBuilder)object).toString());
                }
                ((JsonReader)object).endArray();
                return map;
            }
            ((JsonReader)object).beginObject();
            while (((JsonReader)object).hasNext()) {
                e.INSTANCE.promoteNameToValue((JsonReader)object);
                jsonToken = this.a.c((JsonReader)object);
                if (map.put(jsonToken, this.b.c((JsonReader)object)) == null) continue;
                object = new StringBuilder();
                ((StringBuilder)object).append("duplicate key: ");
                ((StringBuilder)object).append((Object)jsonToken);
                throw new r(((StringBuilder)object).toString());
            }
            ((JsonReader)object).endObject();
            return map;
        }

        public void h(JsonWriter jsonWriter, Map<K, V> object) throws IOException {
            int n8;
            if (object == null) {
                jsonWriter.nullValue();
                return;
            }
            if (!this.d.c0) {
                jsonWriter.beginObject();
                for (Map.Entry entry : object.entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    this.b.e(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
                return;
            }
            ArrayList<Object> arrayList = new ArrayList<Object>(object.size());
            ArrayList arrayList2 = new ArrayList(object.size());
            Iterator iterator = object.entrySet().iterator();
            int n9 = 0;
            int n10 = 0;
            int n11 = 0;
            while (iterator.hasNext()) {
                Map.Entry entry = iterator.next();
                object = this.a.d(entry.getKey());
                arrayList.add(object);
                arrayList2.add(entry.getValue());
                n8 = !((i)object).l() && !((i)object).p() ? 0 : 1;
                n11 |= n8;
            }
            if (n11 != 0) {
                jsonWriter.beginArray();
                n8 = arrayList.size();
                for (n11 = n10; n11 < n8; ++n11) {
                    jsonWriter.beginArray();
                    l.b((i)arrayList.get(n11), jsonWriter);
                    this.b.e(jsonWriter, arrayList2.get(n11));
                    jsonWriter.endArray();
                }
                jsonWriter.endArray();
                return;
            }
            jsonWriter.beginObject();
            n8 = arrayList.size();
            for (n11 = n9; n11 < n8; ++n11) {
                jsonWriter.name(this.f((i)arrayList.get(n11)));
                this.b.e(jsonWriter, arrayList2.get(n11));
            }
            jsonWriter.endObject();
        }
    }
}

