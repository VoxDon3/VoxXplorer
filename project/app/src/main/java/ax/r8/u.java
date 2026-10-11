/*
 * Decompiled with CFR 0.152.
 */
package ax.r8;

import ax.r8.m;
import ax.r8.v;
import ax.t8.f;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;

public abstract class u
extends Enum<u>
implements v {
    public static final /* enum */ u c0;
    public static final /* enum */ u d0;
    public static final /* enum */ u e0;
    private static final u[] f0;
    public static final /* enum */ u q;

    static {
        u u8;
        u u9;
        u u10;
        u u11;
        q = u11 = new u(){

            public Double h(JsonReader jsonReader) throws IOException {
                return jsonReader.nextDouble();
            }
        };
        c0 = u10 = new u(){

            @Override
            public Number d(JsonReader jsonReader) throws IOException {
                return new f(jsonReader.nextString());
            }
        };
        d0 = u9 = new u(){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public Number d(JsonReader jsonReader) throws IOException, m {
                String string = jsonReader.nextString();
                try {
                    long l8 = Long.parseLong(string);
                    return l8;
                }
                catch (NumberFormatException numberFormatException) {
                    NumberFormatException numberFormatException22;
                    block5: {
                        Double d8;
                        try {
                            d8 = Double.valueOf(string);
                            if (!d8.isInfinite() && !d8.isNaN()) return d8;
                        }
                        catch (NumberFormatException numberFormatException22) {
                            break block5;
                        }
                        if (jsonReader.isLenient()) return d8;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("JSON forbids NaN and infinities: ");
                        stringBuilder.append(d8);
                        stringBuilder.append("; at path ");
                        stringBuilder.append(jsonReader.getPreviousPath());
                        MalformedJsonException malformedJsonException = new MalformedJsonException(stringBuilder.toString());
                        throw malformedJsonException;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Cannot parse ");
                    stringBuilder.append(string);
                    stringBuilder.append("; at path ");
                    stringBuilder.append(jsonReader.getPreviousPath());
                    throw new m(stringBuilder.toString(), numberFormatException22);
                }
            }
        };
        e0 = u8 = new u(){

            public BigDecimal h(JsonReader jsonReader) throws IOException {
                String string = jsonReader.nextString();
                try {
                    BigDecimal bigDecimal = new BigDecimal(string);
                    return bigDecimal;
                }
                catch (NumberFormatException numberFormatException) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Cannot parse ");
                    stringBuilder.append(string);
                    stringBuilder.append("; at path ");
                    stringBuilder.append(jsonReader.getPreviousPath());
                    throw new m(stringBuilder.toString(), numberFormatException);
                }
            }
        };
        f0 = new u[]{u11, u10, u9, u8};
    }

    public static u valueOf(String string) {
        return Enum.valueOf(u.class, string);
    }

    public static u[] values() {
        return (u[])f0.clone();
    }
}

