package first.hibernate.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="table_products")


public class ProductEntity {
	
	@Id
	@Column(name = "product_id")
	private Integer productId;
	
	@Column
	private String productName;
	
	private  Integer quantity;
	
	@Column
	private Double unitPrice;
	
	@Column
	@CreationTimestamp
	private LocalDateTime creation;
	
	@Column
	@UpdateTimestamp
	private LocalDateTime updateOn;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public LocalDateTime getCreation() {
		return creation;
	}

	public void setCreation(LocalDateTime creation) {
		this.creation = creation;
	}

	public LocalDateTime getUpdateOn() {
		return updateOn;
	}

	public void setUpdateOn(LocalDateTime updateOn) {
		this.updateOn = updateOn;
	}

	@Override
	public String toString() {
		return "ProductEntity [productId=" + productId + ", productName=" + productName + ", quantity=" + quantity
				+ ", unitPrice=" + unitPrice + ", creation=" + creation + ", updateOn=" + updateOn + "]";
	}
	

}
