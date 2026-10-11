/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Dc.A;
import ax.Dc.B;
import ax.Dc.C;
import ax.Dc.D;
import ax.Dc.E;
import ax.Dc.F;
import ax.Dc.N;
import ax.Dc.W;
import ax.Dc.b;
import ax.Dc.h;
import ax.Dc.l;
import ax.Dc.o;
import ax.Dc.q;
import ax.Dc.r;
import ax.Dc.s;
import ax.Dc.t;
import ax.Dc.u;
import ax.Dc.x;
import ax.Dc.y;
import ax.Dc.z;
import java.util.ArrayList;
import java.util.Map;
import java.util.zip.ZipException;

public class i {
    private static final Map<W, Class<?>> a = new j.ConcurrentHashMap();
    static final N[] b;

    static {
        i.g(b.class);
        i.g(D.class);
        i.g(E.class);
        i.g(l.class);
        i.g(r.class);
        i.g(q.class);
        i.g(F.class);
        i.g(x.class);
        i.g(y.class);
        i.g(z.class);
        i.g(A.class);
        i.g(B.class);
        i.g(C.class);
        i.g(o.class);
        b = new N[0];
    }

    public static N a(W w8) throws InstantiationException, IllegalAccessException {
        N n8 = i.b(w8);
        if (n8 != null) {
            return n8;
        }
        n8 = new u();
        ((u)n8).e(w8);
        return n8;
    }

    public static N b(W serializable) throws InstantiationException, IllegalAccessException {
        if ((serializable = a.get(serializable)) != null) {
            return (N)((Class)serializable).newInstance();
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static N c(N n8, byte[] object, int n9, int n10, boolean bl) throws ZipException {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException2;
        if (bl) {
            try {
                n8.d((byte[])object, n9, n10);
                return n8;
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException2) {}
        } else {
            n8.j((byte[])object, n9, n10);
            return n8;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Failed to parse corrupt ZIP extra field of type ");
        ((StringBuilder)object).append(Integer.toHexString(n8.b().d()));
        throw (ZipException)new ZipException(((StringBuilder)object).toString()).initCause(arrayIndexOutOfBoundsException2);
    }

    public static byte[] d(N[] objectArray) {
        int n8;
        int n9 = objectArray.length;
        boolean bl = n9 > 0 && objectArray[n9 - 1] instanceof t;
        int n10 = bl ? n9 - 1 : n9;
        int n11 = n10 * 4;
        int n12 = objectArray.length;
        for (n8 = 0; n8 < n12; ++n8) {
            n11 += objectArray[n8].i().d();
        }
        byte[] byArray = new byte[n11];
        n8 = 0;
        for (n11 = 0; n11 < n10; ++n11) {
            System.arraycopy(objectArray[n11].b().b(), 0, byArray, n8, 2);
            System.arraycopy(objectArray[n11].i().b(), 0, byArray, n8 + 2, 2);
            n12 = n8 + 4;
            byte[] byArray2 = objectArray[n11].h();
            n8 = n12;
            if (byArray2 == null) continue;
            System.arraycopy(byArray2, 0, byArray, n12, byArray2.length);
            n8 = n12 + byArray2.length;
        }
        if (bl && (objectArray = (Object[])objectArray[n9 - 1].h()) != null) {
            System.arraycopy(objectArray, 0, byArray, n8, objectArray.length);
        }
        return byArray;
    }

    public static byte[] e(N[] objectArray) {
        int n8;
        int n9 = objectArray.length;
        boolean bl = n9 > 0 && objectArray[n9 - 1] instanceof t;
        int n10 = bl ? n9 - 1 : n9;
        int n11 = n10 * 4;
        int n12 = objectArray.length;
        for (n8 = 0; n8 < n12; ++n8) {
            n11 += objectArray[n8].c().d();
        }
        byte[] byArray = new byte[n11];
        n8 = 0;
        for (n11 = 0; n11 < n10; ++n11) {
            System.arraycopy(objectArray[n11].b().b(), 0, byArray, n8, 2);
            System.arraycopy(objectArray[n11].c().b(), 0, byArray, n8 + 2, 2);
            n12 = n8 + 4;
            byte[] byArray2 = objectArray[n11].f();
            n8 = n12;
            if (byArray2 == null) continue;
            System.arraycopy(byArray2, 0, byArray, n12, byArray2.length);
            n8 = n12 + byArray2.length;
        }
        if (bl && (objectArray = (Object[])objectArray[n9 - 1].f()) != null) {
            System.arraycopy(objectArray, 0, byArray, n8, objectArray.length);
        }
        return byArray;
    }

    public static N[] f(byte[] object, boolean bl, h h8) throws ZipException {
        int n8;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        int n9 = ((byte[])object).length;
        for (int i8 = 0; i8 <= n9 - 4; i8 += n8 + 4) {
            Object object2 = new W((byte[])object, i8);
            int n10 = i8 + 4;
            n8 = new W((byte[])object, i8 + 2).d();
            if (n10 + n8 > n9) {
                if ((object = (Object)h8.d((byte[])object, i8, n9 - i8, bl, n8)) == null) break;
                arrayList.add(object);
                break;
            }
            try {
                object2 = h8.h((W)object2);
                j.Objects.requireNonNull((Object)object2, (String)"createExtraField must not return null");
                object2 = h8.j((N)object2, (byte[])object, n10, n8, bl);
                j.Objects.requireNonNull((Object)object2, (String)"fill must not return null");
                arrayList.add(object2);
                continue;
            }
            catch (IllegalAccessException | InstantiationException reflectiveOperationException) {
                throw (ZipException)new ZipException(reflectiveOperationException.getMessage()).initCause(reflectiveOperationException);
            }
        }
        return arrayList.toArray(b);
    }

    public static void g(Class<?> clazz) {
        try {
            N n8 = (N)clazz.newInstance();
            a.put(n8.b(), clazz);
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(clazz);
            stringBuilder.append("'s no-arg constructor is not public");
            throw new RuntimeException(stringBuilder.toString());
        }
        catch (InstantiationException instantiationException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(clazz);
            stringBuilder.append(" is not a concrete class");
            throw new RuntimeException(stringBuilder.toString());
        }
        catch (ClassCastException classCastException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(clazz);
            stringBuilder.append(" doesn't implement ZipExtraField");
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static final class a
    implements s {
        public static final a c0 = new a(0);
        public static final a d0 = new a(1);
        public static final a e0 = new a(2);
        private final int q;

        private a(int n8) {
            this.q = n8;
        }

        @Override
        public N d(byte[] object, int n8, int n9, boolean bl, int n10) throws ZipException {
            int n11 = this.q;
            if (n11 != 0) {
                if (n11 != 1) {
                    if (n11 == 2) {
                        t t8 = new t();
                        if (bl) {
                            t8.d((byte[])object, n8, n9);
                            return t8;
                        }
                        t8.j((byte[])object, n8, n9);
                        return t8;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Unknown UnparseableExtraField key: ");
                    ((StringBuilder)object).append(this.q);
                    throw new ZipException(((StringBuilder)object).toString());
                }
                return null;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Bad extra field starting at ");
            ((StringBuilder)object).append(n8);
            ((StringBuilder)object).append(".  Block length of ");
            ((StringBuilder)object).append(n10);
            ((StringBuilder)object).append(" bytes exceeds remaining data of ");
            ((StringBuilder)object).append(n9 - 4);
            ((StringBuilder)object).append(" bytes.");
            throw new ZipException(((StringBuilder)object).toString());
        }
    }
}

