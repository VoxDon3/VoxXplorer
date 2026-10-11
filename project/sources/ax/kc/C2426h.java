package ax.kc;

import ax.cc.C1855b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: ax.kc.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2426h {
    private final ax.jc.i a;
    private final C2425g e;
    private final C1855b g;
    private final ax.gc.e<Class> d = new ax.gc.e<>();
    private final ReentrantReadWriteLock f = new ReentrantReadWriteLock();
    private final Map<Class, ArrayList<C2423e>> b = new HashMap(256);
    private final Map<Class, C2423e[]> c = new HashMap(256);

    public C2426h(ax.jc.i iVar, C2425g c2425g, C1855b c1855b) {
        this.a = iVar;
        this.e = c2425g;
        this.g = c1855b;
    }

    private C2423e[] a(Object obj) {
        ReentrantReadWriteLock.ReadLock readLock = this.f.readLock();
        try {
            readLock.lock();
            return this.c.get(obj.getClass());
        } finally {
            readLock.unlock();
        }
    }

    private void d(Object obj, C2423e[] c2423eArr) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f.writeLock();
        try {
            writeLock.lock();
            C2423e[] a = a(obj);
            if (a == null) {
                for (C2423e c2423e : c2423eArr) {
                    c2423e.f(obj);
                    for (Class cls : c2423e.b()) {
                        ArrayList<C2423e> arrayList = this.b.get(cls);
                        if (arrayList == null) {
                            arrayList = new ArrayList<>(8);
                            this.b.put(cls, arrayList);
                        }
                        arrayList.add(c2423e);
                    }
                }
                this.c.put(obj.getClass(), c2423eArr);
            } else {
                for (C2423e c2423e2 : a) {
                    c2423e2.f(obj);
                }
            }
            writeLock.unlock();
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }

    public Collection<C2423e> b(Class cls) {
        TreeSet treeSet = new TreeSet(C2423e.f);
        ReentrantReadWriteLock.ReadLock readLock = this.f.readLock();
        try {
            readLock.lock();
            ArrayList<C2423e> arrayList = this.b.get(cls);
            if (arrayList != null) {
                treeSet.addAll(arrayList);
            }
            for (Class cls2 : ax.gc.d.h(cls)) {
                ArrayList<C2423e> arrayList2 = this.b.get(cls2);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        C2423e c2423e = arrayList2.get(i);
                        if (c2423e.d(cls)) {
                            treeSet.add(c2423e);
                        }
                    }
                }
            }
            readLock.unlock();
            return treeSet;
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    public void c(Object obj) {
        try {
            Class<?> cls = obj.getClass();
            if (this.d.contains(cls)) {
                return;
            }
            C2423e[] a = a(obj);
            int i = 0;
            if (a != null) {
                int length = a.length;
                while (i < length) {
                    a[i].f(obj);
                    i++;
                }
                return;
            }
            ax.jc.g[] b = this.a.b(cls).b();
            int length2 = b.length;
            if (length2 == 0) {
                this.d.add(cls);
                return;
            }
            C2423e[] c2423eArr = new C2423e[length2];
            while (i < length2) {
                c2423eArr[i] = this.e.d(this.g, b[i]);
                i++;
            }
            d(obj, c2423eArr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
