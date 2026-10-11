/*
 * Decompiled with CFR 0.152.
 */
package ax.kc;

import ax.cc.b;
import ax.gc.d;
import ax.jc.i;
import ax.kc.e;
import ax.kc.g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class h {
    private final i a;
    private final Map<Class, ArrayList<e>> b;
    private final Map<Class, e[]> c;
    private final ax.gc.e<Class> d = new ax.gc.e();
    private final g e;
    private final ReentrantReadWriteLock f = new ReentrantReadWriteLock();
    private final b g;

    public h(i i8, g g8, b b8) {
        this.a = i8;
        this.e = g8;
        this.g = b8;
        this.b = new HashMap<Class, ArrayList<e>>(256);
        this.c = new HashMap<Class, e[]>(256);
    }

    private e[] a(Object eArray) {
        ReentrantReadWriteLock.ReadLock readLock = this.f.readLock();
        try {
            readLock.lock();
            eArray = this.c.get(eArray.getClass());
            return eArray;
        }
        finally {
            readLock.unlock();
        }
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void d(Object object, e[] eArray) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f.writeLock();
        try {
            int n8;
            writeLock.lock();
            Object object2 = this.a(object);
            if (object2 != null) {
                int n9 = ((e[])object2).length;
                for (n8 = 0; n8 < n9; ++n8) {
                    object2[n8].f(object);
                }
            } else {
                int n10 = eArray.length;
                for (n8 = 0; n8 < n10; ++n8) {
                    e e8 = eArray[n8];
                    e8.f(object);
                    for (Class clazz : e8.b()) {
                        ArrayList<e> arrayList = this.b.get(clazz);
                        object2 = arrayList;
                        if (arrayList == null) {
                            object2 = new ArrayList(8);
                            this.b.put(clazz, (ArrayList<e>)object2);
                        }
                        object2.add(e8);
                    }
                }
                this.c.put(object.getClass(), eArray);
            }
            writeLock.unlock();
            return;
        }
        catch (Throwable throwable) {}
        writeLock.unlock();
        throw throwable;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Collection<e> b(Class clazz) {
        int n8;
        int n9;
        Class[] classArray;
        ReentrantReadWriteLock.ReadLock readLock;
        TreeSet<e> treeSet;
        block8: {
            treeSet = new TreeSet<e>(ax.kc.e.f);
            readLock = this.f.readLock();
            try {
                readLock.lock();
                classArray = this.b.get(clazz);
                if (classArray != null) {
                    treeSet.addAll((Collection<e>)classArray);
                }
                classArray = ax.gc.d.h(clazz);
                n9 = classArray.length;
                n8 = 0;
                break block8;
            }
            catch (Throwable throwable) {}
            readLock.unlock();
            throw throwable;
        }
        while (true) {
            if (n8 >= n9) {
                readLock.unlock();
                return treeSet;
            }
            Serializable serializable = classArray[n8];
            {
                if ((serializable = this.b.get(serializable)) != null) {
                    int n10 = ((ArrayList)serializable).size();
                    for (int i8 = 0; i8 < n10; ++i8) {
                        e e8 = (e)((ArrayList)serializable).get(i8);
                        if (!e8.d(clazz)) continue;
                        treeSet.add(e8);
                    }
                }
                ++n8;
                continue;
            }
            break;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c(Object object) {
        e[] eArray;
        int n8;
        int n9;
        Object[] objectArray;
        Object object2;
        block9: {
            try {
                object2 = object.getClass();
                if (this.d.contains(object2)) {
                    return;
                }
                objectArray = this.a(object);
                n9 = 0;
                int n10 = 0;
                if (objectArray == null) {
                    objectArray = this.a.b((Class)object2).b();
                    n8 = objectArray.length;
                    if (n8 == 0) {
                        this.d.add((Class)object2);
                        return;
                    }
                    eArray = new e[n8];
                    break block9;
                }
                n10 = objectArray.length;
                while (n9 < n10) {
                    ((e)objectArray[n9]).f(object);
                    ++n9;
                }
                return;
            }
            catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        }
        for (n9 = n10; n9 < n8; ++n9) {
            object2 = objectArray[n9];
            {
                eArray[n9] = this.e.d(this.g, (ax.jc.g)object2);
                continue;
            }
        }
        this.d(object, eArray);
    }
}

