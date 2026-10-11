/*
 * Decompiled with CFR 0.152.
 */
package ax.B;

import ax.C.a;
import ax.Gb.g;
import ax.Gb.l;
import ax.tb.i;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

public class k<K, V> {
    private Object[] c0;
    private int d0;
    private int[] q;

    public k() {
        this(0, 1, null);
    }

    public k(int n8) {
        Object[] objectArray = n8 == 0 ? a.a : new int[n8];
        this.q = objectArray;
        objectArray = n8 == 0 ? (Object[])a.c : (Object[])new Object[n8 << 1];
        this.c0 = objectArray;
    }

    public /* synthetic */ k(int n8, int n9, g g8) {
        if ((n9 & 1) != 0) {
            n8 = 0;
        }
        this(n8);
    }

    public k(k<? extends K, ? extends V> k8) {
        this(0, 1, null);
        if (k8 != null) {
            this.g(k8);
        }
    }

    private final int c(K k8, int n8) {
        int n9;
        int n10 = this.d0;
        if (n10 == 0) {
            return -1;
        }
        int n11 = a.a(this.q, n10, n8);
        if (n11 < 0 || l.a(k8, this.c0[n11 << 1])) {
            return n11;
        }
        for (n9 = n11 + 1; n9 < n10 && this.q[n9] == n8; ++n9) {
            if (!l.a(k8, this.c0[n9 << 1])) continue;
            return n9;
        }
        --n11;
        while (n11 >= 0 && this.q[n11] == n8) {
            if (l.a(k8, this.c0[n11 << 1])) {
                return n11;
            }
            --n11;
        }
        return ~n9;
    }

    private final int e() {
        int n8;
        int n9 = this.d0;
        if (n9 == 0) {
            return -1;
        }
        int n10 = a.a(this.q, n9, 0);
        if (n10 < 0 || this.c0[n10 << 1] == null) {
            return n10;
        }
        for (n8 = n10 + 1; n8 < n9 && this.q[n8] == 0; ++n8) {
            if (this.c0[n8 << 1] != null) continue;
            return n8;
        }
        for (n9 = n10 - 1; n9 >= 0 && this.q[n9] == 0; --n9) {
            if (this.c0[n9 << 1] != null) continue;
            return n9;
        }
        return ~n8;
    }

    public final int a(V v8) {
        int n8 = this.d0 * 2;
        Object[] objectArray = this.c0;
        if (v8 == null) {
            for (int i8 = 1; i8 < n8; i8 += 2) {
                if (objectArray[i8] != null) continue;
                return i8 >> 1;
            }
        } else {
            for (int i9 = 1; i9 < n8; i9 += 2) {
                if (!l.a(v8, objectArray[i9])) continue;
                return i9 >> 1;
            }
        }
        return -1;
    }

