package ax.P3;

import ax.R3.a;
import java.io.File;

/* loaded from: classes.dex */
class c<DataType> implements a.b {
    private final ax.M3.d<DataType> a;
    private final DataType b;
    private final ax.M3.j c;

    c(ax.M3.d<DataType> dVar, DataType datatype, ax.M3.j jVar) {
        this.a = dVar;
        this.b = datatype;
        this.c = jVar;
    }

    @Override // ax.R3.a.b
    public boolean a(File file) {
        return this.a.a(this.b, file, this.c);
    }
}
