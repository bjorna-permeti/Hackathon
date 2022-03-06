import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Product {
    enum Type{
        CONCRETE,
        ASPHALT_PAVING,
        BRICKS,
        GYPSUM,
        WOOD,
        GLASS,
        PLASTOC,
        STEEL,
        ALUMINIUM,
        COOPPER
    }

    enum Quality{
        UNUSED,
        CONTAMINATED,
        CLEAN
    }

    Type type;
    Quality quality;
    int quantity;
    private static final AtomicInteger nextId = new AtomicInteger(0);
    private final int id;
    int price;
    User seller;
    Map<Quality, Integer> qualityIntegerMap;

    public Product(Type type){
        this.type = type;
        this.id = Product.nextId.getAndIncrement();
        qualityIntegerMap = new HashMap<>();
        setQualityIntegerMap();
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQualityIntegerMap(){
        qualityIntegerMap.put(Quality.UNUSED, 10);
        qualityIntegerMap.put(Quality.CLEAN, 7);
        qualityIntegerMap.put(Quality.CONTAMINATED, 4);
    }

    public int getQualityAsInt(){
        return qualityIntegerMap.get(getQuality());
    }

    public void setSeller(User seller){
        this.seller = seller;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setQuality(Quality quality){
        this.quality = quality;
    }

    public int getId(){
        return id;
    }

    public Type getType(){
        return type;
    }

    public int getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public Quality getQuality(){
        return quality;
    }

    public User getSeller(){
        return seller;
    }
}
