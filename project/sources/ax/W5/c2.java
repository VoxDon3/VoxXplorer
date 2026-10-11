package ax.W5;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class c2 {
    public static final c2 c0;
    public static final c2 d0;
    public static final c2 e0;
    public static final c2 f0;
    public static final c2 g0;
    public static final c2 h0;
    public static final c2 i0;
    public static final c2 j0;
    public static final c2 k0;
    public static final c2 l0;
    public static final c2 m0;
    public static final c2 n0;
    public static final c2 o0;
    public static final c2 p0;
    public static final c2 q0;
    public static final c2 r0;
    public static final c2 s0;
    public static final c2 t0;
    private static final /* synthetic */ c2[] u0;
    private final d2 q;

    static {
        c2 c2Var = new c2("DOUBLE", 0, d2.DOUBLE, 1);
        c0 = c2Var;
        c2 c2Var2 = new c2("FLOAT", 1, d2.FLOAT, 5);
        d0 = c2Var2;
        d2 d2Var = d2.LONG;
        c2 c2Var3 = new c2("INT64", 2, d2Var, 0);
        e0 = c2Var3;
        c2 c2Var4 = new c2("UINT64", 3, d2Var, 0);
        f0 = c2Var4;
        d2 d2Var2 = d2.INT;
        c2 c2Var5 = new c2("INT32", 4, d2Var2, 0);
        g0 = c2Var5;
        c2 c2Var6 = new c2("FIXED64", 5, d2Var, 1);
        h0 = c2Var6;
        c2 c2Var7 = new c2("FIXED32", 6, d2Var2, 5);
        i0 = c2Var7;
        c2 c2Var8 = new c2("BOOL", 7, d2.BOOLEAN, 0);
        j0 = c2Var8;
        c2 c2Var9 = new c2("STRING", 8, d2.STRING, 2);
        k0 = c2Var9;
        d2 d2Var3 = d2.MESSAGE;
        c2 c2Var10 = new c2("GROUP", 9, d2Var3, 3);
        l0 = c2Var10;
        c2 c2Var11 = new c2("MESSAGE", 10, d2Var3, 2);
        m0 = c2Var11;
        c2 c2Var12 = new c2("BYTES", 11, d2.BYTE_STRING, 2);
        n0 = c2Var12;
        c2 c2Var13 = new c2("UINT32", 12, d2Var2, 0);
        o0 = c2Var13;
        c2 c2Var14 = new c2("ENUM", 13, d2.ENUM, 0);
        p0 = c2Var14;
        c2 c2Var15 = new c2("SFIXED32", 14, d2Var2, 5);
        q0 = c2Var15;
        c2 c2Var16 = new c2("SFIXED64", 15, d2Var, 1);
        r0 = c2Var16;
        c2 c2Var17 = new c2("SINT32", 16, d2Var2, 0);
        s0 = c2Var17;
        c2 c2Var18 = new c2("SINT64", 17, d2Var, 0);
        t0 = c2Var18;
        u0 = new c2[]{c2Var, c2Var2, c2Var3, c2Var4, c2Var5, c2Var6, c2Var7, c2Var8, c2Var9, c2Var10, c2Var11, c2Var12, c2Var13, c2Var14, c2Var15, c2Var16, c2Var17, c2Var18};
    }

    private c2(String str, int i, d2 d2Var, int i2) {
        this.q = d2Var;
    }

    public static c2[] values() {
        return (c2[]) u0.clone();
    }

    public final d2 d() {
        return this.q;
    }
}
