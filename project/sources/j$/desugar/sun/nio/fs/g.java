package j$.desugar.sun.nio.fs;

import j$.nio.file.Path;
import j$.nio.file.PathMatcher;
import j$.nio.file.attribute.FileAttribute;
import j$.nio.file.x;
import j$.time.format.t;
import j$.util.C3809e;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.A;
import j$.util.stream.AbstractC3823a;
import j$.util.stream.B;
import j$.util.stream.C;
import j$.util.stream.C3857g3;
import j$.util.stream.C3864i0;
import j$.util.stream.C3867i3;
import j$.util.stream.C3869j0;
import j$.util.stream.C3877k3;
import j$.util.stream.C3951z3;
import j$.util.stream.Collectors;
import j$.util.stream.IntStream;
import j$.util.stream.InterfaceC3866i2;
import j$.util.stream.InterfaceC3874k0;
import j$.util.stream.Stream;
import j$.util.stream.T2;
import j$.util.stream.U2;
import java.nio.file.DirectoryStream;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToLongFunction;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements PathMatcher, DirectoryStream.Filter, FileAttribute, Predicate, Supplier, BiConsumer, DoubleFunction, Function, LongFunction, Consumer, BooleanSupplier {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ g(int i) {
        this.a = i;
    }

    public /* synthetic */ g(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void s(Object obj) {
        switch (this.a) {
            case 11:
                ((InterfaceC3866i2) this.b).s((InterfaceC3866i2) obj);
                break;
            default:
                ((ArrayList) this.b).add(obj);
                break;
        }
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return j$.util.function.a.a(this, biConsumer);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ Predicate negate() {
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // j$.nio.file.attribute.FileAttribute
    public String name() {
        return "posix:permissions";
    }

    @Override // j$.nio.file.attribute.FileAttribute
    public Object value() {
        return Collections.unmodifiableSet(x.h((Set) ((java.nio.file.attribute.FileAttribute) this.b).value()));
    }

    @Override // java.nio.file.DirectoryStream.Filter
    /* renamed from: accept, reason: collision with other method in class */
    public boolean mo6accept(Object obj) {
        return ((DirectoryStream.Filter) this.b).mo6accept(x.b(obj));
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.b).test(obj);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object apply = ((Function) this.b).apply(obj);
        if (apply == null) {
            return null;
        }
        if (apply instanceof Stream) {
            return Stream.Wrapper.convert((Stream) apply);
        }
        if (apply instanceof java.util.stream.Stream) {
            return T2.j((java.util.stream.Stream) apply);
        }
        if (apply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) apply);
        }
        if (apply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) apply);
        }
        if (apply instanceof C) {
            return B.j((C) apply);
        }
        if (apply instanceof DoubleStream) {
            return A.j((DoubleStream) apply);
        }
        if (apply instanceof InterfaceC3874k0) {
            return C3869j0.j((InterfaceC3874k0) apply);
        }
        if (apply instanceof LongStream) {
            return C3864i0.j((LongStream) apply);
        }
        C3809e.a("java.util.stream.*Stream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        Object apply = ((DoubleFunction) this.b).apply(d);
        if (apply == null) {
            return null;
        }
        if (apply instanceof C) {
            return B.j((C) apply);
        }
        if (apply instanceof DoubleStream) {
            return A.j((DoubleStream) apply);
        }
        C3809e.a("java.util.stream.DoubleStream", apply.getClass());
        throw null;
    }

    @Override // j$.nio.file.PathMatcher
    public boolean matches(Path path) {
        return ((Pattern) this.b).matcher(path.toString()).matches();
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        Object apply = ((LongFunction) this.b).apply(j);
        if (apply == null) {
            return null;
        }
        if (apply instanceof InterfaceC3874k0) {
            return C3869j0.j((InterfaceC3874k0) apply);
        }
        if (apply instanceof LongStream) {
            return C3864i0.j((LongStream) apply);
        }
        C3809e.a("java.util.stream.LongStream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.a) {
            case 14:
                C3857g3 c3857g3 = (C3857g3) this.b;
                return c3857g3.d.tryAdvance(c3857g3.e);
            case 15:
                C3867i3 c3867i3 = (C3867i3) this.b;
                return c3867i3.d.tryAdvance(c3867i3.e);
            case 16:
                C3877k3 c3877k3 = (C3877k3) this.b;
                return c3877k3.d.tryAdvance(c3877k3.e);
            default:
                C3951z3 c3951z3 = (C3951z3) this.b;
                return c3951z3.d.tryAdvance(c3951z3.e);
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 5:
                return ((AbstractC3823a) this.b).N(0);
            default:
                return (Spliterator) this.b;
        }
    }

    public void c(U2 u2) {
        ((EnumMap) this.b).put((EnumMap) u2, (U2) 1);
    }

    public g(Map map) {
        this.a = 3;
        this.b = map;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l = (Long) entry2.getKey();
                j$.time.format.p pVar = j$.time.format.a.b;
                hashMap2.put(str, new AbstractMap.SimpleImmutableEntry(str2, l));
            }
            ArrayList arrayList2 = new ArrayList(hashMap2.values());
            Collections.sort(arrayList2, j$.time.format.a.b);
            hashMap.put((t) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            hashMap.put(null, arrayList);
        }
        Collections.sort(arrayList, j$.time.format.a.b);
    }

    public String b(long j, t tVar) {
        Map map = (Map) ((Map) this.b).get(tVar);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        long[] jArr = (long[]) obj;
        Set set = Collectors.a;
        jArr[0] = ((ToLongFunction) this.b).applyAsLong(obj2) + jArr[0];
    }
}
