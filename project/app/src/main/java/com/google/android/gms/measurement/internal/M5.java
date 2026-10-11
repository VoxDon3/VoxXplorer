/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import ax.M5.p;
import ax.b6.D1;
import ax.b6.F1;
import com.google.android.gms.measurement.internal.I5;
import com.google.android.gms.measurement.internal.V1;
import com.google.android.gms.measurement.internal.x5;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

abstract class M5 {
    String a;
    int b;
    Boolean c;
    Boolean d;
    Long e;
    Long f;

    M5(String string, int n8) {
        this.a = string;
        this.b = n8;
    }

    static Boolean b(double d8, D1 object) {
        try {
            BigDecimal bigDecimal = new BigDecimal(d8);
            object = M5.h(bigDecimal, (D1)object, Math.ulp(d8));
            return object;
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    static Boolean c(long l8, D1 object) {
        try {
            BigDecimal bigDecimal = new BigDecimal(l8);
            object = M5.h(bigDecimal, (D1)object, 0.0);
            return object;
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    static Boolean d(Boolean bl, boolean bl2) {
        if (bl == null) {
            return null;
        }
        bl2 = bl != bl2;
        return bl2;
    }

    static Boolean e(String object, D1 d12) {
        if (!x5.h0((String)object)) {
            return null;
        }
        try {
            BigDecimal bigDecimal = new BigDecimal((String)object);
            object = M5.h(bigDecimal, d12, 0.0);
            return object;
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    private static Boolean f(String string, F1.a a8, boolean bl, String string2, List<String> list, String string3, V1 v12) {
        if (string == null) {
            return null;
        }
        if (a8 == F1.a.i0 ? list == null || list.isEmpty() : string2 == null) {
            return null;
        }
        String string4 = string;
        if (!bl) {
            string4 = a8 == F1.a.d0 ? string : string.toUpperCase(Locale.ENGLISH);
        }
        switch (I5.a[a8.ordinal()]) {
            default: {
                return null;
            }
            case 6: {
                if (list == null) {
                    return null;
                }
                return list.contains(string4);
            }
            case 5: {
                return string4.equals(string2);
            }
            case 4: {
                return string4.contains(string2);
            }
            case 3: {
                return string4.endsWith(string2);
            }
            case 2: {
                return string4.startsWith(string2);
            }
            case 1: 
        }
        if (string3 == null) {
            return null;
        }
        int n8 = bl ? 0 : 66;
        try {
            bl = Pattern.compile(string3, n8).matcher(string4).matches();
        }
        catch (PatternSyntaxException patternSyntaxException) {
            if (v12 != null) {
                v12.L().b("Invalid regular expression in REGEXP audience filter. expression", string3);
            }
            return null;
        }
        return bl;
    }

    static Boolean g(String string, F1 object, V1 v12) {
        p.l(object);
        if (string == null) {
            return null;
        }
        if (((F1)object).Q() && ((F1)object).I() != F1.a.c0) {
            Object object2;
            Object object3 = ((F1)object).I();
            if (object3 == (object2 = F1.a.i0) ? ((F1)object).n() == 0 : !((F1)object).P()) {
                return null;
            }
            F1.a a8 = ((F1)object).I();
            boolean bl = ((F1)object).N();
            object2 = !bl && a8 != F1.a.d0 && a8 != object2 ? ((F1)object).L().toUpperCase(Locale.ENGLISH) : ((F1)object).L();
            if (((F1)object).n() == 0) {
                object = null;
            } else {
                object = ((F1)object).M();
                if (!bl) {
                    object3 = new ArrayList<String>(object.size());
                    object = object.iterator();
                    while (object.hasNext()) {
                        object3.add(((String)object.next()).toUpperCase(Locale.ENGLISH));
                    }
                    object = java.util.DesugarCollections.unmodifiableList(object3);
                }
            }
            object3 = a8 == F1.a.d0 ? object2 : null;
            return M5.f(string, a8, bl, (String)object2, object, object3, v12);
        }
        return null;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Boolean h(BigDecimal bigDecimal, D1 object, double d8) {
        block26: {
            BigDecimal bigDecimal2;
            D1.a a8;
            Object object2;
            block28: {
                block27: {
                    D1.a a9;
                    p.l(object);
                    if (!((D1)object).P() || ((D1)object).I() == D1.a.c0) break block26;
                    object2 = ((D1)object).I();
                    if (object2 == (a9 = D1.a.g0) ? !((D1)object).T() || !((D1)object).S() : !((D1)object).Q()) {
                        return null;
                    }
                    a8 = ((D1)object).I();
                    if (((D1)object).I() == a9) {
                        if (x5.h0(((D1)object).N()) && x5.h0(((D1)object).M())) {
                            object2 = new BigDecimal(((D1)object).N());
                            bigDecimal2 = new BigDecimal(((D1)object).M());
                            object = object2;
                            object2 = null;
                        }
                        return null;
                    }
                    if (!x5.h0(((D1)object).L())) {
                        return null;
                    }
                    try {
                        object2 = new BigDecimal(((D1)object).L());
                        object = null;
                        bigDecimal2 = null;
                    }
                    catch (NumberFormatException numberFormatException) {
                        return null;
                    }
                    if (a8 != a9) break block27;
                    if (object == null) {
                        return null;
                    }
                    break block28;
                }
                if (object2 == null) break block26;
            }
            int n8 = I5.b[a8.ordinal()];
            boolean bl = false;
            boolean bl2 = false;
            boolean bl3 = false;
            boolean bl4 = false;
            boolean bl5 = false;
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) return null;
                        if (object == null) {
                            return null;
                        }
                        bl3 = bl5;
                        if (bigDecimal.compareTo((BigDecimal)object) < 0) return bl3;
                        bl3 = bl5;
                        if (bigDecimal.compareTo(bigDecimal2) > 0) return bl3;
                        bl3 = true;
                        return bl3;
                    } else {
                        if (object2 == null) return null;
                        if (d8 != 0.0) {
                            bl3 = bl;
                            if (bigDecimal.compareTo(((BigDecimal)object2).subtract(new BigDecimal(d8).multiply(new BigDecimal(2)))) <= 0) return bl3;
                            bl3 = bl;
                            if (bigDecimal.compareTo(((BigDecimal)object2).add(new BigDecimal(d8).multiply(new BigDecimal(2)))) >= 0) return bl3;
                            bl3 = true;
                            return bl3;
                        }
                        bl3 = bl2;
                        if (bigDecimal.compareTo((BigDecimal)object2) != 0) return bl3;
                        bl3 = true;
                        return bl3;
                    }
                } else {
                    if (object2 == null) return null;
                    if (bigDecimal.compareTo((BigDecimal)object2) <= 0) return bl3;
                    bl3 = true;
                    return bl3;
                }
            } else if (object2 != null) {
                bl3 = bl4;
                if (bigDecimal.compareTo((BigDecimal)object2) >= 0) return bl3;
                bl3 = true;
                return bl3;
            }
        }
        return null;
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    abstract int a();

    abstract boolean i();

    abstract boolean j();
}

