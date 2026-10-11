package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
class s {
    private final ArrayList<Fragment> a = new ArrayList<>();
    private final HashMap<String, r> b = new HashMap<>();
    private final HashMap<String, p> c = new HashMap<>();
    private o d;

    s() {
    }

    void A(o oVar) {
        this.d = oVar;
    }

    p B(String str, p pVar) {
        return pVar != null ? this.c.put(str, pVar) : this.c.remove(str);
    }

    void a(Fragment fragment) {
        if (this.a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.a) {
            this.a.add(fragment);
        }
        fragment.l = true;
    }

    void b() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    boolean c(String str) {
        return this.b.get(str) != null;
    }

    void d(int i) {
        for (r rVar : this.b.values()) {
            if (rVar != null) {
                rVar.t(i);
            }
        }
    }

    void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (r rVar : this.b.values()) {
                printWriter.print(str);
                if (rVar != null) {
                    Fragment k = rVar.k();
                    printWriter.println(k);
                    k.c0(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                Fragment fragment = this.a.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    Fragment f(String str) {
        r rVar = this.b.get(str);
        if (rVar != null) {
            return rVar.k();
        }
        return null;
    }

    Fragment g(int i) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.a.get(size);
            if (fragment != null && fragment.x == i) {
                return fragment;
            }
        }
        for (r rVar : this.b.values()) {
            if (rVar != null) {
                Fragment k = rVar.k();
                if (k.x == i) {
                    return k;
                }
            }
        }
        return null;
    }

    Fragment h(String str) {
        if (str != null) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.a.get(size);
                if (fragment != null && str.equals(fragment.z)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (r rVar : this.b.values()) {
            if (rVar != null) {
                Fragment k = rVar.k();
                if (str.equals(k.z)) {
                    return k;
                }
            }
        }
        return null;
    }

    Fragment i(String str) {
        Fragment e0;
        for (r rVar : this.b.values()) {
            if (rVar != null && (e0 = rVar.k().e0(str)) != null) {
                return e0;
            }
        }
        return null;
    }

    int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.H;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.a.indexOf(fragment);
        for (int i = indexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.a.get(i);
            if (fragment2.H == viewGroup && (view2 = fragment2.I) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.a.size()) {
                return -1;
            }
            Fragment fragment3 = this.a.get(indexOf);
            if (fragment3.H == viewGroup && (view = fragment3.I) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    List<r> k() {
        ArrayList arrayList = new ArrayList();
        for (r rVar : this.b.values()) {
            if (rVar != null) {
                arrayList.add(rVar);
            }
        }
        return arrayList;
    }

    List<Fragment> l() {
        ArrayList arrayList = new ArrayList();
        for (r rVar : this.b.values()) {
            if (rVar != null) {
                arrayList.add(rVar.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    ArrayList<p> m() {
        return new ArrayList<>(this.c.values());
    }

    r n(String str) {
        return this.b.get(str);
    }

    List<Fragment> o() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    o p() {
        return this.d;
    }

    p q(String str) {
        return this.c.get(str);
    }

    void r(r rVar) {
        Fragment k = rVar.k();
        if (c(k.f)) {
            return;
        }
        this.b.put(k.f, rVar);
        if (k.D) {
            if (k.C) {
                this.d.f(k);
            } else {
                this.d.p(k);
            }
            k.D = false;
        }
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + k);
        }
    }

    void s(r rVar) {
        Fragment k = rVar.k();
        if (k.C) {
            this.d.p(k);
        }
        if (this.b.put(k.f, null) != null && FragmentManager.J0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k);
        }
    }

    void t() {
        ArrayList<Fragment> arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Fragment fragment = arrayList.get(i);
            i++;
            r rVar = this.b.get(fragment.f);
            if (rVar != null) {
                rVar.m();
            }
        }
        for (r rVar2 : this.b.values()) {
            if (rVar2 != null) {
                rVar2.m();
                Fragment k = rVar2.k();
                if (k.m && !k.a1()) {
                    if (k.n && !this.c.containsKey(k.f)) {
                        rVar2.r();
                    }
                    s(rVar2);
                }
            }
        }
    }

    void u(Fragment fragment) {
        synchronized (this.a) {
            this.a.remove(fragment);
        }
        fragment.l = false;
    }

    void v() {
        this.b.clear();
    }

    void w(List<String> list) {
        this.a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment f = f(str);
                if (f == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.J0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f);
                }
                a(f);
            }
        }
    }

    void x(ArrayList<p> arrayList) {
        this.c.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            p pVar = arrayList.get(i);
            i++;
            p pVar2 = pVar;
            this.c.put(pVar2.c0, pVar2);
        }
    }

    ArrayList<String> y() {
        ArrayList<String> arrayList = new ArrayList<>(this.b.size());
        for (r rVar : this.b.values()) {
            if (rVar != null) {
                Fragment k = rVar.k();
                rVar.r();
                arrayList.add(k.f);
                if (FragmentManager.J0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k + ": " + k.b);
                }
            }
        }
        return arrayList;
    }

    ArrayList<String> z() {
        synchronized (this.a) {
            try {
                if (this.a.isEmpty()) {
                    return null;
                }
                ArrayList<String> arrayList = new ArrayList<>(this.a.size());
                ArrayList<Fragment> arrayList2 = this.a;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Fragment fragment = arrayList2.get(i);
                    i++;
                    Fragment fragment2 = fragment;
                    arrayList.add(fragment2.f);
                    if (FragmentManager.J0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment2.f + "): " + fragment2);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
