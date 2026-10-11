package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.t;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0585a extends t implements FragmentManager.n {
    final FragmentManager t;
    boolean u;
    int v;
    boolean w;

    C0585a(FragmentManager fragmentManager) {
        super(fragmentManager.u0(), fragmentManager.w0() != null ? fragmentManager.w0().f().getClassLoader() : null);
        this.v = -1;
        this.w = false;
        this.t = fragmentManager;
    }

    void A() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            t.a aVar = this.c.get(i);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.n = this.w;
                fragment.A2(false);
                fragment.z2(this.h);
                fragment.C2(this.p, this.q);
            }
            switch (aVar.a) {
                case 1:
                    fragment.u2(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.k1(fragment, false);
                    this.t.j(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
                case 3:
                    fragment.u2(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.d1(fragment);
                    break;
                case 4:
                    fragment.u2(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.G0(fragment);
                    break;
                case 5:
                    fragment.u2(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.k1(fragment, false);
                    this.t.q1(fragment);
                    break;
                case 6:
                    fragment.u2(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.y(fragment);
                    break;
                case 7:
                    fragment.u2(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.k1(fragment, false);
                    this.t.n(fragment);
                    break;
                case 8:
                    this.t.o1(fragment);
                    break;
                case 9:
                    this.t.o1(null);
                    break;
                case 10:
                    this.t.n1(fragment, aVar.i);
                    break;
            }
        }
    }

    void B() {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            t.a aVar = this.c.get(size);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.n = this.w;
                fragment.A2(true);
                fragment.z2(FragmentManager.h1(this.h));
                fragment.C2(this.q, this.p);
            }
            switch (aVar.a) {
                case 1:
                    fragment.u2(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.k1(fragment, true);
                    this.t.d1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
                case 3:
                    fragment.u2(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.j(fragment);
                    break;
                case 4:
                    fragment.u2(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.q1(fragment);
                    break;
                case 5:
                    fragment.u2(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.k1(fragment, true);
                    this.t.G0(fragment);
                    break;
                case 6:
                    fragment.u2(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.n(fragment);
                    break;
                case 7:
                    fragment.u2(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.k1(fragment, true);
                    this.t.y(fragment);
                    break;
                case 8:
                    this.t.o1(null);
                    break;
                case 9:
                    this.t.o1(fragment);
                    break;
                case 10:
                    this.t.n1(fragment, aVar.h);
                    break;
            }
        }
    }

    Fragment C(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.c.size()) {
            t.a aVar = this.c.get(i);
            int i2 = aVar.a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.b;
                    int i3 = fragment3.y;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.y == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.c.add(i, new t.a(9, fragment4, true));
                                    i++;
                                    fragment2 = null;
                                }
                                t.a aVar2 = new t.a(3, fragment4, true);
                                aVar2.d = aVar.d;
                                aVar2.f = aVar.f;
                                aVar2.e = aVar.e;
                                aVar2.g = aVar.g;
                                this.c.add(i, aVar2);
                                arrayList.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.c.remove(i);
                        i--;
                    } else {
                        aVar.a = 1;
                        aVar.c = true;
                        arrayList.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(aVar.b);
                    Fragment fragment5 = aVar.b;
                    if (fragment5 == fragment2) {
                        this.c.add(i, new t.a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.c.add(i, new t.a(9, fragment2, true));
                        aVar.c = true;
                        i++;
                        fragment2 = aVar.b;
                    }
                }
                i++;
            }
            arrayList.add(aVar.b);
            i++;
        }
        return fragment2;
    }

    public String D() {
        return this.k;
    }

    public void E() {
        if (this.s != null) {
            for (int i = 0; i < this.s.size(); i++) {
                this.s.get(i).run();
            }
            this.s = null;
        }
    }

    Fragment F(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            t.a aVar = this.c.get(size);
            int i = aVar.a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.b;
                            break;
                        case 10:
                            aVar.i = aVar.h;
                            break;
                    }
                }
                arrayList.add(aVar.b);
            }
            arrayList.remove(aVar.b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.n
    public boolean a(ArrayList<C0585a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.i) {
            return true;
        }
        this.t.i(this);
        return true;
    }

    @Override // androidx.fragment.app.t
    public int i() {
        return x(false);
    }

    @Override // androidx.fragment.app.t
    public int j() {
        return x(true);
    }

    @Override // androidx.fragment.app.t
    public void k() {
        n();
        this.t.d0(this, false);
    }

    @Override // androidx.fragment.app.t
    public void l() {
        n();
        this.t.d0(this, true);
    }

    @Override // androidx.fragment.app.t
    public t m(Fragment fragment) {
        FragmentManager fragmentManager = fragment.t;
        if (fragmentManager == null || fragmentManager == this.t) {
            return super.m(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.t
    void o(int i, Fragment fragment, String str, int i2) {
        super.o(i, fragment, str, i2);
        fragment.t = this.t;
    }

    @Override // androidx.fragment.app.t
    public t p(Fragment fragment) {
        FragmentManager fragmentManager = fragment.t;
        if (fragmentManager == null || fragmentManager == this.t) {
            return super.p(fragment);
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.t
    public t q(Fragment fragment) {
        FragmentManager fragmentManager = fragment.t;
        if (fragmentManager == null || fragmentManager == this.t) {
            return super.q(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.v >= 0) {
            sb.append(" #");
            sb.append(this.v);
        }
        if (this.k != null) {
            sb.append(" ");
            sb.append(this.k);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // androidx.fragment.app.t
    public t v(Fragment fragment) {
        FragmentManager fragmentManager = fragment.t;
        if (fragmentManager == null || fragmentManager == this.t) {
            return super.v(fragment);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    void w(int i) {
        if (this.i) {
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                t.a aVar = this.c.get(i2);
                Fragment fragment = aVar.b;
                if (fragment != null) {
                    fragment.s += i;
                    if (FragmentManager.J0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.b + " to " + aVar.b.s);
                    }
                }
            }
        }
    }

    int x(boolean z) {
        if (this.u) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new y("FragmentManager"));
            y("  ", printWriter);
            printWriter.close();
        }
        this.u = true;
        if (this.i) {
            this.v = this.t.l();
        } else {
            this.v = -1;
        }
        this.t.a0(this, z);
        return this.v;
    }

    public void y(String str, PrintWriter printWriter) {
        z(str, printWriter, true);
    }

    public void z(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.u);
            if (this.h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.h));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.f != 0 || this.g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.m);
            }
            if (this.n != 0 || this.o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.o);
            }
        }
        if (this.c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            t.a aVar = this.c.get(i);
            switch (aVar.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.b);
            if (z) {
                if (aVar.d != 0 || aVar.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.e));
                }
                if (aVar.f != 0 || aVar.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.g));
                }
            }
        }
    }
}
