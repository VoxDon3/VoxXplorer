package j$.desugar.sun.nio.fs;

import j$.time.ZoneOffset;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.v;
import j$.util.C3953u;
import j$.util.C3954v;
import j$.util.C3956x;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class m implements Predicate, IntFunction, Supplier, BiConsumer, BinaryOperator, Function, DoubleBinaryOperator {
    public final /* synthetic */ int a;

    public /* synthetic */ m(int i) {
        this.a = i;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 12:
                break;
            case 17:
                break;
            case 26:
                break;
            case 27:
                break;
        }
        return j$.util.function.a.a(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            case 13:
                break;
            case 19:
                break;
            case 21:
                break;
        }
        return j$.util.function.a.b(this, function);
    }

    /* renamed from: andThen, reason: collision with other method in class */
    public /* synthetic */ Function m7andThen(Function function) {
        switch (this.a) {
            case 14:
                break;
            case 20:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d, double d2) {
        return Math.min(d, d2);
    }

    public /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 14:
                break;
            case 20:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ Predicate negate() {
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((String) obj).isEmpty();
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 12:
                ((List) obj).add(obj2);
                break;
            case 17:
                ((Set) obj).add(obj2);
                break;
            case 26:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case 27:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            default:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                Collectors.a(dArr, dArr2[0]);
                Collectors.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
        }
    }

    public Object a(j$.time.temporal.n nVar) {
        switch (this.a) {
            case 1:
                v vVar = (v) nVar.J(r.a);
                if (vVar == null || (vVar instanceof ZoneOffset)) {
                    return null;
                }
                return vVar;
            case 2:
                return (v) nVar.J(r.a);
            case 3:
                return (j$.time.chrono.m) nVar.J(r.b);
            case 4:
                return (s) nVar.J(r.c);
            case 5:
                j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
                if (nVar.f(aVar)) {
                    return ZoneOffset.R(nVar.l(aVar));
                }
                return null;
            case 6:
                v vVar2 = (v) nVar.J(r.a);
                return vVar2 != null ? vVar2 : (v) nVar.J(r.d);
            case 7:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.EPOCH_DAY;
                if (nVar.f(aVar2)) {
                    return j$.time.f.U(nVar.w(aVar2));
                }
                return null;
            default:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_DAY;
                if (nVar.f(aVar3)) {
                    return j$.time.i.P(nVar.w(aVar3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "ZoneId";
            case 3:
                return "Chronology";
            case 4:
                return "Precision";
            case 5:
                return "ZoneOffset";
            case 6:
                return "Zone";
            case 7:
                return "LocalDate";
            case 8:
                return "LocalTime";
            default:
                return super.toString();
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 10:
                return new C3953u();
            case 11:
                return new ArrayList();
            case 15:
                return new C3954v();
            case 16:
                return new HashSet();
            case 18:
                return new C3956x();
            case 22:
                Set set = Collectors.a;
                return new long[1];
            default:
                return new LinkedHashSet();
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 13:
                List list = (List) obj;
                Set set = Collectors.a;
                list.addAll((List) obj2);
                return list;
            case 19:
                List list2 = (List) obj;
                Set set2 = Collectors.a;
                list2.addAll((List) obj2);
                return list2;
            case 21:
                Set set3 = (Set) obj;
                Set set4 = (Set) obj2;
                Set set5 = Collectors.a;
                if (set3.size() < set4.size()) {
                    set4.addAll(set3);
                    return set4;
                }
                set3.addAll(set4);
                return set3;
            default:
                long[] jArr = (long[]) obj;
                Set set6 = Collectors.a;
                jArr[0] = jArr[0] + ((long[]) obj2)[0];
                return jArr;
        }
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        switch (this.a) {
            case 14:
                Set set = Collectors.a;
                return j$.com.android.tools.r8.a.Q(((List) obj).toArray());
            case 20:
                Set set2 = Collectors.a;
                return obj;
            default:
                Set set3 = Collectors.a;
                return Long.valueOf(((long[]) obj)[0]);
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        return new Object[i];
    }
}
