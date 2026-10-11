package ax.r0;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'g0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: ax.r0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2934v {
    public static final EnumC2934v A0;
    public static final EnumC2934v B0;
    public static final EnumC2934v C0;
    public static final EnumC2934v D0;
    public static final EnumC2934v E0;
    public static final EnumC2934v F0;
    public static final EnumC2934v G0;
    public static final EnumC2934v H0;
    public static final EnumC2934v I0;
    public static final EnumC2934v J0;
    public static final EnumC2934v K0;
    public static final EnumC2934v L0;
    public static final EnumC2934v M0;
    public static final EnumC2934v N0;
    public static final EnumC2934v O0;
    public static final EnumC2934v P0;
    public static final EnumC2934v Q0;
    public static final EnumC2934v R0;
    public static final EnumC2934v S0;
    public static final EnumC2934v T0;
    public static final EnumC2934v U0;
    public static final EnumC2934v V0;
    public static final EnumC2934v W0;
    public static final EnumC2934v X0;
    public static final EnumC2934v Y0;
    public static final EnumC2934v Z0;
    public static final EnumC2934v a1;
    public static final EnumC2934v b1;
    public static final EnumC2934v c1;
    public static final EnumC2934v d1;
    public static final EnumC2934v e1;
    private static final EnumC2934v[] f1;
    public static final EnumC2934v g0;
    private static final Type[] g1;
    public static final EnumC2934v h0;
    private static final /* synthetic */ EnumC2934v[] h1;
    public static final EnumC2934v i0;
    public static final EnumC2934v j0;
    public static final EnumC2934v k0;
    public static final EnumC2934v l0;
    public static final EnumC2934v m0;
    public static final EnumC2934v n0;
    public static final EnumC2934v o0;
    public static final EnumC2934v p0;
    public static final EnumC2934v q0;
    public static final EnumC2934v r0;
    public static final EnumC2934v s0;
    public static final EnumC2934v t0;
    public static final EnumC2934v u0;
    public static final EnumC2934v v0;
    public static final EnumC2934v w0;
    public static final EnumC2934v x0;
    public static final EnumC2934v y0;
    public static final EnumC2934v z0;
    private final int c0;
    private final b d0;
    private final Class<?> e0;
    private final boolean f0;
    private final EnumC2906C q;

    /* renamed from: ax.r0.v$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[EnumC2906C.values().length];
            b = iArr;
            try {
                iArr[EnumC2906C.l0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[EnumC2906C.n0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[EnumC2906C.k0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: ax.r0.v$b */
    enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean q;

        b(boolean z) {
            this.q = z;
        }
    }

    static {
        b bVar = b.SCALAR;
        EnumC2906C enumC2906C = EnumC2906C.i0;
        EnumC2934v enumC2934v = new EnumC2934v("DOUBLE", 0, 0, bVar, enumC2906C);
        g0 = enumC2934v;
        EnumC2906C enumC2906C2 = EnumC2906C.h0;
        EnumC2934v enumC2934v2 = new EnumC2934v("FLOAT", 1, 1, bVar, enumC2906C2);
        h0 = enumC2934v2;
        EnumC2906C enumC2906C3 = EnumC2906C.g0;
        EnumC2934v enumC2934v3 = new EnumC2934v("INT64", 2, 2, bVar, enumC2906C3);
        i0 = enumC2934v3;
        EnumC2934v enumC2934v4 = new EnumC2934v("UINT64", 3, 3, bVar, enumC2906C3);
        j0 = enumC2934v4;
        EnumC2906C enumC2906C4 = EnumC2906C.f0;
        EnumC2934v enumC2934v5 = new EnumC2934v("INT32", 4, 4, bVar, enumC2906C4);
        k0 = enumC2934v5;
        EnumC2934v enumC2934v6 = new EnumC2934v("FIXED64", 5, 5, bVar, enumC2906C3);
        l0 = enumC2934v6;
        EnumC2934v enumC2934v7 = new EnumC2934v("FIXED32", 6, 6, bVar, enumC2906C4);
        m0 = enumC2934v7;
        EnumC2906C enumC2906C5 = EnumC2906C.j0;
        EnumC2934v enumC2934v8 = new EnumC2934v("BOOL", 7, 7, bVar, enumC2906C5);
        n0 = enumC2934v8;
        EnumC2906C enumC2906C6 = EnumC2906C.k0;
        EnumC2934v enumC2934v9 = new EnumC2934v("STRING", 8, 8, bVar, enumC2906C6);
        o0 = enumC2934v9;
        EnumC2906C enumC2906C7 = EnumC2906C.n0;
        EnumC2934v enumC2934v10 = new EnumC2934v("MESSAGE", 9, 9, bVar, enumC2906C7);
        p0 = enumC2934v10;
        EnumC2906C enumC2906C8 = EnumC2906C.l0;
        EnumC2934v enumC2934v11 = new EnumC2934v("BYTES", 10, 10, bVar, enumC2906C8);
        q0 = enumC2934v11;
        EnumC2934v enumC2934v12 = new EnumC2934v("UINT32", 11, 11, bVar, enumC2906C4);
        r0 = enumC2934v12;
        EnumC2906C enumC2906C9 = EnumC2906C.m0;
        EnumC2934v enumC2934v13 = new EnumC2934v("ENUM", 12, 12, bVar, enumC2906C9);
        s0 = enumC2934v13;
        EnumC2934v enumC2934v14 = new EnumC2934v("SFIXED32", 13, 13, bVar, enumC2906C4);
        t0 = enumC2934v14;
        EnumC2934v enumC2934v15 = new EnumC2934v("SFIXED64", 14, 14, bVar, enumC2906C3);
        u0 = enumC2934v15;
        EnumC2934v enumC2934v16 = new EnumC2934v("SINT32", 15, 15, bVar, enumC2906C4);
        v0 = enumC2934v16;
        EnumC2934v enumC2934v17 = new EnumC2934v("SINT64", 16, 16, bVar, enumC2906C3);
        w0 = enumC2934v17;
        EnumC2934v enumC2934v18 = new EnumC2934v("GROUP", 17, 17, bVar, enumC2906C7);
        x0 = enumC2934v18;
        b bVar2 = b.VECTOR;
        EnumC2934v enumC2934v19 = new EnumC2934v("DOUBLE_LIST", 18, 18, bVar2, enumC2906C);
        y0 = enumC2934v19;
        EnumC2934v enumC2934v20 = new EnumC2934v("FLOAT_LIST", 19, 19, bVar2, enumC2906C2);
        z0 = enumC2934v20;
        EnumC2934v enumC2934v21 = new EnumC2934v("INT64_LIST", 20, 20, bVar2, enumC2906C3);
        A0 = enumC2934v21;
        EnumC2934v enumC2934v22 = new EnumC2934v("UINT64_LIST", 21, 21, bVar2, enumC2906C3);
        B0 = enumC2934v22;
        EnumC2934v enumC2934v23 = new EnumC2934v("INT32_LIST", 22, 22, bVar2, enumC2906C4);
        C0 = enumC2934v23;
        EnumC2934v enumC2934v24 = new EnumC2934v("FIXED64_LIST", 23, 23, bVar2, enumC2906C3);
        D0 = enumC2934v24;
        EnumC2934v enumC2934v25 = new EnumC2934v("FIXED32_LIST", 24, 24, bVar2, enumC2906C4);
        E0 = enumC2934v25;
        EnumC2934v enumC2934v26 = new EnumC2934v("BOOL_LIST", 25, 25, bVar2, enumC2906C5);
        F0 = enumC2934v26;
        EnumC2934v enumC2934v27 = new EnumC2934v("STRING_LIST", 26, 26, bVar2, enumC2906C6);
        G0 = enumC2934v27;
        EnumC2934v enumC2934v28 = new EnumC2934v("MESSAGE_LIST", 27, 27, bVar2, enumC2906C7);
        H0 = enumC2934v28;
        EnumC2934v enumC2934v29 = new EnumC2934v("BYTES_LIST", 28, 28, bVar2, enumC2906C8);
        I0 = enumC2934v29;
        EnumC2934v enumC2934v30 = new EnumC2934v("UINT32_LIST", 29, 29, bVar2, enumC2906C4);
        J0 = enumC2934v30;
        EnumC2934v enumC2934v31 = new EnumC2934v("ENUM_LIST", 30, 30, bVar2, enumC2906C9);
        K0 = enumC2934v31;
        EnumC2934v enumC2934v32 = new EnumC2934v("SFIXED32_LIST", 31, 31, bVar2, enumC2906C4);
        L0 = enumC2934v32;
        EnumC2934v enumC2934v33 = new EnumC2934v("SFIXED64_LIST", 32, 32, bVar2, enumC2906C3);
        M0 = enumC2934v33;
        EnumC2934v enumC2934v34 = new EnumC2934v("SINT32_LIST", 33, 33, bVar2, enumC2906C4);
        N0 = enumC2934v34;
        EnumC2934v enumC2934v35 = new EnumC2934v("SINT64_LIST", 34, 34, bVar2, enumC2906C3);
        O0 = enumC2934v35;
        b bVar3 = b.PACKED_VECTOR;
        EnumC2934v enumC2934v36 = new EnumC2934v("DOUBLE_LIST_PACKED", 35, 35, bVar3, enumC2906C);
        P0 = enumC2934v36;
        EnumC2934v enumC2934v37 = new EnumC2934v("FLOAT_LIST_PACKED", 36, 36, bVar3, enumC2906C2);
        Q0 = enumC2934v37;
        EnumC2934v enumC2934v38 = new EnumC2934v("INT64_LIST_PACKED", 37, 37, bVar3, enumC2906C3);
        R0 = enumC2934v38;
        EnumC2934v enumC2934v39 = new EnumC2934v("UINT64_LIST_PACKED", 38, 38, bVar3, enumC2906C3);
        S0 = enumC2934v39;
        EnumC2934v enumC2934v40 = new EnumC2934v("INT32_LIST_PACKED", 39, 39, bVar3, enumC2906C4);
        T0 = enumC2934v40;
        EnumC2934v enumC2934v41 = new EnumC2934v("FIXED64_LIST_PACKED", 40, 40, bVar3, enumC2906C3);
        U0 = enumC2934v41;
        EnumC2934v enumC2934v42 = new EnumC2934v("FIXED32_LIST_PACKED", 41, 41, bVar3, enumC2906C4);
        V0 = enumC2934v42;
        EnumC2934v enumC2934v43 = new EnumC2934v("BOOL_LIST_PACKED", 42, 42, bVar3, enumC2906C5);
        W0 = enumC2934v43;
        EnumC2934v enumC2934v44 = new EnumC2934v("UINT32_LIST_PACKED", 43, 43, bVar3, enumC2906C4);
        X0 = enumC2934v44;
        EnumC2934v enumC2934v45 = new EnumC2934v("ENUM_LIST_PACKED", 44, 44, bVar3, enumC2906C9);
        Y0 = enumC2934v45;
        EnumC2934v enumC2934v46 = new EnumC2934v("SFIXED32_LIST_PACKED", 45, 45, bVar3, enumC2906C4);
        Z0 = enumC2934v46;
        EnumC2934v enumC2934v47 = new EnumC2934v("SFIXED64_LIST_PACKED", 46, 46, bVar3, enumC2906C3);
        a1 = enumC2934v47;
        EnumC2934v enumC2934v48 = new EnumC2934v("SINT32_LIST_PACKED", 47, 47, bVar3, enumC2906C4);
        b1 = enumC2934v48;
        EnumC2934v enumC2934v49 = new EnumC2934v("SINT64_LIST_PACKED", 48, 48, bVar3, enumC2906C3);
        c1 = enumC2934v49;
        EnumC2934v enumC2934v50 = new EnumC2934v("GROUP_LIST", 49, 49, bVar2, enumC2906C7);
        d1 = enumC2934v50;
        EnumC2934v enumC2934v51 = new EnumC2934v("MAP", 50, 50, b.MAP, EnumC2906C.e0);
        e1 = enumC2934v51;
        h1 = new EnumC2934v[]{enumC2934v, enumC2934v2, enumC2934v3, enumC2934v4, enumC2934v5, enumC2934v6, enumC2934v7, enumC2934v8, enumC2934v9, enumC2934v10, enumC2934v11, enumC2934v12, enumC2934v13, enumC2934v14, enumC2934v15, enumC2934v16, enumC2934v17, enumC2934v18, enumC2934v19, enumC2934v20, enumC2934v21, enumC2934v22, enumC2934v23, enumC2934v24, enumC2934v25, enumC2934v26, enumC2934v27, enumC2934v28, enumC2934v29, enumC2934v30, enumC2934v31, enumC2934v32, enumC2934v33, enumC2934v34, enumC2934v35, enumC2934v36, enumC2934v37, enumC2934v38, enumC2934v39, enumC2934v40, enumC2934v41, enumC2934v42, enumC2934v43, enumC2934v44, enumC2934v45, enumC2934v46, enumC2934v47, enumC2934v48, enumC2934v49, enumC2934v50, enumC2934v51};
        g1 = new Type[0];
        EnumC2934v[] values = values();
        f1 = new EnumC2934v[values.length];
        for (EnumC2934v enumC2934v52 : values) {
            f1[enumC2934v52.c0] = enumC2934v52;
        }
    }

    private EnumC2934v(String str, int i, int i2, b bVar, EnumC2906C enumC2906C) {
        int i3;
        this.c0 = i2;
        this.d0 = bVar;
        this.q = enumC2906C;
        int i4 = a.a[bVar.ordinal()];
        if (i4 == 1) {
            this.e0 = enumC2906C.d();
        } else if (i4 != 2) {
            this.e0 = null;
        } else {
            this.e0 = enumC2906C.d();
        }
        this.f0 = (bVar != b.SCALAR || (i3 = a.b[enumC2906C.ordinal()]) == 1 || i3 == 2 || i3 == 3) ? false : true;
    }

    public static EnumC2934v valueOf(String str) {
        return (EnumC2934v) Enum.valueOf(EnumC2934v.class, str);
    }

    public static EnumC2934v[] values() {
        return (EnumC2934v[]) h1.clone();
    }

    public int d() {
        return this.c0;
    }
}
