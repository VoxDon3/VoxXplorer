/*
 * Decompiled with CFR 0.152.
 */
package ax.a7;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonToken;
import ax.l7.f;
import ax.l7.i;
import ax.m7.v;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@TargetApi(value=11)
class c
extends f {
    private final JsonReader d0;
    private final ax.a7.a e0;
    private List<String> f0 = new ArrayList<String>();
    private i g0;
    private String h0;

    c(ax.a7.a a8, JsonReader jsonReader) {
        this.e0 = a8;
        this.d0 = jsonReader;
        jsonReader.setLenient(true);
    }

    private void L0() {
        i i8 = this.g0;
        boolean bl = i8 == i.h0 || i8 == i.i0;
        v.a(bl);
    }

    @Override
    public f A0() throws IOException {
        i i8 = this.g0;
        if (i8 != null) {
            int n8 = a.a[i8.ordinal()];
            if (n8 != 1) {
                if (n8 == 2) {
                    this.d0.skipValue();
                    this.h0 = "}";
                    this.g0 = i.e0;
                    return this;
                }
            } else {
                this.d0.skipValue();
                this.h0 = "]";
                this.g0 = i.c0;
            }
        }
        return this;
    }

    @Override
    public BigInteger a() {
        this.L0();
        return new BigInteger(this.h0);
    }

    @Override
    public byte b() {
        this.L0();
        return Byte.parseByte(this.h0);
    }

    @Override
    public void close() throws IOException {
        this.d0.close();
    }

    @Override
    public String d() {
        if (this.f0.isEmpty()) {
            return null;
        }
        List<String> list = this.f0;
        return list.get(list.size() - 1);
    }

    @Override
    public i e() {
        return this.g0;
    }

    @Override
    public BigDecimal f() {
        this.L0();
        return new BigDecimal(this.h0);
    }

    @Override
    public double g() {
        this.L0();
        return Double.parseDouble(this.h0);
    }

    @Override
    public ax.l7.c j() {
        return this.e0;
    }

    @Override
    public float m() {
        this.L0();
        return Float.parseFloat(this.h0);
    }

    @Override
    public int o() {
        this.L0();
        return Integer.parseInt(this.h0);
    }

    @Override
    public long p() {
        this.L0();
        return Long.parseLong(this.h0);
    }

    @Override
    public short q() {
        this.L0();
        return Short.parseShort(this.h0);
    }

    @Override
    public String u() {
        return this.h0;
    }

    @Override
    public i v() throws IOException {
        Object object = this.g0;
        if (object != null) {
            int n8 = a.a[object.ordinal()];
            if (n8 != 1) {
                if (n8 == 2) {
                    this.d0.beginObject();
                    this.f0.add(null);
                }
            } else {
                this.d0.beginArray();
                this.f0.add(null);
            }
        }
        try {
            object = this.d0.peek();
        }
        catch (EOFException eOFException) {
            object = JsonToken.END_DOCUMENT;
        }
        switch (a.b[object.ordinal()]) {
            default: {
                this.h0 = null;
                this.g0 = null;
                break;
            }
            case 9: {
                this.h0 = this.d0.nextName();
                this.g0 = i.f0;
                object = this.f0;
                object.set(object.size() - 1, this.h0);
                break;
            }
            case 8: {
                object = this.d0.nextString();
                this.h0 = object;
                object = ((String)object).indexOf(46) == -1 ? i.h0 : i.i0;
                this.g0 = object;
                break;
            }
            case 7: {
                this.h0 = this.d0.nextString();
                this.g0 = i.g0;
                break;
            }
            case 6: {
                this.h0 = "null";
                this.g0 = i.l0;
                this.d0.nextNull();
                break;
            }
            case 5: {
                if (this.d0.nextBoolean()) {
                    this.h0 = "true";
                    this.g0 = i.j0;
                    break;
                }
                this.h0 = "false";
                this.g0 = i.k0;
                break;
            }
            case 4: {
                this.h0 = "}";
                this.g0 = i.e0;
                object = this.f0;
                object.remove(object.size() - 1);
                this.d0.endObject();
                break;
            }
            case 3: {
                this.h0 = "{";
                this.g0 = i.d0;
                break;
            }
            case 2: {
                this.h0 = "]";
                this.g0 = i.c0;
                object = this.f0;
                object.remove(object.size() - 1);
                this.d0.endArray();
                break;
            }
            case 1: {
                this.h0 = "[";
                this.g0 = i.q;
            }
        }
        return this.g0;
    }
}

