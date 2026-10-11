package ax.r0;

import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class u0 {
    static final int a = c(1, 3);
    static final int b = c(1, 4);
    static final int c = c(2, 0);
    static final int d = c(3, 2);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class b {
        public static final b d0;
        public static final b e0;
        public static final b f0;
        public static final b g0;
        public static final b h0;
        public static final b i0;
        public static final b j0;
        public static final b k0;
        public static final b l0;
        public static final b m0;
        public static final b n0;
        public static final b o0;
        public static final b p0;
        public static final b q0;
        public static final b r0;
        public static final b s0;
        public static final b t0;
        public static final b u0;
        private static final /* synthetic */ b[] v0;
        private final int c0;
        private final c q;

        enum a extends b {
            a(String str, int i, c cVar, int i2) {
                super(str, i, cVar, i2);
            }
        }

        /* renamed from: ax.r0.u0$b$b, reason: collision with other inner class name */
        enum C0434b extends b {
            C0434b(String str, int i, c cVar, int i2) {
                super(str, i, cVar, i2);
            }
        }

        enum c extends b {
            c(String str, int i, c cVar, int i2) {
                super(str, i, cVar, i2);
            }
        }

        enum d extends b {
            d(String str, int i, c cVar, int i2) {
                super(str, i, cVar, i2);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            d0 = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            e0 = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f0 = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            g0 = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            h0 = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            i0 = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            j0 = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            k0 = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            l0 = aVar;
            c cVar3 = c.MESSAGE;
            C0434b c0434b = new C0434b("GROUP", 9, cVar3, 3);
            m0 = c0434b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            n0 = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            o0 = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            p0 = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            q0 = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            r0 = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            s0 = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            t0 = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            u0 = bVar14;
            v0 = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0434b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) v0.clone();
        }

        public c d() {
            return this.q;
        }

        public int h() {
            return this.c0;
        }

        private b(String str, int i, c cVar, int i2) {
            this.q = cVar;
            this.c0 = i2;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(HttpUrl.FRAGMENT_ENCODE_SET),
        BYTE_STRING(AbstractC2921h.c0),
        ENUM(null),
        MESSAGE(null);

        private final Object q;

        c(Object obj) {
            this.q = obj;
        }
    }

    public static int a(int i) {
        return i >>> 3;
    }

    public static int b(int i) {
        return i & 7;
    }

    static int c(int i, int i2) {
        return (i << 3) | i2;
    }
}
