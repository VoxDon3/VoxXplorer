/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import ax.r8.f;
import ax.r8.i;
import ax.r8.k;
import ax.r8.l;
import ax.r8.o;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class a
extends JsonReader {
    private static final Reader f0 = new AutoCloseable(){

        @Override
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override
        public int read(char[] cArray, int n8, int n9) throws IOException {
            throw new AssertionError();
        }
    };
    private static final Object g0 = new Object();
    private int c0 = 0;
    private String[] d0;
    private int[] e0;
    private Object[] q = new Object[32];

    public a(i i8) {
        super(f0);
        this.d0 = new String[32];
        this.e0 = new int[32];
        this.f(i8);
    }

    private void a(JsonToken jsonToken) throws IOException {
        if (this.peek() == jsonToken) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected ");
        stringBuilder.append((Object)jsonToken);
        stringBuilder.append(" but was ");
        stringBuilder.append((Object)this.peek());
        stringBuilder.append(this.locationString());
        throw new IllegalStateException(stringBuilder.toString());
    }

    private Object c() {
        return this.q[this.c0 - 1];
    }

    private Object d() {
        int n8;
        Object[] objectArray = this.q;
        this.c0 = n8 = this.c0 - 1;
        Object object = objectArray[n8];
        objectArray[n8] = null;
        return object;
    }

    private void f(Object object) {
        int n8 = this.c0;
        Object[] objectArray = this.q;
        if (n8 == objectArray.length) {
            this.q = Arrays.copyOf(objectArray, n8 *= 2);
            this.e0 = Arrays.copyOf(this.e0, n8);
            this.d0 = Arrays.copyOf(this.d0, n8);
        }
        objectArray = this.q;
        n8 = this.c0;
        this.c0 = n8 + 1;
        objectArray[n8] = object;
    }

    private String getPath(boolean bl) {
        int n8;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('$');
        int n9 = 0;
        while (n9 < (n8 = this.c0)) {
            int n10;
            block10: {
                Object object;
                Object[] objectArray;
                block9: {
                    block11: {
                        int n11;
                        block12: {
                            objectArray = this.q;
                            object = objectArray[n9];
                            if (!(object instanceof f)) break block9;
                            n10 = ++n9;
                            if (n9 >= n8) break block10;
                            n10 = n9;
                            if (!(objectArray[n9] instanceof Iterator)) break block10;
                            n10 = n11 = this.e0[n9];
                            if (!bl) break block11;
                            n10 = n11;
                            if (n11 <= 0) break block11;
                            if (n9 == n8 - 1) break block12;
                            n10 = n11;
                            if (n9 != n8 - 2) break block11;
                        }
                        n10 = n11 - 1;
                    }
                    stringBuilder.append('[');
                    stringBuilder.append(n10);
                    stringBuilder.append(']');
                    n10 = n9;
                    break block10;
                }
                n10 = n9++;
                if (object instanceof l) {
                    n10 = n9;
                    if (n9 < n8) {
                        n10 = n9;
                        if (objectArray[n9] instanceof Iterator) {
                            stringBuilder.append('.');
                            object = this.d0[n9];
                            n10 = n9;
                            if (object != null) {
                                stringBuilder.append((String)object);
                                n10 = n9;
                            }
                        }
                    }
                }
            }
            n9 = n10 + 1;
        }
        return stringBuilder.toString();
    }

    private String locationString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" at path ");
        stringBuilder.append(this.getPath());
        return stringBuilder.toString();
    }

    i b() throws IOException {
        JsonToken jsonToken = this.peek();
        if (jsonToken != JsonToken.NAME && jsonToken != JsonToken.END_ARRAY && jsonToken != JsonToken.END_OBJECT && jsonToken != JsonToken.END_DOCUMENT) {
            i i8 = (i)this.c();
            this.skipValue();
            return i8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected ");
        stringBuilder.append((Object)jsonToken);
        stringBuilder.append(" when reading a JsonElement.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    @Override
    public void beginArray() throws IOException {
        this.a(JsonToken.BEGIN_ARRAY);
        this.f(((f)this.c()).iterator());
        this.e0[this.c0 - 1] = 0;
    }

    @Override
    public void beginObject() throws IOException {
        this.a(JsonToken.BEGIN_OBJECT);
        this.f(((l)this.c()).s().iterator());
    }

    @Override
    public void close() throws IOException {
        this.q = new Object[]{g0};
        this.c0 = 1;
    }

    public void e() throws IOException {
        this.a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry)((Iterator)this.c()).next();
        this.f(entry.getValue());
        this.f(new o((String)entry.getKey()));
    }

    @Override
    public void endArray() throws IOException {
        this.a(JsonToken.END_ARRAY);
        this.d();
        this.d();
        int n8 = this.c0;
        if (n8 > 0) {
            int[] nArray = this.e0;
            nArray[--n8] = nArray[n8] + 1;
        }
    }

    @Override
    public void endObject() throws IOException {
        this.a(JsonToken.END_OBJECT);
        this.d();
        this.d();
        int n8 = this.c0;
        if (n8 > 0) {
            int[] nArray = this.e0;
            nArray[--n8] = nArray[n8] + 1;
        }
    }

    @Override
    public String getPath() {
        return this.getPath(false);
    }

    @Override
    public String getPreviousPath() {
        return this.getPath(true);
    }

    @Override
    public boolean hasNext() throws IOException {
        JsonToken jsonToken = this.peek();
        return jsonToken != JsonToken.END_OBJECT && jsonToken != JsonToken.END_ARRAY && jsonToken != JsonToken.END_DOCUMENT;
    }

    @Override
    public boolean nextBoolean() throws IOException {
        this.a(JsonToken.BOOLEAN);
        boolean bl = ((o)this.d()).e();
        int n8 = this.c0;
        if (n8 > 0) {
            int[] nArray = this.e0;
            nArray[--n8] = nArray[n8] + 1;
        }
        return bl;
    }

    @Override
    public double nextDouble() throws IOException {
        JsonToken jsonToken;
        Object object = this.peek();
        if (object != (jsonToken = JsonToken.NUMBER) && object != JsonToken.STRING) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected ");
            stringBuilder.append((Object)jsonToken);
            stringBuilder.append(" but was ");
            stringBuilder.append(object);
            stringBuilder.append(this.locationString());
            throw new IllegalStateException(stringBuilder.toString());
        }
        double d8 = ((o)this.c()).r();
        if (!this.isLenient() && (Double.isNaN(d8) || Double.isInfinite(d8))) {
            object = new StringBuilder();
            ((StringBuilder)object).append("JSON forbids NaN and infinities: ");
            ((StringBuilder)object).append(d8);
            throw new NumberFormatException(((StringBuilder)object).toString());
        }
        this.d();
        int n8 = this.c0;
        if (n8 > 0) {
            object = this.e0;
            object[--n8] = object[n8] + true;
        }
        return d8;
    }

    @Override
    public int nextInt() throws IOException {
        Object object;
        JsonToken jsonToken = this.peek();
        if (jsonToken != (object = JsonToken.NUMBER) && jsonToken != JsonToken.STRING) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected ");
            stringBuilder.append(object);
            stringBuilder.append(" but was ");
            stringBuilder.append((Object)jsonToken);
            stringBuilder.append(this.locationString());
            throw new IllegalStateException(stringBuilder.toString());
        }
        int n8 = ((o)this.c()).s();
        this.d();
        int n9 = this.c0;
        if (n9 > 0) {
            object = this.e0;
            object[--n9] = object[n9] + true;
        }
        return n8;
    }

    @Override
    public long nextLong() throws IOException {
        Object object;
        JsonToken jsonToken = this.peek();
        if (jsonToken != (object = JsonToken.NUMBER) && jsonToken != JsonToken.STRING) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected ");
            stringBuilder.append(object);
            stringBuilder.append(" but was ");
            stringBuilder.append((Object)jsonToken);
            stringBuilder.append(this.locationString());
            throw new IllegalStateException(stringBuilder.toString());
        }
        long l8 = ((o)this.c()).t();
        this.d();
        int n8 = this.c0;
        if (n8 > 0) {
            object = this.e0;
            object[--n8] = object[n8] + true;
        }
        return l8;
    }

    @Override
    public String nextName() throws IOException {
        String string;
        this.a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry)((Iterator)this.c()).next();
        this.d0[this.c0 - 1] = string = (String)entry.getKey();
        this.f(entry.getValue());
        return string;
    }

    @Override
    public void nextNull() throws IOException {
        this.a(JsonToken.NULL);
        this.d();
        int n8 = this.c0;
        if (n8 > 0) {
            int[] nArray = this.e0;
            nArray[--n8] = nArray[n8] + 1;
        }
    }

    @Override
    public String nextString() throws IOException {
        JsonToken jsonToken;
        Object object = this.peek();
        if (object != (jsonToken = JsonToken.STRING) && object != JsonToken.NUMBER) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected ");
            stringBuilder.append((Object)jsonToken);
            stringBuilder.append(" but was ");
            stringBuilder.append(object);
            stringBuilder.append(this.locationString());
            throw new IllegalStateException(stringBuilder.toString());
        }
        String string = ((o)this.d()).k();
        int n8 = this.c0;
        if (n8 > 0) {
            object = this.e0;
            object[--n8] = object[n8] + true;
        }
        return string;
    }

    @Override
    public JsonToken peek() throws IOException {
        if (this.c0 == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object object = this.c();
        if (object instanceof Iterator) {
            boolean bl = this.q[this.c0 - 2] instanceof l;
            if ((object = (Iterator)object).hasNext()) {
                if (bl) {
                    return JsonToken.NAME;
                }
                this.f(object.next());
                return this.peek();
            }
            if (bl) {
                return JsonToken.END_OBJECT;
            }
            return JsonToken.END_ARRAY;
        }
        if (object instanceof l) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (object instanceof f) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (object instanceof o) {
            if (((o)(object = (o)object)).z()) {
                return JsonToken.STRING;
            }
            if (((o)object).w()) {
                return JsonToken.BOOLEAN;
            }
            if (((o)object).y()) {
                return JsonToken.NUMBER;
            }
            throw new AssertionError();
        }
        if (object instanceof k) {
            return JsonToken.NULL;
        }
        if (object == g0) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new AssertionError();
    }

    @Override
    public void skipValue() throws IOException {
        int n8;
        if (this.peek() == JsonToken.NAME) {
            this.nextName();
            this.d0[this.c0 - 2] = "null";
        } else {
            this.d();
            n8 = this.c0;
            if (n8 > 0) {
                this.d0[n8 - 1] = "null";
            }
        }
        n8 = this.c0;
        if (n8 > 0) {
            int[] nArray = this.e0;
            nArray[--n8] = nArray[n8] + 1;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a.class.getSimpleName());
        stringBuilder.append(this.locationString());
        return stringBuilder.toString();
    }
}

