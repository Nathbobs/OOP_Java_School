public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {

        /*Change the header*/ //done
        empty = true;
        boiled = false;
    }

    private volatile static ChocolateBoiler uniqueInstance; //using DCl volatile
    public static ChocolateBoiler getInstance() {
        /*Change the header*/
        synchronized (ChocolateBoiler.class){
        /* my code */
        /* Add your code */
        if(uniqueInstance == null)
            uniqueInstance = new ChocolateBoiler();
        return uniqueInstance;
        }
    }


    public void fill() {
        if(isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("Filling with mixture");
        }
        else if (!isEmpty()){
            System.out.println("Already filled");
        }
        /* Add your code */ //done
    }

    public void drain() {
        if(!isEmpty() && isBoiled()) {
            empty = true;
            System.out.println("Draining the mixture");
        }
        else if (isEmpty()){
            System.out.println("Already drained");
        }
        /* Add your code */ //done
    }

    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            boiled = true;
            System.out.println("Boiling the mixture");
        }
        else{
            System.out.println("Already boiled");
        }
        /* Add your code */ //done
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
