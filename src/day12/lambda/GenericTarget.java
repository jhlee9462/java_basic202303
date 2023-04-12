package day12.lambda;

@FunctionalInterface
public interface GenericTarget<T, U> {

    U select(T t);
}
