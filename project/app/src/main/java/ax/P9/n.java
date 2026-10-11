/*
 * Decompiled with CFR 0.152.
 */
package ax.P9;

import ax.L9.c;
import ax.M9.d;
import ax.P9.o;
import ax.P9.q;

public interface n {
    public <Result, BodyType> Result a(o var1, Class<Result> var2, BodyType var3) throws d;

    public <Result, BodyType> void b(o var1, c<Result> var2, Class<Result> var3, BodyType var4);

    public <Result, BodyType, DeserializeType> Result c(o var1, Class<Result> var2, BodyType var3, q<Result, DeserializeType> var4) throws d;
}

