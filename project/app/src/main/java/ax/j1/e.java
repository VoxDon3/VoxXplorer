/*
 * Decompiled with CFR 0.152.
 */
package ax.j1;

import java.util.NoSuchElementException;

public interface e {
    public static final e a = new e(){

        @Override
        public long a() {
            throw new NoSuchElementException();
        }

        @Override
        public long b() {
            throw new NoSuchElementException();
        }

        @Override
        public boolean next() {
            return false;
        }
    };

    public long a();

    public long b();

    public boolean next();
}

