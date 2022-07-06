package src;

class Test {
    public static void main(String args[]){
        Price price = new Milk_Coffie(new Americano(1200));
        price.show();
    }
}

interface Price{
    void show();
}

class Coffie implements Price{
    int price;

    Coffie(int price){
        this.price = price;
    }

    @Override
    public void show() {
        System.out.println(price);
    }
}

class Americano extends Coffie{
    Americano(int price) {
        super(price);
    }
}

class Coffie_Decorator implements Price{
    private Price price;

    Coffie_Decorator(Price price){
        this.price = price;
    }

    @Override
    public void show() {
        price.show();
    }
}

class Milk_Coffie extends Coffie_Decorator{
    Milk_Coffie(Price price) {
        super(price);
    }

    @Override
    public void show(){
        super.show();
        System.out.println("+ 200" );
    }
}
