/*
 * Decompiled with CFR 0.152.
 */
package ax.C1;

import ax.P0.A;
import ax.P0.B;
import ax.P0.C;
import ax.P0.v;
import ax.q7.c;
import ax.u7.f;

@Deprecated
public class b
implements C.a {
    public final String a;
    public final String b;

    public b(String string, String string2) {
        this.a = c.f(string);
        this.b = string2;
    }

    @Override
    public /* synthetic */ v a() {
        return B.b(this);
    }

    @Override
    public void b(A.b b8) {
        Object object = this.a;
        object.getClass();
        int n8 = -1;
        switch (((String)object).hashCode()) {
            default: {
                break;
            }
            case 1939198791: {
                if (!((String)object).equals("ARTIST")) break;
                n8 = 9;
                break;
            }
            case 1746739798: {
                if (!((String)object).equals("ALBUMARTIST")) break;
                n8 = 8;
                break;
            }
            case 993300766: {
                if (!((String)object).equals("DISCNUMBER")) break;
                n8 = 7;
                break;
            }
            case 428414940: {
                if (!((String)object).equals("DESCRIPTION")) break;
                n8 = 6;
                break;
            }
            case 79833656: {
                if (!((String)object).equals("TITLE")) break;
                n8 = 5;
                break;
            }
            case 67703139: {
                if (!((String)object).equals("GENRE")) break;
                n8 = 4;
                break;
            }
            case 62359119: {
                if (!((String)object).equals("ALBUM")) break;
                n8 = 3;
                break;
            }
            case -113312716: {
                if (!((String)object).equals("TRACKNUMBER")) break;
                n8 = 2;
                break;
            }
            case -215998278: {
                if (!((String)object).equals("TOTALDISCS")) break;
                n8 = 1;
                break;
            }
            case -1935137620: {
                if (!((String)object).equals("TOTALTRACKS")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                break;
            }
            case 9: {
                b8.Q(this.b);
                return;
            }
            case 8: {
                b8.O(this.b);
                return;
            }
            case 7: {
                object = f.p(this.b);
                if (object == null) break;
                b8.X((Integer)object);
                return;
            }
            case 6: {
                b8.W(this.b);
                return;
            }
            case 5: {
                b8.p0(this.b);
                return;
            }
            case 4: {
                b8.c0(this.b);
                return;
            }
            case 3: {
                b8.P(this.b);
                return;
            }
            case 2: {
                object = f.p(this.b);
                if (object == null) break;
                b8.s0((Integer)object);
                return;
            }
            case 1: {
                object = f.p(this.b);
                if (object == null) break;
                b8.q0((Integer)object);
                return;
            }
            case 0: {
                object = f.p(this.b);
                if (object == null) break;
                b8.r0((Integer)object);
            }
        }
    }

    @Override
    public /* synthetic */ byte[] c() {
        return B.a(this);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (b)object;
            if (this.a.equals(((b)object).a) && this.b.equals(((b)object).b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (527 + this.a.hashCode()) * 31 + this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VC: ");
        stringBuilder.append(this.a);
        stringBuilder.append("=");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}

