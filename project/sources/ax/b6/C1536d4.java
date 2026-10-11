package ax.b6;

import ax.b6.InterfaceC1554f4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: ax.b6.d4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1536d4<T extends InterfaceC1554f4<T>> {
    private static final C1536d4 d = new C1536d4(true);
    final C1617m5<T, Object> a;
    private boolean b;
    private boolean c;

    private C1536d4() {
        this.a = new C1641p5();
    }

    public static int b(InterfaceC1554f4<?> interfaceC1554f4, Object obj) {
        O5 b = interfaceC1554f4.b();
        int a = interfaceC1554f4.a();
        if (!interfaceC1554f4.f()) {
            return c(b, a, obj);
        }
        List list = (List) obj;
        int i = 0;
        if (!interfaceC1554f4.e()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i += c(b, a, it.next());
            }
            return i;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i += d(b, it2.next());
        }
        return S3.w0(a) + i + S3.z0(i);
    }

    static int c(O5 o5, int i, Object obj) {
        int w0 = S3.w0(i);
        if (o5 == O5.m0) {
            C1616m4.g((U4) obj);
            w0 <<= 1;
        }
        return w0 + d(o5, obj);
    }

    private static int d(O5 o5, Object obj) {
        switch (C1527c4.b[o5.ordinal()]) {
            case 1:
                return S3.c(((Double) obj).doubleValue());
            case 2:
                return S3.d(((Float) obj).floatValue());
            case 3:
                return S3.e0(((Long) obj).longValue());
            case 4:
                return S3.r0(((Long) obj).longValue());
            case 5:
                return S3.k0(((Integer) obj).intValue());
            case 6:
                return S3.W(((Long) obj).longValue());
            case 7:
                return S3.g0(((Integer) obj).intValue());
            case 8:
                return S3.j(((Boolean) obj).booleanValue());
            case 9:
                return S3.F((U4) obj);
            case 10:
                return obj instanceof C1703x4 ? S3.h((C1703x4) obj) : S3.X((U4) obj);
            case 11:
                return obj instanceof B3 ? S3.E((B3) obj) : S3.G((String) obj);
            case 12:
                return obj instanceof B3 ? S3.E((B3) obj) : S3.k((byte[]) obj);
            case 13:
                return S3.z0(((Integer) obj).intValue());
            case 14:
                return S3.o0(((Integer) obj).intValue());
            case 15:
                return S3.j0(((Long) obj).longValue());
            case 16:
                return S3.s0(((Integer) obj).intValue());
            case 17:
                return S3.n0(((Long) obj).longValue());
            case 18:
                return obj instanceof InterfaceC1640p4 ? S3.b0(((InterfaceC1640p4) obj).a()) : S3.b0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int e(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        return (key.c() != Y5.MESSAGE || key.f() || key.e()) ? b(key, value) : value instanceof C1703x4 ? S3.g(entry.getKey().a(), (C1703x4) value) : S3.A(entry.getKey().a(), (U4) value);
    }

    private final Object f(T t) {
        Object obj = this.a.get(t);
        if (obj instanceof C1703x4) {
            throw new NoSuchMethodError();
        }
        return obj;
    }

    private static Object g(Object obj) {
        if (obj instanceof Y4) {
            return ((Y4) obj).a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static <T extends InterfaceC1554f4<T>> C1536d4<T> i() {
        return d;
    }

    private final void j(T t, Object obj) {
        if (!t.f()) {
            n(t, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                n(t, obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof C1703x4) {
            this.c = true;
        }
        this.a.put(t, obj);
    }

    private final void k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof C1703x4;
        if (key.f()) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object f = f(key);
            if (f == null) {
                f = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) f).add(g(it.next()));
            }
            this.a.put(key, f);
            return;
        }
        if (key.c() != Y5.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.a.put(key, g(value));
            return;
        }
        Object f2 = f(key);
        if (f2 != null) {
            if (z) {
                throw new NoSuchMethodError();
            }
            this.a.put(key, f2 instanceof Y4 ? key.v((Y4) f2, (Y4) value) : key.o(((U4) f2).f(), (U4) value).q());
        } else {
            this.a.put(key, g(value));
            if (z) {
                this.c = true;
            }
        }
    }

    private static boolean l(Object obj) {
        if (obj instanceof W4) {
            return ((W4) obj).c();
        }
        if (obj instanceof C1703x4) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if ((r6 instanceof ax.b6.C1703x4) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
    
        if ((r6 instanceof ax.b6.InterfaceC1640p4) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        if ((r6 instanceof byte[]) == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void n(T r5, java.lang.Object r6) {
        /*
            ax.b6.O5 r0 = r5.b()
            ax.b6.C1616m4.e(r6)
            int[] r1 = ax.b6.C1527c4.a
            ax.b6.Y5 r0 = r0.d()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L45;
                case 2: goto L42;
                case 3: goto L3f;
                case 4: goto L3c;
                case 5: goto L39;
                case 6: goto L36;
                case 7: goto L2d;
                case 8: goto L24;
                case 9: goto L1a;
                default: goto L18;
            }
        L18:
            r0 = 0
            goto L47
        L1a:
            boolean r0 = r6 instanceof ax.b6.U4
            if (r0 != 0) goto L22
            boolean r0 = r6 instanceof ax.b6.C1703x4
            if (r0 == 0) goto L18
        L22:
            r0 = 1
            goto L47
        L24:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L22
            boolean r0 = r6 instanceof ax.b6.InterfaceC1640p4
            if (r0 == 0) goto L18
            goto L22
        L2d:
            boolean r0 = r6 instanceof ax.b6.B3
            if (r0 != 0) goto L22
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto L18
            goto L22
        L36:
            boolean r0 = r6 instanceof java.lang.String
            goto L47
        L39:
            boolean r0 = r6 instanceof java.lang.Boolean
            goto L47
        L3c:
            boolean r0 = r6 instanceof java.lang.Double
            goto L47
        L3f:
            boolean r0 = r6 instanceof java.lang.Float
            goto L47
        L42:
            boolean r0 = r6 instanceof java.lang.Long
            goto L47
        L45:
            boolean r0 = r6 instanceof java.lang.Integer
        L47:
            if (r0 == 0) goto L4a
            return
        L4a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r3 = r5.a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            ax.b6.O5 r5 = r5.b()
            ax.b6.Y5 r5 = r5.d()
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r3
            r4[r1] = r5
            r5 = 2
            r4[r5] = r6
            java.lang.String r5 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r5 = java.lang.String.format(r5, r4)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.b6.C1536d4.n(ax.b6.f4, java.lang.Object):void");
    }

    private static <T extends InterfaceC1554f4<T>> boolean o(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.c() != Y5.MESSAGE) {
            return true;
        }
        if (!key.f()) {
            return l(entry.getValue());
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!l(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int a() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.a(); i2++) {
            i += e(this.a.f(i2));
        }
        Iterator<Map.Entry<T, Object>> it = this.a.g().iterator();
        while (it.hasNext()) {
            i += e(it.next());
        }
        return i;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        C1536d4 c1536d4 = new C1536d4();
        for (int i = 0; i < this.a.a(); i++) {
            Map.Entry<T, Object> f = this.a.f(i);
            c1536d4.j(f.getKey(), f.getValue());
        }
        for (Map.Entry<T, Object> entry : this.a.g()) {
            c1536d4.j(entry.getKey(), entry.getValue());
        }
        c1536d4.c = this.c;
        return c1536d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1536d4) {
            return this.a.equals(((C1536d4) obj).a);
        }
        return false;
    }

    public final void h(C1536d4<T> c1536d4) {
        for (int i = 0; i < c1536d4.a.a(); i++) {
            k(c1536d4.a.f(i));
        }
        Iterator<Map.Entry<T, Object>> it = c1536d4.a.g().iterator();
        while (it.hasNext()) {
            k(it.next());
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    final Iterator<Map.Entry<T, Object>> m() {
        return this.a.isEmpty() ? Collections.emptyIterator() : this.c ? new C1711y4(this.a.l().iterator()) : this.a.l().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> p() {
        return this.a.isEmpty() ? Collections.emptyIterator() : this.c ? new C1711y4(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
    }

    public final void q() {
        if (this.b) {
            return;
        }
        for (int i = 0; i < this.a.a(); i++) {
            Map.Entry<T, Object> f = this.a.f(i);
            if (f.getValue() instanceof AbstractC1599k4) {
                ((AbstractC1599k4) f.getValue()).F();
            }
        }
        this.a.m();
        this.b = true;
    }

    public final boolean r() {
        return this.b;
    }

    public final boolean s() {
        for (int i = 0; i < this.a.a(); i++) {
            if (!o(this.a.f(i))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.a.g().iterator();
        while (it.hasNext()) {
            if (!o(it.next())) {
                return false;
            }
        }
        return true;
    }

    private C1536d4(C1617m5<T, Object> c1617m5) {
        this.a = c1617m5;
        q();
    }

    private C1536d4(boolean z) {
        this(new C1641p5());
        q();
    }
}
