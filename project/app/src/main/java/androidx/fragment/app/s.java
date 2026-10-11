/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o;
import androidx.fragment.app.p;
import androidx.fragment.app.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class s {
    private final ArrayList<Fragment> a = new ArrayList();
    private final HashMap<String, r> b = new HashMap();
    private final HashMap<String, p> c = new HashMap();
    private o d;

    s() {
    }

    void A(o o8) {
        this.d = o8;
    }

    p B(String string, p p8) {
        if (p8 != null) {
            return this.c.put(string, p8);
        }
        return this.c.remove(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void a(Fragment fragment) {
        if (!this.a.contains(fragment)) {
            ArrayList<Fragment> arrayList = this.a;
            synchronized (arrayList) {
                this.a.add(fragment);
            }
            fragment.l = true;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment already added: ");
        stringBuilder.append(fragment);
        throw new IllegalStateException(stringBuilder.toString());
    }

    void b() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    boolean c(String string) {
        return this.b.get(string) != null;
    }

    void d(int n8) {
        for (r r8 : this.b.values()) {
            if (r8 == null) continue;
            r8.t(n8);
        }
    }

    void e(String string, FileDescriptor object, PrintWriter printWriter, String[] stringArray) {
        int n8;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("    ");
        String string2 = stringBuilder.toString();
        if (!this.b.isEmpty()) {
            printWriter.print(string);
            printWriter.println("Active Fragments:");
            for (r r8 : this.b.values()) {
                printWriter.print(string);
                if (r8 != null) {
                    Fragment fragment = r8.k();
                    printWriter.println(fragment);
                    fragment.c0(string2, (FileDescriptor)object, printWriter, stringArray);
                    continue;
                }
                printWriter.println("null");
            }
        }
        if ((n8 = this.a.size()) > 0) {
            printWriter.print(string);
            printWriter.println("Added Fragments:");
            for (int i8 = 0; i8 < n8; ++i8) {
                object = this.a.get(i8);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println(((Fragment)object).toString());
            }
        }
    }

    Fragment f(String object) {
        if ((object = this.b.get(object)) != null) {
            return ((r)object).k();
        }
        return null;
    }

    Fragment g(int n8) {
        for (int i8 = this.a.size() - 1; i8 >= 0; --i8) {
            Fragment fragment = this.a.get(i8);
            if (fragment == null || fragment.x != n8) continue;
            return fragment;
        }
        for (r r8 : this.b.values()) {
            if (r8 == null) continue;
            Fragment fragment = r8.k();
            if (fragment.x != n8) continue;
            return fragment;
        }
        return null;
    }

    Fragment h(String string) {
        if (string != null) {
            for (int i8 = this.a.size() - 1; i8 >= 0; --i8) {
                Fragment fragment = this.a.get(i8);
                if (fragment == null || !string.equals(fragment.z)) continue;
                return fragment;
            }
        }
        if (string != null) {
            for (r r8 : this.b.values()) {
                if (r8 == null) continue;
                Fragment fragment = r8.k();
                if (!string.equals(fragment.z)) continue;
                return fragment;
            }
        }
        return null;
    }

    Fragment i(String string) {
        for (r r8 : this.b.values()) {
            Fragment fragment;
            if (r8 == null || (fragment = r8.k().e0(string)) == null) continue;
            return fragment;
        }
        return null;
    }

    int j(Fragment fragment) {
        int n8;
        ViewGroup viewGroup = fragment.H;
        if (viewGroup == null) {
            return -1;
        }
        int n9 = this.a.indexOf(fragment);
        int n10 = n9 - 1;
        while (true) {
            n8 = n9;
            if (n10 < 0) break;
            fragment = this.a.get(n10);
            if (fragment.H == viewGroup && (fragment = fragment.I) != null) {
                return viewGroup.indexOfChild((View)fragment) + 1;
            }
            --n10;
        }
        while (++n8 < this.a.size()) {
            fragment = this.a.get(n8);
            if (fragment.H != viewGroup || (fragment = fragment.I) == null) continue;
            return viewGroup.indexOfChild((View)fragment);
        }
        return -1;
    }

    List<r> k() {
        ArrayList<r> arrayList = new ArrayList<r>();
        for (r r8 : this.b.values()) {
            if (r8 == null) continue;
            arrayList.add(r8);
        }
        return arrayList;
    }

    List<Fragment> l() {
        ArrayList<Fragment> arrayList = new ArrayList<Fragment>();
        for (r r8 : this.b.values()) {
            if (r8 != null) {
                arrayList.add(r8.k());
                continue;
            }
            arrayList.add(null);
        }
        return arrayList;
    }

    ArrayList<p> m() {
        return new ArrayList<p>(this.c.values());
    }

    r n(String string) {
        return this.b.get(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    List<Fragment> o() {
        if (this.a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList<Fragment> arrayList = this.a;
        synchronized (arrayList) {
            return new ArrayList<Fragment>(this.a);
        }
    }

    o p() {
        return this.d;
    }

    p q(String string) {
        return this.c.get(string);
    }

    void r(r object) {
        Fragment fragment = ((r)object).k();
        if (!this.c(fragment.f)) {
            this.b.put(fragment.f, (r)object);
            if (fragment.D) {
                if (fragment.C) {
                    this.d.f(fragment);
                } else {
                    this.d.p(fragment);
                }
                fragment.D = false;
            }
            if (FragmentManager.J0(2)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Added fragment to active set ");
                ((StringBuilder)object).append(fragment);
                Log.v((String)"FragmentManager", (String)((StringBuilder)object).toString());
            }
        }
    }

    void s(r object) {
        Fragment fragment = ((r)object).k();
        if (fragment.C) {
            this.d.p(fragment);
        }
        if ((r)this.b.put(fragment.f, null) != null && FragmentManager.J0(2)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Removed fragment from active set ");
            ((StringBuilder)object).append(fragment);
            Log.v((String)"FragmentManager", (String)((StringBuilder)object).toString());
        }
    }

    void t() {
        Object object;
        ArrayList<Fragment> object22 = this.a;
        int n8 = object22.size();
        int n9 = 0;
        while (n9 < n8) {
            object = object22.get(n9);
            int n10 = n9 + 1;
            object = this.b.get(((Fragment)object).f);
            n9 = n10;
            if (object == null) continue;
            ((r)object).m();
            n9 = n10;
        }
        for (r r8 : this.b.values()) {
            if (r8 == null) continue;
            r8.m();
            object = r8.k();
            if (!((Fragment)object).m || ((Fragment)object).a1()) continue;
            if (((Fragment)object).n && !this.c.containsKey(((Fragment)object).f)) {
                r8.r();
            }
            this.s(r8);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void u(Fragment fragment) {
        ArrayList<Fragment> arrayList = this.a;
        synchronized (arrayList) {
            this.a.remove(fragment);
        }
        fragment.l = false;
    }

    void v() {
        this.b.clear();
    }

    void w(List<String> object) {
        this.a.clear();
        if (object != null) {
            Iterator<String> iterator = object.iterator();
            while (iterator.hasNext()) {
                object = iterator.next();
                Object object2 = this.f((String)object);
                if (object2 != null) {
                    if (FragmentManager.J0(2)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("restoreSaveState: added (");
                        stringBuilder.append((String)object);
                        stringBuilder.append("): ");
                        stringBuilder.append(object2);
                        Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                    }
                    this.a((Fragment)object2);
                    continue;
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("No instantiated fragment for (");
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append(")");
                throw new IllegalStateException(((StringBuilder)object2).toString());
            }
        }
    }

    void x(ArrayList<p> arrayList) {
        this.c.clear();
        int n8 = arrayList.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            p p8 = arrayList.get(i8);
            this.c.put(p8.c0, p8);
        }
    }

    ArrayList<String> y() {
        ArrayList<String> arrayList = new ArrayList<String>(this.b.size());
        for (r r8 : this.b.values()) {
            if (r8 == null) continue;
            Fragment fragment = r8.k();
            r8.r();
            arrayList.add(fragment.f);
            if (!FragmentManager.J0(2)) continue;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Saved state of ");
            stringBuilder.append(fragment);
            stringBuilder.append(": ");
            stringBuilder.append(fragment.b);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    ArrayList<String> z() {
        ArrayList<Fragment> arrayList = this.a;
        synchronized (arrayList) {
            Throwable throwable2;
            block6: {
                try {
                    if (this.a.isEmpty()) {
                        return null;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                ArrayList<String> arrayList2 = new ArrayList<String>(this.a.size());
                ArrayList<Fragment> arrayList3 = this.a;
                int n8 = arrayList3.size();
                int n9 = 0;
                while (true) {
                    if (n9 >= n8) {
                        return arrayList2;
                    }
                    Fragment fragment = arrayList3.get(n9);
                    int n10 = n9 + 1;
                    arrayList2.add(fragment.f);
                    n9 = n10;
                    if (!FragmentManager.J0(2)) continue;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("saveAllState: adding fragment (");
                    stringBuilder.append(fragment.f);
                    stringBuilder.append("): ");
                    stringBuilder.append(fragment);
                    Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                    n9 = n10;
                }
            }
            throw throwable2;
        }
    }
}

