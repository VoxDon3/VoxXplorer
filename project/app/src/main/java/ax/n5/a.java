/*
 * Decompiled with CFR 0.152.
 */
package ax.n5;

import ax.n5.c;
import ax.n5.d;
import ax.n5.e;
import ax.n5.f;

final class a<T>
extends c<T> {
    private final Integer a;
    private final T b;
    private final e c;

    a(Integer n8, T t8, e e8, f f8, d d8) {
        this.a = n8;
        if (t8 != null) {
            this.b = t8;
            if (e8 != null) {
                this.c = e8;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    @Override
    public Integer a() {
        return this.a;
    }

    @Override
    public d b() {
        return null;
    }

    @Override
    public T c() {
        return this.b;
    }

    @Override
    public e d() {
        return this.c;
    }

    @Override
    public f e() {
        return null;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof c) {
            object = (c)object;
            Integer n8 = this.a;
            if ((n8 == null ? ((c)object).a() == null : n8.equals(((c)object).a())) && this.b.equals(((c)object).c()) && ((Object)((Object)this.c)).equals((Object)((c)object).d())) {
                ((c)object).e();
                ((c)object).b();
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer n8 = this.a;
        int n9 = n8 == null ? 0 : n8.hashCode();
        return (((n9 ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ ((Object)((Object)this.c)).hashCode()) * -721379959;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Event{code=");
        stringBuilder.append(this.a);
        stringBuilder.append(", payload=");
        stringBuilder.append(this.b);
        stringBuilder.append(", priority=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", productData=");
        stringBuilder.append((Object)null);
        stringBuilder.append(", eventContext=");
        stringBuilder.append((Object)null);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

