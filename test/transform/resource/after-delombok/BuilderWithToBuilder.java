import java.util.List;
class BuilderWithToBuilder<T> {
	private String mOne;
	private String mTwo;
	private T foo;
	private List<T> bars;
	public static <K> K rrr(BuilderWithToBuilder<K> x) {
		return x.foo;
	}
	@java.lang.SuppressWarnings("all")
	BuilderWithToBuilder(final String one, final String two, final T foo, final List<T> bars) {
		this.mOne = one;
		this.mTwo = two;
		this.foo = foo;
		this.bars = bars;
	}
	@java.lang.SuppressWarnings("all")
	public static class BuilderWithToBuilderBuilder<T> {
		@java.lang.SuppressWarnings("all")
		private String one;
		@java.lang.SuppressWarnings("all")
		private String two;
		@java.lang.SuppressWarnings("all")
		private T foo;
		@java.lang.SuppressWarnings("all")
		private java.util.ArrayList<T> bars;
		@java.lang.SuppressWarnings("all")
		BuilderWithToBuilderBuilder() {
		}
		@java.lang.SuppressWarnings("all")
		public BuilderWithToBuilderBuilder<T> one(final String one) {
			this.one = one;
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderWithToBuilderBuilder<T> two(final String two) {
			this.two = two;
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderWithToBuilderBuilder<T> foo(final T foo) {
			this.foo = foo;
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderWithToBuilderBuilder<T> bar(final T bar) {
			if (this.bars == null) this.bars = new java.util.ArrayList<T>();
			this.bars.add(bar);
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderWithToBuilderBuilder<T> bars(final java.util.Collection<? extends T> bars) {
			if (this.bars == null) this.bars = new java.util.ArrayList<T>();
			this.bars.addAll(bars);
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderWithToBuilderBuilder<T> clearBars() {
			if (this.bars != null) this.bars.clear();
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderWithToBuilder<T> build() {
			java.util.List<T> bars;
			switch (this.bars == null ? 0 : this.bars.size()) {
			case 0: 
				bars = java.util.Collections.emptyList();
				break;
			case 1: 
				bars = java.util.Collections.singletonList(this.bars.get(0));
				break;
			default: 
				bars = java.util.Collections.unmodifiableList(new java.util.ArrayList<T>(this.bars));
			}
			return new BuilderWithToBuilder<T>(one, two, foo, bars);
		}
		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		public java.lang.String toString() {
			return "BuilderWithToBuilder.BuilderWithToBuilderBuilder(one=" + this.one + ", two=" + this.two + ", foo=" + this.foo + ", bars=" + this.bars + ")";
		}
	}
	@java.lang.SuppressWarnings("all")
	public static <T> BuilderWithToBuilderBuilder<T> builder() {
		return new BuilderWithToBuilderBuilder<T>();
	}
	@java.lang.SuppressWarnings("all")
	public BuilderWithToBuilderBuilder<T> toBuilder() {
		return new BuilderWithToBuilderBuilder<T>().one(this.mOne).two(this.mTwo).foo(BuilderWithToBuilder.rrr(this)).bars(this.bars == null ? java.util.Collections.emptyList() : this.bars);
	}
}
class ConstructorWithToBuilder<T> {
	private String mOne;
	private String mTwo;
	private T foo;
	@lombok.Singular
	private List<T> bars;
	public ConstructorWithToBuilder(String mOne, T bar) {
	}
	@java.lang.SuppressWarnings("all")
	public static class ConstructorWithToBuilderBuilder<T> {
		@java.lang.SuppressWarnings("all")
		private String mOne;
		@java.lang.SuppressWarnings("all")
		private T bar;
		@java.lang.SuppressWarnings("all")
		ConstructorWithToBuilderBuilder() {
		}
		@java.lang.SuppressWarnings("all")
		public ConstructorWithToBuilderBuilder<T> mOne(final String mOne) {
			this.mOne = mOne;
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public ConstructorWithToBuilderBuilder<T> bar(final T bar) {
			this.bar = bar;
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public ConstructorWithToBuilder<T> build() {
			return new ConstructorWithToBuilder<T>(mOne, bar);
		}
		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		public java.lang.String toString() {
			return "ConstructorWithToBuilder.ConstructorWithToBuilderBuilder(mOne=" + this.mOne + ", bar=" + this.bar + ")";
		}
	}
	@java.lang.SuppressWarnings("all")
	public static <T> ConstructorWithToBuilderBuilder<T> builder() {
		return new ConstructorWithToBuilderBuilder<T>();
	}
	@java.lang.SuppressWarnings("all")
	public ConstructorWithToBuilderBuilder<T> toBuilder() {
		return new ConstructorWithToBuilderBuilder<T>().mOne(this.mOne).bar(this.foo);
	}
}
class StaticWithToBuilder<T, K> {
	private String mOne;
	private String mTwo;
	private T foo;
	private K bar;
	@lombok.Singular
	private List<T> bars;
	public static <Z> StaticWithToBuilder<Z, String> test(String mOne, Z bar) {
		return new StaticWithToBuilder<Z, String>();
	}
	@java.lang.SuppressWarnings("all")
	public static class StaticWithToBuilderBuilder<Z> {
		@java.lang.SuppressWarnings("all")
		private String mOne;
		@java.lang.SuppressWarnings("all")
		private Z bar;
		@java.lang.SuppressWarnings("all")
		StaticWithToBuilderBuilder() {
		}
		@java.lang.SuppressWarnings("all")
		public StaticWithToBuilderBuilder<Z> mOne(final String mOne) {
			this.mOne = mOne;
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public StaticWithToBuilderBuilder<Z> bar(final Z bar) {
			this.bar = bar;
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public StaticWithToBuilder<Z, String> build() {
			return StaticWithToBuilder.<Z>test(mOne, bar);
		}
		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		public java.lang.String toString() {
			return "StaticWithToBuilder.StaticWithToBuilderBuilder(mOne=" + this.mOne + ", bar=" + this.bar + ")";
		}
	}
	@java.lang.SuppressWarnings("all")
	public static <Z> StaticWithToBuilderBuilder<Z> builder() {
		return new StaticWithToBuilderBuilder<Z>();
	}
	@java.lang.SuppressWarnings("all")
	public StaticWithToBuilderBuilder<T> toBuilder() {
		return new StaticWithToBuilderBuilder<T>().mOne(this.mOne).bar(this.foo);
	}
}
