package java.util.function;

public final class Predicate$CC {
    private Predicate$CC() { }

    public static <T> Predicate<T> $default$and(Predicate<T> predicate, Predicate<T> predicate2) {
        java.util.Objects.requireNonNull(predicate2);
        return t -> predicate.test(t) && predicate2.test(t);
    }

    public static <T> Predicate<T> $default$or(Predicate<T> predicate, Predicate<T> predicate2) {
        java.util.Objects.requireNonNull(predicate2);
        return t -> predicate.test(t) || predicate2.test(t);
    }

    public static <T> Predicate<T> $default$negate(Predicate<T> predicate) {
        return t -> !predicate.test(t);
    }
}
