/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.view.View;
import android.view.ViewGroup;
import ax.Fb.p;
import ax.Nb.e;
import ax.Nb.g;
import ax.Nb.h;
import ax.c0.j0;
import ax.sb.o;
import ax.sb.t;
import ax.xb.b;

public final class k0 {
    public static final e<View> a(View view) {
        return h.b(new p<g<? super View>, ax.wb.e<? super t>, Object>(view, null){
            int d0;
            private Object e0;
            final View f0;
            {
                this.f0 = view;
                super(2, e8);
            }

            @Override
            public final ax.wb.e<t> a(Object object, ax.wb.e<?> p8) {
                p8 = new /* invalid duplicate definition of identical inner class */;
                p8.e0 = object;
                return p8;
            }

            @Override
            public final Object p(Object object) {
                block5: {
                    Object object2;
                    block7: {
                        Object object3;
                        block6: {
                            block2: {
                                block3: {
                                    block4: {
                                        object2 = b.c();
                                        int n8 = this.d0;
                                        if (n8 == 0) break block2;
                                        if (n8 == 1) break block3;
                                        if (n8 != 2) break block4;
                                        o.b(object);
                                        break block5;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                object3 = (g)this.e0;
                                o.b(object);
                                object = object3;
                                break block6;
                            }
                            o.b(object);
                            object3 = (g)this.e0;
                            View view = this.f0;
                            this.e0 = object3;
                            this.d0 = 1;
                            object = object3;
                            if (((g)object3).c(view, this) == object2) break block7;
                        }
                        object3 = this.f0;
                        if (!(object3 instanceof ViewGroup)) break block5;
                        object3 = j0.b((ViewGroup)object3);
                        this.e0 = null;
                        this.d0 = 2;
                        if (((g)object).e(object3, this) != object2) break block5;
                    }
                    return object2;
                }
                return t.a;
            }

            public final Object t(g<? super View> g8, ax.wb.e<? super t> e8) {
                return (this.a(g8, e8)).p(t.a);
            }
        });
    }
}

