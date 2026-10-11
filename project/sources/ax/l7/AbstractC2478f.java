package ax.l7;

import ax.l7.InterfaceC2479g;
import ax.m7.C2524C;
import ax.m7.C2531f;
import ax.m7.C2532g;
import ax.m7.C2535j;
import ax.m7.k;
import ax.m7.v;
import ax.m7.w;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ax.l7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2478f implements Closeable, AutoCloseable {
    private static WeakHashMap<Class<?>, Field> q = new WeakHashMap<>();
    private static final Lock c0 = new ReentrantLock();

    /* renamed from: ax.l7.f$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC2481i.values().length];
            a = iArr;
            try {
                iArr[EnumC2481i.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC2481i.START_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC2481i.END_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[EnumC2481i.FIELD_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[EnumC2481i.END_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[EnumC2481i.VALUE_TRUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[EnumC2481i.VALUE_FALSE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[EnumC2481i.VALUE_NUMBER_FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[EnumC2481i.VALUE_NUMBER_INT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[EnumC2481i.VALUE_STRING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[EnumC2481i.VALUE_NULL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private EnumC2481i F0() throws IOException {
        EnumC2481i e = e();
        if (e == null) {
            e = v();
        }
        v.b(e != null, "no JSON input found");
        return e;
    }

    private EnumC2481i G0() throws IOException {
        EnumC2481i F0 = F0();
        int i = a.a[F0.ordinal()];
        boolean z = true;
        if (i != 1) {
            return i != 2 ? F0 : v();
        }
        EnumC2481i v = v();
        if (v != EnumC2481i.FIELD_NAME && v != EnumC2481i.END_OBJECT) {
            z = false;
        }
        v.b(z, v);
        return v;
    }

    private void L(ArrayList<Type> arrayList, Object obj, C2473a c2473a) throws IOException {
        if (obj instanceof C2474b) {
            ((C2474b) obj).k(j());
        }
        EnumC2481i G0 = G0();
        Class<?> cls = obj.getClass();
        C2531f e = C2531f.e(cls);
        boolean isAssignableFrom = k.class.isAssignableFrom(cls);
        if (!isAssignableFrom && Map.class.isAssignableFrom(cls)) {
            s0(null, (Map) obj, C2524C.e(cls), arrayList, c2473a);
            return;
        }
        while (G0 == EnumC2481i.FIELD_NAME) {
            String u = u();
            v();
            C2535j b = e.b(u);
            if (b != null) {
                if (b.h() && !b.i()) {
                    throw new IllegalArgumentException("final array/object fields are not supported");
                }
                Field b2 = b.b();
                int size = arrayList.size();
                arrayList.add(b2.getGenericType());
                Object u0 = u0(b2, b.d(), arrayList, obj, c2473a, true);
                arrayList.remove(size);
                b.m(obj, u0);
            } else if (isAssignableFrom) {
                ((k) obj).f(u, u0(null, null, arrayList, obj, c2473a, true));
            } else {
                A0();
            }
            G0 = v();
        }
    }

    private static Field c(Class<?> cls) {
        Field field = null;
        if (cls == null) {
            return null;
        }
        Lock lock = c0;
        lock.lock();
        try {
            if (q.containsKey(cls)) {
                Field field2 = q.get(cls);
                lock.unlock();
                return field2;
            }
            Iterator<C2535j> it = C2531f.e(cls).c().iterator();
            while (it.hasNext()) {
                Field b = it.next().b();
                InterfaceC2479g interfaceC2479g = (InterfaceC2479g) b.getAnnotation(InterfaceC2479g.class);
                if (interfaceC2479g != null) {
                    v.c(field == null, "Class contains more than one field with @JsonPolymorphicTypeMap annotation: %s", cls);
                    v.c(C2532g.e(b.getType()), "Field which has the @JsonPolymorphicTypeMap, %s, is not a supported type: %s", cls, b.getType());
                    InterfaceC2479g.a[] typeDefinitions = interfaceC2479g.typeDefinitions();
                    HashSet a2 = w.a();
                    v.b(typeDefinitions.length > 0, "@JsonPolymorphicTypeMap must have at least one @TypeDef");
                    for (InterfaceC2479g.a aVar : typeDefinitions) {
                        v.c(a2.add(aVar.key()), "Class contains two @TypeDef annotations with identical key: %s", aVar.key());
                    }
                    field = b;
                }
            }
            q.put(cls, field);
            return field;
        } finally {
            c0.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> void o0(Field field, Collection<T> collection, Type type, ArrayList<Type> arrayList, C2473a c2473a) throws IOException {
        EnumC2481i G0 = G0();
        while (G0 != EnumC2481i.END_ARRAY) {
            Field field2 = field;
            collection.add(u0(field2, type, arrayList, collection, c2473a, true));
            G0 = v();
            field = field2;
        }
    }

    private void s0(Field field, Map<String, Object> map, Type type, ArrayList<Type> arrayList, C2473a c2473a) throws IOException {
        EnumC2481i G0 = G0();
        while (G0 == EnumC2481i.FIELD_NAME) {
            String u = u();
            v();
            Field field2 = field;
            map.put(u, u0(field2, type, arrayList, map, c2473a, true));
            G0 = v();
            field = field2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01bd A[Catch: IllegalArgumentException -> 0x005d, TryCatch #3 {IllegalArgumentException -> 0x005d, blocks: (B:14:0x002d, B:18:0x0046, B:19:0x005c, B:21:0x0064, B:23:0x006b, B:25:0x0072, B:27:0x007a, B:29:0x0080, B:31:0x008d, B:33:0x0093, B:35:0x00a0, B:38:0x00a9, B:44:0x00d9, B:47:0x00e3, B:49:0x00ea, B:50:0x00ef, B:53:0x00bf, B:55:0x00c7, B:57:0x00cf, B:60:0x00fa, B:62:0x0101, B:64:0x0108, B:69:0x0116, B:76:0x0125, B:84:0x0133, B:89:0x013c, B:94:0x0145, B:97:0x014a, B:98:0x0160, B:99:0x0161, B:101:0x016a, B:103:0x0173, B:105:0x017c, B:107:0x0185, B:109:0x018e, B:111:0x0197, B:115:0x019e, B:118:0x01a4, B:122:0x01b0, B:124:0x01bd, B:126:0x01c0, B:133:0x01cd, B:138:0x01e7, B:145:0x01ee, B:147:0x01f6), top: B:13:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c0 A[Catch: IllegalArgumentException -> 0x005d, TRY_LEAVE, TryCatch #3 {IllegalArgumentException -> 0x005d, blocks: (B:14:0x002d, B:18:0x0046, B:19:0x005c, B:21:0x0064, B:23:0x006b, B:25:0x0072, B:27:0x007a, B:29:0x0080, B:31:0x008d, B:33:0x0093, B:35:0x00a0, B:38:0x00a9, B:44:0x00d9, B:47:0x00e3, B:49:0x00ea, B:50:0x00ef, B:53:0x00bf, B:55:0x00c7, B:57:0x00cf, B:60:0x00fa, B:62:0x0101, B:64:0x0108, B:69:0x0116, B:76:0x0125, B:84:0x0133, B:89:0x013c, B:94:0x0145, B:97:0x014a, B:98:0x0160, B:99:0x0161, B:101:0x016a, B:103:0x0173, B:105:0x017c, B:107:0x0185, B:109:0x018e, B:111:0x0197, B:115:0x019e, B:118:0x01a4, B:122:0x01b0, B:124:0x01bd, B:126:0x01c0, B:133:0x01cd, B:138:0x01e7, B:145:0x01ee, B:147:0x01f6), top: B:13:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0317  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object u0(java.lang.reflect.Field r17, java.lang.reflect.Type r18, java.util.ArrayList<java.lang.reflect.Type> r19, java.lang.Object r20, ax.l7.C2473a r21, boolean r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.l7.AbstractC2478f.u0(java.lang.reflect.Field, java.lang.reflect.Type, java.util.ArrayList, java.lang.Object, ax.l7.a, boolean):java.lang.Object");
    }

    public final <T> T A(Class<T> cls, C2473a c2473a) throws IOException {
        return (T) H(cls, false, c2473a);
    }

    public abstract AbstractC2478f A0() throws IOException;

    public final String C0(Set<String> set) throws IOException {
        EnumC2481i G0 = G0();
        while (G0 == EnumC2481i.FIELD_NAME) {
            String u = u();
            v();
            if (set.contains(u)) {
                return u;
            }
            A0();
            G0 = v();
        }
        return null;
    }

    public final void D0(String str) throws IOException {
        C0(Collections.singleton(str));
    }

    public Object F(Type type, boolean z) throws IOException {
        return H(type, z, null);
    }

    public Object H(Type type, boolean z, C2473a c2473a) throws IOException {
        try {
            if (!Void.class.equals(type)) {
                F0();
            }
            Object u0 = u0(null, type, new ArrayList<>(), null, c2473a, true);
            if (z) {
                close();
            }
            return u0;
        } finally {
        }
    }

    public final <T> T W(Class<T> cls) throws IOException {
        return (T) d0(cls, null);
    }

    public abstract BigInteger a() throws IOException;

    public abstract byte b() throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public abstract String d() throws IOException;

    public final <T> T d0(Class<T> cls, C2473a c2473a) throws IOException {
        try {
            return (T) A(cls, c2473a);
        } finally {
            close();
        }
    }

    public abstract EnumC2481i e();

    public abstract BigDecimal f() throws IOException;

    public abstract double g() throws IOException;

    public abstract AbstractC2475c j();

    public abstract float m() throws IOException;

    public abstract int o() throws IOException;

    public abstract long p() throws IOException;

    public abstract short q() throws IOException;

    public abstract String u() throws IOException;

    public abstract EnumC2481i v() throws IOException;
}
