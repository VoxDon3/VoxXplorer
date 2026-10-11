package com.google.gson.internal.bind;

import ax.r8.AbstractC3000i;
import ax.r8.C2997f;
import ax.r8.C3001j;
import ax.r8.C3002k;
import ax.r8.C3003l;
import ax.r8.C3006o;
import ax.r8.C3009r;
import ax.r8.InterfaceC3014w;
import ax.s8.InterfaceC3061c;
import ax.t8.f;
import ax.x8.C3475a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes3.dex */
public final class TypeAdapters {
    public static final TypeAdapter<BigInteger> A;
    public static final TypeAdapter<f> B;
    public static final InterfaceC3014w C;
    public static final TypeAdapter<StringBuilder> D;
    public static final InterfaceC3014w E;
    public static final TypeAdapter<StringBuffer> F;
    public static final InterfaceC3014w G;
    public static final TypeAdapter<URL> H;
    public static final InterfaceC3014w I;
    public static final TypeAdapter<URI> J;
    public static final InterfaceC3014w K;
    public static final TypeAdapter<InetAddress> L;
    public static final InterfaceC3014w M;
    public static final TypeAdapter<UUID> N;
    public static final InterfaceC3014w O;
    public static final TypeAdapter<Currency> P;
    public static final InterfaceC3014w Q;
    public static final TypeAdapter<Calendar> R;
    public static final InterfaceC3014w S;
    public static final TypeAdapter<Locale> T;
    public static final InterfaceC3014w U;
    public static final TypeAdapter<AbstractC3000i> V;
    public static final InterfaceC3014w W;
    public static final InterfaceC3014w X;
    public static final TypeAdapter<Class> a;
    public static final InterfaceC3014w b;
    public static final TypeAdapter<BitSet> c;
    public static final InterfaceC3014w d;
    public static final TypeAdapter<Boolean> e;
    public static final TypeAdapter<Boolean> f;
    public static final InterfaceC3014w g;
    public static final TypeAdapter<Number> h;
    public static final InterfaceC3014w i;
    public static final TypeAdapter<Number> j;
    public static final InterfaceC3014w k;
    public static final TypeAdapter<Number> l;
    public static final InterfaceC3014w m;
    public static final TypeAdapter<AtomicInteger> n;
    public static final InterfaceC3014w o;
    public static final TypeAdapter<AtomicBoolean> p;
    public static final InterfaceC3014w q;
    public static final TypeAdapter<AtomicIntegerArray> r;
    public static final InterfaceC3014w s;
    public static final TypeAdapter<Number> t;
    public static final TypeAdapter<Number> u;
    public static final TypeAdapter<Number> v;
    public static final TypeAdapter<Character> w;
    public static final InterfaceC3014w x;
    public static final TypeAdapter<String> y;
    public static final TypeAdapter<BigDecimal> z;

