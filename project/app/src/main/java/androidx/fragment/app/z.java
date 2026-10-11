/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.A;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r;
import ax.Y.d;
import ax.c0.d0;
import ax.z0.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

abstract class z {
    private final ViewGroup a;
    final ArrayList<e> b = new ArrayList();
    final ArrayList<e> c = new ArrayList();
    boolean d = false;
    boolean e = false;

    z(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(e.c object, e.b b8, r r8) {
        ArrayList<e> arrayList = this.b;
        synchronized (arrayList) {
            Throwable throwable2;
            block4: {
                e e8;
                ax.Y.d d8;
                try {
                    d8 = new ax.Y.d();
                    e8 = this.h(r8.k());
                    if (e8 != null) {
                        e8.k((e.c)((Object)object), b8);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                e8 = new d((e.c)((Object)object), b8, r8, d8);
                this.b.add(e8);
                object = new Runnable(this, (d)e8){
                    final z c0;
                    final d q;
                    {
                        this.c0 = z8;
                        this.q = d8;
                    }

                    @Override
                    public void run() {
                        if (this.c0.b.contains(this.q)) {
                            this.q.e().d(this.q.f().I);
                        }
                    }
                };
                e8.a((Runnable)object);
                object = new Runnable(this, (d)e8){
                    final z c0;
                    final d q;
                    {
                        this.c0 = z8;
                        this.q = d8;
                    }

                    @Override
                    public void run() {
                        this.c0.b.remove(this.q);
                        this.c0.c.remove(this.q);
                    }
                };
                e8.a((Runnable)object);
                return;
            }
            throw throwable2;
        }
    }

    private e h(Fragment fragment) {
        ArrayList<e> arrayList = this.b;
        int n8 = arrayList.size();
        int n9 = 0;
        while (n9 < n8) {
            int n10;
            e e8 = arrayList.get(n9);
            n9 = n10 = n9 + 1;
            if (!e8.f().equals(fragment)) continue;
            n9 = n10;
            if (e8.h()) continue;
            return e8;
        }
        return null;
    }

    private e i(Fragment fragment) {
        ArrayList<e> arrayList = this.c;
        int n8 = arrayList.size();
        int n9 = 0;
        while (n9 < n8) {
            int n10;
            e e8 = arrayList.get(n9);
            n9 = n10 = n9 + 1;
            if (!e8.f().equals(fragment)) continue;
            n9 = n10;
            if (e8.h()) continue;
            return e8;
        }
        return null;
    }

    static z n(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return z.o(viewGroup, fragmentManager.B0());
    }

    static z o(ViewGroup viewGroup, A object) {
        int n8 = ax.z0.b.b;
        Object object2 = viewGroup.getTag(n8);
        if (object2 instanceof z) {
            return (z)object2;
        }
        object = object.a(viewGroup);
        viewGroup.setTag(n8, object);
        return object;
    }

    private void q() {
        ArrayList<e> arrayList = this.b;
        int n8 = arrayList.size();
        int n9 = 0;
        while (n9 < n8) {
            int n10;
            e e8 = arrayList.get(n9);
            n9 = n10 = n9 + 1;
            if (e8.g() != e.b.c0) continue;
            e8.k(e.c.h(e8.f().q2().getVisibility()), e.b.q);
            n9 = n10;
        }
    }

    void b(e.c c8, r r8) {
        if (FragmentManager.J0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SpecialEffectsController: Enqueuing add operation for fragment ");
            stringBuilder.append(r8.k());
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        this.a(c8, e.b.c0, r8);
    }

    void c(r r8) {
        if (FragmentManager.J0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SpecialEffectsController: Enqueuing hide operation for fragment ");
            stringBuilder.append(r8.k());
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        this.a(e.c.d0, e.b.q, r8);
    }

    void d(r r8) {
        if (FragmentManager.J0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SpecialEffectsController: Enqueuing remove operation for fragment ");
            stringBuilder.append(r8.k());
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        this.a(e.c.q, e.b.d0, r8);
    }

    void e(r r8) {
        if (FragmentManager.J0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SpecialEffectsController: Enqueuing show operation for fragment ");
            stringBuilder.append(r8.k());
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        this.a(e.c.c0, e.b.q, r8);
    }

    abstract void f(List<e> var1, boolean var2);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void g() {
        if (this.e) {
            return;
        }
        if (!d0.Q((View)this.a)) {
            this.j();
            this.d = false;
            return;
        }
        ArrayList<e> arrayList = this.b;
        synchronized (arrayList) {
            block11: {
                int n8;
                Serializable serializable;
                int n9;
                ArrayList<e> arrayList2;
                try {
                    if (this.b.isEmpty()) break block11;
                    arrayList2 = new ArrayList<e>(this.c);
                    this.c.clear();
                    int n10 = arrayList2.size();
                    n9 = 0;
                    while (n9 < n10) {
                        serializable = arrayList2.get(n9);
                        n8 = n9 + 1;
                        e e8 = (e)((Object)serializable);
                        if (FragmentManager.J0(2)) {
                            serializable = new StringBuilder();
                            ((StringBuilder)serializable).append("SpecialEffectsController: Cancelling operation ");
                            ((StringBuilder)serializable).append(e8);
                            Log.v((String)"FragmentManager", (String)((StringBuilder)serializable).toString());
                        }
                        e8.b();
                        n9 = n8;
                        if (e8.i()) continue;
                        this.c.add(e8);
                        n9 = n8;
                    }
                    this.q();
                    serializable = new ArrayList(this.b);
                    this.b.clear();
                    this.c.addAll((Collection<e>)((Object)serializable));
                    if (FragmentManager.J0(2)) {
                        Log.v((String)"FragmentManager", (String)"SpecialEffectsController: Executing pending operations");
                    }
                    n8 = ((ArrayList)serializable).size();
                }
                catch (Throwable throwable) {}
                throw throwable;
                for (n9 = 0; n9 < n8; ++n9) {
                    arrayList2 = ((ArrayList)serializable).get(n9);
                    ((e)((Object)arrayList2)).l();
                }
                this.f((List<e>)((Object)serializable), this.d);
                this.d = false;
                if (FragmentManager.J0(2)) {
                    Log.v((String)"FragmentManager", (String)"SpecialEffectsController: Finished executing pending operations");
                }
            }
            return;
        }
    }

    /*
     * Exception decompiling
     */
    void j() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [3 : 85->105)] java.lang.Throwable
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

    void k() {
        if (this.e) {
            if (FragmentManager.J0(2)) {
                Log.v((String)"FragmentManager", (String)"SpecialEffectsController: Forcing postponed operations");
            }
            this.e = false;
            this.g();
        }
    }

    e.b l(r object) {
        Object object2 = this.h(((r)object).k());
        object2 = object2 != null ? object2.g() : null;
        if ((object = this.i(((r)object).k())) != null && (object2 == null || object2 == e.b.q)) {
            return ((e)object).g();
        }
        return object2;
    }

    public ViewGroup m() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void p() {
        ArrayList<e> arrayList = this.b;
        synchronized (arrayList) {
            try {
                this.q();
                this.e = false;
                for (int i8 = this.b.size() - 1; i8 >= 0; --i8) {
                    e.c c8;
                    e e8 = this.b.get(i8);
                    e.c c9 = e.c.j(e8.f().I);
                    e.c c10 = e8.e();
                    if (c10 != (c8 = e.c.c0) || c9 == c8) continue;
                    this.e = e8.f().c1();
                    break;
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    void r(boolean bl) {
        this.d = bl;
    }

    private static class d
    extends e {
        private final r h;

        d(e.c c8, e.b b8, r r8, ax.Y.d d8) {
            super(c8, b8, r8.k(), d8);
            this.h = r8;
        }

        @Override
        public void c() {
            super.c();
            this.h.m();
        }

        @Override
        void l() {
            if (this.g() == e.b.c0) {
                Fragment fragment = this.h.k();
                View view = fragment.I.findFocus();
                if (view != null) {
                    fragment.w2(view);
                    if (FragmentManager.J0(2)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("requestFocus: Saved focused view ");
                        stringBuilder.append(view);
                        stringBuilder.append(" for Fragment ");
                        stringBuilder.append(fragment);
                        Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                    }
                }
                if ((view = this.f().q2()).getParent() == null) {
                    this.h.b();
                    view.setAlpha(0.0f);
                }
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    view.setVisibility(4);
                }
                view.setAlpha(fragment.E0());
                return;
            }
            if (this.g() == e.b.d0) {
                Fragment fragment = this.h.k();
                View view = fragment.q2();
                if (FragmentManager.J0(2)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Clearing focus ");
                    stringBuilder.append(view.findFocus());
                    stringBuilder.append(" on view ");
                    stringBuilder.append(view);
                    stringBuilder.append(" for Fragment ");
                    stringBuilder.append(fragment);
                    Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                }
                view.clearFocus();
            }
        }
    }

    static class e {
        private c a;
        private b b;
        private final Fragment c;
        private final List<Runnable> d = new ArrayList<Runnable>();
        private final HashSet<ax.Y.d> e = new HashSet();
        private boolean f = false;
        private boolean g = false;

        e(c c8, b b8, Fragment fragment, ax.Y.d d8) {
            this.a = c8;
            this.b = b8;
            this.c = fragment;
            d8.c(new d.a(this){
                final e a;
                {
                    this.a = e8;
                }

                @Override
                public void a() {
                    this.a.b();
                }
            });
        }

        final void a(Runnable runnable2) {
            this.d.add(runnable2);
        }

        final void b() {
            if (!this.h()) {
                this.f = true;
                if (this.e.isEmpty()) {
                    this.c();
                    return;
                }
                ArrayList<ax.Y.d> arrayList = new ArrayList<ax.Y.d>(this.e);
                int n8 = arrayList.size();
                for (int i8 = 0; i8 < n8; ++i8) {
                    ax.Y.d d8 = arrayList.get(i8);
                    d8.a();
                }
            }
        }

        public void c() {
            if (!this.g) {
                Object object;
                if (FragmentManager.J0(2)) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("SpecialEffectsController: ");
                    ((StringBuilder)object).append(this);
                    ((StringBuilder)object).append(" has called complete.");
                    Log.v((String)"FragmentManager", (String)((StringBuilder)object).toString());
                }
                this.g = true;
                object = this.d.iterator();
                while (object.hasNext()) {
                    ((Runnable)object.next()).run();
                }
            }
        }

        public final void d(ax.Y.d d8) {
            if (this.e.remove(d8) && this.e.isEmpty()) {
                this.c();
            }
        }

        public c e() {
            return this.a;
        }

        public final Fragment f() {
            return this.c;
        }

        b g() {
            return this.b;
        }

        final boolean h() {
            return this.f;
        }

        final boolean i() {
            return this.g;
        }

        public final void j(ax.Y.d d8) {
            this.l();
            this.e.add(d8);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        final void k(c object, b object2) {
            int n8 = androidx.fragment.app.z$c.b[((Enum)object2).ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3 || this.a == c.q) return;
                    if (FragmentManager.J0(2)) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("SpecialEffectsController: For fragment ");
                        ((StringBuilder)object2).append(this.c);
                        ((StringBuilder)object2).append(" mFinalState = ");
                        ((StringBuilder)object2).append((Object)this.a);
                        ((StringBuilder)object2).append(" -> ");
                        ((StringBuilder)object2).append(object);
                        ((StringBuilder)object2).append(". ");
                        Log.v((String)"FragmentManager", (String)((StringBuilder)object2).toString());
                    }
                    this.a = object;
                    return;
                }
                if (FragmentManager.J0(2)) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("SpecialEffectsController: For fragment ");
                    ((StringBuilder)object).append(this.c);
                    ((StringBuilder)object).append(" mFinalState = ");
                    ((StringBuilder)object).append((Object)this.a);
                    ((StringBuilder)object).append(" -> REMOVED. mLifecycleImpact  = ");
                    ((StringBuilder)object).append((Object)this.b);
                    ((StringBuilder)object).append(" to REMOVING.");
                    Log.v((String)"FragmentManager", (String)((StringBuilder)object).toString());
                }
                this.a = c.q;
                this.b = b.d0;
                return;
            }
            if (this.a != c.q) return;
            if (FragmentManager.J0(2)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("SpecialEffectsController: For fragment ");
                ((StringBuilder)object).append(this.c);
                ((StringBuilder)object).append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                ((StringBuilder)object).append((Object)this.b);
                ((StringBuilder)object).append(" to ADDING.");
                Log.v((String)"FragmentManager", (String)((StringBuilder)object).toString());
            }
            this.a = c.c0;
            this.b = b.c0;
        }

        void l() {
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Operation ");
            stringBuilder.append("{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append("} ");
            stringBuilder.append("{");
            stringBuilder.append("mFinalState = ");
            stringBuilder.append((Object)this.a);
            stringBuilder.append("} ");
            stringBuilder.append("{");
            stringBuilder.append("mLifecycleImpact = ");
            stringBuilder.append((Object)this.b);
            stringBuilder.append("} ");
            stringBuilder.append("{");
            stringBuilder.append("mFragment = ");
            stringBuilder.append(this.c);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        static final class b
        extends Enum<b> {
            public static final /* enum */ b c0;
            public static final /* enum */ b d0;
            private static final b[] e0;
            public static final /* enum */ b q;

            static {
                b b8;
                b b9;
                b b10;
                q = b10 = new b();
                c0 = b9 = new b();
                d0 = b8 = new b();
                e0 = new b[]{b10, b9, b8};
            }

            public static b valueOf(String string) {
                return Enum.valueOf(b.class, string);
            }

            public static b[] values() {
                return (b[])e0.clone();
            }
        }

        static final class c
        extends Enum<c> {
            public static final /* enum */ c c0;
            public static final /* enum */ c d0;
            public static final /* enum */ c e0;
            private static final c[] f0;
            public static final /* enum */ c q;

            static {
                c c8;
                c c9;
                c c10;
                c c11;
                q = c11 = new c();
                c0 = c10 = new c();
                d0 = c9 = new c();
                e0 = c8 = new c();
                f0 = new c[]{c11, c10, c9, c8};
            }

            static c h(int n8) {
                if (n8 != 0) {
                    if (n8 != 4) {
                        if (n8 == 8) {
                            return d0;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown visibility ");
                        stringBuilder.append(n8);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                    return e0;
                }
                return c0;
            }

            static c j(View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return e0;
                }
                return androidx.fragment.app.z$e$c.h(view.getVisibility());
            }

            public static c valueOf(String string) {
                return Enum.valueOf(c.class, string);
            }

            public static c[] values() {
                return (c[])f0.clone();
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            void d(View view) {
                int n8 = androidx.fragment.app.z$c.a[this.ordinal()];
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) {
                            if (n8 != 4) return;
                            if (FragmentManager.J0(2)) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("SpecialEffectsController: Setting view ");
                                stringBuilder.append(view);
                                stringBuilder.append(" to INVISIBLE");
                                Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                            }
                            view.setVisibility(4);
                            return;
                        }
                        if (FragmentManager.J0(2)) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("SpecialEffectsController: Setting view ");
                            stringBuilder.append(view);
                            stringBuilder.append(" to GONE");
                            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                        }
                        view.setVisibility(8);
                        return;
                    }
                    if (FragmentManager.J0(2)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("SpecialEffectsController: Setting view ");
                        stringBuilder.append(view);
                        stringBuilder.append(" to VISIBLE");
                        Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                    }
                    view.setVisibility(0);
                    return;
                }
                ViewGroup viewGroup = (ViewGroup)view.getParent();
                if (viewGroup == null) return;
                if (FragmentManager.J0(2)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("SpecialEffectsController: Removing view ");
                    stringBuilder.append(view);
                    stringBuilder.append(" from container ");
                    stringBuilder.append(viewGroup);
                    Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                }
                viewGroup.removeView(view);
            }
        }
    }
}

