/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.Z2;
import ax.b6.g;
import ax.b6.k;
import ax.b6.n;
import ax.b6.s;
import ax.b6.w;
import ax.b6.x;
import ax.b6.y2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

public final class u
implements s,
Iterable<s> {
    private final String q;

    public u(String string) {
        if (string != null) {
            this.q = string;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    static /* bridge */ /* synthetic */ String h(u u8) {
        return u8.q;
    }

    @Override
    public final s c() {
        return new u(this.q);
    }

    @Override
    public final Boolean e() {
        return this.q.isEmpty() ^ true;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof u)) {
            return false;
        }
        object = (u)object;
        return this.q.equals(((u)object).q);
    }

    @Override
    public final Double f() {
        if (this.q.isEmpty()) {
            return 0.0;
        }
        try {
            Double d8 = Double.valueOf(this.q);
            return d8;
        }
        catch (NumberFormatException numberFormatException) {
            return Double.NaN;
        }
    }

    @Override
    public final String g() {
        return this.q;
    }

    public final int hashCode() {
        return this.q.hashCode();
    }

    @Override
    public final Iterator<s> i() {
        return new x(this);
    }

    @Override
    public final Iterator<s> iterator() {
        return new w(this);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final s k(String var1_1, Z2 var2_2, List<s> var3_3) {
        block63: {
            block64: {
                if (!("charAt".equals(var1_1) || "concat".equals(var1_1) || "hasOwnProperty".equals(var1_1) || "indexOf".equals(var1_1) || "lastIndexOf".equals(var1_1) || "match".equals(var1_1) || "replace".equals(var1_1) || "search".equals(var1_1) || "slice".equals(var1_1) || "split".equals(var1_1) || "substring".equals(var1_1) || "toLowerCase".equals(var1_1) || "toLocaleLowerCase".equals(var1_1) || "toString".equals(var1_1) || "toUpperCase".equals(var1_1) || "toLocaleUpperCase".equals(var1_1) || "trim".equals(var1_1))) {
                    throw new IllegalArgumentException(String.format("%s is not a String function", new Object[]{var1_1}));
                }
                var1_1.getClass();
                switch (var1_1.hashCode()) lbl-1000:
                // 16 sources

                {
                    default: {
                        var6_4 = -1;
                        break block63;
                    }
                    case 1943291465: {
                        if (!var1_1.equals("indexOf")) ** GOTO lbl-1000
                        var6_4 = 16;
                        break block63;
                    }
                    case 1094496948: {
                        if (!var1_1.equals("replace")) ** GOTO lbl-1000
                        var6_4 = 15;
                        break block63;
                    }
                    case 530542161: {
                        if (!var1_1.equals("substring")) ** GOTO lbl-1000
                        var6_4 = 14;
                        break block63;
                    }
                    case 109648666: {
                        if (!var1_1.equals("split")) ** GOTO lbl-1000
                        var6_4 = 13;
                        break block63;
                    }
                    case 109526418: {
                        if (!var1_1.equals("slice")) ** GOTO lbl-1000
                        var6_4 = 12;
                        break block63;
                    }
                    case 103668165: {
                        if (!var1_1.equals("match")) ** GOTO lbl-1000
                        var6_4 = 11;
                        break block63;
                    }
                    case 3568674: {
                        if (!var1_1.equals("trim")) ** GOTO lbl-1000
                        var6_4 = 10;
                        break block63;
                    }
                    case -399551817: {
                        if (!var1_1.equals("toUpperCase")) ** GOTO lbl-1000
                        var6_4 = 9;
                        break block63;
                    }
                    case -467511597: {
                        if (!var1_1.equals("lastIndexOf")) ** GOTO lbl-1000
                        var6_4 = 8;
                        break block63;
                    }
                    case -726908483: {
                        if (!var1_1.equals("toLocaleUpperCase")) ** GOTO lbl-1000
                        var6_4 = 7;
                        break block63;
                    }
                    case -906336856: {
                        if (!var1_1.equals("search")) ** GOTO lbl-1000
                        var6_4 = 6;
                        break block63;
                    }
                    case -1137582698: {
                        if (!var1_1.equals("toLowerCase")) ** GOTO lbl-1000
                        var6_4 = 5;
                        break block63;
                    }
                    case -1354795244: {
                        if (!var1_1.equals("concat")) ** GOTO lbl-1000
                        var6_4 = 4;
                        break block63;
                    }
                    case -1361633751: {
                        if (!var1_1.equals("charAt")) ** GOTO lbl-1000
                        var6_4 = 3;
                        break block63;
                    }
                    case -1464939364: {
                        if (!var1_1.equals("toLocaleLowerCase")) ** GOTO lbl-1000
                        var6_4 = 2;
                        break block63;
                    }
                    case -1776922004: {
                        if (!var1_1.equals("toString")) break;
                        var6_4 = 1;
                        break block63;
                    }
                    case -1789698943: {
                        if (var1_1.equals("hasOwnProperty")) break block64;
                    }
                }
                var6_4 = -1;
                break block63;
            }
            var6_4 = 0;
        }
        switch (var6_4) {
            default: {
                throw new IllegalArgumentException("Command not supported");
            }
            case 16: {
                y2.n("indexOf", 2, var3_3);
                var12_5 = this.q;
                var1_1 = var3_3.size() <= 0 ? s.f.g() : var2_2.b(var3_3.get(0)).g();
                var4_10 = var3_3.size() < 2 ? 0.0 : var2_2.b((s)var3_3.get(1)).f();
                return new k(Double.valueOf(var12_5.indexOf((String)var1_1, (int)y2.a(var4_10))));
            }
            case 15: {
                y2.n("replace", 2, var3_3);
                var13_14 = s.f;
                var12_6 = var13_14.g();
                var1_1 = var13_14;
                if (!var3_3.isEmpty()) {
                    var14_16 = var2_2.b(var3_3.get(0)).g();
                    var1_1 = var13_14;
                    var12_6 = var14_16;
                    if (var3_3.size() > 1) {
                        var1_1 = var2_2.b((s)var3_3.get(1));
                        var12_6 = var14_16;
                    }
                }
                if ((var6_4 = (var3_3 = this.q).indexOf(var12_6)) >= 0) {
                    if (var1_1 instanceof n) {
                        var1_1 = ((n)var1_1).a((Z2)var2_2, Arrays.asList(new s[]{new u(var12_6), new k(Double.valueOf(var6_4)), this}));
                    }
                    var2_2 = var3_3.substring(0, var6_4);
                    var1_1 = var1_1.g();
                    var12_6 = var3_3.substring(var6_4 + var12_6.length());
                    var3_3 = new StringBuilder();
                    var3_3.append((String)var2_2);
                    var3_3.append((String)var1_1);
                    var3_3.append(var12_6);
                    return new u(var3_3.toString());
                }
                ** GOTO lbl206
            }
            case 14: {
                y2.n("substring", 2, var3_3);
                var1_1 = this.q;
                var6_4 = var3_3.isEmpty() == false ? (int)y2.a(var2_2.b(var3_3.get(0)).f()) : 0;
                var7_17 = var3_3.size() > 1 ? (int)y2.a(var2_2.b((s)var3_3.get(1)).f()) : var1_1.length();
                var6_4 = Math.min(Math.max(var6_4, 0), var1_1.length());
                var7_17 = Math.min(Math.max(var7_17, 0), var1_1.length());
                return new u(var1_1.substring(Math.min(var6_4, var7_17), Math.max(var6_4, var7_17)));
            }
            case 13: {
                y2.n("split", 2, var3_3);
                var13_15 = this.q;
                if (var13_15.length() == 0) {
                    return new g(new s[]{this});
                }
                var12_7 = new ArrayList<s>();
                if (var3_3.isEmpty()) {
                    var12_7.add(this);
                } else {
                    var1_1 = var2_2.b((s)var3_3.get(0)).g();
                    var10_19 = var3_3.size() > 1 ? y2.m(var2_2.b((s)var3_3.get(1)).f()) : 0x7FFFFFFFL;
                    if (var10_19 == 0L) {
                        return new g();
                    }
                    var2_2 = var13_15.split(Pattern.quote((String)var1_1), (int)var10_19 + 1);
                    var7_18 = ((String[])var2_2).length;
                    if (var1_1.isEmpty() && ((String[])var2_2).length > 0) {
                        var6_4 = var8_20 = (int)var2_2[0].isEmpty();
                        if (var2_2[((String[])var2_2).length - 1].isEmpty()) {
                            var7_18 = ((String[])var2_2).length - 1;
                            var6_4 = var8_20;
                        }
                    } else {
                        var6_4 = 0;
                    }
                    var8_20 = var7_18;
                    var9_21 = var6_4;
                    if ((long)((String[])var2_2).length > var10_19) {
                        var8_20 = var7_18 - 1;
                        var9_21 = var6_4;
                    }
                    while (var9_21 < var8_20) {
                        var12_7.add(new u(var2_2[var9_21]));
                        ++var9_21;
                    }
                }
                return new g(var12_7);
            }
            case 12: {
                y2.n("slice", 2, var3_3);
                var1_1 = this.q;
                var4_11 = var3_3.isEmpty() == false ? var2_2.b(var3_3.get(0)).f() : 0.0;
                var4_11 = y2.a(var4_11);
                var4_11 = var4_11 < 0.0 ? Math.max((double)var1_1.length() + var4_11, 0.0) : Math.min(var4_11, (double)var1_1.length());
                var6_4 = (int)var4_11;
                var4_11 = var3_3.size() > 1 ? var2_2.b((s)var3_3.get(1)).f() : (double)var1_1.length();
                var4_11 = y2.a(var4_11);
                var4_11 = var4_11 < 0.0 ? Math.max((double)var1_1.length() + var4_11, 0.0) : Math.min(var4_11, (double)var1_1.length());
                return new u(var1_1.substring(var6_4, Math.max(0, (int)var4_11 - var6_4) + var6_4));
            }
            case 11: {
                y2.n("match", 1, var3_3);
                var12_8 = this.q;
                var1_1 = var3_3.size() <= 0 ? "" : var2_2.b(var3_3.get(0)).g();
                var1_1 = Pattern.compile((String)var1_1).matcher(var12_8);
                if (var1_1.find()) {
                    return new g(new s[]{new u(var1_1.group())});
                }
                return s.g;
            }
            case 10: {
                y2.g("toUpperCase", 0, var3_3);
                return new u(this.q.trim());
            }
            case 9: {
                y2.g("toUpperCase", 0, var3_3);
                return new u(this.q.toUpperCase(Locale.ENGLISH));
            }
            case 8: {
                y2.n("lastIndexOf", 2, var3_3);
                var12_9 = this.q;
                var1_1 = var3_3.size() <= 0 ? s.f.g() : var2_2.b(var3_3.get(0)).g();
                var4_12 = var3_3.size() < 2 ? NaN : var2_2.b((s)var3_3.get(1)).f();
                var4_12 = Double.isNaN(var4_12) != false ? Infinity : y2.a(var4_12);
                return new k(Double.valueOf(var12_9.lastIndexOf((String)var1_1, (int)var4_12)));
            }
            case 7: {
                y2.g("toLocaleUpperCase", 0, var3_3);
                return new u(this.q.toUpperCase());
            }
            case 6: {
                y2.n("search", 1, var3_3);
                var1_1 = var3_3.isEmpty() == false ? var2_2.b(var3_3.get(0)).g() : s.f.g();
                var2_2 = this.q;
                var1_1 = Pattern.compile((String)var1_1).matcher((CharSequence)var2_2);
                if (var1_1.find()) {
                    return new k(Double.valueOf(var1_1.start()));
                }
                return new k(-1.0);
            }
            case 5: {
                y2.g("toLowerCase", 0, var3_3);
                return new u(this.q.toLowerCase(Locale.ENGLISH));
            }
            case 4: {
                if (!var3_3.isEmpty()) ** GOTO lbl207
lbl206:
                // 2 sources

                return this;
lbl207:
                // 1 sources

                var1_1 = new StringBuilder(this.q);
                for (var6_4 = 0; var6_4 < var3_3.size(); ++var6_4) {
                    var1_1.append(var2_2.b((s)var3_3.get(var6_4)).g());
                }
                return new u(var1_1.toString());
            }
            case 3: {
                y2.n("charAt", 1, var3_3);
                var6_4 = var3_3.isEmpty() == false ? (int)y2.a(var2_2.b(var3_3.get(0)).f()) : 0;
                var1_1 = this.q;
                if (var6_4 >= 0 && var6_4 < var1_1.length()) {
                    return new u(String.valueOf(var1_1.charAt(var6_4)));
                }
                return s.m;
            }
            case 2: {
                y2.g("toLocaleLowerCase", 0, var3_3);
                return new u(this.q.toLowerCase());
            }
            case 1: {
                y2.g("toString", 0, var3_3);
                return this;
            }
            case 0: 
        }
        y2.g("hasOwnProperty", 1, var3_3);
        var1_1 = this.q;
        var2_2 = var2_2.b(var3_3.get(0));
        if ("length".equals(var2_2.g())) {
            return s.k;
        }
        var4_13 = var2_2.f();
        if (var4_13 == Math.floor(var4_13) && (var6_4 = (int)var4_13) >= 0 && var6_4 < var1_1.length()) {
            return s.k;
        }
        return s.l;
    }

    public final String toString() {
        String string = this.q;
        StringBuilder stringBuilder = new StringBuilder("\"");
        stringBuilder.append(string);
        stringBuilder.append("\"");
        return stringBuilder.toString();
    }
}

