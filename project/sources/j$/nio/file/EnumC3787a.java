package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.nio.file.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3787a {
    public static final EnumC3787a EXECUTE;
    public static final EnumC3787a READ;
    public static final EnumC3787a WRITE;
    public static final /* synthetic */ EnumC3787a[] a;

    public static EnumC3787a valueOf(String str) {
        return (EnumC3787a) Enum.valueOf(EnumC3787a.class, str);
    }

    public static EnumC3787a[] values() {
        return (EnumC3787a[]) a.clone();
    }

    static {
        EnumC3787a enumC3787a = new EnumC3787a("READ", 0);
        READ = enumC3787a;
        EnumC3787a enumC3787a2 = new EnumC3787a("WRITE", 1);
        WRITE = enumC3787a2;
        EnumC3787a enumC3787a3 = new EnumC3787a("EXECUTE", 2);
        EXECUTE = enumC3787a3;
        a = new EnumC3787a[]{enumC3787a, enumC3787a2, enumC3787a3};
    }
}
