package com.google.gson.internal.bind;

import ax.r8.AbstractC3000i;
import ax.r8.C2997f;
import ax.r8.C3002k;
import ax.r8.C3003l;
import ax.r8.C3006o;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class a extends JsonReader {
    private static final Reader f0 = new C0566a();
    private static final Object g0 = new Object();
    private int c0;
    private String[] d0;
    private int[] e0;
    private Object[] q;

    /* renamed from: com.google.gson.internal.bind.a$a, reason: collision with other inner class name */
    class C0566a extends Reader implements AutoCloseable {
        C0566a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    }

    public a(AbstractC3000i abstractC3000i) {
        super(f0);
        this.q = new Object[32];
        this.c0 = 0;
        this.d0 = new String[32];
        this.e0 = new int[32];
        f(abstractC3000i);
    }

    private void a(JsonToken jsonToken) throws IOException {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
    }

    private Object c() {
        return this.q[this.c0 - 1];
    }

    private Object d() {
        Object[] objArr = this.q;
        int i = this.c0 - 1;
        this.c0 = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    private void f(Object obj) {
        int i = this.c0;
        Object[] objArr = this.q;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.q = Arrays.copyOf(objArr, i2);
            this.e0 = Arrays.copyOf(this.e0, i2);
            this.d0 = (String[]) Arrays.copyOf(this.d0, i2);
        }
        Object[] objArr2 = this.q;
        int i3 = this.c0;
        this.c0 = i3 + 1;
        objArr2[i3] = obj;
    }

    private String getPath(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (true) {
            int i2 = this.c0;
            if (i >= i2) {
                return sb.toString();
            }
            Object[] objArr = this.q;
            Object obj = objArr[i];
            if (obj instanceof C2997f) {
                i++;
                if (i < i2 && (objArr[i] instanceof Iterator)) {
                    int i3 = this.e0[i];
                    if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                        i3--;
                    }
                    sb.append('[');
                    sb.append(i3);
                    sb.append(']');
                }
            } else if ((obj instanceof C3003l) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                sb.append('.');
                String str = this.d0[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    private String locationString() {
        return " at path " + getPath();
    }

    AbstractC3000i b() throws IOException {
        JsonToken peek = peek();
        if (peek != JsonToken.NAME && peek != JsonToken.END_ARRAY && peek != JsonToken.END_OBJECT && peek != JsonToken.END_DOCUMENT) {
            AbstractC3000i abstractC3000i = (AbstractC3000i) c();
            skipValue();
            return abstractC3000i;
        }
        throw new IllegalStateException("Unexpected " + peek + " when reading a JsonElement.");
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() throws IOException {
        a(JsonToken.BEGIN_ARRAY);
        f(((C2997f) c()).iterator());
        this.e0[this.c0 - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() throws IOException {
        a(JsonToken.BEGIN_OBJECT);
        f(((C3003l) c()).s().iterator());
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.q = new Object[]{g0};
        this.c0 = 1;
    }

    public void e() throws IOException {
        a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) c()).next();
        f(entry.getValue());
        f(new C3006o((String) entry.getKey()));
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() throws IOException {
        a(JsonToken.END_ARRAY);
        d();
        d();
        int i = this.c0;
        if (i > 0) {
            int[] iArr = this.e0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() throws IOException {
        a(JsonToken.END_OBJECT);
        d();
        d();
        int i = this.c0;
        if (i > 0) {
            int[] iArr = this.e0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPreviousPath() {
        return getPath(true);
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() throws IOException {
        JsonToken peek = peek();
        return (peek == JsonToken.END_OBJECT || peek == JsonToken.END_ARRAY || peek == JsonToken.END_DOCUMENT) ? false : true;
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() throws IOException {
        a(JsonToken.BOOLEAN);
        boolean e = ((C3006o) d()).e();
        int i = this.c0;
        if (i > 0) {
            int[] iArr = this.e0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return e;
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        double r = ((C3006o) c()).r();
        if (!isLenient() && (Double.isNaN(r) || Double.isInfinite(r))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + r);
        }
        d();
        int i = this.c0;
        if (i > 0) {
            int[] iArr = this.e0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return r;
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        int s = ((C3006o) c()).s();
        d();
        int i = this.c0;
        if (i > 0) {
            int[] iArr = this.e0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return s;
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        long t = ((C3006o) c()).t();
        d();
        int i = this.c0;
        if (i > 0) {
            int[] iArr = this.e0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return t;
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextName() throws IOException {
        a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) c()).next();
        String str = (String) entry.getKey();
        this.d0[this.c0 - 1] = str;
        f(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.JsonReader
    public void nextNull() throws IOException {
        a(JsonToken.NULL);
        d();
        int i = this.c0;
        if (i > 0) {
            int[] iArr = this.e0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextString() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (peek == jsonToken || peek == JsonToken.NUMBER) {
            String k = ((C3006o) d()).k();
            int i = this.c0;
            if (i > 0) {
                int[] iArr = this.e0;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return k;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
    }

    @Override // com.google.gson.stream.JsonReader
    public JsonToken peek() throws IOException {
        if (this.c0 == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object c = c();
        if (c instanceof Iterator) {
            boolean z = this.q[this.c0 - 2] instanceof C3003l;
            Iterator it = (Iterator) c;
            if (!it.hasNext()) {
                return z ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z) {
                return JsonToken.NAME;
            }
            f(it.next());
            return peek();
        }
        if (c instanceof C3003l) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (c instanceof C2997f) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (!(c instanceof C3006o)) {
            if (c instanceof C3002k) {
                return JsonToken.NULL;
            }
            if (c == g0) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        C3006o c3006o = (C3006o) c;
        if (c3006o.z()) {
            return JsonToken.STRING;
        }
        if (c3006o.w()) {
            return JsonToken.BOOLEAN;
        }
        if (c3006o.y()) {
            return JsonToken.NUMBER;
        }
        throw new AssertionError();
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() throws IOException {
        if (peek() == JsonToken.NAME) {
            nextName();
            this.d0[this.c0 - 2] = "null";
        } else {
            d();
            int i = this.c0;
            if (i > 0) {
                this.d0[i - 1] = "null";
            }
        }
        int i2 = this.c0;
        if (i2 > 0) {
            int[] iArr = this.e0;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String toString() {
        return a.class.getSimpleName() + locationString();
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPath() {
        return getPath(false);
    }
}
