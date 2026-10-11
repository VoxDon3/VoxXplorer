package ax.E1;

import ax.P0.A;
import ax.S0.C0968a;
import ax.S0.d0;
import ax.r7.AbstractC2991z;
import ax.u7.C3218f;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends i {
    public final String b;

    @Deprecated
    public final String c;
    public final AbstractC2991z<String> d;

    public n(String str, String str2, List<String> list) {
        super(str);
        C0968a.a(!list.isEmpty());
        this.b = str2;
        AbstractC2991z<String> u = AbstractC2991z.u(list);
        this.d = u;
        this.c = u.get(0);
    }

    private static List<Integer> d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // ax.E1.i, ax.P0.C.a
    public void b(A.b bVar) {
        String str = this.a;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 11;
                    break;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c = '\f';
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\r';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 16;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 17;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 18;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 19;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 20;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = 21;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 22;
                    break;
                }
                break;
        }
        try {
            switch (c) {
                case 0:
                case '\n':
                    bVar.P(this.d.get(0));
                    break;
                case 1:
                case 11:
                    bVar.U(this.d.get(0));
                    break;
                case 2:
                case '\r':
                    String str2 = this.d.get(0);
                    bVar.h0(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).g0(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case 18:
                    bVar.Q(this.d.get(0));
                    break;
                case 4:
                case 19:
                    bVar.O(this.d.get(0));
                    break;
                case 5:
                case 20:
                    bVar.V(this.d.get(0));
                    break;
                case 6:
                case 21:
                    String[] x1 = d0.x1(this.d.get(0), "/");
                    bVar.s0(Integer.valueOf(Integer.parseInt(x1[0]))).r0(x1.length > 1 ? Integer.valueOf(Integer.parseInt(x1[1])) : null);
                    break;
                case 7:
                case 17:
                    bVar.p0(this.d.get(0));
                    break;
                case '\b':
                case 16:
                    bVar.t0(this.d.get(0));
                    break;
                case '\t':
                case 22:
                    bVar.i0(Integer.valueOf(Integer.parseInt(this.d.get(0))));
                    break;
                case '\f':
                    Integer p = C3218f.p(this.d.get(0));
                    if (p != null) {
                        String a = j.a(p.intValue());
                        if (a != null) {
                            bVar.c0(a);
                            break;
                        }
                    } else {
                        bVar.c0(this.d.get(0));
                        break;
                    }
                    break;
                case 14:
                    List<Integer> d = d(this.d.get(0));
                    int size = d.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.g0(d.get(2));
                            }
                        }
                        bVar.h0(d.get(1));
                    }
                    bVar.i0(d.get(0));
                    break;
                case 15:
                    List<Integer> d2 = d(this.d.get(0));
                    int size2 = d2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.j0(d2.get(2));
                            }
                        }
                        bVar.k0(d2.get(1));
                    }
                    bVar.l0(d2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.a, nVar.a) && Objects.equals(this.b, nVar.b) && this.d.equals(nVar.d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (527 + this.a.hashCode()) * 31;
        String str = this.b;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    @Override // ax.E1.i
    public String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.d;
    }
}
