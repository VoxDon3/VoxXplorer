/*
 * Decompiled with CFR 0.152.
 */
package ax.la;

import ax.la.b;
import ax.la.j;
import java.io.IOException;

public interface i<T>
extends Cloneable {
    public void A(j<T> var1);

    public i<T> clone();

    public T execute() throws IOException, b;
}

