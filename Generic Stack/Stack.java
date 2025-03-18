class Stack<T> implements IGenericStack {

    private Stack<T> previous;
    private T value;

    Stack() {
    }

    Stack(T value) {
        this.value = value;
    }

    Stack(Stack<T> previous, T value) {
        this.previous = previous;
        this.value = value;
    }

    @Override
    public void push(Object value) {
        if (this.value == null)
            this.value = (T) value;
        else {
            this.previous = new Stack<T>(this.previous, this.value);
            this.value = (T) value;
        }
    }

    @Override
    public T pop() {
        if (this.isEmpty())
            throw new IllegalArgumentException("Stack is empty");

        T top = this.value;
        this.value = this.previous.value;
        this.previous = this.previous.previous;

        return top;
    }

    @Override
    public boolean isEmpty() {
        return this.previous == null;
    }

        @Override
        public int size () {
            return this.isEmpty() ? 0 : 1 + this.previous.size();
        }

        @Override
        public String toString () {
            if (!this.isEmpty())
                return this.previous + " <- " + this.value;
            return this.value != null ? String.valueOf(this.value) : "";
        }
    }


