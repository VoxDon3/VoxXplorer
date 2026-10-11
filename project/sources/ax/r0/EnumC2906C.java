package ax.r0;

import okhttp3.HttpUrl;

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
/* renamed from: ax.r0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2906C {
    public static final EnumC2906C e0;
    public static final EnumC2906C f0;
    public static final EnumC2906C g0;
    public static final EnumC2906C h0;
    public static final EnumC2906C i0;
    public static final EnumC2906C j0;
    public static final EnumC2906C k0;
    public static final EnumC2906C l0;
    public static final EnumC2906C m0;
    public static final EnumC2906C n0;
    private static final /* synthetic */ EnumC2906C[] o0;
    private final Class<?> c0;
    private final Object d0;
    private final Class<?> q;

    static {
        EnumC2906C enumC2906C = new EnumC2906C("VOID", 0, Void.class, Void.class, null);
        e0 = enumC2906C;
        Class cls = Integer.TYPE;
        EnumC2906C enumC2906C2 = new EnumC2906C("INT", 1, cls, Integer.class, 0);
        f0 = enumC2906C2;
        EnumC2906C enumC2906C3 = new EnumC2906C("LONG", 2, Long.TYPE, Long.class, 0L);
        g0 = enumC2906C3;
        EnumC2906C enumC2906C4 = new EnumC2906C("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        h0 = enumC2906C4;
        EnumC2906C enumC2906C5 = new EnumC2906C("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        i0 = enumC2906C5;
        EnumC2906C enumC2906C6 = new EnumC2906C("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        j0 = enumC2906C6;
        EnumC2906C enumC2906C7 = new EnumC2906C("STRING", 6, String.class, String.class, HttpUrl.FRAGMENT_ENCODE_SET);
        k0 = enumC2906C7;
        EnumC2906C enumC2906C8 = new EnumC2906C("BYTE_STRING", 7, AbstractC2921h.class, AbstractC2921h.class, AbstractC2921h.c0);
        l0 = enumC2906C8;
        EnumC2906C enumC2906C9 = new EnumC2906C("ENUM", 8, cls, Integer.class, null);
        m0 = enumC2906C9;
        EnumC2906C enumC2906C10 = new EnumC2906C("MESSAGE", 9, Object.class, Object.class, null);
        n0 = enumC2906C10;
        o0 = new EnumC2906C[]{enumC2906C, enumC2906C2, enumC2906C3, enumC2906C4, enumC2906C5, enumC2906C6, enumC2906C7, enumC2906C8, enumC2906C9, enumC2906C10};
    }

    private EnumC2906C(String str, int i, Class cls, Class cls2, Object obj) {
        this.q = cls;
        this.c0 = cls2;
        this.d0 = obj;
    }

    public static EnumC2906C valueOf(String str) {
        return (EnumC2906C) Enum.valueOf(EnumC2906C.class, str);
    }

    public static EnumC2906C[] values() {
        return (EnumC2906C[]) o0.clone();
    }

    public Class<?> d() {
        return this.c0;
    }
}
