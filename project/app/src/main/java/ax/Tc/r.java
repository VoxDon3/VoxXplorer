/*
 * Decompiled with CFR 0.152.
 */
package ax.Tc;

import ax.Sc.f;
import ax.Sc.i;
import ax.Tc.b;
import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.StringTokenizer;

public class r
extends b {
    public r() {
        this((f)null);
    }

    public r(f f8) {
        super("(.*?;[0-9]+)\\s*(\\d+)(?:/\\d+)?\\s*(\\S+)\\s+(\\S+)\\s+\\[(([0-9$A-Za-z_]+)|([0-9$A-Za-z_]+),([0-9$a-zA-Z_]+))\\]?\\s*\\([a-zA-Z]*,([a-zA-Z]*),([a-zA-Z]*),([a-zA-Z]*)\\)");
        this.f(f8);
    }

    @Override
    public String a(BufferedReader bufferedReader) throws IOException {
        String string = bufferedReader.readLine();
        StringBuilder stringBuilder = new StringBuilder();
        while (string != null) {
            if (!string.startsWith("Directory") && !string.startsWith("Total")) {
                stringBuilder.append(string);
                if (string.trim().endsWith(")")) break;
                string = bufferedReader.readLine();
                continue;
            }
            string = bufferedReader.readLine();
        }
        if (stringBuilder.length() == 0) {
            return null;
        }
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public i c(String object) {
        int n8;
        boolean bl = this.g((String)object);
        String string = null;
        if (!bl) return null;
        i i8 = new i();
        i8.n((String)object);
        String string2 = this.e(1);
        String string3 = this.e(2);
        object = new StringBuilder();
        ((StringBuilder)object).append(this.e(3));
        ((StringBuilder)object).append(" ");
        ((StringBuilder)object).append(this.e(4));
        String string4 = ((StringBuilder)object).toString();
        object = this.e(5);
        String string5 = this.e(9);
        String string6 = this.e(10);
        String string7 = this.e(11);
        try {
            i8.p(super.j(string4));
        }
        catch (ParseException parseException) {}
        if ((n8 = ((StringTokenizer)(object = new StringTokenizer((String)object, ","))).countTokens()) != 1) {
            if (n8 != 2) {
                object = null;
            } else {
                string = ((StringTokenizer)object).nextToken();
                object = ((StringTokenizer)object).nextToken();
            }
        } else {
            object = ((StringTokenizer)object).nextToken();
        }
        if (string2.lastIndexOf(".DIR") != -1) {
            i8.q(1);
        } else {
            i8.q(0);
        }
        string4 = string2;
        if (!this.k()) {
            string4 = string2.substring(0, string2.lastIndexOf(59));
        }
        i8.l(string4);
        i8.o(Long.parseLong(string3) * 512L);
        i8.i(string);
        i8.r((String)object);
        n8 = 0;
        while (n8 < 3) {
            object = (new String[]{string5, string6, string7})[n8];
            bl = ((String)object).indexOf(82) >= 0;
            i8.m(n8, 0, bl);
            bl = ((String)object).indexOf(87) >= 0;
            i8.m(n8, 1, bl);
            bl = ((String)object).indexOf(69) >= 0;
            i8.m(n8, 2, bl);
            ++n8;
        }
        return i8;
    }

    @Override
    protected f i() {
        return new f("VMS", "d-MMM-yyyy HH:mm:ss", null);
    }

    protected boolean k() {
        throw null;
    }
}

