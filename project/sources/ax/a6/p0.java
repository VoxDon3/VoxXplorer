package ax.a6;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class p0 extends AbstractC1410l0 implements Set, j$.util.Set {
    private transient AbstractC1416o0 c0;

    p0() {
    }

    static int l(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static p0 q() {
        return s0.j0;
    }

    public static p0 r(Object obj, Object obj2, Object obj3, Object obj4) {
        return u(4, "IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    }

    public static p0 s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return u(5, "UMP_CoMoAdStoragePurposeConsentStatus", "UMP_CoMoAdUserDataPurposeConsentStatus", "UMP_CoMoAdPersonalizationPurposeConsentStatus", "UMP_CoMoAnalyticsStoragePurposeConsentStatus", "IABTCF_gdprApplies");
    }

    private static p0 u(int i, Object... objArr) {
        if (i == 0) {
            return s0.j0;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new t0(obj);
        }
        int l = l(i);
        Object[] objArr2 = new Object[l];
        int i2 = l - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                throw new NullPointerException("at index " + i5);
            }
            int hashCode = obj2.hashCode();
            int a = C1408k0.a(hashCode);
            while (true) {
                int i6 = a & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    a++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new t0(obj4);
        }
        if (l(i4) < l / 2) {
            return u(i4, objArr);
        }
        if (i4 < 3) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new s0(objArr, i3, objArr2, i2, i4);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof p0) && t() && ((p0) obj).t() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public abstract u0 iterator();

    public final AbstractC1416o0 n() {
        AbstractC1416o0 abstractC1416o0 = this.c0;
        if (abstractC1416o0 != null) {
            return abstractC1416o0;
        }
        AbstractC1416o0 p = p();
        this.c0 = p;
        return p;
    }

    AbstractC1416o0 p() {
        Object[] array = toArray();
        int i = AbstractC1416o0.d0;
        return AbstractC1416o0.l(array, array.length);
    }

    boolean t() {
        return false;
    }
}
