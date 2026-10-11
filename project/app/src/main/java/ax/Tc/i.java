/*
 * Decompiled with CFR 0.152.
 */
package ax.Tc;

import ax.Sc.f;
import ax.Tc.b;
import java.text.ParseException;

public class i
extends b {
    public i(f f8) {
        super("([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s+((folder\\s+)|((\\d+)\\s+(\\d+)\\s+))(\\d+)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3}))\\s+(\\d+(?::\\d+)?)\\s+(\\S*)(\\s*.*)");
        this.f(f8);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public ax.Sc.i c(String var1_1) {
        block17: {
            var7_2 = new ax.Sc.i();
            var7_2.n((String)var1_1);
            if (this.g((String)var1_1) == false) return null;
            var10_3 = this.e(1);
            var9_5 = this.e(20);
            var1_1 = new StringBuilder();
            var1_1.append(this.e(21));
            var1_1.append(" ");
            var1_1.append(this.e(22));
            var11_7 = var1_1.toString();
            var1_1 = this.e(23);
            var8_9 = this.e(24);
            try {
                var7_2.p(super.j(var11_7));
            }
            catch (ParseException var11_8) {}
            if ((var2_10 = var10_3.charAt(0)) == 45) ** GOTO lbl-1000
            if (var2_10 == 108) ** GOTO lbl-1000
            switch (var2_10) {
                default: {
                    var2_10 = 3;
                    break;
                }
                case 101: lbl-1000:
                // 2 sources

                {
                    var2_10 = 2;
                    break;
                }
                case 100: {
                    var2_10 = 1;
                    break;
                }
                case 98: 
                case 99: {
                    var2_10 = 0;
                    var3_11 = true;
                    break block17;
                }
                case 102: lbl-1000:
                // 2 sources

                {
                    var2_10 = 0;
                }
            }
            var3_11 = false;
        }
        var7_2.q(var2_10);
        var4_13 = 4;
        for (var5_12 = 0; var5_12 < 3; ++var5_12, var4_13 += 4) {
            var7_2.m(var5_12, 0, this.e(var4_13).equals("-") ^ true);
            var7_2.m(var5_12, 1, this.e(var4_13 + 1).equals("-") ^ true);
            var10_3 = this.e(var4_13 + 2);
            var6_14 = var10_3.equals("-") == false && Character.isUpperCase(var10_3.charAt(0)) == false;
            var7_2.m(var5_12, 2, var6_14);
        }
        if (!var3_11) {
            try {
                var7_2.j(Integer.parseInt("0"));
            }
            catch (NumberFormatException var10_4) {}
        }
        var7_2.r(null);
        var7_2.i(null);
        try {
            var7_2.o(Long.parseLong((String)var9_5));
        }
        catch (NumberFormatException var9_6) {
            // empty catch block
        }
        if (var8_9 == null) {
            var7_2.l((String)var1_1);
            return var7_2;
        }
        var9_5 = new StringBuilder();
        var9_5.append((String)var1_1);
        var9_5.append(var8_9);
        var1_1 = var9_5.toString();
        if (var2_10 != 2) {
            var7_2.l((String)var1_1);
            return var7_2;
        }
        var2_10 = var1_1.indexOf(" -> ");
        if (var2_10 == -1) {
            var7_2.l((String)var1_1);
            return var7_2;
        }
        var7_2.l(var1_1.substring(0, var2_10));
        var7_2.k(var1_1.substring(var2_10 + 4));
        return var7_2;
    }

    @Override
    protected f i() {
        return new f("UNIX", "MMM d yyyy", "MMM d HH:mm");
    }
}

