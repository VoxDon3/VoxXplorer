package ax.r8;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ax.r8.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class EnumC3012u implements InterfaceC3013v {
    public static final EnumC3012u c0;
    public static final EnumC3012u d0;
    public static final EnumC3012u e0;
    private static final /* synthetic */ EnumC3012u[] f0;
    public static final EnumC3012u q;

    /* renamed from: ax.r8.u$a */
    enum a extends EnumC3012u {
        a(String str, int i) {
            super(str, i, null);
        }

        @Override // ax.r8.InterfaceC3013v
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Double d(JsonReader jsonReader) throws IOException {
            return Double.valueOf(jsonReader.nextDouble());
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        q = aVar;
        EnumC3012u enumC3012u = new EnumC3012u("LAZILY_PARSED_NUMBER", 1) { // from class: ax.r8.u.b
            {
                a aVar2 = null;
            }

            @Override // ax.r8.InterfaceC3013v
            public Number d(JsonReader jsonReader) throws IOException {
                return new ax.t8.f(jsonReader.nextString());
            }
        };
        c0 = enumC3012u;
        EnumC3012u enumC3012u2 = new EnumC3012u("LONG_OR_DOUBLE", 2) { // from class: ax.r8.u.c
            {
                a aVar2 = null;
            }

            @Override // ax.r8.InterfaceC3013v
            public Number d(JsonReader jsonReader) throws IOException, C3004m {
                String nextString = jsonReader.nextString();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(nextString));
                    } catch (NumberFormatException unused) {
                        Double valueOf = Double.valueOf(nextString);
                        if (!valueOf.isInfinite()) {
                            if (valueOf.isNaN()) {
                            }
                            return valueOf;
                        }
                        if (!jsonReader.isLenient()) {
                            throw new MalformedJsonException("JSON forbids NaN and infinities: " + valueOf + "; at path " + jsonReader.getPreviousPath());
                        }
                        return valueOf;
                    }
                } catch (NumberFormatException e) {
                    throw new C3004m("Cannot parse " + nextString + "; at path " + jsonReader.getPreviousPath(), e);
                }
            }
        };
        d0 = enumC3012u2;
        EnumC3012u enumC3012u3 = new EnumC3012u("BIG_DECIMAL", 3) { // from class: ax.r8.u.d
            {
                a aVar2 = null;
            }

            @Override // ax.r8.InterfaceC3013v
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public BigDecimal d(JsonReader jsonReader) throws IOException {
                String nextString = jsonReader.nextString();
                try {
                    return new BigDecimal(nextString);
                } catch (NumberFormatException e) {
                    throw new C3004m("Cannot parse " + nextString + "; at path " + jsonReader.getPreviousPath(), e);
                }
            }
        };
        e0 = enumC3012u3;
        f0 = new EnumC3012u[]{aVar, enumC3012u, enumC3012u2, enumC3012u3};
    }

    private EnumC3012u(String str, int i) {
    }

    public static EnumC3012u valueOf(String str) {
        return (EnumC3012u) Enum.valueOf(EnumC3012u.class, str);
    }

    public static EnumC3012u[] values() {
        return (EnumC3012u[]) f0.clone();
    }

    /* synthetic */ EnumC3012u(String str, int i, a aVar) {
        this(str, i);
    }
}
