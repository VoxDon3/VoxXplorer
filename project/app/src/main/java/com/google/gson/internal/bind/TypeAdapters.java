/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import ax.r8.i;
import ax.r8.j;
import ax.r8.k;
import ax.r8.l;
import ax.r8.o;
import ax.r8.r;
import ax.r8.w;
import ax.s8.c;
import ax.t8.f;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class TypeAdapters {
    public static final TypeAdapter<BigInteger> A;
    public static final TypeAdapter<f> B;
    public static final w C;
    public static final TypeAdapter<StringBuilder> D;
    public static final w E;
    public static final TypeAdapter<StringBuffer> F;
    public static final w G;
    public static final TypeAdapter<URL> H;
    public static final w I;
    public static final TypeAdapter<URI> J;
    public static final w K;
    public static final TypeAdapter<InetAddress> L;
    public static final w M;
    public static final TypeAdapter<UUID> N;
    public static final w O;
    public static final TypeAdapter<Currency> P;
    public static final w Q;
    public static final TypeAdapter<Calendar> R;
    public static final w S;
    public static final TypeAdapter<Locale> T;
    public static final w U;
    public static final TypeAdapter<i> V;
    public static final w W;
    public static final w X;
    public static final TypeAdapter<Class> a;
    public static final w b;
    public static final TypeAdapter<BitSet> c;
    public static final w d;
    public static final TypeAdapter<Boolean> e;
    public static final TypeAdapter<Boolean> f;
    public static final w g;
    public static final TypeAdapter<Number> h;
    public static final w i;
    public static final TypeAdapter<Number> j;
    public static final w k;
    public static final TypeAdapter<Number> l;
    public static final w m;
    public static final TypeAdapter<AtomicInteger> n;
    public static final w o;
    public static final TypeAdapter<AtomicBoolean> p;
    public static final w q;
    public static final TypeAdapter<AtomicIntegerArray> r;
    public static final w s;
    public static final TypeAdapter<Number> t;
    public static final TypeAdapter<Number> u;
    public static final TypeAdapter<Number> v;
    public static final TypeAdapter<Character> w;
    public static final w x;
    public static final TypeAdapter<String> y;
    public static final TypeAdapter<BigDecimal> z;

    static {
        TypeAdapter<Object> typeAdapter = new TypeAdapter<Class>(){

            public Class f(JsonReader jsonReader) throws IOException {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            public void g(JsonWriter object, Class clazz) throws IOException {
                object = new StringBuilder();
                ((StringBuilder)object).append("Attempted to serialize java.lang.Class: ");
                ((StringBuilder)object).append(clazz.getName());
                ((StringBuilder)object).append(". Forgot to register a type adapter?");
                throw new UnsupportedOperationException(((StringBuilder)object).toString());
            }
        }.b();
        a = typeAdapter;
        b = TypeAdapters.b(Class.class, typeAdapter);
        typeAdapter = new TypeAdapter<BitSet>(){

            public BitSet f(JsonReader jsonReader) throws IOException {
                Serializable serializable = new BitSet();
                jsonReader.beginArray();
                Object object = jsonReader.peek();
                int n8 = 0;
                while (object != JsonToken.END_ARRAY) {
                    int n9;
                    block9: {
                        boolean bl;
                        block7: {
                            block8: {
                                block5: {
                                    block6: {
                                        n9 = com.google.gson.internal.bind.TypeAdapters$a.a[((Enum)object).ordinal()];
                                        bl = true;
                                        if (n9 == 1 || n9 == 2) break block5;
                                        if (n9 != 3) break block6;
                                        bl = jsonReader.nextBoolean();
                                        break block7;
                                    }
                                    serializable = new StringBuilder();
                                    ((StringBuilder)serializable).append("Invalid bitset value type: ");
                                    ((StringBuilder)serializable).append(object);
                                    ((StringBuilder)serializable).append("; at path ");
                                    ((StringBuilder)serializable).append(jsonReader.getPath());
                                    throw new r(((StringBuilder)serializable).toString());
                                }
                                n9 = jsonReader.nextInt();
                                if (n9 != 0) break block8;
                                bl = false;
                                break block7;
                            }
                            if (n9 != 1) break block9;
                        }
                        if (bl) {
                            ((BitSet)serializable).set(n8);
                        }
                        ++n8;
                        object = jsonReader.peek();
                        continue;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Invalid bitset value ");
                    ((StringBuilder)object).append(n9);
                    ((StringBuilder)object).append(", expected 0 or 1; at path ");
                    ((StringBuilder)object).append(jsonReader.getPreviousPath());
                    throw new r(((StringBuilder)object).toString());
                }
                jsonReader.endArray();
                return serializable;
            }

            public void g(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
                jsonWriter.beginArray();
                int n8 = bitSet.length();
                for (int i8 = 0; i8 < n8; ++i8) {
                    jsonWriter.value((long)bitSet.get(i8));
                }
                jsonWriter.endArray();
            }
        }.b();
        c = typeAdapter;
        d = TypeAdapters.b(BitSet.class, typeAdapter);
        e = typeAdapter = new TypeAdapter<Boolean>(){

            public Boolean f(JsonReader jsonReader) throws IOException {
                JsonToken jsonToken = jsonReader.peek();
                if (jsonToken == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                if (jsonToken == JsonToken.STRING) {
                    return Boolean.parseBoolean(jsonReader.nextString());
                }
                return jsonReader.nextBoolean();
            }

            public void g(JsonWriter jsonWriter, Boolean bl) throws IOException {
                jsonWriter.value(bl);
            }
        };
        f = new TypeAdapter<Boolean>(){

            public Boolean f(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return Boolean.valueOf(jsonReader.nextString());
            }

            public void g(JsonWriter jsonWriter, Boolean object) throws IOException {
                object = object == null ? "null" : ((Boolean)object).toString();
                jsonWriter.value((String)object);
            }
        };
        g = TypeAdapters.c(Boolean.TYPE, Boolean.class, typeAdapter);
        h = typeAdapter = new TypeAdapter<Number>(){

            public Number f(JsonReader jsonReader) throws IOException {
                int n8;
                block3: {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    try {
                        n8 = jsonReader.nextInt();
                        if (n8 > 255 || n8 < -128) break block3;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw new r(numberFormatException);
                    }
                    return (byte)n8;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Lossy conversion from ");
                stringBuilder.append(n8);
                stringBuilder.append(" to byte; at path ");
                stringBuilder.append(jsonReader.getPreviousPath());
                throw new r(stringBuilder.toString());
            }

            public void g(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        i = TypeAdapters.c(Byte.TYPE, Byte.class, typeAdapter);
        j = typeAdapter = new TypeAdapter<Number>(){

            public Number f(JsonReader jsonReader) throws IOException {
                int n8;
                block3: {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    try {
                        n8 = jsonReader.nextInt();
                        if (n8 > 65535 || n8 < Short.MIN_VALUE) break block3;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw new r(numberFormatException);
                    }
                    return (short)n8;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Lossy conversion from ");
                stringBuilder.append(n8);
                stringBuilder.append(" to short; at path ");
                stringBuilder.append(jsonReader.getPreviousPath());
                throw new r(stringBuilder.toString());
            }

            public void g(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        k = TypeAdapters.c(Short.TYPE, Short.class, typeAdapter);
        l = typeAdapter = new TypeAdapter<Number>(){

            public Number f(JsonReader jsonReader) throws IOException {
                int n8;
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    n8 = jsonReader.nextInt();
                }
                catch (NumberFormatException numberFormatException) {
                    throw new r(numberFormatException);
                }
                return n8;
            }

            public void g(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        m = TypeAdapters.c(Integer.TYPE, Integer.class, typeAdapter);
        n = typeAdapter = new TypeAdapter<AtomicInteger>(){

            public AtomicInteger f(JsonReader object) throws IOException {
                try {
                    object = new AtomicInteger(((JsonReader)object).nextInt());
                    return object;
                }
                catch (NumberFormatException numberFormatException) {
                    throw new r(numberFormatException);
                }
            }

            public void g(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
                jsonWriter.value(atomicInteger.get());
            }
        }.b();
        o = TypeAdapters.b(AtomicInteger.class, typeAdapter);
        p = typeAdapter = new TypeAdapter<AtomicBoolean>(){

            public AtomicBoolean f(JsonReader jsonReader) throws IOException {
                return new AtomicBoolean(jsonReader.nextBoolean());
            }

            public void g(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) throws IOException {
                jsonWriter.value(atomicBoolean.get());
            }
        }.b();
        q = TypeAdapters.b(AtomicBoolean.class, typeAdapter);
        r = typeAdapter = new TypeAdapter<AtomicIntegerArray>(){

            public AtomicIntegerArray f(JsonReader object) throws IOException {
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
                ((JsonReader)object).beginArray();
                while (((JsonReader)object).hasNext()) {
                    try {
                        arrayList.add(((JsonReader)object).nextInt());
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw new r(numberFormatException);
                    }
                }
                ((JsonReader)object).endArray();
                int n8 = arrayList.size();
                object = new AtomicIntegerArray(n8);
                for (int i8 = 0; i8 < n8; ++i8) {
                    ((AtomicIntegerArray)object).set(i8, (Integer)arrayList.get(i8));
                }
                return object;
            }

            public void g(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
                jsonWriter.beginArray();
                int n8 = atomicIntegerArray.length();
                for (int i8 = 0; i8 < n8; ++i8) {
                    jsonWriter.value(atomicIntegerArray.get(i8));
                }
                jsonWriter.endArray();
            }
        }.b();
        s = TypeAdapters.b(AtomicIntegerArray.class, typeAdapter);
        t = new TypeAdapter<Number>(){

            public Number f(JsonReader jsonReader) throws IOException {
                long l8;
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    l8 = jsonReader.nextLong();
                }
                catch (NumberFormatException numberFormatException) {
                    throw new r(numberFormatException);
                }
                return l8;
            }

            public void g(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        u = new TypeAdapter<Number>(){

            public Number f(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return Float.valueOf((float)jsonReader.nextDouble());
            }

            public void g(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        v = new TypeAdapter<Number>(){

            public Number f(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return jsonReader.nextDouble();
            }

            public void g(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        w = typeAdapter = new TypeAdapter<Character>(){

            public Character f(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String string = jsonReader.nextString();
                if (string.length() == 1) {
                    return Character.valueOf(string.charAt(0));
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Expecting character, got: ");
                stringBuilder.append(string);
                stringBuilder.append("; at ");
                stringBuilder.append(jsonReader.getPreviousPath());
                throw new r(stringBuilder.toString());
            }

            public void g(JsonWriter jsonWriter, Character object) throws IOException {
                object = object == null ? null : String.valueOf(object);
                jsonWriter.value((String)object);
            }
        };
        x = TypeAdapters.c(Character.TYPE, Character.class, typeAdapter);
        y = typeAdapter = new TypeAdapter<String>(){

            public String f(JsonReader jsonReader) throws IOException {
                JsonToken jsonToken = jsonReader.peek();
                if (jsonToken == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                if (jsonToken == JsonToken.BOOLEAN) {
                    return Boolean.toString(jsonReader.nextBoolean());
                }
                return jsonReader.nextString();
            }

            public void g(JsonWriter jsonWriter, String string) throws IOException {
                jsonWriter.value(string);
            }
        };
        z = new TypeAdapter<BigDecimal>(){

            public BigDecimal f(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String string = jsonReader.nextString();
                try {
                    BigDecimal bigDecimal = new BigDecimal(string);
                    return bigDecimal;
                }
                catch (NumberFormatException numberFormatException) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed parsing '");
                    stringBuilder.append(string);
                    stringBuilder.append("' as BigDecimal; at path ");
                    stringBuilder.append(jsonReader.getPreviousPath());
                    throw new r(stringBuilder.toString(), numberFormatException);
                }
            }

            public void g(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
                jsonWriter.value(bigDecimal);
            }
        };
        A = new TypeAdapter<BigInteger>(){

            public BigInteger f(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String string = jsonReader.nextString();
                try {
                    BigInteger bigInteger = new BigInteger(string);
                    return bigInteger;
                }
                catch (NumberFormatException numberFormatException) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed parsing '");
                    stringBuilder.append(string);
                    stringBuilder.append("' as BigInteger; at path ");
                    stringBuilder.append(jsonReader.getPreviousPath());
                    throw new r(stringBuilder.toString(), numberFormatException);
                }
            }

            public void g(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
                jsonWriter.value(bigInteger);
            }
        };
        B = new TypeAdapter<f>(){

            public f f(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return new f(jsonReader.nextString());
            }

            public void g(JsonWriter jsonWriter, f f8) throws IOException {
                jsonWriter.value(f8);
            }
        };
        C = TypeAdapters.b(String.class, typeAdapter);
        D = typeAdapter = new TypeAdapter<StringBuilder>(){

            public StringBuilder f(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return new StringBuilder(jsonReader.nextString());
            }

            public void g(JsonWriter jsonWriter, StringBuilder charSequence) throws IOException {
                charSequence = charSequence == null ? null : charSequence.toString();
                jsonWriter.value((String)charSequence);
            }
        };
        E = TypeAdapters.b(StringBuilder.class, typeAdapter);
        F = typeAdapter = new TypeAdapter<StringBuffer>(){

            public StringBuffer f(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return new StringBuffer(jsonReader.nextString());
            }

            public void g(JsonWriter jsonWriter, StringBuffer charSequence) throws IOException {
                charSequence = charSequence == null ? null : charSequence.toString();
                jsonWriter.value((String)charSequence);
            }
        };
        G = TypeAdapters.b(StringBuffer.class, typeAdapter);
        H = typeAdapter = new TypeAdapter<URL>(){

            public URL f(JsonReader object) throws IOException {
                if (((JsonReader)object).peek() == JsonToken.NULL) {
                    ((JsonReader)object).nextNull();
                    return null;
                }
                if ("null".equals(object = ((JsonReader)object).nextString())) {
                    return null;
                }
                return new URL((String)object);
            }

            public void g(JsonWriter jsonWriter, URL object) throws IOException {
                object = object == null ? null : ((URL)object).toExternalForm();
                jsonWriter.value((String)object);
            }
        };
        I = TypeAdapters.b(URL.class, typeAdapter);
        J = typeAdapter = new TypeAdapter<URI>(){

            public URI f(JsonReader object) throws IOException {
                block4: {
                    if (((JsonReader)object).peek() == JsonToken.NULL) {
                        ((JsonReader)object).nextNull();
                        return null;
                    }
                    try {
                        object = ((JsonReader)object).nextString();
                        if (!"null".equals(object)) break block4;
                        return null;
                    }
                    catch (URISyntaxException uRISyntaxException) {
                        throw new j(uRISyntaxException);
                    }
                }
                object = new URI((String)object);
                return object;
            }

            public void g(JsonWriter jsonWriter, URI object) throws IOException {
                object = object == null ? null : ((URI)object).toASCIIString();
                jsonWriter.value((String)object);
            }
        };
        K = TypeAdapters.b(URI.class, typeAdapter);
        L = typeAdapter = new TypeAdapter<InetAddress>(){

            public InetAddress f(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return InetAddress.getByName(jsonReader.nextString());
            }

            public void g(JsonWriter jsonWriter, InetAddress object) throws IOException {
                object = object == null ? null : ((InetAddress)object).getHostAddress();
                jsonWriter.value((String)object);
            }
        };
        M = TypeAdapters.e(InetAddress.class, typeAdapter);
        N = typeAdapter = new TypeAdapter<UUID>(){

            public UUID f(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String string = jsonReader.nextString();
                try {
                    UUID uUID = UUID.fromString(string);
                    return uUID;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed parsing '");
                    stringBuilder.append(string);
                    stringBuilder.append("' as UUID; at path ");
                    stringBuilder.append(jsonReader.getPreviousPath());
                    throw new r(stringBuilder.toString(), illegalArgumentException);
                }
            }

            public void g(JsonWriter jsonWriter, UUID object) throws IOException {
                object = object == null ? null : ((UUID)object).toString();
                jsonWriter.value((String)object);
            }
        };
        O = TypeAdapters.b(UUID.class, typeAdapter);
        P = typeAdapter = new TypeAdapter<Currency>(){

            public Currency f(JsonReader jsonReader) throws IOException {
                String string = jsonReader.nextString();
                try {
                    Currency currency = Currency.getInstance(string);
                    return currency;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed parsing '");
                    stringBuilder.append(string);
                    stringBuilder.append("' as Currency; at path ");
                    stringBuilder.append(jsonReader.getPreviousPath());
                    throw new r(stringBuilder.toString(), illegalArgumentException);
                }
            }

            public void g(JsonWriter jsonWriter, Currency currency) throws IOException {
                jsonWriter.value(currency.getCurrencyCode());
            }
        }.b();
        Q = TypeAdapters.b(Currency.class, typeAdapter);
        R = typeAdapter = new TypeAdapter<Calendar>(){

            public Calendar f(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                int n8 = 0;
                int n9 = 0;
                int n10 = 0;
                int n11 = 0;
                int n12 = 0;
                int n13 = 0;
                while (jsonReader.peek() != JsonToken.END_OBJECT) {
                    String string = jsonReader.nextName();
                    int n14 = jsonReader.nextInt();
                    if ("year".equals(string)) {
                        n8 = n14;
                        continue;
                    }
                    if ("month".equals(string)) {
                        n9 = n14;
                        continue;
                    }
                    if ("dayOfMonth".equals(string)) {
                        n10 = n14;
                        continue;
                    }
                    if ("hourOfDay".equals(string)) {
                        n11 = n14;
                        continue;
                    }
                    if ("minute".equals(string)) {
                        n12 = n14;
                        continue;
                    }
                    if (!"second".equals(string)) continue;
                    n13 = n14;
                }
                jsonReader.endObject();
                return new GregorianCalendar(n8, n9, n10, n11, n12, n13);
            }

            public void g(JsonWriter jsonWriter, Calendar calendar) throws IOException {
                if (calendar == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginObject();
                jsonWriter.name("year");
                jsonWriter.value(calendar.get(1));
                jsonWriter.name("month");
                jsonWriter.value(calendar.get(2));
                jsonWriter.name("dayOfMonth");
                jsonWriter.value(calendar.get(5));
                jsonWriter.name("hourOfDay");
                jsonWriter.value(calendar.get(11));
                jsonWriter.name("minute");
                jsonWriter.value(calendar.get(12));
                jsonWriter.name("second");
                jsonWriter.value(calendar.get(13));
                jsonWriter.endObject();
            }
        };
        S = TypeAdapters.d(Calendar.class, GregorianCalendar.class, typeAdapter);
        T = typeAdapter = new TypeAdapter<Locale>(){

            public Locale f(JsonReader object) throws IOException {
                Object object2 = ((JsonReader)object).peek();
                Object object3 = JsonToken.NULL;
                String string = null;
                if (object2 == object3) {
                    ((JsonReader)object).nextNull();
                    return null;
                }
                object3 = new StringTokenizer(((JsonReader)object).nextString(), "_");
                object = ((StringTokenizer)object3).hasMoreElements() ? ((StringTokenizer)object3).nextToken() : null;
                object2 = ((StringTokenizer)object3).hasMoreElements() ? ((StringTokenizer)object3).nextToken() : null;
                if (((StringTokenizer)object3).hasMoreElements()) {
                    string = ((StringTokenizer)object3).nextToken();
                }
                if (object2 == null && string == null) {
                    return new Locale((String)object);
                }
                if (string == null) {
                    return new Locale((String)object, (String)object2);
                }
                return new Locale((String)object, (String)object2, string);
            }

            public void g(JsonWriter jsonWriter, Locale object) throws IOException {
                object = object == null ? null : ((Locale)object).toString();
                jsonWriter.value((String)object);
            }
        };
        U = TypeAdapters.b(Locale.class, typeAdapter);
        V = typeAdapter = new TypeAdapter<i>(){

            private i g(JsonReader object, JsonToken jsonToken) throws IOException {
                int n8 = com.google.gson.internal.bind.TypeAdapters$a.a[jsonToken.ordinal()];
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) {
                            if (n8 == 6) {
                                ((JsonReader)object).nextNull();
                                return ax.r8.k.q;
                            }
                            object = new StringBuilder();
                            ((StringBuilder)object).append("Unexpected token: ");
                            ((StringBuilder)object).append((Object)jsonToken);
                            throw new IllegalStateException(((StringBuilder)object).toString());
                        }
                        return new o(((JsonReader)object).nextBoolean());
                    }
                    return new o(((JsonReader)object).nextString());
                }
                return new o(new f(((JsonReader)object).nextString()));
            }

            private i h(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
                int n8 = com.google.gson.internal.bind.TypeAdapters$a.a[jsonToken.ordinal()];
                if (n8 != 4) {
                    if (n8 != 5) {
                        return null;
                    }
                    jsonReader.beginObject();
                    return new l();
                }
                jsonReader.beginArray();
                return new ax.r8.f();
            }

            public i f(JsonReader jsonReader) throws IOException {
                if (jsonReader instanceof com.google.gson.internal.bind.a) {
                    return ((com.google.gson.internal.bind.a)jsonReader).b();
                }
                Object object = jsonReader.peek();
                Object object2 = this.h(jsonReader, (JsonToken)((Object)object));
                if (object2 == null) {
                    return this.g(jsonReader, (JsonToken)((Object)object));
                }
                ArrayDeque<i> arrayDeque = new ArrayDeque<i>();
                while (true) {
                    if (jsonReader.hasNext()) {
                        String string = object2 instanceof l ? jsonReader.nextName() : null;
                        JsonToken jsonToken = jsonReader.peek();
                        i i8 = this.h(jsonReader, jsonToken);
                        boolean bl = i8 != null;
                        object = i8;
                        if (i8 == null) {
                            object = this.g(jsonReader, jsonToken);
                        }
                        if (object2 instanceof ax.r8.f) {
                            ((ax.r8.f)object2).r((i)object);
                        } else {
                            ((l)object2).r(string, (i)object);
                        }
                        if (!bl) continue;
                        arrayDeque.addLast((i)object2);
                        object2 = object;
                        continue;
                    }
                    if (object2 instanceof ax.r8.f) {
                        jsonReader.endArray();
                    } else {
                        jsonReader.endObject();
                    }
                    if (arrayDeque.isEmpty()) {
                        return object2;
                    }
                    object2 = (i)arrayDeque.removeLast();
                }
            }

            public void i(JsonWriter object, i entry2) throws IOException {
                if (entry2 != null && !((i)((Object)entry2)).n()) {
                    if (((i)((Object)entry2)).q()) {
                        if (((o)((Object)(entry2 = ((i)((Object)entry2)).i()))).y()) {
                            ((JsonWriter)object).value(((o)((Object)entry2)).u());
                            return;
                        }
                        if (((o)((Object)entry2)).w()) {
                            ((JsonWriter)object).value(((o)((Object)entry2)).e());
                            return;
                        }
                        ((JsonWriter)object).value(((o)((Object)entry2)).k());
                        return;
                    }
                    if (((i)((Object)entry2)).l()) {
                        ((JsonWriter)object).beginArray();
                        entry2 = ((i)((Object)entry2)).g().iterator();
                        while (entry2.hasNext()) {
                            this.i((JsonWriter)object, (i)entry2.next());
                        }
                        ((JsonWriter)object).endArray();
                        return;
                    }
                    if (((i)((Object)entry2)).p()) {
                        ((JsonWriter)object).beginObject();
                        for (Map.Entry<String, i> entry2 : ((i)((Object)entry2)).h().s()) {
                            ((JsonWriter)object).name(entry2.getKey());
                            this.i((JsonWriter)object, entry2.getValue());
                        }
                        ((JsonWriter)object).endObject();
                        return;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Couldn't write ");
                    ((StringBuilder)object).append(entry2.getClass());
                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                }
                ((JsonWriter)object).nullValue();
            }
        };
        W = TypeAdapters.e(i.class, typeAdapter);
        X = new w(){

            @Override
            public <T> TypeAdapter<T> b(Gson clazz, ax.x8.a<T> object) {
                if (Enum.class.isAssignableFrom((Class<?>)(object = ((ax.x8.a)object).c())) && object != Enum.class) {
                    clazz = object;
                    if (!((Class)object).isEnum()) {
                        clazz = ((Class)object).getSuperclass();
                    }
                    return new EnumTypeAdapter(clazz);
                }
                return null;
            }
        };
    }

    public static <TT> w a(ax.x8.a<TT> a8, TypeAdapter<TT> typeAdapter) {
        return new w(a8, typeAdapter){
            final TypeAdapter c0;
            final ax.x8.a q;
            {
                this.q = a8;
                this.c0 = typeAdapter;
            }

            @Override
            public <T> TypeAdapter<T> b(Gson gson, ax.x8.a<T> a8) {
                if (a8.equals(this.q)) {
                    return this.c0;
                }
                return null;
            }
        };
    }

    public static <TT> w b(Class<TT> clazz, TypeAdapter<TT> typeAdapter) {
        return new w(clazz, typeAdapter){
            final TypeAdapter c0;
            final Class q;
            {
                this.q = clazz;
                this.c0 = typeAdapter;
            }

            @Override
            public <T> TypeAdapter<T> b(Gson gson, ax.x8.a<T> a8) {
                if (a8.c() == this.q) {
                    return this.c0;
                }
                return null;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Factory[type=");
                stringBuilder.append(this.q.getName());
                stringBuilder.append(",adapter=");
                stringBuilder.append(this.c0);
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
        };
    }

    public static <TT> w c(Class<TT> clazz, Class<TT> clazz2, TypeAdapter<? super TT> typeAdapter) {
        return new w(clazz, clazz2, typeAdapter){
            final Class c0;
            final TypeAdapter d0;
            final Class q;
            {
                this.q = clazz;
                this.c0 = clazz2;
                this.d0 = typeAdapter;
            }

            @Override
            public <T> TypeAdapter<T> b(Gson clazz, ax.x8.a<T> a8) {
                clazz = a8.c();
                if (clazz != this.q && clazz != this.c0) {
                    return null;
                }
                return this.d0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Factory[type=");
                stringBuilder.append(this.c0.getName());
                stringBuilder.append("+");
                stringBuilder.append(this.q.getName());
                stringBuilder.append(",adapter=");
                stringBuilder.append(this.d0);
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
        };
    }

    public static <TT> w d(Class<TT> clazz, Class<? extends TT> clazz2, TypeAdapter<? super TT> typeAdapter) {
        return new w(clazz, clazz2, typeAdapter){
            final Class c0;
            final TypeAdapter d0;
            final Class q;
            {
                this.q = clazz;
                this.c0 = clazz2;
                this.d0 = typeAdapter;
            }

            @Override
            public <T> TypeAdapter<T> b(Gson clazz, ax.x8.a<T> a8) {
                clazz = a8.c();
                if (clazz != this.q && clazz != this.c0) {
                    return null;
                }
                return this.d0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Factory[type=");
                stringBuilder.append(this.q.getName());
                stringBuilder.append("+");
                stringBuilder.append(this.c0.getName());
                stringBuilder.append(",adapter=");
                stringBuilder.append(this.d0);
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
        };
    }

    public static <T1> w e(Class<T1> clazz, TypeAdapter<T1> typeAdapter) {
        return new w(clazz, typeAdapter){
            final TypeAdapter c0;
            final Class q;
            {
                this.q = clazz;
                this.c0 = typeAdapter;
            }

            public <T2> TypeAdapter<T2> b(Gson clazz, ax.x8.a<T2> a8) {
                clazz = a8.c();
                if (!this.q.isAssignableFrom(clazz)) {
                    return null;
                }
                return new TypeAdapter<T1>(this, clazz){
                    final Class a;
                    final 34 b;
                    {
                        this.b = var1_1;
                        this.a = clazz;
                    }

                    @Override
                    public T1 c(JsonReader jsonReader) throws IOException {
                        Object t8 = this.b.c0.c(jsonReader);
                        if (t8 != null && !this.a.isInstance(t8)) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Expected a ");
                            stringBuilder.append(this.a.getName());
                            stringBuilder.append(" but was ");
                            stringBuilder.append(t8.getClass().getName());
                            stringBuilder.append("; at path ");
                            stringBuilder.append(jsonReader.getPreviousPath());
                            throw new r(stringBuilder.toString());
                        }
                        return t8;
                    }

                    @Override
                    public void e(JsonWriter jsonWriter, T1 T12) throws IOException {
                        this.b.c0.e(jsonWriter, T12);
                    }
                };
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Factory[typeHierarchy=");
                stringBuilder.append(this.q.getName());
                stringBuilder.append(",adapter=");
                stringBuilder.append(this.c0);
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
        };
    }

    private static final class EnumTypeAdapter<T extends Enum<T>>
    extends TypeAdapter<T> {
        private final Map<String, T> a = new HashMap<String, T>();
        private final Map<String, T> b = new HashMap<String, T>();
        private final Map<T, String> c = new HashMap<T, String>();

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public EnumTypeAdapter(Class<T> object) {
            int n8;
            int n9;
            Field[] fieldArray;
            PrivilegedAction<Field[]> privilegedAction;
            try {
                privilegedAction = new PrivilegedAction<Field[]>(this, (Class)object){
                    final Class a;
                    final EnumTypeAdapter b;
                    {
                        this.b = enumTypeAdapter;
                        this.a = clazz;
                    }

                    public Field[] a() {
                        Field[] fieldArray = this.a.getDeclaredFields();
                        ArrayList<Field> arrayList = new ArrayList<Field>(fieldArray.length);
                        for (Field accessibleObjectArray2 : fieldArray) {
                            if (!accessibleObjectArray2.isEnumConstant()) continue;
                            arrayList.add(accessibleObjectArray2);
                        }
                        AccessibleObject[] accessibleObjectArray = arrayList.toArray(new Field[0]);
                        AccessibleObject.setAccessible(accessibleObjectArray, true);
                        return accessibleObjectArray;
                    }
                };
                fieldArray = AccessController.doPrivileged(privilegedAction);
                n9 = fieldArray.length;
                n8 = 0;
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new AssertionError((Object)illegalAccessException);
            }
            while (n8 < n9) {
                String string;
                Enum enum_;
                block7: {
                    privilegedAction = fieldArray[n8];
                    enum_ = (Enum)((Field)((Object)privilegedAction)).get(null);
                    object = enum_.name();
                    string = enum_.toString();
                    String[] stringArray = ((Field)((Object)privilegedAction)).getAnnotation(c.class);
                    if (stringArray == null) break block7;
                    privilegedAction = stringArray.value();
                    stringArray = stringArray.alternate();
                    int n10 = stringArray.length;
                    int n11 = 0;
                    while (true) {
                        object = privilegedAction;
                        if (n11 >= n10) break;
                        object = stringArray[n11];
                        this.a.put((String)object, enum_);
                        ++n11;
                        continue;
                        break;
                    }
                }
                this.a.put((String)object, enum_);
                this.b.put(string, enum_);
                this.c.put(enum_, (String)object);
                ++n8;
            }
            return;
        }

        public T f(JsonReader object) throws IOException {
            if (((JsonReader)object).peek() == JsonToken.NULL) {
                ((JsonReader)object).nextNull();
                return null;
            }
            Enum enum_ = (Enum)this.a.get(object = ((JsonReader)object).nextString());
            if (enum_ == null) {
                return (T)((Enum)this.b.get(object));
            }
            return (T)enum_;
        }

        public void g(JsonWriter jsonWriter, T object) throws IOException {
            object = object == null ? null : this.c.get(object);
            jsonWriter.value((String)object);
        }
    }
}

