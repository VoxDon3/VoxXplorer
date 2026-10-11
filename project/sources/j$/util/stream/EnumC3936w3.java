package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.w3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3936w3 {
    public static final EnumC3936w3 MAYBE_MORE;
    public static final EnumC3936w3 NO_MORE;
    public static final EnumC3936w3 UNLIMITED;
    public static final /* synthetic */ EnumC3936w3[] a;

    static {
        EnumC3936w3 enumC3936w3 = new EnumC3936w3("NO_MORE", 0);
        NO_MORE = enumC3936w3;
        EnumC3936w3 enumC3936w32 = new EnumC3936w3("MAYBE_MORE", 1);
        MAYBE_MORE = enumC3936w32;
        EnumC3936w3 enumC3936w33 = new EnumC3936w3("UNLIMITED", 2);
        UNLIMITED = enumC3936w33;
        a = new EnumC3936w3[]{enumC3936w3, enumC3936w32, enumC3936w33};
    }

    public static EnumC3936w3 valueOf(String str) {
        return (EnumC3936w3) Enum.valueOf(EnumC3936w3.class, str);
    }

    public static EnumC3936w3[] values() {
        return (EnumC3936w3[]) a.clone();
    }
}
