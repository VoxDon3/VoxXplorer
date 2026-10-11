package j$.com.android.tools.r8;

import j$.desugar.sun.nio.fs.g;
import j$.lang.Iterable$CC;
import j$.nio.file.C3791b;
import j$.nio.file.C3792c;
import j$.nio.file.LinkOption;
import j$.nio.file.attribute.FileAttribute;
import j$.nio.file.attribute.i;
import j$.nio.file.attribute.j;
import j$.nio.file.attribute.k;
import j$.nio.file.attribute.s;
import j$.nio.file.attribute.w;
import j$.nio.file.v;
import j$.time.ZoneOffset;
import j$.time.b;
import j$.time.chrono.AbstractC3794a;
import j$.time.chrono.AbstractC3802i;
import j$.time.chrono.B;
import j$.time.chrono.H;
import j$.time.chrono.InterfaceC3795b;
import j$.time.chrono.InterfaceC3798e;
import j$.time.chrono.InterfaceC3803j;
import j$.time.chrono.m;
import j$.time.chrono.n;
import j$.time.chrono.p;
import j$.time.chrono.t;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.util.A;
import j$.util.C3957y;
import j$.util.C3958z;
import j$.util.F;
import j$.util.InterfaceC3955w;
import j$.util.J;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.S;
import j$.util.Spliterator;
import j$.util.V;
import j$.util.Y;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.l;
import j$.util.q0;
import java.nio.file.CopyOption;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ long M(long j, int i) {
        long j2 = i;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (numberOfLeadingZeros >= 64) {
            if ((j2 != Long.MIN_VALUE) | (j >= 0)) {
                long j3 = j * j2;
                if (j == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long N(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }

    public static /* synthetic */ String O(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "/");
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ AbstractMap.SimpleImmutableEntry P(String str, String str2) {
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(str), Objects.requireNonNull(str2));
    }

    public static /* synthetic */ List Q(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(Objects.requireNonNull(obj));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ Set R(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            if (!hashSet.add(Objects.requireNonNull(obj))) {
                throw new IllegalArgumentException("duplicate element: " + obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static /* synthetic */ boolean S(Unsafe unsafe, Object obj, long j, l lVar) {
        while (true) {
            Unsafe unsafe2 = unsafe;
            Object obj2 = obj;
            long j2 = j;
            l lVar2 = lVar;
            if (unsafe2.compareAndSwapObject(obj2, j2, (Object) null, lVar2)) {
                return true;
            }
            if (unsafe2.getObject(obj2, j2) != null) {
                return false;
            }
            unsafe = unsafe2;
            obj = obj2;
            j = j2;
            lVar = lVar2;
        }
    }

    public static /* synthetic */ CopyOption[] U(j$.nio.file.CopyOption[] copyOptionArr) {
        CopyOption c3792c;
        if (copyOptionArr == null) {
            return null;
        }
        int length = copyOptionArr.length;
        CopyOption[] copyOptionArr2 = new CopyOption[length];
        for (int i = 0; i < length; i++) {
            j$.nio.file.CopyOption copyOption = copyOptionArr[i];
            if (copyOption == null) {
                c3792c = null;
            } else if (copyOption instanceof C3791b) {
                c3792c = ((C3791b) copyOption).a;
            } else if (copyOption instanceof LinkOption) {
                c3792c = java.nio.file.LinkOption.NOFOLLOW_LINKS;
            } else if (copyOption instanceof v) {
                v vVar = (v) copyOption;
                c3792c = vVar == v.REPLACE_EXISTING ? StandardCopyOption.REPLACE_EXISTING : vVar == v.COPY_ATTRIBUTES ? StandardCopyOption.COPY_ATTRIBUTES : StandardCopyOption.ATOMIC_MOVE;
            } else {
                c3792c = new C3792c(copyOption);
            }
            copyOptionArr2[i] = c3792c;
        }
        return copyOptionArr2;
    }

    public static /* synthetic */ long W(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    public static /* synthetic */ long X(long j, long j2) {
        long j3 = j + j2;
        if (((j2 ^ j) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long Y(long j, long j2) {
        long j3 = j - j2;
        if (((j2 ^ j) >= 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static s y(FileTime fileTime) {
        if (fileTime == null) {
            return null;
        }
        long millis = fileTime.toMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return new s(millis);
    }

    public static Optional z(java.util.Optional optional) {
        if (optional == null) {
            return null;
        }
        if (!optional.isPresent()) {
            return Optional.b;
        }
        return new Optional(optional.get());
    }

    public static FileAttribute[] T(java.nio.file.attribute.FileAttribute[] fileAttributeArr) {
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        FileAttribute[] fileAttributeArr2 = new FileAttribute[length];
        for (int i = 0; i < length; i++) {
            java.nio.file.attribute.FileAttribute fileAttribute = fileAttributeArr[i];
            fileAttributeArr2[i] = fileAttribute == null ? null : L(fileAttribute.value()) ? new g(2, fileAttribute) : fileAttribute instanceof j ? ((j) fileAttribute).a : new i(fileAttribute);
        }
        return fileAttributeArr2;
    }

    public static OptionalDouble F(C3957y c3957y) {
        if (c3957y == null) {
            return null;
        }
        boolean z = c3957y.a;
        if (!z) {
            return OptionalDouble.empty();
        }
        if (z) {
            return OptionalDouble.of(c3957y.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static C3957y A(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        if (!optionalDouble.isPresent()) {
            return C3957y.c;
        }
        return new C3957y(optionalDouble.getAsDouble());
    }

    public static char a0(String str, int i) {
        if (i < str.length()) {
            return str.charAt(i);
        }
        return (char) 0;
    }

    public static java.nio.file.attribute.FileAttribute[] V(FileAttribute[] fileAttributeArr) {
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        java.nio.file.attribute.FileAttribute[] fileAttributeArr2 = new java.nio.file.attribute.FileAttribute[length];
        for (int i = 0; i < length; i++) {
            FileAttribute fileAttribute = fileAttributeArr[i];
            fileAttributeArr2[i] = fileAttribute == null ? null : L(fileAttribute.value()) ? new k(fileAttribute) : fileAttribute instanceof i ? ((i) fileAttribute).a : new j(fileAttribute);
        }
        return fileAttributeArr2;
    }

    public static OptionalLong H(A a) {
        if (a == null) {
            return null;
        }
        boolean z = a.a;
        if (!z) {
            return OptionalLong.empty();
        }
        if (z) {
            return OptionalLong.of(a.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static A C(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        if (!optionalLong.isPresent()) {
            return A.c;
        }
        return new A(optionalLong.getAsLong());
    }

    public static boolean L(Object obj) {
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.isEmpty()) {
            return false;
        }
        Object next = set.iterator().next();
        return (next instanceof w) || (next instanceof PosixFilePermission);
    }

    public static OptionalInt G(C3958z c3958z) {
        if (c3958z == null) {
            return null;
        }
        boolean z = c3958z.a;
        if (!z) {
            return OptionalInt.empty();
        }
        if (z) {
            return OptionalInt.of(c3958z.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static C3958z B(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        if (!optionalInt.isPresent()) {
            return C3958z.c;
        }
        return new C3958z(optionalInt.getAsInt());
    }

    public static void e(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static String Z(Object obj, Object obj2) {
        String str;
        String obj3;
        String str2 = "null";
        if (obj == null || (str = obj.toString()) == null) {
            str = "null";
        }
        int length = str.length();
        if (obj2 != null && (obj3 = obj2.toString()) != null) {
            str2 = obj3;
        }
        int length2 = str2.length();
        char[] cArr = new char[length + length2 + 1];
        str.getChars(0, length, cArr, 0);
        cArr[length] = '=';
        str2.getChars(0, length2, cArr, length + 1);
        return new String(cArr);
    }

    public static void J(Iterator it, Consumer consumer) {
        if (it instanceof InterfaceC3955w) {
            ((InterfaceC3955w) it).forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.s(it.next());
        }
    }

    public static boolean o(n nVar, q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.ERA : qVar != null && qVar.p(nVar);
    }

    public static java.util.Optional E(Optional optional) {
        if (optional == null) {
            return null;
        }
        Object obj = optional.a;
        if (obj == null) {
            return java.util.Optional.empty();
        }
        if (obj != null) {
            return java.util.Optional.of(obj);
        }
        throw new NoSuchElementException("No value present");
    }

    public static FileTime D(s sVar) {
        long j;
        if (sVar == null) {
            return null;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (timeUnit != null) {
            j = timeUnit.toMillis(sVar.a);
        } else {
            long j2 = sVar.b.a;
            long j3 = j2 * 1000;
            if (((Math.abs(j2) | 1000) >>> 31) == 0 || j3 / 1000 == j2) {
                j = (r11.b / 1000000) + j3;
            } else {
                j = j2 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
        }
        return FileTime.fromMillis(j);
    }

    public static m K(j$.time.temporal.n nVar) {
        Objects.requireNonNull(nVar, "temporal");
        Object obj = (m) nVar.J(r.b);
        t tVar = t.c;
        if (obj == null) {
            obj = Objects.requireNonNull(tVar, "defaultObj");
        }
        return (m) obj;
    }

    public static int i(InterfaceC3803j interfaceC3803j, q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i = AbstractC3802i.a[((j$.time.temporal.a) qVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i != 2) {
                return interfaceC3803j.F().l(qVar);
            }
            return interfaceC3803j.g().a;
        }
        return r.a(interfaceC3803j, qVar);
    }

    public static int j(n nVar, j$.time.temporal.a aVar) {
        if (aVar == j$.time.temporal.a.ERA) {
            return nVar.getValue();
        }
        return r.a(nVar, aVar);
    }

    public static long l(n nVar, q qVar) {
        if (qVar == j$.time.temporal.a.ERA) {
            return nVar.getValue();
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
        }
        return qVar.l(nVar);
    }

    public static m b0(String str) {
        ConcurrentHashMap concurrentHashMap = AbstractC3794a.a;
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap2 = AbstractC3794a.a;
            m mVar = (m) concurrentHashMap2.get(str);
            if (mVar == null) {
                mVar = (m) AbstractC3794a.b.get(str);
            }
            if (mVar != null) {
                return mVar;
            }
            if (concurrentHashMap2.get("ISO") != null) {
                Iterator it = ServiceLoader.load(m.class).iterator();
                while (it.hasNext()) {
                    m mVar2 = (m) it.next();
                    if (str.equals(mVar2.i()) || str.equals(mVar2.v())) {
                        return mVar2;
                    }
                }
                throw new j$.time.a("Unknown chronology: " + str);
            }
            p pVar = p.l;
            AbstractC3794a.j(pVar, pVar.i());
            j$.time.chrono.w wVar = j$.time.chrono.w.c;
            AbstractC3794a.j(wVar, wVar.i());
            B b = B.c;
            AbstractC3794a.j(b, b.i());
            H h = H.c;
            AbstractC3794a.j(h, h.i());
            try {
                for (AbstractC3794a abstractC3794a : Arrays.asList(new AbstractC3794a[0])) {
                    if (!abstractC3794a.i().equals("ISO")) {
                        AbstractC3794a.j(abstractC3794a, abstractC3794a.i());
                    }
                }
                t tVar = t.c;
                AbstractC3794a.j(tVar, tVar.i());
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public static Object s(n nVar, j$.desugar.sun.nio.fs.m mVar) {
        if (mVar == r.c) {
            return j$.time.temporal.b.ERAS;
        }
        return r.c(nVar, mVar);
    }

    public static Object q(InterfaceC3798e interfaceC3798e, j$.desugar.sun.nio.fs.m mVar) {
        if (mVar == r.a || mVar == r.e || mVar == r.d) {
            return null;
        }
        if (mVar == r.g) {
            return interfaceC3798e.b();
        }
        if (mVar == r.b) {
            return interfaceC3798e.a();
        }
        if (mVar == r.c) {
            return j$.time.temporal.b.NANOS;
        }
        return mVar.a(interfaceC3798e);
    }

    public static boolean n(InterfaceC3795b interfaceC3795b, q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).B();
        }
        return qVar != null && qVar.p(interfaceC3795b);
    }

    public static long k(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static boolean m(Spliterator spliterator, int i) {
        return (spliterator.characteristics() & i) == i;
    }

    public static long t(InterfaceC3798e interfaceC3798e, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((interfaceC3798e.c().x() * 86400) + interfaceC3798e.b().X()) - zoneOffset.a;
    }

    public static Object r(InterfaceC3803j interfaceC3803j, j$.desugar.sun.nio.fs.m mVar) {
        if (mVar == r.e || mVar == r.a) {
            return interfaceC3803j.u();
        }
        if (mVar == r.d) {
            return interfaceC3803j.g();
        }
        if (mVar == r.g) {
            return interfaceC3803j.b();
        }
        if (mVar == r.b) {
            return interfaceC3803j.a();
        }
        if (mVar == r.c) {
            return j$.time.temporal.b.NANOS;
        }
        return mVar.a(interfaceC3803j);
    }

    public static int c(InterfaceC3798e interfaceC3798e, InterfaceC3798e interfaceC3798e2) {
        int compareTo = interfaceC3798e.c().compareTo(interfaceC3798e2.c());
        return (compareTo == 0 && (compareTo = interfaceC3798e.b().compareTo(interfaceC3798e2.b())) == 0) ? ((AbstractC3794a) interfaceC3798e.a()).i().compareTo(interfaceC3798e2.a().i()) : compareTo;
    }

    public static Object p(InterfaceC3795b interfaceC3795b, j$.desugar.sun.nio.fs.m mVar) {
        if (mVar == r.a || mVar == r.e || mVar == r.d || mVar == r.g) {
            return null;
        }
        if (mVar == r.b) {
            return interfaceC3795b.a();
        }
        if (mVar == r.c) {
            return j$.time.temporal.b.DAYS;
        }
        return mVar.a(interfaceC3795b);
    }

    public static j$.time.temporal.m a(InterfaceC3795b interfaceC3795b, j$.time.temporal.m mVar) {
        return mVar.d(interfaceC3795b.x(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static long u(InterfaceC3803j interfaceC3803j) {
        return ((interfaceC3803j.c().x() * 86400) + interfaceC3803j.b().X()) - interfaceC3803j.g().a;
    }

    public static int d(InterfaceC3803j interfaceC3803j, InterfaceC3803j interfaceC3803j2) {
        int compare = Long.compare(interfaceC3803j.K(), interfaceC3803j2.K());
        return (compare == 0 && (compare = interfaceC3803j.b().d - interfaceC3803j2.b().d) == 0 && (compare = interfaceC3803j.F().compareTo(interfaceC3803j2.F())) == 0 && (compare = interfaceC3803j.u().i().compareTo(interfaceC3803j2.u().i())) == 0) ? ((AbstractC3794a) interfaceC3803j.a()).i().compareTo(interfaceC3803j2.a().i()) : compare;
    }

    public static void I(Iterable iterable, Consumer consumer) {
        if (iterable instanceof j$.lang.a) {
            ((j$.lang.a) iterable).forEach(consumer);
            return;
        }
        if (!(iterable instanceof Collection)) {
            Iterable$CC.$default$forEach(iterable, consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        Iterator it = ((Collection) iterable).iterator();
        while (it.hasNext()) {
            consumer.s(it.next());
        }
    }

    public static boolean w(V v, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return v.tryAdvance((IntConsumer) consumer);
        }
        if (q0.a) {
            q0.a(v.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return v.tryAdvance((IntConsumer) new F(consumer, 0));
    }

    public static void g(V v, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            v.forEachRemaining((IntConsumer) consumer);
        } else {
            if (q0.a) {
                q0.a(v.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            v.forEachRemaining((IntConsumer) new F(consumer, 0));
        }
    }

    public static int b(InterfaceC3795b interfaceC3795b, InterfaceC3795b interfaceC3795b2) {
        int compare = Long.compare(interfaceC3795b.x(), interfaceC3795b2.x());
        if (compare != 0) {
            return compare;
        }
        return ((AbstractC3794a) interfaceC3795b.a()).i().compareTo(interfaceC3795b2.a().i());
    }

    public static boolean x(Y y, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return y.tryAdvance((LongConsumer) consumer);
        }
        if (q0.a) {
            q0.a(y.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return y.tryAdvance((LongConsumer) new J(consumer, 0));
    }

    public static void h(Y y, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            y.forEachRemaining((LongConsumer) consumer);
        } else {
            if (q0.a) {
                q0.a(y.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            y.forEachRemaining((LongConsumer) new J(consumer, 0));
        }
    }

    public static boolean v(S s, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return s.tryAdvance((DoubleConsumer) consumer);
        }
        if (q0.a) {
            q0.a(s.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return s.tryAdvance((DoubleConsumer) new j$.util.B(consumer, 0));
    }

    public static void f(S s, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            s.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (q0.a) {
                q0.a(s.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            s.forEachRemaining((DoubleConsumer) new j$.util.B(consumer, 0));
        }
    }

    public Spliterator trySplit() {
        return null;
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public long estimateSize() {
        return 0L;
    }

    public int characteristics() {
        return 16448;
    }
}
