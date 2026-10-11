package ax.W5;

/* loaded from: classes3.dex */
public final class j2 implements i2 {
    public static final O a;
    public static final O b;
    public static final O c;
    public static final O d;
    public static final O e;

    static {
        K a2 = new K(C.a("com.google.android.gms.auth_account")).b().a();
        a = a2.e("Aang__create_auth_exception_with_pending_intent", false);
        b = a2.e("Aang__enable_add_account_restrictions", false);
        c = a2.e("Aang__log_missing_gaia_id_event", true);
        d = a2.e("Aang__log_obfuscated_gaiaid_status", true);
        e = a2.e("Aang__switch_clear_token_to_aang", false);
    }

    @Override // ax.W5.i2
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }
}
