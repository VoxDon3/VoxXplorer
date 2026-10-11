package ax.b6;

import okhttp3.HttpUrl;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: ax.b6.u4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1679u4 {
    public static final EnumC1679u4 c0;
    public static final EnumC1679u4 d0;
    public static final EnumC1679u4 e0;
    public static final EnumC1679u4 f0;
    public static final EnumC1679u4 g0;
    public static final EnumC1679u4 h0;
    public static final EnumC1679u4 i0;
    public static final EnumC1679u4 j0;
    public static final EnumC1679u4 k0;
    public static final EnumC1679u4 l0;
    private static final /* synthetic */ EnumC1679u4[] m0;
    private final Class<?> q;

    static {
        EnumC1679u4 enumC1679u4 = new EnumC1679u4("VOID", 0, Void.class, Void.class, null);
        c0 = enumC1679u4;
        Class cls = Integer.TYPE;
        EnumC1679u4 enumC1679u42 = new EnumC1679u4("INT", 1, cls, Integer.class, 0);
        d0 = enumC1679u42;
        EnumC1679u4 enumC1679u43 = new EnumC1679u4("LONG", 2, Long.TYPE, Long.class, 0L);
        e0 = enumC1679u43;
        EnumC1679u4 enumC1679u44 = new EnumC1679u4("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f0 = enumC1679u44;
        EnumC1679u4 enumC1679u45 = new EnumC1679u4("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        g0 = enumC1679u45;
        EnumC1679u4 enumC1679u46 = new EnumC1679u4("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        h0 = enumC1679u46;
        EnumC1679u4 enumC1679u47 = new EnumC1679u4("STRING", 6, String.class, String.class, HttpUrl.FRAGMENT_ENCODE_SET);
        i0 = enumC1679u47;
        EnumC1679u4 enumC1679u48 = new EnumC1679u4("BYTE_STRING", 7, B3.class, B3.class, B3.c0);
        j0 = enumC1679u48;
        EnumC1679u4 enumC1679u49 = new EnumC1679u4("ENUM", 8, cls, Integer.class, null);
        k0 = enumC1679u49;
        EnumC1679u4 enumC1679u410 = new EnumC1679u4("MESSAGE", 9, Object.class, Object.class, null);
        l0 = enumC1679u410;
        m0 = new EnumC1679u4[]{enumC1679u4, enumC1679u42, enumC1679u43, enumC1679u44, enumC1679u45, enumC1679u46, enumC1679u47, enumC1679u48, enumC1679u49, enumC1679u410};
    }

    private EnumC1679u4(String str, int i, Class cls, Class cls2, Object obj) {
        this.q = cls2;
    }

    public static EnumC1679u4[] values() {
        return (EnumC1679u4[]) m0.clone();
    }

    public final Class<?> d() {
        return this.q;
    }
}
