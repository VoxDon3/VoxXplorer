/*
 * Decompiled with CFR 0.152.
 */
package ax.a2;

import android.content.res.Resources;
import android.text.TextUtils;
import ax.P0.v;
import ax.S0.a;
import ax.S0.d0;
import ax.a2.D;
import ax.a2.G;
import java.util.Locale;

public class f
implements G {
    private final Resources a;

    public f(Resources resources) {
        this.a = ax.S0.a.e(resources);
    }

    private String b(v v8) {
        int n8 = v8.G;
        if (n8 != -1 && n8 >= 1) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 6 && n8 != 7) {
                        if (n8 != 8) {
                            return this.a.getString(D.A);
                        }
                        return this.a.getString(D.C);
                    }
                    return this.a.getString(D.B);
                }
                return this.a.getString(D.z);
            }
            return this.a.getString(D.q);
        }
        return "";
    }

    private String c(v v8) {
        int n8 = v8.j;
        if (n8 == -1) {
            return "";
        }
        return this.a.getString(D.p, new Object[]{Float.valueOf((float)n8 / 1000000.0f)});
    }

    private String d(v v8) {
        if (TextUtils.isEmpty((CharSequence)v8.b)) {
            return "";
        }
        return v8.b;
    }

    private String e(v v8) {
        String string = this.j(this.f(v8), this.h(v8));
        if (TextUtils.isEmpty((CharSequence)string)) {
            return this.d(v8);
        }
        return string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String f(v object) {
        object = ((v)object).d;
        if (TextUtils.isEmpty((CharSequence)object)) return "";
        if ("und".equals(object)) return "";
        object = Locale.forLanguageTag((String)object);
        Object object2 = d0.Y();
        if (TextUtils.isEmpty((CharSequence)(object = ((Locale)object).getDisplayName((Locale)object2)))) {
            return "";
        }
        try {
            int n8 = ((String)object).offsetByCodePoints(0, 1);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(((String)object).substring(0, n8).toUpperCase((Locale)object2));
            stringBuilder.append(((String)object).substring(n8));
            object2 = stringBuilder.toString();
            return object2;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            return object;
        }
    }

    private String g(v v8) {
        int n8 = v8.v;
        int n9 = v8.w;
        if (n8 != -1 && n9 != -1) {
            return this.a.getString(D.r, new Object[]{n8, n9});
        }
        return "";
    }

    private String h(v v8) {
        String string = (v8.f & 2) != 0 ? this.a.getString(D.s) : "";
        String string2 = string;
        if ((v8.f & 4) != 0) {
            string2 = this.j(string, this.a.getString(D.v));
        }
        string = string2;
        if ((v8.f & 8) != 0) {
            string = this.j(string2, this.a.getString(D.u));
        }
        if ((v8.f & 0x440) != 0) {
            return this.j(string, this.a.getString(D.t));
        }
        return string;
    }

    private static int i(v v8) {
        int n8 = ax.P0.D.k(v8.o);
        if (n8 != -1) {
            return n8;
        }
        if (ax.P0.D.n(v8.k) != null) {
            return 2;
        }
        if (ax.P0.D.c(v8.k) != null) {
            return 1;
        }
        if (v8.v == -1 && v8.w == -1) {
            if (v8.G == -1 && v8.H == -1) {
                return -1;
            }
            return 1;
        }
        return 2;
    }

    private String j(String ... stringArray) {
        int n8 = stringArray.length;
        String string = "";
        for (int i8 = 0; i8 < n8; ++i8) {
            String string2 = stringArray[i8];
            String string3 = string;
            if (!string2.isEmpty()) {
                string3 = TextUtils.isEmpty((CharSequence)string) ? string2 : this.a.getString(D.o, new Object[]{string, string2});
            }
            string = string3;
        }
        return string;
    }

    @Override
    public String a(v object) {
        int n8 = f.i((v)object);
        String string = n8 == 2 ? this.j(this.h((v)object), this.g((v)object), this.c((v)object)) : (n8 == 1 ? this.j(this.e((v)object), this.b((v)object), this.c((v)object)) : this.e((v)object));
        if (!string.isEmpty()) {
            return string;
        }
        object = ((v)object).d;
        if (object != null && !((String)object).trim().isEmpty()) {
            return this.a.getString(D.E, new Object[]{object});
        }
        return this.a.getString(D.D);
    }
}

