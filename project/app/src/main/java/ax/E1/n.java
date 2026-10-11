/*
 * Decompiled with CFR 0.152.
 */
package ax.E1;

import ax.E1.i;
import ax.E1.j;
import ax.P0.A;
import ax.S0.a;
import ax.S0.d0;
import ax.r7.z;
import ax.u7.f;
import java.util.ArrayList;
import java.util.List;

public final class n
extends i {
    public final String b;
    @Deprecated
    public final String c;
    public final z<String> d;

    public n(String object, String string, List<String> list) {
        super((String)object);
        ax.S0.a.a(list.isEmpty() ^ true);
        this.b = string;
        this.d = object = z.u(list);
        this.c = (String)object.get(0);
    }

    private static List<Integer> d(String string) {
        ArrayList<Integer> arrayList;
        block6: {
            block5: {
                arrayList = new ArrayList<Integer>();
                try {
                    if (string.length() < 10) break block5;
                    arrayList.add(Integer.parseInt(string.substring(0, 4)));
                    arrayList.add(Integer.parseInt(string.substring(5, 7)));
                    arrayList.add(Integer.parseInt(string.substring(8, 10)));
                    return arrayList;
                }
                catch (NumberFormatException numberFormatException) {
                    return new ArrayList<Integer>();
                }
            }
            if (string.length() < 7) break block6;
            arrayList.add(Integer.parseInt(string.substring(0, 4)));
            arrayList.add(Integer.parseInt(string.substring(5, 7)));
            return arrayList;
        }
        if (string.length() >= 4) {
            arrayList.add(Integer.parseInt(string.substring(0, 4)));
        }
        return arrayList;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void b(A.b b8) {
        Object object = this.a;
        object.getClass();
        int n8 = -1;
        switch (((String)object).hashCode()) {
            default: {
                break;
            }
            case 2590194: {
                if (!((String)object).equals("TYER")) break;
                n8 = 22;
                break;
            }
            case 2583398: {
                if (!((String)object).equals("TRCK")) break;
                n8 = 21;
                break;
            }
            case 2581514: {
                if (!((String)object).equals("TPE3")) break;
                n8 = 20;
                break;
            }
            case 2581513: {
                if (!((String)object).equals("TPE2")) break;
                n8 = 19;
                break;
            }
            case 2581512: {
                if (!((String)object).equals("TPE1")) break;
                n8 = 18;
                break;
            }
            case 2575251: {
                if (!((String)object).equals("TIT2")) break;
                n8 = 17;
                break;
            }
            case 2571565: {
                if (!((String)object).equals("TEXT")) break;
                n8 = 16;
                break;
            }
            case 2570410: {
                if (!((String)object).equals("TDRL")) break;
                n8 = 15;
                break;
            }
            case 2570401: {
                if (!((String)object).equals("TDRC")) break;
                n8 = 14;
                break;
            }
            case 2569891: {
                if (!((String)object).equals("TDAT")) break;
                n8 = 13;
                break;
            }
            case 2569358: {
                if (!((String)object).equals("TCON")) break;
                n8 = 12;
                break;
            }
            case 2569357: {
                if (!((String)object).equals("TCOM")) break;
                n8 = 11;
                break;
            }
            case 2567331: {
                if (!((String)object).equals("TALB")) break;
                n8 = 10;
                break;
            }
            case 83552: {
                if (!((String)object).equals("TYE")) break;
                n8 = 9;
                break;
            }
            case 83536: {
                if (!((String)object).equals("TXT")) break;
                n8 = 8;
                break;
            }
            case 83378: {
                if (!((String)object).equals("TT2")) break;
                n8 = 7;
                break;
            }
            case 83341: {
                if (!((String)object).equals("TRK")) break;
                n8 = 6;
                break;
            }
            case 83255: {
                if (!((String)object).equals("TP3")) break;
                n8 = 5;
                break;
            }
            case 83254: {
                if (!((String)object).equals("TP2")) break;
                n8 = 4;
                break;
            }
            case 83253: {
                if (!((String)object).equals("TP1")) break;
                n8 = 3;
                break;
            }
            case 82897: {
                if (!((String)object).equals("TDA")) break;
                n8 = 2;
                break;
            }
            case 82878: {
                if (!((String)object).equals("TCM")) break;
                n8 = 1;
                break;
            }
            case 82815: {
                if (!((String)object).equals("TAL")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return;
            }
            case 15: {
                object = n.d((String)this.d.get(0));
                n8 = object.size();
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) return;
                        b8.j0((Integer)object.get(2));
                    }
                    b8.k0((Integer)object.get(1));
                }
                b8.l0((Integer)object.get(0));
                return;
            }
            case 14: {
                object = n.d((String)this.d.get(0));
                n8 = object.size();
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) return;
                        b8.g0((Integer)object.get(2));
                    }
                    b8.h0((Integer)object.get(1));
                }
                b8.i0((Integer)object.get(0));
                return;
            }
            case 12: {
                object = f.p((String)this.d.get(0));
                if (object == null) {
                    b8.c0((CharSequence)this.d.get(0));
                    return;
                }
                if ((object = j.a((Integer)object)) == null) return;
                b8.c0((CharSequence)object);
                return;
            }
            case 9: 
            case 22: {
                b8.i0(Integer.parseInt((String)this.d.get(0)));
                return;
            }
            case 8: 
            case 16: {
                b8.t0((CharSequence)this.d.get(0));
                return;
            }
            case 7: 
            case 17: {
                b8.p0((CharSequence)this.d.get(0));
                return;
            }
            case 6: 
            case 21: {
                object = d0.x1((String)this.d.get(0), "/");
                n8 = Integer.parseInt(object[0]);
                object = ((String[])object).length > 1 ? Integer.valueOf(Integer.parseInt((String)object[1])) : null;
                b8.s0(n8).r0((Integer)object);
                return;
            }
            case 5: 
            case 20: {
                b8.V((CharSequence)this.d.get(0));
                return;
            }
            case 4: 
            case 19: {
                b8.O((CharSequence)this.d.get(0));
                return;
            }
            case 3: 
            case 18: {
                b8.Q((CharSequence)this.d.get(0));
                return;
            }
            case 2: 
            case 13: {
                object = (String)this.d.get(0);
                n8 = Integer.parseInt(((String)object).substring(2, 4));
                int n9 = Integer.parseInt(((String)object).substring(0, 2));
                b8.h0(n8).g0(n9);
                return;
            }
            case 1: 
            case 11: {
                b8.U((CharSequence)this.d.get(0));
                return;
            }
            case 0: 
            case 10: 
        }
        b8.P((CharSequence)this.d.get(0));
        return;
        catch (NumberFormatException | StringIndexOutOfBoundsException runtimeException) {
            return;
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && n.class == object.getClass()) {
            object = (n)object;
            if (j.Objects.equals((Object)this.a, (Object)((i)object).a) && j.Objects.equals((Object)this.b, (Object)((n)object).b) && this.d.equals(((n)object).d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        String string = this.b;
        int n9 = string != null ? string.hashCode() : 0;
        return ((527 + n8) * 31 + n9) * 31 + this.d.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(": description=");
        stringBuilder.append(this.b);
        stringBuilder.append(": values=");
        stringBuilder.append(this.d);
        return stringBuilder.toString();
    }
}

