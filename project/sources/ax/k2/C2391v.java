package ax.k2;

/* renamed from: ax.k2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2391v {
    public static final C2391v a = new C2391v();

    private C2391v() {
    }

    public static final String a(String str) {
        ax.Gb.l.f(str, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')";
    }
}
