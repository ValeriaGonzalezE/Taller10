package ActividadDiez;

public class Instrument {
    private boolean onSale;
    private double price;
    private int numInStock;

    public double getPrice() {
        if (onSale) {
            return price * 0.85; // precio con descuento del 15%
        } else {
            return price;
        }
    }

    public double applyEmployeeDiscount() {
        return price * 0.75; // precio con descuento del 25%
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    public boolean getOnSale() {
        return onSale;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumInStock() {
        return numInStock;
    }

    public void setNumInStock(int numInStock) {
        this.numInStock = numInStock;
    }
}



