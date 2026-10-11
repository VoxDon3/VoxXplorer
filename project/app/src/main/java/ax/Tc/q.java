/*
 * Decompiled with CFR 0.152.
 */
package ax.Tc;

import ax.Sc.i;
import ax.Tc.b;
import ax.Tc.f;
import ax.Tc.p;
import java.text.ParseException;
import java.util.List;
import java.util.function.Predicate;

public class q
extends b {
    public static final ax.Sc.f f = new ax.Sc.f("UNIX", "yyyy-MM-dd HH:mm", null);
    final boolean e;

    public q() {
        this((ax.Sc.f)null);
    }

    public q(ax.Sc.f f8) {
        this(f8, false);
    }

    public q(ax.Sc.f f8, boolean bl) {
        super("([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s*(\\d+)\\s+(?:(\\S+(?:\\s\\S+)*?)\\s+)?(?:(\\S+(?:\\s\\S+)*)\\s+)?(\\d+(?:,\\s*\\d+)?)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3})|(?:\\d{1,2}\u6708\\s+\\d{1,2}\u65e5))\\s+((?:\\d+(?::\\d+)?)|(?:\\d{4}\u5e74))\\s(.*)");
        this.f(f8);
        this.e = bl;
    }

    public static /* synthetic */ boolean k(String string) {
        return string.matches("^total \\d+$");
    }

    @Override
    public List<String> b(List<String> list) {
        j.Collection._EL.removeIf(list, (Predicate)new p());
        return list;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public i c(String var1_1) {
        block20: {
            var8_2 = new i();
            var8_2.n((String)var1_1);
            if (this.g((String)var1_1) == false) return null;
            var13_3 = this.e(1);
            var12_4 = this.e(15);
            var9_5 = this.e(16);
            var11_6 = this.e(17);
            var10_7 = this.e(18);
            var1_1 = new StringBuilder();
            var1_1.append(this.e(19));
            var1_1.append(" ");
            var1_1.append(this.e(20));
            var14_8 = var1_1.toString();
            var7_9 = this.e(21);
            var1_1 = var7_9;
            if (this.e) {
                var1_1 = var7_9.replaceFirst("^\\s+", "");
            }
            try {
                if (this.e(19).contains("\u6708")) {
                    var7_9 = new f();
                    var15_13 = new ax.Sc.f("UNIX", "M'\u6708' d'\u65e5' yyyy'\u5e74'", "M'\u6708' d'\u65e5' HH:mm");
                    var7_9.f(var15_13);
                    var8_2.p(var7_9.a(var14_8));
                } else {
                    var8_2.p(super.j(var14_8));
                }
            }
            catch (ParseException var7_11) {}
            if ((var2_14 = var13_3.charAt(0)) == 45) ** GOTO lbl-1000
            if (var2_14 == 108) ** GOTO lbl-1000
            switch (var2_14) {
                default: {
                    var2_14 = 3;
                    break;
                }
                case 101: lbl-1000:
                // 2 sources

                {
                    var2_14 = 2;
                    break;
                }
                case 100: {
                    var2_14 = 1;
                    break;
                }
                case 98: 
                case 99: {
                    var2_14 = 0;
                    var3_15 = true;
                    break block20;
                }
                case 102: lbl-1000:
                // 2 sources

                {
                    var2_14 = 0;
                }
            }
            var3_15 = false;
        }
        var8_2.q(var2_14);
        var4_17 = 4;
        for (var5_16 = 0; var5_16 < 3; ++var5_16, var4_17 += 4) {
            var8_2.m(var5_16, 0, this.e(var4_17).equals("-") ^ true);
            var8_2.m(var5_16, 1, this.e(var4_17 + 1).equals("-") ^ true);
            var7_9 = this.e(var4_17 + 2);
            var6_18 = var7_9.equals("-") == false && Character.isUpperCase(var7_9.charAt(0)) == false;
            var8_2.m(var5_16, 2, var6_18);
        }
        if (!var3_15) {
            try {
                var8_2.j(Integer.parseInt(var12_4));
            }
            catch (NumberFormatException var7_12) {}
        }
        var8_2.r(var9_5);
        var8_2.i(var11_6);
        try {
            var8_2.o(Long.parseLong(var10_7));
        }
        catch (NumberFormatException var7_10) {
            // empty catch block
        }
        if (var2_14 != 2) {
            var8_2.l((String)var1_1);
            return var8_2;
        }
        var2_14 = var1_1.indexOf(" -> ");
        if (var2_14 == -1) {
            var8_2.l((String)var1_1);
            return var8_2;
        }
        var8_2.l(var1_1.substring(0, var2_14));
        var8_2.k(var1_1.substring(var2_14 + 4));
        return var8_2;
    }

    @Override
    protected ax.Sc.f i() {
        return new ax.Sc.f("UNIX", "MMM d yyyy", "MMM d HH:mm");
    }
}

