/*
 * Decompiled with CFR 0.152.
 */
package ax.Tc;

import ax.Sc.f;
import ax.Sc.i;
import ax.Tc.b;
import ax.Tc.q;
import java.text.ParseException;
import java.util.List;

public class h
extends b {
    private int e = -1;
    private q f;

    public h() {
        super("");
        super.f(null);
    }

    private i k(String string) {
        if (this.g(string)) {
            i i8 = new i();
            i8.n(string);
            String string2 = this.e(2);
            string = this.e(1);
            i8.l(string2);
            if ("PS".equals(string)) {
                i8.q(0);
                return i8;
            }
            if (!"PO".equals(string) && !"PO-E".equals(string)) {
                return null;
            }
            i8.q(1);
            return i8;
        }
        return null;
    }

    private i l(String string) {
        if (this.g(string)) {
            i i8 = new i();
            if (this.e(3).equalsIgnoreCase("OUTPUT")) {
                i8.n(string);
                i8.l(this.e(2));
                i8.q(0);
                return i8;
            }
        }
        return null;
    }

    private i m(String string) {
        if (this.g(string)) {
            i i8 = new i();
            if (this.e(4).equalsIgnoreCase("OUTPUT")) {
                i8.n(string);
                i8.l(this.e(2));
                i8.q(0);
                return i8;
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private i n(String string) {
        i i8 = new i();
        if (!this.g(string)) {
            if (string == null) return null;
            if (string.trim().isEmpty()) return null;
            i8.n(string);
            i8.l(string.split(" ")[0]);
            i8.q(0);
            return i8;
        }
        i8.n(string);
        string = this.e(1);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.e(2));
        stringBuilder.append(" ");
        stringBuilder.append(this.e(3));
        String string2 = stringBuilder.toString();
        i8.l(string);
        i8.q(0);
        try {
            i8.p(super.j(string2));
            return i8;
        }
        catch (ParseException parseException) {
            return i8;
        }
    }

    @Override
    public List<String> b(List<String> list) {
        if (list != null && !list.isEmpty()) {
            String string = list.get(0);
            if (string.contains("Volume") && string.contains("Dsname")) {
                this.o(0);
                super.h("\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s+(?:\\S+\\s+)?(?:F|FB|V|VB|U)\\s+\\S+\\s+\\S+\\s+(PS|PO|PO-E)\\s+(\\S+)\\s*");
            } else if (string.contains("Name") && string.contains("Id")) {
                this.o(1);
                super.h("(\\S+)\\s+\\S+\\s+\\S+\\s+(\\S+)\\s+(\\S+)\\s+\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s*");
            } else if (string.indexOf("total") == 0) {
                this.o(2);
                this.f = new q();
            } else if (string.indexOf("Spool Files") >= 30) {
                this.o(3);
                super.h("(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s*");
            } else if (string.indexOf("JOBNAME") == 0 && string.indexOf("JOBID") > 8) {
                this.o(4);
                super.h("(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+).*");
            } else {
                this.o(-1);
            }
            if (this.e != 3) {
                list.remove(0);
            }
        }
        return list;
    }

    @Override
    public i c(String string) {
        int n8 = this.e;
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            return null;
                        }
                        return this.m(string);
                    }
                    return this.l(string);
                }
                return this.f.c(string);
            }
            return this.n(string);
        }
        return this.k(string);
    }

    @Override
    protected f i() {
        return new f("MVS", "yyyy/MM/dd HH:mm", null);
    }

    void o(int n8) {
        this.e = n8;
    }
}

