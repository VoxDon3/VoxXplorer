package com.google.gson.internal.bind;

import ax.r8.C3009r;
import ax.r8.EnumC3012u;
import ax.r8.InterfaceC3013v;
import ax.r8.InterfaceC3014w;
import ax.x8.C3475a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class NumberTypeAdapter extends TypeAdapter<Number> {
    private static final InterfaceC3014w b = g(EnumC3012u.c0);
    private final InterfaceC3013v a;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            a = iArr;
            try {
                iArr[JsonToken.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonToken.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private NumberTypeAdapter(InterfaceC3013v interfaceC3013v) {
        this.a = interfaceC3013v;
    }

    public static InterfaceC3014w f(InterfaceC3013v interfaceC3013v) {
        return interfaceC3013v == EnumC3012u.c0 ? b : g(interfaceC3013v);
    }

    private static InterfaceC3014w g(InterfaceC3013v interfaceC3013v) {
        return new InterfaceC3014w() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // ax.r8.InterfaceC3014w
            public <T> TypeAdapter<T> b(Gson gson, C3475a<T> c3475a) {
                if (c3475a.c() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Number c(JsonReader jsonReader) throws IOException {
        JsonToken peek = jsonReader.peek();
        int i = a.a[peek.ordinal()];
        if (i == 1) {
            jsonReader.nextNull();
            return null;
        }
        if (i == 2 || i == 3) {
            return this.a.d(jsonReader);
        }
        throw new C3009r("Expecting number, got: " + peek + "; at path " + jsonReader.getPath());
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void e(JsonWriter jsonWriter, Number number) throws IOException {
        jsonWriter.value(number);
    }
}
