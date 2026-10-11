/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.i;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import java.io.PrintWriter;
import java.util.ArrayList;

final class a
extends t
implements FragmentManager.n {
    final FragmentManager t;
    boolean u;
    int v;
    boolean w;

    a(FragmentManager fragmentManager) {
        i i8 = fragmentManager.u0();
        ClassLoader classLoader = fragmentManager.w0() != null ? fragmentManager.w0().f().getClassLoader() : null;
        super(i8, classLoader);
        this.v = -1;
        this.w = false;
        this.t = fragmentManager;
    }

    void A() {
        int n8 = this.c.size();
        block11: for (int i8 = 0; i8 < n8; ++i8) {
            t.a a8 = this.c.get(i8);
            Object object = a8.b;
            if (object != null) {
                ((Fragment)object).n = this.w;
                ((Fragment)object).A2(false);
                ((Fragment)object).z2(this.h);
                ((Fragment)object).C2(this.p, this.q);
            }
            switch (a8.a) {
                default: {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Unknown cmd: ");
                    ((StringBuilder)object).append(a8.a);
                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                }
                case 10: {
                    this.t.n1((Fragment)object, a8.i);
                    continue block11;
                }
                case 9: {
                    this.t.o1(null);
                    continue block11;
                }
                case 8: {
                    this.t.o1((Fragment)object);
                    continue block11;
                }
                case 7: {
                    ((Fragment)object).u2(a8.d, a8.e, a8.f, a8.g);
                    this.t.k1((Fragment)object, false);
                    this.t.n((Fragment)object);
                    continue block11;
                }
                case 6: {
                    ((Fragment)object).u2(a8.d, a8.e, a8.f, a8.g);
                    this.t.y((Fragment)object);
                    continue block11;
                }
                case 5: {
                    ((Fragment)object).u2(a8.d, a8.e, a8.f, a8.g);
                    this.t.k1((Fragment)object, false);
                    this.t.q1((Fragment)object);
                    continue block11;
                }
                case 4: {
                    ((Fragment)object).u2(a8.d, a8.e, a8.f, a8.g);
                    this.t.G0((Fragment)object);
                    continue block11;
                }
                case 3: {
                    ((Fragment)object).u2(a8.d, a8.e, a8.f, a8.g);
                    this.t.d1((Fragment)object);
                    continue block11;
                }
                case 1: {
                    ((Fragment)object).u2(a8.d, a8.e, a8.f, a8.g);
                    this.t.k1((Fragment)object, false);
                    this.t.j((Fragment)object);
                }
            }
        }
    }

    void B() {
        block11: for (int i8 = this.c.size() - 1; i8 >= 0; --i8) {
            t.a a8 = this.c.get(i8);
            Object object = a8.b;
            if (object != null) {
                ((Fragment)object).n = this.w;
                ((Fragment)object).A2(true);
                ((Fragment)object).z2(FragmentManager.h1(this.h));
                ((Fragment)object).C2(this.q, this.p);
            }
            switch (a8.a) {
                default: {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Unknown cmd: ");
                    ((StringBuilder)object).append(a8.a);
                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                }
                case 10: {
                    this.t.n1((Fragment)object, a8.h);
                    continue block11;
                }
                case 9: {
                    this.t.o1((Fragment)object);
                    continue block11;
                }
                case 8: {
                    this.t.o1(null);
                    continue block11;
                }
                case 7: {
                    ((Fragment)object).u2(a8.d, a8.e, a8.f, a8.g);
                    this.t.k1((Fragment)object, true);
                    this.t.y((Fragment)object);
                    continue block11;
                }
                case 6: {
                    ((Fragment)object).u2(a8.d, a8.e, a8.f, a8.g);
                    this.t.n((Fragment)object);
                    continue block11;
                }
                case 5: {
                    ((Fragment)object).u2(a8.d, a8.e, a8.f, a8.g);
                    this.t.k1((Fragment)object, true);
                    this.t.G0((Fragment)object);
                    continue block11;
                }
                case 4: {
                    ((Fragment)object).u2(a8.d, a8.e, a8.f, a8.g);
                    this.t.q1((Fragment)object);
                    continue block11;
                }
                case 3: {
                    ((Fragment)object).u2(a8.d, a8.e, a8.f, a8.g);
                    this.t.j((Fragment)object);
                    continue block11;
                }
                case 1: {
                    ((Fragment)object).u2(a8.d, a8.e, a8.f, a8.g);
                    this.t.k1((Fragment)object, true);
                    this.t.d1((Fragment)object);
                }
            }
        }
    }

    Fragment C(ArrayList<Fragment> arrayList, Fragment object) {
        int n8 = 0;
        Fragment fragment = object;
        while (n8 < this.c.size()) {
            int n9;
            block14: {
                t.a a8;
                block11: {
                    Fragment fragment2;
                    block12: {
                        block13: {
                            a8 = this.c.get(n8);
                            n9 = a8.a;
                            if (n9 == 1) break block11;
                            if (n9 == 2) break block12;
                            if (n9 == 3 || n9 == 6) break block13;
                            if (n9 == 7) break block11;
                            if (n9 != 8) {
                                object = fragment;
                                n9 = n8;
                            } else {
                                this.c.add(n8, new t.a(9, fragment, true));
                                a8.c = true;
                                n9 = n8 + 1;
                                object = a8.b;
                            }
                            break block14;
                        }
                        arrayList.remove(a8.b);
                        fragment2 = a8.b;
                        object = fragment;
                        n9 = n8;
                        if (fragment2 == fragment) {
                            this.c.add(n8, new t.a(9, fragment2));
                            n9 = n8 + 1;
                            object = null;
                        }
                        break block14;
                    }
                    fragment2 = a8.b;
                    int n10 = fragment2.y;
                    int n11 = 0;
                    n9 = n8;
                    object = fragment;
                    for (int i8 = arrayList.size() - 1; i8 >= 0; --i8) {
                        Fragment fragment3 = arrayList.get(i8);
                        fragment = object;
                        int n12 = n9;
                        n8 = n11;
                        if (fragment3.y == n10) {
                            if (fragment3 == fragment2) {
                                n8 = 1;
                                fragment = object;
                                n12 = n9;
                            } else {
                                fragment = object;
                                n8 = n9;
                                if (fragment3 == object) {
                                    this.c.add(n9, new t.a(9, fragment3, true));
                                    n8 = n9 + 1;
                                    fragment = null;
                                }
                                object = new t.a(3, fragment3, true);
                                ((t.a)object).d = a8.d;
                                ((t.a)object).f = a8.f;
                                ((t.a)object).e = a8.e;
                                ((t.a)object).g = a8.g;
                                this.c.add(n8, (t.a)object);
                                arrayList.remove(fragment3);
                                n12 = n8 + 1;
                                n8 = n11;
                            }
                        }
                        object = fragment;
                        n9 = n12;
                        n11 = n8;
                    }
                    if (n11 != 0) {
                        this.c.remove(n9);
                        --n9;
                    } else {
                        a8.a = 1;
                        a8.c = true;
                        arrayList.add(fragment2);
                    }
                    break block14;
                }
                arrayList.add(a8.b);
                n9 = n8;
                object = fragment;
            }
            n8 = n9 + 1;
            fragment = object;
        }
        return fragment;
    }

    public String D() {
        return this.k;
    }

    public void E() {
        if (this.s != null) {
            for (int i8 = 0; i8 < this.s.size(); ++i8) {
                this.s.get(i8).run();
            }
            this.s = null;
        }
    }

    /*
     * Unable to fully structure code
     */
    Fragment F(ArrayList<Fragment> var1_1, Fragment var2_2) {
        block7: for (var3_3 = this.c.size() - 1; var3_3 >= 0; --var3_3) {
            var5_5 = this.c.get(var3_3);
            var4_4 = var5_5.a;
            if (var4_4 == 1) ** GOTO lbl-1000
            if (var4_4 == 3) ** GOTO lbl-1000
            switch (var4_4) {
                default: {
                    continue block7;
                }
                case 10: {
                    var5_5.i = var5_5.h;
                    continue block7;
                }
                case 9: {
                    var2_2 = var5_5.b;
                    continue block7;
                }
                case 8: {
                    var2_2 = null;
                    continue block7;
                }
                case 6: lbl-1000:
                // 2 sources

                {
                    var1_1.add(var5_5.b);
                    continue block7;
                }
                case 7: lbl-1000:
                // 2 sources

                {
                    var1_1.remove(var5_5.b);
                }
            }
        }
        return var2_2;
    }

    @Override
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.J0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Run: ");
            stringBuilder.append(this);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.i) {
            this.t.i(this);
        }
        return true;
    }

    @Override
    public int i() {
        return this.x(false);
    }

    @Override
    public int j() {
        return this.x(true);
    }

    @Override
    public void k() {
        this.n();
        this.t.d0(this, false);
    }

    @Override
    public void l() {
        this.n();
        this.t.d0(this, true);
    }

    @Override
    public t m(Fragment fragment) {
        Object object = fragment.t;
        if (object != null && object != this.t) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
            ((StringBuilder)object).append(fragment.toString());
            ((StringBuilder)object).append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(((StringBuilder)object).toString());
        }
        return super.m(fragment);
    }

    @Override
    void o(int n8, Fragment fragment, String string, int n9) {
        super.o(n8, fragment, string, n9);
        fragment.t = this.t;
    }

    @Override
    public t p(Fragment fragment) {
        Object object = fragment.t;
        if (object != null && object != this.t) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
            ((StringBuilder)object).append(fragment.toString());
            ((StringBuilder)object).append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(((StringBuilder)object).toString());
        }
        return super.p(fragment);
    }

    @Override
    public t q(Fragment fragment) {
        Object object = fragment.t;
        if (object != null && object != this.t) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
            ((StringBuilder)object).append(fragment.toString());
            ((StringBuilder)object).append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(((StringBuilder)object).toString());
        }
        return super.q(fragment);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("BackStackEntry{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.v >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.v);
        }
        if (this.k != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.k);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    @Override
    public t v(Fragment fragment) {
        Object object = fragment.t;
        if (object != null && object != this.t) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Cannot show Fragment attached to a different FragmentManager. Fragment ");
            ((StringBuilder)object).append(fragment.toString());
            ((StringBuilder)object).append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(((StringBuilder)object).toString());
        }
        return super.v(fragment);
    }

    void w(int n8) {
        if (this.i) {
            Object object;
            if (FragmentManager.J0(2)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Bump nesting in ");
                ((StringBuilder)object).append(this);
                ((StringBuilder)object).append(" by ");
                ((StringBuilder)object).append(n8);
                Log.v((String)"FragmentManager", (String)((StringBuilder)object).toString());
            }
            int n9 = this.c.size();
            for (int i8 = 0; i8 < n9; ++i8) {
                object = this.c.get(i8);
                Object object2 = ((t.a)object).b;
                if (object2 == null) continue;
                ((Fragment)object2).s += n8;
                if (!FragmentManager.J0(2)) continue;
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Bump nesting of ");
                ((StringBuilder)object2).append(((t.a)object).b);
                ((StringBuilder)object2).append(" to ");
                ((StringBuilder)object2).append(((t.a)object).b.s);
                Log.v((String)"FragmentManager", (String)((StringBuilder)object2).toString());
            }
        }
    }

    int x(boolean bl) {
        if (!this.u) {
            if (FragmentManager.J0(2)) {
                Appendable appendable = new StringBuilder();
                ((StringBuilder)appendable).append("Commit: ");
                ((StringBuilder)appendable).append(this);
                Log.v((String)"FragmentManager", (String)((StringBuilder)appendable).toString());
                appendable = new PrintWriter(new y("FragmentManager"));
                this.y("  ", (PrintWriter)appendable);
                ((PrintWriter)appendable).close();
            }
            this.u = true;
            this.v = this.i ? this.t.l() : -1;
            this.t.a0(this, bl);
            return this.v;
        }
        throw new IllegalStateException("commit already called");
    }

    public void y(String string, PrintWriter printWriter) {
        this.z(string, printWriter, true);
    }

    public void z(String string, PrintWriter printWriter, boolean bl) {
        if (bl) {
            printWriter.print(string);
            printWriter.print("mName=");
            printWriter.print(this.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.u);
            if (this.h != 0) {
                printWriter.print(string);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.h));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(string);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.f != 0 || this.g != 0) {
                printWriter.print(string);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(string);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.m);
            }
            if (this.n != 0 || this.o != null) {
                printWriter.print(string);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.o);
            }
        }
        if (!this.c.isEmpty()) {
            printWriter.print(string);
            printWriter.println("Operations:");
            int n8 = this.c.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                CharSequence charSequence;
                t.a a8 = this.c.get(i8);
                switch (a8.a) {
                    default: {
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append("cmd=");
                        ((StringBuilder)charSequence).append(a8.a);
                        charSequence = ((StringBuilder)charSequence).toString();
                        break;
                    }
                    case 10: {
                        charSequence = "OP_SET_MAX_LIFECYCLE";
                        break;
                    }
                    case 9: {
                        charSequence = "UNSET_PRIMARY_NAV";
                        break;
                    }
                    case 8: {
                        charSequence = "SET_PRIMARY_NAV";
                        break;
                    }
                    case 7: {
                        charSequence = "ATTACH";
                        break;
                    }
                    case 6: {
                        charSequence = "DETACH";
                        break;
                    }
                    case 5: {
                        charSequence = "SHOW";
                        break;
                    }
                    case 4: {
                        charSequence = "HIDE";
                        break;
                    }
                    case 3: {
                        charSequence = "REMOVE";
                        break;
                    }
                    case 2: {
                        charSequence = "REPLACE";
                        break;
                    }
                    case 1: {
                        charSequence = "ADD";
                        break;
                    }
                    case 0: {
                        charSequence = "NULL";
                    }
                }
                printWriter.print(string);
                printWriter.print("  Op #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.print((String)charSequence);
                printWriter.print(" ");
                printWriter.println(a8.b);
                if (!bl) continue;
                if (a8.d != 0 || a8.e != 0) {
                    printWriter.print(string);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(a8.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(a8.e));
                }
                if (a8.f == 0 && a8.g == 0) continue;
                printWriter.print(string);
                printWriter.print("popEnterAnim=#");
                printWriter.print(Integer.toHexString(a8.f));
                printWriter.print(" popExitAnim=#");
                printWriter.println(Integer.toHexString(a8.g));
            }
        }
    }
}

