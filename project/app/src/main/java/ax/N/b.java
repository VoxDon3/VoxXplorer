/*
 * Decompiled with CFR 0.152.
 */
package ax.N;

import ax.B.k;
import ax.b0.d;
import ax.b0.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class b<T> {
    private final d<ArrayList<T>> a = new e<ArrayList<T>>(10);
    private final k<T, ArrayList<T>> b = new k();
    private final ArrayList<T> c = new ArrayList();
    private final HashSet<T> d = new HashSet();

    private void e(T t8, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t8)) {
            return;
        }
        if (!hashSet.contains(t8)) {
            hashSet.add(t8);
            ArrayList<T> arrayList2 = this.b.get(t8);
            if (arrayList2 != null) {
                int n8 = arrayList2.size();
                for (int i8 = 0; i8 < n8; ++i8) {
                    this.e(arrayList2.get(i8), arrayList, hashSet);
                }
            }
            hashSet.remove(t8);
            arrayList.add(t8);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    private ArrayList<T> f() {
        ArrayList<T> arrayList;
        ArrayList<Object> arrayList2 = arrayList = this.a.b();
        if (arrayList == null) {
            arrayList2 = new ArrayList();
        }
        return arrayList2;
    }

    private void k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.a.a(arrayList);
    }

    public void a(T t8, T t9) {
        if (this.b.containsKey(t8) && this.b.containsKey(t9)) {
            ArrayList<T> arrayList;
            ArrayList<T> arrayList2 = arrayList = this.b.get(t8);
            if (arrayList == null) {
                arrayList2 = this.f();
                this.b.put(t8, arrayList2);
            }
            arrayList2.add(t9);
            return;
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    public void b(T t8) {
        if (!this.b.containsKey(t8)) {
            this.b.put(t8, null);
        }
    }

    public void c() {
        int n8 = this.b.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            ArrayList<T> arrayList = this.b.k(i8);
            if (arrayList == null) continue;
            this.k(arrayList);
        }
        this.b.clear();
    }

    public boolean d(T t8) {
        return this.b.containsKey(t8);
    }

    public List g(T t8) {
        return this.b.get(t8);
    }

    public List<T> h(T t8) {
        int n8 = this.b.size();
        ArrayList<T> arrayList = null;
        for (int i8 = 0; i8 < n8; ++i8) {
            ArrayList<T> arrayList2 = this.b.k(i8);
            ArrayList<T> arrayList3 = arrayList;
            if (arrayList2 != null) {
                arrayList3 = arrayList;
                if (arrayList2.contains(t8)) {
                    arrayList3 = arrayList;
                    if (arrayList == null) {
                        arrayList3 = new ArrayList<T>();
                    }
                    arrayList3.add(this.b.f(i8));
                }
            }
            arrayList = arrayList3;
        }
        return arrayList;
    }

    public ArrayList<T> i() {
        this.c.clear();
        this.d.clear();
        int n8 = this.b.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            this.e(this.b.f(i8), this.c, this.d);
        }
        return this.c;
    }

    public boolean j(T t8) {
        int n8 = this.b.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            ArrayList<T> arrayList = this.b.k(i8);
            if (arrayList == null || !arrayList.contains(t8)) continue;
            return true;
        }
        return false;
    }
}

