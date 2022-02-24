package methodoverriding;

class buy_car{
    public static void main (String[] args) {
        Car c=new Car();
        c.print();
        Honda h = new Honda();
        h.print();
    }
}