    public void b(int n8) {
        int n9 = this.d0;
        Object[] objectArray = this.q;
        if (objectArray.length < n8) {
            objectArray = Arrays.copyOf(objectArray, n8);
            l.e(objectArray, "copyOf(this, newSize)");
            this.q = objectArray;
            objectArray = Arrays.copyOf(this.c0, n8 * 2);
            l.e(objectArray, "copyOf(this, newSize)");
            this.c0 = objectArray;
        }
        if (this.d0 == n9) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public void clear() {
        if (this.d0 > 0) {
            this.q = a.a;
            this.c0 = a.c;
            this.d0 = 0;
        }
        if (this.d0 <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public boolean containsKey(K k8) {
        return this.d(k8) >= 0;
    }

    public boolean containsValue(V v8) {
        return this.a(v8) >= 0;
    }

    public int d(K k8) {
        if (k8 == null) {
            return this.e();
        }
        return this.c(k8, k8.hashCode());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        block18: {
            int n8;
            block19: {
                block15: {
                    block16: {
                        if (this == object) {
                            return true;
                        }
                        if (!(object instanceof k)) break block15;
                        if (this.size() == ((k)object).size()) break block16;
                        return false;
                    }
                    k k8 = (k)object;
                    int n9 = this.d0;
                    for (int i8 = 0; i8 < n9; ++i8) {
                        V v8;
                        V v9;
                        block17: {
                            object = this.f(i8);
                            v9 = this.k(i8);
                            v8 = k8.get(object);
                            if (v9 != null) break block17;
                            if (v8 != null) return false;
                            if (k8.containsKey(object)) continue;
                            return false;
                        }
                        if (l.a(v9, v8)) continue;
                        return false;
                    }
                    return true;
                }
                if (!(object instanceof Map)) break block18;
                if (this.size() == ((Map)object).size()) break block19;
                return false;
            }
            try {
                n8 = this.d0;
            }
            catch (ClassCastException | NullPointerException runtimeException) {
                return false;
            }
            for (int i9 = 0; i9 < n8; ++i9) {
                Object v10;
                V v11;
                block20: {
                    K k9 = this.f(i9);
                    v11 = this.k(i9);
                    v10 = ((Map)object).get(k9);
                    if (v11 != null) break block20;
                    if (v10 != null) return false;
                    if (((Map)object).containsKey(k9)) continue;
                    return false;
                }
                boolean bl = l.a(v11, v10);
                if (bl) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public K f(int n8) {
        if (n8 >= 0 && n8 < this.d0) {
            return (K)this.c0[n8 << 1];
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected index to be within 0..size()-1, but was ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    public void g(k<? extends K, ? extends V> k8) {
        l.f(k8, "map");
        int n8 = k8.d0;
        this.b(this.d0 + n8);
        int n9 = this.d0;
        if (n9 == 0) {
            if (n8 > 0) {
                i.e(k8.q, this.q, 0, 0, n8);
                i.g(k8.c0, this.c0, 0, 0, n8 << 1);
                this.d0 = n8;
                return;
            }
        } else {
            for (int i8 = 0; i8 < n8; ++i8) {
                this.put(k8.f(i8), k8.k(i8));
            }
        }
    }

    public V get(K k8) {
        int n8 = this.d(k8);
        if (n8 >= 0) {
            return (V)this.c0[(n8 << 1) + 1];
        }
        return null;
    }

    public V getOrDefault(Object object, V v8) {
        int n8 = this.d(object);
        if (n8 >= 0) {
            return (V)this.c0[(n8 << 1) + 1];
        }
        return v8;
    }

    public int hashCode() {
        int[] nArray = this.q;
        Object[] objectArray = this.c0;
        int n8 = this.d0;
        int n9 = 1;
        int n10 = 0;
        int n11 = 0;
        while (n10 < n8) {
            Object object = objectArray[n9];
            int n12 = nArray[n10];
            int n13 = object != null ? object.hashCode() : 0;
            n11 += n13 ^ n12;
            ++n10;
            n9 += 2;
        }
        return n11;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public V i(int n8) {
        int n9;
        if (n8 >= 0 && n8 < (n9 = this.d0)) {
            Object[] objectArray = this.c0;
            int n10 = n8 << 1;
            Object object = objectArray[n10 + 1];
            if (n9 <= 1) {
                this.clear();
                return (V)object;
            }
            int n11 = n9 - 1;
            int[] nArray = this.q;
            int n12 = nArray.length;
            int n13 = 8;
            if (n12 > 8 && n9 < nArray.length / 3) {
                if (n9 > 8) {
                    n13 = n9 + (n9 >> 1);
                }
                int[] nArray2 = Arrays.copyOf(nArray, n13);
                l.e(nArray2, "copyOf(this, newSize)");
                this.q = nArray2;
                Object[] objectArray2 = Arrays.copyOf(this.c0, n13 << 1);
                l.e(objectArray2, "copyOf(this, newSize)");
                this.c0 = objectArray2;
                if (n9 != this.d0) throw new ConcurrentModificationException();
                if (n8 > 0) {
                    i.e(nArray, this.q, 0, 0, n8);
                    i.g(objectArray, this.c0, 0, 0, n10);
                }
                if (n8 < n11) {
                    int[] nArray3 = this.q;
                    n13 = n8 + 1;
                    i.e(nArray, nArray3, n8, n13, n9);
                    i.g(objectArray, this.c0, n10, n13 << 1, n9 << 1);
                }
            } else {
                if (n8 < n11) {
                    n13 = n8 + 1;
                    i.e(nArray, nArray, n8, n13, n9);
                    objectArray = this.c0;
                    i.g(objectArray, objectArray, n10, n13 << 1, n9 << 1);
                }
                objectArray = this.c0;
                n8 = n11 << 1;
                objectArray[n8] = null;
                objectArray[n8 + 1] = null;
            }
            if (n9 != this.d0) throw new ConcurrentModificationException();
            this.d0 = n11;
            return (V)object;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected index to be within 0..size()-1, but was ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    public boolean isEmpty() {
        return this.d0 <= 0;
    }

    public V j(int n8, V object) {
        if (n8 >= 0 && n8 < this.d0) {
            n8 = (n8 << 1) + 1;
            Object[] objectArray = this.c0;
            Object object2 = objectArray[n8];
            objectArray[n8] = object;
            return (V)object2;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Expected index to be within 0..size()-1, but was ");
        ((StringBuilder)object).append(n8);
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    public V k(int n8) {
        if (n8 >= 0 && n8 < this.d0) {
            return (V)this.c0[(n8 << 1) + 1];
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected index to be within 0..size()-1, but was ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    public V put(K object, V v8) {
        int n8 = this.d0;
        int n9 = object != null ? object.hashCode() : 0;
        int n10 = object != null ? this.c(object, n9) : this.e();
        if (n10 >= 0) {
            n10 = (n10 << 1) + 1;
            Object[] objectArray = this.c0;
            object = objectArray[n10];
            objectArray[n10] = v8;
            return (V)object;
        }
        int n11 = ~n10;
        Object[] objectArray = this.q;
        if (n8 >= objectArray.length) {
            n10 = 8;
            if (n8 >= 8) {
                n10 = (n8 >> 1) + n8;
            } else if (n8 < 4) {
                n10 = 4;
            }
            objectArray = Arrays.copyOf(objectArray, n10);
            l.e(objectArray, "copyOf(this, newSize)");
            this.q = objectArray;
            objectArray = Arrays.copyOf(this.c0, n10 << 1);
            l.e(objectArray, "copyOf(this, newSize)");
            this.c0 = objectArray;
            if (n8 != this.d0) {
                throw new ConcurrentModificationException();
            }
        }
        if (n11 < n8) {
            objectArray = this.q;
            n10 = n11 + 1;
            i.e(objectArray, objectArray, n10, n11, n8);
            objectArray = this.c0;
            i.g(objectArray, objectArray, n10 << 1, n11 << 1, this.d0 << 1);
        }
        if (n8 == (n10 = this.d0) && n11 < (objectArray = this.q).length) {
            objectArray[n11] = n9;
            objectArray = this.c0;
            n9 = n11 << 1;
            objectArray[n9] = (int)object;
            objectArray[n9 + 1] = (int)v8;
            this.d0 = n10 + 1;
            return null;
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k8, V v8) {
        V v9 = this.get(k8);
        if (v9 == null) {
            return this.put(k8, v8);
        }
        return v9;
    }

    public V remove(K k8) {
        int n8 = this.d(k8);
        if (n8 >= 0) {
            return this.i(n8);
        }
        return null;
    }

    public boolean remove(K k8, V v8) {
        int n8 = this.d(k8);
        if (n8 >= 0 && l.a(v8, this.k(n8))) {
            this.i(n8);
            return true;
        }
        return false;
    }

    public V replace(K k8, V v8) {
        int n8 = this.d(k8);
        if (n8 >= 0) {
            return this.j(n8, v8);
        }
        return null;
    }

    public boolean replace(K k8, V v8, V v9) {
        int n8 = this.d(k8);
        if (n8 >= 0 && l.a(v8, this.k(n8))) {
            this.j(n8, v9);
            return true;
        }
        return false;
    }

    public int size() {
        return this.d0;
    }

    public String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        CharSequence charSequence = new StringBuilder(this.d0 * 28);
        ((StringBuilder)charSequence).append('{');
        int n8 = this.d0;
        for (int i8 = 0; i8 < n8; ++i8) {
            Object object;
            if (i8 > 0) {
                ((StringBuilder)charSequence).append(", ");
            }
            if ((object = this.f(i8)) != charSequence) {
                ((StringBuilder)charSequence).append(object);
            } else {
                ((StringBuilder)charSequence).append("(this Map)");
            }
            ((StringBuilder)charSequence).append('=');
            object = this.k(i8);
            if (object != charSequence) {
                ((StringBuilder)charSequence).append(object);
                continue;
            }
            ((StringBuilder)charSequence).append("(this Map)");
        }
        ((StringBuilder)charSequence).append('}');
        charSequence = ((StringBuilder)charSequence).toString();
        l.e(charSequence, "StringBuilder(capacity).\u2026builderAction).toString()");
        return charSequence;
    }
}

