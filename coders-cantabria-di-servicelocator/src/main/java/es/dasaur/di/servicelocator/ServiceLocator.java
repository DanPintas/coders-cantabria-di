package es.dasaur.di.servicelocator;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

public class ServiceLocator {

	public static class Binding<T> {

		private final Map<Class<?>, Supplier<?>> bindings;

		private final Class<T> type;

		public Binding(Map<Class<?>, Supplier<?>> bindings, Class<T> type) {
			this.bindings = bindings;
			this.type = type;
		}

		public void to(T instance) {
			bindings.put(type, () -> instance);
		}

		public void to(Supplier<T> factory) {
			bindings.put(type, factory);
		}

	}

	private final Map<Class<?>, Supplier<?>> bindings;

	public ServiceLocator() {
		bindings = new ConcurrentHashMap<>();
	}

	public <T> Binding<T> bind(Class<T> type) {
		return new Binding<>(bindings, type);
	}

	@SuppressWarnings("unchecked")
	public <T> T get(Class<T> type) {
		Supplier<?> supplier = bindings.get(type);
		return supplier == null ? null : (T) supplier.get();
	}

}
