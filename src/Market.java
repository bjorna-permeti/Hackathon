import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Market {
  List<Product> products;

  public Market() {
    products = new ArrayList<>();
  }

  public void addProduct(Product product) {
    products.add(product);
  }

  public void removeProduct(Product product) {
    products.remove(product);
  }

  public int size() {
    return products.size();
  }

  public List<Product> getProductsByType(List<Product> initialList, Product.Type type) {
    List<Product> filteredProducts =
        initialList.stream().filter(p -> p.getType().equals(type)).collect(Collectors.toList());
    return filteredProducts;
  }

  // Return only the products that have a higher or the same quantity as the one the user entered
  public List<Product> getProductsByQuantity(List<Product> initialList, int quantity) {
    List<Product> filteredProducts =
        initialList.stream().filter(p -> p.getQuantity() >= quantity).collect(Collectors.toList());
    return filteredProducts;
  }

  public List<Product> sortByPrice(List<Product> list, String order) {
    if (order.equals("ascending")) {
      list.sort(Comparator.comparing(Product::getPrice));
    } else {
      list.sort(Comparator.comparing(Product::getPrice, Comparator.reverseOrder()));
    }
    return list;
  }

  public List<Product> sortByQuality(List<Product> list, String order) {
    if (order.equals("ascending")) {
      list.sort(Comparator.comparing(Product::getQualityAsInt));
    } else {
      list.sort(Comparator.comparing(Product::getPrice, Comparator.reverseOrder()));
    }
    return list;
  }
}
