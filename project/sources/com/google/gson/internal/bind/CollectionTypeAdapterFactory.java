package com.google.gson.internal.bind;

import ax.r8.InterfaceC3014w;
import ax.t8.C3106b;
import ax.t8.c;
import ax.t8.h;
import ax.x8.C3475a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class CollectionTypeAdapterFactory implements InterfaceC3014w {
    private final c q;

    private static final class Adapter<E> extends TypeAdapter<Collection<E>> {
        private final TypeAdapter<E> a;
        private final h<? extends Collection<E>> b;

        public Adapter(Gson gson, Type type, TypeAdapter<E> typeAdapter, h<? extends Collection<E>> hVar) {
            this.a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.b = hVar;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Collection<E> c(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection<E> a = this.b.a();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                a.add(this.a.c(jsonReader));
            }
            jsonReader.endArray();
            return a;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(JsonWriter jsonWriter, Collection<E> collection) throws IOException {
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.a.e(jsonWriter, it.next());
            }
            jsonWriter.endArray();
        }
    }

    public CollectionTypeAdapterFactory(c cVar) {
        this.q = cVar;
    }

    @Override // ax.r8.InterfaceC3014w
    public <T> TypeAdapter<T> b(Gson gson, C3475a<T> c3475a) {
        Type d = c3475a.d();
        Class<? super T> c = c3475a.c();
        if (!Collection.class.isAssignableFrom(c)) {
            return null;
        }
        Type h = C3106b.h(d, c);
        return new Adapter(gson, h, gson.m(C3475a.b(h)), this.q.a(c3475a));
    }
}
