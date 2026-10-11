/*
 * Decompiled with CFR 0.152.
 */
package ax.q5;

import android.content.Context;
import ax.q5.h;
import ax.z5.a;

final class c
extends h {
    private final Context a;
    private final a b;
    private final a c;
    private final String d;

    c(Context context, a a8, a a9, String string) {
        if (context != null) {
            this.a = context;
            if (a8 != null) {
                this.b = a8;
                if (a9 != null) {
                    this.c = a9;
                    if (string != null) {
                        this.d = string;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    @Override
    public Context b() {
        return this.a;
    }

    @Override
    public String c() {
        return this.d;
    }

    @Override
    public a d() {
        return this.c;
    }

    @Override
    public a e() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof h && this.a.equals(((h)(object = (h)object)).b()) && this.b.equals(((h)object).e()) && this.c.equals(((h)object).d()) && this.d.equals(((h)object).c());
    }

    public int hashCode() {
        return (((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CreationContext{applicationContext=");
        stringBuilder.append(this.a);
        stringBuilder.append(", wallClock=");
        stringBuilder.append(this.b);
        stringBuilder.append(", monotonicClock=");
        stringBuilder.append(this.c);
        stringBuilder.append(", backendName=");
        stringBuilder.append(this.d);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

