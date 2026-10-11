package ax.b6;

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
/* loaded from: classes3.dex */
public class O5 {
    public static final O5 d0;
    public static final O5 e0;
    public static final O5 f0;
    public static final O5 g0;
    public static final O5 h0;
    public static final O5 i0;
    public static final O5 j0;
    public static final O5 k0;
    public static final O5 l0;
    public static final O5 m0;
    public static final O5 n0;
    public static final O5 o0;
    public static final O5 p0;
    public static final O5 q0;
    public static final O5 r0;
    public static final O5 s0;
    public static final O5 t0;
    public static final O5 u0;
    private static final /* synthetic */ O5[] v0;
    private final int c0;
    private final Y5 q;

    static {
        O5 o5 = new O5("DOUBLE", 0, Y5.DOUBLE, 1);
        d0 = o5;
        O5 o52 = new O5("FLOAT", 1, Y5.FLOAT, 5);
        e0 = o52;
        Y5 y5 = Y5.LONG;
        O5 o53 = new O5("INT64", 2, y5, 0);
        f0 = o53;
        O5 o54 = new O5("UINT64", 3, y5, 0);
        g0 = o54;
        Y5 y52 = Y5.INT;
        O5 o55 = new O5("INT32", 4, y52, 0);
        h0 = o55;
        O5 o56 = new O5("FIXED64", 5, y5, 1);
        i0 = o56;
        O5 o57 = new O5("FIXED32", 6, y52, 5);
        j0 = o57;
        O5 o58 = new O5("BOOL", 7, Y5.BOOLEAN, 0);
        k0 = o58;
        R5 r5 = new R5("STRING", Y5.STRING);
        l0 = r5;
        Y5 y53 = Y5.MESSAGE;
        T5 t5 = new T5("GROUP", y53);
        m0 = t5;
        V5 v5 = new V5("MESSAGE", y53);
        n0 = v5;
        X5 x5 = new X5("BYTES", Y5.BYTE_STRING);
        o0 = x5;
        O5 o59 = new O5("UINT32", 12, y52, 0);
        p0 = o59;
        O5 o510 = new O5("ENUM", 13, Y5.ENUM, 0);
        q0 = o510;
        O5 o511 = new O5("SFIXED32", 14, y52, 5);
        r0 = o511;
        O5 o512 = new O5("SFIXED64", 15, y5, 1);
        s0 = o512;
        O5 o513 = new O5("SINT32", 16, y52, 0);
        t0 = o513;
        O5 o514 = new O5("SINT64", 17, y5, 0);
        u0 = o514;
        v0 = new O5[]{o5, o52, o53, o54, o55, o56, o57, o58, r5, t5, v5, x5, o59, o510, o511, o512, o513, o514};
    }

    public static O5[] values() {
        return (O5[]) v0.clone();
    }

    public final Y5 d() {
        return this.q;
    }

    private O5(String str, int i, Y5 y5, int i2) {
        this.q = y5;
        this.c0 = i2;
    }
}
