package j$.nio.file;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import j$.util.stream.AbstractC3823a;
import j$.util.stream.AbstractC3904q0;
import j$.util.stream.B3;
import j$.util.stream.C3847e3;
import j$.util.stream.C3884m0;
import j$.util.stream.C3913s0;
import j$.util.stream.EnumC3908r0;
import j$.util.stream.V2;
import j$.util.stream.W2;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class w implements A, BiConsumer, BiFunction, Consumer, Supplier, B3 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ w(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
        }
        return j$.util.function.a.a(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return j$.util.function.a.b(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.c).apply(((BiFunction) this.b).apply(obj, obj2));
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                break;
            default:
                ((BiConsumer) this.b).accept(obj, obj2);
                ((BiConsumer) this.c).accept(obj, obj2);
                return;
        }
        do {
            Object apply = ((BiFunction) this.c).apply(obj, obj2);
            ConcurrentMap concurrentMap = (ConcurrentMap) this.b;
            if (concurrentMap.replace(obj, obj2, apply)) {
                return;
            } else {
                obj2 = concurrentMap.get(obj);
            }
        } while (obj2 != null);
    }

    @Override // j$.nio.file.A
    public String name() {
        return (String) this.b;
    }

    @Override // j$.nio.file.A
    public Class type() {
        return (Class) this.c;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return (String) this.b;
            default:
                return super.toString();
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new C3884m0((EnumC3908r0) this.b, (Predicate) this.c);
    }

    public w(W2 w2, EnumC3908r0 enumC3908r0, Supplier supplier) {
        this.a = 7;
        this.b = enumC3908r0;
        this.c = supplier;
    }

    @Override // j$.util.stream.B3
    public int d() {
        return V2.u | V2.r;
    }

    @Override // j$.util.stream.B3
    public Object b(AbstractC3823a abstractC3823a, Spliterator spliterator) {
        AbstractC3904q0 abstractC3904q0 = (AbstractC3904q0) ((Supplier) this.c).get();
        abstractC3823a.Q(spliterator, abstractC3904q0);
        return Boolean.valueOf(abstractC3904q0.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.B3
    public Object c(AbstractC3823a abstractC3823a, Spliterator spliterator) {
        return (Boolean) new C3913s0(this, abstractC3823a, spliterator).invoke();
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 4:
                ((Consumer) this.b).accept(obj);
                ((Consumer) this.c).accept(obj);
                break;
            case 5:
                if (obj == null) {
                    ((AtomicBoolean) this.b).set(true);
                    break;
                } else {
                    ((ConcurrentHashMap) this.c).putIfAbsent(obj, Boolean.TRUE);
                    break;
                }
            case 6:
            case 7:
            default:
                C3847e3 c3847e3 = (C3847e3) this.b;
                c3847e3.getClass();
                if (c3847e3.b.putIfAbsent(obj != null ? obj : C3847e3.d, Boolean.TRUE) == null) {
                    ((Consumer) this.c).accept(obj);
                    break;
                }
                break;
            case 8:
                ((BiConsumer) this.b).accept(this.c, obj);
                break;
        }
    }
}
