package ax.W5;

import android.net.Uri;

/* loaded from: classes3.dex */
public final class C {
    private static final ax.B.a a = new ax.B.a();

    public static synchronized Uri a(String str) {
        synchronized (C.class) {
            ax.B.a aVar = a;
            Uri uri = (Uri) aVar.get("com.google.android.gms.auth_account");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
            aVar.put("com.google.android.gms.auth_account", parse);
            return parse;
        }
    }
}
