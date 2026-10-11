/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;
import ax.Y.d;
import java.util.ArrayList;
import java.util.List;

class v
extends w {
    v() {
    }

    private static boolean v(Transition transition) {
        return !w.i(transition.getTargetIds()) || !w.i(transition.getTargetNames()) || !w.i(transition.getTargetTypes());
        {
        }
    }

    @Override
    public void a(Object object, View view) {
        if (object != null) {
            ((Transition)object).addTarget(view);
        }
    }

    @Override
    public void b(Object object, ArrayList<View> arrayList) {
        block2: {
            int n8;
            int n9;
            block3: {
                if ((object = (Transition)object) == null) break block2;
                boolean bl = object instanceof TransitionSet;
                n9 = 0;
                if (!bl) break block3;
                object = (TransitionSet)object;
                int n10 = object.getTransitionCount();
                for (n8 = n9; n8 < n10; ++n8) {
                    this.b(object.getTransitionAt(n8), arrayList);
                }
                break block2;
            }
            if (v.v((Transition)object) || !w.i(object.getTargets())) break block2;
            n9 = arrayList.size();
            for (n8 = 0; n8 < n9; ++n8) {
                object.addTarget(arrayList.get(n8));
            }
        }
    }

    @Override
    public void c(ViewGroup viewGroup, Object object) {
        TransitionManager.beginDelayedTransition((ViewGroup)viewGroup, (Transition)((Transition)object));
    }

    @Override
    public boolean e(Object object) {
        return object instanceof Transition;
    }

    @Override
    public Object f(Object object) {
        if (object != null) {
            return ((Transition)object).clone();
        }
        return null;
    }

    @Override
    public Object j(Object object, Object object2, Object object3) {
        object = (Transition)object;
        object2 = (Transition)object2;
        object3 = (Transition)object3;
        if (object != null && object2 != null) {
            object = new TransitionSet().addTransition((Transition)object).addTransition((Transition)object2).setOrdering(1);
        } else if (object == null) {
            object = object2 != null ? object2 : null;
        }
        if (object3 != null) {
            object2 = new TransitionSet();
            if (object != null) {
                object2.addTransition((Transition)object);
            }
            object2.addTransition((Transition)object3);
            return object2;
        }
        return object;
    }

    @Override
    public Object k(Object object, Object object2, Object object3) {
        TransitionSet transitionSet = new TransitionSet();
        if (object != null) {
            transitionSet.addTransition((Transition)object);
        }
        if (object2 != null) {
            transitionSet.addTransition((Transition)object2);
        }
        if (object3 != null) {
            transitionSet.addTransition((Transition)object3);
        }
        return transitionSet;
    }

    @Override
    public void m(Object object, View view, ArrayList<View> arrayList) {
        ((Transition)object).addListener(new Transition.TransitionListener(this, view, arrayList){
            final View a;
            final ArrayList b;
            final v c;
            {
                this.c = v8;
                this.a = view;
                this.b = arrayList;
            }

            public void onTransitionCancel(Transition transition) {
            }

            public void onTransitionEnd(Transition transition) {
                f.b(transition, this);
                this.a.setVisibility(8);
                int n8 = this.b.size();
                for (int i8 = 0; i8 < n8; ++i8) {
                    ((View)this.b.get(i8)).setVisibility(0);
                }
            }

            public void onTransitionPause(Transition transition) {
            }

            public void onTransitionResume(Transition transition) {
            }

            public void onTransitionStart(Transition transition) {
                f.b(transition, this);
                f.a(transition, this);
            }
        });
    }

    @Override
    public void n(Object object, Object object2, ArrayList<View> arrayList, Object object3, ArrayList<View> arrayList2, Object object4, ArrayList<View> arrayList3) {
        ((Transition)object).addListener(new Transition.TransitionListener(this, object2, arrayList, object3, arrayList2, object4, arrayList3){
            final Object a;
            final ArrayList b;
            final Object c;
            final ArrayList d;
            final Object e;
            final ArrayList f;
            final v g;
            {
                this.g = v8;
                this.a = object;
                this.b = arrayList;
                this.c = object2;
                this.d = arrayList2;
                this.e = object3;
                this.f = arrayList3;
            }

            public void onTransitionCancel(Transition transition) {
            }

            public void onTransitionEnd(Transition transition) {
                f.b(transition, this);
            }

            public void onTransitionPause(Transition transition) {
            }

            public void onTransitionResume(Transition transition) {
            }

            public void onTransitionStart(Transition object) {
                object = this.a;
                if (object != null) {
                    this.g.w(object, this.b, null);
                }
                if ((object = this.c) != null) {
                    this.g.w(object, this.d, null);
                }
                if ((object = this.e) != null) {
                    this.g.w(object, this.f, null);
                }
            }
        });
    }

    @Override
    public void o(Object object, Rect rect) {
        if (object != null) {
            ((Transition)object).setEpicenterCallback(new Transition.EpicenterCallback(this, rect){
                final Rect a;
                final v b;
                {
                    this.b = v8;
                    this.a = rect;
                }

                public Rect onGetEpicenter(Transition transition) {
                    transition = this.a;
                    if (transition != null && !transition.isEmpty()) {
                        return this.a;
                    }
                    return null;
                }
            });
        }
    }

    @Override
    public void p(Object object, View view) {
        if (view != null) {
            Transition transition = (Transition)object;
            object = new Rect();
            this.h(view, (Rect)object);
            transition.setEpicenterCallback(new Transition.EpicenterCallback(this, (Rect)object){
                final Rect a;
                final v b;
                {
                    this.b = v8;
                    this.a = rect;
                }

                public Rect onGetEpicenter(Transition transition) {
                    return this.a;
                }
            });
        }
    }

    @Override
    public void q(Fragment fragment, Object object, d d8, Runnable runnable2) {
        ((Transition)object).addListener(new Transition.TransitionListener(this, runnable2){
            final Runnable a;
            final v b;
            {
                this.b = v8;
                this.a = runnable2;
            }

            public void onTransitionCancel(Transition transition) {
            }

            public void onTransitionEnd(Transition transition) {
                this.a.run();
            }

            public void onTransitionPause(Transition transition) {
            }

            public void onTransitionResume(Transition transition) {
            }

            public void onTransitionStart(Transition transition) {
            }
        });
    }

    @Override
    public void s(Object object, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet)object;
        object = transitionSet.getTargets();
        object.clear();
        int n8 = arrayList.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            w.d((List<View>)object, arrayList.get(i8));
        }
        object.add(view);
        arrayList.add(view);
        this.b(transitionSet, arrayList);
    }

    @Override
    public void t(Object object, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if ((object = (TransitionSet)object) != null) {
            object.getTargets().clear();
            object.getTargets().addAll(arrayList2);
            this.w(object, arrayList, arrayList2);
        }
    }

    @Override
    public Object u(Object object) {
        if (object == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition)object);
        return transitionSet;
    }

    public void w(Object object, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        block4: {
            int n8;
            int n9;
            Transition transition;
            block3: {
                transition = (Transition)object;
                boolean bl = transition instanceof TransitionSet;
                if (!bl) break block3;
                object = (TransitionSet)transition;
                n9 = object.getTransitionCount();
                for (n8 = 0; n8 < n9; ++n8) {
                    this.w(object.getTransitionAt(n8), arrayList, arrayList2);
                }
                break block4;
            }
            if (v.v(transition) || (object = transition.getTargets()) == null || object.size() != arrayList.size() || !object.containsAll(arrayList)) break block4;
            n8 = arrayList2 == null ? 0 : arrayList2.size();
            for (n9 = 0; n9 < n8; ++n9) {
                transition.addTarget(arrayList2.get(n9));
            }
            for (n8 = arrayList.size() - 1; n8 >= 0; --n8) {
                transition.removeTarget(arrayList.get(n8));
            }
        }
    }

    static class f {
        static void a(Transition transition, Transition.TransitionListener transitionListener) {
            transition.addListener(transitionListener);
        }

        static void b(Transition transition, Transition.TransitionListener transitionListener) {
            transition.removeListener(transitionListener);
        }
    }
}

