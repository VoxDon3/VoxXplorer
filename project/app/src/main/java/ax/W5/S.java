/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.U;

final class S
extends U {
    static final S q = new S();

    private S() {
    }

    @Override
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object object) {
        return object == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}

