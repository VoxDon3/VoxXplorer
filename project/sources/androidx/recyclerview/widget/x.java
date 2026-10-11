package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
interface x {

    public static class a implements x {
        SparseArray<m> a = new SparseArray<>();
        int b = 0;

        /* renamed from: androidx.recyclerview.widget.x$a$a, reason: collision with other inner class name */
        class C0042a implements c {
            private SparseIntArray a = new SparseIntArray(1);
            private SparseIntArray b = new SparseIntArray(1);
            final m c;

            C0042a(m mVar) {
                this.c = mVar;
            }

            @Override // androidx.recyclerview.widget.x.c
            public int a(int i) {
                int indexOfKey = this.b.indexOfKey(i);
                if (indexOfKey >= 0) {
                    return this.b.valueAt(indexOfKey);
                }
                throw new IllegalStateException("requested global type " + i + " does not belong to the adapter:" + this.c.c);
            }

            @Override // androidx.recyclerview.widget.x.c
            public int b(int i) {
                int indexOfKey = this.a.indexOfKey(i);
                if (indexOfKey > -1) {
                    return this.a.valueAt(indexOfKey);
                }
                int c = a.this.c(this.c);
                this.a.put(i, c);
                this.b.put(c, i);
                return c;
            }
        }

        @Override // androidx.recyclerview.widget.x
        public m a(int i) {
            m mVar = this.a.get(i);
            if (mVar != null) {
                return mVar;
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i);
        }

        @Override // androidx.recyclerview.widget.x
        public c b(m mVar) {
            return new C0042a(mVar);
        }

        int c(m mVar) {
            int i = this.b;
            this.b = i + 1;
            this.a.put(i, mVar);
            return i;
        }
    }

    public static class b implements x {
        SparseArray<List<m>> a = new SparseArray<>();

        class a implements c {
            final m a;

            a(m mVar) {
                this.a = mVar;
            }

            @Override // androidx.recyclerview.widget.x.c
            public int a(int i) {
                return i;
            }

            @Override // androidx.recyclerview.widget.x.c
            public int b(int i) {
                List<m> list = b.this.a.get(i);
                if (list == null) {
                    list = new ArrayList<>();
                    b.this.a.put(i, list);
                }
                if (!list.contains(this.a)) {
                    list.add(this.a);
                }
                return i;
            }
        }

        @Override // androidx.recyclerview.widget.x
        public m a(int i) {
            List<m> list = this.a.get(i);
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i);
        }

        @Override // androidx.recyclerview.widget.x
        public c b(m mVar) {
            return new a(mVar);
        }
    }

    public interface c {
        int a(int i);

        int b(int i);
    }

    m a(int i);

    c b(m mVar);
}
