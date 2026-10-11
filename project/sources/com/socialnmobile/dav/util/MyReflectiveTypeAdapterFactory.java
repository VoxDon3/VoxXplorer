package com.socialnmobile.dav.util;

import ax.r8.C3009r;
import ax.r8.InterfaceC2995d;
import ax.r8.InterfaceC3014w;
import ax.s8.InterfaceC3061c;
import ax.t8.C3106b;
import ax.t8.c;
import ax.t8.h;
import ax.t8.j;
import ax.x8.C3475a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.Excluder;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class MyReflectiveTypeAdapterFactory implements InterfaceC3014w {
    private final InterfaceC2995d c0;
    private final Excluder d0;
    private final Class e0;
    private final c q;

    public static final class Adapter<T> extends TypeAdapter<T> {
        private final h<T> a;
        private final Map<String, b> b;

        /* synthetic */ Adapter(h hVar, Map map, a aVar) {
            this(hVar, map);
        }

        @Override // com.google.gson.TypeAdapter
        public T c(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            T a = this.a.a();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    b bVar = this.b.get(jsonReader.nextName());
                    if (bVar != null && bVar.c) {
                        bVar.a(jsonReader, a);
                    }
                    jsonReader.skipValue();
                }
                jsonReader.endObject();
                return a;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (IllegalStateException e2) {
                throw new C3009r(e2);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void e(JsonWriter jsonWriter, T t) throws IOException {
            ax.Qd.a.a("This class should not be used for write");
        }

        private Adapter(h<T> hVar, Map<String, b> map) {
            this.a = hVar;
            this.b = map;
        }
    }

    class a extends b {
        final TypeAdapter<?> d;
        final /* synthetic */ Gson e;
        final /* synthetic */ Field f;
        final /* synthetic */ C3475a g;
        final /* synthetic */ boolean h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean z, boolean z2, Gson gson, Field field, C3475a c3475a, boolean z3) {
            super(str, z, z2);
            this.e = gson;
            this.f = field;
            this.g = c3475a;
            this.h = z3;
            this.d = MyReflectiveTypeAdapterFactory.this.g(gson, field, c3475a);
        }

        @Override // com.socialnmobile.dav.util.MyReflectiveTypeAdapterFactory.b
        void a(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException {
            Object c = this.d.c(jsonReader);
            if (!(c == null && this.h) && this.f.get(obj) == null) {
                this.f.set(obj, c);
            }
        }
    }

    static abstract class b {
        final String a;
        final boolean b;
        final boolean c;

        protected b(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        abstract void a(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException;
    }

    public MyReflectiveTypeAdapterFactory(c cVar, InterfaceC2995d interfaceC2995d, Excluder excluder, Class cls) {
        this.q = cVar;
        this.c0 = interfaceC2995d;
        this.d0 = excluder;
        this.e0 = cls;
    }

    private b c(Gson gson, Field field, String str, C3475a<?> c3475a, boolean z, boolean z2) {
        return new a(str, z, z2, gson, field, c3475a, j.a(c3475a.c()));
    }

    static boolean e(Field field, boolean z, Excluder excluder) {
        return (excluder.d(field.getType(), z) || excluder.i(field, z)) ? false : true;
    }

    private Map<String, b> f(Gson gson, C3475a<?> c3475a, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!cls.isInterface()) {
            Type d = c3475a.d();
            C3475a<?> c3475a2 = c3475a;
            Class<?> cls2 = cls;
            while (cls2 != Object.class) {
                for (Field field : cls2.getDeclaredFields()) {
                    boolean d2 = d(field, true);
                    boolean d3 = d(field, false);
                    if (d2 || d3) {
                        field.setAccessible(true);
                        b c = c(gson, field, i(field), C3475a.b(C3106b.o(c3475a2.d(), cls2, field.getGenericType())), d2, d3);
                        b bVar = (b) linkedHashMap.put(c.a, c);
                        if (bVar != null) {
                            throw new IllegalArgumentException(d + " declares multiple JSON fields named " + bVar.a);
                        }
                    }
                }
                c3475a2 = C3475a.b(C3106b.o(c3475a2.d(), cls2, cls2.getGenericSuperclass()));
                cls2 = c3475a2.c();
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TypeAdapter<?> g(Gson gson, Field field, C3475a<?> c3475a) {
        return gson.m(c3475a);
    }

    static String h(InterfaceC2995d interfaceC2995d, Field field) {
        InterfaceC3061c interfaceC3061c = (InterfaceC3061c) field.getAnnotation(InterfaceC3061c.class);
        return interfaceC3061c == null ? interfaceC2995d.d(field) : interfaceC3061c.value();
    }

    private String i(Field field) {
        return h(this.c0, field);
    }

    @Override // ax.r8.InterfaceC3014w
    public <T> TypeAdapter<T> b(Gson gson, C3475a<T> c3475a) {
        Class<? super T> c = c3475a.c();
        a aVar = null;
        if (Object.class.isAssignableFrom(c) && this.e0.isAssignableFrom(c)) {
            return new Adapter(this.q.a(c3475a), f(gson, c3475a, c), aVar);
        }
        return null;
    }

    public boolean d(Field field, boolean z) {
        return e(field, z, this.d0);
    }
}
