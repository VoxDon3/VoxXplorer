package ax.c3;

import java.util.Locale;

/* renamed from: ax.c3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1828p extends ax.Tc.c {
    private ax.Sc.j f() {
        return new ax.Tc.a(new ax.Sc.j[]{new ax.Tc.j(null), new ax.Tc.q(null)});
    }

    @Override // ax.Tc.c, ax.Tc.d
    public ax.Sc.j a(String str) throws ax.Tc.n {
        try {
            return super.a(str);
        } catch (ax.Tc.n e) {
            if (str != null) {
                String upperCase = str.toUpperCase(Locale.ENGLISH);
                if (upperCase.contains("FREESTYLE FTPD")) {
                    return super.a("UNIX");
                }
                if (upperCase.contains("WIN32 FTPDMIN")) {
                    return super.a("UNIX");
                }
                if (upperCase.contains("WIN32")) {
                    return super.a("WINDOWS");
                }
                if (upperCase.contains("LINUX")) {
                    return super.a("UNIX");
                }
                if (upperCase.endsWith(": L8")) {
                    return super.a("UNIX");
                }
                if (upperCase.equals("UNKNOWN_SYSTEM_TYPE")) {
                    return f();
                }
            }
            if (str != null && !"CWD command successful.".equals(str) && !str.contains("matches total")) {
                ax.Ha.c.h().f().d("FTP PARSER UNKNOWN SYST").l(e).g("key : " + str).h();
            }
            return f();
        }
    }
}
