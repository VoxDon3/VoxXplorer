/*
 * Decompiled with CFR 0.152.
 */
package ax.l7;

import ax.l7.b;
import ax.l7.c;
import ax.l7.g;
import ax.l7.i;
import ax.m7.C;
import ax.m7.j;
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

public abstract class f
implements Closeable,
AutoCloseable {
    private static final Lock c0;
    private static WeakHashMap<Class<?>, Field> q;

    static {
        q = new WeakHashMap();
        c0 = new ReentrantLock();
    }

    private i F0() throws IOException {
        i i8;
        i i9 = i8 = this.e();
        if (i8 == null) {
            i9 = this.v();
        }
        boolean bl = i9 != null;
        v.b(bl, "no JSON input found");
        return i9;
    }

    private i G0() throws IOException {
        i i8 = this.F0();
        int n8 = a.a[i8.ordinal()];
        boolean bl = true;
        if (n8 != 1) {
            if (n8 != 2) {
                return i8;
            }
            return this.v();
        }
        i8 = this.v();
        boolean bl2 = bl;
        if (i8 != i.f0) {
            bl2 = i8 == i.e0 ? bl : false;
        }
        v.b(bl2, (Object)i8);
        return i8;
    }

    private void L(ArrayList<Type> arrayList, Object object, ax.l7.a a8) throws IOException {
        if (object instanceof b) {
            ((b)object).k(this.j());
        }
        Object object2 = this.G0();
        Class<?> clazz = object.getClass();
        ax.m7.f f8 = ax.m7.f.e(clazz);
        boolean bl = k.class.isAssignableFrom(clazz);
        Object object3 = object2;
        if (!bl) {
            object3 = object2;
            if (Map.class.isAssignableFrom(clazz)) {
                this.s0(null, (Map)object, C.e(clazz), arrayList, a8);
                return;
            }
        }
        while (object3 == i.f0) {
            object2 = this.u();
            this.v();
            object3 = f8.b((String)object2);
            if (object3 != null) {
                if (((j)object3).h() && !((j)object3).i()) {
                    throw new IllegalArgumentException("final array/object fields are not supported");
                }
                object2 = ((j)object3).b();
                int n8 = arrayList.size();
                arrayList.add(((Field)object2).getGenericType());
                object2 = this.u0((Field)object2, ((j)object3).d(), arrayList, object, a8, true);
                arrayList.remove(n8);
                ((j)object3).m(object, object2);
            } else if (bl) {
                ((k)object).f((String)object2, this.u0(null, null, arrayList, object, a8, true));
            } else {
                this.A0();
            }
            object3 = this.v();
        }
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Field c(Class<?> annotatedElement) {
        Field var4_3;
        Object var4_2 = null;
        if (annotatedElement == null) {
            return null;
        }
        Object object = c0;
        object.lock();
        if (q.containsKey(annotatedElement)) {
            annotatedElement = q.get(annotatedElement);
            object.unlock();
            return annotatedElement;
        }
        Iterator<j> iterator = ax.m7.f.e(annotatedElement).c().iterator();
        while (iterator.hasNext()) {
            object = iterator.next().b();
            g.a[] aArray = ((Field)object).getAnnotation(g.class);
            if (aArray == null) continue;
            boolean bl = var4_3 == null;
            v.c(bl, "Class contains more than one field with @JsonPolymorphicTypeMap annotation: %s", annotatedElement);
            v.c(ax.m7.g.e(((Field)object).getType()), "Field which has the @JsonPolymorphicTypeMap, %s, is not a supported type: %s", annotatedElement, ((Field)object).getType());
            aArray = aArray.typeDefinitions();
            HashSet<String> hashSet = w.a();
            bl = aArray.length > 0;
            v.b(bl, "@JsonPolymorphicTypeMap must have at least one @TypeDef");
            for (g.a a8 : aArray) {
                v.c(hashSet.add(a8.key()), "Class contains two @TypeDef annotations with identical key: %s", a8.key());
            }
            Object object2 = object;
        }
        q.put((Class<?>)annotatedElement, (Field)var4_3);
        return var4_3;
    }

    private <T> void o0(Field field, Collection<T> collection, Type type, ArrayList<Type> arrayList, ax.l7.a a8) throws IOException {
        i i8 = this.G0();
        while (i8 != i.c0) {
            collection.add(this.u0(field, type, arrayList, collection, a8, true));
            i8 = this.v();
        }
    }

    private void s0(Field field, Map<String, Object> map, Type type, ArrayList<Type> arrayList, ax.l7.a a8) throws IOException {
        Object object = this.G0();
        while (object == i.f0) {
            object = this.u();
            this.v();
            map.put((String)object, this.u0(field, type, arrayList, map, a8, true));
            object = this.v();
        }
    }

    /*
     * Exception decompiling
     */
    private final Object u0(Field var1_1, Type var2_2, ArrayList<Type> var3_8, Object var4_9, ax.l7.a var5_10, boolean var6_11) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [2 : 220->228)] java.lang.IllegalArgumentException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final <T> T A(Class<T> clazz, ax.l7.a a8) throws IOException {
        return (T)this.H(clazz, false, a8);
    }

    public abstract f A0() throws IOException;

    public final String C0(Set<String> set) throws IOException {
        Object object = this.G0();
        while (object == i.f0) {
            object = this.u();
            this.v();
            if (set.contains(object)) {
                return object;
            }
            this.A0();
            object = this.v();
        }
        return null;
    }

    public final void D0(String string) throws IOException {
        this.C0(Collections.singleton(string));
    }

    public Object F(Type type, boolean bl) throws IOException {
        return this.H(type, bl, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object H(Type object, boolean bl, ax.l7.a a8) throws IOException {
        Throwable throwable2;
        block5: {
            block4: {
                try {
                    if (Void.class.equals(object)) break block4;
                    this.F0();
                }
                catch (Throwable throwable2) {
                    break block5;
                }
            }
            ArrayList<Type> arrayList = new ArrayList<Type>();
            object = this.u0(null, (Type)object, arrayList, null, a8, true);
            if (bl) {
                this.close();
            }
            return object;
        }
        if (bl) {
            this.close();
        }
        throw throwable2;
    }

    public final <T> T W(Class<T> clazz) throws IOException {
        return this.d0(clazz, null);
    }

    public abstract BigInteger a() throws IOException;

    public abstract byte b() throws IOException;

    @Override
    public abstract void close() throws IOException;

    public abstract String d() throws IOException;

    public final <T> T d0(Class<T> clazz, ax.l7.a a8) throws IOException {
        try {
            clazz = this.A(clazz, a8);
            return (T)clazz;
        }
        finally {
            this.close();
        }
    }

    public abstract i e();

    public abstract BigDecimal f() throws IOException;

    public abstract double g() throws IOException;

    public abstract c j();

    public abstract float m() throws IOException;

    public abstract int o() throws IOException;

    public abstract long p() throws IOException;

    public abstract short q() throws IOException;

    public abstract String u() throws IOException;

    public abstract i v() throws IOException;
}

