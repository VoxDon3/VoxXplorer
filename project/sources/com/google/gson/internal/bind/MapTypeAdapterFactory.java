package com.google.gson.internal.bind;

import ax.r8.AbstractC3000i;
import ax.r8.C3006o;
import ax.r8.C3009r;
import ax.r8.InterfaceC3014w;
import ax.t8.C3106b;
import ax.t8.c;
import ax.t8.e;
import ax.t8.h;
import ax.t8.l;
import ax.x8.C3475a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes3.dex */
public final class MapTypeAdapterFactory implements InterfaceC3014w {
    final boolean c0;
    private final c q;

    private final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {
        private final TypeAdapter<K> a;
        private final TypeAdapter<V> b;
        private final h<? extends Map<K, V>> c;

        public Adapter(Gson gson, Type type, TypeAdapter<K> typeAdapter, Type type2, TypeAdapter<V> typeAdapter2, h<? extends Map<K, V>> hVar) {
            this.a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.c = hVar;
        }

        private String f(AbstractC3000i abstractC3000i) {
            if (!abstractC3000i.q()) {
                if (abstractC3000i.n()) {
                    return "null";
                }
                throw new AssertionError();
            }
            C3006o i = abstractC3000i.i();
            if (i.y()) {
                return String.valueOf(i.u());
            }
            if (i.w()) {
                return Boolean.toString(i.e());
            }
            if (i.z()) {
                return i.k();
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Map<K, V> c(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map<K, V> a = this.c.a();
            if (peek != JsonToken.BEGIN_ARRAY) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    e.INSTANCE.promoteNameToValue(jsonReader);
                    K c = this.a.c(jsonReader);
                    if (a.put(c, this.b.c(jsonReader)) != null) {
                        throw new C3009r("duplicate key: " + c);
                    }
                }
                jsonReader.endObject();
                return a;
            }
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                jsonReader.beginArray();
                K c2 = this.a.c(jsonReader);
                if (a.put(c2, this.b.c(jsonReader)) != null) {
                    throw new C3009r("duplicate key: " + c2);
                }
                jsonReader.endArray();
            }
            jsonReader.endArray();
            return a;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(JsonWriter jsonWriter, Map<K, V> map) throws IOException {
            if (map == null) {
                jsonWriter.nullValue();
                return;
            }
            if (!MapTypeAdapterFactory.this.c0) {
                jsonWriter.beginObject();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    this.b.e(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i = 0;
            boolean z = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                AbstractC3000i d = this.a.d(entry2.getKey());
                arrayList.add(d);
                arrayList2.add(entry2.getValue());
                z |= d.l() || d.p();
            }
            if (!z) {
                jsonWriter.beginObject();
                int size = arrayList.size();
                while (i < size) {
                    jsonWriter.name(f((AbstractC3000i) arrayList.get(i)));
                    this.b.e(jsonWriter, arrayList2.get(i));
                    i++;
                }
                jsonWriter.endObject();
                return;
            }
            jsonWriter.beginArray();
            int size2 = arrayList.size();
            while (i < size2) {
                jsonWriter.beginArray();
                l.b((AbstractC3000i) arrayList.get(i), jsonWriter);
                this.b.e(jsonWriter, arrayList2.get(i));
                jsonWriter.endArray();
                i++;
            }
            jsonWriter.endArray();
        }
    }

    public MapTypeAdapterFactory(c cVar, boolean z) {
        this.q = cVar;
        this.c0 = z;
    }

    private TypeAdapter<?> a(Gson gson, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.f : gson.m(C3475a.b(type));
    }

    @Override // ax.r8.InterfaceC3014w
    public <T> TypeAdapter<T> b(Gson gson, C3475a<T> c3475a) {
        Type d = c3475a.d();
        Class<? super T> c = c3475a.c();
        if (!Map.class.isAssignableFrom(c)) {
            return null;
        }
        Type[] j = C3106b.j(d, c);
        return new Adapter(gson, j[0], a(gson, j[0]), j[1], gson.m(C3475a.b(j[1])), this.q.a(c3475a));
    }
}
