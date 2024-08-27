package Question_2;

abstract class Beverages {
    private boolean wantsExtras;

    public void boilWater() {
        System.out.println("Boiling water");
    }

   
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    
    abstract void brew();

    
    abstract void addCondiments();

    
    abstract void addExtras();

    
    public void setWantsExtras(boolean wantsExtras) {
        this.wantsExtras = wantsExtras;
    }

    // Final template method to ensure correct order of operations
    public final void finalTemplateMethod() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if (wantsExtras) {
            addExtras();
        }
    }
}

