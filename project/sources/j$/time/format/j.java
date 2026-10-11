package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class j implements e {
    public static final j INSENSITIVE;
    public static final j LENIENT;
    public static final j SENSITIVE;
    public static final j STRICT;
    public static final /* synthetic */ j[] a;

    @Override // j$.time.format.e
    public final boolean j(o oVar, StringBuilder sb) {
        return true;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) a.clone();
    }

    static {
        j jVar = new j("SENSITIVE", 0);
        SENSITIVE = jVar;
        j jVar2 = new j("INSENSITIVE", 1);
        INSENSITIVE = jVar2;
        j jVar3 = new j("STRICT", 2);
        STRICT = jVar3;
        j jVar4 = new j("LENIENT", 3);
        LENIENT = jVar4;
        a = new j[]{jVar, jVar2, jVar3, jVar4};
    }

    @Override // java.lang.Enum
    public final String toString() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (ordinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (ordinal == 2) {
            return "ParseStrict(true)";
        }
        if (ordinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}
