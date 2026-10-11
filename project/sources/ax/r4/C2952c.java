package ax.r4;

import ax.Gb.l;
import ax.Gb.y;
import ax.p4.q;
import com.dropbox.core.android.AuthActivity;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: ax.r4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2952c {
    public static final C2952c a = new C2952c();

    private C2952c() {
    }

    public static final String a(String str, String str2, String str3, q qVar) {
        l.f(str, "codeChallenge");
        l.f(str2, "tokenAccessType");
        y yVar = y.a;
        String format = String.format(Locale.US, "oauth2code:%s:%s:%s", Arrays.copyOf(new Object[]{str, "S256", str2}, 3));
        l.e(format, "format(...)");
        if (str3 != null) {
            format = format + ":" + str3;
        }
        if (qVar == null) {
            return format;
        }
        return format + ":" + qVar;
    }

    public static final String b(AuthActivity.c cVar) {
        l.f(cVar, "securityProvider");
        byte[] bArr = new byte[16];
        cVar.a().nextBytes(bArr);
        StringBuilder sb = new StringBuilder();
        sb.append("oauth2:");
        for (int i = 0; i < 16; i++) {
            y yVar = y.a;
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(bArr[i] & 255)}, 1));
            l.e(format, "format(...)");
            sb.append(format);
        }
        String sb2 = sb.toString();
        l.e(sb2, "toString(...)");
        return sb2;
    }
}
