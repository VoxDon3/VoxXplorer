/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import ax.a6.k0;
import ax.a6.l0;
import ax.a6.o0;
import ax.a6.s0;
import ax.a6.t0;
import ax.a6.u0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public abstract class p0
extends l0
implements Set,
j.Set {
    private transient o0 c0;

    p0() {
    }

    static int l(int n8) {
        int n9 = Math.max(n8, 2);
        if (n9 < 0x2CCCCCCC) {
            n8 = Integer.highestOneBit(n9 - 1);
            while ((double)(n8 += n8) * 0.7 < (double)n9) {
            }
            return n8;
        }
        if (n9 < 0x40000000) {
            return 0x40000000;
        }
        throw new IllegalArgumentException("collection too large");
    }

    public static p0 q() {
        return s0.j0;
    }

    public static p0 r(Object object, Object object2, Object object3, Object object4) {
        return p0.u(4, "IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    }

    public static p0 s(Object object, Object object2, Object object3, Object object4, Object object5) {
        return p0.u(5, "UMP_CoMoAdStoragePurposeConsentStatus", "UMP_CoMoAdUserDataPurposeConsentStatus", "UMP_CoMoAdPersonalizationPurposeConsentStatus", "UMP_CoMoAnalyticsStoragePurposeConsentStatus", "IABTCF_gdprApplies");
    }

    private static p0 u(int n8, Object ... object) {
        if (n8 != 0) {
            if (n8 != 1) {
                T[] TArray;
                int n9 = p0.l(n8);
                Object[] objectArray = new Object[n9];
                int n10 = n9 - 1;
                int n11 = 0;
                int n12 = 0;
                for (int i8 = 0; i8 < n8; ++i8) {
                    Object object2 = object[i8];
                    if (object2 != null) {
                        int n13;
                        int n14;
                        int n15 = object2.hashCode();
                        int n16 = k0.a(n15);
                        while (true) {
                            if ((TArray = objectArray[n14 = n16 & n10]) == null) {
                                object[n12] = object2;
                                objectArray[n14] = object2;
                                n14 = n11 + n15;
                                n13 = n12 + 1;
                                break;
                            }
                            n14 = n11;
                            n13 = n12;
                            if (TArray.equals(object2)) break;
                            ++n16;
                        }
                        n11 = n14;
                        n12 = n13;
                        continue;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("at index ");
                    ((StringBuilder)object).append(i8);
                    throw new NullPointerException(((StringBuilder)object).toString());
                }
                Arrays.fill((Object[])object, n12, n8, null);
                if (n12 == 1) {
                    object = object[0];
                    j.Objects.requireNonNull((Object)object);
                    return new t0(object);
                }
                n8 = n9 / 2;
                if (p0.l(n12) >= n8) {
                    TArray = object;
                    if (n12 < 3) {
                        TArray = Arrays.copyOf(object, n12);
                    }
                    return new s0(TArray, n11, objectArray, n10, n12);
                }
                return p0.u(n12, (Object[])object);
            }
            object = object[0];
            j.Objects.requireNonNull((Object)object);
            return new t0(object);
        }
        return s0.j0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof p0 && this.t() && ((p0)object).t()) {
            if (this.hashCode() != object.hashCode()) return false;
        }
        if (object == this) {
            return true;
        }
        if (!(object instanceof Set)) return false;
        object = (Set)object;
        try {
            if (this.size() != object.size()) return false;
            boolean bl = this.containsAll((Collection<?>)object);
            if (bl) return true;
            return false;
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            return false;
        }
    }

    @Override
    public int hashCode() {
        Iterator iterator = this.iterator();
        int n8 = 0;
        while (iterator.hasNext()) {
            Object e8 = iterator.next();
            int n9 = e8 != null ? e8.hashCode() : 0;
            n8 += n9;
        }
        return n8;
    }

    public abstract u0 k();

    public final o0 n() {
        o0 o02;
        o0 o03 = o02 = this.c0;
        if (o02 == null) {
            this.c0 = o03 = this.p();
        }
        return o03;
    }

    o0 p() {
        Object[] objectArray = this.toArray();
        int n8 = o0.d0;
        return o0.l(objectArray, objectArray.length);
    }

    boolean t() {
        return false;
    }
}

