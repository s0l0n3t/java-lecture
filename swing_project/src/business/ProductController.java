package business;

import dao.ProductDao;
import entity.Product;

import java.util.ArrayList;

public class ProductController {
    private final ProductDao productDao = new ProductDao();

    public ArrayList<Product> searchProductByName(String name){
        return this.productDao.searchProductByName(name);
    }
    public ArrayList<Product> findProducts(){
        return this.productDao.searchAllProduct();
    }
    public Product createProduct(String name,String code,int price,int stock){
        return this.productDao.createProduct(name,code,price,stock);
    }
}
