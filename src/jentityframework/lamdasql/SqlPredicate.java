package jentityframework.lamdasql;

import java.io.Serializable;
import java.util.function.Predicate;

/**
 * @author Collin Alpert
 */
public interface SqlPredicate<T> extends Predicate<T>, Serializable {
}
