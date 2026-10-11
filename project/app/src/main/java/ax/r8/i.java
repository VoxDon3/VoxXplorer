/*
 * Decompiled with CFR 0.152.
 */
package ax.r8;

import ax.r8.f;
import ax.r8.k;
import ax.r8.l;
import ax.r8.o;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public abstract class i {
    public boolean e() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public f g() {
        if (this.l()) {
            return (f)this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a JSON Array: ");
        stringBuilder.append(this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public l h() {
        if (this.p()) {
            return (l)this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a JSON Object: ");
        stringBuilder.append(this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public o i() {
        if (this.q()) {
            return (o)this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a JSON Primitive: ");
        stringBuilder.append(this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public String k() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public boolean l() {
        return this instanceof f;
    }

    public boolean n() {
        return this instanceof k;
    }

    public boolean p() {
        return this instanceof l;
    }

    public boolean q() {
        return this instanceof o;
    }

    public String toString() {
        try {
            Object object = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter((Writer)object);
            jsonWriter.setLenient(true);
            ax.t8.l.b(this, jsonWriter);
            object = ((StringWriter)object).toString();
            return object;
        }
        catch (IOException iOException) {
            throw new AssertionError((Object)iOException);
        }
    }
}

