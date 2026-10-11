package com.google.gson.internal.bind;

import ax.r8.C3001j;
import ax.r8.C3009r;
import ax.r8.InterfaceC2995d;
import ax.r8.InterfaceC3011t;
import ax.r8.InterfaceC3014w;
import ax.s8.InterfaceC3060b;
import ax.s8.InterfaceC3061c;
import ax.t8.C3106b;
import ax.t8.c;
import ax.t8.h;
import ax.t8.j;
import ax.t8.k;
import ax.w8.C3374a;
import ax.x8.C3475a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.Excluder;
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

/* loaded from: classes3.dex */
public final class ReflectiveTypeAdapterFactory implements InterfaceC3014w {
    private final InterfaceC2995d c0;
    private final Excluder d0;
    private final JsonAdapterAnnotationTypeAdapterFactory e0;
    private final List<InterfaceC3011t> f0;
    private final c q;

    public static final class Adapter<T> extends TypeAdapter<T> {
        private final h<T> a;
        private final Map<String, b> b;

        Adapter(h<T> hVar, Map<String, b> map) {
            this.a = hVar;
            this.b = map;
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
                throw C3374a.b(e);
            } catch (IllegalStateException e2) {
                throw new C3009r(e2);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void e(JsonWriter jsonWriter, T t) throws IOException {
            if (t == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                Iterator<b> it = this.b.values().iterator();
                while (it.hasNext()) {
                    it.next().b(jsonWriter, t);
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e) {
                throw C3374a.b(e);
            }
        }
    }

    class a extends b {
        final /* synthetic */ boolean d;
        final /* synthetic */ Field e;
        final /* synthetic */ boolean f;
        final /* synthetic */ TypeAdapter g;
        final /* synthetic */ Gson h;
        final /* synthetic */ C3475a i;
        final /* synthetic */ boolean j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean z, boolean z2, boolean z3, Field field, boolean z4, TypeAdapter typeAdapter, Gson gson, C3475a c3475a, boolean z5) {
            super(str, z, z2);
            this.d = z3;
            this.e = field;
            this.f = z4;
            this.g = typeAdapter;
            this.h = gson;
            this.i = c3475a;
            this.j = z5;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        void a(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException {
            Object c = this.g.c(jsonReader);
            if (c == null && this.j) {
                return;
            }
            if (this.d) {
                ReflectiveTypeAdapterFactory.c(obj, this.e);
            }
            this.e.set(obj, c);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        void b(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException {
            if (this.b) {
                if (this.d) {
                    ReflectiveTypeAdapterFactory.c(obj, this.e);
                }
                Object obj2 = this.e.get(obj);
                if (obj2 == obj) {
                    return;
                }
                jsonWriter.name(this.a);
                (this.f ? this.g : new TypeAdapterRuntimeTypeWrapper(this.h, this.g, this.i.d())).e(jsonWriter, obj2);
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

        abstract void b(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException;
    }

    public ReflectiveTypeAdapterFactory(c cVar, InterfaceC2995d interfaceC2995d, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List<InterfaceC3011t> list) {
        this.q = cVar;
        this.c0 = interfaceC2995d;
        this.d0 = excluder;
        this.e0 = jsonAdapterAnnotationTypeAdapterFactory;
        this.f0 = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Object obj, Field field) {
        if (Modifier.isStatic(field.getModifiers())) {
            obj = null;
        }
        if (k.a(field, obj)) {
            return;
        }
        throw new C3001j("Field '" + field.getDeclaringClass().getName() + "#" + field.getName() + "' is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type or adjust the access filter.");
    }

    private b d(Gson gson, Field field, String str, C3475a<?> c3475a, boolean z, boolean z2, boolean z3) {
        boolean a2 = j.a(c3475a.c());
        InterfaceC3060b interfaceC3060b = (InterfaceC3060b) field.getAnnotation(InterfaceC3060b.class);
        TypeAdapter<?> a3 = interfaceC3060b != null ? this.e0.a(this.q, gson, c3475a, interfaceC3060b) : null;
        boolean z4 = a3 != null;
        if (a3 == null) {
            a3 = gson.m(c3475a);
        }
        return new a(str, z, z2, z3, field, z4, a3, gson, c3475a, a2);
    }

    private Map<String, b> e(Gson gson, C3475a<?> c3475a, Class<?> cls, boolean z) {
        C3475a<?> c3475a2;
        int i;
        int i2;
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = this;
        Class<?> cls2 = cls;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!cls2.isInterface()) {
            Type d = c3475a.d();
            C3475a<?> c3475a3 = c3475a;
            boolean z2 = z;
            Class<?> cls3 = cls2;
            while (cls3 != Object.class) {
                Field[] declaredFields = cls3.getDeclaredFields();
                boolean z3 = true;
                boolean z4 = false;
                if (cls3 != cls2 && declaredFields.length > 0) {
                    InterfaceC3011t.a b2 = k.b(reflectiveTypeAdapterFactory.f0, cls3);
                    if (b2 == InterfaceC3011t.a.BLOCK_ALL) {
                        throw new C3001j("ReflectionAccessFilter does not permit using reflection for " + cls3 + " (supertype of " + cls2 + "). Register a TypeAdapter for this type or adjust the access filter.");
                    }
                    z2 = b2 == InterfaceC3011t.a.BLOCK_INACCESSIBLE;
                }
                boolean z5 = z2;
                int length = declaredFields.length;
                int i3 = 0;
                while (i3 < length) {
                    int i4 = i3;
                    Field field = declaredFields[i4];
                    boolean g = reflectiveTypeAdapterFactory.g(field, z3);
                    boolean g2 = reflectiveTypeAdapterFactory.g(field, z4);
                    if (g || g2) {
                        if (!z5) {
                            C3374a.c(field);
                        }
                        Type o = C3106b.o(c3475a3.d(), cls3, field.getGenericType());
                        List<String> f = reflectiveTypeAdapterFactory.f(field);
                        int size = f.size();
                        b bVar = null;
                        c3475a2 = c3475a3;
                        int i5 = 0;
                        while (i5 < size) {
                            String str = f.get(i5);
                            if (i5 != 0) {
                                g = false;
                            }
                            List<String> list = f;
                            boolean z6 = g;
                            int i6 = i4;
                            int i7 = length;
                            b bVar2 = (b) linkedHashMap.put(str, reflectiveTypeAdapterFactory.d(gson, field, str, C3475a.b(o), z6, g2, z5));
                            if (bVar == null) {
                                bVar = bVar2;
                            }
                            i5++;
                            reflectiveTypeAdapterFactory = this;
                            g = z6;
                            length = i7;
                            i4 = i6;
                            f = list;
                        }
                        i = length;
                        i2 = i4;
                        if (bVar != null) {
                            throw new IllegalArgumentException(d + " declares multiple JSON fields named " + bVar.a);
                        }
                    } else {
                        i = length;
                        i2 = i4;
                        c3475a2 = c3475a3;
                    }
                    i3 = i2 + 1;
                    reflectiveTypeAdapterFactory = this;
                    c3475a3 = c3475a2;
                    length = i;
                    z3 = true;
                    z4 = false;
                }
                c3475a3 = C3475a.b(C3106b.o(c3475a3.d(), cls3, cls3.getGenericSuperclass()));
                cls3 = c3475a3.c();
                reflectiveTypeAdapterFactory = this;
                cls2 = cls;
                z2 = z5;
            }
        }
        return linkedHashMap;
    }

    private List<String> f(Field field) {
        InterfaceC3061c interfaceC3061c = (InterfaceC3061c) field.getAnnotation(InterfaceC3061c.class);
        if (interfaceC3061c == null) {
            return Collections.singletonList(this.c0.d(field));
        }
        String value = interfaceC3061c.value();
        String[] alternate = interfaceC3061c.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    private boolean g(Field field, boolean z) {
        return (this.d0.d(field.getType(), z) || this.d0.i(field, z)) ? false : true;
    }

    @Override // ax.r8.InterfaceC3014w
    public <T> TypeAdapter<T> b(Gson gson, C3475a<T> c3475a) {
        Class<? super T> c = c3475a.c();
        if (!Object.class.isAssignableFrom(c)) {
            return null;
        }
        InterfaceC3011t.a b2 = k.b(this.f0, c);
        if (b2 != InterfaceC3011t.a.BLOCK_ALL) {
            return new Adapter(this.q.a(c3475a), e(gson, c3475a, c, b2 == InterfaceC3011t.a.BLOCK_INACCESSIBLE));
        }
        throw new C3001j("ReflectionAccessFilter does not permit using reflection for " + c + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
