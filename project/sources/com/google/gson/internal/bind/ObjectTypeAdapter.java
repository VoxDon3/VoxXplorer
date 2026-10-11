package com.google.gson.internal.bind;

import ax.r8.EnumC3012u;
import ax.r8.InterfaceC3013v;
import ax.r8.InterfaceC3014w;
import ax.t8.g;
import ax.x8.C3475a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ObjectTypeAdapter extends TypeAdapter<Object> {
    private static final InterfaceC3014w c = g(EnumC3012u.q);
    private final Gson a;
    private final InterfaceC3013v b;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static InterfaceC3014w f(InterfaceC3013v interfaceC3013v) {
        return interfaceC3013v == EnumC3012u.q ? c : g(interfaceC3013v);
    }

    private static InterfaceC3014w g(final InterfaceC3013v interfaceC3013v) {
        return new InterfaceC3014w() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
            @Override // ax.r8.InterfaceC3014w
            public <T> TypeAdapter<T> b(Gson gson, C3475a<T> c3475a) {
                if (c3475a.c() == Object.class) {
                    return new ObjectTypeAdapter(gson, InterfaceC3013v.this);
                }
                return null;
            }
        };
    }

    private Object h(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i = a.a[jsonToken.ordinal()];
        if (i == 3) {
            return jsonReader.nextString();
        }
        if (i == 4) {
            return this.b.d(jsonReader);
        }
        if (i == 5) {
            return Boolean.valueOf(jsonReader.nextBoolean());
        }
        if (i == 6) {
            jsonReader.nextNull();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }

    private Object i(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i = a.a[jsonToken.ordinal()];
        if (i == 1) {
            jsonReader.beginArray();
            return new ArrayList();
        }
        if (i != 2) {
            return null;
        }
        jsonReader.beginObject();
        return new g();
    }

    @Override // com.google.gson.TypeAdapter
    public Object c(JsonReader jsonReader) throws IOException {
        JsonToken peek = jsonReader.peek();
        Object i = i(jsonReader, peek);
        if (i == null) {
            return h(jsonReader, peek);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                String nextName = i instanceof Map ? jsonReader.nextName() : null;
                JsonToken peek2 = jsonReader.peek();
                Object i2 = i(jsonReader, peek2);
                boolean z = i2 != null;
                if (i2 == null) {
                    i2 = h(jsonReader, peek2);
                }
                if (i instanceof List) {
                    ((List) i).add(i2);
                } else {
                    ((Map) i).put(nextName, i2);
                }
                if (z) {
                    arrayDeque.addLast(i);
                    i = i2;
                }
            } else {
                if (i instanceof List) {
                    jsonReader.endArray();
                } else {
                    jsonReader.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return i;
                }
                i = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void e(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter n = this.a.n(obj.getClass());
        if (!(n instanceof ObjectTypeAdapter)) {
            n.e(jsonWriter, obj);
        } else {
            jsonWriter.beginObject();
            jsonWriter.endObject();
        }
    }

    private ObjectTypeAdapter(Gson gson, InterfaceC3013v interfaceC3013v) {
        this.a = gson;
        this.b = interfaceC3013v;
    }
}
