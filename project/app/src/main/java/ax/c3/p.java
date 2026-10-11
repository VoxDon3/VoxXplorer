/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import ax.Ha.b;
import ax.Ha.c;
import ax.Tc.a;
import ax.Tc.j;
import ax.Tc.n;
import ax.Tc.q;
import java.util.Locale;

public class p
extends ax.Tc.c {
    private ax.Sc.j f() {
        return new a(new ax.Sc.j[]{new j(null), new q(null)});
    }

    @Override
    public ax.Sc.j a(String string) throws n {
        try {
            ax.Sc.j j8 = super.a(string);
            return j8;
        }
        catch (n n8) {
            CharSequence charSequence;
            if (string != null) {
                charSequence = string.toUpperCase(Locale.ENGLISH);
                if (((String)charSequence).contains("FREESTYLE FTPD")) {
                    return super.a("UNIX");
                }
                if (((String)charSequence).contains("WIN32 FTPDMIN")) {
                    return super.a("UNIX");
                }
                if (((String)charSequence).contains("WIN32")) {
                    return super.a("WINDOWS");
                }
                if (((String)charSequence).contains("LINUX")) {
                    return super.a("UNIX");
                }
                if (((String)charSequence).endsWith(": L8")) {
                    return super.a("UNIX");
                }
                if (((String)charSequence).equals("UNKNOWN_SYSTEM_TYPE")) {
                    return this.f();
                }
            }
            if (string != null && !"CWD command successful.".equals(string) && !string.contains("matches total")) {
                b b8 = c.h().f().d("FTP PARSER UNKNOWN SYST").l(n8);
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("key : ");
                ((StringBuilder)charSequence).append(string);
                b8.g(((StringBuilder)charSequence).toString()).h();
            }
            return this.f();
        }
    }
}

