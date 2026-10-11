package j$.util.stream;

import j$.util.Map;
import j$.util.Spliterator;
import java.util.EnumMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class V2 {
    public static final V2 DISTINCT;
    public static final V2 ORDERED;
    public static final V2 SHORT_CIRCUIT;
    public static final V2 SIZED;
    public static final V2 SORTED;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int u;
    public static final /* synthetic */ V2[] v;
    public final EnumMap a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public static V2 valueOf(String str) {
        return (V2) Enum.valueOf(V2.class, str);
    }

    public static V2[] values() {
        return (V2[]) v.clone();
    }

    static {
        U2 u2 = U2.SPLITERATOR;
        j$.desugar.sun.nio.fs.g w = w(u2);
        U2 u22 = U2.STREAM;
        w.c(u22);
        U2 u23 = U2.OP;
        ((EnumMap) w.b).put((EnumMap) u23, (U2) 3);
        V2 v2 = new V2("DISTINCT", 0, 0, w);
        DISTINCT = v2;
        j$.desugar.sun.nio.fs.g w2 = w(u2);
        w2.c(u22);
        ((EnumMap) w2.b).put((EnumMap) u23, (U2) 3);
        V2 v22 = new V2("SORTED", 1, 1, w2);
        SORTED = v22;
        j$.desugar.sun.nio.fs.g w3 = w(u2);
        w3.c(u22);
        EnumMap enumMap = (EnumMap) w3.b;
        enumMap.put((EnumMap) u23, (U2) 3);
        U2 u24 = U2.TERMINAL_OP;
        enumMap.put((EnumMap) u24, (U2) 2);
        U2 u25 = U2.UPSTREAM_TERMINAL_OP;
        enumMap.put((EnumMap) u25, (U2) 2);
        V2 v23 = new V2("ORDERED", 2, 2, w3);
        ORDERED = v23;
        j$.desugar.sun.nio.fs.g w4 = w(u2);
        w4.c(u22);
        ((EnumMap) w4.b).put((EnumMap) u23, (U2) 2);
        V2 v24 = new V2("SIZED", 3, 3, w4);
        SIZED = v24;
        j$.desugar.sun.nio.fs.g w5 = w(u23);
        w5.c(u24);
        int i2 = 0;
        V2 v25 = new V2("SHORT_CIRCUIT", 4, 12, w5);
        SHORT_CIRCUIT = v25;
        v = new V2[]{v2, v22, v23, v24, v25};
        f = l(u2);
        g = l(u22);
        h = l(u23);
        l(u24);
        l(u25);
        for (V2 v26 : values()) {
            i2 |= v26.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        V2 v27 = DISTINCT;
        m = v27.c;
        n = v27.d;
        V2 v28 = SORTED;
        o = v28.c;
        p = v28.d;
        V2 v29 = ORDERED;
        q = v29.c;
        r = v29.d;
        V2 v210 = SIZED;
        s = v210.c;
        t = v210.d;
        u = SHORT_CIRCUIT.c;
    }

    public static j$.desugar.sun.nio.fs.g w(U2 u2) {
        j$.desugar.sun.nio.fs.g gVar = new j$.desugar.sun.nio.fs.g(13, new EnumMap(U2.class));
        gVar.c(u2);
        return gVar;
    }

    public V2(String str, int i2, int i3, j$.desugar.sun.nio.fs.g gVar) {
        U2[] values = U2.values();
        int length = values.length;
        int i4 = 0;
        while (true) {
            EnumMap enumMap = (EnumMap) gVar.b;
            if (i4 < length) {
                Map.EL.c(enumMap, values[i4], 0);
                i4++;
            } else {
                this.a = enumMap;
                int i5 = i3 * 2;
                this.b = i5;
                this.c = 1 << i5;
                this.d = 2 << i5;
                this.e = 3 << i5;
                return;
            }
        }
    }

    public final boolean q(int i2) {
        return (i2 & this.e) == this.c;
    }

    public static int l(U2 u2) {
        int i2 = 0;
        for (V2 v2 : values()) {
            i2 |= ((Integer) v2.a.get(u2)).intValue() << v2.b;
        }
        return i2;
    }

    public static int j(int i2, int i3) {
        int i4;
        if (i2 == 0) {
            i4 = i;
        } else {
            i4 = ~(((j & i2) << 1) | i2 | ((k & i2) >> 1));
        }
        return i2 | (i3 & i4);
    }

    public static int p(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        int i2 = characteristics & 4;
        int i3 = f;
        return (i2 == 0 || spliterator.getComparator() == null) ? characteristics & i3 : characteristics & i3 & (-5);
    }
}
