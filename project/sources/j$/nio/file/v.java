package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class v implements CopyOption {
    public static final v ATOMIC_MOVE;
    public static final v COPY_ATTRIBUTES;
    public static final v REPLACE_EXISTING;
    public static final /* synthetic */ v[] a;

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) a.clone();
    }

    static {
        v vVar = new v("REPLACE_EXISTING", 0);
        REPLACE_EXISTING = vVar;
        v vVar2 = new v("COPY_ATTRIBUTES", 1);
        COPY_ATTRIBUTES = vVar2;
        v vVar3 = new v("ATOMIC_MOVE", 2);
        ATOMIC_MOVE = vVar3;
        a = new v[]{vVar, vVar2, vVar3};
    }
}
