package ax.c0;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: ax.c0.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1772j0 {

    /* renamed from: ax.c0.j0$a */
    public static final class a implements ax.Nb.e<View> {
        final /* synthetic */ ViewGroup a;

        a(ViewGroup viewGroup) {
            this.a = viewGroup;
        }

        @Override // ax.Nb.e
        public Iterator<View> iterator() {
            return C1772j0.c(this.a);
        }
    }

    /* renamed from: ax.c0.j0$b */
    static final class b extends ax.Gb.m implements ax.Fb.l<View, Iterator<? extends View>> {
        public static final b q = new b();

        b() {
            super(1);
        }

        @Override // ax.Fb.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<View> invoke(View view) {
            ax.Nb.e<View> a;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (a = C1772j0.a(viewGroup)) == null) {
                return null;
            }
            return a.iterator();
        }
    }

    /* renamed from: ax.c0.j0$c */
    public static final class c implements Iterator<View>, ax.Hb.a {
        final /* synthetic */ ViewGroup c0;
        private int q;

        c(ViewGroup viewGroup) {
            this.c0 = viewGroup;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.c0;
            int i = this.q;
            this.q = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.q < this.c0.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.c0;
            int i = this.q - 1;
            this.q = i;
            viewGroup.removeViewAt(i);
        }
    }

    /* renamed from: ax.c0.j0$d */
    public static final class d implements ax.Nb.e<View> {
        final /* synthetic */ ViewGroup a;

        public d(ViewGroup viewGroup) {
            this.a = viewGroup;
        }

        @Override // ax.Nb.e
        public Iterator<View> iterator() {
            return new Y(C1772j0.a(this.a).iterator(), b.q);
        }
    }

    public static final ax.Nb.e<View> a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    public static final ax.Nb.e<View> b(ViewGroup viewGroup) {
        return new d(viewGroup);
    }

    public static final Iterator<View> c(ViewGroup viewGroup) {
        return new c(viewGroup);
    }
}
