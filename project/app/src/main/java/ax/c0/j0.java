/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.view.View;
import android.view.ViewGroup;
import ax.Nb.e;
import ax.c0.Y;
import java.util.Iterator;

public final class j0 {
    public static final e<View> a(ViewGroup viewGroup) {
        return new e<View>(viewGroup){
            final ViewGroup a;
            {
                this.a = viewGroup;
            }

            @Override
            public Iterator<View> iterator() {
                return j0.c(this.a);
            }
        };
    }

    public static final e<View> b(ViewGroup viewGroup) {
        return new e<View>(viewGroup){
            final ViewGroup a;
            {
                this.a = viewGroup;
            }

            @Override
            public Iterator<View> iterator() {
                return new Y<View>(j0.a(this.a).iterator(), b.q);
            }
        };
    }

    public static final Iterator<View> c(ViewGroup viewGroup) {
        return new Iterator<View>(viewGroup){
            final ViewGroup c0;
            private int q;
            {
                this.c0 = viewGroup;
            }

            public View b() {
                ViewGroup viewGroup = this.c0;
                int n8 = this.q;
                this.q = n8 + 1;
                if ((viewGroup = viewGroup.getChildAt(n8)) != null) {
                    return viewGroup;
                }
                throw new IndexOutOfBoundsException();
            }

            @Override
            public boolean hasNext() {
                return this.q < this.c0.getChildCount();
            }

            @Override
            public void remove() {
                int n8;
                ViewGroup viewGroup = this.c0;
                this.q = n8 = this.q - 1;
                viewGroup.removeViewAt(n8);
            }
        };
    }
}

