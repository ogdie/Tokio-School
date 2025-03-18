import java.util.Arrays;

public class Stack {

    public Object[] stack;
    public int posicaoStack;

    public Stack() {
        this.posicaoStack = -1;
        this.stack = new Object[5];
    }

    public boolean stackVazio() {
        if (this.posicaoStack == -1) {
            return true;
        }
        return false;
    }

    public Object pop() throws StackEmptyException {
        if (stackVazio()) {
            throw new StackEmptyException();
        }
        return this.stack[this.posicaoStack--];
    }

    public void push(Object valor) throws StackFullException {
        boolean cheia = true;

        if (this.posicaoStack < this.stack.length - 1) {
            this.stack[++posicaoStack] = valor;
            cheia = false;
        }
        if (cheia) {
            throw new StackFullException();
        }
    }

    @Override
    public String toString() {
        return "Stack " + Arrays.toString(stack);
    }
}
