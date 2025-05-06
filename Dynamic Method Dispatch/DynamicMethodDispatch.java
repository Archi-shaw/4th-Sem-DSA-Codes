class Apple {
    void show() {
        System.out.println("This is Apple class.");
    }
}

class Banana extends Apple {
    @Override
    void show() {
        System.out.println("This is Banana class.");
    }
}

class Cherry extends Apple {
    @Override
    void show() {
        System.out.println("This is Cherry class.");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Apple ref;
        
        ref = new Apple();
        ref.show();

        ref = new Banana();
        ref.show();

        ref = new Cherry();
        ref.show();
    }
}
