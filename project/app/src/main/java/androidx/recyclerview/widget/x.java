/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.m;
import java.util.ArrayList;
import java.util.List;

interface x {
    public m a(int var1);

    public c b(m var1);

    public static class androidx.recyclerview.widget.x$a
    implements x {
        SparseArray<m> a = new SparseArray();
        int b = 0;

        @Override
        public m a(int n8) {
            Object object = (m)this.a.get(n8);
            if (object != null) {
                return object;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Cannot find the wrapper for global view type ");
            ((StringBuilder)object).append(n8);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }

        @Override
        public c b(m m8) {
            return new a(this, m8);
        }

        int c(m m8) {
            int n8 = this.b;
            this.b = n8 + 1;
            this.a.put(n8, (Object)m8);
            return n8;
        }

        class a
        implements c {
            private SparseIntArray a;
            private SparseIntArray b;
            final m c;
            final androidx.recyclerview.widget.x$a d;

            a(androidx.recyclerview.widget.x$a a8, m m8) {
                this.d = a8;
                this.a = new SparseIntArray(1);
                this.b = new SparseIntArray(1);
                this.c = m8;
            }

            @Override
            public int a(int n8) {
                int n9 = this.b.indexOfKey(n8);
                if (n9 >= 0) {
                    return this.b.valueAt(n9);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("requested global type ");
                stringBuilder.append(n8);
                stringBuilder.append(" does not belong to the adapter:");
                stringBuilder.append(this.c.c);
                throw new IllegalStateException(stringBuilder.toString());
            }

            @Override
            public int b(int n8) {
                int n9 = this.a.indexOfKey(n8);
                if (n9 > -1) {
                    return this.a.valueAt(n9);
                }
                n9 = this.d.c(this.c);
                this.a.put(n8, n9);
                this.b.put(n9, n8);
                return n9;
            }
        }
    }

    public static class b
    implements x {
        SparseArray<List<m>> a = new SparseArray();

        @Override
        public m a(int n8) {
            Object object = (List)this.a.get(n8);
            if (object != null && !object.isEmpty()) {
                return (m)object.get(0);
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Cannot find the wrapper for global view type ");
            ((StringBuilder)object).append(n8);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }

        @Override
        public c b(m m8) {
            return new a(this, m8);
        }

        class a
        implements c {
            final m a;
            final b b;

            a(b b8, m m8) {
                this.b = b8;
                this.a = m8;
            }

            @Override
            public int a(int n8) {
                return n8;
            }

            @Override
            public int b(int n8) {
                ArrayList<m> arrayList;
                ArrayList<m> arrayList2 = arrayList = (ArrayList<m>)this.b.a.get(n8);
                if (arrayList == null) {
                    arrayList2 = new ArrayList<m>();
                    this.b.a.put(n8, arrayList2);
                }
                if (!arrayList2.contains(this.a)) {
                    arrayList2.add(this.a);
                }
                return n8;
            }
        }
    }

    public static interface c {
        public int a(int var1);

        public int b(int var1);
    }
}

