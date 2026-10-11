package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3858h {
    public static final EnumC3858h CONCURRENT;
    public static final EnumC3858h IDENTITY_FINISH;
    public static final EnumC3858h UNORDERED;
    public static final /* synthetic */ EnumC3858h[] a;

    public static EnumC3858h valueOf(String str) {
        return (EnumC3858h) Enum.valueOf(EnumC3858h.class, str);
    }

    public static EnumC3858h[] values() {
        return (EnumC3858h[]) a.clone();
    }

    static {
        EnumC3858h enumC3858h = new EnumC3858h("CONCURRENT", 0);
        CONCURRENT = enumC3858h;
        EnumC3858h enumC3858h2 = new EnumC3858h("UNORDERED", 1);
        UNORDERED = enumC3858h2;
        EnumC3858h enumC3858h3 = new EnumC3858h("IDENTITY_FINISH", 2);
        IDENTITY_FINISH = enumC3858h3;
        a = new EnumC3858h[]{enumC3858h, enumC3858h2, enumC3858h3};
    }
}
