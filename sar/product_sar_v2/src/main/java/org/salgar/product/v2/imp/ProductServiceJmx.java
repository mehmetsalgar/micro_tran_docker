package org.salgar.product.v2.imp;
import org.salgar.product.api.v2.ProductService;
import org.salgar.product.api.v2.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedOperationParameter;
import org.springframework.jmx.export.annotation.ManagedOperationParameters;
import org.springframework.jmx.export.annotation.ManagedResource;

@ManagedResource(objectName = "salgar:name=salgar-product-service-v2,type=org.salgar.product.v2.imp.ProductServiceImp,artifactId=salgar-product-service-v2", description = "Product Service", log = true, logFile = "jmx.log")
public class ProductServiceJmx implements ProductService {
	@Autowired
	private ProductService productService;

	@Override
	@ManagedOperation(description = "Gets a Product with ProductId")
    @ManagedOperationParameters({
    	@ManagedOperationParameter(name="productId", description="Id of the product that we want to load.")
    })
	public Product giveProduct(Integer productId) {
		return productService.giveProduct(productId);
	}
	
	@Override
	@ManagedOperation(description = "Gets a parameter as String")
    @ManagedOperationParameters({
    	@ManagedOperationParameter(name="product", description="Product that we want to save!")
    })
	public Product saveProduct(Product product) {
		return productService.saveProduct(product);
	}

	@Override
	@ManagedOperation(description = "Delivers we are alive message!")
    @ManagedOperationParameters()
	public String giveAlive() {
		return alive_signal;
	}	
}