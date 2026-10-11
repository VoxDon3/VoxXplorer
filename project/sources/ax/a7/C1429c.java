package ax.a7;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonToken;
import ax.l7.AbstractC2475c;
import ax.l7.AbstractC2478f;
import ax.l7.EnumC2481i;
import ax.m7.v;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@TargetApi(11)
/* renamed from: ax.a7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1429c extends AbstractC2478f {
    private final JsonReader d0;
    private final C1427a e0;
    private List<String> f0 = new ArrayList();
    private EnumC2481i g0;
    private String h0;

    /* renamed from: ax.a7.c$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[JsonToken.values().length];
            b = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[JsonToken.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[JsonToken.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[JsonToken.STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[JsonToken.NUMBER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[JsonToken.NAME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[EnumC2481i.values().length];
            a = iArr2;
            try {
                iArr2[EnumC2481i.START_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[EnumC2481i.START_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    C1429c(C1427a c1427a, JsonReader jsonReader) {
        this.e0 = c1427a;
        this.d0 = jsonReader;
        jsonReader.setLenient(true);
    }

    private void L0() {
        EnumC2481i enumC2481i = this.g0;
        v.a(enumC2481i == EnumC2481i.VALUE_NUMBER_INT || enumC2481i == EnumC2481i.VALUE_NUMBER_FLOAT);
    }

    @Override // ax.l7.AbstractC2478f
    public AbstractC2478f A0() throws IOException {
        EnumC2481i enumC2481i = this.g0;
        if (enumC2481i != null) {
            int i = a.a[enumC2481i.ordinal()];
            if (i == 1) {
                this.d0.skipValue();
                this.h0 = "]";
                this.g0 = EnumC2481i.END_ARRAY;
            } else if (i == 2) {
                this.d0.skipValue();
                this.h0 = "}";
                this.g0 = EnumC2481i.END_OBJECT;
                return this;
            }
        }
        return this;
    }

    @Override // ax.l7.AbstractC2478f
    public BigInteger a() {
        L0();
        return new BigInteger(this.h0);
    }

    @Override // ax.l7.AbstractC2478f
    public byte b() {
        L0();
        return Byte.parseByte(this.h0);
    }

    @Override // ax.l7.AbstractC2478f, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.d0.close();
    }

    @Override // ax.l7.AbstractC2478f
    public String d() {
        if (this.f0.isEmpty()) {
            return null;
        }
        return this.f0.get(r0.size() - 1);
    }

    @Override // ax.l7.AbstractC2478f
    public EnumC2481i e() {
        return this.g0;
    }

    @Override // ax.l7.AbstractC2478f
    public BigDecimal f() {
        L0();
        return new BigDecimal(this.h0);
    }

    @Override // ax.l7.AbstractC2478f
    public double g() {
        L0();
        return Double.parseDouble(this.h0);
    }

    @Override // ax.l7.AbstractC2478f
    public AbstractC2475c j() {
        return this.e0;
    }

    @Override // ax.l7.AbstractC2478f
    public float m() {
        L0();
        return Float.parseFloat(this.h0);
    }

    @Override // ax.l7.AbstractC2478f
    public int o() {
        L0();
        return Integer.parseInt(this.h0);
    }

    @Override // ax.l7.AbstractC2478f
    public long p() {
        L0();
        return Long.parseLong(this.h0);
    }

    @Override // ax.l7.AbstractC2478f
    public short q() {
        L0();
        return Short.parseShort(this.h0);
    }

    @Override // ax.l7.AbstractC2478f
    public String u() {
        return this.h0;
    }

    @Override // ax.l7.AbstractC2478f
    public EnumC2481i v() throws IOException {
        JsonToken jsonToken;
        EnumC2481i enumC2481i = this.g0;
        if (enumC2481i != null) {
            int i = a.a[enumC2481i.ordinal()];
            if (i == 1) {
                this.d0.beginArray();
                this.f0.add(null);
            } else if (i == 2) {
                this.d0.beginObject();
                this.f0.add(null);
            }
        }
        try {
            jsonToken = this.d0.peek();
        } catch (EOFException unused) {
            jsonToken = JsonToken.END_DOCUMENT;
        }
        switch (a.b[jsonToken.ordinal()]) {
            case 1:
                this.h0 = "[";
                this.g0 = EnumC2481i.START_ARRAY;
                break;
            case 2:
                this.h0 = "]";
                this.g0 = EnumC2481i.END_ARRAY;
                List<String> list = this.f0;
                list.remove(list.size() - 1);
                this.d0.endArray();
                break;
            case 3:
                this.h0 = "{";
                this.g0 = EnumC2481i.START_OBJECT;
                break;
            case 4:
                this.h0 = "}";
                this.g0 = EnumC2481i.END_OBJECT;
                List<String> list2 = this.f0;
                list2.remove(list2.size() - 1);
                this.d0.endObject();
                break;
            case 5:
                if (!this.d0.nextBoolean()) {
                    this.h0 = "false";
                    this.g0 = EnumC2481i.VALUE_FALSE;
                    break;
                } else {
                    this.h0 = "true";
                    this.g0 = EnumC2481i.VALUE_TRUE;
                    break;
                }
            case 6:
                this.h0 = "null";
                this.g0 = EnumC2481i.VALUE_NULL;
                this.d0.nextNull();
                break;
            case 7:
                this.h0 = this.d0.nextString();
                this.g0 = EnumC2481i.VALUE_STRING;
                break;
            case 8:
                String nextString = this.d0.nextString();
                this.h0 = nextString;
                this.g0 = nextString.indexOf(46) == -1 ? EnumC2481i.VALUE_NUMBER_INT : EnumC2481i.VALUE_NUMBER_FLOAT;
                break;
            case 9:
                this.h0 = this.d0.nextName();
                this.g0 = EnumC2481i.FIELD_NAME;
                List<String> list3 = this.f0;
                list3.set(list3.size() - 1, this.h0);
                break;
            default:
                this.h0 = null;
                this.g0 = null;
                break;
        }
        return this.g0;
    }
}