    private static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {
        private final Map<String, T> a = new HashMap();
        private final Map<String, T> b = new HashMap();
        private final Map<T, String> c = new HashMap();

        class a implements PrivilegedAction<Field[]> {
            final /* synthetic */ Class a;

            a(Class cls) {
                this.a = cls;
            }

            @Override // java.security.PrivilegedAction
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Field[] run() {
                Field[] declaredFields = this.a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public EnumTypeAdapter(Class<T> cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum r4 = (Enum) field.get(null);
                    String name = r4.name();
                    String str = r4.toString();
                    InterfaceC3061c interfaceC3061c = (InterfaceC3061c) field.getAnnotation(InterfaceC3061c.class);
                    if (interfaceC3061c != null) {
                        name = interfaceC3061c.value();
                        for (String str2 : interfaceC3061c.alternate()) {
                            this.a.put(str2, r4);
                        }
                    }
                    this.a.put(name, r4);
                    this.b.put(str, r4);
                    this.c.put(r4, name);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public T c(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String nextString = jsonReader.nextString();
            T t = this.a.get(nextString);
            return t == null ? this.b.get(nextString) : t;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(JsonWriter jsonWriter, T t) throws IOException {
            jsonWriter.value(t == null ? null : this.c.get(t));
        }
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            a = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonToken.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonToken.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[JsonToken.BEGIN_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[JsonToken.BEGIN_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        TypeAdapter<Class> b2 = new TypeAdapter<Class>() { // from class: com.google.gson.internal.bind.TypeAdapters.1
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public Class c(JsonReader jsonReader) throws IOException {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, Class cls) throws IOException {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
            }
        }.b();
        a = b2;
        b = b(Class.class, b2);
        TypeAdapter<BitSet> b3 = new TypeAdapter<BitSet>() { // from class: com.google.gson.internal.bind.TypeAdapters.2
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public BitSet c(JsonReader jsonReader) throws IOException {
                BitSet bitSet = new BitSet();
                jsonReader.beginArray();
                JsonToken peek = jsonReader.peek();
                int i2 = 0;
                while (peek != JsonToken.END_ARRAY) {
                    int i3 = a.a[peek.ordinal()];
                    boolean z2 = true;
                    if (i3 == 1 || i3 == 2) {
                        int nextInt = jsonReader.nextInt();
                        if (nextInt == 0) {
                            z2 = false;
                        } else if (nextInt != 1) {
                            throw new C3009r("Invalid bitset value " + nextInt + ", expected 0 or 1; at path " + jsonReader.getPreviousPath());
                        }
                    } else {
                        if (i3 != 3) {
                            throw new C3009r("Invalid bitset value type: " + peek + "; at path " + jsonReader.getPath());
                        }
                        z2 = jsonReader.nextBoolean();
                    }
                    if (z2) {
                        bitSet.set(i2);
                    }
                    i2++;
                    peek = jsonReader.peek();
                }
                jsonReader.endArray();
                return bitSet;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
                jsonWriter.beginArray();
                int length = bitSet.length();
                for (int i2 = 0; i2 < length; i2++) {
                    jsonWriter.value(bitSet.get(i2) ? 1L : 0L);
                }
                jsonWriter.endArray();
            }
        }.b();
        c = b3;
        d = b(BitSet.class, b3);
        TypeAdapter<Boolean> typeAdapter = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public Boolean c(JsonReader jsonReader) throws IOException {
                JsonToken peek = jsonReader.peek();
                if (peek != JsonToken.NULL) {
                    return peek == JsonToken.STRING ? Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString())) : Boolean.valueOf(jsonReader.nextBoolean());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, Boolean bool) throws IOException {
                jsonWriter.value(bool);
            }
        };
        e = typeAdapter;
        f = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public Boolean c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Boolean.valueOf(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, Boolean bool) throws IOException {
                jsonWriter.value(bool == null ? "null" : bool.toString());
            }
        };
        g = c(Boolean.TYPE, Boolean.class, typeAdapter);
        TypeAdapter<Number> typeAdapter2 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public Number c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    int nextInt = jsonReader.nextInt();
                    if (nextInt <= 255 && nextInt >= -128) {
                        return Byte.valueOf((byte) nextInt);
                    }
                    throw new C3009r("Lossy conversion from " + nextInt + " to byte; at path " + jsonReader.getPreviousPath());
                } catch (NumberFormatException e2) {
                    throw new C3009r(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        h = typeAdapter2;
        i = c(Byte.TYPE, Byte.class, typeAdapter2);
        TypeAdapter<Number> typeAdapter3 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public Number c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    int nextInt = jsonReader.nextInt();
                    if (nextInt <= 65535 && nextInt >= -32768) {
                        return Short.valueOf((short) nextInt);
                    }
                    throw new C3009r("Lossy conversion from " + nextInt + " to short; at path " + jsonReader.getPreviousPath());
                } catch (NumberFormatException e2) {
                    throw new C3009r(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        j = typeAdapter3;
        k = c(Short.TYPE, Short.class, typeAdapter3);
        TypeAdapter<Number> typeAdapter4 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public Number c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Integer.valueOf(jsonReader.nextInt());
                } catch (NumberFormatException e2) {
                    throw new C3009r(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        l = typeAdapter4;
        m = c(Integer.TYPE, Integer.class, typeAdapter4);
        TypeAdapter<AtomicInteger> b4 = new TypeAdapter<AtomicInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public AtomicInteger c(JsonReader jsonReader) throws IOException {
                try {
                    return new AtomicInteger(jsonReader.nextInt());
                } catch (NumberFormatException e2) {
                    throw new C3009r(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
                jsonWriter.value(atomicInteger.get());
            }
        }.b();
        n = b4;
        o = b(AtomicInteger.class, b4);
        TypeAdapter<AtomicBoolean> b5 = new TypeAdapter<AtomicBoolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public AtomicBoolean c(JsonReader jsonReader) throws IOException {
                return new AtomicBoolean(jsonReader.nextBoolean());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) throws IOException {
                jsonWriter.value(atomicBoolean.get());
            }
        }.b();
        p = b5;
        q = b(AtomicBoolean.class, b5);
        TypeAdapter<AtomicIntegerArray> b6 = new TypeAdapter<AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public AtomicIntegerArray c(JsonReader jsonReader) throws IOException {
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    try {
                        arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                    } catch (NumberFormatException e2) {
                        throw new C3009r(e2);
                    }
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
                jsonWriter.beginArray();
                int length = atomicIntegerArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    jsonWriter.value(atomicIntegerArray.get(i2));
                }
                jsonWriter.endArray();
            }
        }.b();
        r = b6;
        s = b(AtomicIntegerArray.class, b6);
        t = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public Number c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Long.valueOf(jsonReader.nextLong());
                } catch (NumberFormatException e2) {
                    throw new C3009r(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        u = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public Number c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Float.valueOf((float) jsonReader.nextDouble());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        v = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public Number c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Double.valueOf(jsonReader.nextDouble());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        TypeAdapter<Character> typeAdapter5 = new TypeAdapter<Character>() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public Character c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                if (nextString.length() == 1) {
                    return Character.valueOf(nextString.charAt(0));
                }
                throw new C3009r("Expecting character, got: " + nextString + "; at " + jsonReader.getPreviousPath());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, Character ch) throws IOException {
                jsonWriter.value(ch == null ? null : String.valueOf(ch));
            }
        };
        w = typeAdapter5;
        x = c(Character.TYPE, Character.class, typeAdapter5);
        TypeAdapter<String> typeAdapter6 = new TypeAdapter<String>() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public String c(JsonReader jsonReader) throws IOException {
                JsonToken peek = jsonReader.peek();
                if (peek != JsonToken.NULL) {
                    return peek == JsonToken.BOOLEAN ? Boolean.toString(jsonReader.nextBoolean()) : jsonReader.nextString();
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, String str) throws IOException {
                jsonWriter.value(str);
            }
        };
        y = typeAdapter6;
        z = new TypeAdapter<BigDecimal>() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public BigDecimal c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                try {
                    return new BigDecimal(nextString);
                } catch (NumberFormatException e2) {
                    throw new C3009r("Failed parsing '" + nextString + "' as BigDecimal; at path " + jsonReader.getPreviousPath(), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
                jsonWriter.value(bigDecimal);
            }
        };
        A = new TypeAdapter<BigInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public BigInteger c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                try {
                    return new BigInteger(nextString);
                } catch (NumberFormatException e2) {
                    throw new C3009r("Failed parsing '" + nextString + "' as BigInteger; at path " + jsonReader.getPreviousPath(), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
                jsonWriter.value(bigInteger);
            }
        };
        B = new TypeAdapter<f>() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public f c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new f(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, f fVar) throws IOException {
                jsonWriter.value(fVar);
            }
        };
        C = b(String.class, typeAdapter6);
        TypeAdapter<StringBuilder> typeAdapter7 = new TypeAdapter<StringBuilder>() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public StringBuilder c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new StringBuilder(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, StringBuilder sb) throws IOException {
                jsonWriter.value(sb == null ? null : sb.toString());
            }
        };
        D = typeAdapter7;
        E = b(StringBuilder.class, typeAdapter7);
        TypeAdapter<StringBuffer> typeAdapter8 = new TypeAdapter<StringBuffer>() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public StringBuffer c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new StringBuffer(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, StringBuffer stringBuffer) throws IOException {
                jsonWriter.value(stringBuffer == null ? null : stringBuffer.toString());
            }
        };
        F = typeAdapter8;
        G = b(StringBuffer.class, typeAdapter8);
        TypeAdapter<URL> typeAdapter9 = new TypeAdapter<URL>() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public URL c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                if ("null".equals(nextString)) {
                    return null;
                }
                return new URL(nextString);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, URL url) throws IOException {
                jsonWriter.value(url == null ? null : url.toExternalForm());
            }
        };
        H = typeAdapter9;
        I = b(URL.class, typeAdapter9);
        TypeAdapter<URI> typeAdapter10 = new TypeAdapter<URI>() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public URI c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    String nextString = jsonReader.nextString();
                    if ("null".equals(nextString)) {
                        return null;
                    }
                    return new URI(nextString);
                } catch (URISyntaxException e2) {
                    throw new C3001j(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, URI uri) throws IOException {
                jsonWriter.value(uri == null ? null : uri.toASCIIString());
            }
        };
        J = typeAdapter10;
        K = b(URI.class, typeAdapter10);
        TypeAdapter<InetAddress> typeAdapter11 = new TypeAdapter<InetAddress>() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public InetAddress c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return InetAddress.getByName(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, InetAddress inetAddress) throws IOException {
                jsonWriter.value(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        L = typeAdapter11;
        M = e(InetAddress.class, typeAdapter11);
        TypeAdapter<UUID> typeAdapter12 = new TypeAdapter<UUID>() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public UUID c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                try {
                    return UUID.fromString(nextString);
                } catch (IllegalArgumentException e2) {
                    throw new C3009r("Failed parsing '" + nextString + "' as UUID; at path " + jsonReader.getPreviousPath(), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, UUID uuid) throws IOException {
                jsonWriter.value(uuid == null ? null : uuid.toString());
            }
        };
        N = typeAdapter12;
        O = b(UUID.class, typeAdapter12);
        TypeAdapter<Currency> b7 = new TypeAdapter<Currency>() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public Currency c(JsonReader jsonReader) throws IOException {
                String nextString = jsonReader.nextString();
                try {
                    return Currency.getInstance(nextString);
                } catch (IllegalArgumentException e2) {
                    throw new C3009r("Failed parsing '" + nextString + "' as Currency; at path " + jsonReader.getPreviousPath(), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, Currency currency) throws IOException {
                jsonWriter.value(currency.getCurrencyCode());
            }
        }.b();
        P = b7;
        Q = b(Currency.class, b7);
        TypeAdapter<Calendar> typeAdapter13 = new TypeAdapter<Calendar>() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public Calendar c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (jsonReader.peek() != JsonToken.END_OBJECT) {
                    String nextName = jsonReader.nextName();
                    int nextInt = jsonReader.nextInt();
                    if ("year".equals(nextName)) {
                        i2 = nextInt;
                    } else if ("month".equals(nextName)) {
                        i3 = nextInt;
                    } else if ("dayOfMonth".equals(nextName)) {
                        i4 = nextInt;
                    } else if ("hourOfDay".equals(nextName)) {
                        i5 = nextInt;
                    } else if ("minute".equals(nextName)) {
                        i6 = nextInt;
                    } else if ("second".equals(nextName)) {
                        i7 = nextInt;
                    }
                }
                jsonReader.endObject();
                return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, Calendar calendar) throws IOException {
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
        R = typeAdapter13;
        S = d(Calendar.class, GregorianCalendar.class, typeAdapter13);
        TypeAdapter<Locale> typeAdapter14 = new TypeAdapter<Locale>() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public Locale c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, Locale locale) throws IOException {
                jsonWriter.value(locale == null ? null : locale.toString());
            }
        };
        T = typeAdapter14;
        U = b(Locale.class, typeAdapter14);
        TypeAdapter<AbstractC3000i> typeAdapter15 = new TypeAdapter<AbstractC3000i>() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            private AbstractC3000i g(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
                int i2 = a.a[jsonToken.ordinal()];
                if (i2 == 1) {
                    return new C3006o(new f(jsonReader.nextString()));
                }
                if (i2 == 2) {
                    return new C3006o(jsonReader.nextString());
                }
                if (i2 == 3) {
                    return new C3006o(Boolean.valueOf(jsonReader.nextBoolean()));
                }
                if (i2 == 6) {
                    jsonReader.nextNull();
                    return C3002k.q;
                }
                throw new IllegalStateException("Unexpected token: " + jsonToken);
            }

            private AbstractC3000i h(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
                int i2 = a.a[jsonToken.ordinal()];
                if (i2 == 4) {
                    jsonReader.beginArray();
                    return new C2997f();
                }
                if (i2 != 5) {
                    return null;
                }
                jsonReader.beginObject();
                return new C3003l();
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public AbstractC3000i c(JsonReader jsonReader) throws IOException {
                if (jsonReader instanceof com.google.gson.internal.bind.a) {
                    return ((com.google.gson.internal.bind.a) jsonReader).b();
                }
                JsonToken peek = jsonReader.peek();
                AbstractC3000i h2 = h(jsonReader, peek);
                if (h2 == null) {
                    return g(jsonReader, peek);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (jsonReader.hasNext()) {
                        String nextName = h2 instanceof C3003l ? jsonReader.nextName() : null;
                        JsonToken peek2 = jsonReader.peek();
                        AbstractC3000i h3 = h(jsonReader, peek2);
                        boolean z2 = h3 != null;
                        if (h3 == null) {
                            h3 = g(jsonReader, peek2);
                        }
                        if (h2 instanceof C2997f) {
                            ((C2997f) h2).r(h3);
                        } else {
                            ((C3003l) h2).r(nextName, h3);
                        }
                        if (z2) {
                            arrayDeque.addLast(h2);
                            h2 = h3;
                        }
                    } else {
                        if (h2 instanceof C2997f) {
                            jsonReader.endArray();
                        } else {
                            jsonReader.endObject();
                        }
                        if (arrayDeque.isEmpty()) {
                            return h2;
                        }
                        h2 = (AbstractC3000i) arrayDeque.removeLast();
                    }
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public void e(JsonWriter jsonWriter, AbstractC3000i abstractC3000i) throws IOException {
                if (abstractC3000i == null || abstractC3000i.n()) {
                    jsonWriter.nullValue();
                    return;
                }
                if (abstractC3000i.q()) {
                    C3006o i2 = abstractC3000i.i();
                    if (i2.y()) {
                        jsonWriter.value(i2.u());
                        return;
                    } else if (i2.w()) {
                        jsonWriter.value(i2.e());
                        return;
                    } else {
                        jsonWriter.value(i2.k());
                        return;
                    }
                }
                if (abstractC3000i.l()) {
                    jsonWriter.beginArray();
                    Iterator<AbstractC3000i> it = abstractC3000i.g().iterator();
                    while (it.hasNext()) {
                        e(jsonWriter, it.next());
                    }
                    jsonWriter.endArray();
                    return;
                }
                if (!abstractC3000i.p()) {
                    throw new IllegalArgumentException("Couldn't write " + abstractC3000i.getClass());
                }
                jsonWriter.beginObject();
                for (Map.Entry<String, AbstractC3000i> entry : abstractC3000i.h().s()) {
                    jsonWriter.name(entry.getKey());
                    e(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
            }
        };
        V = typeAdapter15;
        W = e(AbstractC3000i.class, typeAdapter15);
        X = new InterfaceC3014w() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            @Override // ax.r8.InterfaceC3014w
            public <T> TypeAdapter<T> b(Gson gson, C3475a<T> c3475a) {
                Class<? super T> c2 = c3475a.c();
                if (!Enum.class.isAssignableFrom(c2) || c2 == Enum.class) {
                    return null;
                }
                if (!c2.isEnum()) {
                    c2 = c2.getSuperclass();
                }
                return new EnumTypeAdapter(c2);
            }
        };
    }

    public static <TT> InterfaceC3014w a(final C3475a<TT> c3475a, final TypeAdapter<TT> typeAdapter) {
        return new InterfaceC3014w() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // ax.r8.InterfaceC3014w
            public <T> TypeAdapter<T> b(Gson gson, C3475a<T> c3475a2) {
                if (c3475a2.equals(C3475a.this)) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    public static <TT> InterfaceC3014w b(final Class<TT> cls, final TypeAdapter<TT> typeAdapter) {
        return new InterfaceC3014w() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            @Override // ax.r8.InterfaceC3014w
            public <T> TypeAdapter<T> b(Gson gson, C3475a<T> c3475a) {
                if (c3475a.c() == cls) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static <TT> InterfaceC3014w c(final Class<TT> cls, final Class<TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new InterfaceC3014w() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            @Override // ax.r8.InterfaceC3014w
            public <T> TypeAdapter<T> b(Gson gson, C3475a<T> c3475a) {
                Class<? super T> c2 = c3475a.c();
                if (c2 == cls || c2 == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static <TT> InterfaceC3014w d(final Class<TT> cls, final Class<? extends TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new InterfaceC3014w() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            @Override // ax.r8.InterfaceC3014w
            public <T> TypeAdapter<T> b(Gson gson, C3475a<T> c3475a) {
                Class<? super T> c2 = c3475a.c();
                if (c2 == cls || c2 == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static <T1> InterfaceC3014w e(final Class<T1> cls, final TypeAdapter<T1> typeAdapter) {
        return new InterfaceC3014w() { // from class: com.google.gson.internal.bind.TypeAdapters.34
            @Override // ax.r8.InterfaceC3014w
            public <T2> TypeAdapter<T2> b(Gson gson, C3475a<T2> c3475a) {
                final Class<? super T2> c2 = c3475a.c();
                if (cls.isAssignableFrom(c2)) {
                    return (TypeAdapter<T2>) new TypeAdapter<T1>() { // from class: com.google.gson.internal.bind.TypeAdapters.34.1
                        @Override // com.google.gson.TypeAdapter
                        public T1 c(JsonReader jsonReader) throws IOException {
                            T1 t1 = (T1) typeAdapter.c(jsonReader);
                            if (t1 == null || c2.isInstance(t1)) {
                                return t1;
                            }
                            throw new C3009r("Expected a " + c2.getName() + " but was " + t1.getClass().getName() + "; at path " + jsonReader.getPreviousPath());
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void e(JsonWriter jsonWriter, T1 t1) throws IOException {
                            typeAdapter.e(jsonWriter, t1);
                        }
                    };
                }
                return null;
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }
}
