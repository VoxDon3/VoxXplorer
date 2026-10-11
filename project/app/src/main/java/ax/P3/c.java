/*
 * Decompiled with CFR 0.152.
 */
package ax.P3;

import ax.M3.d;
import ax.M3.j;
import ax.R3.a;
import java.io.File;

class c<DataType>
implements a.b {
    private final d<DataType> a;
    private final DataType b;
    private final j c;

    c(d<DataType> d8, DataType DataType, j j8) {
        this.a = d8;
        this.b = DataType;
        this.c = j8;
    }

    @Override
    public boolean a(File file) {
        return this.a.a(this.b, file, this.c);
    }
}

