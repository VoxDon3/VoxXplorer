/*
 * Decompiled with CFR 0.152.
 */
package ax.Bc;

class t {
    int[] a;
    long[] b;
    int[] c;
    int[] d;

    t() {
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("StreamMap with indices of ");
        stringBuilder.append(this.a.length);
        stringBuilder.append(" folders, offsets of ");
        stringBuilder.append(this.b.length);
        stringBuilder.append(" packed streams, first files of ");
        stringBuilder.append(this.c.length);
        stringBuilder.append(" folders and folder indices for ");
        stringBuilder.append(this.d.length);
        stringBuilder.append(" files");
        return stringBuilder.toString();
    }
}

