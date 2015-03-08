public class Stapel<T> {

  private int top;
  private T[] stack;

  public Stapel() {
    @SuppressWarnings("unchecked")
      T[] newstack = (T[])new Object[4];
    stack = newstack;
    top = 0;
  }

  public void push(T elem) {
    if (top >= stack.length) {
      @SuppressWarnings("unchecked")
        T[] newstack = (T[])new Object[2 * stack.length];
      for (int i=0 ; i<stack.length ; i++) {
        newstack[i] = stack[i];
      }
      stack = newstack;
    }
    stack[top++] = elem;
  }

  public T pop() {
    if ( top <= 0 ) {
      throw new IllegalStateException("Stack is empty");
    }
    return stack[--top];
  }

  public T peek() {
    if ( top <= 0 ) {
      throw new IllegalStateException("Stack is empty");
    }
    return stack[top - 1];
  }
}
