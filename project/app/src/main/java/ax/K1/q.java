/*
 * Decompiled with CFR 0.152.
 */
package ax.K1;

import ax.F1.c;
import ax.P0.C;
import ax.P0.E;
import ax.S0.G;
import ax.q1.M;
import ax.q1.s;
import ax.q7.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

final class q {
    private static final r d = r.d(':');
    private static final r e = r.d('*');
    private final List<a> a = new ArrayList<a>();
    private int b = 0;
    private int c;

    private void a(s s8, M m8) throws IOException {
        G g8 = new G(8);
        s8.readFully(g8.f(), 0, 8);
        this.c = g8.z() + 8;
        if (g8.v() != 1397048916) {
            m8.a = 0L;
            return;
        }
        m8.a = s8.getPosition() - (long)(this.c - 12);
        this.b = 2;
    }

    private static int b(String string) throws E {
        string.getClass();
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 1760745220: {
                if (!string.equals("Super_SlowMotion_BGM")) break;
                n8 = 4;
                break;
            }
            case -830665521: {
                if (!string.equals("Super_SlowMotion_Deflickering_On")) break;
                n8 = 3;
                break;
            }
            case -1251387154: {
                if (!string.equals("Super_SlowMotion_Data")) break;
                n8 = 2;
                break;
            }
            case -1332107749: {
                if (!string.equals("Super_SlowMotion_Edit_Data")) break;
                n8 = 1;
                break;
            }
            case -1711564334: {
                if (!string.equals("SlowMotion_Data")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                throw E.a("Invalid SEF name", null);
            }
            case 4: {
                return 2817;
            }
            case 3: {
                return 2820;
            }
            case 2: {
                return 2816;
            }
            case 1: {
                return 2819;
            }
            case 0: 
        }
        return 2192;
    }

    private void d(s s8, M m8) throws IOException {
        long l8 = s8.getLength();
        int n8 = this.c - 20;
        G g8 = new G(n8);
        s8.readFully(g8.f(), 0, n8);
        for (int i8 = 0; i8 < n8 / 12; ++i8) {
            g8.c0(2);
            short s9 = g8.B();
            if (s9 != 2192 && s9 != 2816 && s9 != 2817 && s9 != 2819 && s9 != 2820) {
                g8.c0(8);
                continue;
            }
            long l9 = this.c;
            long l10 = g8.z();
            int n9 = g8.z();
            this.a.add(new a(s9, l8 - l9 - l10, n9));
        }
        if (this.a.isEmpty()) {
            m8.a = 0L;
            return;
        }
        this.b = 3;
        m8.a = this.a.get((int)0).b;
    }

    private void e(s object, List<C.a> list) throws IOException {
        long l8 = object.getPosition();
        int n8 = (int)(object.getLength() - object.getPosition() - (long)this.c);
        G g8 = new G(n8);
        byte[] byArray = g8.f();
        object.readFully(byArray, 0, n8);
        for (int i8 = 0; i8 < this.a.size(); ++i8) {
            object = this.a.get(i8);
            g8.b0((int)(((a)object).b - l8));
            g8.c0(4);
            int n9 = g8.z();
            int n10 = q.b(g8.J(n9));
            n8 = ((a)object).c;
            if (n10 != 2192) {
                if (n10 == 2816 || n10 == 2817 || n10 == 2819 || n10 == 2820) continue;
                throw new IllegalStateException();
            }
            list.add(q.f(g8, n8 - (n9 + 8)));
        }
    }

    private static c f(G list, int n8) throws E {
        ArrayList<c.a> arrayList = new ArrayList<c.a>();
        list = ((G)((Object)list)).J(n8);
        list = e.f((CharSequence)((Object)list));
        for (n8 = 0; n8 < list.size(); ++n8) {
            List<String> list2 = d.f(list.get(n8));
            if (list2.size() == 3) {
                try {
                    long l8 = Long.parseLong(list2.get(0));
                    long l9 = Long.parseLong(list2.get(1));
                    int n9 = Integer.parseInt(list2.get(2));
                    list2 = new c.a(l8, l9, 1 << n9 - 1);
                    arrayList.add((c.a)((Object)list2));
                    continue;
                }
                catch (NumberFormatException numberFormatException) {
                    throw E.a(null, numberFormatException);
                }
            }
            throw E.a(null, null);
        }
        return new c(arrayList);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int c(s s8, M m8, List<C.a> list) throws IOException {
        int n8 = this.b;
        long l8 = 0L;
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) throw new IllegalStateException();
                    this.e(s8, list);
                    m8.a = 0L;
                    return 1;
                } else {
                    this.d(s8, m8);
                }
                return 1;
            } else {
                this.a(s8, m8);
            }
            return 1;
        } else {
            long l9 = s8.getLength();
            long l10 = l8;
            if (l9 != -1L) {
                l10 = l9 < 8L ? l8 : l9 - 8L;
            }
            m8.a = l10;
            this.b = 1;
        }
        return 1;
    }

    public void g() {
        this.a.clear();
        this.b = 0;
    }

    private static final class a {
        public final int a;
        public final long b;
        public final int c;

        public a(int n8, long l8, int n9) {
            this.a = n8;
            this.b = l8;
            this.c = n9;
        }
    }
}

